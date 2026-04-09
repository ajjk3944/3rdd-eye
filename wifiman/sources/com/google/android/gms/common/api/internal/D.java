package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
import java.util.Set;
import r3.C7564b;
import s3.AbstractC7888c;
import s3.InterfaceC7895j;

/* loaded from: classes.dex */
final class D implements AbstractC7888c.InterfaceC2135c, N {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f34752a;

    /* renamed from: b, reason: collision with root package name */
    private final C4273b f34753b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7895j f34754c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f34755d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34756e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4276e f34757f;

    public D(C4276e c4276e, a.f fVar, C4273b c4273b) {
        this.f34757f = c4276e;
        this.f34752a = fVar;
        this.f34753b = c4273b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC7895j interfaceC7895j;
        if (!this.f34756e || (interfaceC7895j = this.f34754c) == null) {
            return;
        }
        this.f34752a.k(interfaceC7895j, this.f34755d);
    }

    @Override // com.google.android.gms.common.api.internal.N
    public final void a(InterfaceC7895j interfaceC7895j, Set set) {
        if (interfaceC7895j == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new C7564b(4));
        } else {
            this.f34754c = interfaceC7895j;
            this.f34755d = set;
            i();
        }
    }

    @Override // com.google.android.gms.common.api.internal.N
    public final void b(C7564b c7564b) {
        C4296z c4296z = (C4296z) this.f34757f.f34832j.get(this.f34753b);
        if (c4296z != null) {
            c4296z.I(c7564b);
        }
    }

    @Override // s3.AbstractC7888c.InterfaceC2135c
    public final void c(C7564b c7564b) {
        this.f34757f.f34836n.post(new C(this, c7564b));
    }

    @Override // com.google.android.gms.common.api.internal.N
    public final void d(int i10) {
        C4296z c4296z = (C4296z) this.f34757f.f34832j.get(this.f34753b);
        if (c4296z != null) {
            if (c4296z.f34868l) {
                c4296z.I(new C7564b(17));
            } else {
                c4296z.c(i10);
            }
        }
    }
}
