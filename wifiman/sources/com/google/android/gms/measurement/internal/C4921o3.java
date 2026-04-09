package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC4417n6;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.o3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4921o3 implements InterfaceC4417n6 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36618a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4873i3 f36619b;

    C4921o3(C4873i3 c4873i3, String str) {
        this.f36618a = str;
        this.f36619b = c4873i3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4417n6
    public final String zza(String str) {
        Map map = (Map) this.f36619b.f36527d.get(this.f36618a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
