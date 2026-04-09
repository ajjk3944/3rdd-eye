package ea;

import com.google.android.gms.internal.consent_sdk.a0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f22486a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f22487b;

    /* renamed from: c, reason: collision with root package name */
    public final l f22488c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22489d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22490e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f22491f;
    public final Integer g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22492h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f22493i;
    public final byte[] j;

    public h(String str, Integer num, l lVar, long j, long j8, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f22486a = str;
        this.f22487b = num;
        this.f22488c = lVar;
        this.f22489d = j;
        this.f22490e = j8;
        this.f22491f = map;
        this.g = num2;
        this.f22492h = str2;
        this.f22493i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f22491f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f22491f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a0 c() {
        a0 a0Var = new a0(1);
        String str = this.f22486a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        a0Var.f19255b = str;
        a0Var.f19257d = this.f22487b;
        a0Var.f19261i = this.g;
        a0Var.f19256c = this.f22492h;
        a0Var.j = this.f22493i;
        a0Var.f19262k = this.j;
        l lVar = this.f22488c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        a0Var.f19258e = lVar;
        a0Var.f19259f = Long.valueOf(this.f22489d);
        a0Var.g = Long.valueOf(this.f22490e);
        a0Var.f19260h = new HashMap(this.f22491f);
        return a0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str2 = hVar.f22492h;
            Integer num3 = hVar.g;
            Integer num4 = hVar.f22487b;
            if (this.f22486a.equals(hVar.f22486a) && ((num = this.f22487b) != null ? num.equals(num4) : num4 == null) && this.f22488c.equals(hVar.f22488c) && this.f22489d == hVar.f22489d && this.f22490e == hVar.f22490e && this.f22491f.equals(hVar.f22491f) && ((num2 = this.g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f22492h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f22493i, hVar.f22493i) && Arrays.equals(this.j, hVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f22486a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f22487b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f22488c.hashCode()) * 1000003;
        long j = this.f22489d;
        int i4 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j8 = this.f22490e;
        int iHashCode3 = (((i4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f22491f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f22492h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f22493i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f22486a + ", code=" + this.f22487b + ", encodedPayload=" + this.f22488c + ", eventMillis=" + this.f22489d + ", uptimeMillis=" + this.f22490e + ", autoMetadata=" + this.f22491f + ", productId=" + this.g + ", pseudonymousId=" + this.f22492h + ", experimentIdsClear=" + Arrays.toString(this.f22493i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
