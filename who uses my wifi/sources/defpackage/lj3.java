package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lj3 implements kj3 {
    public final fe3 a;
    public final rj3 b;
    public final uj3 c;
    public final File d;
    public final gk3 e;
    public final ExecutorService f;
    public final AtomicReference g = new AtomicReference("3.-1");

    public lj3(fe3 fe3Var, rj3 rj3Var, uj3 uj3Var, gk3 gk3Var, ExecutorService executorService, File file) {
        this.a = fe3Var;
        this.b = rj3Var;
        this.c = uj3Var;
        this.e = gk3Var;
        this.d = file;
        this.f = executorService;
    }

    @Override // defpackage.kj3
    public final String a() {
        return (String) this.g.get();
    }

    @Override // defpackage.kj3
    public final ar3 b(Context context, View view, Activity activity) {
        return pu1.D(new bt2(this, context, view, activity, 2), this.f);
    }

    @Override // defpackage.kj3
    public final void c(InputEvent inputEvent) {
        de3 de3VarB = this.a.b();
        gk3 gk3Var = this.e;
        if (de3VarB == null) {
            gk3Var.b(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                de3VarB.i((MotionEvent) inputEvent);
            } catch (ee3 e) {
                gk3Var.c(15005, e);
            }
        }
    }

    @Override // defpackage.kj3
    public final gq3 d() {
        return pu1.P(pu1.J(gq3.r(this.b.a()), Throwable.class, dj3.c, dq3.f), new vn1(12, this), this.f);
    }

    @Override // defpackage.kj3
    public final int e() {
        return 3;
    }

    @Override // defpackage.kj3
    public final ar3 f(Context context, String str, View view) {
        return pu1.D(new bt2(this, context, str, view, 3), this.f);
    }

    @Override // defpackage.kj3
    public final ar3 h(Context context) {
        return pu1.D(new gs1(this, context, 14), this.f);
    }
}
