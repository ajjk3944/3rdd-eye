package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class d implements DynamiteModule.a {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC1201a interfaceC1201a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iA = interfaceC1201a.a(context, str, true);
        bVar.f34915b = iA;
        if (iA != 0) {
            bVar.f34916c = 1;
        } else {
            int iB = interfaceC1201a.b(context, str);
            bVar.f34914a = iB;
            if (iB != 0) {
                bVar.f34916c = -1;
            }
        }
        return bVar;
    }
}
