package com.yandex.mobile.ads.impl;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes3.dex */
public final class ld extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final ld f29972a = new ld();

    private ld() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        kotlin.jvm.internal.l.f(record, "record");
        int i = kd.f29633c;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.l.e(loggerName, "getLoggerName(...)");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i10 = iIntValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        kotlin.jvm.internal.l.e(message, "getMessage(...)");
        kd.a(loggerName, i10, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
