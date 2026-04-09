package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ah implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9327a;

    public /* synthetic */ ah(int i4) {
        this.f9327a = i4;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f9327a) {
            case 0:
                return new zg();
            case 1:
                o00 o00Var = new o00();
                o00Var.f14496a = null;
                return o00Var;
            case 2:
                return ua.j.C.f35265h;
            case 3:
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new kh0(11, exVar);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String str = va.r.g.f36162f;
                al0.z(str);
                return str;
            case 6:
                return new ArrayDeque();
            case 7:
                return new hl(0);
            case 8:
                return new hl(12);
            case 9:
                return new hl(17);
            case 10:
                return ua.j.C.f35281y;
            case 11:
                return new o20();
            case 12:
                return mi.APP_OPEN;
            case 13:
                return "app_open_ad";
            case 14:
                return mi.BANNER;
            case 15:
                return "banner";
            case 16:
                return new e50();
            case 17:
                return new p70();
            case 18:
                w70 w70Var = new w70();
                pk pkVar = sk.E1;
                va.s sVar = va.s.f36163e;
                w70Var.f17925a = ((Integer) sVar.f36166c.a(pkVar)).intValue();
                w70Var.f17926b = ((Integer) sVar.f36166c.a(sk.f16145ge)).intValue();
                return w70Var;
            case 19:
                Set set = Collections.EMPTY_SET;
                al0.z(set);
                return set;
            case 20:
                Set set2 = Collections.EMPTY_SET;
                al0.z(set2);
                return set2;
            case 21:
                Set set3 = Collections.EMPTY_SET;
                al0.z(set3);
                return set3;
            case 22:
                Set set4 = Collections.EMPTY_SET;
                al0.z(set4);
                return set4;
            case 23:
                Set set5 = Collections.EMPTY_SET;
                al0.z(set5);
                return set5;
            case 24:
                Set set6 = Collections.EMPTY_SET;
                al0.z(set6);
                return set6;
            case 25:
                Set set7 = Collections.EMPTY_SET;
                al0.z(set7);
                return set7;
            case 26:
                Set set8 = Collections.EMPTY_SET;
                al0.z(set8);
                return set8;
            case 27:
                return new l80();
            case 28:
                return mi.INTERSTITIAL;
            default:
                return "interstitial";
        }
    }

    public ah(e80 e80Var) {
        this.f9327a = 20;
    }
}
