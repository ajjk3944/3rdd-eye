package t9;

import android.content.Context;
import tg.g0;
import tg.q0;

/* loaded from: classes.dex */
public final class e implements o9.b, vg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22674a;

    /* renamed from: d, reason: collision with root package name */
    public final kq.a f22675d;

    public /* synthetic */ e(kq.a aVar, int i10) {
        this.f22674a = i10;
        this.f22675d = aVar;
    }

    @Override // kq.a
    public final Object get() {
        switch (this.f22674a) {
            case 0:
                String packageName = ((Context) this.f22675d.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new g0((q0) this.f22675d.get());
        }
    }
}
