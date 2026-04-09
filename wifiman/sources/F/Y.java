package F;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.platform.n1;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import w0.AbstractC8249c;
import w0.AbstractC8250d;
import w0.AbstractC8252f;
import w0.C8248b;

/* loaded from: classes.dex */
public abstract class Y {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.e f4957a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f4958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0.e eVar, E e10) {
            super(1);
            this.f4957a = eVar;
            this.f4958b = e10;
        }

        public final Boolean a(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zK = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && AbstractC8249c.e(AbstractC8250d.b(keyEvent), AbstractC8249c.f64330a.a()) && keyEvent.getSource() != 257) {
                if (Y.c(keyEvent, 19)) {
                    zK = this.f4957a.k(androidx.compose.ui.focus.d.f28823b.h());
                } else if (Y.c(keyEvent, 20)) {
                    zK = this.f4957a.k(androidx.compose.ui.focus.d.f28823b.a());
                } else if (Y.c(keyEvent, 21)) {
                    zK = this.f4957a.k(androidx.compose.ui.focus.d.f28823b.d());
                } else if (Y.c(keyEvent, 22)) {
                    zK = this.f4957a.k(androidx.compose.ui.focus.d.f28823b.g());
                } else if (Y.c(keyEvent, 23)) {
                    n1 n1VarH = this.f4958b.h();
                    if (n1VarH != null) {
                        n1VarH.b();
                    }
                    zK = true;
                }
            }
            return Boolean.valueOf(zK);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C8248b) obj).f());
        }
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, E e10, k0.e eVar2) {
        return androidx.compose.ui.input.key.a.b(eVar, new a(eVar2, e10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i10) {
        return AbstractC8252f.b(AbstractC8250d.a(keyEvent)) == i10;
    }
}
