package x3;

import com.google.android.datatransport.Priority;
import java.util.Arrays;
import x3.o;

/* loaded from: classes2.dex */
public final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    public final String f24926a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24927b;

    /* renamed from: c, reason: collision with root package name */
    public final Priority f24928c;

    public static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        public String f24929a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f24930b;

        /* renamed from: c, reason: collision with root package name */
        public Priority f24931c;

        @Override // x3.o.a
        public o a() {
            String str = "";
            if (this.f24929a == null) {
                str = " backendName";
            }
            if (this.f24931c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f24929a, this.f24930b, this.f24931c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x3.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f24929a = str;
            return this;
        }

        @Override // x3.o.a
        public o.a c(byte[] bArr) {
            this.f24930b = bArr;
            return this;
        }

        @Override // x3.o.a
        public o.a d(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f24931c = priority;
            return this;
        }
    }

    @Override // x3.o
    public String b() {
        return this.f24926a;
    }

    @Override // x3.o
    public byte[] c() {
        return this.f24927b;
    }

    @Override // x3.o
    public Priority d() {
        return this.f24928c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f24926a.equals(oVar.b())) {
                if (Arrays.equals(this.f24927b, oVar instanceof d ? ((d) oVar).f24927b : oVar.c()) && this.f24928c.equals(oVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f24926a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24927b)) * 1000003) ^ this.f24928c.hashCode();
    }

    public d(String str, byte[] bArr, Priority priority) {
        this.f24926a = str;
        this.f24927b = bArr;
        this.f24928c = priority;
    }
}
