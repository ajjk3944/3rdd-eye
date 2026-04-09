package com.amazonaws.logging;

import com.amazonaws.logging.LogFactory;
import java.io.PrintStream;

/* loaded from: classes.dex */
public final class ConsoleLog implements Log {

    /* renamed from: a, reason: collision with root package name */
    private final String f34067a;

    /* renamed from: b, reason: collision with root package name */
    private LogFactory.Level f34068b = null;

    public ConsoleLog(String str) {
        this.f34067a = str;
    }

    private LogFactory.Level f() {
        LogFactory.Level level = this.f34068b;
        return level != null ? level : LogFactory.a();
    }

    private void j(LogFactory.Level level, Object obj, Throwable th2) {
        PrintStream printStream = System.out;
        printStream.printf("%s/%s: %s\n", this.f34067a, level.name(), obj);
        if (th2 != null) {
            printStream.println(th2.toString());
        }
    }

    @Override // com.amazonaws.logging.Log
    public void a(Object obj) {
        if (isDebugEnabled()) {
            j(LogFactory.Level.DEBUG, obj, null);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void b(Object obj) {
        if (h()) {
            j(LogFactory.Level.INFO, obj, null);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void c(Object obj, Throwable th2) {
        if (i()) {
            j(LogFactory.Level.WARN, obj, th2);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void d(Object obj, Throwable th2) {
        if (g()) {
            j(LogFactory.Level.ERROR, obj, th2);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void e(Object obj) {
        if (i()) {
            j(LogFactory.Level.WARN, obj, null);
        }
    }

    public boolean g() {
        return f() == null || f().getValue() <= LogFactory.Level.ERROR.getValue();
    }

    public boolean h() {
        return f() == null || f().getValue() <= LogFactory.Level.INFO.getValue();
    }

    public boolean i() {
        return f() == null || f().getValue() <= LogFactory.Level.WARN.getValue();
    }

    @Override // com.amazonaws.logging.Log
    public boolean isDebugEnabled() {
        return f() == null || f().getValue() <= LogFactory.Level.DEBUG.getValue();
    }
}
