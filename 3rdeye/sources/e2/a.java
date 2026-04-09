package E2;

import B4.g;
import N7.C1154e9;
import N7.G8;
import android.graphics.RectF;

/* compiled from: Classifier.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1361b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f1362c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f1363d;

    public a(String str, String str2, Float f10, RectF rectF) {
        this.f1360a = str;
        this.f1361b = str2;
        this.f1362c = f10;
        this.f1363d = rectF;
    }

    public final String toString() {
        String str = this.f1360a;
        String strI = str != null ? C1154e9.i("[", str, "] ") : "";
        String str2 = this.f1361b;
        if (str2 != null) {
            strI = g.o(strI, str2, " ");
        }
        Float f10 = this.f1362c;
        if (f10 != null) {
            StringBuilder sbU = G8.u(strI);
            sbU.append(String.format("(%.1f%%) ", Float.valueOf(f10.floatValue() * 100.0f)));
            strI = sbU.toString();
        }
        if (this.f1363d != null) {
            StringBuilder sbU2 = G8.u(strI);
            sbU2.append(this.f1363d);
            sbU2.append(" ");
            strI = sbU2.toString();
        }
        return strI.trim();
    }
}
