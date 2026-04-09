package u1;

import androidx.camera.core.impl.A;
import androidx.camera.core.impl.AbstractC1707p;
import java.io.Serializable;

/* compiled from: R8$$SyntheticClass */
/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5618a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46512c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46514e;

    public /* synthetic */ RunnableC5618a(Object obj, int i, int i10, Object obj2) {
        this.f46511b = i10;
        this.f46513d = obj;
        this.f46512c = i;
        this.f46514e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46511b) {
            case 0:
                ((androidx.profileinstaller.b) this.f46513d).f16349b.a(this.f46512c, (Serializable) this.f46514e);
                break;
            default:
                ((AbstractC1707p) this.f46513d).b(this.f46512c, (A) this.f46514e);
                break;
        }
    }
}
