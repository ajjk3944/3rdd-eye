package bh;

import com.google.android.gms.internal.ads.rw0;
import d0.f1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i4, ck.c cVar, int i10) {
        super(i4, cVar);
        this.f2221b = i10;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2221b) {
            case 0:
                return new p(2, cVar, 0);
            case 1:
                return new p(2, cVar, 1);
            case 2:
                return new p(2, cVar, 2);
            case 3:
                return new p(2, cVar, 3);
            case 4:
                return new p(2, cVar, 4);
            case 5:
                return new p(2, cVar, 5);
            case 6:
                return new p(2, cVar, 6);
            default:
                return new p(2, cVar, 7);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2221b) {
            case 0:
                p pVar = (p) create((al.i) obj, (ck.c) obj2);
                yj.u uVar = yj.u.f37649a;
                pVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                p pVar2 = (p) create((al.i) obj, (ck.c) obj2);
                yj.u uVar2 = yj.u.f37649a;
                pVar2.invokeSuspend(uVar2);
                return uVar2;
            case 2:
                return ((p) create((rw0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 3:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 4:
                p pVar3 = (p) create((f1) obj, (ck.c) obj2);
                yj.u uVar3 = yj.u.f37649a;
                pVar3.invokeSuspend(uVar3);
                return uVar3;
            case 5:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 6:
                p pVar4 = (p) create((al.i) obj, (ck.c) obj2);
                yj.u uVar4 = yj.u.f37649a;
                pVar4.invokeSuspend(uVar4);
                return uVar4;
            default:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Type inference failed for: r0v2, types: [zj.s] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f2221b
            java.lang.String r1 = "com.liuzh.deviceinfo"
            r2 = 0
            r3 = 1
            yj.u r4 = yj.u.f37649a
            switch(r0) {
                case 0: goto Lca;
                case 1: goto Lc6;
                case 2: goto Lb9;
                case 3: goto L64;
                case 4: goto L60;
                case 5: goto L58;
                case 6: goto L54;
                default: goto Lb;
            }
        Lb:
            ci.b.D(r8)
            com.liuzh.deviceinfo.DeviceInfoApp r8 = com.liuzh.deviceinfo.DeviceInfoApp.f21145f     // Catch: java.lang.Exception -> L4f
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Exception -> L4f
            java.util.List r8 = r8.getInstalledApplications(r2)     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "getInstalledApplications(...)"
            nk.k.d(r8, r0)     // Catch: java.lang.Exception -> L4f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L4f
            r0.<init>()     // Catch: java.lang.Exception -> L4f
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L4f
        L26:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Exception -> L4f
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Exception -> L4f
            android.content.pm.ApplicationInfo r4 = (android.content.pm.ApplicationInfo) r4     // Catch: java.lang.Exception -> L4f
            java.lang.String r4 = r4.packageName     // Catch: java.lang.Exception -> L4f
            if (r4 == 0) goto L26
            r0.add(r4)     // Catch: java.lang.Exception -> L4f
            goto L26
        L3a:
            int r8 = r0.size()     // Catch: java.lang.Exception -> L4f
            if (r8 != r3) goto L4a
            java.lang.Object r8 = r0.get(r2)     // Catch: java.lang.Exception -> L4f
            boolean r8 = nk.k.a(r8, r1)     // Catch: java.lang.Exception -> L4f
        L48:
            r3 = r8
            goto L4f
        L4a:
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Exception -> L4f
            goto L48
        L4f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L54:
            ci.b.D(r8)
            return r4
        L58:
            ci.b.D(r8)
            android.view.Choreographer r8 = android.view.Choreographer.getInstance()
            return r8
        L60:
            ci.b.D(r8)
            return r4
        L64:
            zj.s r0 = zj.s.f38317a
            ci.b.D(r8)
            com.liuzh.deviceinfo.DeviceInfoApp r8 = com.liuzh.deviceinfo.DeviceInfoApp.f21145f
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.util.List r4 = r8.getInstalledPackages(r2)     // Catch: java.lang.Exception -> L77
            nk.k.b(r4)     // Catch: java.lang.Exception -> L77
            goto L78
        L77:
            r4 = r0
        L78:
            int r5 = r4.size()
            r6 = 0
            if (r5 != r3) goto L92
            java.lang.Object r2 = r4.get(r2)
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            if (r2 == 0) goto L8a
            java.lang.String r2 = r2.packageName
            goto L8b
        L8a:
            r2 = r6
        L8b:
            boolean r1 = nk.k.a(r2, r1)
            if (r1 == 0) goto L92
            goto Lb8
        L92:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r4.iterator()
        L9b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r1.next()
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            if (r2 != 0) goto Lab
            r2 = r6
            goto Lb2
        Lab:
            nk.k.b(r8)
            gg.a r2 = cm.g.j(r2, r8)
        Lb2:
            if (r2 == 0) goto L9b
            r0.add(r2)
            goto L9b
        Lb8:
            return r0
        Lb9:
            ci.b.D(r8)
            com.google.android.gms.internal.ads.rw0 r8 = com.google.android.gms.internal.ads.rw0.D()
            java.lang.String r0 = "getDefaultInstance(...)"
            nk.k.d(r8, r0)
            return r8
        Lc6:
            ci.b.D(r8)
            return r4
        Lca:
            ci.b.D(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
