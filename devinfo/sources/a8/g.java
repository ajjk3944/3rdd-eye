package a8;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.au0;
import com.google.android.gms.internal.ads.aw0;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.h80;
import com.google.android.gms.internal.ads.jz;
import com.google.android.gms.internal.ads.mx1;
import com.google.android.gms.internal.ads.pv1;
import com.google.android.gms.internal.ads.u70;
import com.google.android.gms.internal.ads.ut0;
import com.google.android.gms.internal.ads.vh0;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.wt0;
import com.google.android.gms.internal.ads.xh0;
import com.google.android.gms.internal.ads.yz;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements vh0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f228a;

    /* renamed from: b, reason: collision with root package name */
    public int f229b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f230c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f231d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f232e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f233f;

    public /* synthetic */ g(int i4, int i10, WebView webView, String str, String str2, String str3) {
        this.f230c = str;
        this.f228a = i4;
        this.f231d = str2;
        this.f232e = webView;
        this.f233f = str3;
        this.f229b = i10;
    }

    public synchronized void a() {
        d(0);
    }

    @Override // com.google.android.gms.internal.ads.vh0
    public Object b() {
        String str = (String) this.f230c;
        String str2 = (String) this.f231d;
        WebView webView = (WebView) this.f232e;
        String str3 = (String) this.f233f;
        int i4 = this.f229b;
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        u70 u70Var = new u70("Google", str);
        au0 au0VarO = h80.o("javascript");
        int i10 = this.f228a;
        wt0 wt0VarQ = h80.q(d7.h(i10));
        au0 au0Var = au0.NONE;
        if (au0VarO == au0Var) {
            za.i.h("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (wt0VarQ == null) {
            za.i.h("Omid html session error; Unable to parse creative type: ".concat(d7.A(i10)));
            return null;
        }
        au0 au0VarO2 = h80.o(str2);
        if (wt0VarQ == wt0.VIDEO && au0VarO2 == au0Var) {
            za.i.h("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str2)));
            return null;
        }
        b7 b7Var = new b7(u70Var, webView, str3, "", ut0.HTML);
        aw0 aw0VarA = aw0.a(wt0VarQ, h80.p(d7.i(i4)), au0VarO, au0VarO2, true);
        if (jz.f12903z.f15871b) {
            return new xh0(new vt0(aw0VarA, b7Var, UUID.randomUUID().toString()), b7Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public void c(int i4, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer num = (Integer) navigableMapH.get(Integer.valueOf(i4));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(Integer.valueOf(i4));
                return;
            } else {
                navigableMapH.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i4 + ", this: " + this);
    }

    public void d(int i4) {
        while (this.f229b > i4) {
            Object objQ = ((yb.i) this.f230c).Q();
            t8.f.b(objQ);
            c cVarF = f(objQ.getClass());
            this.f229b -= cVarF.b() * cVarF.a(objQ);
            c(cVarF.a(objQ), objQ.getClass());
            if (Log.isLoggable(cVarF.c(), 2)) {
                Log.v(cVarF.c(), "evicted: " + cVarF.a(objQ));
            }
        }
    }

    public synchronized Object e(int i4, Class cls) {
        e eVar;
        int i10;
        try {
            Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i4));
            if (num == null || ((i10 = this.f229b) != 0 && this.f228a / i10 < 2 && num.intValue() > i4 * 8)) {
                f fVar = (f) this.f231d;
                i iVarC = (i) ((ArrayDeque) fVar.f218b).poll();
                if (iVarC == null) {
                    iVarC = fVar.C();
                }
                eVar = (e) iVarC;
                eVar.f225b = i4;
                eVar.f226c = cls;
            } else {
                f fVar2 = (f) this.f231d;
                int iIntValue = num.intValue();
                i iVarC2 = (i) ((ArrayDeque) fVar2.f218b).poll();
                if (iVarC2 == null) {
                    iVarC2 = fVar2.C();
                }
                eVar = (e) iVarC2;
                eVar.f225b = iIntValue;
                eVar.f226c = cls;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return g(eVar, cls);
    }

    public c f(Class cls) {
        c cVar;
        HashMap map = (HashMap) this.f233f;
        c cVar2 = (c) map.get(cls);
        if (cVar2 != null) {
            return cVar2;
        }
        if (cls.equals(int[].class)) {
            cVar = new c(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            cVar = new c(0);
        }
        map.put(cls, cVar);
        return cVar;
    }

    public Object g(e eVar, Class cls) {
        c cVarF = f(cls);
        Object objD = ((yb.i) this.f230c).D(eVar);
        if (objD != null) {
            this.f229b -= cVarF.b() * cVarF.a(objD);
            c(cVarF.a(objD), cls);
        }
        if (objD != null) {
            return objD;
        }
        if (Log.isLoggable(cVarF.c(), 2)) {
            Log.v(cVarF.c(), "Allocated " + eVar.f225b + " bytes");
        }
        int i4 = eVar.f225b;
        switch (cVarF.f219a) {
            case 0:
                return new byte[i4];
            default:
                return new int[i4];
        }
    }

    public NavigableMap h(Class cls) {
        HashMap map = (HashMap) this.f232e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public synchronized void i(Object obj) {
        Class<?> cls = obj.getClass();
        c cVarF = f(cls);
        int iA = cVarF.a(obj);
        int iB = cVarF.b() * iA;
        if (iB <= this.f228a / 2) {
            f fVar = (f) this.f231d;
            i iVarC = (i) ((ArrayDeque) fVar.f218b).poll();
            if (iVarC == null) {
                iVarC = fVar.C();
            }
            e eVar = (e) iVarC;
            eVar.f225b = iA;
            eVar.f226c = cls;
            ((yb.i) this.f230c).O(eVar, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(eVar.f225b));
            Integer numValueOf = Integer.valueOf(eVar.f225b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f229b += iB;
            d(this.f228a);
        }
    }

    public synchronized void j(int i4) {
        try {
            if (i4 >= 40) {
                a();
            } else if (i4 >= 20 || i4 == 15) {
                d(this.f228a / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public /* synthetic */ boolean k() {
        return Objects.equals(((mx1) this.f230c).f14052m, "audio/raw");
    }

    public g(mx1 mx1Var, mx1 mx1Var2, int i4, int i10, pv1 pv1Var, yz yzVar) {
        this.f230c = mx1Var;
        this.f231d = mx1Var2;
        this.f228a = i4;
        this.f229b = i10;
        this.f232e = pv1Var;
        this.f233f = yzVar;
    }

    public g(int i4) {
        this.f230c = new yb.i(2);
        this.f231d = new f(0);
        this.f232e = new HashMap();
        this.f233f = new HashMap();
        this.f228a = i4;
    }
}
