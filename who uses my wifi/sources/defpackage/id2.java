package defpackage;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class id2 implements wv1 {
    public final ra4 g;
    public final l92 h;
    public final hd2 i;
    public final Object f = new Object();
    public final HashSet j = new HashSet();
    public final HashSet k = new HashSet();
    public boolean l = false;

    public id2(String str, ra4 ra4Var) {
        this.i = new hd2(str, ra4Var);
        this.g = ra4Var;
        l92 l92Var = new l92();
        l92Var.f = BigInteger.ONE;
        l92Var.g = "0";
        this.h = l92Var;
    }

    @Override // defpackage.wv1
    public final void T(boolean z) {
        long j;
        int i;
        hg4.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            ra4 ra4Var = this.g;
            ra4Var.h();
            synchronized (ra4Var.a) {
                j = ra4Var.o;
            }
            if (jCurrentTimeMillis - j > ((Long) tw1.e.c.a(mz1.d1)).longValue()) {
                this.i.d = -1;
            } else {
                hd2 hd2Var = this.i;
                ra4Var.h();
                synchronized (ra4Var.a) {
                    i = ra4Var.q;
                }
                hd2Var.d = i;
            }
            this.l = true;
            return;
        }
        ra4 ra4Var2 = this.g;
        ra4Var2.h();
        synchronized (ra4Var2.a) {
            try {
                if (ra4Var2.o != jCurrentTimeMillis) {
                    ra4Var2.o = jCurrentTimeMillis;
                    SharedPreferences.Editor editor = ra4Var2.g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", jCurrentTimeMillis);
                        ra4Var2.g.apply();
                    }
                    ra4Var2.i();
                }
            } finally {
            }
        }
        int i2 = this.i.d;
        ra4Var2.h();
        synchronized (ra4Var2.a) {
            try {
                if (ra4Var2.q == i2) {
                    return;
                }
                ra4Var2.q = i2;
                SharedPreferences.Editor editor2 = ra4Var2.g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i2);
                    ra4Var2.g.apply();
                }
                ra4Var2.i();
            } finally {
            }
        }
    }

    public final void a(dd2 dd2Var) {
        synchronized (this.f) {
            this.j.add(dd2Var);
        }
    }
}
