package l4;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5282a implements InterfaceC5284c {

    /* renamed from: a, reason: collision with root package name */
    public final float f43755a;

    public C5282a(float f10) {
        this.f43755a = f10;
    }

    @Override // l4.InterfaceC5284c
    public final float a(RectF rectF) {
        return this.f43755a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5282a) && this.f43755a == ((C5282a) obj).f43755a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f43755a)});
    }
}
