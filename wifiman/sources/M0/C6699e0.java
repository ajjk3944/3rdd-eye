package m0;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6699e0 extends AbstractC6735w0 {

    /* renamed from: c, reason: collision with root package name */
    private final long f52910c;

    /* renamed from: d, reason: collision with root package name */
    private final int f52911d;

    public /* synthetic */ C6699e0(long j10, int i10, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, colorFilter);
    }

    public final int b() {
        return this.f52911d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6699e0)) {
            return false;
        }
        C6699e0 c6699e0 = (C6699e0) obj;
        return C6733v0.m(this.f52910c, c6699e0.f52910c) && AbstractC6697d0.E(this.f52911d, c6699e0.f52911d);
    }

    public int hashCode() {
        return (C6733v0.s(this.f52910c) * 31) + AbstractC6697d0.F(this.f52911d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) C6733v0.t(this.f52910c)) + ", blendMode=" + ((Object) AbstractC6697d0.G(this.f52911d)) + ')';
    }

    public /* synthetic */ C6699e0(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10);
    }

    private C6699e0(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f52910c = j10;
        this.f52911d = i10;
    }

    private C6699e0(long j10, int i10) {
        this(j10, i10, AbstractC6672I.a(j10, i10), null);
    }
}
