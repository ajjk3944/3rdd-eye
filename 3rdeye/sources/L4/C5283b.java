package l4;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5283b implements InterfaceC5284c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5284c f43756a;

    /* renamed from: b, reason: collision with root package name */
    public final float f43757b;

    public C5283b(float f10, InterfaceC5284c interfaceC5284c) {
        while (interfaceC5284c instanceof C5283b) {
            interfaceC5284c = ((C5283b) interfaceC5284c).f43756a;
            f10 += ((C5283b) interfaceC5284c).f43757b;
        }
        this.f43756a = interfaceC5284c;
        this.f43757b = f10;
    }

    @Override // l4.InterfaceC5284c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f43756a.a(rectF) + this.f43757b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5283b)) {
            return false;
        }
        C5283b c5283b = (C5283b) obj;
        return this.f43756a.equals(c5283b.f43756a) && this.f43757b == c5283b.f43757b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43756a, Float.valueOf(this.f43757b)});
    }
}
