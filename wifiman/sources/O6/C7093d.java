package o6;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import m6.AbstractC6775a;
import n6.AbstractC6874c;
import ph.AbstractC7332b;
import ph.C7331a;
import r6.InterfaceC7576b;
import s6.C7913a;
import th.l;
import u6.InterfaceC8137b;
import v6.C8193a;
import y6.AbstractC8613b;

/* renamed from: o6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7093d extends AbstractC6775a {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ l[] f55490k = {O.f(new z(C7093d.class, "color", "getColor()I", 0)), O.f(new z(C7093d.class, "strokeColor", "getStrokeColor()I", 0))};

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7092c f55491b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7576b f55492c;

    /* renamed from: d, reason: collision with root package name */
    private final float f55493d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f55494e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f55495f;

    /* renamed from: g, reason: collision with root package name */
    private final C7913a f55496g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f55497h;

    /* renamed from: i, reason: collision with root package name */
    private final ph.d f55498i;

    /* renamed from: j, reason: collision with root package name */
    private final ph.d f55499j;

    /* renamed from: o6.d$a */
    public static final class a extends AbstractC7332b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7093d f55500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, C7093d c7093d) {
            super(obj);
            this.f55500b = c7093d;
        }

        @Override // ph.AbstractC7332b
        protected void c(l property, Object obj, Object obj2) {
            AbstractC6492s.i(property, "property");
            int iIntValue = ((Number) obj2).intValue();
            ((Number) obj).intValue();
            this.f55500b.f55494e.setColor(iIntValue);
        }
    }

    /* renamed from: o6.d$b */
    public static final class b extends AbstractC7332b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7093d f55501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, C7093d c7093d) {
            super(obj);
            this.f55501b = c7093d;
        }

        @Override // ph.AbstractC7332b
        protected void c(l property, Object obj, Object obj2) {
            AbstractC6492s.i(property, "property");
            int iIntValue = ((Number) obj2).intValue();
            ((Number) obj).intValue();
            this.f55501b.f55495f.setColor(iIntValue);
        }
    }

    public /* synthetic */ C7093d(InterfaceC7092c interfaceC7092c, int i10, InterfaceC7576b interfaceC7576b, w6.b bVar, float f10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? C7094e.f55502a.b() : interfaceC7092c, (i12 & 2) != 0 ? -16777216 : i10, (i12 & 4) != 0 ? null : interfaceC7576b, (i12 & 8) != 0 ? w6.d.a() : bVar, (i12 & 16) != 0 ? 0.0f : f10, (i12 & 32) != 0 ? 0 : i11);
    }

    private static final void f(C7093d c7093d, InterfaceC8137b interfaceC8137b, float f10, InterfaceC8137b interfaceC8137b2, float f11, float f12, float f13, float f14, float f15, float f16, Paint paint) {
        float f17 = f11 / 2;
        c7093d.f55491b.a(interfaceC8137b, paint, c7093d.f55497h, Math.min(f10 + interfaceC8137b2.g(c7093d.a().d()) + f17, f12), Math.min(f13 + interfaceC8137b2.g(c7093d.a().c()) + f17, f14), Math.max((f15 - interfaceC8137b2.g(c7093d.a().b())) - f17, f12), Math.max((f16 - interfaceC8137b2.g(c7093d.a().a())) - f17, f14));
    }

    @Override // m6.AbstractC6775a
    public void b(InterfaceC8137b context, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        if (f10 == f12 || f11 == f13) {
            return;
        }
        this.f55497h.rewind();
        e(context, f10, f11, f12, f13);
        float f14 = 2;
        float f15 = (f10 + f12) / f14;
        float f16 = (f11 + f13) / f14;
        this.f55496g.a(context, this.f55494e, g());
        float fG = context.g(this.f55493d);
        this.f55495f.setStrokeWidth(fG);
        f(this, context, f10, context, fG, f15, f11, f16, f12, f13, this.f55494e);
        if (fG > 0.0f && AbstractC8613b.e(h()) > 0) {
            f(this, context, f10, context, fG, f15, f11, f16, f12, f13, this.f55495f);
        }
        C8193a.f63483a.a(context, f10, f11, f12, f13);
    }

    protected final void e(InterfaceC8137b context, float f10, float f11, float f12, float f13) {
        Shader shaderA;
        AbstractC6492s.i(context, "context");
        InterfaceC7576b interfaceC7576b = this.f55492c;
        if (interfaceC7576b == null || (shaderA = interfaceC7576b.a(context, f10, f11, f12, f13)) == null) {
            return;
        }
        this.f55494e.setShader(shaderA);
    }

    public final int g() {
        return ((Number) this.f55498i.a(this, f55490k[0])).intValue();
    }

    public final int h() {
        return ((Number) this.f55499j.a(this, f55490k[1])).intValue();
    }

    public C7093d(InterfaceC7092c shape, int i10, InterfaceC7576b interfaceC7576b, w6.b margins, float f10, int i11) {
        AbstractC6492s.i(shape, "shape");
        AbstractC6492s.i(margins, "margins");
        this.f55491b = shape;
        this.f55492c = interfaceC7576b;
        this.f55493d = f10;
        Paint paint = new Paint(1);
        this.f55494e = paint;
        Paint paint2 = new Paint(1);
        this.f55495f = paint2;
        this.f55496g = new C7913a(0.0f, 0.0f, 0.0f, 0, false, 31, null);
        this.f55497h = new Path();
        C7331a c7331a = C7331a.f58040a;
        this.f55498i = new a(Integer.valueOf(i10), this);
        this.f55499j = new b(Integer.valueOf(i11), this);
        paint.setColor(i10);
        paint2.setColor(i11);
        paint2.setStyle(Paint.Style.STROKE);
        AbstractC6874c.a(this, margins);
    }
}
