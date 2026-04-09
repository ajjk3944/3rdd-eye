package k9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import l9.a0;
import l9.b0;
import l9.c0;
import l9.d;
import l9.d0;
import l9.e;
import l9.e0;
import l9.f0;
import l9.g;
import l9.g0;
import l9.h;
import l9.h0;
import l9.i;
import l9.i0;
import l9.k;
import l9.l;
import l9.m;
import l9.n;
import l9.o;
import l9.p;
import l9.q;
import l9.r;
import l9.s;
import l9.t;
import l9.v;
import l9.w;
import l9.y;
import n9.f;
import z7.j;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final j f14220a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f14221b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14222c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f14223d;

    /* renamed from: e, reason: collision with root package name */
    public final v9.a f14224e;

    /* renamed from: f, reason: collision with root package name */
    public final v9.a f14225f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14226g;

    public c(Context context, v9.a aVar, v9.a aVar2) {
        zf.c cVar = new zf.c();
        l9.c cVar2 = l9.c.f14993a;
        cVar.a(w.class, cVar2);
        cVar.a(m.class, cVar2);
        l9.j jVar = l9.j.f15017a;
        cVar.a(f0.class, jVar);
        cVar.a(t.class, jVar);
        d dVar = d.f14995a;
        cVar.a(y.class, dVar);
        cVar.a(n.class, dVar);
        l9.b bVar = l9.b.f14982a;
        cVar.a(l9.a.class, bVar);
        cVar.a(l.class, bVar);
        i iVar = i.f15008a;
        cVar.a(e0.class, iVar);
        cVar.a(s.class, iVar);
        e eVar = e.f14998a;
        cVar.a(a0.class, eVar);
        cVar.a(o.class, eVar);
        h hVar = h.f15006a;
        cVar.a(d0.class, hVar);
        cVar.a(r.class, hVar);
        g gVar = g.f15004a;
        cVar.a(c0.class, gVar);
        cVar.a(q.class, gVar);
        k kVar = k.f15025a;
        cVar.a(i0.class, kVar);
        cVar.a(v.class, kVar);
        l9.f fVar = l9.f.f15001a;
        cVar.a(b0.class, fVar);
        cVar.a(p.class, fVar);
        cVar.f27374d = true;
        this.f14220a = new j(5, cVar);
        this.f14222c = context;
        this.f14221b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f14223d = b(a.f14211c);
        this.f14224e = aVar2;
        this.f14225f = aVar;
        this.f14226g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(c7.a.p("Invalid url: ", str), e4);
        }
    }

    public final m9.h a(m9.h hVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f14221b.getActiveNetworkInfo();
        al.c cVarC = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map = (HashMap) cVarC.f825g;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("sdk-version", String.valueOf(i10));
        cVarC.b("model", Build.MODEL);
        cVarC.b("hardware", Build.HARDWARE);
        cVarC.b("device", Build.DEVICE);
        cVarC.b("product", Build.PRODUCT);
        cVarC.b("os-uild", Build.ID);
        cVarC.b("manufacturer", Build.MANUFACTURER);
        cVarC.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map2 = (HashMap) cVarC.f825g;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("tz-offset", String.valueOf(offset));
        int value = activeNetworkInfo == null ? h0.NONE.getValue() : activeNetworkInfo.getType();
        HashMap map3 = (HashMap) cVarC.f825g;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("net-type", String.valueOf(value));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            subtype = g0.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = g0.COMBINED.getValue();
            } else if (g0.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = (HashMap) cVarC.f825g;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        cVarC.b("country", Locale.getDefault().getCountry());
        cVarC.b("locale", Locale.getDefault().getLanguage());
        Context context = this.f14222c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        cVarC.b("mcc_mnc", simOperator);
        try {
            i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            kc.f.t("CctTransportBackend", "Unable to find version code for package", e4);
        }
        cVarC.b("application_build", Integer.toString(i11));
        return cVarC.e();
    }
}
