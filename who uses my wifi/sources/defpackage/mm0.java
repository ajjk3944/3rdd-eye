package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mm0 implements b60 {
    public static final mm0 n = new mm0();
    public int f;
    public int g;
    public Handler j;
    public boolean h = true;
    public boolean i = true;
    public final d60 k = new d60(this);
    public final e2 l = new e2(13, this);
    public final of3 m = new of3(5, this);

    public final void b() {
        int i = this.g + 1;
        this.g = i;
        if (i == 1) {
            if (this.h) {
                this.k.d(t50.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.j;
                i30.j(handler);
                handler.removeCallbacks(this.l);
            }
        }
    }

    @Override // defpackage.b60
    public final d60 e() {
        return this.k;
    }
}
