package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    static String f13341c = "UserAgentProvider";

    /* renamed from: a, reason: collision with root package name */
    String f13342a;

    /* renamed from: b, reason: collision with root package name */
    String f13343b = "";

    public interface a {
        void a(String str);
    }

    public e(final Context context) {
        this.f13342a = "";
        try {
            a(context, new a() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.l
                @Override // com.mbridge.msdk.config.component.info.provider.subprovider.e.a
                public final void a(String str) {
                    this.f13354a.a(context, str);
                }
            });
        } catch (Throwable th) {
            q0.b(f13341c, th.getMessage(), th);
            if (TextUtils.isEmpty(this.f13342a)) {
                this.f13342a = b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, String str) {
        if (!TextUtils.isEmpty(str) || MBridgeConstans.DNT_GUA_ON_UI) {
            this.f13342a = str;
        } else {
            a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context, a aVar) {
        String defaultUserAgent;
        try {
            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th) {
            q0.b(f13341c, th.getMessage(), th);
            defaultUserAgent = "";
        }
        if (!TextUtils.isEmpty(defaultUserAgent)) {
            a(defaultUserAgent);
        }
        if (aVar != null) {
            aVar.a(defaultUserAgent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        a(this.f13342a);
    }

    public String c() {
        return (TextUtils.isEmpty(this.f13342a) && TextUtils.isEmpty(this.f13343b)) ? b() : TextUtils.isEmpty(this.f13342a) ? TextUtils.isEmpty(this.f13343b) ? "" : this.f13343b : this.f13342a;
    }

    private void a(final Context context, final a aVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f13350a.a();
            }
        });
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f13351a.b(context, aVar);
            }
        });
    }

    private void a(final Context context) {
        if (TextUtils.isEmpty(this.f13342a)) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13348a.b(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            this.f13342a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            q0.b(f13341c, th.getMessage(), th);
        }
        if (TextUtils.isEmpty(this.f13342a)) {
            this.f13342a = b();
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13347a.d();
                }
            });
        }
    }

    private void a(String str) {
        Context contextD;
        if (TextUtils.isEmpty(str) || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("userAgent", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        this.f13343b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("userAgent", b());
    }

    private String b() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Mozilla/5.0 (Linux; Android ");
            sb.append(str);
            sb.append("; ");
            sb.append(str2);
            sb.append(" Build/");
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            sb.append(str3);
            sb.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
            return sb.toString();
        }
        return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }
}
