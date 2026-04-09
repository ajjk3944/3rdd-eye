package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4936s1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41596a;

    public RunnableC4936s1(Context context) {
        this.f41596a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Zj zj = AbstractC5105yj.f42147a;
        Context context = this.f41596a;
        synchronized (zj) {
            try {
                if (zj.f40484b == null) {
                    zj.f40484b = AbstractC5104yi.f42146a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = zj.f40483a.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4713jb) it.next()).a(zj.f40484b);
                    }
                    zj.f40483a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
