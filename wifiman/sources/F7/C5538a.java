package f7;

import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5538a {

    /* renamed from: i, reason: collision with root package name */
    public static final C1760a f47116i = new C1760a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f47117a;

    /* renamed from: b, reason: collision with root package name */
    private float f47118b;

    /* renamed from: c, reason: collision with root package name */
    private float f47119c;

    /* renamed from: d, reason: collision with root package name */
    private float f47120d;

    /* renamed from: e, reason: collision with root package name */
    private float f47121e;

    /* renamed from: f, reason: collision with root package name */
    private int f47122f;

    /* renamed from: g, reason: collision with root package name */
    private int f47123g;

    /* renamed from: h, reason: collision with root package name */
    private float f47124h;

    /* renamed from: f7.a$a, reason: collision with other inner class name */
    public static final class C1760a {
        public /* synthetic */ C1760a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1760a() {
        }
    }

    /* renamed from: f7.a$b */
    public interface b {
        void a(float f10, float f11);
    }

    public C5538a(b listener) {
        AbstractC6492s.i(listener, "listener");
        this.f47117a = listener;
        this.f47122f = -1;
        this.f47123g = -1;
    }

    private final float a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float degrees = ((float) Math.toDegrees(((float) Math.atan2(f11 - f13, f10 - f12)) - ((float) Math.atan2(f15 - f17, f14 - f16)))) % 360;
        if (degrees < -180.0f) {
            degrees += 360.0f;
        }
        return degrees > 180.0f ? degrees - 360.0f : degrees;
    }

    public final boolean b(MotionEvent event) {
        AbstractC6492s.i(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f47122f = event.getPointerId(event.getActionIndex());
        } else if (actionMasked == 1) {
            this.f47122f = -1;
            this.f47124h = 0.0f;
        } else if (actionMasked == 2) {
            int i10 = this.f47122f;
            if (i10 != -1 && this.f47123g != -1) {
                int iFindPointerIndex = event.findPointerIndex(i10);
                int iFindPointerIndex2 = event.findPointerIndex(this.f47123g);
                if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
                    this.f47122f = -1;
                    this.f47123g = -1;
                } else {
                    float x10 = event.getX(iFindPointerIndex);
                    float y10 = event.getY(iFindPointerIndex);
                    float fA = a(this.f47118b, this.f47119c, this.f47120d, this.f47121e, event.getX(iFindPointerIndex2), event.getY(iFindPointerIndex2), x10, y10);
                    b bVar = this.f47117a;
                    float f10 = this.f47124h;
                    bVar.a(f10, f10 - fA);
                    this.f47124h = fA;
                }
            }
        } else if (actionMasked == 3) {
            this.f47122f = -1;
            this.f47123g = -1;
            this.f47124h = 0.0f;
        } else if (actionMasked == 5) {
            this.f47123g = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex3 = event.findPointerIndex(this.f47122f);
            int iFindPointerIndex4 = event.findPointerIndex(this.f47123g);
            if (iFindPointerIndex3 == -1 || iFindPointerIndex4 == -1) {
                this.f47122f = -1;
                this.f47123g = -1;
            } else {
                this.f47120d = event.getX(iFindPointerIndex3);
                this.f47121e = event.getY(iFindPointerIndex3);
                this.f47118b = event.getX(iFindPointerIndex4);
                this.f47119c = event.getY(iFindPointerIndex4);
            }
        } else if (actionMasked == 6) {
            this.f47123g = -1;
        }
        return true;
    }
}
