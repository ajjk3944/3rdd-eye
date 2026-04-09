package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class c implements DynamiteModule.a.InterfaceC1201a {
    c() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a.InterfaceC1201a
    public final int a(Context context, String str, boolean z10) {
        return DynamiteModule.f(context, str, z10);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a.InterfaceC1201a
    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}
