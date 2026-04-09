package s3;

import android.app.PendingIntent;
import android.os.Bundle;
import r3.C7564b;

/* loaded from: classes.dex */
abstract class M extends Y {

    /* renamed from: d, reason: collision with root package name */
    public final int f61192d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f61193e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7888c f61194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected M(AbstractC7888c abstractC7888c, int i10, Bundle bundle) {
        super(abstractC7888c, Boolean.TRUE);
        this.f61194f = abstractC7888c;
        this.f61192d = i10;
        this.f61193e = bundle;
    }

    @Override // s3.Y
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f61192d != 0) {
            this.f61194f.g0(1, null);
            Bundle bundle = this.f61193e;
            f(new C7564b(this.f61192d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f61194f.g0(1, null);
            f(new C7564b(8, null));
        }
    }

    @Override // s3.Y
    protected final void b() {
    }

    protected abstract void f(C7564b c7564b);

    protected abstract boolean g();
}
