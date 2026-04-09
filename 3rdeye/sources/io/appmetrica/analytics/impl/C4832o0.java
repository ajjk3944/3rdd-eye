package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4832o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Sn f41323a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f41324b;

    /* renamed from: c, reason: collision with root package name */
    public Ua f41325c;

    /* renamed from: d, reason: collision with root package name */
    public Va f41326d;

    public C4832o0() {
        this(new Sn());
    }

    public final synchronized Ua a(Context context, C4810n4 c4810n4) {
        try {
            if (this.f41325c == null) {
                if (a(context)) {
                    this.f41325c = new C4884q0();
                } else {
                    this.f41325c = new C4806n0(context, c4810n4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f41325c;
    }

    public C4832o0(Sn sn) {
        this.f41323a = sn;
    }

    public final boolean a(Context context) {
        Boolean boolValueOf = this.f41324b;
        if (boolValueOf == null) {
            synchronized (this) {
                try {
                    boolValueOf = this.f41324b;
                    if (boolValueOf == null) {
                        this.f41323a.getClass();
                        boolean zA = Sn.a(context);
                        boolValueOf = Boolean.valueOf(!zA);
                        this.f41324b = boolValueOf;
                        if (!zA) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return boolValueOf.booleanValue();
    }
}
