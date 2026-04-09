package m7;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.Scroller;
import f7.C5538a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: j, reason: collision with root package name */
    public static final a f53173j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final e f53174a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6777b f53175b;

    /* renamed from: c, reason: collision with root package name */
    private GestureDetector f53176c;

    /* renamed from: d, reason: collision with root package name */
    private ScaleGestureDetector f53177d;

    /* renamed from: e, reason: collision with root package name */
    private C5538a f53178e;

    /* renamed from: f, reason: collision with root package name */
    private Scroller f53179f;

    /* renamed from: g, reason: collision with root package name */
    private ValueAnimator f53180g;

    /* renamed from: h, reason: collision with root package name */
    private float f53181h;

    /* renamed from: i, reason: collision with root package name */
    private float f53182i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        private float f53183a = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        private float f53184b = -1.0f;

        /* renamed from: c, reason: collision with root package name */
        private int f53185c;

        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e10) {
            AbstractC6492s.i(e10, "e");
            if (d.this.i()) {
                d.this.o();
            }
            this.f53185c = e10.getPointerCount();
            this.f53183a = 0.0f;
            this.f53184b = 0.0f;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
            AbstractC6492s.i(e22, "e2");
            if (motionEvent == null) {
                return false;
            }
            d.this.f53179f.fling((int) motionEvent.getX(), (int) motionEvent.getY(), (int) (f10 / 1.0f), (int) ((-f11) / 1.0f), PduHandle.NONE, MPv3.MAX_MESSAGE_ID, PduHandle.NONE, MPv3.MAX_MESSAGE_ID);
            d.this.f53180g.setDuration(d.this.f53179f.getDuration());
            d.this.f53180g.start();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
            AbstractC6492s.i(e22, "e2");
            if (motionEvent == null) {
                return false;
            }
            float x10 = e22.getX() - motionEvent.getX();
            float y10 = motionEvent.getY() - e22.getY();
            if (e22.getPointerCount() != this.f53185c) {
                this.f53185c = e22.getPointerCount();
            } else {
                d.this.j(x10 - this.f53183a, y10 - this.f53184b);
            }
            this.f53183a = x10;
            this.f53184b = y10;
            return true;
        }
    }

    private final class c implements C5538a.b {
        public c() {
        }

        @Override // f7.C5538a.b
        public void a(float f10, float f11) {
            d.this.m(f11);
        }
    }

    /* renamed from: m7.d$d, reason: collision with other inner class name */
    private final class C1952d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C1952d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            AbstractC6492s.i(detector, "detector");
            d.this.n(detector.getScaleFactor());
            return true;
        }
    }

    public d(Context context, e renderer, AbstractC6777b controller) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(renderer, "renderer");
        AbstractC6492s.i(controller, "controller");
        this.f53174a = renderer;
        this.f53175b = controller;
        this.f53176c = new GestureDetector(context, new b());
        this.f53177d = new ScaleGestureDetector(context, new C1952d());
        this.f53178e = new C5538a(new c());
        this.f53179f = new Scroller(context, null, true);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AbstractC6492s.h(valueAnimatorOfFloat, "ofFloat(...)");
        this.f53180g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m7.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.b(this.f53172a, valueAnimator);
            }
        });
        this.f53181h = -1.0f;
        this.f53182i = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(d dVar, ValueAnimator it) {
        AbstractC6492s.i(it, "it");
        dVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        return !this.f53179f.isFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(float f10, float f11) {
        PointF pointFB = this.f53174a.b(new PointF(f10, f11));
        this.f53175b.d(false);
        this.f53175b.f(false);
        this.f53175b.e(new PointF(this.f53175b.a().x + pointFB.x, this.f53175b.a().y + pointFB.y));
    }

    private final void k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(float f10) {
        this.f53175b.f(false);
        AbstractC6777b abstractC6777b = this.f53175b;
        abstractC6777b.g(abstractC6777b.b() + f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(float f10) {
        AbstractC6777b abstractC6777b = this.f53175b;
        abstractC6777b.h(abstractC6777b.c() / f10);
    }

    private final void p() {
        if (this.f53179f.isFinished()) {
            this.f53180g.cancel();
            this.f53181h = -1.0f;
            this.f53182i = -1.0f;
            k();
            return;
        }
        this.f53179f.computeScrollOffset();
        if (this.f53181h != -1.0f) {
            j(this.f53179f.getCurrX() - this.f53181h, this.f53179f.getCurrY() - this.f53182i);
        }
        this.f53181h = this.f53179f.getCurrX();
        this.f53182i = this.f53179f.getCurrY();
    }

    public final boolean l(MotionEvent event) {
        AbstractC6492s.i(event, "event");
        boolean zOnTouchEvent = this.f53177d.onTouchEvent(event);
        boolean zB = this.f53178e.b(event);
        boolean zOnTouchEvent2 = this.f53176c.onTouchEvent(event);
        if (!zOnTouchEvent2 && event.getAction() == 1) {
            o();
        }
        return zOnTouchEvent | zOnTouchEvent2 | zB;
    }

    public final void o() {
        this.f53179f.forceFinished(true);
        k();
    }
}
