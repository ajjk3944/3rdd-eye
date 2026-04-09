package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4615fg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f40858a;

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f40859b;

    public RunnableC4615fg(File file, C5117z6 c5117z6) {
        this.f40858a = file;
        this.f40859b = c5117z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (!this.f40858a.exists() || !this.f40858a.isDirectory() || (fileArrListFiles = this.f40858a.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                this.f40859b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
