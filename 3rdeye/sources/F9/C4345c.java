package f9;

import f9.InterfaceC4350h;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: R8$$SyntheticClass */
/* renamed from: f9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4345c implements p {
    @Override // p9.p
    public final Object invoke(Object obj, Object obj2) {
        String acc = (String) obj;
        InterfaceC4350h.a element = (InterfaceC4350h.a) obj2;
        l.f(acc, "acc");
        l.f(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
