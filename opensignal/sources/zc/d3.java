package zc;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class d3 extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26910f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(Object obj, k1 k1Var, int i10) {
        super(k1Var);
        this.f26909e = i10;
        this.f26910f = obj;
    }

    @Override // zc.m
    public final void a() {
        switch (this.f26909e) {
            case 0:
                io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) this.f26910f;
                e3 e3Var = (e3) cVar.f11924x;
                e3Var.s1();
                c1 c1Var = (c1) e3Var.f1504d;
                c1Var.G.getClass();
                cVar.a(SystemClock.elapsedRealtime(), false, false);
                r rVar = c1Var.J;
                c1.d(rVar);
                c1Var.G.getClass();
                rVar.v1(SystemClock.elapsedRealtime());
                break;
            case 1:
                i3 i3Var = (i3) this.f26910f;
                i3Var.w1();
                j0 j0Var = ((c1) i3Var.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.K.b("Starting upload from DelayedRunnable");
                i3Var.f26981g.l();
                break;
            default:
                p3 p3Var = (p3) this.f26910f;
                p3Var.J().s1();
                String str = (String) p3Var.M.pollFirst();
                if (str != null) {
                    p3Var.C0().getClass();
                    p3Var.f27097e0 = SystemClock.elapsedRealtime();
                    p3Var.x().K.c(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = p3Var.H.f26884a;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                p3Var.D();
                break;
        }
    }
}
