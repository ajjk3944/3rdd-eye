package C7;

import Zg.AbstractC3682n;
import com.ubnt.discovery.server.lan.processing.parser.IllegalFieldSizeException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.jvm.internal.AbstractC6492s;
import t7.EnumC8038b;
import v7.C8195b;
import v7.EnumC8194a;
import y7.l;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2248a = new a();

    private a() {
    }

    public final EnumC8038b a(byte[] data) {
        AbstractC6492s.i(data, "data");
        int iB = C8195b.f63487a.b(data, EnumC8194a.BIG_ENDIAN);
        return (iB & 1) > 0 ? EnumC8038b.FACTORY_DEFAULT : (iB & 8) > 0 ? EnumC8038b.RECOVERY : EnumC8038b.NORMAL;
    }

    public final InetAddress b(byte[] data, int i10, int i11) throws UnknownHostException {
        AbstractC6492s.i(data, "data");
        InetAddress byAddress = InetAddress.getByAddress(AbstractC3682n.r(data, i10, i11));
        AbstractC6492s.f(byAddress);
        return byAddress;
    }

    public final l c(byte[] data) throws UnknownHostException {
        InetAddress inetAddressB;
        AbstractC6492s.i(data, "data");
        int length = data.length;
        if (length < 6) {
            throw new IllegalFieldSizeException(length, 6);
        }
        byte[] bArrR = AbstractC3682n.r(data, 0, 6);
        int i10 = length - 6;
        if (i10 == 0) {
            inetAddressB = null;
        } else {
            if (i10 != 4 && i10 != 16) {
                throw new IllegalStateException("Unknown data after hw address present (size = " + i10 + ")");
            }
            inetAddressB = b(data, 6, data.length);
        }
        return new l(bArrR, inetAddressB);
    }
}
