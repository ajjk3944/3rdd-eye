package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6537m;
import m0.AbstractC6735w0;
import m0.C6733v0;
import o0.InterfaceC7039f;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7553c extends AbstractC7554d {

    /* renamed from: g, reason: collision with root package name */
    private final long f59944g;

    /* renamed from: h, reason: collision with root package name */
    private float f59945h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC6735w0 f59946i;

    /* renamed from: j, reason: collision with root package name */
    private final long f59947j;

    public /* synthetic */ C7553c(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // r0.AbstractC7554d
    protected boolean a(float f10) {
        this.f59945h = f10;
        return true;
    }

    @Override // r0.AbstractC7554d
    protected boolean e(AbstractC6735w0 abstractC6735w0) {
        this.f59946i = abstractC6735w0;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7553c) && C6733v0.m(this.f59944g, ((C7553c) obj).f59944g);
    }

    public int hashCode() {
        return C6733v0.s(this.f59944g);
    }

    @Override // r0.AbstractC7554d
    public long l() {
        return this.f59947j;
    }

    @Override // r0.AbstractC7554d
    protected void n(InterfaceC7039f interfaceC7039f) {
        InterfaceC7039f.u0(interfaceC7039f, this.f59944g, 0L, 0L, this.f59945h, null, this.f59946i, 0, 86, null);
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) C6733v0.t(this.f59944g)) + ')';
    }

    private C7553c(long j10) {
        this.f59944g = j10;
        this.f59945h = 1.0f;
        this.f59947j = C6537m.f52356b.a();
    }
}
