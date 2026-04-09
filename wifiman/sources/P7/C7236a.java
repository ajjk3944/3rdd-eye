package p7;

import gg.y;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7236a implements InterfaceC7237b {
    @Override // p7.InterfaceC7237b
    public y a() {
        y yVarB = Gg.a.b(Executors.newSingleThreadExecutor());
        AbstractC6492s.h(yVarB, "from(Executors.newSingleThreadExecutor())");
        return yVarB;
    }
}
