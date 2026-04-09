package yc;

import android.os.ParcelUuid;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final ParcelUuid f66675a;

    /* renamed from: b, reason: collision with root package name */
    private final ParcelUuid f66676b;

    /* renamed from: c, reason: collision with root package name */
    private final ParcelUuid f66677c;

    /* renamed from: d, reason: collision with root package name */
    private final ParcelUuid f66678d;

    public s() {
        com.ui.wifiman.model.bluetooth.le.i iVar = com.ui.wifiman.model.bluetooth.le.i.f42575a;
        this.f66675a = new ParcelUuid(iVar.a(9514));
        this.f66676b = new ParcelUuid(iVar.a(8216));
        this.f66677c = new ParcelUuid(iVar.a(8473));
        this.f66678d = new ParcelUuid(iVar.a(8225));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yc.r a(android.bluetooth.le.ScanResult r10) {
        /*
            r9 = this;
            java.lang.String r0 = "scanResult"
            kotlin.jvm.internal.AbstractC6492s.i(r10, r0)
            r0 = 4
            r1 = 0
            android.bluetooth.le.ScanRecord r2 = r10.getScanRecord()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L2a
            java.util.Map r2 = r2.getServiceData()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L2a
            android.os.ParcelUuid r3 = r9.f66675a     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L24
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L2a
            h9.a$b r3 = h9.C5969a.f48518b     // Catch: java.lang.Throwable -> L24
            h9.a r2 = r3.d(r2)     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r2 = move-exception
            java.lang.String r3 = "Failed to parse MAC"
            Z7.b.e(r3, r2, r1, r0, r1)
        L2a:
            r2 = r1
        L2b:
            android.bluetooth.le.ScanRecord r3 = r10.getScanRecord()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L52
            java.util.Map r3 = r3.getServiceData()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L52
            android.os.ParcelUuid r4 = r9.f66676b     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L4c
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L52
            java.net.InetAddress r3 = java.net.InetAddress.getByAddress(r3)     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r3.isLoopbackAddress()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L53
            goto L52
        L4c:
            r3 = move-exception
            java.lang.String r4 = "Failed to parse Ip address"
            Z7.b.e(r4, r3, r1, r0, r1)
        L52:
            r3 = r1
        L53:
            android.bluetooth.le.ScanRecord r4 = r10.getScanRecord()     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L76
            java.util.Map r4 = r4.getServiceData()     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L76
            android.os.ParcelUuid r5 = r9.f66678d     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L76
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L76
            v7.b r5 = v7.C8195b.f63487a     // Catch: java.lang.Throwable -> L76
            v7.a r6 = v7.EnumC8194a.BIG_ENDIAN     // Catch: java.lang.Throwable -> L76
            boolean r4 = r5.a(r4, r6)     // Catch: java.lang.Throwable -> L76
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L76
            goto L77
        L76:
            r4 = r1
        L77:
            android.bluetooth.le.ScanRecord r10 = r10.getScanRecord()     // Catch: java.lang.Throwable -> L9f
            if (r10 == 0) goto La5
            java.util.Map r10 = r10.getServiceData()     // Catch: java.lang.Throwable -> L9f
            if (r10 == 0) goto La5
            android.os.ParcelUuid r5 = r9.f66677c     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r10 = r10.get(r5)     // Catch: java.lang.Throwable -> L9f
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Throwable -> L9f
            if (r10 == 0) goto La5
            v7.b r5 = v7.C8195b.f63487a     // Catch: java.lang.Throwable -> L9f
            v7.a r6 = v7.EnumC8194a.BIG_ENDIAN     // Catch: java.lang.Throwable -> L9f
            int r10 = r5.b(r10, r6)     // Catch: java.lang.Throwable -> L9f
            long r5 = (long) r10     // Catch: java.lang.Throwable -> L9f
            r10 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r10     // Catch: java.lang.Throwable -> L9f
            long r5 = r5 * r7
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L9f
            goto La6
        L9f:
            r10 = move-exception
            java.lang.String r5 = "Failed to parse uptime"
            Z7.b.e(r5, r10, r1, r0, r1)
        La5:
            r10 = r1
        La6:
            if (r2 != 0) goto Lae
            if (r3 != 0) goto Lae
            if (r4 != 0) goto Lae
            if (r10 == 0) goto Lba
        Lae:
            if (r3 == 0) goto Lb4
            inet.ipaddr.g r1 = ee.AbstractC5456b.a(r3)
        Lb4:
            yc.r r0 = new yc.r
            r0.<init>(r2, r1, r10, r4)
            r1 = r0
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.s.a(android.bluetooth.le.ScanResult):yc.r");
    }
}
