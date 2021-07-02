package com.santapexie.addon.early_risers;

import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.MethodInsnNode;

public class OxidizableCopperSlab implements Runnable {

    @Override
    public void run() {
        var remapper = FabricLoader.getInstance().getMappingResolver();
        ClassTinkerers.addTransformation(remapper.mapClassName("intermediary", "net.minecraft.class_5955"), (classNode) -> {
            for (var method : classNode.methods) {
                if (method.name.equals("method_34740")) {
                    for (var insn : method.instructions) {
                        if (insn instanceof MethodInsnNode) {
                            MethodInsnNode methodInsnNode = (MethodInsnNode) insn;
                            if (methodInsnNode.name.equals("build")) {
                                method.instructions.insertBefore(methodInsnNode, new MethodInsnNode(
                                                Opcodes.INVOKESTATIC,
                                                "com/santapexie/addon/OxidizableHooks",
                                                "addEntries",
                                                "(Lcom/google/common/collect/ImmutableBiMap$Builder;)Lcom/google/common/collect/ImmutableBiMap$Builder;"
                                        )
                                );
                                return;
                            }
                        }
                    }
                }
            }
        });
    }
}