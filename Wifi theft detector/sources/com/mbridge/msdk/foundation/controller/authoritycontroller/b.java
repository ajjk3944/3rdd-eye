package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: h, reason: collision with root package name */
    private static boolean f14720h = true;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f14721i = true;

    /* renamed from: b, reason: collision with root package name */
    protected AuthorityInfoBean f14723b;

    /* renamed from: g, reason: collision with root package name */
    private e f14728g;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f14722a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private int f14724c = 3;

    /* renamed from: d, reason: collision with root package name */
    private int f14725d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f14726e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f14727f = "";

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f14729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnCompletionListener f14730b;

        public a(Context context, OnCompletionListener onCompletionListener) {
            this.f14729a = context;
            this.f14730b = onCompletionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f14729a);
            this.f14730b.onCompletion();
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b$b, reason: collision with other inner class name */
    public class C0256b implements e.a {
        public C0256b() {
        }

        @Override // com.mbridge.msdk.foundation.controller.e.a
        public void a() {
            b.this.k();
        }
    }

    public b() {
        h();
    }

    public static void b(boolean z10) {
        f14721i = z10;
    }

    public static boolean i() {
        return f14720h;
    }

    public static boolean j() {
        return f14721i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        boolean zC = this.f14728g.c();
        b(this.f14728g.b());
        d(zC ? 1 : 2);
        this.f14723b.authDeviceIdStatus(zC ? 1 : 0);
    }

    public abstract int a(g gVar, String str);

    public int c() {
        return this.f14725d;
    }

    public int d() {
        return this.f14726e;
    }

    public int e() {
        return this.f14724c;
    }

    public String f() {
        return this.f14727f;
    }

    public String g() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        g gVarC = h.b().c();
        for (int i10 = 0; i10 < this.f14722a.size(); i10++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f14722a.get(i10)));
                jSONObject.put("client_status", a(this.f14722a.get(i10)));
                jSONObject.put("server_status", a(gVarC, this.f14722a.get(i10)));
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public void h() {
        AuthorityInfoBean authorityInfoBean = new AuthorityInfoBean();
        this.f14723b = authorityInfoBean;
        try {
            authorityInfoBean.authGenDataStatus(1);
            this.f14723b.authDeviceIdStatus(1);
            this.f14723b.authSerialIdStatus(1);
            this.f14723b.authOtherDataStatus(1);
            this.f14722a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f14722a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f14722a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f14722a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
        }
    }

    private void d(int i10) {
        this.f14724c = i10 != 1 ? 2 : 1;
    }

    public boolean b() {
        int i10 = this.f14724c;
        return i10 == 1 || i10 == 3;
    }

    public void c(int i10) {
        this.f14726e = i10;
    }

    public static void a(boolean z10) {
        f14720h = z10;
    }

    public void b(int i10) {
        this.f14725d = i10;
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f14727f = str;
    }

    public AuthorityInfoBean a() {
        AuthorityInfoBean authorityInfoBean = this.f14723b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public void a(int i10) {
        this.f14724c = i10 != 1 ? 2 : 1;
        if (this.f14723b != null) {
            d(i10);
        }
    }

    public void a(Context context, OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context, onCompletionListener));
        } else {
            a(context);
        }
    }

    public int a(String str) {
        AuthorityInfoBean authorityInfoBean;
        try {
            if (TextUtils.isEmpty(str) || (authorityInfoBean = this.f14723b) == null) {
                return 0;
            }
            return authorityInfoBean.getStatusByKey(str);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
            return 0;
        }
    }

    public void a(String str, int i10) {
        if (TextUtils.isEmpty(str) || this.f14723b == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "authority_serial_id":
                this.f14723b.authSerialIdStatus(i10);
                break;
            case "authority_all_info":
                this.f14723b.a(i10);
                break;
            case "authority_device_id":
                this.f14723b.authDeviceIdStatus(i10);
                break;
            case "authority_general_data":
                this.f14723b.authGenDataStatus(i10);
                break;
            case "authority_other":
                this.f14723b.authOtherDataStatus(i10);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.f14728g == null) {
                e eVar = new e(context);
                this.f14728g = eVar;
                eVar.a(new C0256b());
            }
            k();
        } catch (Throwable th) {
            q0.b("SDKAuthorityController", th.getMessage());
        }
    }
}
