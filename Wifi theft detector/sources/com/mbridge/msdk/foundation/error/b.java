package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f14968a;

    /* renamed from: b, reason: collision with root package name */
    private int f14969b;

    /* renamed from: c, reason: collision with root package name */
    private String f14970c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f14971d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f14972e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f14973f;

    /* renamed from: g, reason: collision with root package name */
    private String f14974g;

    /* renamed from: h, reason: collision with root package name */
    private String f14975h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14976i;

    /* renamed from: j, reason: collision with root package name */
    private int f14977j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f14978k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f14979l;

    /* renamed from: m, reason: collision with root package name */
    private int f14980m;

    /* renamed from: n, reason: collision with root package name */
    private String f14981n;

    /* renamed from: o, reason: collision with root package name */
    private String f14982o;

    /* renamed from: p, reason: collision with root package name */
    private String f14983p;

    public b(int i10) {
        this.f14968a = i10;
        this.f14969b = a.b(i10);
    }

    public void a(Throwable th) {
        this.f14971d = th;
    }

    public void b(String str) {
        this.f14975h = str;
    }

    public void c(String str) {
        this.f14970c = str;
    }

    public CampaignEx d() {
        return this.f14972e;
    }

    public int g() {
        return this.f14968a;
    }

    public int h() {
        return this.f14969b;
    }

    public String i() {
        return this.f14983p;
    }

    public MBridgeIds j() {
        if (this.f14973f == null) {
            this.f14973f = new MBridgeIds();
        }
        return this.f14973f;
    }

    public String k() {
        return this.f14975h;
    }

    public String l() {
        int i10;
        String strA = !TextUtils.isEmpty(this.f14970c) ? this.f14970c : "";
        if (TextUtils.isEmpty(strA) && (i10 = this.f14968a) != -1) {
            strA = a.a(i10);
        }
        Throwable th = this.f14971d;
        if (th == null) {
            return strA;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return strA;
        }
        return strA + " # " + message;
    }

    public String m() {
        return this.f14978k;
    }

    public int n() {
        return this.f14977j;
    }

    public String toString() {
        return "MBFailureReason{errorCode=" + this.f14968a + ", errorSubType=" + this.f14969b + ", message='" + this.f14970c + "', cause=" + this.f14971d + ", campaign=" + this.f14972e + ", ids=" + this.f14973f + ", requestId='" + this.f14974g + "', localRequestId='" + this.f14975h + "', isHeaderBidding=" + this.f14976i + ", typeD=" + this.f14977j + ", reasonD='" + this.f14978k + "', extraMap=" + this.f14979l + ", serverErrorCode=" + this.f14980m + ", errorUrl='" + this.f14981n + "', serverErrorResponse='" + this.f14982o + "'}";
    }

    public void a(CampaignEx campaignEx) {
        this.f14972e = campaignEx;
    }

    public void d(String str) {
        this.f14978k = str;
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f14973f = mBridgeIds;
    }

    public void a(boolean z10) {
        this.f14976i = z10;
    }

    public b(int i10, String str) {
        this.f14968a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f14970c = str;
        this.f14969b = a.b(i10);
    }

    public void a(Object obj, Object obj2) {
        if (this.f14979l == null) {
            this.f14979l = new HashMap<>();
        }
        this.f14979l.put(obj, obj2);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.f14979l;
        if (map != null && map.containsKey(obj)) {
            return this.f14979l.get(obj);
        }
        return null;
    }

    public void a(int i10) {
        this.f14977j = i10;
    }

    public void a(String str) {
        this.f14983p = str;
    }
}
