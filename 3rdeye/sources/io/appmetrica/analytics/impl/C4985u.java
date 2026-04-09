package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4985u implements InterfaceC5010v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41701a;

    public C4985u(Context context) {
        this.f41701a = context;
    }

    public final String a() {
        C5065x4 c5065x4L = C5065x4.l();
        Context context = this.f41701a;
        C4609fa c4609fa = c5065x4L.f42030t;
        if (c4609fa == null) {
            synchronized (c5065x4L) {
                try {
                    c4609fa = c5065x4L.f42030t;
                    if (c4609fa == null) {
                        c4609fa = new C4609fa(context);
                        c5065x4L.f42030t = c4609fa;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = c4609fa.f40850d.getApplicationMetaData(c4609fa.f40847a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
