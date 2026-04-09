package androidx.compose.ui.platform;

import R0.InterfaceInputConnectionC3472z;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: androidx.compose.ui.platform.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3960x0 {

    /* renamed from: a, reason: collision with root package name */
    private final L0 f29701a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f29702b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f29703c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private V.b f29704d = new V.b(new WeakReference[16], 0);

    /* renamed from: e, reason: collision with root package name */
    private boolean f29705e;

    /* renamed from: androidx.compose.ui.platform.x0$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(InterfaceInputConnectionC3472z interfaceInputConnectionC3472z) {
            int i10;
            interfaceInputConnectionC3472z.a();
            V.b bVar = C3960x0.this.f29704d;
            int iO = bVar.o();
            if (iO <= 0) {
                i10 = -1;
                break;
            }
            Object[] objArrM = bVar.m();
            i10 = 0;
            while (!AbstractC6492s.d((WeakReference) objArrM[i10], interfaceInputConnectionC3472z)) {
                i10++;
                if (i10 >= iO) {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                C3960x0.this.f29704d.z(i10);
            }
            if (C3960x0.this.f29704d.s()) {
                C3960x0.this.f29702b.invoke();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceInputConnectionC3472z) obj);
            return Yg.J.f24997a;
        }
    }

    public C3960x0(L0 l02, InterfaceC6824a interfaceC6824a) {
        this.f29701a = l02;
        this.f29702b = interfaceC6824a;
    }

    public final InputConnection c(EditorInfo editorInfo) {
        synchronized (this.f29703c) {
            if (this.f29705e) {
                return null;
            }
            InterfaceInputConnectionC3472z interfaceInputConnectionC3472zA = R0.G.a(this.f29701a.a(editorInfo), new a());
            this.f29704d.b(new WeakReference(interfaceInputConnectionC3472zA));
            return interfaceInputConnectionC3472zA;
        }
    }

    public final void d() {
        synchronized (this.f29703c) {
            try {
                this.f29705e = true;
                V.b bVar = this.f29704d;
                int iO = bVar.o();
                if (iO > 0) {
                    Object[] objArrM = bVar.m();
                    int i10 = 0;
                    do {
                        InterfaceInputConnectionC3472z interfaceInputConnectionC3472z = (InterfaceInputConnectionC3472z) ((WeakReference) objArrM[i10]).get();
                        if (interfaceInputConnectionC3472z != null) {
                            interfaceInputConnectionC3472z.a();
                        }
                        i10++;
                    } while (i10 < iO);
                }
                this.f29704d.h();
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return !this.f29705e;
    }
}
