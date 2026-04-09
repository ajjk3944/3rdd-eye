package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import java.util.Set;
import r3.C7564b;
import s3.AbstractC7901p;
import s3.C7889d;

/* loaded from: classes.dex */
public final class O extends N3.d implements e.a, e.b {

    /* renamed from: k, reason: collision with root package name */
    private static final a.AbstractC1198a f34776k = M3.d.f12481c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f34777a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f34778b;

    /* renamed from: c, reason: collision with root package name */
    private final a.AbstractC1198a f34779c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f34780d;

    /* renamed from: e, reason: collision with root package name */
    private final C7889d f34781e;

    /* renamed from: f, reason: collision with root package name */
    private M3.e f34782f;

    /* renamed from: j, reason: collision with root package name */
    private N f34783j;

    public O(Context context, Handler handler, C7889d c7889d) {
        a.AbstractC1198a abstractC1198a = f34776k;
        this.f34777a = context;
        this.f34778b = handler;
        this.f34781e = (C7889d) AbstractC7901p.m(c7889d, "ClientSettings must not be null");
        this.f34780d = c7889d.e();
        this.f34779c = abstractC1198a;
    }

    static /* bridge */ /* synthetic */ void p0(O o10, N3.l lVar) {
        C7564b c7564bB = lVar.b();
        if (c7564bB.i()) {
            s3.K k10 = (s3.K) AbstractC7901p.l(lVar.e());
            C7564b c7564bB2 = k10.b();
            if (!c7564bB2.i()) {
                String strValueOf = String.valueOf(c7564bB2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                o10.f34783j.b(c7564bB2);
                o10.f34782f.disconnect();
                return;
            }
            o10.f34783j.a(k10.e(), o10.f34780d);
        } else {
            o10.f34783j.b(c7564bB);
        }
        o10.f34782f.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4282k
    public final void b(C7564b c7564b) {
        this.f34783j.b(c7564b);
    }

    @Override // N3.f
    public final void b0(N3.l lVar) {
        this.f34778b.post(new M(this, lVar));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4275d
    public final void c(int i10) {
        this.f34783j.d(i10);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4275d
    public final void f(Bundle bundle) {
        this.f34782f.i(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [M3.e, com.google.android.gms.common.api.a$f] */
    public final void q0(N n10) {
        M3.e eVar = this.f34782f;
        if (eVar != null) {
            eVar.disconnect();
        }
        this.f34781e.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC1198a abstractC1198a = this.f34779c;
        Context context = this.f34777a;
        Handler handler = this.f34778b;
        C7889d c7889d = this.f34781e;
        this.f34782f = abstractC1198a.a(context, handler.getLooper(), c7889d, c7889d.f(), this, this);
        this.f34783j = n10;
        Set set = this.f34780d;
        if (set == null || set.isEmpty()) {
            this.f34778b.post(new L(this));
        } else {
            this.f34782f.n();
        }
    }

    public final void r0() {
        M3.e eVar = this.f34782f;
        if (eVar != null) {
            eVar.disconnect();
        }
    }
}
