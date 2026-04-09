package j6;

import a6.EnumC3767a;
import j6.InterfaceC6255b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6254a implements InterfaceC6255b {

    /* renamed from: a, reason: collision with root package name */
    private float f50131a;

    /* renamed from: b, reason: collision with root package name */
    private float f50132b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC3767a f50133c;

    public C6254a(float f10, float f11, EnumC3767a enumC3767a) {
        this.f50131a = f10;
        this.f50132b = f11;
        this.f50133c = enumC3767a;
    }

    @Override // j6.InterfaceC6255b
    public float a() {
        return InterfaceC6255b.a.c(this);
    }

    @Override // j6.InterfaceC6255b
    public final float b() {
        return e();
    }

    @Override // j6.InterfaceC6255b
    public InterfaceC6255b c(float f10) {
        return InterfaceC6255b.a.d(this, f10);
    }

    @Override // j6.InterfaceC6255b
    public EnumC3767a d() {
        return this.f50133c;
    }

    @Override // j6.InterfaceC6255b
    public float e() {
        return this.f50132b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6254a)) {
            return false;
        }
        C6254a c6254a = (C6254a) obj;
        return Float.compare(g(), c6254a.g()) == 0 && Float.compare(e(), c6254a.e()) == 0 && d() == c6254a.d();
    }

    @Override // j6.InterfaceC6255b
    public final float f() {
        return g();
    }

    @Override // j6.InterfaceC6255b
    public float g() {
        return this.f50131a;
    }

    public final C6254a h(float f10, float f11, EnumC3767a enumC3767a) {
        i(f10);
        k(f11);
        j(enumC3767a);
        return this;
    }

    public int hashCode() {
        return (((Float.hashCode(g()) * 31) + Float.hashCode(e())) * 31) + (d() == null ? 0 : d().hashCode());
    }

    public void i(float f10) {
        this.f50131a = f10;
    }

    public void j(EnumC3767a enumC3767a) {
        this.f50133c = enumC3767a;
    }

    public void k(float f10) {
        this.f50132b = f10;
    }

    public String toString() {
        return "MutableSegmentProperties(segmentWidth=" + a() + ", contentWidth=" + g() + ", marginWidth=" + e() + ')';
    }

    public /* synthetic */ C6254a(float f10, float f11, EnumC3767a enumC3767a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? null : enumC3767a);
    }
}
