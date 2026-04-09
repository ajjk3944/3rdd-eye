package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.F;
import com.google.android.play.integrity.internal.InterfaceC5035k;

/* loaded from: classes3.dex */
public final class al implements InterfaceC5035k {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38006a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38007b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38008c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38009d;

    public al(com.google.android.play.integrity.internal.n nVar, com.google.android.play.integrity.internal.n nVar2, com.google.android.play.integrity.internal.n nVar3, com.google.android.play.integrity.internal.n nVar4) {
        this.f38006a = nVar;
        this.f38007b = nVar2;
        this.f38008c = nVar3;
        this.f38009d = nVar4;
    }

    @Override // com.google.android.play.integrity.internal.n
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.f38006a.a(), (F) this.f38007b.a(), ((au) this.f38008c).a(), new i());
    }
}
