package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final k0.a f21703a;

    /* renamed from: b, reason: collision with root package name */
    public final xk.h f21704b;

    public e(k0.a aVar, xk.h hVar) {
        this.f21703a = aVar;
        this.f21704b = hVar;
    }

    public final String toString() {
        String strT;
        xk.h hVar = this.f21704b;
        xk.u uVar = (xk.u) hVar.f37194e.O(xk.u.f37240c);
        String str = uVar != null ? uVar.f37241b : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        com.bumptech.glide.d.g(16);
        String string = Integer.toString(iHashCode, 16);
        nk.k.d(string, "toString(...)");
        sb2.append(string);
        if (str == null || (strT = d.h.t("[", str, "](")) == null) {
            strT = "(";
        }
        sb2.append(strT);
        sb2.append("currentBounds()=");
        sb2.append(this.f21703a.invoke());
        sb2.append(", continuation=");
        sb2.append(hVar);
        sb2.append(')');
        return sb2.toString();
    }
}
