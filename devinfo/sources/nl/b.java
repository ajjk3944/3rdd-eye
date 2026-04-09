package nl;

import com.google.android.gms.internal.ads.ur0;
import d0.z0;
import j6.i;
import nk.k;
import t7.m;
import zj.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f29990d = new b();

    /* renamed from: a, reason: collision with root package name */
    public final ur0 f29991a = new ur0(3);

    /* renamed from: b, reason: collision with root package name */
    public final i f29992b = pl.a.f32026a;

    /* renamed from: c, reason: collision with root package name */
    public final ol.d f29993c = new ol.d(0);

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r0.f30591b = r1.length();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(il.a r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "deserializer"
            nk.k.e(r7, r0)
            com.google.android.gms.internal.ads.ur0 r0 = r6.f29991a
            r0.getClass()
            ol.i r0 = new ol.i
            r0.<init>(r8)
            com.google.android.gms.internal.ads.be1 r1 = new com.google.android.gms.internal.ads.be1
            ol.k r2 = ol.k.f30598c
            kl.d r3 = r7.d()
            r1.<init>(r6, r2, r0, r3)
            java.lang.Object r7 = r1.n(r7)
            java.io.Serializable r1 = r0.f30594e
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r0.f30591b
        L24:
            r3 = -1
            r4 = 10
            if (r2 == r3) goto L4d
            int r3 = r1.length()
            if (r2 >= r3) goto L4d
            int r3 = r2 + 1
            char r2 = r1.charAt(r2)
            r5 = 32
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            r4 = 13
            if (r2 == r4) goto L4b
            r4 = 9
            if (r2 != r4) goto L44
            goto L4b
        L44:
            r0.f30591b = r3
            byte r4 = ol.g.b(r2)
            goto L53
        L4b:
            r2 = r3
            goto L24
        L4d:
            int r1 = r1.length()
            r0.f30591b = r1
        L53:
            r1 = 10
            if (r4 != r1) goto L58
            return r7
        L58:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected EOF after parsing, but had "
            r7.<init>(r1)
            int r1 = r0.f30591b
            int r1 = r1 + (-1)
            char r8 = r8.charAt(r1)
            r7.append(r8)
            java.lang.String r8 = " instead"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            r1 = 6
            ol.i.k(r0, r7, r8, r1)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.b.a(il.a, java.lang.String):java.lang.Object");
    }

    public final String b(il.a aVar, Object obj) {
        char[] cArr;
        k.e(aVar, "serializer");
        m mVar = new m((char) 0, 18);
        ol.b bVar = ol.b.f30582c;
        synchronized (bVar) {
            l lVar = (l) bVar.f996b;
            cArr = null;
            char[] cArr2 = (char[]) (lVar.isEmpty() ? null : lVar.removeLast());
            if (cArr2 != null) {
                bVar.f995a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        mVar.f34474c = cArr;
        try {
            ol.k kVar = ol.k.f30598c;
            z0[] z0VarArr = new z0[ol.k.f30602h.size()];
            this.f29991a.getClass();
            new z0(new a4.d((Object) mVar, (byte) 0), this, kVar, z0VarArr).l(aVar, obj);
            return mVar.toString();
        } finally {
            mVar.t();
        }
    }
}
