package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class gj1 implements zk3 {
    public final /* synthetic */ int a;
    public static final /* synthetic */ gj1 b = new gj1(1);
    public static final /* synthetic */ gj1 c = new gj1(2);
    public static final /* synthetic */ gj1 d = new gj1(3);
    public static final /* synthetic */ gj1 e = new gj1(4);
    public static final /* synthetic */ gj1 f = new gj1(5);
    public static final /* synthetic */ gj1 g = new gj1(6);
    public static final /* synthetic */ gj1 h = new gj1(7);
    public static final /* synthetic */ gj1 i = new gj1(8);
    public static final /* synthetic */ gj1 j = new gj1(9);
    public static final /* synthetic */ gj1 k = new gj1(10);
    public static final /* synthetic */ gj1 l = new gj1(11);
    public static final /* synthetic */ gj1 m = new gj1(12);
    public static final /* synthetic */ gj1 n = new gj1(13);
    public static final /* synthetic */ gj1 o = new gj1(14);
    public static final /* synthetic */ gj1 p = new gj1(15);
    public static final /* synthetic */ gj1 q = new gj1(16);
    public static final /* synthetic */ gj1 r = new gj1(17);
    public static final /* synthetic */ gj1 s = new gj1(19);
    public static final /* synthetic */ gj1 t = new gj1(20);
    public static final /* synthetic */ gj1 u = new gj1(21);
    public static final /* synthetic */ gj1 v = new gj1(22);
    public static final /* synthetic */ gj1 w = new gj1(23);
    public static final /* synthetic */ gj1 x = new gj1(24);
    public static final /* synthetic */ gj1 y = new gj1(25);
    public static final /* synthetic */ gj1 z = new gj1(26);
    public static final /* synthetic */ gj1 A = new gj1(27);
    public static final /* synthetic */ gj1 B = new gj1(29);

    public /* synthetic */ gj1(int i2) {
        this.a = i2;
    }

    @Override // defpackage.zk3
    public final Object apply(Object obj) {
        int i2 = 0;
        switch (this.a) {
            case 0:
                return (qj1) obj;
            case 1:
                qj1 qj1Var = (qj1) obj;
                int i3 = nj1.z;
                return qj1Var;
            case 2:
                ArrayList arrayList = cr1.M;
                return ((JSONObject) obj).optString("nas");
            case 3:
                ArrayList arrayList2 = cr1.M;
                gi2.c0("", (Exception) obj);
                return null;
            case 4:
                Throwable th = (Throwable) obj;
                o32 o32Var = x32.a;
                if (((Boolean) r02.i.w()).booleanValue()) {
                    hg4.C.h.d("prepareClickUrl.attestation1", th);
                }
                return "failure_click_attok";
            case 5:
                List list = qb2.l;
                return null;
            case 6:
                hm3 hm3Var = ui2.a;
                return Integer.valueOf(((fi2) obj).p);
            case 7:
                return "failure_click_attok";
            case 8:
                return new hl2((el2) obj);
            case 9:
                return new hl2((List) obj);
            case 10:
                ArrayList arrayList3 = new ArrayList();
                for (p12 p12Var : (List) obj) {
                    if (p12Var != null) {
                        arrayList3.add(p12Var);
                    }
                }
                return arrayList3;
            case 11:
                ArrayList arrayList4 = new ArrayList();
                for (it2 it2Var : (List) obj) {
                    if (it2Var != null) {
                        arrayList4.add(it2Var);
                    }
                }
                return arrayList4;
            case 12:
                return Collections.singletonList(pu1.r((pr2) obj));
            case 13:
                ArrayList arrayList5 = (ArrayList) obj;
                return new q33(i2, true != arrayList5.isEmpty() ? arrayList5 : null);
            case 14:
                h8 h8Var = (h8) obj;
                return new t33(h8Var.a, h8Var.b, i2);
            case 15:
                return new j33((String) obj, 4);
            case 16:
                return new m33(2, (Bundle) obj);
            case 17:
                return new j33((String) obj, 5);
            case 18:
                return null;
            case 19:
                return (g73) obj;
            case 20:
                String str = ((i83) obj).b;
                return TextUtils.isEmpty(str) ? "" : wb4.c() ? "fakeForAdDebugLog" : str;
            case zy1.zzm /* 21 */:
                String str2 = ((i83) obj).a;
                return TextUtils.isEmpty(str2) ? "" : wb4.c() ? "fakeForAdDebugLog" : str2;
            case 22:
                return null;
            case 23:
                return null;
            case 24:
                return ej3.f;
            case 25:
                return ej3.g;
            case 26:
                return ej3.j;
            case 27:
                return ej3.i;
            case 28:
                yg3 yg3Var = (yg3) obj;
                int iH = yg3Var.H() - 1;
                if (iH == 1 || iH == 2) {
                    return yg3Var;
                }
                if (iH != 3) {
                    int iH2 = yg3Var.H() - 1;
                    throw new yi3(ex0.j(new StringBuilder(String.valueOf(iH2).length() + 3), "r: ", iH2));
                }
                int iH3 = yg3Var.H() - 1;
                throw new aj3(ex0.j(new StringBuilder(String.valueOf(iH3).length() + 3), "r: ", iH3));
            default:
                return ej3.h;
        }
    }
}
