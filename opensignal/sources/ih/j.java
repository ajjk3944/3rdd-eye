package ih;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import ch.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public final List f11397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11398c;

    /* renamed from: d, reason: collision with root package name */
    public final dh.c f11399d;

    /* renamed from: i, reason: collision with root package name */
    public String f11404i;
    public String j;

    /* renamed from: a, reason: collision with root package name */
    public final Random f11396a = new Random();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11400e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11401f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f11402g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f11403h = new HashMap();

    public j(Context context, TelephonyManager telephonyManager, ag.b bVar, dh.e eVar, List list, ch.f fVar, ch.i iVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int dataNetworkType = 0;
        boolean z10 = bVar.i("android.permission.READ_PHONE_STATE") || bVar.i("android.permission.READ_BASIC_PHONE_STATE");
        if (!fVar.e() || iVar.b() < 29 || z10) {
            dataNetworkType = (fVar.f() && z10 && telephonyManager != null) ? telephonyManager.getDataNetworkType() : telephonyManager != null ? telephonyManager.getNetworkType() : -1;
        } else if (bVar.i("android.permission.ACCESS_NETWORK_STATE")) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            int length = allNetworks.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i10]);
                    if (networkInfo != null && networkInfo.getType() == 0) {
                        dataNetworkType = networkInfo.getSubtype();
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        eVar.getClass();
        int i11 = dh.d.f7345a[dr.a.v(dataNetworkType).ordinal()];
        this.f11398c = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? eVar.f7364u : eVar.f7369z : eVar.f7368y : eVar.f7367x : eVar.f7366w : eVar.f7365v;
        this.f11397b = list;
        Iterator it = eVar.f7361r.iterator();
        while (it.hasNext()) {
            dh.b bVar2 = (dh.b) it.next();
            this.f11402g.put(bVar2.f7343a, bVar2.f7344b);
            this.f11400e.add(bVar2.f7343a);
        }
        Iterator it2 = eVar.f7362s.iterator();
        while (it2.hasNext()) {
            dh.b bVar3 = (dh.b) it2.next();
            this.f11403h.put(bVar3.f7343a, bVar3.f7344b);
            this.f11401f.add(bVar3.f7343a);
        }
        this.f11399d = eVar.f7363t;
    }

    public final String a(List list) {
        if (!list.isEmpty()) {
            return (String) list.get(this.f11396a.nextInt(list.size()));
        }
        n.b("ServerSelector", "[getRandomServerName] serverNames list is empty!");
        return "server-list-empty-error";
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(java.util.List r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r8.f11397b
            if (r1 == 0) goto L42
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            ih.k r2 = (ih.k) r2
            dh.b r3 = r2.f11406b
            java.lang.String r3 = r3.f7343a
            java.lang.String r4 = "facebook.com"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto Ld
            java.lang.String r4 = "google.com"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2e
            goto Ld
        L2e:
            float r3 = r2.a()
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto Ld
            int r4 = r8.f11398c
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto Ld
            r0.add(r2)
            goto Ld
        L42:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L99
            java.lang.Object r2 = r0.next()
            ih.k r2 = (ih.k) r2
            java.util.Iterator r3 = r9.iterator()
        L5b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            dh.b r5 = r2.f11406b
            java.lang.String r5 = r5.f7343a
            java.lang.String r6 = " https"
            boolean r7 = r4.endsWith(r6)
            if (r7 == 0) goto L7f
            boolean r7 = r5.endsWith(r6)
            if (r7 != 0) goto L7f
            java.lang.String r5 = r5.concat(r6)
        L7d:
            r6 = r4
            goto L8f
        L7f:
            boolean r7 = r4.endsWith(r6)
            if (r7 != 0) goto L7d
            boolean r7 = r5.endsWith(r6)
            if (r7 == 0) goto L7d
            java.lang.String r6 = r4.concat(r6)
        L8f:
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L5b
            r1.add(r4)
            goto L5b
        L99:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto La2
            java.lang.String r9 = "invalid-server-name"
            return r9
        La2:
            java.util.Random r9 = r8.f11396a
            int r0 = r1.size()
            int r9 = r9.nextInt(r0)
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ih.j.b(java.util.List):java.lang.String");
    }

    public final String c(String str, d dVar) {
        HashMap map = dVar == d.UPLOAD ? this.f11403h : this.f11402g;
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        String strReplace = str.contains(" https") ? str.replace(" https", "") : str.concat(" https");
        return map.containsKey(strReplace) ? (String) map.get(strReplace) : "invalid-url";
    }
}
