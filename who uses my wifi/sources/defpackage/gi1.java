package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.webkit.WebSettings;
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
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gi1 implements ln2, xp3 {
    public static gi1 n;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public gi1(Application application) {
        this.f = this;
        ax0 ax0Var = new ax0(application);
        this.g = ax0Var;
        ls2 ls2VarB = ls2.b(new vg0(11, ax0Var));
        this.h = ls2VarB;
        ls2 ls2VarB2 = ls2.b(ob1.k);
        this.i = ls2VarB2;
        ls2 ls2VarB3 = ls2.b(new ug0(15, new zs1(9, this)));
        this.j = ls2VarB3;
        lv2 lv2Var = new lv2(ax0Var, ls2VarB, 17);
        ls2 ls2VarB4 = ls2.b(new su2(6));
        this.k = ls2VarB4;
        xn1 xn1Var = new xn1(ax0Var, ls2VarB, ls2.b(new wt2(ax0Var, ls2.b(new f23(12, ax0Var)), 9, false)));
        this.m = xn1Var;
        xb4 xb4Var = new xb4(ls2VarB4, xn1Var, ls2VarB, 12);
        uk1 uk1Var = new uk1();
        uk1Var.f = ax0Var;
        uk1Var.g = ls2VarB2;
        uk1Var.h = ls2VarB;
        uk1Var.i = ls2VarB3;
        uk1Var.j = lv2Var;
        uk1Var.k = xb4Var;
        uk1Var.l = ls2VarB4;
        this.l = ls2.b(new pb3(ls2VarB, uk1Var, ls2VarB3, 8));
    }

    public static gi1 c(Context context) {
        gi1 gi1Var;
        synchronized (gi1.class) {
            try {
                if (n == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    n = new gi1(application);
                }
                gi1Var = n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gi1Var;
    }

    @Override // defpackage.xp3
    /* renamed from: a, reason: collision with other method in class */
    public n70 mo9a() throws hg2 {
        sd2 sd2Var = hg4.C.d;
        Context context = (Context) this.f;
        zq zqVar = new zq(0, 0, 0);
        l92 l92Var = (l92) this.i;
        cx1 cx1Var = new cx1();
        pz2 pz2Var = (pz2) this.j;
        m83 m83Var = (m83) this.k;
        mv2 mv2Var = (mv2) this.l;
        ag2 ag2VarB = sd2.b(context, zqVar, "", false, false, (vs1) this.g, null, (e51) this.h, null, l92Var, cx1Var, null, null, pz2Var, m83Var, mv2Var);
        yw1 yw1Var = new yw1(ag2VarB);
        ag2VarB.e0().l = new zs1(17, yw1Var);
        ag2VarB.loadUrl((String) this.m);
        return yw1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r5.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r5.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r5 = 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    @Override // defpackage.ln2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.String r5, org.json.JSONObject r6) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi1.b(java.lang.String, org.json.JSONObject):boolean");
    }

    public vh2 d(h2 h2Var) throws IOException, ah3 {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f));
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
                    String str = (String) h2Var.a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    so1 so1Var = (so1) h2Var.b;
                    if (so1Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = so1Var.f;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) so1Var.g;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) so1Var.h;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) h2Var.c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) h2Var.d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) h2Var.e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    p21 p21Var = (p21) h2Var.f;
                    if (p21Var != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) p21Var.f;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) p21Var.g;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = (Double) p21Var.h;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<rf2> list = (List) p21Var.i;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (rf2 rf2Var : list) {
                                jsonWriter.beginObject();
                                Integer num4 = rf2Var.a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = rf2Var.b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = rf2Var.c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = rf2Var.d;
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
                    t83 t83Var = (t83) h2Var.g;
                    if (t83Var != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) t83Var.g;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) t83Var.h;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) t83Var.i;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((qd2) h2Var.h) != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("3.2.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) h2Var.i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((qe2) it.next()).ordinal()) {
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
                        vh2 vh2VarB = vh2.b(new JsonReader(new StringReader(headerField)));
                        vh2VarB.f = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return vh2VarB;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            vh2 vh2VarB2 = vh2.b(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return vh2VarB2;
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
        } catch (SocketTimeoutException e) {
            throw new ah3(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new ah3(2, "Error making request.", e2);
        }
    }

    public void e(String str) {
        "Receive consent action: ".concat(String.valueOf(str));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        ln2[] ln2VarArr = {this, (p21) this.k};
        lx2 lx2Var = (lx2) this.j;
        lx2Var.getClass();
        lx2Var.a.execute(new gi(queryParameter, queryParameter2, ln2VarArr, 14));
    }

    public /* synthetic */ gi1(Context context, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f = context;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
        this.l = obj6;
        this.m = obj7;
    }

    @Override // defpackage.ln2
    public Executor a() {
        Handler handler = (Handler) this.h;
        Objects.requireNonNull(handler);
        return new vb1(handler, 2);
    }
}
