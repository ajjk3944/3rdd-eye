package ui;

import Bh.InterfaceC2515z;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import ui.g;

/* renamed from: ui.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8176b {
    public final g a(InterfaceC2515z functionDescriptor) {
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(functionDescriptor)) {
                return hVar.a(functionDescriptor);
            }
        }
        return g.a.f63081b;
    }

    public abstract List b();
}
