package w7;

import N7.B8;
import N7.H7;
import android.graphics.Typeface;
import kotlin.jvm.internal.l;

/* compiled from: SliderTextStyle.kt */
/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5741a {

    /* renamed from: a, reason: collision with root package name */
    public final float f47498a;

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f47499b;

    /* renamed from: c, reason: collision with root package name */
    public final float f47500c;

    /* renamed from: d, reason: collision with root package name */
    public final float f47501d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47502e;

    public C5741a(float f10, Typeface typeface, float f11, float f12, int i) {
        this.f47498a = f10;
        this.f47499b = typeface;
        this.f47500c = f11;
        this.f47501d = f12;
        this.f47502e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5741a)) {
            return false;
        }
        C5741a c5741a = (C5741a) obj;
        return Float.compare(this.f47498a, c5741a.f47498a) == 0 && l.b(this.f47499b, c5741a.f47499b) && Float.compare(this.f47500c, c5741a.f47500c) == 0 && Float.compare(this.f47501d, c5741a.f47501d) == 0 && this.f47502e == c5741a.f47502e;
    }

    public final int hashCode() {
        return B8.g(this.f47501d, B8.g(this.f47500c, (this.f47499b.hashCode() + (Float.floatToIntBits(this.f47498a) * 31)) * 31, 31), 31) + this.f47502e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliderTextStyle(fontSize=");
        sb.append(this.f47498a);
        sb.append(", fontWeight=");
        sb.append(this.f47499b);
        sb.append(", offsetX=");
        sb.append(this.f47500c);
        sb.append(", offsetY=");
        sb.append(this.f47501d);
        sb.append(", textColor=");
        return H7.p(sb, this.f47502e, ')');
    }
}
