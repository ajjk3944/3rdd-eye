package m9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16351a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f16352b;

    /* renamed from: c, reason: collision with root package name */
    public final k f16353c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16354d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16355e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f16356f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f16357g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16358h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f16359i;
    public final byte[] j;

    public h(String str, Integer num, k kVar, long j, long j7, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f16351a = str;
        this.f16352b = num;
        this.f16353c = kVar;
        this.f16354d = j;
        this.f16355e = j7;
        this.f16356f = map;
        this.f16357g = num2;
        this.f16358h = str2;
        this.f16359i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f16356f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f16356f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final al.c c() {
        al.c cVar = new al.c(4);
        String str = this.f16351a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        cVar.f820b = str;
        cVar.f821c = this.f16352b;
        cVar.f826h = this.f16357g;
        cVar.f827i = this.f16358h;
        cVar.j = this.f16359i;
        cVar.k = this.j;
        k kVar = this.f16353c;
        if (kVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        cVar.f822d = kVar;
        cVar.f823e = Long.valueOf(this.f16354d);
        cVar.f824f = Long.valueOf(this.f16355e);
        cVar.f825g = new HashMap(this.f16356f);
        return cVar;
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
            String str2 = hVar.f16358h;
            Integer num3 = hVar.f16357g;
            Integer num4 = hVar.f16352b;
            if (this.f16351a.equals(hVar.f16351a) && ((num = this.f16352b) != null ? num.equals(num4) : num4 == null) && this.f16353c.equals(hVar.f16353c) && this.f16354d == hVar.f16354d && this.f16355e == hVar.f16355e && this.f16356f.equals(hVar.f16356f) && ((num2 = this.f16357g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f16358h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f16359i, hVar.f16359i) && Arrays.equals(this.j, hVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f16351a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f16352b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f16353c.hashCode()) * 1000003;
        long j = this.f16354d;
        int i10 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f16355e;
        int iHashCode3 = (((i10 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f16356f.hashCode()) * 1000003;
        Integer num2 = this.f16357g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f16358h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f16359i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f16351a + ", code=" + this.f16352b + ", encodedPayload=" + this.f16353c + ", eventMillis=" + this.f16354d + ", uptimeMillis=" + this.f16355e + ", autoMetadata=" + this.f16356f + ", productId=" + this.f16357g + ", pseudonymousId=" + this.f16358h + ", experimentIdsClear=" + Arrays.toString(this.f16359i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
