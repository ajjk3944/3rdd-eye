package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    final String f35924a;

    /* renamed from: b, reason: collision with root package name */
    final String f35925b;

    /* renamed from: c, reason: collision with root package name */
    final String f35926c;

    /* renamed from: d, reason: collision with root package name */
    final long f35927d;

    /* renamed from: e, reason: collision with root package name */
    final long f35928e;

    /* renamed from: f, reason: collision with root package name */
    final K f35929f;

    I(C4976v3 c4976v3, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        K k10;
        AbstractC7901p.f(str2);
        AbstractC7901p.f(str3);
        this.f35924a = str2;
        this.f35925b = str3;
        this.f35926c = TextUtils.isEmpty(str) ? null : str;
        this.f35927d = j10;
        this.f35928e = j11;
        if (j11 != 0 && j11 > j10) {
            c4976v3.zzj().H().b("Event created with reverse previous/current timestamps. appId", L2.r(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            k10 = new K(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c4976v3.zzj().C().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objO0 = c4976v3.K().o0(next, bundle2.get(next));
                    if (objO0 == null) {
                        c4976v3.zzj().H().b("Param value can't be null", c4976v3.A().f(next));
                        it.remove();
                    } else {
                        c4976v3.K().K(bundle2, next, objO0);
                    }
                }
            }
            k10 = new K(bundle2);
        }
        this.f35929f = k10;
    }

    final I a(C4976v3 c4976v3, long j10) {
        return new I(c4976v3, this.f35926c, this.f35924a, this.f35925b, this.f35927d, j10, this.f35929f);
    }

    public final String toString() {
        return "Event{appId='" + this.f35924a + "', name='" + this.f35925b + "', params=" + String.valueOf(this.f35929f) + "}";
    }

    private I(C4976v3 c4976v3, String str, String str2, String str3, long j10, long j11, K k10) {
        AbstractC7901p.f(str2);
        AbstractC7901p.f(str3);
        AbstractC7901p.l(k10);
        this.f35924a = str2;
        this.f35925b = str3;
        this.f35926c = TextUtils.isEmpty(str) ? null : str;
        this.f35927d = j10;
        this.f35928e = j11;
        if (j11 != 0 && j11 > j10) {
            c4976v3.zzj().H().c("Event created with reverse previous/current timestamps. appId, name", L2.r(str2), L2.r(str3));
        }
        this.f35929f = k10;
    }
}
