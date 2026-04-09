package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j20 implements h20 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12593a;

    /* renamed from: b, reason: collision with root package name */
    public final ff0 f12594b;

    public /* synthetic */ j20(ff0 ff0Var, int i4) {
        this.f12593a = i4;
        this.f12594b = ff0Var;
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final void a(HashMap map) throws JSONException {
        switch (this.f12593a) {
            case 0:
                String str = (String) map.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int iHashCode = str.hashCode();
                    ff0 ff0Var = this.f12594b;
                    if (iHashCode == 97520651) {
                        if (str.equals("flick")) {
                            ff0Var.i(cf0.f10098c, true);
                            break;
                        }
                    } else if (iHashCode == 109399814 && str.equals("shake")) {
                        ff0Var.i(cf0.f10097b, true);
                        break;
                    }
                    ff0Var.i(cf0.f10096a, true);
                    break;
                }
                break;
            default:
                String str2 = (String) map.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    this.f12594b.b(str2.equals("true"));
                    break;
                }
                break;
        }
    }
}
