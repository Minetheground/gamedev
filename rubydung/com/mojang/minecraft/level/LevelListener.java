package com.mojang.minecraft.level;

public interface LevelListener {
  void tileChanged(int paramInt1, int paramInt2, int paramInt3);
  
  void lightColumnChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void allChanged();
}


/* Location:              /home/minetheground/Downloads/rd-161348-launcher.jar!/com/mojang/minecraft/level/LevelListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */