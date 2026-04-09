package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static String f13041e = "mtg_retry_report=1";

    /* renamed from: f, reason: collision with root package name */
    public static int f13042f = 10000;

    /* renamed from: g, reason: collision with root package name */
    public static int f13043g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static int f13044h = 50;

    /* renamed from: i, reason: collision with root package name */
    public static int f13045i = 600000;

    /* renamed from: j, reason: collision with root package name */
    private static int f13046j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static int f13047k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f13048l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f13049m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static int f13050n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static int f13051o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static int f13052p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static int f13053q = 5;

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> f13054a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.click.retry.c f13055b;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f13056c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f13057d;

    /* renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    public class C0239a extends BroadcastReceiver {
        public C0239a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f13057d.sendEmptyMessage(2);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static a f13059a = new a(null);
    }

    public static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.f13060k);
                }
            }
        }
    }

    public /* synthetic */ a(C0239a c0239a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.f13055b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.f13061l);
            }
        }
    }

    private a() {
        this.f13054a = new ConcurrentHashMap<>();
        this.f13055b = new com.mbridge.msdk.click.retry.c(f13044h);
        this.f13057d = new c(Looper.getMainLooper());
        g gVarB = h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        f13043g = gVarB.h0();
        f13042f = gVarB.j0() * 1000;
        f13045i = gVarB.k0() * 1000;
        f13046j = gVarB.g0();
        f13047k = gVarB.i0();
        a();
    }

    public static a b() {
        return b.f13059a;
    }

    private boolean b(int i10) {
        return i10 == f13049m || i10 == f13050n;
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z10, boolean z11, int i10) {
        if (!c(i10) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f13041e, "").replace("&" + f13041e, "");
        if (this.f13054a == null) {
            this.f13054a = new ConcurrentHashMap<>();
        }
        com.mbridge.msdk.click.retry.b bVarRemove = this.f13054a.remove(strReplace);
        if (bVarRemove == null) {
            bVarRemove = new com.mbridge.msdk.click.retry.b(str, str2);
            bVarRemove.b(i10);
            bVarRemove.a(z10);
            bVarRemove.b(z11);
            bVarRemove.a(campaignEx);
            bVarRemove.b(str3);
        } else if (bVarRemove.d() != com.mbridge.msdk.click.retry.b.f13061l) {
            bVarRemove.a(str2);
        }
        if ((!a(i10) || f13046j == 0) && ((!b(i10) || f13047k == 0) && i10 != f13053q)) {
            a(bVarRemove);
            return;
        }
        if (System.currentTimeMillis() < bVarRemove.c() + f13045i) {
            a(strReplace, bVarRemove);
            if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f13060k) {
                if (bVarRemove.e() <= f13043g) {
                    a(strReplace);
                    return;
                } else {
                    a(bVarRemove);
                    return;
                }
            }
            return;
        }
        if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f13060k) {
            a(bVarRemove);
        }
    }

    private boolean c(int i10) {
        return a(i10) || b(i10) || i10 == f13053q;
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExA = bVar.a();
            if (campaignExA != null) {
                String requestId = campaignExA.getRequestId();
                requestIdNotice = campaignExA.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.n().d(), bVar.b().toString(), bVar.g(), str, requestIdNotice, bVar.h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i10) throws JSONException {
        f.a().a(context, str, str2, str3, str4, i10);
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        if (this.f13055b == null) {
            this.f13055b = new com.mbridge.msdk.click.retry.c(f13044h);
        }
        this.f13055b.a(str, bVar);
    }

    private void a(String str) {
        Message messageObtainMessage = this.f13057d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f13057d.sendMessageDelayed(messageObtainMessage, f13042f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String str2;
        com.mbridge.msdk.click.retry.c cVar = this.f13055b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b bVarA = cVar.a(str);
            this.f13055b.b(str);
            if (bVarA == null) {
                com.mbridge.msdk.click.retry.b bVar = this.f13054a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + f13045i || bVar.e() >= f13043g || i10 == com.mbridge.msdk.click.retry.b.f13061l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= bVarA.c() + f13045i) {
                bVarA.a(i10);
                this.f13054a.put(str, bVarA);
                if (c1.c(str) == 0) {
                    str2 = str + "?" + f13041e;
                } else {
                    str2 = str + "&" + f13041e;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), bVarA.a(), bVarA.f(), str2, bVarA.i(), bVarA.j(), bVarA.h());
                return;
            }
            if (i10 != com.mbridge.msdk.click.retry.b.f13061l) {
                a(bVarA);
            }
        }
    }

    private void a() {
        try {
            if (this.f13056c == null) {
                this.f13056c = new C0239a();
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.registerReceiver(this.f13056c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean a(int i10) {
        return i10 == f13052p || i10 == f13051o;
    }
}
