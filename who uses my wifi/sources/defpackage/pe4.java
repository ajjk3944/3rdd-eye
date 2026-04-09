package defpackage;

import android.media.AudioTrack;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pe4 {
    public final sn1 a;
    public final int b;
    public final rc3 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public pe4(AudioTrack audioTrack, rc3 rc3Var) {
        this.a = new sn1(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = rc3Var;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        long j = 10000;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f = j;
    }
}
