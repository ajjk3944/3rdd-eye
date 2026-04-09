package Y2;

import A2.C0117e;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.BinderC0718Rp;
import com.google.android.gms.internal.ads.C0784Vn;
import com.google.android.gms.internal.ads.C1056dh;
import com.google.android.gms.internal.ads.C1068du;
import com.google.android.gms.internal.ads.C2000v8;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.InterfaceC0828Yg;
import com.google.android.gms.internal.ads.InterfaceC1682pD;
import com.google.android.gms.internal.ads.W9;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;
import o.m1;
import u2.C2951a;

/* renamed from: Y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200b implements O0.a, B, InterfaceC1682pD {

    /* renamed from: j, reason: collision with root package name */
    public static C0200b f4301j;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4302a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4303b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4304c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4305d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4306e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4307f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4308g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4309h;
    public final Object i;

    public C0200b(Application application) {
        this.f4302a = 0;
        this.f4303b = this;
        A0.e eVar = new A0.e(20, application);
        this.f4304c = eVar;
        int i = 18;
        M mB = M.b(new A0.e(i, eVar));
        this.f4305d = mB;
        M mB2 = M.b(AbstractC0218u.f4373b);
        this.f4306e = mB2;
        M mB3 = M.b(new A0.e(19, new U0.j(i, this)));
        this.f4307f = mB3;
        U u6 = new U(eVar, mB, 1);
        M mB4 = M.b(new S4.r(14));
        this.f4308g = mB4;
        C0203e c0203e = new C0203e(eVar, mB, M.b(new U(eVar, M.b(new C0117e(20, eVar)), 0)));
        this.i = c0203e;
        this.f4309h = M.b(new V2.e(mB, new m1(eVar, mB2, mB, mB3, u6, new V2.e(mB4, c0203e, mB, 13), mB4, 4), mB3, 15));
    }

    public static C0200b c(Context context) {
        C0200b c0200b;
        synchronized (C0200b.class) {
            try {
                if (f4301j == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    f4301j = new C0200b(application);
                }
                c0200b = f4301j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0200b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1682pD, Y2.O
    public InterfaceFutureC2326a a() {
        W9 w9 = p2.j.f22785C.f22791d;
        Context context = (Context) this.f4303b;
        T2.d dVar = new T2.d(0, 0, 0);
        V2.h hVar = (V2.h) this.f4306e;
        A8 a8 = new A8();
        BinderC0718Rp binderC0718Rp = (BinderC0718Rp) this.f4307f;
        C1068du c1068du = (C1068du) this.f4308g;
        C0784Vn c0784Vn = (C0784Vn) this.f4309h;
        InterfaceC0828Yg interfaceC0828YgG = W9.g(context, dVar, "", false, false, (H6) this.f4304c, null, (C2951a) this.f4305d, null, hVar, a8, null, null, binderC0718Rp, c1068du, c0784Vn);
        C2000v8 c2000v8 = new C2000v8(interfaceC0828YgG);
        interfaceC0828YgG.l0().f16014g = new C1056dh(c2000v8, 0);
        interfaceC0828YgG.loadUrl((String) this.i);
        return c2000v8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    @Override // Y2.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.String r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0200b.b(java.lang.String, org.json.JSONObject):boolean");
    }

    public C0217t d(K4.c cVar) throws Q, IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f4303b));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) cVar.f2209b;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    I.d dVar = (I.d) cVar.f2212e;
                    if (dVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = dVar.f1850b;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i3 = i - 1;
                            if (i3 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i3 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) dVar.f1851c;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) dVar.f1852d;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) cVar.f2210c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) cVar.f2213f;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) cVar.f2214g;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    c1.g gVar = (c1.g) cVar.f2215h;
                    if (gVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) gVar.f5896b;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) gVar.f5897c;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d6 = (Double) gVar.f5898d;
                        if (d6 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d6);
                        }
                        List<r> list = (List) gVar.f5899e;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (r rVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = rVar.f4359a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = rVar.f4360b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = rVar.f4361c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = rVar.f4362d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    V2.e eVar = (V2.e) cVar.i;
                    if (eVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) eVar.f3868b;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) eVar.f3869c;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) eVar.f3870d;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((S4.r) cVar.f2211d) != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("3.2.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) cVar.f2216j;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((EnumC0215q) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        C0217t c0217tB = C0217t.b(new JsonReader(new StringReader(headerField)));
                        c0217tB.f4365a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return c0217tB;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            C0217t c0217tB2 = C0217t.b(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return c0217tB2;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (SocketTimeoutException e6) {
            throw new Q(4, e6, "The server timed out.");
        } catch (IOException e7) {
            throw new Q(2, e7, "Error making request.");
        }
    }

    public void e(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        B[] bArr = {this, (c1.g) this.f4308g};
        P p6 = (P) this.f4307f;
        p6.getClass();
        p6.f4278a.execute(new A2.C(queryParameter, queryParameter2, bArr, 10));
    }

    @Override // O0.a
    public View getRoot() {
        switch (this.f4302a) {
            case 1:
                return (CoordinatorLayout) this.f4303b;
            default:
                return (LinearLayout) this.f4303b;
        }
    }

    public /* synthetic */ C0200b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.f4302a = i;
        this.f4303b = obj;
        this.f4304c = obj2;
        this.f4305d = obj3;
        this.f4306e = obj4;
        this.f4307f = obj5;
        this.f4308g = obj6;
        this.f4309h = obj7;
        this.i = obj8;
    }

    @Override // Y2.B
    /* renamed from: a, reason: collision with other method in class */
    public Executor mo1a() {
        Handler handler = (Handler) this.f4305d;
        Objects.requireNonNull(handler);
        return new L2.i(handler, 2);
    }
}
