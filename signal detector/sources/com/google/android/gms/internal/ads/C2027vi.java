package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2027vi implements InterfaceC1542mi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17319a;

    /* renamed from: b, reason: collision with root package name */
    public final C2909E f17320b = p2.j.f22785C.f22795h.i();

    public C2027vi(Context context) {
        this.f17319a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1542mi
    public final void a(HashMap map) throws IOException {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z6 = Boolean.parseBoolean(str);
        this.f17320b.D(z6);
        if (z6) {
            AbstractC0241a.A(this.f17319a);
        }
    }
}
