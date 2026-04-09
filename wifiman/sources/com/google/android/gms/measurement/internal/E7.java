package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.C4437q2;
import com.google.android.gms.internal.measurement.C4444r2;
import com.google.android.gms.internal.measurement.C4508z2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C7010a;

/* loaded from: classes.dex */
final class E7 {

    /* renamed from: a, reason: collision with root package name */
    private String f35858a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35859b;

    /* renamed from: c, reason: collision with root package name */
    private C4508z2 f35860c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f35861d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f35862e;

    /* renamed from: f, reason: collision with root package name */
    private Map f35863f;

    /* renamed from: g, reason: collision with root package name */
    private Map f35864g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C7 f35865h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.D4$b, com.google.android.gms.internal.measurement.q2$a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.z2$a] */
    final C4437q2 a(int i10) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? I10 = C4437q2.I();
        I10.u(i10);
        I10.z(this.f35859b);
        C4508z2 c4508z2 = this.f35860c;
        if (c4508z2 != null) {
            I10.x(c4508z2);
        }
        ?? E10 = C4508z2.Q().z(s7.K(this.f35861d)).E(s7.K(this.f35862e));
        if (this.f35863f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f35863f.size());
            for (Integer num : this.f35863f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) this.f35863f.get(num);
                if (l10 != null) {
                    arrayList.add((C4444r2) ((com.google.android.gms.internal.measurement.D4) C4444r2.I().u(iIntValue).w(l10.longValue()).p()));
                }
            }
        }
        if (arrayList != null) {
            E10.w(arrayList);
        }
        if (this.f35864g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f35864g.size());
            for (Integer num2 : this.f35864g.keySet()) {
                A2.a aVarU = com.google.android.gms.internal.measurement.A2.J().u(num2.intValue());
                List list = (List) this.f35864g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    aVarU.w(list);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.A2) ((com.google.android.gms.internal.measurement.D4) aVarU.p()));
            }
        }
        E10.B(arrayList2);
        I10.w(E10);
        return (C4437q2) ((com.google.android.gms.internal.measurement.D4) I10.p());
    }

    final void c(AbstractC4825d abstractC4825d) {
        int iA = abstractC4825d.a();
        Boolean bool = abstractC4825d.f36368c;
        if (bool != null) {
            this.f35862e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = abstractC4825d.f36369d;
        if (bool2 != null) {
            this.f35861d.set(iA, bool2.booleanValue());
        }
        if (abstractC4825d.f36370e != null) {
            Long l10 = (Long) this.f35863f.get(Integer.valueOf(iA));
            long jLongValue = abstractC4825d.f36370e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f35863f.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (abstractC4825d.f36371f != null) {
            List arrayList = (List) this.f35864g.get(Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f35864g.put(Integer.valueOf(iA), arrayList);
            }
            if (abstractC4825d.j()) {
                arrayList.clear();
            }
            if (com.google.android.gms.internal.measurement.A6.a() && this.f35865h.a().F(this.f35858a, N.f36018E0) && abstractC4825d.i()) {
                arrayList.clear();
            }
            if (!com.google.android.gms.internal.measurement.A6.a() || !this.f35865h.a().F(this.f35858a, N.f36018E0)) {
                arrayList.add(Long.valueOf(abstractC4825d.f36371f.longValue() / 1000));
                return;
            }
            long jLongValue2 = abstractC4825d.f36371f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    private E7(C7 c72, String str) {
        this.f35865h = c72;
        this.f35858a = str;
        this.f35859b = true;
        this.f35861d = new BitSet();
        this.f35862e = new BitSet();
        this.f35863f = new C7010a();
        this.f35864g = new C7010a();
    }

    private E7(C7 c72, String str, C4508z2 c4508z2, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f35865h = c72;
        this.f35858a = str;
        this.f35861d = bitSet;
        this.f35862e = bitSet2;
        this.f35863f = map;
        this.f35864g = new C7010a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f35864g.put(num, arrayList);
            }
        }
        this.f35859b = false;
        this.f35860c = c4508z2;
    }
}
