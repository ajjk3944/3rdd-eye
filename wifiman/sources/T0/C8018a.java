package t0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import s0.i;
import v1.d;
import v1.k;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8018a {

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParser f61667a;

    /* renamed from: b, reason: collision with root package name */
    private int f61668b;

    /* renamed from: c, reason: collision with root package name */
    public final i f61669c;

    public C8018a(XmlPullParser xmlPullParser, int i10) {
        this.f61667a = xmlPullParser;
        this.f61668b = i10;
        this.f61669c = new i();
    }

    private final void l(int i10) {
        this.f61668b = i10 | this.f61668b;
    }

    public final float a(TypedArray typedArray, int i10, float f10) {
        float dimension = typedArray.getDimension(i10, f10);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int i10, float f10) {
        float f11 = typedArray.getFloat(i10, f10);
        l(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int c(TypedArray typedArray, int i10, int i11) {
        int i12 = typedArray.getInt(i10, i11);
        l(typedArray.getChangingConfigurations());
        return i12;
    }

    public final boolean d(TypedArray typedArray, String str, int i10, boolean z10) {
        boolean zA = k.a(typedArray, this.f61667a, str, i10, z10);
        l(typedArray.getChangingConfigurations());
        return zA;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        ColorStateList colorStateListC = k.c(typedArray, this.f61667a, theme, str, i10);
        l(typedArray.getChangingConfigurations());
        return colorStateListC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8018a)) {
            return false;
        }
        C8018a c8018a = (C8018a) obj;
        return AbstractC6492s.d(this.f61667a, c8018a.f61667a) && this.f61668b == c8018a.f61668b;
    }

    public final d f(TypedArray typedArray, Resources.Theme theme, String str, int i10, int i11) {
        d dVarE = k.e(typedArray, this.f61667a, theme, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        return dVarE;
    }

    public final float g(TypedArray typedArray, String str, int i10, float f10) {
        float f11 = k.f(typedArray, this.f61667a, str, i10, f10);
        l(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int h(TypedArray typedArray, String str, int i10, int i11) {
        int iG = k.g(typedArray, this.f61667a, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        return iG;
    }

    public int hashCode() {
        return (this.f61667a.hashCode() * 31) + Integer.hashCode(this.f61668b);
    }

    public final String i(TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.f61667a;
    }

    public final TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, iArr);
        l(typedArrayI.getChangingConfigurations());
        return typedArrayI;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f61667a + ", config=" + this.f61668b + ')';
    }

    public /* synthetic */ C8018a(XmlPullParser xmlPullParser, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}
