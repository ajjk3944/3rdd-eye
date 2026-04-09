package a8;

import Yg.A;
import Zg.AbstractC3689v;
import Zg.Q;
import h9.C5969a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.M;
import org.snmp4j.asn1.BER;

/* renamed from: a8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3772b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f25747c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25748a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25749b;

    /* renamed from: a8.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3772b a(String str) {
            AbstractC6492s.i(str, "str");
            C5969a c5969aE = C5969a.f48518b.e(str);
            if (c5969aE != null) {
                return b(c5969aE);
            }
            throw new IllegalStateException("Device id in invalid format: " + str);
        }

        public final C3772b b(C5969a c5969a) {
            AbstractC6492s.i(c5969a, "<this>");
            return new C3772b(c5969a);
        }

        public final String c(C3772b c3772b) {
            AbstractC6492s.i(c3772b, "<this>");
            C5969a c5969aD = C5969a.f48518b.d(c3772b.f25748a);
            AbstractC6492s.f(c5969aD);
            return c5969aD.d("");
        }

        private a() {
        }
    }

    /* renamed from: a8.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0980b {

        /* renamed from: a8.b$b$a */
        public static final class a extends AbstractC0980b {

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f25750a;

            /* renamed from: b, reason: collision with root package name */
            private final int f25751b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(byte[] bytes) {
                super(null);
                AbstractC6492s.i(bytes, "bytes");
                this.f25750a = bytes;
                this.f25751b = ByteBuffer.wrap(a(), 0, 4).getInt();
            }

            protected byte[] a() {
                return this.f25750a;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (a() == aVar.a()) {
                    return true;
                }
                return a()[0] == aVar.a()[0] && a()[1] == aVar.a()[1] && a()[4] == aVar.a()[4] && a()[5] == aVar.a()[5] && Math.abs(this.f25751b - aVar.f25751b) <= 12;
            }

            public int hashCode() {
                return (((((a()[0] * BER.ASN_EXTENSION_ID) + a()[1]) * 31) + a()[4]) * 31) + a()[5];
            }
        }

        /* renamed from: a8.b$b$b, reason: collision with other inner class name */
        public static final class C0981b extends AbstractC0980b {

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f25752a;

            /* renamed from: b, reason: collision with root package name */
            private final int f25753b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0981b(byte[] bytes) {
                super(null);
                AbstractC6492s.i(bytes, "bytes");
                this.f25752a = bytes;
                this.f25753b = ByteBuffer.wrap(a(), 2, 4).getInt();
            }

            protected byte[] a() {
                return this.f25752a;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C0981b)) {
                    return false;
                }
                C0981b c0981b = (C0981b) obj;
                if (a() == c0981b.a()) {
                    return true;
                }
                return a()[0] == c0981b.a()[0] && a()[1] == c0981b.a()[1] && a()[2] == c0981b.a()[2] && a()[3] == c0981b.a()[3] && Math.abs(this.f25753b - c0981b.f25753b) <= 12;
            }

            public int hashCode() {
                return (((((a()[0] * BER.ASN_EXTENSION_ID) + a()[1]) * 31) + a()[2]) * 31) + a()[3];
            }
        }

        /* renamed from: a8.b$b$c */
        public static final class c extends AbstractC0980b {

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f25754a;

            /* renamed from: b, reason: collision with root package name */
            private final int f25755b;

            /* renamed from: c, reason: collision with root package name */
            private final int f25756c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(byte[] bytes) {
                super(null);
                AbstractC6492s.i(bytes, "bytes");
                this.f25754a = bytes;
                this.f25755b = (A.b(a()[0]) & 255) >>> 2;
                this.f25756c = ByteBuffer.wrap(a(), 2, 4).getInt();
            }

            protected byte[] a() {
                return this.f25754a;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (a() == cVar.a()) {
                    return true;
                }
                return a()[1] == cVar.a()[1] && a()[2] == cVar.a()[2] && Math.abs(this.f25755b - cVar.f25755b) <= 6 && Math.abs(this.f25756c - cVar.f25756c) <= 6;
            }

            public int hashCode() {
                return (a()[1] * BER.ASN_EXTENSION_ID) + a()[2];
            }
        }

        public /* synthetic */ AbstractC0980b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0980b() {
        }
    }

    public C3772b(byte[] macBytes) {
        AbstractC6492s.i(macBytes, "macBytes");
        if (macBytes.length != 6) {
            throw new IllegalArgumentException("invalid device id bytes size: " + macBytes.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(macBytes, macBytes.length);
        AbstractC6492s.h(bArrCopyOf, "copyOf(...)");
        this.f25748a = bArrCopyOf;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & M.b("FC", 16));
        bArrCopyOf[3] = (byte) (bArrCopyOf[3] & M.b("0F", 16));
        this.f25749b = AbstractC3689v.o(new AbstractC0980b.C0981b(bArrCopyOf), new AbstractC0980b.a(bArrCopyOf), new AbstractC0980b.c(bArrCopyOf));
    }

    public final List b() {
        return this.f25749b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3772b)) {
            return false;
        }
        Iterator it = AbstractC3689v.m(this.f25749b).iterator();
        while (it.hasNext()) {
            int iD = ((Q) it).d();
            if (AbstractC6492s.d(this.f25749b.get(iD), ((C3772b) obj).f25749b.get(iD))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        byte[] bArr = this.f25748a;
        return (bArr[1] * BER.ASN_EXTENSION_ID) + bArr[2];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3772b(C5969a hwAddr) {
        this(hwAddr.g());
        AbstractC6492s.i(hwAddr, "hwAddr");
    }
}
