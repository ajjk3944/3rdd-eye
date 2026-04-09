package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5034j;
import com.google.android.play.integrity.internal.C5036l;
import com.google.android.play.integrity.internal.InterfaceC5035k;

/* loaded from: classes3.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f38093a = this;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38094b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38095c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38096d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38097e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38098f;

    /* synthetic */ s(Context context, r rVar) {
        InterfaceC5035k interfaceC5035kB = C5036l.b(context);
        this.f38094b = interfaceC5035kB;
        com.google.android.play.integrity.internal.n nVarB = C5034j.b(ac.f37984a);
        this.f38095c = nVarB;
        au auVar = new au(interfaceC5035kB, l.f38086a);
        this.f38096d = auVar;
        com.google.android.play.integrity.internal.n nVarB2 = C5034j.b(new al(interfaceC5035kB, nVarB, auVar, l.f38086a));
        this.f38097e = nVarB2;
        this.f38098f = C5034j.b(new ab(nVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f38098f.a();
    }
}
