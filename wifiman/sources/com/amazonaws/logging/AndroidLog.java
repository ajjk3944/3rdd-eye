package com.amazonaws.logging;

import com.amazonaws.logging.LogFactory;

/* loaded from: classes.dex */
public class AndroidLog implements Log {

    /* renamed from: a, reason: collision with root package name */
    private final String f34065a;

    /* renamed from: b, reason: collision with root package name */
    private LogFactory.Level f34066b = null;

    public AndroidLog(String str) {
        this.f34065a = str;
    }

    private LogFactory.Level f() {
        LogFactory.Level level = this.f34066b;
        return level != null ? level : LogFactory.a();
    }

    @Override // com.amazonaws.logging.Log
    public void a(Object obj) {
        if (f() == null || f().getValue() <= LogFactory.Level.DEBUG.getValue()) {
            android.util.Log.d(this.f34065a, obj.toString());
        }
    }

    @Override // com.amazonaws.logging.Log
    public void b(Object obj) {
        if (f() == null || f().getValue() <= LogFactory.Level.INFO.getValue()) {
            android.util.Log.i(this.f34065a, obj.toString());
        }
    }

    @Override // com.amazonaws.logging.Log
    public void c(Object obj, Throwable th2) {
        if (f() == null || f().getValue() <= LogFactory.Level.WARN.getValue()) {
            android.util.Log.w(this.f34065a, obj.toString(), th2);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void d(Object obj, Throwable th2) {
        if (f() == null || f().getValue() <= LogFactory.Level.ERROR.getValue()) {
            android.util.Log.e(this.f34065a, obj.toString(), th2);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void e(Object obj) {
        if (f() == null || f().getValue() <= LogFactory.Level.WARN.getValue()) {
            android.util.Log.w(this.f34065a, obj.toString());
        }
    }

    @Override // com.amazonaws.logging.Log
    public boolean isDebugEnabled() {
        return android.util.Log.isLoggable(this.f34065a, 3) && (f() == null || f().getValue() <= LogFactory.Level.DEBUG.getValue());
    }
}
