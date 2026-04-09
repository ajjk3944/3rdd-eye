package fj;

import android.os.Build;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ch.f f8902a;

    /* renamed from: b, reason: collision with root package name */
    public final ch.i f8903b;

    /* renamed from: c, reason: collision with root package name */
    public final ag.b f8904c;

    /* renamed from: d, reason: collision with root package name */
    public final kg.r f8905d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8906e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f8907f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f8908g;

    public b(ch.f fVar, ch.i iVar, ag.b bVar, kg.r rVar, df.c cVar, ak.e eVar) {
        br.l.e(rVar, "cellInfoUpdaterFactory");
        this.f8902a = fVar;
        this.f8903b = iVar;
        this.f8904c = bVar;
        this.f8905d = rVar;
        this.f8906e = eVar.f507c;
        this.f8907f = new HashMap();
        this.f8908g = new HashMap();
    }

    public final List a(TelephonyManager telephonyManager) {
        synchronized (this) {
            try {
                if (telephonyManager == null) {
                    return w.f16945a;
                }
                int subscriptionId = this.f8902a.f() ? telephonyManager.getSubscriptionId() : telephonyManager.hashCode();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l10 = (Long) this.f8908g.get(Integer.valueOf(subscriptionId));
                if (l10 == null) {
                    l10 = 0L;
                }
                long jLongValue = l10.longValue();
                long j = jCurrentTimeMillis - jLongValue;
                if (jLongValue > 0 && j < this.f8906e) {
                    List list = (List) this.f8907f.get(Integer.valueOf(subscriptionId));
                    if (list == null) {
                        list = w.f16945a;
                    }
                    return list;
                }
                d(c(telephonyManager), telephonyManager);
                List list2 = (List) this.f8907f.get(Integer.valueOf(subscriptionId));
                if (list2 == null) {
                    list2 = w.f16945a;
                }
                return list2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ak.f b(TelephonyManager telephonyManager) {
        Object next;
        Iterator it = a(telephonyManager).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CellInfo) next).isRegistered()) {
                break;
            }
        }
        CellInfo cellInfo = (CellInfo) next;
        ch.f fVar = this.f8902a;
        if (fVar.e() && a2.b.y(cellInfo)) {
            CellIdentityTdscdma cellIdentity = a2.b.j(cellInfo).getCellIdentity();
            br.l.d(cellIdentity, "getCellIdentity(...)");
            nj.b bVar = nj.b.THREE_G;
            int i10 = Build.VERSION.SDK_INT;
            return new ak.f(bVar, i10 >= 28 ? cellIdentity.getMccString() : null, i10 >= 28 ? cellIdentity.getMncString() : null, i10 >= 28 ? Integer.valueOf(cellIdentity.getLac()) : null, null, i10 >= 28 ? Long.valueOf(cellIdentity.getCid()) : null, null, i10 >= 29 ? Integer.valueOf(cellIdentity.getUarfcn()) : null, i10 >= 28 ? Integer.valueOf(cellIdentity.getCpid()) : null, null, null);
        }
        if (fVar.e() && a2.b.D(cellInfo)) {
            CellIdentity cellIdentity2 = a2.b.i(cellInfo).getCellIdentity();
            br.l.c(cellIdentity2, "null cannot be cast to non-null type android.telephony.CellIdentityNr");
            CellIdentityNr cellIdentityNrH = a2.b.h(cellIdentity2);
            nj.b bVar2 = nj.b.FIVE_G;
            int i11 = Build.VERSION.SDK_INT;
            return new ak.f(bVar2, i11 >= 29 ? cellIdentityNrH.getMccString() : null, i11 >= 29 ? cellIdentityNrH.getMncString() : null, i11 >= 29 ? Integer.valueOf(cellIdentityNrH.getTac()) : null, i11 >= 29 ? Integer.valueOf(cellIdentityNrH.getPci()) : null, i11 >= 29 ? Long.valueOf(cellIdentityNrH.getNci()) : null, null, i11 >= 29 ? Integer.valueOf(cellIdentityNrH.getNrarfcn()) : null, null, null, null);
        }
        if (cellInfo instanceof CellInfoLte) {
            CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
            br.l.d(cellIdentity3, "getCellIdentity(...)");
            nj.b bVar3 = nj.b.FOUR_G;
            int i12 = Build.VERSION.SDK_INT;
            return new ak.f(bVar3, i12 >= 28 ? cellIdentity3.getMccString() : String.valueOf(cellIdentity3.getMcc()), i12 >= 28 ? cellIdentity3.getMncString() : String.valueOf(cellIdentity3.getMnc()), Integer.valueOf(cellIdentity3.getTac()), Integer.valueOf(cellIdentity3.getPci()), Long.valueOf(cellIdentity3.getCi()), i12 >= 28 ? Integer.valueOf(cellIdentity3.getBandwidth()) : null, Integer.valueOf(cellIdentity3.getEarfcn()), null, null, null);
        }
        if (cellInfo instanceof CellInfoWcdma) {
            CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
            br.l.d(cellIdentity4, "getCellIdentity(...)");
            nj.b bVar4 = nj.b.THREE_G;
            int i13 = Build.VERSION.SDK_INT;
            return new ak.f(bVar4, i13 >= 28 ? cellIdentity4.getMccString() : String.valueOf(cellIdentity4.getMcc()), i13 >= 28 ? cellIdentity4.getMncString() : String.valueOf(cellIdentity4.getMnc()), Integer.valueOf(cellIdentity4.getLac()), Integer.valueOf(cellIdentity4.getPsc()), Long.valueOf(cellIdentity4.getCid()), null, Integer.valueOf(cellIdentity4.getUarfcn()), null, Integer.valueOf(cellIdentity4.getPsc()), null);
        }
        if (cellInfo instanceof CellInfoGsm) {
            CellIdentityGsm cellIdentity5 = ((CellInfoGsm) cellInfo).getCellIdentity();
            br.l.d(cellIdentity5, "getCellIdentity(...)");
            nj.b bVar5 = nj.b.TWO_G;
            int i14 = Build.VERSION.SDK_INT;
            return new ak.f(bVar5, i14 >= 28 ? cellIdentity5.getMccString() : String.valueOf(cellIdentity5.getMcc()), i14 >= 28 ? cellIdentity5.getMncString() : String.valueOf(cellIdentity5.getMnc()), Integer.valueOf(cellIdentity5.getLac()), null, Long.valueOf(cellIdentity5.getCid()), null, Integer.valueOf(cellIdentity5.getArfcn()), null, Integer.valueOf(cellIdentity5.getPsc()), Integer.valueOf(cellIdentity5.getBsic()));
        }
        if (!(cellInfo instanceof CellInfoCdma)) {
            return null;
        }
        CellIdentityCdma cellIdentity6 = ((CellInfoCdma) cellInfo).getCellIdentity();
        br.l.d(cellIdentity6, "getCellIdentity(...)");
        return new ak.f(nj.b.TWO_G, null, String.valueOf(cellIdentity6.getSystemId()), Integer.valueOf(cellIdentity6.getNetworkId()), null, Long.valueOf(cellIdentity6.getBasestationId()), null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List c(android.telephony.TelephonyManager r8) {
        /*
            r7 = this;
            ch.f r0 = r7.f8902a
            boolean r1 = r0.e()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            ag.b r3 = r7.f8904c
            if (r1 == 0) goto L11
            boolean r1 = r3.i(r2)
            goto L15
        L11:
            boolean r1 = r3.g()
        L15:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "hasLocationPermission: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "CellsInfoRepository"
            ch.n.b(r5, r4)
            mq.w r4 = mq.w.f16945a
            if (r1 == 0) goto L3f
            if (r8 == 0) goto L3c
            java.util.List r1 = r8.getAllCellInfo()     // Catch: java.lang.SecurityException -> L37
            goto L3d
        L37:
            r1 = move-exception
            ch.n.e(r5, r1)
            goto L3f
        L3c:
            r1 = 0
        L3d:
            if (r1 != 0) goto L40
        L3f:
            r1 = r4
        L40:
            boolean r0 = r0.e()
            if (r0 == 0) goto L9d
            ch.i r0 = r7.f8903b
            boolean r0 = r0.f3950e
            if (r0 == 0) goto L9d
            boolean r0 = r3.i(r2)
            if (r0 == 0) goto L9d
            kg.r r0 = r7.f8905d
            java.lang.Object r2 = r0.f14398r
            ch.f r2 = (ch.f) r2
            boolean r2 = r2.e()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r0.f14395a
            ak.d r2 = (ak.d) r2
            int r2 = r2.f477f
            if (r2 == 0) goto L84
            java.lang.Object r3 = r0.f14397g
            bm.e r3 = (bm.e) r3
            java.lang.Object r5 = r3.f2830d
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            r6 = 1
            if (r2 == r6) goto L7a
            r6 = 2
            if (r2 == r6) goto L75
            goto L7a
        L75:
            java.lang.Object r2 = r3.f2831g
            r5 = r2
            dd.o r5 = (dd.o) r5
        L7a:
            io.sentry.internal.debugmeta.c r2 = new io.sentry.internal.debugmeta.c
            java.lang.Object r0 = r0.f14396d
            ag.b r0 = (ag.b) r0
            r2.<init>(r0, r5)
            goto L8b
        L84:
            ee.f r2 = new ee.f
            r0 = 8
            r2.<init>(r0)
        L8b:
            java.util.List r8 = r2.l(r8)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L96
            r4 = r8
        L96:
            boolean r8 = r4.isEmpty()
            if (r8 != 0) goto L9d
            r1 = r4
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.b.c(android.telephony.TelephonyManager):java.util.List");
    }

    public final void d(List list, TelephonyManager telephonyManager) {
        br.l.e(telephonyManager, "telephonyManager");
        synchronized (this) {
            ch.n.b("CellsInfoRepository", "updateCells() called with: cellsInfo = " + list);
            if (list != null) {
                int subscriptionId = this.f8902a.f() ? telephonyManager.getSubscriptionId() : telephonyManager.hashCode();
                this.f8907f.put(Integer.valueOf(subscriptionId), list);
                this.f8908g.put(Integer.valueOf(subscriptionId), Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
