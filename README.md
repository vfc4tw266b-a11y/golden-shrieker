# Golden Shrieker

Fabric-Mod für **Minecraft 26.2**: Alle **Sculk Shrieker** bekommen einen hell leuchtenden,
goldenen Rahmen (volle Helligkeit, auch in dunklen Höhlen und im Deep Dark). So erkennst du sie
sofort und verwechselst sie nicht mit Sculk Sensoren oder anderen Sculk-Blöcken.

- Nur Client-Mod – funktioniert in Singleplayer und auf jedem Server, der Server braucht ihn nicht.
- Braucht **kein Fabric API**, nur Fabric Loader (0.19.0 oder neuer) und Java 25.
- Das Item im Inventar leuchtet ebenfalls golden.
- Der Effekt steckt komplett in den Block-Modellen, es gibt keine Mixins und keinen Eingriff ins Spiel.

## Installation

1. Fabric Loader für 26.2 installieren (https://fabricmc.net/use/).
2. `golden-shrieker-1.0.0.jar` in den Ordner `.minecraft/mods` legen.
3. Spiel starten.

## Selbst bauen

Lokal (JDK 25 nötig):

    ./gradlew build

Die fertige Datei liegt danach in `build/libs/golden-shrieker-1.0.0.jar`
(die Datei mit `-sources` im Namen brauchst du nicht).

Oder über GitHub Actions (siehe unten).

## Auf GitHub bauen lassen (.github-Ordner)

Der Ordner `.github/workflows/build.yml` ist das, was GitHub zum automatischen Bauen braucht.
Weil er mit einem Punkt anfängt, wird er beim Hochladen im Browser oft übersehen.

**Weg 1 – Datei direkt auf GitHub anlegen (am einfachsten):**

1. Repository auf GitHub öffnen -> **Add file** -> **Create new file**.
2. Ins Namensfeld genau `.github/workflows/build.yml` eintippen. Beim Tippen von `/` entstehen die Ordner automatisch.
3. Den Inhalt aus der Datei `.github/workflows/build.yml` dieses Projekts einfügen.
4. **Commit changes** klicken.

**Weg 2 – Mit Git oder GitHub Desktop** (nimmt versteckte Ordner automatisch mit):
Den ganzen Projektordner committen und pushen.

**Jar herunterladen:**

1. Im Repository auf den Tab **Actions** gehen.
2. Den obersten Lauf namens **build** anklicken (grüner Haken = geklappt).
3. Unten bei **Artifacts** auf **golden-shrieker** klicken – das ist ein ZIP mit der fertigen .jar.
4. Entpacken und die .jar in `.minecraft/mods` legen.

Du kannst den Build jederzeit neu starten: Actions -> **build** -> **Run workflow**.

## Anpassen

- Farben der Rahmen: Texturen in `src/main/resources/assets/golden_shrieker/textures/block/` (`frame_*.png`).
- Helligkeit: `light_emission` in den Modellen unter `assets/golden_shrieker/models/block/` (0–15).

## Lizenz

CC0-1.0 (siehe `LICENSE`).
