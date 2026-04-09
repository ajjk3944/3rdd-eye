package N7;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivDownloadCallbacks.kt */
/* renamed from: N7.j4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1223j4 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1175g0> f8482a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C1175g0> f8483b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8484c;

    public C1223j4() {
        this(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.C1223j4 r8, A7.d r9, A7.d r10) {
        /*
            r7 = this;
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.l.f(r9, r0)
            java.lang.String r0 = "otherResolver"
            kotlin.jvm.internal.l.f(r10, r0)
            r0 = 0
            if (r8 != 0) goto Le
            return r0
        Le:
            r1 = 0
            java.util.List<N7.g0> r2 = r8.f8482a
            java.util.List<N7.g0> r3 = r7.f8482a
            if (r3 == 0) goto L4e
            if (r2 != 0) goto L18
            return r0
        L18:
            int r4 = r3.size()
            int r5 = r2.size()
            if (r4 == r5) goto L24
            goto L92
        L24:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = r0
        L2b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r3.next()
            int r6 = r4 + 1
            if (r4 < 0) goto L4a
            java.lang.Object r4 = r2.get(r4)
            N7.g0 r4 = (N7.C1175g0) r4
            N7.g0 r5 = (N7.C1175g0) r5
            boolean r4 = r5.a(r4, r9, r10)
            if (r4 != 0) goto L48
            goto L92
        L48:
            r4 = r6
            goto L2b
        L4a:
            c9.C2092m.a0()
            throw r1
        L4e:
            if (r2 != 0) goto L92
        L50:
            java.util.List<N7.g0> r8 = r8.f8483b
            java.util.List<N7.g0> r2 = r7.f8483b
            if (r2 == 0) goto L8e
            if (r8 != 0) goto L59
            return r0
        L59:
            int r3 = r2.size()
            int r4 = r8.size()
            if (r3 == r4) goto L64
            goto L92
        L64:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = r0
        L6b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L90
            java.lang.Object r4 = r2.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L8a
            java.lang.Object r3 = r8.get(r3)
            N7.g0 r3 = (N7.C1175g0) r3
            N7.g0 r4 = (N7.C1175g0) r4
            boolean r3 = r4.a(r3, r9, r10)
            if (r3 != 0) goto L88
            goto L92
        L88:
            r3 = r5
            goto L6b
        L8a:
            c9.C2092m.a0()
            throw r1
        L8e:
            if (r8 != 0) goto L92
        L90:
            r8 = 1
            return r8
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.C1223j4.a(N7.j4, A7.d, A7.d):boolean");
    }

    public final int b() {
        int iB;
        Integer num = this.f8484c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(C1223j4.class).hashCode();
        int iB2 = 0;
        List<C1175g0> list = this.f8482a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iB = 0;
            while (it.hasNext()) {
                iB += ((C1175g0) it.next()).b();
            }
        } else {
            iB = 0;
        }
        int i = iHashCode + iB;
        List<C1175g0> list2 = this.f8483b;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                iB2 += ((C1175g0) it2.next()).b();
            }
        }
        int i10 = i + iB2;
        this.f8484c = Integer.valueOf(i10);
        return i10;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1237k4) D7.a.f1071b.f6566P2.getValue()).b(D7.a.f1070a, this);
    }

    public C1223j4(List<C1175g0> list, List<C1175g0> list2) {
        this.f8482a = list;
        this.f8483b = list2;
    }
}
