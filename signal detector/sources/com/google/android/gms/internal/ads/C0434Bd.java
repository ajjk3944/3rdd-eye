package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434Bd extends C0697Ql {

    /* renamed from: d, reason: collision with root package name */
    public final Map f7371d;

    /* renamed from: e, reason: collision with root package name */
    public final Activity f7372e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7373f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7374g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7375h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7376j;

    public C0434Bd(InterfaceC0828Yg interfaceC0828Yg, Map map) throws NumberFormatException {
        long j6;
        super(interfaceC0828Yg, 9, "createCalendarEvent");
        this.f7371d = map;
        this.f7372e = interfaceC0828Yg.h();
        this.f7373f = E("description");
        this.i = E("summary");
        String str = (String) map.get("start_ticks");
        long j7 = -1;
        if (str == null) {
            j6 = -1;
        } else {
            try {
                j6 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        this.f7374g = j6;
        String str2 = (String) this.f7371d.get("end_ticks");
        if (str2 != null) {
            try {
                j7 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f7375h = j7;
        this.f7376j = E("location");
    }

    public final String E(String str) {
        Map map = this.f7371d;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
