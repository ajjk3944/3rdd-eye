package a4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final X3.e f4719c = new X3.e("SplitInstallInfoProvider", 1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4720a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4721b;

    public s(Context context) {
        this.f4720a = context;
        this.f4721b = context.getPackageName();
    }

    public static boolean b(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final HashSet c(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = d(packageInfo).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!b(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final HashSet d(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        X3.e eVar = f4719c;
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                eVar.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            eVar.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            eVar.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        Z3.h hVar = (Z3.h) r.f4718a.get();
        if (hVar != null) {
            hashSet.addAll(hVar.f4537a.a());
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U0.j a(android.os.Bundle r10) throws android.content.res.Resources.NotFoundException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            X3.e r2 = a4.s.f4719c
            if (r10 != 0) goto Le
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "No metadata found in Context."
            r2.d(r1, r10)
            return r0
        Le:
            java.lang.String r3 = "com.android.vending.splits"
            int r10 = r10.getInt(r3)
            if (r10 != 0) goto L1e
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "No metadata found in AndroidManifest."
            r2.d(r1, r10)
            return r0
        L1e:
            android.content.Context r3 = r9.f4720a     // Catch: android.content.res.Resources.NotFoundException -> Le3
            android.content.res.Resources r3 = r3.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Le3
            android.content.res.XmlResourceParser r10 = r3.getXml(r10)     // Catch: android.content.res.Resources.NotFoundException -> Le3
            a4.n r3 = new a4.n
            r4 = 0
            r3.<init>(r4)
        L2e:
            int r4 = r10.next()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            r5 = 1
            if (r4 == r5) goto Lcd
            int r4 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            r5 = 2
            if (r4 != r5) goto L2e
            java.lang.String r4 = r10.getName()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r6 = "splits"
            boolean r4 = r4.equals(r6)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r4 != 0) goto L55
            d5.y.v(r10)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            goto L2e
        L4c:
            r10 = move-exception
            goto Ld2
        L4f:
            r10 = move-exception
            goto Ld2
        L52:
            r10 = move-exception
            goto Ld2
        L55:
            int r4 = r10.next()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            r6 = 3
            if (r4 == r6) goto L2e
            int r4 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r4 != r5) goto L55
            java.lang.String r4 = r10.getName()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r7 = "module"
            boolean r4 = r4.equals(r7)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r4 == 0) goto Lc9
            java.lang.String r4 = "name"
            java.lang.String r4 = d5.y.u(r4, r10)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r4 == 0) goto Lc5
        L76:
            int r7 = r10.next()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r7 == r6) goto L55
            int r7 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r7 != r5) goto L76
            java.lang.String r7 = r10.getName()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r8 = "language"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r7 != 0) goto L92
            d5.y.v(r10)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            goto L76
        L92:
            int r7 = r10.next()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r7 == r6) goto L76
            int r7 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r7 != r5) goto L92
            java.lang.String r7 = r10.getName()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r8 = "entry"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r7 == 0) goto Lc1
            java.lang.String r7 = "key"
            java.lang.String r7 = d5.y.u(r7, r10)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r8 = "split"
            java.lang.String r8 = d5.y.u(r8, r10)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            d5.y.v(r10)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            if (r7 == 0) goto L92
            if (r8 == 0) goto L92
            r3.a(r4, r7, r8)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            goto L92
        Lc1:
            d5.y.v(r10)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            goto L92
        Lc5:
            d5.y.v(r10)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            goto L55
        Lc9:
            d5.y.v(r10)     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            goto L55
        Lcd:
            U0.j r0 = r3.b()     // Catch: java.lang.IllegalStateException -> L4c java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L52
            goto Ld9
        Ld2:
            java.lang.String r3 = "SplitInstall"
            java.lang.String r4 = "Error while parsing splits.xml"
            android.util.Log.e(r3, r4, r10)
        Ld9:
            if (r0 != 0) goto Le2
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "Can't parse languages metadata."
            r2.d(r1, r10)
        Le2:
            return r0
        Le3:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "Resource with languages metadata doesn't exist."
            r2.d(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.s.a(android.os.Bundle):U0.j");
    }
}
