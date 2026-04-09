package a0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.e1;
import androidx.lifecycle.h1;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.x4;
import com.applovin.mediation.MaxAdListener;
import com.applovin.shadow.okio.Path;
import com.google.android.gms.internal.ads.ls;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static void A(StringBuilder sb2, String str, long j, String str2) {
        sb2.append(str);
        sb2.append(j);
        sb2.append(str2);
    }

    public static void B(StringBuilder sb2, String str, com.applovin.impl.sdk.o oVar, String str2) {
        sb2.append(str);
        oVar.a(str2, sb2.toString());
    }

    public static /* synthetic */ boolean C(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ String D(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String E(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static e1 a(h1 h1Var, nk.e eVar, h5.c cVar) {
        return h1Var.b(pk.a.h(eVar), cVar);
    }

    public static boolean b(h hVar, long j) {
        return j >= hVar.e();
    }

    public static c3.o c(c3.o oVar, c3.o oVar2) {
        boolean z3 = oVar2 instanceof c3.b;
        if (!z3 || !(oVar instanceof c3.b)) {
            return (!z3 || (oVar instanceof c3.b)) ? (z3 || !(oVar instanceof c3.b)) ? oVar2.c(new a6.e(5, oVar)) : oVar : oVar2;
        }
        c3.b bVar = (c3.b) oVar2;
        p1.p pVar = bVar.f2703a;
        float f10 = bVar.f2704b;
        if (Float.isNaN(f10)) {
            f10 = ((c3.b) oVar).f2704b;
        }
        return new c3.b(pVar, f10);
    }

    public static final void d(int i4, View view, ViewGroup viewGroup) {
        nk.k.e(view, "view");
        nk.k.e(viewGroup, "container");
        if (b5.u0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iC = i3.e.c(i4);
        if (iC == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (b5.u0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iC == 1) {
            if (b5.u0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (b5.u0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iC == 2) {
            if (b5.u0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iC != 3) {
            return;
        }
        if (b5.u0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int f(int i4, int i10, long j) {
        return (yj.q.a(j) + i4) * i10;
    }

    public static x4 g(String str, long j, TimeUnit timeUnit) {
        return x4.a(str, Long.valueOf(timeUnit.toMillis(j)));
    }

    public static ClassCastException h(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String i(int i4, int i10, String str, String str2) {
        return str + i4 + str2 + i10;
    }

    public static String j(long j, String str) {
        return str + j;
    }

    public static String k(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.C());
        return sb2.toString();
    }

    public static String l(Path path, String str) {
        return str + path;
    }

    public static String m(String str, b5.z zVar, String str2) {
        return str + zVar + str2;
    }

    public static String n(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String o(String str, Throwable th2) {
        return str.concat(th2.getClass().getSimpleName());
    }

    public static String p(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static /* synthetic */ String q(CharSequence[] charSequenceArr) {
        StringBuilder sb2 = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb2.append(charSequenceArr[0]);
            for (int i4 = 1; i4 < charSequenceArr.length; i4++) {
                sb2.append((CharSequence) ",");
                sb2.append(charSequenceArr[i4]);
            }
        }
        return sb2.toString();
    }

    public static Map r() {
        return DesugarCollections.synchronizedMap(new HashMap());
    }

    public static JSONArray s(String str, JSONObject jSONObject) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }

    public static JSONObject t(String str, h5 h5Var) {
        return h5Var.a(str, new JSONObject());
    }

    public static void u(int i4, int i10, int i11, int i12, int i13) {
        ci.b.a(i4);
        ci.b.a(i10);
        ci.b.a(i11);
        ci.b.a(i12);
        ci.b.a(i13);
    }

    public static void v(int i4, HashMap map, String str, int i10, String str2) {
        map.put(str, Integer.valueOf(i4));
        map.put(str2, Integer.valueOf(i10));
    }

    public static void w(long j, String str, StringBuilder sb2) {
        sb2.append((Object) p1.s.i(j));
        sb2.append(str);
    }

    public static void x(String str, String str2, com.applovin.impl.sdk.o oVar, String str3) {
        oVar.a(str3, str + str2);
    }

    public static void y(StringBuilder sb2, MaxAdListener maxAdListener, com.applovin.impl.sdk.o oVar, String str) {
        sb2.append(maxAdListener);
        oVar.a(str, sb2.toString());
    }

    public static void z(StringBuilder sb2, String str, int i4, String str2) {
        sb2.append(str);
        sb2.append(i4);
        ls.t(str2, sb2.toString());
    }
}
