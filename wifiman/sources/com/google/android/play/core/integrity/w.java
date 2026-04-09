package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5034j;
import com.google.android.play.integrity.internal.C5036l;
import com.google.android.play.integrity.internal.InterfaceC5035k;

/* loaded from: classes3.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f38100a = this;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38101b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38102c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38103d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38104e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38105f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38106g;

    /* synthetic */ w(Context context, v vVar) {
        InterfaceC5035k interfaceC5035kB = C5036l.b(context);
        this.f38101b = interfaceC5035kB;
        com.google.android.play.integrity.internal.n nVarB = C5034j.b(bb.f38037a);
        this.f38102c = nVarB;
        au auVar = new au(interfaceC5035kB, n.f38091a);
        this.f38103d = auVar;
        com.google.android.play.integrity.internal.n nVarB2 = C5034j.b(new bp(interfaceC5035kB, nVarB, auVar, n.f38091a));
        this.f38104e = nVarB2;
        com.google.android.play.integrity.internal.n nVarB3 = C5034j.b(new bu(nVarB2));
        this.f38105f = nVarB3;
        this.f38106g = C5034j.b(new ba(nVarB2, nVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f38106g.a();
    }
}
