package e6;

import android.graphics.Canvas;
import android.graphics.RectF;
import i6.EnumC6077a;
import j6.InterfaceC6255b;
import k6.C6396c;
import kotlin.jvm.internal.AbstractC6492s;
import u6.e;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5423b {

    /* renamed from: e6.b$a */
    public static final class a implements InterfaceC5422a, e {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ e f46199a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f46200b;

        /* renamed from: c, reason: collision with root package name */
        private Canvas f46201c;

        /* renamed from: d, reason: collision with root package name */
        private final long f46202d;

        /* renamed from: e, reason: collision with root package name */
        private final D6.a f46203e;

        /* renamed from: f, reason: collision with root package name */
        private final float f46204f = r();

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC6255b f46205g;

        /* renamed from: h, reason: collision with root package name */
        private final float f46206h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e f46207i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ RectF f46208j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC6255b f46209k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ EnumC6077a f46210l;

        a(e eVar, RectF rectF, Canvas canvas, int i10, D6.a aVar, InterfaceC6255b interfaceC6255b, float f10, EnumC6077a enumC6077a) {
            this.f46207i = eVar;
            this.f46208j = rectF;
            this.f46209k = interfaceC6255b;
            this.f46210l = enumC6077a;
            this.f46199a = eVar;
            this.f46200b = rectF;
            this.f46201c = canvas;
            this.f46202d = i10;
            this.f46203e = aVar;
            this.f46205g = interfaceC6255b.c(l());
            this.f46206h = f10;
        }

        private final float r() {
            float fA = this.f46209k.a() * C6396c.b(c(), null, 1, null).g();
            return (((fA > this.f46208j.width() ? 1 : (fA == this.f46208j.width() ? 0 : -1)) < 0 && this.f46210l == EnumC6077a.None) || (f() && fA >= this.f46208j.width())) ? this.f46207i.l() : this.f46208j.width() / fA;
        }

        @Override // u6.InterfaceC8137b
        public long a() {
            return this.f46202d;
        }

        @Override // u6.e
        public float b(float f10) {
            return this.f46199a.b(f10);
        }

        @Override // u6.e
        public C6396c c() {
            return this.f46199a.c();
        }

        @Override // u6.InterfaceC8137b
        public Canvas d() {
            return this.f46201c;
        }

        @Override // u6.c
        public void e(Object key, Object value) {
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(value, "value");
            this.f46199a.e(key, value);
        }

        @Override // u6.e
        public boolean f() {
            return this.f46199a.f();
        }

        @Override // u6.e
        public float g(float f10) {
            return this.f46199a.g(f10);
        }

        @Override // u6.e
        public float getDensity() {
            return this.f46199a.getDensity();
        }

        @Override // u6.e
        public boolean h() {
            return this.f46199a.h();
        }

        @Override // e6.InterfaceC5422a
        public InterfaceC6255b i() {
            return this.f46205g;
        }

        @Override // u6.e
        public float j() {
            return this.f46199a.j();
        }

        @Override // e6.InterfaceC5422a
        public RectF k() {
            return this.f46200b;
        }

        @Override // u6.e
        public float l() {
            return this.f46204f;
        }

        @Override // u6.e
        public float m(float f10) {
            return this.f46199a.m(f10);
        }

        @Override // e6.InterfaceC5422a
        public float n() {
            return this.f46206h;
        }

        @Override // u6.e
        public int o(float f10) {
            return this.f46199a.o(f10);
        }

        @Override // u6.c
        public boolean p(Object key) {
            AbstractC6492s.i(key, "key");
            return this.f46199a.p(key);
        }

        @Override // u6.c
        public Object q(Object key) {
            AbstractC6492s.i(key, "key");
            return this.f46199a.q(key);
        }

        @Override // u6.e
        public float y() {
            return this.f46199a.y();
        }
    }

    public static final InterfaceC5422a a(Canvas canvas, int i10, e measureContext, D6.a aVar, InterfaceC6255b segmentProperties, RectF chartBounds, float f10, EnumC6077a autoScaleUp) {
        AbstractC6492s.i(canvas, "canvas");
        AbstractC6492s.i(measureContext, "measureContext");
        AbstractC6492s.i(segmentProperties, "segmentProperties");
        AbstractC6492s.i(chartBounds, "chartBounds");
        AbstractC6492s.i(autoScaleUp, "autoScaleUp");
        return new a(measureContext, chartBounds, canvas, i10, aVar, segmentProperties, f10, autoScaleUp);
    }
}
