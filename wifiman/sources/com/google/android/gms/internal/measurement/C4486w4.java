package com.google.android.gms.internal.measurement;

import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4486w4 {

    /* renamed from: d, reason: collision with root package name */
    private static final C4486w4 f35516d = new C4486w4(true);

    /* renamed from: a, reason: collision with root package name */
    final AbstractC4503y5 f35517a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35518b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35519c;

    private C4486w4() {
        this.f35517a = new B5();
    }

    public static int b(InterfaceC4502y4 interfaceC4502y4, Object obj) {
        U5 u5Zzb = interfaceC4502y4.zzb();
        int iZza = interfaceC4502y4.zza();
        if (!interfaceC4502y4.zze()) {
            return c(u5Zzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!interfaceC4502y4.zzd()) {
            int iC = 0;
            while (i10 < size) {
                iC += c(u5Zzb, iZza, list.get(i10));
                i10++;
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iD = 0;
        while (i10 < size) {
            iD += d(u5Zzb, list.get(i10));
            i10++;
        }
        return zzjr.s0(iZza) + iD + zzjr.v0(iD);
    }

    static int c(U5 u52, int i10, Object obj) {
        int iS0 = zzjr.s0(i10);
        if (u52 == U5.zzj) {
            F4.g((InterfaceC4366h5) obj);
            iS0 <<= 1;
        }
        return iS0 + d(u52, obj);
    }

    private static int d(U5 u52, Object obj) {
        switch (AbstractC4478v4.f35504b[u52.ordinal()]) {
            case 1:
                return zzjr.c(((Double) obj).doubleValue());
            case 2:
                return zzjr.d(((Float) obj).floatValue());
            case 3:
                return zzjr.a0(((Long) obj).longValue());
            case 4:
                return zzjr.n0(((Long) obj).longValue());
            case 5:
                return zzjr.g0(((Integer) obj).intValue());
            case 6:
                return zzjr.S(((Long) obj).longValue());
            case 7:
                return zzjr.c0(((Integer) obj).intValue());
            case 8:
                return zzjr.h(((Boolean) obj).booleanValue());
            case 9:
                return zzjr.B((InterfaceC4366h5) obj);
            case 10:
                return zzjr.T((InterfaceC4366h5) obj);
            case 11:
                return obj instanceof V3 ? zzjr.A((V3) obj) : zzjr.C((String) obj);
            case 12:
                return obj instanceof V3 ? zzjr.A((V3) obj) : zzjr.i((byte[]) obj);
            case 13:
                return zzjr.v0(((Integer) obj).intValue());
            case 14:
                return zzjr.k0(((Integer) obj).intValue());
            case 15:
                return zzjr.f0(((Long) obj).longValue());
            case 16:
                return zzjr.o0(((Integer) obj).intValue());
            case 17:
                return zzjr.j0(((Long) obj).longValue());
            case 18:
                return obj instanceof I4 ? zzjr.X(((I4) obj).zza()) : zzjr.X(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry entry) {
        AbstractC5487d.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private final void g(InterfaceC4502y4 interfaceC4502y4, Object obj) {
        if (!interfaceC4502y4.zze()) {
            j(interfaceC4502y4, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                j(interfaceC4502y4, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f35517a.put(interfaceC4502y4, obj);
    }

    private final void h(Map.Entry entry) {
        AbstractC5487d.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(com.google.android.gms.internal.measurement.InterfaceC4502y4 r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.measurement.U5 r0 = r3.zzb()
            com.google.android.gms.internal.measurement.F4.e(r4)
            int[] r1 = com.google.android.gms.internal.measurement.AbstractC4478v4.f35503a
            com.google.android.gms.internal.measurement.b6 r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r1 = r2
            goto L42
        L1a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.InterfaceC4366h5
            if (r0 != 0) goto L42
            goto L18
        L1f:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L42
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.I4
            if (r0 == 0) goto L18
            goto L42
        L28:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.V3
            if (r0 != 0) goto L42
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L18
            goto L42
        L31:
            boolean r1 = r4 instanceof java.lang.String
            goto L42
        L34:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r1 = r4 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r1 = r4 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r1 = r4 instanceof java.lang.Long
            goto L42
        L40:
            boolean r1 = r4 instanceof java.lang.Integer
        L42:
            if (r1 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.U5 r3 = r3.zzb()
            com.google.android.gms.internal.measurement.b6 r3 = r3.zzb()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4486w4.j(com.google.android.gms.internal.measurement.y4, java.lang.Object):void");
    }

    private static boolean k(Map.Entry entry) {
        AbstractC5487d.a(entry.getKey());
        throw null;
    }

    public final int a() {
        int iB = this.f35517a.b();
        int iE = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            iE += e(this.f35517a.h(i10));
        }
        Iterator it = this.f35517a.i().iterator();
        while (it.hasNext()) {
            iE += e((Map.Entry) it.next());
        }
        return iE;
    }

    public final /* synthetic */ Object clone() {
        C4486w4 c4486w4 = new C4486w4();
        int iB = this.f35517a.b();
        for (int i10 = 0; i10 < iB; i10++) {
            Map.Entry entryH = this.f35517a.h(i10);
            AbstractC5487d.a(entryH.getKey());
            c4486w4.g(null, entryH.getValue());
        }
        for (Map.Entry entry : this.f35517a.i()) {
            AbstractC5487d.a(entry.getKey());
            c4486w4.g(null, entry.getValue());
        }
        c4486w4.f35519c = this.f35519c;
        return c4486w4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4486w4) {
            return this.f35517a.equals(((C4486w4) obj).f35517a);
        }
        return false;
    }

    public final void f(C4486w4 c4486w4) {
        int iB = c4486w4.f35517a.b();
        for (int i10 = 0; i10 < iB; i10++) {
            h(c4486w4.f35517a.h(i10));
        }
        Iterator it = c4486w4.f35517a.i().iterator();
        while (it.hasNext()) {
            h((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f35517a.hashCode();
    }

    final Iterator i() {
        return this.f35517a.isEmpty() ? Collections.emptyIterator() : this.f35519c ? new N4(this.f35517a.n().iterator()) : this.f35517a.n().iterator();
    }

    public final Iterator l() {
        return this.f35517a.isEmpty() ? Collections.emptyIterator() : this.f35519c ? new N4(this.f35517a.entrySet().iterator()) : this.f35517a.entrySet().iterator();
    }

    public final void m() {
        if (this.f35518b) {
            return;
        }
        int iB = this.f35517a.b();
        for (int i10 = 0; i10 < iB; i10++) {
            Object value = this.f35517a.h(i10).getValue();
            if (value instanceof D4) {
                ((D4) value).A();
            }
        }
        Iterator it = this.f35517a.i().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof D4) {
                ((D4) value2).A();
            }
        }
        this.f35517a.p();
        this.f35518b = true;
    }

    public final boolean n() {
        int iB = this.f35517a.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (!k(this.f35517a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f35517a.i().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private C4486w4(AbstractC4503y5 abstractC4503y5) {
        this.f35517a = abstractC4503y5;
        m();
    }

    private C4486w4(boolean z10) {
        this(new B5());
        m();
    }
}
