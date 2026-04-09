package t;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f33840a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f33841b;

    public e(int i4, CharSequence charSequence) {
        this.f33840a = i4;
        this.f33841b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f33840a != eVar.f33840a) {
            return false;
        }
        CharSequence charSequence = eVar.f33841b;
        CharSequence charSequence2 = this.f33841b;
        String string = charSequence2 != null ? charSequence2.toString() : null;
        String string2 = charSequence != null ? charSequence.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f33840a);
        CharSequence charSequence = this.f33841b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
