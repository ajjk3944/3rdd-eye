package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.F;
import com.google.android.play.integrity.internal.InterfaceC5035k;

/* loaded from: classes3.dex */
public final class bp implements InterfaceC5035k {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38070a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38071b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38072c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38073d;

    public bp(com.google.android.play.integrity.internal.n nVar, com.google.android.play.integrity.internal.n nVar2, com.google.android.play.integrity.internal.n nVar3, com.google.android.play.integrity.internal.n nVar4) {
        this.f38070a = nVar;
        this.f38071b = nVar2;
        this.f38072c = nVar3;
        this.f38073d = nVar4;
    }

    @Override // com.google.android.play.integrity.internal.n
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f38070a.a(), (F) this.f38071b.a(), ((au) this.f38072c).a(), new j());
    }
}
