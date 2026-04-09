package io.appmetrica.analytics.impl;

import android.content.Context;
import b9.C1992A;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.z6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5117z6 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f42164a;

    /* renamed from: b, reason: collision with root package name */
    public final C4616fh f42165b;

    public C5117z6(Context context, InterfaceC5042w6 interfaceC5042w6, EnumC4997ub enumC4997ub, Xk xk, Executor executor, String str) {
        this.f42164a = executor;
        this.f42165b = new C4616fh(context, interfaceC5042w6, enumC4997ub, xk);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f42164a;
        C4616fh c4616fh = this.f42165b;
        Gb gb = c4616fh.f40862c;
        Consumer consumer = c4616fh.f40864e;
        Context context = c4616fh.f40860a;
        if (C4945sa.f41632c == null) {
            synchronized (kotlin.jvm.internal.x.a(C4945sa.class)) {
                try {
                    if (C4945sa.f41632c == null) {
                        C4945sa.f41632c = new C4945sa(context);
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C4945sa c4945sa = C4945sa.f41632c;
        if (c4945sa != null) {
            executor.execute(new RunnableC4589eg(file, gb, gb, consumer, c4945sa, c4616fh.f40861b));
        } else {
            kotlin.jvm.internal.l.l("INSTANCE");
            throw null;
        }
    }
}
