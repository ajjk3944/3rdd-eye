package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class po implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15056a;

    /* renamed from: b, reason: collision with root package name */
    public final ff0 f15057b;

    public /* synthetic */ po(ff0 ff0Var, int i4) {
        this.f15056a = i4;
        this.f15057b = ff0Var;
    }

    private final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        ff0 ff0Var = this.f15057b;
        String str = (String) map.get("persistentData");
        synchronized (ff0Var) {
            ff0Var.f11150x = str;
            ua.j.C.f35265h.i().k(ff0Var.f11150x);
        }
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) throws NumberFormatException {
        switch (this.f15056a) {
            case 0:
                a(obj, map);
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j = Long.parseLong((String) map.get("expires"));
                    } catch (NumberFormatException unused) {
                    }
                }
                ff0 ff0Var = this.f15057b;
                String str = (String) map.get("extras");
                synchronized (ff0Var) {
                    ff0Var.f11141o = str;
                    ff0Var.f11143q = j;
                    ff0Var.n();
                }
                return;
        }
    }
}
