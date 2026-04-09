package i7;

import Yg.J;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import e7.f;
import e7.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: i7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6083f implements InterfaceC6079b {

    /* renamed from: a, reason: collision with root package name */
    private e7.f f48863a = f.b.f46230a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6835l f48864b = new InterfaceC6835l() { // from class: i7.d
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return C6083f.g((e7.f) obj);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private g f48865c = g.a.f46232a;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6835l f48866d = new InterfaceC6835l() { // from class: i7.e
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return C6083f.j((g) obj);
        }
    };

    /* renamed from: i7.f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48867a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f48868b;

        static {
            int[] iArr = new int[TrackingFailureReason.values().length];
            try {
                iArr[TrackingFailureReason.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingFailureReason.BAD_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingFailureReason.CAMERA_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrackingFailureReason.EXCESSIVE_MOTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TrackingFailureReason.INSUFFICIENT_FEATURES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TrackingFailureReason.INSUFFICIENT_LIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f48867a = iArr;
            int[] iArr2 = new int[TrackingState.values().length];
            try {
                iArr2[TrackingState.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TrackingState.TRACKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TrackingState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f48868b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(e7.f it) {
        AbstractC6492s.i(it, "it");
        return J.f24997a;
    }

    private void h(e7.f fVar) {
        this.f48863a = fVar;
        e().invoke(fVar);
    }

    private void i(g gVar) {
        this.f48865c = gVar;
        f().invoke(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(g it) {
        AbstractC6492s.i(it, "it");
        return J.f24997a;
    }

    @Override // i7.InterfaceC6079b
    public void a(InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(interfaceC6835l, "<set-?>");
        this.f48866d = interfaceC6835l;
    }

    @Override // i7.InterfaceC6079b
    public void b(InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(interfaceC6835l, "<set-?>");
        this.f48864b = interfaceC6835l;
    }

    public InterfaceC6835l e() {
        return this.f48864b;
    }

    public InterfaceC6835l f() {
        return this.f48866d;
    }

    public final void k(e7.f state) {
        AbstractC6492s.i(state, "state");
        h(state);
    }

    public final void l(TrackingState trackingState, TrackingFailureReason failureReason) {
        g gVar;
        AbstractC6492s.i(trackingState, "trackingState");
        AbstractC6492s.i(failureReason, "failureReason");
        int i10 = a.f48868b[trackingState.ordinal()];
        if (i10 == 1) {
            gVar = g.a.f46232a;
        } else if (i10 == 2) {
            gVar = g.b.c.f46239a;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            switch (a.f48867a[failureReason.ordinal()]) {
                case 1:
                    gVar = g.b.C1733b.f46238a;
                    break;
                case 2:
                    gVar = g.b.a.e.f46237a;
                    break;
                case 3:
                    gVar = g.b.a.C1731a.f46233a;
                    break;
                case 4:
                    gVar = g.b.a.C1732b.f46234a;
                    break;
                case 5:
                    gVar = g.b.a.c.f46235a;
                    break;
                case 6:
                    gVar = g.b.a.d.f46236a;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        i(gVar);
    }
}
