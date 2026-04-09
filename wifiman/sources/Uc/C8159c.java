package uc;

import Yg.m;
import Yg.n;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import ka.AbstractC6412b;
import ka.AbstractC6413c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import uc.InterfaceC8157a;

/* renamed from: uc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8159c implements InterfaceC8157a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f62931b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final m f62932a;

    /* renamed from: uc.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: uc.c$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62933a;

        static {
            int[] iArr = new int[InterfaceC8157a.EnumC2226a.values().length];
            try {
                iArr[InterfaceC8157a.EnumC2226a.TICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f62933a = iArr;
        }
    }

    public C8159c(final Context context) {
        AbstractC6492s.i(context, "context");
        this.f62932a = n.b(new InterfaceC6824a() { // from class: uc.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return C8159c.e(context);
            }
        });
    }

    private final Vibrator c() {
        return (Vibrator) this.f62932a.getValue();
    }

    private final void d(InterfaceC8157a.EnumC2226a enumC2226a, Vibrator vibrator) {
        if (b.f62933a[enumC2226a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        vibrator.vibrate(VibrationEffect.createOneShot(200L, 80));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vibrator e(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
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
            Z7.b.h("Vibrator service unavailable", null, 2, null);
            return null;
        }
        if (vibrator.hasVibrator()) {
            return vibrator;
        }
        Z7.b.h("Vibrator unavailable on the device", null, 2, null);
        return null;
    }

    @Override // uc.InterfaceC8157a
    public void a(InterfaceC8157a.EnumC2226a pattern) {
        AbstractC6492s.i(pattern, "pattern");
        if (c() == null) {
            Z7.b.h("Skipping vibration since vibrator is not available on the device", null, 2, null);
            return;
        }
        Vibrator vibratorC = c();
        AbstractC6492s.f(vibratorC);
        vibratorC.cancel();
        Vibrator vibratorC2 = c();
        AbstractC6492s.f(vibratorC2);
        d(pattern, vibratorC2);
    }
}
