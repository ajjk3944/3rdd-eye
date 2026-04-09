package ui;

import Bh.InterfaceC2503m;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface l {

    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63098a = new a();

        private a() {
        }

        @Override // ui.l
        public boolean a(InterfaceC2503m what, InterfaceC2503m from) {
            AbstractC6492s.i(what, "what");
            AbstractC6492s.i(from, "from");
            return true;
        }
    }

    boolean a(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2);
}
