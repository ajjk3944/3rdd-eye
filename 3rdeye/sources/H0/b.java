package H0;

import B0.g;
import C0.h;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1975d;

    public /* synthetic */ b(int i, int i10, Object obj) {
        this.f1973b = i10;
        this.f1975d = obj;
        this.f1974c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1973b) {
            case 0:
                g.e eVar = ((h.a) this.f1975d).f810d;
                if (eVar != null) {
                    eVar.lambda$callbackFailAsync$1(this.f1974c);
                    break;
                }
                break;
            default:
                ((SystemForegroundService) this.f1975d).f16927f.cancel(this.f1974c);
                break;
        }
    }
}
