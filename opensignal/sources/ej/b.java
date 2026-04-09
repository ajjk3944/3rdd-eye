package ej;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class b implements ej.a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b EXOPLAYER = new b("EXOPLAYER", 0) { // from class: ej.b.a
        private final String className = "com.google.android.exoplayer2.ExoPlayer";

        {
            br.g gVar = null;
        }

        @Override // ej.b, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final b EXOPLAYER_DASH = new b("EXOPLAYER_DASH", 1) { // from class: ej.b.b
        private final String className = "com.google.android.exoplayer2.source.dash.DashMediaSource";

        {
            br.g gVar = null;
        }

        @Override // ej.b, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final b EXOPLAYER_DASH_MANIFEST_PARSER = new b("EXOPLAYER_DASH_MANIFEST_PARSER", 2) { // from class: ej.b.c
        private final String className = "com.google.android.exoplayer2.source.dash.manifest.DashManifestParser";

        {
            br.g gVar = null;
        }

        @Override // ej.b, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final b EXOPLAYER_DASH_MANIFEST_REPRESENTATION = new b("EXOPLAYER_DASH_MANIFEST_REPRESENTATION", 3) { // from class: ej.b.d
        private final String className = "com.google.android.exoplayer2.source.dash.manifest.Representation";

        {
            br.g gVar = null;
        }

        @Override // ej.b, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final b EXOPLAYER_DASH_WRAPPING_SEGMENT_INDEX = new b("EXOPLAYER_DASH_WRAPPING_SEGMENT_INDEX", 4) { // from class: ej.b.e
        private final String className = "com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex";

        {
            br.g gVar = null;
        }

        @Override // ej.b, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final b EXOPLAYER_HLS_MEDIA_SOURCE = new b("EXOPLAYER_HLS_MEDIA_SOURCE", 5) { // from class: ej.b.g
        private final String className = "com.google.android.exoplayer2.source.hls.HlsMediaSource";

        {
            br.g gVar = null;
        }

        @Override // ej.b, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final b EXOPLAYER_HLS_CHUNK_SOURCE = new b("EXOPLAYER_HLS_CHUNK_SOURCE", 6) { // from class: ej.b.f
        private final String className = "com.google.android.exoplayer2.source.hls.HlsChunkSource";

        {
            br.g gVar = null;
        }

        @Override // ej.b, ej.a
        public String getClassName() {
            return this.className;
        }
    };
    public static final b EXOPLAYER_HLS_SAMPLE_STREAM_WRAPPER_CALLBACK = new b("EXOPLAYER_HLS_SAMPLE_STREAM_WRAPPER_CALLBACK", 7) { // from class: ej.b.h
        private final String className = "com.google.android.exoplayer2.source.hls.HlsMediaPeriod$SampleStreamWrapperCallback";

        {
            br.g gVar = null;
        }

        @Override // ej.b, ej.a
        public String getClassName() {
            return this.className;
        }
    };

    private static final /* synthetic */ b[] $values() {
        return new b[]{EXOPLAYER, EXOPLAYER_DASH, EXOPLAYER_DASH_MANIFEST_PARSER, EXOPLAYER_DASH_MANIFEST_REPRESENTATION, EXOPLAYER_DASH_WRAPPING_SEGMENT_INDEX, EXOPLAYER_HLS_MEDIA_SOURCE, EXOPLAYER_HLS_CHUNK_SOURCE, EXOPLAYER_HLS_SAMPLE_STREAM_WRAPPER_CALLBACK};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = a.a.j(bVarArr$values);
    }

    public /* synthetic */ b(String str, int i10, br.g gVar) {
        this(str, i10);
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // ej.a
    public abstract /* synthetic */ String getClassName();

    private b(String str, int i10) {
    }
}
