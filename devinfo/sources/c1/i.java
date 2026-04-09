package c1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f2562a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f2562a);
        sb2.append(")@");
        int iHashCode = hashCode();
        com.bumptech.glide.d.g(16);
        String string = Integer.toString(iHashCode, 16);
        nk.k.d(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }
}
