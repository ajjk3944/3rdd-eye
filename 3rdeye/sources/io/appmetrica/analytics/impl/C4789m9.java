package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.m9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4789m9 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f41243h;
    public static final C4789m9 i;

    /* renamed from: a, reason: collision with root package name */
    public final Kd f41244a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4830no f41245b;

    /* renamed from: c, reason: collision with root package name */
    public final O8 f41246c;

    /* renamed from: d, reason: collision with root package name */
    public final L9 f41247d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4844oc f41248e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4665he f41249f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4635ga f41250g;

    static {
        HashMap map = new HashMap();
        map.put(EnumC5046wa.FIRST_OCCURRENCE, 1);
        map.put(EnumC5046wa.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC5046wa.UNKNOWN, -1);
        f41243h = Collections.unmodifiableMap(map);
        i = new C4789m9(new C4515bj(), new Vm(), new C4872pe(), new C4489aj(), new Ca(), new Da(), new Ba());
    }

    public C4789m9(C4763l9 c4763l9) {
        this(c4763l9.f41176a, c4763l9.f41177b, c4763l9.f41178c, c4763l9.f41179d, c4763l9.f41180e, c4763l9.f41181f, c4763l9.f41182g);
    }

    public final C5045w9 a(C4557d9 c4557d9, C5028vh c5028vh) {
        C5045w9 c5045w9 = new C5045w9();
        C5020v9 c5020v9A = this.f41249f.a(c4557d9.f40732l, c4557d9.f40733m);
        C4918r9 c4918r9A = this.f41248e.a(c4557d9.f40728g);
        if (c5020v9A != null) {
            c5045w9.f41950g = c5020v9A;
        }
        if (c4918r9A != null) {
            c5045w9.f41949f = c4918r9A;
        }
        String strA = this.f41244a.a(c4557d9.f40722a);
        if (strA != null) {
            c5045w9.f41947d = strA;
        }
        c5045w9.f41948e = this.f41245b.a(c4557d9, c5028vh);
        String str = c4557d9.f40730j;
        if (str != null) {
            c5045w9.f41951h = str;
        }
        Integer numA = this.f41247d.a(c4557d9);
        if (numA != null) {
            c5045w9.f41946c = numA.intValue();
        }
        Long l5 = c4557d9.f40724c;
        if (l5 != null) {
            c5045w9.f41944a = l5.longValue();
        }
        Long l10 = c4557d9.f40725d;
        if (l10 != null) {
            c5045w9.f41956n = l10.longValue();
        }
        Long l11 = c4557d9.f40726e;
        if (l11 != null) {
            c5045w9.f41957o = l11.longValue();
        }
        Long l12 = c4557d9.f40727f;
        if (l12 != null) {
            c5045w9.f41945b = l12.longValue();
        }
        Integer num = c4557d9.f40731k;
        if (num != null) {
            c5045w9.i = num.intValue();
        }
        c5045w9.f41952j = this.f41246c.a(c4557d9.f40735o);
        B7 b72 = c4557d9.f40728g;
        c5045w9.f41953k = b72 != null ? new A6().a(b72.f39147a) : -1;
        String str2 = c4557d9.f40734n;
        if (str2 != null) {
            c5045w9.f41954l = str2.getBytes();
        }
        EnumC5046wa enumC5046wa = c4557d9.f40736p;
        Integer num2 = enumC5046wa != null ? (Integer) f41243h.get(enumC5046wa) : null;
        if (num2 != null) {
            c5045w9.f41955m = num2.intValue();
        }
        E9 e92 = c4557d9.f40737q;
        if (e92 != null) {
            int iOrdinal = e92.ordinal();
            if (iOrdinal == 0) {
                c5045w9.f41958p = 0;
            } else if (iOrdinal == 1) {
                c5045w9.f41958p = 1;
            } else if (iOrdinal == 2) {
                c5045w9.f41958p = 2;
            }
        }
        Boolean bool = c4557d9.f40738r;
        if (bool != null) {
            c5045w9.f41959q = bool.booleanValue();
        }
        if (c4557d9.f40739s != null) {
            c5045w9.f41960r = r6.intValue();
        }
        c5045w9.f41961s = ((Ba) this.f41250g).a(c4557d9.f40740t);
        return c5045w9;
    }

    public C4789m9(Kd kd, InterfaceC4830no interfaceC4830no, O8 o82, L9 l92, InterfaceC4844oc interfaceC4844oc, InterfaceC4665he interfaceC4665he, InterfaceC4635ga interfaceC4635ga) {
        this.f41244a = kd;
        this.f41245b = interfaceC4830no;
        this.f41246c = o82;
        this.f41247d = l92;
        this.f41248e = interfaceC4844oc;
        this.f41249f = interfaceC4665he;
        this.f41250g = interfaceC4635ga;
    }

    public static C4763l9 a() {
        return new C4763l9(i);
    }
}
