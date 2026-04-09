package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rs extends rt {

    /* renamed from: e, reason: collision with root package name */
    public final Map f15742e;

    /* renamed from: f, reason: collision with root package name */
    public final Activity f15743f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15744h;

    /* renamed from: i, reason: collision with root package name */
    public final long f15745i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f15746k;

    public rs(qz qzVar, Map map) throws NumberFormatException {
        long j;
        super(7, qzVar, "createCalendarEvent");
        this.f15742e = map;
        this.f15743f = qzVar.A1();
        this.g = C("description");
        this.j = C("summary");
        String str = (String) map.get("start_ticks");
        long j8 = -1;
        if (str == null) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        this.f15744h = j;
        String str2 = (String) this.f15742e.get("end_ticks");
        if (str2 != null) {
            try {
                j8 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f15745i = j8;
        this.f15746k = C("location");
    }

    public final String C(String str) {
        Map map = this.f15742e;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
