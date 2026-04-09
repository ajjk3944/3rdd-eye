package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xi3 implements kh3 {
    public final z94 a;
    public final z94 b;
    public final z94 c;
    public final boolean d;
    public final long e;

    public xi3(z94 z94Var, z94 z94Var2, z94 z94Var3, boolean z, long j) {
        this.a = z94Var;
        this.b = z94Var2;
        this.c = z94Var3;
        this.d = z;
        this.e = j;
    }

    @Override // defpackage.kh3
    public final String a() {
        return ((kj3) this.b.d()).a();
    }

    @Override // defpackage.kh3
    public final n70 b(Context context, View view, Activity activity) {
        return ((kj3) this.b.d()).b(context, view, activity);
    }

    @Override // defpackage.kh3
    public final void c(InputEvent inputEvent) {
        ((kj3) this.b.d()).c(inputEvent);
    }

    @Override // defpackage.kh3
    public final n70 d() {
        boolean z = this.d;
        z94 z94Var = this.a;
        if (z) {
            gq3 gq3VarR = gq3.r(((fj3) z94Var.d()).a());
            gj1 gj1Var = gj1.x;
            dq3 dq3Var = dq3.f;
            return pu1.O(pu1.J(gq3VarR, Throwable.class, gj1Var, dq3Var), new u42(16, this), dq3Var);
        }
        gq3 gq3VarD = ((kj3) this.b.d()).d();
        long j = this.e;
        if (j > 0) {
            ((ScheduledExecutorService) this.c.d()).schedule(new w53(7, this), j, TimeUnit.MILLISECONDS);
            return gq3VarD;
        }
        ((fj3) z94Var.d()).a();
        return gq3VarD;
    }

    @Override // defpackage.kh3
    public final int e() {
        return ((kj3) this.b.d()).e();
    }

    @Override // defpackage.kh3
    public final n70 f(Context context, String str, View view) {
        return ((kj3) this.b.d()).f(context, str, view);
    }

    @Override // defpackage.kh3
    public final n70 h(Context context) {
        return ((kj3) this.b.d()).h(context);
    }
}
