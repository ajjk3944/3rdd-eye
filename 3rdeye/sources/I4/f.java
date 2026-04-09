package I4;

import android.content.Context;
import g5.InterfaceC4392b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC4392b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2451c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f2449a = i;
        this.f2450b = obj;
        this.f2451c = obj2;
    }

    @Override // g5.InterfaceC4392b
    public final Object get() {
        switch (this.f2449a) {
            case 0:
                g gVar = (g) this.f2450b;
                gVar.getClass();
                a aVar = (a) this.f2451c;
                return aVar.f2438f.g(new t(aVar, gVar));
            default:
                return new e5.h((Context) this.f2450b, (String) this.f2451c);
        }
    }
}
