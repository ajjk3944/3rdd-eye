package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ri, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711Ri implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11033a;

    /* renamed from: b, reason: collision with root package name */
    public final C2190yj f11034b;

    public /* synthetic */ C0711Ri(C2190yj c2190yj, int i) {
        this.f11033a = i;
        this.f11034b = c2190yj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f11033a) {
            case 0:
                try {
                    return new JSONObject(this.f11034b.a().f10804z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new C1600nm(this.f11034b.a());
        }
    }
}
