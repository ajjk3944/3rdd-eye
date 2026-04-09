package A;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.adexpress.dynamic.dg.msw;
import com.bytedance.sdk.openadsdk.sba.ypw.emc;
import com.google.android.gms.internal.ads.AbstractC2022vd;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static X a(Z z6, q5.d dVar, n0.d dVar2) {
        return z6.c(com.bumptech.glide.e.o(dVar), dVar2);
    }

    public static final boolean b(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static /* synthetic */ boolean c(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static int d(int i, int i3, int i6, int i7) {
        return ((i + i3) - i6) + i7;
    }

    public static emc e(String str) {
        emc emcVar = new emc();
        emcVar.ypw(str);
        return emcVar;
    }

    public static ClassCastException f(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String g(int i, int i3, String str, String str2) {
        return str + i + str2 + i3;
    }

    public static String h(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String i(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.z());
        return sb.toString();
    }

    public static String k(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, int i, String str2, int i3) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void q(int i, HashMap map, String str, int i3, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i3));
    }

    public static void r(Q2.a aVar, Bundle bundle, String str) {
        aVar.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static /* synthetic */ void s(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void t(String str, String str2, String str3) {
        AbstractC2022vd.v(str3, str2.concat(String.valueOf(str)));
    }

    public static void u(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        AbstractC2022vd.v(str2, sb.toString());
    }

    public static void v(StringBuilder sb, String str, long j6, String str2) {
        sb.append(str);
        sb.append(j6);
        sb.append(str2);
    }

    public static void w(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean x(msw mswVar, String str) {
        return TextUtils.equals(mswVar.ru().ypw(), str);
    }

    public static /* synthetic */ boolean y(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }
}
