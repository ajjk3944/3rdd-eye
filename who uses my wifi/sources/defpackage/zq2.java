package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zq2 implements ca4 {
    public final /* synthetic */ int a;

    public /* synthetic */ zq2(int i) {
        this.a = i;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return dx1.AD_LOADER;
            case 1:
                return "native";
            case 2:
                return null;
            case 3:
                return new t23();
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return new du2();
            case 8:
                return new tu2();
            case 9:
                return new xu2();
            case 10:
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new bv2(ld2Var);
            case 11:
                return new ev2(11, 12, 1007);
            case 12:
                return new ev2(19, 20, 1008);
            case 13:
                return new ev2(13, 14, 1004);
            case 14:
                return new ev2(1001, 1002, 1003);
            case 15:
                return new ev2(15, 16, 1005);
            case 16:
                return new ev2(17, 18, 1006);
            case 17:
                return new nv2("ttc", s93.g);
            case 18:
                return new nv2("t_load_as", s93.C);
            case 19:
                return new xv2();
            case 20:
                return new nw2();
            case zy1.zzm /* 21 */:
                lf4 lf4Var = hg4.C.c;
                String string = UUID.randomUUID().toString();
                i41.M(string);
                return string;
            case 22:
                return new ez2();
            case 23:
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                return new j23(ld2Var2);
            case 24:
                return new u23();
            case 25:
                return new n33();
            case 26:
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                return new g43(ld2Var3, 0);
            case 27:
                Object arrayList = new ArrayList();
                iz1 iz1Var = mz1.zc;
                tw1 tw1Var = tw1.e;
                if (!((String) tw1Var.c.a(iz1Var)).isEmpty()) {
                    arrayList = Arrays.asList(((String) tw1Var.c.a(iz1Var)).split(","));
                }
                i41.M(arrayList);
                return arrayList;
            case 28:
                ld2 ld2Var4 = md2.a;
                i41.M(ld2Var4);
                return new g43(ld2Var4, 1);
            default:
                ld2 ld2Var5 = md2.a;
                i41.M(ld2Var5);
                return new g43(ld2Var5, 2);
        }
    }
}
