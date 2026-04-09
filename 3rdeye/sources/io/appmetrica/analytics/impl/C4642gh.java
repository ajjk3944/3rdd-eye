package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4642gh extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f40946b;

    public C4642gh(C4940s5 c4940s5) {
        this(c4940s5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:15:0x0043, B:17:0x004d, B:18:0x005d, B:19:0x0066, B:21:0x006c, B:23:0x008f, B:24:0x0094, B:25:0x0098), top: B:29:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:15:0x0043, B:17:0x004d, B:18:0x005d, B:19:0x0066, B:21:0x006c, B:23:0x008f, B:24:0x0094, B:25:0x0098), top: B:29:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(io.appmetrica.analytics.impl.C4683i6 r10) {
        /*
            r9 = this;
            io.appmetrica.analytics.impl.s5 r0 = r9.f40632a
            io.appmetrica.analytics.impl.ro r1 = r0.f41617t
            boolean r1 = r1.c()
            r2 = 0
            if (r1 == 0) goto Ld0
            boolean r1 = r0.x()
            if (r1 == 0) goto Ld0
            io.appmetrica.analytics.impl.if r1 = r0.f41601c
            io.appmetrica.analytics.impl.s5 r3 = r9.f40632a
            io.appmetrica.analytics.impl.if r3 = r3.f41601c
            java.lang.String r3 = r3.e()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L22
            goto L42
        L22:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L42
            r4.<init>()     // Catch: java.lang.Throwable -> L42
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L42
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L42
            r3 = r2
        L2d:
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L42
            if (r3 >= r6) goto L43
            io.appmetrica.analytics.impl.ka r6 = new io.appmetrica.analytics.impl.ka     // Catch: java.lang.Throwable -> L42
            org.json.JSONObject r7 = r5.getJSONObject(r3)     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            r4.add(r6)     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + 1
            goto L2d
        L42:
            r4 = 0
        L43:
            java.util.ArrayList r3 = r9.b()     // Catch: java.lang.Throwable -> Ld0
            boolean r4 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.areCollectionsEqual(r4, r3)     // Catch: java.lang.Throwable -> Ld0
            if (r4 == 0) goto L5d
            io.appmetrica.analytics.impl.C9 r10 = r0.f41611n     // Catch: java.lang.Throwable -> Ld0
            int r0 = r10.f39242k     // Catch: java.lang.Throwable -> Ld0
            r10.f39244m = r0     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.if r10 = r10.f39233a     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.if r10 = r10.a(r0)     // Catch: java.lang.Throwable -> Ld0
            r10.b()     // Catch: java.lang.Throwable -> Ld0
            goto Ld0
        L5d:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld0
            r4.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ld0
        L66:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld0
            if (r5 == 0) goto L98
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.ka r5 = (io.appmetrica.analytics.impl.C4738ka) r5     // Catch: java.lang.Throwable -> Ld0
            r5.getClass()     // Catch: java.lang.Throwable -> Ld0
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld0
            r6.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f41136a     // Catch: java.lang.Throwable -> Ld0
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r7 = "required"
            boolean r8 = r5.f41138c     // Catch: java.lang.Throwable -> Ld0
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch: java.lang.Throwable -> Ld0
            int r5 = r5.f41137b     // Catch: java.lang.Throwable -> Ld0
            r7 = -1
            if (r5 == r7) goto L94
            java.lang.String r7 = "version"
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> Ld0
        L94:
            r4.put(r6)     // Catch: java.lang.Throwable -> Ld0
            goto L66
        L98:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld0
            r3.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "features"
            org.json.JSONObject r3 = r3.put(r5, r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.i6 r10 = io.appmetrica.analytics.impl.C4683i6.a(r10, r3)     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.C9 r0 = r0.f41611n     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.Pk r3 = r0.f39235c     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.Bk r3 = r3.b(r10)     // Catch: java.lang.Throwable -> Ld0
            long r5 = r10.i     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.Rk r3 = io.appmetrica.analytics.impl.Pk.a(r3, r5)     // Catch: java.lang.Throwable -> Ld0
            r0.a(r10, r3)     // Catch: java.lang.Throwable -> Ld0
            int r10 = r0.f39242k     // Catch: java.lang.Throwable -> Ld0
            r0.f39244m = r10     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.if r0 = r0.f39233a     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.if r10 = r0.a(r10)     // Catch: java.lang.Throwable -> Ld0
            r10.b()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> Ld0
            r1.i(r10)     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4642gh.a(io.appmetrica.analytics.impl.i6):boolean");
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            C4940s5 c4940s5 = this.f40632a;
            SafePackageManager safePackageManager = this.f40946b;
            Context context = c4940s5.f41599a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            AbstractC4712ja c4661ha = AndroidUtils.isApiAchieved(24) ? new C4661ha() : new C4687ia();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(c4661ha.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C4642gh(C4940s5 c4940s5, SafePackageManager safePackageManager) {
        super(c4940s5);
        this.f40946b = safePackageManager;
    }
}
