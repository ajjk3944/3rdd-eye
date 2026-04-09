package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class h implements DynamiteModule.a {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC1201a interfaceC1201a) {
        int iA;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iB = interfaceC1201a.b(context, str);
        bVar.f34914a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = interfaceC1201a.a(context, str, false);
            bVar.f34915b = iA;
        } else {
            iA = interfaceC1201a.a(context, str, true);
            bVar.f34915b = iA;
        }
        int i12 = bVar.f34914a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            bVar.f34916c = i10;
            return bVar;
        }
        i11 = i12;
        if (i11 >= iA) {
            i10 = -1;
        }
        bVar.f34916c = i10;
        return bVar;
    }
}
