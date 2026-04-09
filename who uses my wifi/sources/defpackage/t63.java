package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t63 {
    public final Context a;
    public final Executor b;
    public final th2 c;
    public final s63 d;
    public final k73 e;
    public final e51 f;
    public final FrameLayout g;
    public final ea3 h;
    public final k83 i;
    public n70 j;

    public t63(Context context, Executor executor, th2 th2Var, k73 k73Var, s63 s63Var, k83 k83Var, e51 e51Var) {
        this.a = context;
        this.b = executor;
        this.c = th2Var;
        this.e = k73Var;
        this.d = s63Var;
        this.i = k83Var;
        this.f = e51Var;
        this.g = new FrameLayout(context);
        this.h = th2Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(defpackage.pc4 r10, java.lang.String r11, defpackage.m54 r12, defpackage.y23 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t63.a(pc4, java.lang.String, m54, y23):boolean");
    }

    public final synchronized yh2 b(i73 i73Var) {
        r63 r63Var = (r63) i73Var;
        if (((Boolean) tw1.e.c.a(mz1.P8)).booleanValue()) {
            mm2 mm2Var = new mm2();
            mm2Var.a = this.a;
            mm2Var.b = r63Var.a;
            mm2 mm2Var2 = new mm2(mm2Var);
            ep2 ep2Var = new ep2();
            s63 s63Var = this.d;
            Executor executor = this.b;
            ((HashSet) ep2Var.l).add(new up2(s63Var, executor));
            ep2Var.c(s63Var, executor);
            fp2 fp2Var = new fp2(ep2Var);
            yh2 yh2Var = new yh2(this.c.b, 0);
            yh2Var.f = mm2Var2;
            yh2Var.e = fp2Var;
            return yh2Var;
        }
        s63 s63Var2 = this.d;
        s63 s63Var3 = new s63(s63Var2.f);
        s63Var3.m = s63Var2;
        ep2 ep2Var2 = new ep2();
        Executor executor2 = this.b;
        ep2Var2.a(s63Var3, executor2);
        ((HashSet) ep2Var2.g).add(new up2(s63Var3, executor2));
        ((HashSet) ep2Var2.n).add(new up2(s63Var3, executor2));
        ((HashSet) ep2Var2.m).add(new up2(s63Var3, executor2));
        ((HashSet) ep2Var2.l).add(new up2(s63Var3, executor2));
        ep2Var2.c(s63Var3, executor2);
        ep2Var2.o = s63Var3;
        mm2 mm2Var3 = new mm2();
        mm2Var3.a = this.a;
        mm2Var3.b = r63Var.a;
        mm2 mm2Var4 = new mm2(mm2Var3);
        fp2 fp2Var2 = new fp2(ep2Var2);
        yh2 yh2Var2 = new yh2(this.c.b, 0);
        yh2Var2.f = mm2Var4;
        yh2Var2.e = fp2Var2;
        return yh2Var2;
    }
}
