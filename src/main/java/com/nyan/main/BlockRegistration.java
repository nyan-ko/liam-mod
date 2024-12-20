package com.nyan.main;

import com.nyan.main.content.blocks.*;
import com.tterrag.registrate.util.entry.BlockEntry;

import static com.nyan.main.Main.REGISTRATE;

public class BlockRegistration {
    public static final BlockEntry<TriluxPlantBlock> TRILUX_PLANT = REGISTRATE.get().block("trilux_plant", TriluxPlantBlock::new)
            .register();
    public static void register() {
        // Load class to run static initializers
    }
}
