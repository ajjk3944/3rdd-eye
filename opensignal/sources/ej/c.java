package ej;

import br.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class c implements ej.a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c MEDIA3 = new c("MEDIA3", 0) { // from class: ej.c.a
        private final String className = "androidx.media3.exoplayer.ExoPlayer";

        {
            g gVar = null;
        }

        @Override // ej.c, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final c MEDIA3_DASH = new c("MEDIA3_DASH", 1) { // from class: ej.c.b
        private final String className = "androidx.media3.exoplayer.dash.DashMediaSource";

        {
            g gVar = null;
        }

        @Override // ej.c, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final c MEDIA3_DASH_MEDIA_PERIOD = new c("MEDIA3_DASH_MEDIA_PERIOD", 2) { // from class: ej.c.d
        private final String className = "androidx.media3.exoplayer.dash.DashMediaPeriod";

        {
            g gVar = null;
        }

        @Override // ej.c, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final c MEDIA3_DASH_MANIFEST_PARSER = new c("MEDIA3_DASH_MANIFEST_PARSER", 3) { // from class: ej.c.c
        private final String className = "androidx.media3.exoplayer.dash.manifest.DashManifestParser";

        {
            g gVar = null;
        }

        @Override // ej.c, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final c MEDIA3_HLS = new c("MEDIA3_HLS", 4) { // from class: ej.c.e
        private final String className = "androidx.media3.exoplayer.hls.HlsMediaSource";

        {
            g gVar = null;
        }

        @Override // ej.c, ej.a
        public String getClassName() {
            return this.className;
        }
    };

    private static final /* synthetic */ c[] $values() {
        return new c[]{MEDIA3, MEDIA3_DASH, MEDIA3_DASH_MEDIA_PERIOD, MEDIA3_DASH_MANIFEST_PARSER, MEDIA3_HLS};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = a.a.j(cVarArr$values);
    }

    public /* synthetic */ c(String str, int i10, g gVar) {
        this(str, i10);
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // ej.a
    public abstract /* synthetic */ String getClassName();

    private c(String str, int i10) {
    }
}
