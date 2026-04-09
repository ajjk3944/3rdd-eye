package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1502lw {

    /* renamed from: a, reason: collision with root package name */
    public final String f15488a;

    /* renamed from: c, reason: collision with root package name */
    public long f15490c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f15491d = 1;

    /* renamed from: b, reason: collision with root package name */
    public C2203yw f15489b = new C2203yw(null);

    public AbstractC1502lw(String str) {
        this.f15488a = str;
    }

    public void a() {
    }

    public void b() {
        this.f15489b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.f15489b.get();
    }

    public void d(Rv rv, C0969c3 c0969c3) {
        e(rv, c0969c3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.ads.Rv r11, com.google.android.gms.internal.ads.C0969c3 r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1502lw.e(com.google.android.gms.internal.ads.Rv, com.google.android.gms.internal.ads.c3, org.json.JSONObject):void");
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC1718pw.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C1994v2.f17210g.D(c(), "setLastActivity", jSONObject);
    }
}
