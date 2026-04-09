package D5;

import E5.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import h5.InterfaceC2373g;
import h5.InterfaceC2374h;
import p5.p;
import z5.C3043t;
import z5.InterfaceC3033i;
import z5.T;
import z5.c0;

/* loaded from: classes3.dex */
public final class k extends q5.j implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f1309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar) {
        super(2);
        this.f1309b = hVar;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        InterfaceC2373g interfaceC2373g = (InterfaceC2373g) obj2;
        InterfaceC2374h key = interfaceC2373g.getKey();
        InterfaceC2373g interfaceC2373gH = this.f1309b.f1304e.h(key);
        if (key != C3043t.f24555b) {
            return Integer.valueOf(interfaceC2373g != interfaceC2373gH ? LinearLayoutManager.INVALID_OFFSET : iIntValue + 1);
        }
        T t6 = (T) interfaceC2373gH;
        T parent = (T) interfaceC2373g;
        while (true) {
            if (parent != null) {
                if (parent == t6 || !(parent instanceof s)) {
                    break;
                }
                InterfaceC3033i interfaceC3033i = (InterfaceC3033i) c0.f24524b.get((c0) parent);
                parent = interfaceC3033i != null ? interfaceC3033i.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent == t6) {
            if (t6 != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + t6 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
