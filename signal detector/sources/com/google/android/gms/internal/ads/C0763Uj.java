package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763Uj implements InterfaceC0441Bk, InterfaceC2029vk {

    /* renamed from: a, reason: collision with root package name */
    public final Qt f11769a;

    public C0763Uj(Qt qt) {
        this.f11769a = qt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final void c(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() {
        C0740Td c0740Td = this.f11769a.f10763d0;
        if (c0740Td == null || !c0740Td.f11415a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = c0740Td.f11416b;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final void f(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final void u(Context context) {
    }
}
