package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;
import q2.C2841s;

/* loaded from: classes.dex */
public final class P7 implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10325a;

    public /* synthetic */ P7(int i) {
        this.f10325a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f10325a) {
            case 0:
                return new O7();
            case 1:
                C1972uh c1972uh = new C1972uh();
                c1972uh.f17147a = null;
                return c1972uh;
            case 2:
                return p2.j.f22785C.f22795h;
            case 3:
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new Wu(2, c0623Mf);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String str = q2.r.f23260g.f23266f;
                Cr.v(str);
                return str;
            case 6:
                return new ArrayDeque();
            case 7:
                return new W9(0);
            case 8:
                return new W9(12);
            case 9:
                return new W9(17);
            case 10:
                return p2.j.f22785C.f22811y;
            case 11:
                return new C1919ti();
            case 12:
                return B8.APP_OPEN;
            case 13:
                return "app_open_ad";
            case 14:
                return B8.BANNER;
            case 15:
                return "banner";
            case 16:
                return new C0576Jj();
            case 17:
                return new C0764Uk();
            case 18:
                C0896al c0896al = new C0896al();
                E9 e9 = H9.f8584E1;
                C2841s c2841s = C2841s.f23267e;
                c0896al.f13220a = ((Integer) c2841s.f23270c.a(e9)).intValue();
                c0896al.f13221b = ((Integer) c2841s.f23270c.a(H9.ee)).intValue();
                return c0896al;
            case 19:
                Set set = Collections.EMPTY_SET;
                Cr.v(set);
                return set;
            case 20:
                Set set2 = Collections.EMPTY_SET;
                Cr.v(set2);
                return set2;
            case 21:
                Set set3 = Collections.EMPTY_SET;
                Cr.v(set3);
                return set3;
            case 22:
                Set set4 = Collections.EMPTY_SET;
                Cr.v(set4);
                return set4;
            case 23:
                Set set5 = Collections.EMPTY_SET;
                Cr.v(set5);
                return set5;
            case 24:
                Set set6 = Collections.EMPTY_SET;
                Cr.v(set6);
                return set6;
            case 25:
                Set set7 = Collections.EMPTY_SET;
                Cr.v(set7);
                return set7;
            case 26:
                Set set8 = Collections.EMPTY_SET;
                Cr.v(set8);
                return set8;
            case 27:
                return new C1653ol();
            case 28:
                return B8.INTERSTITIAL;
            default:
                return "interstitial";
        }
    }

    public P7(C1277hl c1277hl) {
        this.f10325a = 20;
    }
}
