package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ot1 implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    pt1 pt1Var = (pt1) this.b;
                    pt1Var.a = System.currentTimeMillis();
                    pt1Var.d = true;
                    return;
                }
                pt1 pt1Var2 = (pt1) this.b;
                long j = pt1Var2.b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j > 0) {
                    long j2 = pt1Var2.b;
                    if (jCurrentTimeMillis >= j2) {
                        pt1Var2.c = jCurrentTimeMillis - j2;
                    }
                }
                pt1Var2.d = false;
                return;
            default:
                ek3 ek3Var = (ek3) this.b;
                synchronized (ek3Var) {
                    try {
                        if (z) {
                            ek3Var.c = System.currentTimeMillis();
                            ek3Var.f = true;
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j3 = ek3Var.d;
                            if (j3 > 0 && jCurrentTimeMillis2 >= j3) {
                                ek3Var.e = jCurrentTimeMillis2 - j3;
                            }
                            ek3Var.f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
