package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import h0.C2351a;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.UUID;
import o1.C2754b;
import o1.C2756d;
import o1.C2757e;
import o1.InterfaceC2759g;

/* renamed from: com.google.android.gms.internal.ads.Tp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0752Tp implements InterfaceC0803Wp {

    /* renamed from: a, reason: collision with root package name */
    public final int f11469a;

    /* renamed from: b, reason: collision with root package name */
    public int f11470b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11471c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11472d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11473e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11474f;

    public /* synthetic */ C0752Tp(int i, int i3, WebView webView, String str, String str2, String str3) {
        this.f11471c = str;
        this.f11469a = i;
        this.f11472d = str2;
        this.f11474f = webView;
        this.f11473e = str3;
        this.f11470b = i3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0803Wp
    /* renamed from: a */
    public Object mo8a() {
        String str = (String) this.f11471c;
        String str2 = (String) this.f11472d;
        WebView webView = (WebView) this.f11474f;
        String str3 = (String) this.f11473e;
        int i = this.f11470b;
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        K9 k9 = new K9("Google", str);
        Wv wvM = C1437kl.m("javascript");
        int i3 = this.f11469a;
        Sv svO = C1437kl.o(AbstractC1135f5.e(i3));
        Wv wv = Wv.NONE;
        if (wvM == wv) {
            u2.k.h("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (svO == null) {
            u2.k.h("Omid html session error; Unable to parse creative type: ".concat(AbstractC1135f5.s(i3)));
            return null;
        }
        Wv wvM2 = C1437kl.m(str2);
        if (svO == Sv.VIDEO && wvM2 == wv) {
            u2.k.h("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str2)));
            return null;
        }
        C0969c3 c0969c3 = new C0969c3(k9, webView, str3, "", Qv.HTML);
        Ww wwA = Ww.a(svO, C1437kl.n(AbstractC1135f5.f(i)), wvM, wvM2, true);
        if (AbstractC0709Rg.f10942z.f16455b) {
            return new C0837Yp(new Rv(wwA, c0969c3, UUID.randomUUID().toString()), c0969c3);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public synchronized void b() {
        d(0);
    }

    public void c(int i, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer num = (Integer) navigableMapH.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapH.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void d(int i) {
        while (this.f11470b > i) {
            Object objQ = ((C2351a) this.f11471c).Q();
            H1.g.b(objQ);
            C2754b c2754bF = f(objQ.getClass());
            this.f11470b -= c2754bF.b() * c2754bF.a(objQ);
            c(c2754bF.a(objQ), objQ.getClass());
            if (Log.isLoggable(c2754bF.c(), 2)) {
                Log.v(c2754bF.c(), "evicted: " + c2754bF.a(objQ));
            }
        }
    }

    public synchronized Object e(int i, Class cls) {
        C2756d c2756d;
        int i3;
        try {
            Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i3 = this.f11470b) != 0 && this.f11469a / i3 < 2 && num.intValue() > i * 8)) {
                C2757e c2757e = (C2757e) this.f11472d;
                InterfaceC2759g interfaceC2759gL = (InterfaceC2759g) ((ArrayDeque) c2757e.f1505a).poll();
                if (interfaceC2759gL == null) {
                    interfaceC2759gL = c2757e.l();
                }
                c2756d = (C2756d) interfaceC2759gL;
                c2756d.f22676b = i;
                c2756d.f22677c = cls;
            } else {
                C2757e c2757e2 = (C2757e) this.f11472d;
                int iIntValue = num.intValue();
                InterfaceC2759g interfaceC2759gL2 = (InterfaceC2759g) ((ArrayDeque) c2757e2.f1505a).poll();
                if (interfaceC2759gL2 == null) {
                    interfaceC2759gL2 = c2757e2.l();
                }
                c2756d = (C2756d) interfaceC2759gL2;
                c2756d.f22676b = iIntValue;
                c2756d.f22677c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return g(c2756d, cls);
    }

    public C2754b f(Class cls) {
        C2754b c2754b;
        HashMap map = (HashMap) this.f11474f;
        C2754b c2754b2 = (C2754b) map.get(cls);
        if (c2754b2 != null) {
            return c2754b2;
        }
        if (cls.equals(int[].class)) {
            c2754b = new C2754b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c2754b = new C2754b(0);
        }
        map.put(cls, c2754b);
        return c2754b;
    }

    public Object g(C2756d c2756d, Class cls) {
        C2754b c2754bF = f(cls);
        Object objB = ((C2351a) this.f11471c).B(c2756d);
        if (objB != null) {
            this.f11470b -= c2754bF.b() * c2754bF.a(objB);
            c(c2754bF.a(objB), cls);
        }
        if (objB != null) {
            return objB;
        }
        if (Log.isLoggable(c2754bF.c(), 2)) {
            Log.v(c2754bF.c(), "Allocated " + c2756d.f22676b + " bytes");
        }
        int i = c2756d.f22676b;
        switch (c2754bF.f22670a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap h(Class cls) {
        HashMap map = (HashMap) this.f11473e;
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
        C2754b c2754bF = f(cls);
        int iA = c2754bF.a(obj);
        int iB = c2754bF.b() * iA;
        if (iB <= this.f11469a / 2) {
            C2757e c2757e = (C2757e) this.f11472d;
            InterfaceC2759g interfaceC2759gL = (InterfaceC2759g) ((ArrayDeque) c2757e.f1505a).poll();
            if (interfaceC2759gL == null) {
                interfaceC2759gL = c2757e.l();
            }
            C2756d c2756d = (C2756d) interfaceC2759gL;
            c2756d.f22676b = iA;
            c2756d.f22677c = cls;
            ((C2351a) this.f11471c).P(c2756d, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(c2756d.f22676b));
            Integer numValueOf = Integer.valueOf(c2756d.f22676b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f11470b += iB;
            d(this.f11469a);
        }
    }

    public synchronized void j(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20 || i == 15) {
                d(this.f11469a / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ boolean k() {
        return Objects.equals(((TP) this.f11471c).f11397m, "audio/raw");
    }

    public C0752Tp(TP tp, TP tp2, int i, int i3, ZO zo, C1110eh c1110eh) {
        this.f11471c = tp;
        this.f11472d = tp2;
        this.f11469a = i;
        this.f11470b = i3;
        this.f11473e = zo;
        this.f11474f = c1110eh;
    }

    public C0752Tp(int i) {
        this.f11471c = new C2351a(27);
        this.f11472d = new C2757e(0);
        this.f11473e = new HashMap();
        this.f11474f = new HashMap();
        this.f11469a = i;
    }
}
