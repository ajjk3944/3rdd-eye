package j4;

import g4.InterfaceC2336A;
import java.util.Date;
import n4.C2689a;

/* renamed from: j4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2573e implements InterfaceC2336A {
    @Override // g4.InterfaceC2336A
    public final g4.z a(g4.m mVar, C2689a c2689a) {
        if (c2689a.f22327a == Date.class) {
            return new C2575g();
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
