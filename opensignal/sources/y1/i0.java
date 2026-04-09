package y1;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* loaded from: classes.dex */
public final class i0 implements n0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f25706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks2 f25707c;

    public /* synthetic */ i0(Context context, ComponentCallbacks2 componentCallbacks2, int i10) {
        this.f25705a = i10;
        this.f25706b = context;
        this.f25707c = componentCallbacks2;
    }

    @Override // n0.f0
    public final void a() {
        switch (this.f25705a) {
            case 0:
                this.f25706b.getApplicationContext().unregisterComponentCallbacks((j0) this.f25707c);
                break;
            default:
                this.f25706b.getApplicationContext().unregisterComponentCallbacks((k0) this.f25707c);
                break;
        }
    }
}
