package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.b5;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11677a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f11678d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Window f11679g;

    public /* synthetic */ m(q qVar, Window window, int i10) {
        this.f11677a = i10;
        this.f11678d = qVar;
        this.f11679g = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11677a) {
            case 0:
                q qVar = this.f11678d;
                CopyOnWriteArraySet copyOnWriteArraySet = qVar.f11684d;
                Window window = this.f11679g;
                if (copyOnWriteArraySet.add(window)) {
                    try {
                        d dVar = qVar.D;
                        o oVar = qVar.E;
                        Handler handler = qVar.f11686r;
                        dVar.getClass();
                        if (oVar != null) {
                            window.addOnFrameMetricsAvailableListener(oVar, handler);
                            break;
                        } else {
                            break;
                        }
                    } catch (Throwable th2) {
                        qVar.f11685g.g(b5.ERROR, "Failed to add frameMetricsAvailableListener", th2);
                        return;
                    }
                }
                break;
            default:
                q qVar2 = this.f11678d;
                Window window2 = this.f11679g;
                try {
                    if (qVar2.f11684d.remove(window2)) {
                        d dVar2 = qVar2.D;
                        o oVar2 = qVar2.E;
                        dVar2.getClass();
                        if (oVar2 != null) {
                            window2.removeOnFrameMetricsAvailableListener(oVar2);
                            break;
                        } else {
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    qVar2.f11685g.g(b5.ERROR, "Failed to remove frameMetricsAvailableListener", th3);
                }
                break;
        }
    }
}
