package O4;

import android.os.Bundle;
import s.BinderC5541e;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public final class C implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10231d;

    public /* synthetic */ C(int i, Object obj, Object obj2) {
        this.f10229b = i;
        this.f10231d = obj;
        this.f10230c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10229b) {
            case 0:
                F.a((F) this.f10231d, (V4.e) this.f10230c);
                break;
            default:
                ((BinderC5541e) this.f10231d).f45882c.onWarmupCompleted((Bundle) this.f10230c);
                break;
        }
    }
}
