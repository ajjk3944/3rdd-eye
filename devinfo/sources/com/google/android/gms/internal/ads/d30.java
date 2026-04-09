package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d30 implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e30 f10312b;

    public /* synthetic */ d30(e30 e30Var, int i4) {
        this.f10311a = i4;
        this.f10312b = e30Var;
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) {
        switch (this.f10311a) {
            case 0:
                e30 e30Var = this.f10312b;
                e30Var.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(e30Var.f10686a)) {
                        e30Var.f10688c.execute(new s(28, this));
                        break;
                    }
                }
                break;
            default:
                e30 e30Var2 = this.f10312b;
                e30Var2.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(e30Var2.f10686a)) {
                        e30Var2.f10688c.execute(new s(29, this));
                        break;
                    }
                }
                break;
        }
    }
}
