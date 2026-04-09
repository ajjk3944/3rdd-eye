package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Lk {

    /* renamed from: a, reason: collision with root package name */
    public final String f39794a;

    /* renamed from: b, reason: collision with root package name */
    public final Gk f39795b;

    /* renamed from: c, reason: collision with root package name */
    public final Kk f39796c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f39797d;

    public Lk(Context context, C4759l5 c4759l5) {
        c4759l5.a();
        this.f39794a = "session_extras";
        this.f39795b = new Gk();
        this.f39796c = new Kk();
        this.f39797d = C4916r7.a(context).a(c4759l5);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f39797d.get(this.f39794a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f39795b.toModel(this.f39796c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Gk gk = this.f39795b;
        this.f39796c.getClass();
        return gk.toModel(new Ik());
    }
}
