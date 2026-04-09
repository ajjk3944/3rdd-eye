package androidx.compose.foundation.text.handwriting;

import G.c;
import Y0.h;
import androidx.compose.foundation.layout.o;
import androidx.compose.ui.e;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f28471a = h.j(40);

    /* renamed from: b, reason: collision with root package name */
    private static final float f28472b = h.j(10);

    public static final float a() {
        return f28472b;
    }

    public static final float b() {
        return f28471a;
    }

    public static final e c(e eVar, boolean z10, InterfaceC6824a interfaceC6824a) {
        return (z10 && c.a()) ? o.j(eVar.b0(new StylusHandwritingElementWithNegativePadding(interfaceC6824a)), f28472b, f28471a) : eVar;
    }
}
