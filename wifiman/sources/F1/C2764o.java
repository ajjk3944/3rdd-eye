package F1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.snmp4j.mp.MPv3;

/* renamed from: F1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2764o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5759a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2766p f5760b;

    /* renamed from: c, reason: collision with root package name */
    private final b f5761c;

    /* renamed from: d, reason: collision with root package name */
    private final a f5762d;

    /* renamed from: e, reason: collision with root package name */
    private VelocityTracker f5763e;

    /* renamed from: f, reason: collision with root package name */
    private float f5764f;

    /* renamed from: g, reason: collision with root package name */
    private int f5765g;

    /* renamed from: h, reason: collision with root package name */
    private int f5766h;

    /* renamed from: i, reason: collision with root package name */
    private int f5767i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f5768j;

    /* renamed from: F1.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* renamed from: F1.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C2764o(Context context, InterfaceC2766p interfaceC2766p) {
        this(context, interfaceC2766p, new b() { // from class: F1.m
            @Override // F1.C2764o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C2764o.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: F1.n
            @Override // F1.C2764o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C2764o.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = Z.g(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = Z.f(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f5766h == source && this.f5767i == deviceId && this.f5765g == i10) {
            return false;
        }
        this.f5761c.a(this.f5759a, this.f5768j, motionEvent, i10);
        this.f5766h = source;
        this.f5767i = deviceId;
        this.f5765g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f5763e == null) {
            this.f5763e = VelocityTracker.obtain();
        }
        return this.f5762d.a(this.f5763e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        T.a(velocityTracker, motionEvent);
        T.b(velocityTracker, 1000);
        return T.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f5768j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f5763e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5763e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f5760b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f5764f) && fSignum != 0.0f)) {
            this.f5760b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f5768j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f5764f = this.f5760b.a(fMax) ? fMax : 0.0f;
    }

    C2764o(Context context, InterfaceC2766p interfaceC2766p, b bVar, a aVar) {
        this.f5765g = -1;
        this.f5766h = -1;
        this.f5767i = -1;
        this.f5768j = new int[]{MPv3.MAX_MESSAGE_ID, 0};
        this.f5759a = context;
        this.f5760b = interfaceC2766p;
        this.f5761c = bVar;
        this.f5762d = aVar;
    }
}
