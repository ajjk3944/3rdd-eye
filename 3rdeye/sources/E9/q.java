package E9;

import A9.InterfaceC0594o0;
import F9.v;
import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4350h;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.m implements p9.p<Integer, InterfaceC4350h.a, Integer> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o<?> f1572g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o<?> oVar) {
        super(2);
        this.f1572g = oVar;
    }

    @Override // p9.p
    public final Integer invoke(Integer num, InterfaceC4350h.a aVar) {
        int iIntValue = num.intValue();
        InterfaceC4350h.a aVar2 = aVar;
        InterfaceC4350h.b<?> key = aVar2.getKey();
        InterfaceC4350h.a aVar3 = this.f1572g.f1565m.get(key);
        if (key != InterfaceC0594o0.a.f263b) {
            return Integer.valueOf(aVar2 != aVar3 ? RecyclerView.UNDEFINED_DURATION : iIntValue + 1);
        }
        InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) aVar3;
        InterfaceC0594o0 parent = (InterfaceC0594o0) aVar2;
        while (true) {
            if (parent != null) {
                if (parent == interfaceC0594o0 || !(parent instanceof v)) {
                    break;
                }
                parent = parent.getParent();
            } else {
                parent = null;
                break;
            }
        }
        if (parent == interfaceC0594o0) {
            if (interfaceC0594o0 != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC0594o0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
