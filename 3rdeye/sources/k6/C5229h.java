package k6;

import H6.C0675l;
import N7.AbstractC1192h2;

/* compiled from: DivActionTypedClearFocusHandler.kt */
/* renamed from: k6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5229h implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        if (!(action instanceof AbstractC1192h2.f)) {
            return false;
        }
        c0675l.clearFocus();
        C5246y.a(c0675l);
        return true;
    }
}
