package v0;

import com.google.android.gms.internal.measurement.b4;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f23741a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f23741a);
        sb2.append(")@");
        int iHashCode = hashCode();
        b4.g(16);
        String string = Integer.toString(iHashCode, 16);
        br.l.d(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }
}
