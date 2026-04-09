package q5;

import Ii.AbstractC3059i;
import Yg.J;
import Yg.v;
import android.net.Uri;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mh.InterfaceC6839p;
import o5.C7081b;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d implements InterfaceC7429a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f58414d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C7081b f58415a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5384i f58416b;

    /* renamed from: c, reason: collision with root package name */
    private final String f58417c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f58418a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f58420c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f58421d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f58422e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f58420c = map;
            this.f58421d = interfaceC6839p;
            this.f58422e = interfaceC6839p2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new b(this.f58420c, this.f58421d, this.f58422e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objG = AbstractC5467b.g();
            int i10 = this.f58418a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    URLConnection uRLConnectionOpenConnection = d.this.c().openConnection();
                    AbstractC6492s.g(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : this.f58420c.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        N n10 = new N();
                        while (true) {
                            String line = bufferedReader.readLine();
                            n10.f51689a = line;
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb2.toString());
                        InterfaceC6839p interfaceC6839p = this.f58421d;
                        this.f58418a = 1;
                        if (interfaceC6839p.invoke(jSONObject, this) == objG) {
                            return objG;
                        }
                    } else {
                        InterfaceC6839p interfaceC6839p2 = this.f58422e;
                        String str = "Bad response code: " + responseCode;
                        this.f58418a = 2;
                        if (interfaceC6839p2.invoke(str, this) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
            } catch (Exception e10) {
                InterfaceC6839p interfaceC6839p3 = this.f58422e;
                String message = e10.getMessage();
                if (message == null) {
                    message = e10.toString();
                }
                this.f58418a = 3;
                if (interfaceC6839p3.invoke(message, this) == objG) {
                    return objG;
                }
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public d(C7081b appInfo, InterfaceC5384i blockingDispatcher, String baseUrl) {
        AbstractC6492s.i(appInfo, "appInfo");
        AbstractC6492s.i(blockingDispatcher, "blockingDispatcher");
        AbstractC6492s.i(baseUrl, "baseUrl");
        this.f58415a = appInfo;
        this.f58416b = blockingDispatcher;
        this.f58417c = baseUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f58417c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f58415a.b()).appendPath("settings").appendQueryParameter("build_version", this.f58415a.a().a()).appendQueryParameter("display_version", this.f58415a.a().f()).build().toString());
    }

    @Override // q5.InterfaceC7429a
    public Object a(Map map, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f58416b, new b(map, interfaceC6839p, interfaceC6839p2, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    public /* synthetic */ d(C7081b c7081b, InterfaceC5384i interfaceC5384i, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7081b, interfaceC5384i, (i10 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
