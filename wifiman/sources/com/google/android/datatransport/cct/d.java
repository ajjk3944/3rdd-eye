package com.google.android.datatransport.cct;

import a3.C3754b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import b3.AbstractC4061a;
import b3.n;
import b3.o;
import b3.p;
import b3.q;
import b3.r;
import b3.s;
import b3.t;
import b3.u;
import b3.v;
import b3.w;
import b3.x;
import c3.AbstractC4208i;
import c3.C4207h;
import com.google.android.datatransport.cct.d;
import com.google.firebase.encoders.EncodingException;
import d3.AbstractC5292f;
import d3.AbstractC5293g;
import d3.InterfaceC5299m;
import g3.AbstractC5861a;
import h3.InterfaceC5947a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import m3.InterfaceC6756a;

/* loaded from: classes.dex */
final class d implements InterfaceC5299m {

    /* renamed from: a, reason: collision with root package name */
    private final Z4.a f34679a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f34680b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f34681c;

    /* renamed from: d, reason: collision with root package name */
    final URL f34682d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6756a f34683e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6756a f34684f;

    /* renamed from: g, reason: collision with root package name */
    private final int f34685g;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f34686a;

        /* renamed from: b, reason: collision with root package name */
        final n f34687b;

        /* renamed from: c, reason: collision with root package name */
        final String f34688c;

        a(URL url, n nVar, String str) {
            this.f34686a = url;
            this.f34687b = nVar;
            this.f34688c = str;
        }

        a a(URL url) {
            return new a(url, this.f34687b, this.f34688c);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f34689a;

        /* renamed from: b, reason: collision with root package name */
        final URL f34690b;

        /* renamed from: c, reason: collision with root package name */
        final long f34691c;

        b(int i10, URL url, long j10) {
            this.f34689a = i10;
            this.f34690b = url;
            this.f34691c = j10;
        }
    }

    d(Context context, InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2, int i10) {
        this.f34679a = n.b();
        this.f34681c = context;
        this.f34680b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f34682d = o(com.google.android.datatransport.cct.a.f34670c);
        this.f34683e = interfaceC6756a2;
        this.f34684f = interfaceC6756a;
        this.f34685g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        AbstractC5861a.e("CctTransportBackend", "Making request to: %s", aVar.f34686a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f34686a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f34685g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f34688c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f34679a.a(aVar.f34687b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC5861a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC5861a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC5861a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamN = n(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(inputStreamN))).c());
                            if (inputStreamN != null) {
                                inputStreamN.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (EncodingException e10) {
            e = e10;
            AbstractC5861a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            AbstractC5861a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            AbstractC5861a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            AbstractC5861a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.getValue();
        }
        if (w.b.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.getValue() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC5861a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private n j(AbstractC5292f abstractC5292f) {
        t.a aVarL;
        HashMap map = new HashMap();
        for (AbstractC4208i abstractC4208i : abstractC5292f.b()) {
            String strN = abstractC4208i.n();
            if (map.containsKey(strN)) {
                ((List) map.get(strN)).add(abstractC4208i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC4208i);
                map.put(strN, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            AbstractC4208i abstractC4208i2 = (AbstractC4208i) ((List) entry.getValue()).get(0);
            u.a aVarB = u.a().f(x.DEFAULT).g(this.f34684f.a()).h(this.f34683e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(AbstractC4061a.a().m(Integer.valueOf(abstractC4208i2.i("sdk-version"))).j(abstractC4208i2.b("model")).f(abstractC4208i2.b("hardware")).d(abstractC4208i2.b("device")).l(abstractC4208i2.b("product")).k(abstractC4208i2.b("os-uild")).h(abstractC4208i2.b("manufacturer")).e(abstractC4208i2.b("fingerprint")).c(abstractC4208i2.b("country")).g(abstractC4208i2.b("locale")).i(abstractC4208i2.b("mcc_mnc")).b(abstractC4208i2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC4208i abstractC4208i3 : (List) entry.getValue()) {
                C4207h c4207hE = abstractC4208i3.e();
                C3754b c3754bB = c4207hE.b();
                if (c3754bB.equals(C3754b.b("proto"))) {
                    aVarL = t.l(c4207hE.a());
                } else if (c3754bB.equals(C3754b.b("json"))) {
                    aVarL = t.k(new String(c4207hE.a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC5861a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c3754bB);
                }
                aVarL.d(abstractC4208i3.f()).e(abstractC4208i3.o()).j(abstractC4208i3.j("tz-offset")).g(w.a().c(w.c.forNumber(abstractC4208i3.i("net-type"))).b(w.b.forNumber(abstractC4208i3.i("mobile-subtype"))).a());
                if (abstractC4208i3.d() != null) {
                    aVarL.c(abstractC4208i3.d());
                }
                if (abstractC4208i3.l() != null) {
                    aVarL.b(p.a().b(s.a().b(r.a().b(abstractC4208i3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (abstractC4208i3.g() != null || abstractC4208i3.h() != null) {
                    q.a aVarA = q.a();
                    if (abstractC4208i3.g() != null) {
                        aVarA.b(abstractC4208i3.g());
                    }
                    if (abstractC4208i3.h() != null) {
                        aVarA.c(abstractC4208i3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a m(a aVar, b bVar) {
        URL url = bVar.f34690b;
        if (url == null) {
            return null;
        }
        AbstractC5861a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f34690b);
    }

    private static InputStream n(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // d3.InterfaceC5299m
    public AbstractC5293g a(AbstractC5292f abstractC5292f) {
        n nVarJ = j(abstractC5292f);
        URL urlO = this.f34682d;
        if (abstractC5292f.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(abstractC5292f.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlO = o(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC5293g.a();
            }
        }
        try {
            b bVar = (b) h3.b.a(5, new a(urlO, nVarJ, strD), new InterfaceC5947a() { // from class: com.google.android.datatransport.cct.b
                @Override // h3.InterfaceC5947a
                public final Object apply(Object obj) {
                    return this.f34678a.e((d.a) obj);
                }
            }, new h3.c() { // from class: com.google.android.datatransport.cct.c
                @Override // h3.c
                public final Object a(Object obj, Object obj2) {
                    return d.m((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f34689a;
            if (i10 == 200) {
                return AbstractC5293g.e(bVar.f34691c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? AbstractC5293g.d() : AbstractC5293g.a();
            }
            return AbstractC5293g.f();
        } catch (IOException e10) {
            AbstractC5861a.c("CctTransportBackend", "Could not make request to the backend", e10);
            return AbstractC5293g.f();
        }
    }

    @Override // d3.InterfaceC5299m
    public AbstractC4208i b(AbstractC4208i abstractC4208i) {
        NetworkInfo activeNetworkInfo = this.f34680b.getActiveNetworkInfo();
        return abstractC4208i.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f34681c)).c("application_build", Integer.toString(i(this.f34681c))).d();
    }

    d(Context context, InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2) {
        this(context, interfaceC6756a, interfaceC6756a2, 130000);
    }
}
