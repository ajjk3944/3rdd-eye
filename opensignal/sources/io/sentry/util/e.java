package io.sentry.util;

import io.sentry.q;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public final d f12806b;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f12805a = null;

    /* renamed from: c, reason: collision with root package name */
    public final a f12807c = new a();

    public e(d dVar) {
        this.f12806b = dVar;
    }

    public final Object a() {
        if (this.f12805a == null) {
            q qVarA = this.f12807c.a();
            try {
                if (this.f12805a == null) {
                    this.f12805a = this.f12806b.e();
                }
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this.f12805a;
    }

    public final void b(Object obj) {
        q qVarA = this.f12807c.a();
        try {
            this.f12805a = obj;
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
