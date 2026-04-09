package zg;

import kg.p;

/* renamed from: zg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8748a {

    /* renamed from: a, reason: collision with root package name */
    final int f67278a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f67279b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f67280c;

    /* renamed from: d, reason: collision with root package name */
    int f67281d;

    /* renamed from: zg.a$a, reason: collision with other inner class name */
    public interface InterfaceC2392a extends p {
        @Override // kg.p
        boolean test(Object obj);
    }

    public C8748a(int i10) {
        this.f67278a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f67279b = objArr;
        this.f67280c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(Dj.b r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f67279b
            int r1 = r4.f67278a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = zg.EnumC8757j.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.C8748a.a(Dj.b):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(gg.x r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f67279b
            int r1 = r4.f67278a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = zg.EnumC8757j.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.C8748a.b(gg.x):boolean");
    }

    public void c(Object obj) {
        int i10 = this.f67278a;
        int i11 = this.f67281d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f67280c[i10] = objArr;
            this.f67280c = objArr;
            i11 = 0;
        }
        this.f67280c[i11] = obj;
        this.f67281d = i11 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(zg.C8748a.InterfaceC2392a r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f67279b
            int r1 = r4.f67278a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.C8748a.d(zg.a$a):void");
    }

    public void e(Object obj) {
        this.f67279b[0] = obj;
    }
}
