package b0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.AbstractC6507a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private int f32664a;

    public d(int i10) {
        this.f32664a = i10;
    }

    public final int a() {
        return this.f32664a;
    }

    public final void b(int i10) {
        this.f32664a = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IntRef(element = ");
        sb2.append(this.f32664a);
        sb2.append(")@");
        String string = Integer.toString(hashCode(), AbstractC6507a.a(16));
        AbstractC6492s.h(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
