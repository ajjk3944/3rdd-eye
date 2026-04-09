package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945bf implements InterfaceC1054df {

    /* renamed from: l, reason: collision with root package name */
    public static final List f13397l = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public final C1529mM f13398a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13399b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f13402e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13403f;

    /* renamed from: g, reason: collision with root package name */
    public final C0999cf f13404g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13400c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13401d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Object f13405h = new Object();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public boolean f13406j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13407k = false;

    public C0945bf(Context context, C2951a c2951a, C0999cf c0999cf, String str) {
        M2.u.f(c0999cf, "SafeBrowsing config is not present.");
        this.f13402e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f13399b = new LinkedHashMap();
        this.f13404g = c0999cf;
        Iterator it = c0999cf.f13592e.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        C1529mM c1529mMD = RM.D();
        c1529mMD.b();
        ((RM) c1529mMD.f13551b).O(9);
        if (str != null) {
            c1529mMD.b();
            ((RM) c1529mMD.f13551b).E(str);
            c1529mMD.b();
            ((RM) c1529mMD.f13551b).F(str);
        }
        C1583nM c1583nMA = C1637oM.A();
        String str2 = this.f13404g.f13588a;
        if (str2 != null) {
            c1583nMA.b();
            ((C1637oM) c1583nMA.f13551b).B(str2);
        }
        C1637oM c1637oM = (C1637oM) c1583nMA.d();
        c1529mMD.b();
        ((RM) c1529mMD.f13551b).G(c1637oM);
        LM lmA = MM.A();
        boolean zI = R2.b.a(this.f13402e).i();
        lmA.b();
        ((MM) lmA.f13551b).D(zI);
        String str3 = c2951a.f23784a;
        if (str3 != null) {
            lmA.b();
            ((MM) lmA.f13551b).B(str3);
        }
        J2.f fVar = J2.f.f2059b;
        Context context2 = this.f13402e;
        fVar.getClass();
        long jA = J2.f.a(context2);
        if (jA > 0) {
            lmA.b();
            ((MM) lmA.f13551b).C(jA);
        }
        MM mm = (MM) lmA.d();
        c1529mMD.b();
        ((RM) c1529mMD.f13551b).L(mm);
        this.f13398a = c1529mMD;
    }

    public final void a(String str) {
        synchronized (this.f13405h) {
            try {
                if (str == null) {
                    C1529mM c1529mM = this.f13398a;
                    c1529mM.b();
                    ((RM) c1529mM.f13551b).J();
                } else {
                    C1529mM c1529mM2 = this.f13398a;
                    c1529mM2.b();
                    ((RM) c1529mM2.f13551b).I(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, Map map, int i) {
        synchronized (this.f13405h) {
            if (i == 3) {
                try {
                    this.f13407k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.f13399b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    JM jm = (JM) linkedHashMap.get(str);
                    jm.b();
                    ((KM) jm.f13551b).H(4);
                }
                return;
            }
            JM jmC = KM.C();
            int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i3 != 0) {
                jmC.b();
                ((KM) jmC.f13551b).H(i3);
            }
            int size = linkedHashMap.size();
            jmC.b();
            ((KM) jmC.f13551b).D(size);
            jmC.b();
            ((KM) jmC.f13551b).E(str);
            C2068wM c2068wMA = C2176yM.A();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        C1960uM c1960uMA = C2014vM.A();
                        Charset charset = AbstractC1528mL.f15610a;
                        OK ok = new OK(str2.getBytes(charset));
                        c1960uMA.b();
                        ((C2014vM) c1960uMA.f13551b).B(ok);
                        OK ok2 = new OK(str3.getBytes(charset));
                        c1960uMA.b();
                        ((C2014vM) c1960uMA.f13551b).C(ok2);
                        C2014vM c2014vM = (C2014vM) c1960uMA.d();
                        c2068wMA.b();
                        ((C2176yM) c2068wMA.f13551b).B(c2014vM);
                    }
                }
            }
            C2176yM c2176yM = (C2176yM) c2068wMA.d();
            jmC.b();
            ((KM) jmC.f13551b).F(c2176yM);
            linkedHashMap.put(str, jmC);
        }
    }

    public final void c() {
        synchronized (this.f13405h) {
            this.f13399b.keySet();
            ED edE = AbstractC1984ut.e(Collections.EMPTY_MAP);
            C0738Tb c0738Tb = new C0738Tb(1, this);
            C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
            C1306iD c1306iDF = AbstractC1984ut.F(edE, c0738Tb, c0623Mf);
            InterfaceFutureC2326a interfaceFutureC2326aE = AbstractC1984ut.E(c1306iDF, 10L, TimeUnit.SECONDS, AbstractC0640Nf.f10008d);
            c1306iDF.a(new CD(c1306iDF, 0, new C1283hr(this, 10, interfaceFutureC2326aE)), c0623Mf);
            f13397l.add(interfaceFutureC2326aE);
        }
    }
}
