package w1;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import d.h;
import km.i;
import nk.k;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f36410a;

    /* renamed from: b, reason: collision with root package name */
    public int f36411b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final i f36412c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f36410a = xmlResourceParser;
        i iVar = new i(24, false);
        iVar.f28426b = new float[64];
        this.f36412c = iVar;
    }

    public final float a(TypedArray typedArray, String str, int i4, float f10) {
        if (u3.b.e(this.f36410a, str)) {
            f10 = typedArray.getFloat(i4, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i4) {
        this.f36411b = i4 | this.f36411b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f36410a, aVar.f36410a) && this.f36411b == aVar.f36411b;
    }

    public final int hashCode() {
        return (this.f36410a.hashCode() * 31) + this.f36411b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f36410a);
        sb2.append(", config=");
        return h.u(sb2, this.f36411b, ')');
    }
}
