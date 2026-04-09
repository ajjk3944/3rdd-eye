package p7;

import N7.C1154e9;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m0.C5308a;

/* compiled from: ProfilingSession.kt */
/* renamed from: p7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5472d {

    /* renamed from: a, reason: collision with root package name */
    public final a f45256a = new a();

    /* renamed from: b, reason: collision with root package name */
    public final a f45257b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final C5308a<String, a> f45258c = new C5308a<>();

    /* compiled from: ProfilingSession.kt */
    /* renamed from: p7.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f45259a;

        /* renamed from: b, reason: collision with root package name */
        public int f45260b;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        a aVar = this.f45256a;
        map.put("view obtaining - total count", Integer.valueOf(aVar.f45260b));
        map.put("view obtaining - total time (µs)", Long.valueOf(B7.d.z(aVar.f45259a / 1000)));
        Iterator it = ((C5308a.C0496a) this.f45258c.entrySet()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            a aVar2 = (a) entry.getValue();
            if (aVar2.f45260b > 0) {
                map.put(C1154e9.i("blocking view obtaining for ", str, " - count"), Integer.valueOf(aVar2.f45260b));
                String str2 = "blocking view obtaining for " + str + " - avg time (µs)";
                int i = aVar2.f45260b;
                map.put(str2, Long.valueOf(B7.d.z((i != 0 ? aVar2.f45259a / i : 0L) / 1000)));
            }
        }
        a aVar3 = this.f45257b;
        int i10 = aVar3.f45260b;
        if (i10 > 0) {
            map.put("long view requests - count", Integer.valueOf(i10));
            int i11 = aVar3.f45260b;
            map.put("long view requests - avg time (µs)", Long.valueOf(B7.d.z((i11 != 0 ? aVar3.f45259a / i11 : 0L) / 1000)));
        }
        return map;
    }
}
