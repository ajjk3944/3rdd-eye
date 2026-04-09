package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Process;

/* renamed from: com.google.android.gms.internal.ads.wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2080wh extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17463a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2080wh(ThreadFactoryC2134xh threadFactoryC2134xh, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.f17464b = runnable2;
        this.f17465c = threadFactoryC2134xh;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f17463a) {
            case 0:
                Process.setThreadPriority(((ThreadFactoryC2134xh) this.f17465c).f17617b);
                ((Runnable) this.f17464b).run();
                break;
            default:
                new u2.n((Context) this.f17464b, null).a(null, (String) this.f17465c);
                break;
        }
    }

    public C2080wh(u2.f fVar, Context context, String str) {
        this.f17464b = context;
        this.f17465c = str;
    }
}
