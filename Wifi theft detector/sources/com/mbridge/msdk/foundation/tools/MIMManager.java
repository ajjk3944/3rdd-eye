package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class MIMManager {

    /* renamed from: i, reason: collision with root package name */
    private static volatile String f15350i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f15351a;

    /* renamed from: b, reason: collision with root package name */
    private int f15352b;

    /* renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f15353c;

    /* renamed from: d, reason: collision with root package name */
    private Context f15354d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f15355e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f15356f;

    /* renamed from: g, reason: collision with root package name */
    private volatile g f15357g;

    /* renamed from: h, reason: collision with root package name */
    private volatile MiOverseaMiniCardBroadcasterReceiver f15358h;

    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                int intExtra = intent.getIntExtra("errorCode", 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                q0.b("MIMManager", stringExtra + " " + intExtra + " " + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("key", URLEncoder.encode("m_mini_card", "utf-8"));
                        CampaignEx campaignExA = MIMManager.b().a(stringExtra);
                        if (campaignExA != null) {
                            eVar.a("rid", campaignExA.getRequestId());
                            eVar.a("rid_n", campaignExA.getRequestIdNotice());
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExA.getCampaignUnitId());
                            eVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.f14694r.get(campaignExA.getCampaignUnitId()));
                            cVar.a(campaignExA);
                        }
                        eVar.a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        eVar.a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            eVar.a("reasonCode", String.valueOf(intExtra2));
                        }
                        cVar.a("m_mini_card", eVar);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mini_card", cVar);
                    } catch (Exception e10) {
                        q0.b("MIMManager", e10.getMessage());
                    }
                }
            }
        }
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f15359a;

        public a(Context context) {
            this.f15359a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MIMManager.this.f15351a.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f15355e = mIMManager.a();
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                }
                if (MIMManager.this.f15355e == null || !MIMManager.this.f15355e.booleanValue() || this.f15359a == null) {
                    return;
                }
                try {
                    MIMManager.this.f15357g = new g(null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                    this.f15359a.registerReceiver(MIMManager.this.f15357g, intentFilter);
                } catch (Exception e11) {
                    q0.a("MIMManager", e11.getMessage());
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f15361a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15362b;

        public b(Context context, CampaignEx campaignEx) {
            this.f15361a = context;
            this.f15362b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.e(this.f15361a, this.f15362b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f15364a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15365b;

        public c(Context context, CampaignEx campaignEx) {
            this.f15364a = context;
            this.f15365b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.d(this.f15364a, this.f15365b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f15367a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15368b;

        public d(Context context, CampaignEx campaignEx) {
            this.f15367a = context;
            this.f15368b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    MIMManager.this.f(this.f15367a, this.f15368b);
                } catch (Exception e10) {
                    q0.b("MIMManager", e10.getMessage());
                    if (MIMManager.this.f15353c != null && MIMManager.this.f15353c.contains(this.f15368b)) {
                    }
                }
                if (MIMManager.this.f15353c != null && MIMManager.this.f15353c.contains(this.f15368b)) {
                    MIMManager.this.f15353c.remove(this.f15368b);
                }
            } catch (Throwable th) {
                if (MIMManager.this.f15353c != null && MIMManager.this.f15353c.contains(this.f15368b)) {
                    MIMManager.this.f15353c.remove(this.f15368b);
                }
                throw th;
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f15370a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15371b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15372c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15373d;

        public e(Context context, String str, CampaignEx campaignEx, int i10) {
            this.f15370a = context;
            this.f15371b = str;
            this.f15372c = campaignEx;
            this.f15373d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f15370a == null || TextUtils.isEmpty(this.f15371b) || this.f15372c == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000100");
                jSONObject.put("network_type", m0.s(this.f15370a));
                jSONObject.put("rid", this.f15372c.getRequestId());
                jSONObject.put("rid_n", this.f15372c.getRequestIdNotice());
                if (!TextUtils.isEmpty(this.f15372c.getCampaignUnitId())) {
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f15372c.getCampaignUnitId());
                    String str = com.mbridge.msdk.foundation.controller.a.f14694r.get(this.f15372c.getCampaignUnitId());
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                jSONObject.put(BidResponsedEx.KEY_CID, this.f15372c.getId());
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.f15371b);
                jSONObject.put("code", this.f15373d);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th) {
                q0.b("MIMManager", th.getMessage());
            }
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private static final MIMManager f15375a = new MIMManager(null);
    }

    public static class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CampaignEx campaignExA;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN=")) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN=")) || !action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"))) {
                return;
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                int i10 = extras.getInt("statusCode", -1);
                String string = extras.getString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "");
                if (i10 != -1 && !TextUtils.isEmpty(string) && (campaignExA = MIMManager.b().a(string)) != null) {
                    MIMManager.b().a(context, campaignExA, i10);
                    MIMManager.b().a(context, "dm_page_status", i10, MIMManager.b().c());
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public /* synthetic */ MIMManager(a aVar) {
        this();
    }

    public void f() {
        this.f15352b++;
    }

    public void g() {
        int i10 = this.f15352b - 1;
        this.f15352b = i10;
        if (i10 <= 0) {
            a(this.f15354d);
        }
    }

    public void h() {
        try {
            if (this.f15358h == null) {
                this.f15358h = new MiOverseaMiniCardBroadcasterReceiver();
            }
            IntentFilter intentFilter = new IntentFilter(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.registerReceiver(this.f15358h, intentFilter);
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    public void i() {
        try {
            if (this.f15358h != null) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.unregisterReceiver(this.f15358h);
                }
                this.f15356f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f15353c;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f15353c = null;
                this.f15358h = null;
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    private MIMManager() {
        this.f15352b = 0;
        this.f15353c = new CopyOnWriteArrayList<>();
        this.f15351a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, CampaignEx campaignEx) {
        String[] strArrB;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrB = nativeVideoTracking.B()) == null) {
                    return;
                }
                int length = strArrB.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrB[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public String d() {
        try {
            return f15350i == null ? "" : String.format("[%s]", f15350i);
        } catch (Exception unused) {
            return "";
        }
    }

    public Boolean e() {
        return this.f15355e;
    }

    public static MIMManager b() {
        return f.f15375a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CampaignEx campaignEx) {
        String[] strArrZ;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrZ = nativeVideoTracking.z()) == null) {
                    return;
                }
                int length = strArrZ.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrZ[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, CampaignEx campaignEx) {
        String[] strArrA;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrA = nativeVideoTracking.A()) == null) {
                    return;
                }
                int length = strArrA.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrA[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public CampaignEx c() {
        return this.f15356f;
    }

    private Runnable c(Context context, CampaignEx campaignEx) {
        return new d(context, campaignEx);
    }

    public void b(Context context) {
        this.f15354d = context;
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context));
    }

    public void a(CampaignEx campaignEx) {
        try {
            if (this.f15355e != null && campaignEx != null && this.f15355e.booleanValue()) {
                this.f15356f = campaignEx;
                this.f15353c.add(campaignEx);
            }
            if (com.mbridge.msdk.util.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f15358h == null) {
                    h();
                }
                this.f15356f = campaignEx;
                this.f15353c.add(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
        }
    }

    public void b(CampaignEx campaignEx) {
        try {
            if (this.f15355e == null || campaignEx == null || !this.f15355e.booleanValue()) {
                return;
            }
            this.f15356f = null;
            try {
                this.f15353c.remove(campaignEx);
            } catch (Exception e10) {
                q0.a("MIMManager", e10.getMessage());
            }
        } catch (Exception e11) {
            q0.b("MIMManager", e11.getMessage());
        }
    }

    private Runnable b(Context context, CampaignEx campaignEx) {
        return new b(context, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f15356f;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f15356f;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f15353c;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            Iterator<CampaignEx> it = this.f15353c.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null && TextUtils.equals(next.getPackageName(), str)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a() {
        Cursor cursorQuery;
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        Boolean boolValueOf = null;
        if (contextD != null) {
            try {
                if (contextD.getContentResolver() != null) {
                    try {
                        cursorQuery = contextD.getContentResolver().query(Uri.parse(k0.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e10) {
                                q0.a("MIMManager", e10.getMessage());
                            }
                            try {
                                f15350i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e11) {
                                q0.a("MIMManager", e11.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e12) {
                            q0.a("MIMManager", e12.getMessage());
                        }
                    }
                }
            } catch (Exception e13) {
                q0.b("MIMManager", e13.getMessage());
            }
        }
        return boolValueOf;
    }

    public void a(Context context) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (context != null) {
            try {
                try {
                    if (this.f15357g != null) {
                        context.unregisterReceiver(this.f15357g);
                    }
                    if (this.f15358h != null) {
                        context.unregisterReceiver(this.f15358h);
                    }
                    this.f15356f = null;
                    copyOnWriteArrayList = this.f15353c;
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                    this.f15356f = null;
                    copyOnWriteArrayList = this.f15353c;
                    if (copyOnWriteArrayList != null) {
                    }
                }
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f15353c = null;
                this.f15357g = null;
                this.f15354d = null;
            } catch (Throwable th) {
                this.f15356f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f15353c;
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList2.clear();
                }
                this.f15353c = null;
                this.f15357g = null;
                this.f15354d = null;
                throw th;
            }
        }
        try {
            i();
        } catch (Throwable th2) {
            q0.b("MIMManager", th2.getMessage());
        }
    }

    public void a(Context context, CampaignEx campaignEx, int i10) {
        Runnable runnableB;
        if (i10 == 3001) {
            runnableB = b(context, campaignEx);
        } else if (i10 != 3002) {
            runnableB = i10 != 3008 ? null : c(context, campaignEx);
        } else {
            runnableB = a(context, campaignEx);
        }
        if (runnableB != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableB);
        }
    }

    private Runnable a(Context context, CampaignEx campaignEx) {
        return new c(context, campaignEx);
    }

    public void a(Context context, String str, int i10, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(context, str, campaignEx, i10));
    }
}
