package J0;

import Yg.InterfaceC3665i;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class s extends AbstractC6494u implements InterfaceC6839p {

    /* renamed from: a, reason: collision with root package name */
    public static final s f9717a = new s();

    public s() {
        super(2);
    }

    @Override // mh.InterfaceC6839p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a invoke(a aVar, a aVar2) {
        String strB;
        InterfaceC3665i interfaceC3665iA;
        if (aVar == null || (strB = aVar.b()) == null) {
            strB = aVar2.b();
        }
        if (aVar == null || (interfaceC3665iA = aVar.a()) == null) {
            interfaceC3665iA = aVar2.a();
        }
        return new a(strB, interfaceC3665iA);
    }
}
