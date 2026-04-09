package I2;

import b9.C1992A;
import p9.InterfaceC5480a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5480a f2422c;

    public /* synthetic */ g(int i, InterfaceC5480a interfaceC5480a) {
        this.f2421b = i;
        this.f2422c = interfaceC5480a;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f2421b) {
            case 0:
                e8.d it = (e8.d) obj;
                kotlin.jvm.internal.l.f(it, "it");
                InterfaceC5480a interfaceC5480a = this.f2422c;
                if (interfaceC5480a != null) {
                    interfaceC5480a.invoke();
                }
                return C1992A.f18074a;
            default:
                E1.a it2 = (E1.a) obj;
                kotlin.jvm.internal.l.f(it2, "it");
                return this.f2422c.invoke();
        }
    }
}
