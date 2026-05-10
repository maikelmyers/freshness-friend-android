# FreshCheck - Android

Native Android App (Kotlin) für Fresh-Produkt Inventory Management.

## Features

- 🔐 **Authentifizierung** via Supabase
- 📸 **Barcode Scanner** mit ML Kit
- 📦 **Produkt-Inventory** Management
- ⏰ **Verfallsdatum Tracking**
- 🔔 **Benachrichtigungen** bei ablaufen

## Voraussetzungen

- Android Studio Hedgehog oder neuer
- JDK 17+
- Google Play Console Account (für Release)
- Apple Developer Account (für iOS Testflight)

## Setup

```bash
# Clone das Repository
git clone https://github.com/<USERNAME>/freshness-friend-android.git
cd freshness-friend-android

# In Android Studio öffnen
# File → Open → freshness-friend-android Verzeichnis
```

## Build & Run

```bash
# Debug Build
./gradlew assembleDebug

# Release Build (signiert)
./gradlew assembleRelease
```

## Release für Google Play Store

1. **App Signing konfigurieren:**
   - Android Studio → Build → Generate Signed Bundle
   - Neuen Keystore erstellen (sichern!)
   
2. **In Google Play Console:**
   - App erstellen
   - Store Listing ausfüllen
   - APK/Bundle hochladen
   - Review starten

3. **Screenshots & Beschreibung:**
   - Mindestens 2-5 Screenshots pro Größe
   - Beschreibung, Übersicht, Kategorie "Essen & Trinken"

## Architektur

```
app/src/main/
├── kotlin/de/frischcheck/app/
│   ├── MainActivity.kt              # Entry point
│   ├── ui/
│   │   ├── screens/                 # UI Screens (Auth, Dashboard)
│   │   └── theme/                   # Material Design Theme
│   └── data/                        # Data Layer (Supabase, Local DB)
└── res/                             # Ressourcen (Layouts, Strings, Icons)
```

## Integration mit Web-App

Diese Android-App nutzt die gleiche **Supabase Backend** wie die Web-App:
- Authentifizierung (Lovable Auth)
- Realtime-Datenbank
- Storage für Produktfotos
- Server-seitige Funktionen (OCR, Notifications)

## Umgebungsvariablen

Erstelle `local.properties` im Projekt-Root:

```properties
sdk.dir=/path/to/android/sdk

# Supabase
supabase.url=https://your-project.supabase.co
supabase.key=your-anon-key
```

## Weitere Informationen

- [Android Developer Docs](https://developer.android.com/docs)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Supabase Kotlin Client](https://github.com/supabase-community/supabase-kt)
