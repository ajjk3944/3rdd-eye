package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class FileObserverC5067x6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f42043a;

    /* renamed from: b, reason: collision with root package name */
    public final File f42044b;

    /* renamed from: c, reason: collision with root package name */
    public final C4971ta f42045c;

    public FileObserverC5067x6(File file, C5117z6 c5117z6, C4971ta c4971ta) {
        super(file.getAbsolutePath(), 8);
        this.f42043a = c5117z6;
        this.f42044b = file;
        this.f42045c = c4971ta;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f42043a;
        C4971ta c4971ta = this.f42045c;
        File file = this.f42044b;
        c4971ta.getClass();
        consumer.consume(new File(file, str));
    }
}
