package io.sentry.android.core.performance;

import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.s;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11724a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f11725d;

    public /* synthetic */ d(f fVar, int i10) {
        this.f11724a = i10;
        this.f11725d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11724a) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new d(this.f11725d, 3));
                break;
            case 1:
                this.f11725d.e();
                break;
            case 2:
                this.f11725d.e();
                break;
            default:
                f fVar = this.f11725d;
                if (fVar.I.get() == 0) {
                    fVar.f11727d = false;
                    s sVar = fVar.D;
                    if (sVar != null && sVar.E.get()) {
                        fVar.D.close();
                        fVar.D = null;
                    }
                    io.sentry.android.core.g gVar = fVar.E;
                    if (gVar != null && gVar.E) {
                        gVar.a(true);
                        fVar.E = null;
                        break;
                    }
                }
                break;
        }
    }
}
