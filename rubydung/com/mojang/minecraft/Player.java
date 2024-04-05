/*    */ package com.mojang.minecraft;
/*    */ 
/*    */ import com.mojang.minecraft.level.Level;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ 
/*    */ 
/*    */ public class Player
/*    */   extends Entity
/*    */ {
/*    */   public Player(Level level) {
/* 11 */     super(level);
/* 12 */     this.heightOffset = 1.62F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 17 */     this.xo = this.x;
/* 18 */     this.yo = this.y;
/* 19 */     this.zo = this.z;
/* 20 */     float xa = 0.0F;
/* 21 */     float ya = 0.0F;
/*    */     
/* 23 */     if (Keyboard.isKeyDown(19))
/*    */     {
/* 25 */       resetPos();
/*    */     }
/* 27 */     if (Keyboard.isKeyDown(200) || Keyboard.isKeyDown(17)) ya--; 
/* 28 */     if (Keyboard.isKeyDown(208) || Keyboard.isKeyDown(31)) ya++; 
/* 29 */     if (Keyboard.isKeyDown(203) || Keyboard.isKeyDown(30)) xa--; 
/* 30 */     if (Keyboard.isKeyDown(205) || Keyboard.isKeyDown(32)) xa++; 
/* 31 */     if (Keyboard.isKeyDown(57) || Keyboard.isKeyDown(219))
/*    */     {
/* 33 */       if (this.onGround)
/*    */       {
/* 35 */         this.yd = 0.5F;
/*    */       }
/*    */     }
/*    */     
/* 39 */     moveRelative(xa, ya, this.onGround ? 0.1F : 0.02F);
/*    */     
/* 41 */     this.yd = (float)(this.yd - 0.08D);
/* 42 */     move(this.xd, this.yd, this.zd);
/* 43 */     this.xd *= 0.91F;
/* 44 */     this.yd *= 0.98F;
/* 45 */     this.zd *= 0.91F;
/*    */     
/* 47 */     if (this.onGround) {
/*    */       
/* 49 */       this.xd *= 0.7F;
/* 50 */       this.zd *= 0.7F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/minetheground/Downloads/rd-161348-launcher.jar!/com/mojang/minecraft/Player.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */