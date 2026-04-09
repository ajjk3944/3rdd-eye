package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Zv extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f12981a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12982b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f12983c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f12984d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f12985e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f12986f;

    /* renamed from: g, reason: collision with root package name */
    public final C1340iw f12987g;

    public Zv(Handler handler, Context context, C1340iw c1340iw) {
        super(handler);
        this.f12984d = new AtomicReference(Float.valueOf(-1.0f));
        this.f12985e = new AtomicBoolean(false);
        this.f12986f = Executors.newSingleThreadExecutor();
        this.f12981a = handler;
        this.f12982b = context;
        this.f12983c = (AudioManager) context.getSystemService("audio");
        this.f12987g = c1340iw;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        if (this.f12985e.getAndSet(true)) {
            return;
        }
        this.f12986f.submit(new Fu(1, this));
    }
}
