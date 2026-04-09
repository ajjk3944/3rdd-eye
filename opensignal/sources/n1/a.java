package n1;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import br.l;
import h7.h0;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f17370a;

    /* renamed from: b, reason: collision with root package name */
    public int f17371b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f17372c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f17370a = xmlResourceParser;
        h0 h0Var = new h0();
        h0Var.f10078a = new float[64];
        this.f17372c = h0Var;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f10) {
        if (j3.b.d(this.f17370a, str)) {
            f10 = typedArray.getFloat(i10, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i10) {
        this.f17371b = i10 | this.f17371b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f17370a, aVar.f17370a) && this.f17371b == aVar.f17371b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17371b) + (this.f17370a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f17370a);
        sb2.append(", config=");
        return c7.a.q(sb2, this.f17371b, ')');
    }
}
