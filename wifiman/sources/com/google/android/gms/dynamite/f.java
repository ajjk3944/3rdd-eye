package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class f implements DynamiteModule.a {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC1201a interfaceC1201a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iA = interfaceC1201a.a(context, str, false);
        bVar.f34915b = iA;
        bVar.f34916c = iA != 0 ? 1 : 0;
        return bVar;
    }
}
