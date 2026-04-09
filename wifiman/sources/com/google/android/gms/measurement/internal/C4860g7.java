package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.g7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4860g7 extends A {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4833d7 f36468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4860g7(C4833d7 c4833d7, InterfaceC4821c4 interfaceC4821c4) {
        super(interfaceC4821c4);
        this.f36468e = c4833d7;
    }

    @Override // com.google.android.gms.measurement.internal.A
    public final void d() {
        this.f36468e.J0();
        String str = (String) this.f36468e.f36410q.pollFirst();
        if (str != null) {
            C4833d7 c4833d7 = this.f36468e;
            c4833d7.f36392I = c4833d7.zzb().c();
            this.f36468e.zzj().G().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            C4833d7.d0(this.f36468e.zza(), intent);
        }
        this.f36468e.W();
    }
}
