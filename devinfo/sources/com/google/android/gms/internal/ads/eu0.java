package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class eu0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10865a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10866b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f10867c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f10868d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10869e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f10870f;
    public final nu0 g;

    public eu0(Handler handler, Context context, nu0 nu0Var) {
        super(handler);
        this.f10868d = new AtomicReference(Float.valueOf(-1.0f));
        this.f10869e = new AtomicBoolean(false);
        this.f10870f = Executors.newSingleThreadExecutor();
        this.f10865a = handler;
        this.f10866b = context;
        this.f10867c = (AudioManager) context.getSystemService("audio");
        this.g = nu0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        if (this.f10869e.getAndSet(true)) {
            return;
        }
        this.f10870f.submit(new du0(0, this));
    }
}
