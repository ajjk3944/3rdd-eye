package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n34 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = v23.a;
        Locale locale = Locale.US;
        return "DecoderCounters {\n decoderInits=" + i + ",\n decoderReleases=" + i2 + "\n queuedInputBuffers=" + i3 + "\n skippedInputBuffers=" + i4 + "\n renderedOutputBuffers=" + i5 + "\n skippedOutputBuffers=" + i6 + "\n droppedBuffers=" + i7 + "\n droppedInputBuffers=" + i8 + "\n maxConsecutiveDroppedBuffers=" + i9 + "\n droppedToKeyframeEvents=" + i10 + "\n totalVideoFrameProcessingOffsetUs=" + j + "\n videoFrameProcessingOffsetCount=" + i11 + "\n}";
    }
}
