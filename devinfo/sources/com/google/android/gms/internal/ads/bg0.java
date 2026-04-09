package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bg0 implements ng0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f9675h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final aw f9676a;

    /* renamed from: b, reason: collision with root package name */
    public final w81 f9677b;

    /* renamed from: c, reason: collision with root package name */
    public final hq0 f9678c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f9679d;

    /* renamed from: e, reason: collision with root package name */
    public final eh0 f9680e;

    /* renamed from: f, reason: collision with root package name */
    public final bs0 f9681f;
    public final Context g;

    public bg0(Context context, hq0 hq0Var, aw awVar, w81 w81Var, ScheduledExecutorService scheduledExecutorService, eh0 eh0Var, bs0 bs0Var) {
        this.g = context;
        this.f9678c = hq0Var;
        this.f9676a = awVar;
        this.f9677b = w81Var;
        this.f9679d = scheduledExecutorService;
        this.f9680e = eh0Var;
        this.f9681f = bs0Var;
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final vd.b j(iu iuVar) {
        vd.b bVarD;
        aw awVar = this.f9676a;
        w81 w81Var = (w81) awVar.f9452c;
        String str = iuVar.f12476d;
        ya.f0 f0Var = ua.j.C.f35261c;
        if (ya.f0.f(str)) {
            bVarD = yo0.w(new og0(1));
        } else {
            bVarD = yo0.D(((ex) ((w81) awVar.f9451b)).e(new ae(5, awVar, iuVar)), ExecutionException.class, k20.f12990c, w81Var);
        }
        c71 c71VarD = yo0.D(bVarD, og0.class, new wf0(awVar, iuVar, Binder.getCallingUid(), 0), w81Var);
        yr0 yr0VarC = d7.C(11, this.g);
        yr1.w(c71VarD, yr0VarC);
        vd.b bVarF = yo0.F(c71VarD, new fp(6, this), this.f9677b);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16320s6)).booleanValue()) {
            bVarF = yo0.D(yo0.E(bVarF, ((Integer) r2.f36166c.a(sk.f16337t6)).intValue(), TimeUnit.SECONDS, this.f9679d), TimeoutException.class, k20.f12991d, fx.g);
        }
        yr1.H(bVarF, this.f9681f, yr0VarC, false);
        bVarF.a(new q81(0, bVarF, new ix0(26, this)), fx.g);
        return bVarF;
    }
}
