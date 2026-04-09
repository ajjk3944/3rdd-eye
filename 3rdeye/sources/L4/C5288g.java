package l4;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* renamed from: l4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5288g implements InterfaceC5284c {

    /* renamed from: a, reason: collision with root package name */
    public final float f43798a;

    public C5288g(float f10) {
        this.f43798a = f10;
    }

    @Override // l4.InterfaceC5284c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f43798a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5288g) && this.f43798a == ((C5288g) obj).f43798a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f43798a)});
    }
}
