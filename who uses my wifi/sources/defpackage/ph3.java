package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ph3 implements kh3 {
    public final ExecutorService a;
    public final z94 b;
    public final z94 c;
    public final xj3 d;
    public final z94 e;
    public final wf3 f;
    public final vf3 g;

    public ph3(ExecutorService executorService, z94 z94Var, z94 z94Var2, xj3 xj3Var, z94 z94Var3, wf3 wf3Var, vf3 vf3Var) {
        this.a = executorService;
        this.b = z94Var;
        this.c = z94Var2;
        this.d = xj3Var;
        this.e = z94Var3;
        this.f = wf3Var;
        this.g = vf3Var;
    }

    @Override // defpackage.kh3
    public final String a() {
        return "1.808261137";
    }

    @Override // defpackage.kh3
    public final n70 b(Context context, View view, Activity activity) {
        h2 h2Var = (h2) this.f.d();
        context.getClass();
        h2Var.c = context;
        h2Var.d = view;
        h2Var.e = activity;
        h2Var.f = true != this.g.H() ? "" : null;
        h2Var.g = this.d.b(context, view);
        fr1 fr1VarC0 = qr1.C0();
        fr1VarC0.getClass();
        h2Var.h = fr1VarC0;
        h2Var.i = eg3.g;
        return ((vh3) ((ba4) h2Var.o().g).d()).a();
    }

    @Override // defpackage.kh3
    public final void c(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            sh3 sh3Var = (sh3) this.e.d();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (sh3Var) {
                try {
                    if (motionEvent.getAction() == 1) {
                        sh3Var.b = MotionEvent.obtain(motionEvent);
                    }
                    sh3Var.c.a(motionEvent);
                    ArrayDeque arrayDeque = sh3Var.a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new rh3(motionEvent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.kh3
    public final n70 d() {
        return pu1.D(new w53(6, this), this.a);
    }

    @Override // defpackage.kh3
    public final int e() {
        return 2;
    }

    @Override // defpackage.kh3
    public final n70 f(Context context, String str, View view) {
        z94 z94Var = this.e;
        HashMap mapC = this.d.c();
        sh3 sh3Var = (sh3) z94Var.d();
        synchronized (sh3Var) {
            try {
                MotionEvent motionEvent = sh3Var.b;
                if (motionEvent != null) {
                    mapC.put("nv", motionEvent);
                }
                mapC.put("oe", sh3Var.c);
                ArrayDeque arrayDeque = sh3Var.a;
                mapC.put("ro", arrayDeque.toArray(new rh3[arrayDeque.size()]));
                sh3Var.c = new qh3();
                arrayDeque.clear();
                MotionEvent motionEvent2 = sh3Var.b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    sh3Var.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h2 h2Var = (h2) this.f.d();
        context.getClass();
        h2Var.c = context;
        h2Var.d = view;
        h2Var.e = null;
        h2Var.f = str;
        h2Var.g = mapC;
        h2Var.i = eg3.h;
        fr1 fr1VarC0 = qr1.C0();
        fr1VarC0.getClass();
        h2Var.h = fr1VarC0;
        return ((vh3) ((ba4) h2Var.o().g).d()).a();
    }

    @Override // defpackage.kh3
    public final n70 h(Context context) {
        h2 h2Var = (h2) this.f.d();
        h2Var.c = context;
        h2Var.g = this.d.a();
        fr1 fr1VarC0 = qr1.C0();
        fr1VarC0.getClass();
        h2Var.h = fr1VarC0;
        h2Var.i = eg3.f;
        return ((vh3) ((ba4) h2Var.o().g).d()).a();
    }
}
