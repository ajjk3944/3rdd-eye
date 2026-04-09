package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rv1 implements ca4 {
    public final /* synthetic */ int a;

    public /* synthetic */ rv1(int i) {
        this.a = i;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new qv1();
            case 1:
                wg2 wg2Var = new wg2();
                wg2Var.a = null;
                return wg2Var;
            case 2:
                return hg4.C.h;
            case 3:
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new kf3(27, ld2Var);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String str = sv1.f.c;
                i41.M(str);
                return str;
            case 6:
                return new ArrayDeque();
            case 7:
                return new ts0();
            case 8:
                return new ts0();
            case 9:
                return new us0();
            case 10:
                return hg4.C.y;
            case 11:
                return new aj2();
            case 12:
                return dx1.APP_OPEN;
            case 13:
                return "app_open_ad";
            case 14:
                return dx1.BANNER;
            case 15:
                return "banner";
            case 16:
                return new ul2();
            case 17:
                return new po2();
            case 18:
                wo2 wo2Var = new wo2();
                iz1 iz1Var = mz1.p1;
                tw1 tw1Var = tw1.e;
                wo2Var.f = ((Integer) tw1Var.c.a(iz1Var)).intValue();
                wo2Var.g = ((Integer) tw1Var.c.a(mz1.Hd)).intValue();
                return wo2Var;
            case 19:
                Set set = Collections.EMPTY_SET;
                i41.M(set);
                return set;
            case 20:
                Set set2 = Collections.EMPTY_SET;
                i41.M(set2);
                return set2;
            case zy1.zzm /* 21 */:
                Set set3 = Collections.EMPTY_SET;
                i41.M(set3);
                return set3;
            case 22:
                Set set4 = Collections.EMPTY_SET;
                i41.M(set4);
                return set4;
            case 23:
                Set set5 = Collections.EMPTY_SET;
                i41.M(set5);
                return set5;
            case 24:
                Set set6 = Collections.EMPTY_SET;
                i41.M(set6);
                return set6;
            case 25:
                Set set7 = Collections.EMPTY_SET;
                i41.M(set7);
                return set7;
            case 26:
                Set set8 = Collections.EMPTY_SET;
                i41.M(set8);
                return set8;
            case 27:
                return new pp2();
            case 28:
                return dx1.INTERSTITIAL;
            default:
                return "interstitial";
        }
    }

    public rv1(fp2 fp2Var) {
        this.a = 20;
    }
}
