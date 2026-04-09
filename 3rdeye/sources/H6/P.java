package H6;

import H6.Q;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1788v;
import androidx.lifecycle.InterfaceC1790x;
import b9.C1992A;
import c.ActivityC2008f;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class P implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2099c;

    public /* synthetic */ P(Object obj, int i) {
        this.f2098b = i;
        this.f2099c = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        switch (this.f2098b) {
            case 0:
                Q this$0 = (Q) this.f2099c;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                synchronized (this$0.f2102c) {
                    try {
                        if (Q.a.f2104a[aVar.ordinal()] == 1) {
                            Set<C0675l> set = this$0.f2101b.get(interfaceC1790x);
                            if (set != null) {
                                for (C0675l c0675l : set) {
                                    c0675l.t();
                                    this$0.f2100a.a(c0675l);
                                }
                            }
                            this$0.f2101b.remove(interfaceC1790x);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ActivityC2008f._init_$lambda$3((ActivityC2008f) this.f2099c, interfaceC1790x, aVar);
                return;
        }
    }
}
