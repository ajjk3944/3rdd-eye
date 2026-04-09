package w3;

import D7.c;
import F3.f;
import N7.G8;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import b5.d;
import com.applovin.sdk.AppLovinEventTypes;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import v3.C5677c;
import x3.A;
import x3.AbstractC5759a;
import x3.B;
import x3.C;
import x3.C5760b;
import x3.C5761c;
import x3.C5762d;
import x3.C5763e;
import x3.C5764f;
import x3.C5765g;
import x3.D;
import x3.F;
import x3.G;
import x3.h;
import x3.i;
import x3.j;
import x3.l;
import x3.m;
import x3.n;
import x3.o;
import x3.p;
import x3.q;
import x3.r;
import x3.s;
import x3.t;
import x3.v;
import x3.w;
import x3.x;
import x3.y;
import x3.z;
import y3.h;
import z3.C5859a;
import z3.g;
import z3.k;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final f f47329a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f47330b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f47331c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f47332d;

    /* renamed from: e, reason: collision with root package name */
    public final H3.a f47333e;

    /* renamed from: f, reason: collision with root package name */
    public final H3.a f47334f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47335g;

    /* compiled from: CctTransportBackend.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f47336a;

        /* renamed from: b, reason: collision with root package name */
        public final m f47337b;

        /* renamed from: c, reason: collision with root package name */
        public final String f47338c;

        public a(URL url, m mVar, String str) {
            this.f47336a = url;
            this.f47337b = mVar;
            this.f47338c = str;
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* renamed from: w3.b$b, reason: collision with other inner class name */
    public static final class C0544b {

        /* renamed from: a, reason: collision with root package name */
        public final int f47339a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f47340b;

        /* renamed from: c, reason: collision with root package name */
        public final long f47341c;

        public C0544b(int i, URL url, long j4) {
            this.f47339a = i;
            this.f47340b = url;
            this.f47341c = j4;
        }
    }

    public b(Context context, H3.a aVar, H3.a aVar2) {
        d dVar = new d();
        C5761c c5761c = C5761c.f47678a;
        dVar.a(w.class, c5761c);
        dVar.a(m.class, c5761c);
        j jVar = j.f47702a;
        dVar.a(D.class, jVar);
        dVar.a(t.class, jVar);
        C5762d c5762d = C5762d.f47680a;
        dVar.a(x.class, c5762d);
        dVar.a(n.class, c5762d);
        C5760b c5760b = C5760b.f47666a;
        dVar.a(AbstractC5759a.class, c5760b);
        dVar.a(l.class, c5760b);
        i iVar = i.f47693a;
        dVar.a(C.class, iVar);
        dVar.a(s.class, iVar);
        C5763e c5763e = C5763e.f47683a;
        dVar.a(y.class, c5763e);
        dVar.a(o.class, c5763e);
        h hVar = h.f47691a;
        dVar.a(B.class, hVar);
        dVar.a(r.class, hVar);
        C5765g c5765g = C5765g.f47689a;
        dVar.a(A.class, c5765g);
        dVar.a(q.class, c5765g);
        x3.k kVar = x3.k.f47710a;
        dVar.a(F.class, kVar);
        dVar.a(v.class, kVar);
        C5764f c5764f = C5764f.f47686a;
        dVar.a(z.class, c5764f);
        dVar.a(p.class, c5764f);
        dVar.f17190d = true;
        this.f47329a = new f(dVar);
        this.f47331c = context;
        this.f47330b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f47332d = c(C5719a.f47323c);
        this.f47333e = aVar2;
        this.f47334f = aVar;
        this.f47335g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(androidx.work.s.d("Invalid url: ", str), e4);
        }
    }

    @Override // z3.k
    public final y3.h a(y3.h hVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f47330b.getActiveNetworkInfo();
        h.a aVarM = hVar.m();
        int i = Build.VERSION.SDK_INT;
        HashMap map = aVarM.f48066f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("sdk-version", String.valueOf(i));
        aVarM.a(CommonUrlParts.MODEL, Build.MODEL);
        aVarM.a("hardware", Build.HARDWARE);
        aVarM.a("device", Build.DEVICE);
        aVarM.a(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        aVarM.a("os-uild", Build.ID);
        aVarM.a(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER);
        aVarM.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map2 = aVarM.f48066f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("tz-offset", String.valueOf(offset));
        int value = activeNetworkInfo == null ? F.b.NONE.getValue() : activeNetworkInfo.getType();
        HashMap map3 = aVarM.f48066f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("net-type", String.valueOf(value));
        int i10 = -1;
        if (activeNetworkInfo == null) {
            subtype = F.a.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = F.a.COMBINED.getValue();
            } else if (F.a.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = aVarM.f48066f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        aVarM.a("country", Locale.getDefault().getCountry());
        aVarM.a(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage());
        Context context = this.f47331c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        aVarM.a("mcc_mnc", simOperator);
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            C3.a.b("CctTransportBackend", "Unable to find version code for package", e4);
        }
        aVarM.a("application_build", Integer.toString(i10));
        return aVarM.b();
    }

    @Override // z3.k
    public final z3.b b(C5859a c5859a) {
        String str;
        C0544b c0544bG;
        String str2;
        Integer numValueOf;
        s.a aVar;
        HashMap map = new HashMap();
        Iterator it = c5859a.f48436a.iterator();
        while (it.hasNext()) {
            y3.m mVar = (y3.m) it.next();
            String strK = mVar.k();
            if (map.containsKey(strK)) {
                ((List) map.get(strK)).add(mVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(mVar);
                map.put(strK, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            y3.m mVar2 = (y3.m) ((List) entry.getValue()).get(0);
            G g10 = G.DEFAULT;
            long jB = this.f47334f.b();
            long jB2 = this.f47333e.b();
            n nVar = new n(x.a.ANDROID_FIREBASE, new l(Integer.valueOf(mVar2.h("sdk-version")), mVar2.a(CommonUrlParts.MODEL), mVar2.a("hardware"), mVar2.a("device"), mVar2.a(AppLovinEventTypes.USER_VIEWED_PRODUCT), mVar2.a("os-uild"), mVar2.a(CommonUrlParts.MANUFACTURER), mVar2.a("fingerprint"), mVar2.a(CommonUrlParts.LOCALE), mVar2.a("country"), mVar2.a("mcc_mnc"), mVar2.a("application_build")));
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                str2 = null;
            } catch (NumberFormatException unused) {
                str2 = (String) entry.getKey();
                numValueOf = null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = ((List) entry.getValue()).iterator();
            while (it3.hasNext()) {
                y3.m mVar3 = (y3.m) it3.next();
                y3.l lVarD = mVar3.d();
                C5677c c5677c = lVarD.f48087a;
                Iterator it4 = it2;
                Iterator it5 = it3;
                boolean zEquals = c5677c.equals(new C5677c("proto"));
                byte[] bArr = lVarD.f48088b;
                if (zEquals) {
                    aVar = new s.a();
                    aVar.f47745e = bArr;
                } else if (c5677c.equals(new C5677c("json"))) {
                    String str3 = new String(bArr, Charset.forName(Constants.ENCODING));
                    s.a aVar2 = new s.a();
                    aVar2.f47746f = str3;
                    aVar = aVar2;
                } else {
                    String strC = C3.a.c("CctTransportBackend");
                    if (Log.isLoggable(strC, 5)) {
                        Log.w(strC, "Received event of unsupported encoding " + c5677c + ". Skipping...");
                    }
                    it2 = it4;
                    it3 = it5;
                }
                aVar.f47741a = Long.valueOf(mVar3.e());
                aVar.f47744d = Long.valueOf(mVar3.l());
                String str4 = mVar3.b().get("tz-offset");
                aVar.f47747g = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar.f47748h = new v(F.b.forNumber(mVar3.h("net-type")), F.a.forNumber(mVar3.h("mobile-subtype")));
                if (mVar3.c() != null) {
                    aVar.f47742b = mVar3.c();
                }
                if (mVar3.i() != null) {
                    aVar.f47743c = new o(new r(new q(mVar3.i())), y.a.EVENT_OVERRIDE);
                }
                if (mVar3.f() != null || mVar3.g() != null) {
                    aVar.i = new p(mVar3.f() != null ? mVar3.f() : null, mVar3.g() != null ? mVar3.g() : null);
                }
                String strS = aVar.f47741a == null ? " eventTimeMs" : "";
                if (aVar.f47744d == null) {
                    strS = strS.concat(" eventUptimeMs");
                }
                if (aVar.f47747g == null) {
                    strS = G8.s(strS, " timezoneOffsetSeconds");
                }
                if (!strS.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strS));
                }
                arrayList3.add(new s(aVar.f47741a.longValue(), aVar.f47742b, aVar.f47743c, aVar.f47744d.longValue(), aVar.f47745e, aVar.f47746f, aVar.f47747g.longValue(), aVar.f47748h, aVar.i));
                it2 = it4;
                it3 = it5;
            }
            arrayList2.add(new t(jB, jB2, nVar, numValueOf, str2, arrayList3, g10));
            it2 = it2;
        }
        m mVar4 = new m(arrayList2);
        byte[] bArr2 = c5859a.f48437b;
        URL urlC = this.f47332d;
        if (bArr2 != null) {
            try {
                C5719a c5719aA = C5719a.a(bArr2);
                str = c5719aA.f47328b;
                if (str == null) {
                    str = null;
                }
                String str5 = c5719aA.f47327a;
                if (str5 != null) {
                    urlC = c(str5);
                }
            } catch (IllegalArgumentException unused2) {
                return new z3.b(g.a.FATAL_ERROR, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar3 = new a(urlC, mVar4, str);
            c cVar = new c(this, 24);
            int i = 5;
            do {
                c0544bG = cVar.g(aVar3);
                URL url = c0544bG.f47340b;
                if (url != null) {
                    C3.a.a("CctTransportBackend", "Following redirect to: %s", url);
                    aVar3 = new a(url, aVar3.f47337b, aVar3.f47338c);
                } else {
                    aVar3 = null;
                }
                if (aVar3 == null) {
                    break;
                }
                i--;
            } while (i >= 1);
            int i10 = c0544bG.f47339a;
            if (i10 == 200) {
                return new z3.b(g.a.OK, c0544bG.f47341c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? new z3.b(g.a.INVALID_PAYLOAD, -1L) : new z3.b(g.a.FATAL_ERROR, -1L);
            }
            return new z3.b(g.a.TRANSIENT_ERROR, -1L);
        } catch (IOException e4) {
            C3.a.b("CctTransportBackend", "Could not make request to the backend", e4);
            return new z3.b(g.a.TRANSIENT_ERROR, -1L);
        }
    }
}
