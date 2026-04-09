package zi;

import eh.AbstractC5467b;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zi.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8784n {

    /* renamed from: zi.n$a */
    public static final class a implements InterfaceC8780j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f67364a;

        public a(InterfaceC6839p interfaceC6839p) {
            this.f67364a = interfaceC6839p;
        }

        @Override // zi.InterfaceC8780j
        public Iterator iterator() {
            return AbstractC8783m.a(this.f67364a);
        }
    }

    public static Iterator a(InterfaceC6839p block) {
        AbstractC6492s.i(block, "block");
        C8781k c8781k = new C8781k();
        c8781k.g(AbstractC5467b.b(block, c8781k, c8781k));
        return c8781k;
    }

    public static InterfaceC8780j b(InterfaceC6839p block) {
        AbstractC6492s.i(block, "block");
        return new a(block);
    }
}
