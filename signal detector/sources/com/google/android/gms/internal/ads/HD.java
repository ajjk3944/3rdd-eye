package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class HD {

    /* renamed from: a, reason: collision with root package name */
    public final C1086eB f8875a = new C1086eB();

    /* renamed from: b, reason: collision with root package name */
    public final String f8876b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f8877c;

    public HD(Class cls) {
        this.f8876b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f8877c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f8875a) {
            try {
                Logger logger2 = this.f8877c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f8876b);
                this.f8877c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
