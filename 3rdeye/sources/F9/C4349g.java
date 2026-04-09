package f9;

import f9.InterfaceC4348f;
import f9.InterfaceC4350h;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: R8$$SyntheticClass */
/* renamed from: f9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4349g implements p {
    @Override // p9.p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC4350h acc = (InterfaceC4350h) obj;
        InterfaceC4350h.a element = (InterfaceC4350h.a) obj2;
        l.f(acc, "acc");
        l.f(element, "element");
        InterfaceC4350h interfaceC4350hMinusKey = acc.minusKey(element.getKey());
        C4351i c4351i = C4351i.f37871b;
        if (interfaceC4350hMinusKey == c4351i) {
            return element;
        }
        InterfaceC4348f.a aVar = InterfaceC4348f.a.f37870b;
        InterfaceC4348f interfaceC4348f = (InterfaceC4348f) interfaceC4350hMinusKey.get(aVar);
        if (interfaceC4348f == null) {
            return new C4346d(element, interfaceC4350hMinusKey);
        }
        InterfaceC4350h interfaceC4350hMinusKey2 = interfaceC4350hMinusKey.minusKey(aVar);
        return interfaceC4350hMinusKey2 == c4351i ? new C4346d(interfaceC4348f, element) : new C4346d(interfaceC4348f, new C4346d(element, interfaceC4350hMinusKey2));
    }
}
