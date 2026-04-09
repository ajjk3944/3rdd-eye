package T8;

import gg.AbstractC5912b;
import gg.s;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f21459a;

        private /* synthetic */ a(byte[] bArr) {
            this.f21459a = bArr;
        }

        public static final /* synthetic */ a a(byte[] bArr) {
            return new a(bArr);
        }

        public static byte[] b(byte[] payload) {
            AbstractC6492s.i(payload, "payload");
            return payload;
        }

        public static boolean c(byte[] bArr, Object obj) {
            return (obj instanceof a) && AbstractC6492s.d(bArr, ((a) obj).f());
        }

        public static int d(byte[] bArr) {
            return Arrays.hashCode(bArr);
        }

        public static String e(byte[] bArr) {
            return "Message(payload=" + Arrays.toString(bArr) + ")";
        }

        public boolean equals(Object obj) {
            return c(this.f21459a, obj);
        }

        public final /* synthetic */ byte[] f() {
            return this.f21459a;
        }

        public int hashCode() {
            return d(this.f21459a);
        }

        public String toString() {
            return e(this.f21459a);
        }
    }

    s a();

    AbstractC5912b b(List list);
}
