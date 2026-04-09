package o6;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r6.InterfaceC7576b;
import u6.InterfaceC8137b;

/* renamed from: o6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7091b extends C7093d {

    /* renamed from: l, reason: collision with root package name */
    private float f55489l;

    public /* synthetic */ C7091b(int i10, float f10, InterfaceC7092c interfaceC7092c, InterfaceC7576b interfaceC7576b, w6.b bVar, float f11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? 2.0f : f10, (i12 & 4) != 0 ? C7094e.f55502a.b() : interfaceC7092c, (i12 & 8) != 0 ? null : interfaceC7576b, (i12 & 16) != 0 ? w6.d.a() : bVar, (i12 & 32) != 0 ? 0.0f : f11, (i12 & 64) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void j(C7091b c7091b, InterfaceC8137b interfaceC8137b, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawHorizontal");
        }
        if ((i10 & 16) != 0) {
            f13 = 1.0f;
        }
        c7091b.i(interfaceC8137b, f10, f11, f12, f13);
    }

    public static /* synthetic */ void l(C7091b c7091b, InterfaceC8137b interfaceC8137b, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawVertical");
        }
        if ((i10 & 16) != 0) {
            f13 = 1.0f;
        }
        c7091b.k(interfaceC8137b, f10, f11, f12, f13);
    }

    private final float m(u6.e eVar) {
        return eVar.g(this.f55489l);
    }

    public void i(InterfaceC8137b context, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        float f14 = 2;
        b(context, f10, f12 - ((m(context) * f13) / f14), f11, f12 + ((m(context) * f13) / f14));
    }

    public void k(InterfaceC8137b context, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        float f14 = 2;
        b(context, f12 - ((m(context) * f13) / f14), f10, f12 + ((m(context) * f13) / f14), f11);
    }

    public final float n() {
        return this.f55489l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7091b(int i10, float f10, InterfaceC7092c shape, InterfaceC7576b interfaceC7576b, w6.b margins, float f11, int i11) {
        super(shape, i10, interfaceC7576b, margins, f11, i11);
        AbstractC6492s.i(shape, "shape");
        AbstractC6492s.i(margins, "margins");
        this.f55489l = f10;
    }
}
