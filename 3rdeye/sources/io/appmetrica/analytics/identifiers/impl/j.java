package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes3.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f f39062a;

    public j(f fVar) {
        this.f39062a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final c a(Context context) {
        c cVar;
        f fVar;
        try {
            try {
                try {
                    m mVar = (m) ((o) this.f39062a.a(context));
                    cVar = new c(IdentifierStatus.OK, new a("huawei", mVar.a(), Boolean.valueOf(mVar.b())), null, 4);
                    fVar = this.f39062a;
                } finally {
                    fVar.b(context);
                }
            } catch (g e4) {
                String message = e4.getMessage();
                if (message == null) {
                    message = "unknown exception during binding huawei services";
                }
                cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                fVar = this.f39062a;
            }
            fVar.b(context);
            return cVar;
        } catch (Throwable th) {
            try {
                this.f39062a.b(context);
            } catch (Throwable unused) {
            }
        }
    }

    public j() {
        this(new f(k.f39063a, i.f39061a, "huawei"));
    }
}
