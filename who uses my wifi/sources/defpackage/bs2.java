package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class bs2 implements Runnable {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ bs2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    private final void a() {
        o13 o13Var = (o13) this.g;
        synchronized (o13Var) {
            o13Var.a.getClass();
            o13Var.h = SystemClock.elapsedRealtime() - o13Var.i;
        }
    }

    private final void b() {
        l23 l23Var = (l23) this.g;
        synchronized (l23Var) {
            l23Var.B3("Signal collection timeout.", 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x029f A[Catch: all -> 0x026e, TryCatch #7 {all -> 0x026e, blocks: (B:116:0x0265, B:118:0x0269, B:123:0x0271, B:129:0x027c, B:131:0x0280, B:133:0x0286, B:135:0x0290, B:137:0x029a, B:139:0x02ab, B:138:0x029f, B:140:0x02ad, B:142:0x02bb, B:144:0x02c3), top: B:229:0x0265 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs2.run():void");
    }

    public bs2(uc3 uc3Var) {
        this.f = 26;
        this.g = uc3Var.e;
    }

    public bs2(zc3 zc3Var) {
        this.f = 27;
        Objects.requireNonNull(zc3Var);
        this.g = zc3Var;
    }
}
