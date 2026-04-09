package a9;

import Yg.H;
import com.ui.btle.v2.BTLEv2$Error;
import com.ui.btle.v2.e;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3774b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25768b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25769a;

    /* renamed from: a9.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byte[] a(byte[] frame) {
            AbstractC6492s.i(frame, "frame");
            e.a.C1287a c1287a = e.a.C1287a.f41130a;
            int iA = c1287a.a() + frame.length;
            byte[] bArr = new byte[iA];
            if (iA > 65535) {
                throw new BTLEv2$Error.Protocol.InvalidPacketContent("BTLEv2 Packet payload length is limited to 65535 since it needs to be represented by 2 bytes. Current payload has " + iA + " bytes.");
            }
            short sB = H.b((short) iA);
            ByteBuffer v2FrameBuffer = ByteBuffer.wrap(bArr);
            AbstractC6492s.h(v2FrameBuffer, "v2FrameBuffer");
            c1287a.c(v2FrameBuffer, sB);
            e.b.f41133a.b(v2FrameBuffer, frame);
            return C3774b.c(bArr);
        }

        private a() {
        }
    }

    private /* synthetic */ C3774b(byte[] bArr) {
        this.f25769a = bArr;
    }

    public static final /* synthetic */ C3774b b(byte[] bArr) {
        return new C3774b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] c(byte[] bArr) {
        return bArr;
    }

    public static boolean d(byte[] bArr, Object obj) {
        return (obj instanceof C3774b) && AbstractC6492s.d(bArr, ((C3774b) obj).g());
    }

    public static int e(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static String f(byte[] bArr) {
        return "BTLEv2NetworkFrame(data=" + Arrays.toString(bArr) + ")";
    }

    public boolean equals(Object obj) {
        return d(this.f25769a, obj);
    }

    public final /* synthetic */ byte[] g() {
        return this.f25769a;
    }

    public int hashCode() {
        return e(this.f25769a);
    }

    public String toString() {
        return f(this.f25769a);
    }
}
