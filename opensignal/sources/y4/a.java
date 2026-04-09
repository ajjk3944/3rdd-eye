package y4;

import a5.d0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f25839e = new a(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f25840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25841b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25842c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25843d;

    public a(int i10, int i11, int i12) {
        this.f25840a = i10;
        this.f25841b = i11;
        this.f25842c = i12;
        this.f25843d = d0.C(i12) ? d0.w(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25840a == aVar.f25840a && this.f25841b == aVar.f25841b && this.f25842c == aVar.f25842c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25840a), Integer.valueOf(this.f25841b), Integer.valueOf(this.f25842c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f25840a);
        sb2.append(", channelCount=");
        sb2.append(this.f25841b);
        sb2.append(", encoding=");
        return c7.a.q(sb2, this.f25842c, ']');
    }
}
