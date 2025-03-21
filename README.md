# 🌀 Spirit Mob Timer

**Spirit Mob Timer** is an **addon for Mob Despawn Timers** that makes **Spirit's Soul Cage spawners compatible with the despawn timer system**.  
With this mod, mobs spawned by **Spirit’s Soul Cages** will be correctly tracked for despawning, ensuring they don’t linger indefinitely.

---

## ✨ Features
✅ **Full compatibility with Mob Despawn Timers** – Automatically applies despawn tracking to mobs spawned from Spirit’s Soul Cages.  
✅ **Customizable despawn range** – Configure the detection radius for spawned mobs using the config file.  
✅ **Server-friendly** – Works on **both singleplayer and multiplayer** servers.  
✅ **Plug & Play** – Requires **Mob Despawn Timers** and **Spirit** to function.

---

## ⚙️ How It Works
Whenever a mob is spawned from a **Soul Cage**, this mod **automatically assigns a despawn timer** just like naturally spawned mobs.  
This ensures that all mobs are properly handled and despawn according to the **Mob Despawn Timers** rules.

---

## 📥 Installation

### **🔹 Requirements**
- **Minecraft:** `1.18.2`
- **Forge:** `40.3.0`
- **Required Mods:**
    - **[Mob Despawn Timers](https://www.curseforge.com/minecraft/mc-mods/mob-despawn-timers)**
    - **[Spirit](https://www.curseforge.com/minecraft/mc-mods/spirit)**

### **🔹 Steps to Install**
1. **Download & Install Forge** (`40.3.0`).
2. **Install** `Mob Despawn Timers` and `Spirit` in the `mods/` folder.
3. **Download the latest version** of `Spirit Mob Timer` and place it in `mods/`.
4. **Launch Minecraft** and make sure the mod is loaded.

---

## 🔧 Configuration
Spirit Mob Timer allows customization through a configuration file located at:

```
config/spiritmobtimer-common.toml
```

### **Default Configuration**
```toml
[spawning]
#Defines the detection range (in blocks) around the Soul Cage for spawned entities.
#Default: 11.0
#Range: 0.5 ~ 20.0
range = 11.0
```
You can **change `spawning.range` to adjust the detection radius**.  
After modifying the config, restart the game/server for changes to take effect.

---

## 📜 Mod Compatibility
- ✅ **Works with all entities spawned by Spirit's Soul Cage**
- ✅ **Compatible with all Forge mods that don’t interfere with Mob Despawn Timers**
- ❌ **Not compatible with Fabric**

---

## 💡 Known Issues & Troubleshooting
### ❓ **Problem:** Mobs from the Soul Cage don’t get the despawn tag
✅ **Solution:** Ensure that `Mob Despawn Timers` is installed and check the **log files for errors**.

### ❓ **Problem:** The detection range isn’t working
✅ **Solution:** Modify the `spawning.range` in the config file and restart the server.

### ❓ **Problem:** The mod does not appear in-game
✅ **Solution:** Make sure that both **Mob Despawn Timers** and **Spirit** are correctly installed.

---

## 📌 License
This project is licensed under the **MIT License**. You are free to modify and distribute it under the same license.

---

## 💬 Contact

- **CurseForge Page:** [Download the mod](https://www.curseforge.com/minecraft/mc-mods/spirit-mob-timer)

---

## 🚀 Final Thoughts
With **Spirit Mob Timer**, Soul Cage spawns are now **properly tracked** for despawning! 🔥  
If you enjoy this mod, consider **leaving feedback** or contributing to improve it even more. 🚀

