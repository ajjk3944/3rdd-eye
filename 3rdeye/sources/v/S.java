package v;

import C.AbstractC0633u;
import C.C0618e;
import C.C0619f;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.N;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: CameraStateMachine.java */
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.N f46635a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.E<AbstractC0633u> f46636b;

    /* compiled from: CameraStateMachine.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46637a;

        static {
            int[] iArr = new int[J.a.values().length];
            f46637a = iArr;
            try {
                iArr[J.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46637a[J.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46637a[J.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46637a[J.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46637a[J.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46637a[J.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46637a[J.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46637a[J.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public S(androidx.camera.core.impl.N n9) {
        this.f46635a = n9;
        androidx.lifecycle.E<AbstractC0633u> e4 = new androidx.lifecycle.E<>();
        this.f46636b = e4;
        e4.k(new C0618e(AbstractC0633u.b.CLOSED, null));
    }

    public final void a(J.a aVar, C0619f c0619f) {
        C0618e c0618e;
        switch (a.f46637a[aVar.ordinal()]) {
            case 1:
                androidx.camera.core.impl.N n9 = this.f46635a;
                synchronized (n9.f14923b) {
                    Iterator it = n9.f14926e.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c0618e = new C0618e(AbstractC0633u.b.PENDING_OPEN, null);
                        } else if (((N.a) ((Map.Entry) it.next()).getValue()).f14928a == J.a.CLOSING) {
                            c0618e = new C0618e(AbstractC0633u.b.OPENING, null);
                        }
                    }
                }
                break;
            case 2:
                c0618e = new C0618e(AbstractC0633u.b.OPENING, c0619f);
                break;
            case 3:
            case 4:
                c0618e = new C0618e(AbstractC0633u.b.OPEN, c0619f);
                break;
            case 5:
            case 6:
                c0618e = new C0618e(AbstractC0633u.b.CLOSING, c0619f);
                break;
            case 7:
            case 8:
                c0618e = new C0618e(AbstractC0633u.b.CLOSED, c0619f);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C.S.a("CameraStateMachine", "New public camera state " + c0618e + " from " + aVar + " and " + c0619f);
        if (Objects.equals(this.f46636b.d(), c0618e)) {
            return;
        }
        C.S.a("CameraStateMachine", "Publishing new public camera state " + c0618e);
        this.f46636b.k(c0618e);
    }
}
