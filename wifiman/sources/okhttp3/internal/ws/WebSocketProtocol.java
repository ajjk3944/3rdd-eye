package okhttp3.internal.ws;

import ej.C5481e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "<init>", "()V", "Lej/e$a;", "cursor", "", "key", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lej/e$a;[B)V", "", "code", "", SnmpConfigurator.O_AUTH_PROTOCOL, "(I)Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "(I)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebSocketProtocol {

    /* renamed from: a, reason: collision with root package name */
    public static final WebSocketProtocol f56831a = new WebSocketProtocol();

    private WebSocketProtocol() {
    }

    public final String a(int code) {
        if (code < 1000 || code >= 5000) {
            return "Code must be in range [1000,5000): " + code;
        }
        if ((1004 > code || code >= 1007) && (1015 > code || code >= 3000)) {
            return null;
        }
        return "Code " + code + " is reserved and may not be used.";
    }

    public final void b(C5481e.a cursor, byte[] key) {
        AbstractC6492s.i(cursor, "cursor");
        AbstractC6492s.i(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.f46465e;
            int i11 = cursor.f46466f;
            int i12 = cursor.f46467g;
            if (bArr != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr[i11] = (byte) (bArr[i11] ^ key[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (cursor.g() != -1);
    }

    public final void c(int code) {
        String strA = a(code);
        if (strA == null) {
            return;
        }
        AbstractC6492s.f(strA);
        throw new IllegalArgumentException(strA.toString());
    }
}
