package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483Eb implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7965a;

    /* renamed from: b, reason: collision with root package name */
    public final C0581Jo f7966b;

    public /* synthetic */ C0483Eb(C0581Jo c0581Jo, int i) {
        this.f7965a = i;
        this.f7966b = c0581Jo;
    }

    private final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        C0581Jo c0581Jo = this.f7966b;
        String str = (String) map.get("persistentData");
        synchronized (c0581Jo) {
            c0581Jo.f9371x = str;
            p2.j.f22785C.f22795h.i().k(c0581Jo.f9371x);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) throws NumberFormatException {
        switch (this.f7965a) {
            case 0:
                a(obj, map);
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j6 = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j6 = Long.parseLong((String) map.get("expires"));
                    } catch (NumberFormatException unused) {
                    }
                }
                C0581Jo c0581Jo = this.f7966b;
                String str = (String) map.get("extras");
                synchronized (c0581Jo) {
                    c0581Jo.f9362o = str;
                    c0581Jo.f9364q = j6;
                    c0581Jo.n();
                }
                return;
        }
    }
}
