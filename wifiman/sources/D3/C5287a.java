package d3;

import d3.AbstractC5292f;
import java.util.Arrays;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5287a extends AbstractC5292f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f45729a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f45730b;

    /* renamed from: d3.a$b */
    static final class b extends AbstractC5292f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f45731a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f45732b;

        b() {
        }

        @Override // d3.AbstractC5292f.a
        public AbstractC5292f a() {
            String str = "";
            if (this.f45731a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C5287a(this.f45731a, this.f45732b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d3.AbstractC5292f.a
        public AbstractC5292f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f45731a = iterable;
            return this;
        }

        @Override // d3.AbstractC5292f.a
        public AbstractC5292f.a c(byte[] bArr) {
            this.f45732b = bArr;
            return this;
        }
    }

    @Override // d3.AbstractC5292f
    public Iterable b() {
        return this.f45729a;
    }

    @Override // d3.AbstractC5292f
    public byte[] c() {
        return this.f45730b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5292f)) {
            return false;
        }
        AbstractC5292f abstractC5292f = (AbstractC5292f) obj;
        if (this.f45729a.equals(abstractC5292f.b())) {
            if (Arrays.equals(this.f45730b, abstractC5292f instanceof C5287a ? ((C5287a) abstractC5292f).f45730b : abstractC5292f.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f45729a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f45730b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f45729a + ", extras=" + Arrays.toString(this.f45730b) + "}";
    }

    private C5287a(Iterable iterable, byte[] bArr) {
        this.f45729a = iterable;
        this.f45730b = bArr;
    }
}
