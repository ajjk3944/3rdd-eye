package v3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
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
import v3.d;
import w3.g;
import w3.h;
import w3.i;
import w3.j;
import x3.i;
import y3.k;

/* loaded from: classes2.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final DataEncoder f24715a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f24716b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f24717c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f24718d;

    /* renamed from: e, reason: collision with root package name */
    public final h4.a f24719e;

    /* renamed from: f, reason: collision with root package name */
    public final h4.a f24720f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24721g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f24722a;

        /* renamed from: b, reason: collision with root package name */
        public final g f24723b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24724c;

        public a(URL url, g gVar, String str) {
            this.f24722a = url;
            this.f24723b = gVar;
            this.f24724c = str;
        }

        public a a(URL url) {
            return new a(url, this.f24723b, this.f24724c);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f24725a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f24726b;

        /* renamed from: c, reason: collision with root package name */
        public final long f24727c;

        public b(int i10, URL url, long j10) {
            this.f24725a = i10;
            this.f24726b = url;
            this.f24727c = j10;
        }
    }

    public d(Context context, h4.a aVar, h4.a aVar2, int i10) {
        this.f24715a = g.b();
        this.f24717c = context;
        this.f24716b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f24718d = m(v3.a.f24706c);
        this.f24719e = aVar2;
        this.f24720f = aVar;
        this.f24721g = i10;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f24726b;
        if (url == null) {
            return null;
        }
        b4.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f24726b);
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.d();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.d();
        }
        if (NetworkConnectionInfo.MobileSubtype.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.d() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            b4.a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // y3.k
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f24716b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f24717c).getSimOperator()).c("application_build", Integer.toString(h(this.f24717c))).d();
    }

    @Override // y3.k
    public BackendResponse b(y3.e eVar) {
        g gVarI = i(eVar);
        URL urlM = this.f24718d;
        if (eVar.c() != null) {
            try {
                v3.a aVarC = v3.a.c(eVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlM = m(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.a();
            }
        }
        try {
            b bVar = (b) c4.b.a(5, new a(urlM, gVarI, strD), new c4.a() { // from class: v3.b
                @Override // c4.a
                public final Object apply(Object obj) {
                    return this.f24714a.e((d.a) obj);
                }
            }, new c4.c() { // from class: v3.c
                @Override // c4.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f24725a;
            if (i10 == 200) {
                return BackendResponse.e(bVar.f24727c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? BackendResponse.d() : BackendResponse.a();
            }
            return BackendResponse.f();
        } catch (IOException e10) {
            b4.a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return BackendResponse.f();
        }
    }

    public final b e(a aVar) throws IOException {
        b4.a.f("CctTransportBackend", "Making request to: %s", aVar.f24722a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f24722a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f24721g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f24724c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f24715a.encode(aVar.f24723b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    b4.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    b4.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(CommonGatewayClient.HEADER_CONTENT_TYPE));
                    b4.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, j.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e10) {
            e = e10;
            b4.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            b4.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            b4.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            b4.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final g i(y3.e eVar) {
        h.a aVarJ;
        HashMap map = new HashMap();
        for (i iVar : eVar.b()) {
            String strJ = iVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            i.a aVarB = w3.i.a().f(QosTier.DEFAULT).g(this.f24720f.a()).h(this.f24719e.a()).b(ClientInfo.a().c(ClientInfo.ClientType.ANDROID_FIREBASE).b(w3.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b(AppLovinEventTypes.USER_VIEWED_PRODUCT)).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (x3.i iVar3 : (List) entry.getValue()) {
                x3.h hVarE = iVar3.e();
                u3.b bVarB = hVarE.b();
                if (bVarB.equals(u3.b.b("proto"))) {
                    aVarJ = h.j(hVarE.a());
                } else if (bVarB.equals(u3.b.b("json"))) {
                    aVarJ = h.i(new String(hVarE.a(), Charset.forName(C.UTF8_NAME)));
                } else {
                    b4.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarJ.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(NetworkConnectionInfo.a().c(NetworkConnectionInfo.NetworkType.a(iVar3.g("net-type"))).b(NetworkConnectionInfo.MobileSubtype.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarJ.b(iVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return g.a(arrayList2);
    }

    public d(Context context, h4.a aVar, h4.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
