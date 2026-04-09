package B0;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: ComplexColorCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f342a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f343b;

    /* renamed from: c, reason: collision with root package name */
    public int f344c;

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f342a = shader;
        this.f343b = colorStateList;
        this.f344c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static B0.d a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):B0.d");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f342a == null && (colorStateList = this.f343b) != null && colorStateList.isStateful();
    }
}
