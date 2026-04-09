package ka;

import Yg.m;
import Yg.n;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import ka.InterfaceC6411a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* renamed from: ka.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6419i implements InterfaceC6411a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f51343b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f51344c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final long f51345d = 200;

    /* renamed from: e, reason: collision with root package name */
    private static final int f51346e = 80;

    /* renamed from: a, reason: collision with root package name */
    private final m f51347a;

    /* renamed from: ka.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: ka.i$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51348a;

        static {
            int[] iArr = new int[InterfaceC6411a.EnumC1899a.values().length];
            try {
                iArr[InterfaceC6411a.EnumC1899a.TICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f51348a = iArr;
        }
    }

    public C6419i(final Context context) {
        AbstractC6492s.i(context, "context");
        this.f51347a = n.b(new InterfaceC6824a() { // from class: ka.e
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return C6419i.i(context);
            }
        });
    }

    private final Vibrator f() {
        return (Vibrator) this.f51347a.getValue();
    }

    private final void g(InterfaceC6411a.EnumC1899a enumC1899a, Vibrator vibrator) {
        if (b.f51348a[enumC1899a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        vibrator.vibrate(VibrationEffect.createOneShot(f51345d, f51346e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h() {
        return "Skipping vibration since vibrator is not available on the device";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vibrator i(Context context) {
        if (Build.VERSION.SDK_INT > 31) {
            Object systemService = context.getApplicationContext().getSystemService("vibrator_manager");
            VibratorManager vibratorManagerA = AbstractC6412b.a(systemService) ? AbstractC6413c.a(systemService) : null;
            if (vibratorManagerA != null) {
                return vibratorManagerA.getDefaultVibrator();
            }
            return null;
        }
        Object systemService2 = context.getApplicationContext().getSystemService("vibrator");
        Vibrator vibrator = systemService2 instanceof Vibrator ? (Vibrator) systemService2 : null;
        if (vibrator == null) {
            S9.a.d(new InterfaceC6824a() { // from class: ka.f
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return C6419i.j();
                }
            });
            return null;
        }
        if (vibrator.hasVibrator()) {
            return vibrator;
        }
        S9.a.d(new InterfaceC6824a() { // from class: ka.g
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return C6419i.k();
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j() {
        return "Vibrator service unavailable";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k() {
        return "Vibrator unavailable on the device";
    }

    @Override // ka.InterfaceC6411a
    public void a(InterfaceC6411a.EnumC1899a pattern) {
        AbstractC6492s.i(pattern, "pattern");
        if (f() == null) {
            S9.a.d(new InterfaceC6824a() { // from class: ka.h
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return C6419i.h();
                }
            });
            return;
        }
        Vibrator vibratorF = f();
        AbstractC6492s.f(vibratorF);
        vibratorF.cancel();
        Vibrator vibratorF2 = f();
        AbstractC6492s.f(vibratorF2);
        g(pattern, vibratorF2);
    }
}
