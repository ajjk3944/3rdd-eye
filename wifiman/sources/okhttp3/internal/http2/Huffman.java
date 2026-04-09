package okhttp3.internal.http2;

import Zg.AbstractC3682n;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import ej.h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import net.sqlcipher.database.SQLiteDatabase;
import okhttp3.internal.Util;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 ¨\u0006#"}, d2 = {"Lokhttp3/internal/http2/Huffman;", "", "<init>", "()V", "", "symbol", "code", "codeBitCount", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(III)V", "Lej/h;", "source", "Lej/f;", "sink", SnmpConfigurator.O_COMMUNITY, "(Lej/h;Lej/f;)V", "bytes", "d", "(Lej/h;)I", "Lej/g;", "", "byteCount", SnmpConfigurator.O_BIND_ADDRESS, "(Lej/g;JLej/f;)V", "", "[I", "CODES", "", "[B", "CODE_BIT_COUNTS", "Lokhttp3/internal/http2/Huffman$Node;", "Lokhttp3/internal/http2/Huffman$Node;", "root", "Node", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Huffman {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final byte[] CODE_BIT_COUNTS;

    /* renamed from: a, reason: collision with root package name */
    public static final Huffman f56683a = new Huffman();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Node root = new Node();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        CODE_BIT_COUNTS = bArr;
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            f56683a.a(i10, CODES[i10], CODE_BIT_COUNTS[i10]);
        }
    }

    private Huffman() {
    }

    private final void a(int symbol, int code, int codeBitCount) {
        Node node = new Node(symbol, codeBitCount);
        Node node2 = root;
        while (codeBitCount > 8) {
            codeBitCount -= 8;
            int i10 = (code >>> codeBitCount) & 255;
            Node[] children = node2.getChildren();
            AbstractC6492s.f(children);
            Node node3 = children[i10];
            if (node3 == null) {
                node3 = new Node();
                children[i10] = node3;
            }
            node2 = node3;
        }
        int i11 = 8 - codeBitCount;
        int i12 = (code << i11) & 255;
        Node[] children2 = node2.getChildren();
        AbstractC6492s.f(children2);
        AbstractC3682n.v(children2, node, i12, (1 << i11) + i12);
    }

    public final void b(InterfaceC5483g source, long byteCount, InterfaceC5482f sink) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(sink, "sink");
        Node node = root;
        int iD = 0;
        int terminalBitCount = 0;
        for (long j10 = 0; j10 < byteCount; j10++) {
            iD = (iD << 8) | Util.d(source.readByte(), 255);
            terminalBitCount += 8;
            while (terminalBitCount >= 8) {
                Node[] children = node.getChildren();
                AbstractC6492s.f(children);
                node = children[(iD >>> (terminalBitCount - 8)) & 255];
                AbstractC6492s.f(node);
                if (node.getChildren() == null) {
                    sink.u(node.getSymbol());
                    terminalBitCount -= node.getTerminalBitCount();
                    node = root;
                } else {
                    terminalBitCount -= 8;
                }
            }
        }
        while (terminalBitCount > 0) {
            Node[] children2 = node.getChildren();
            AbstractC6492s.f(children2);
            Node node2 = children2[(iD << (8 - terminalBitCount)) & 255];
            AbstractC6492s.f(node2);
            if (node2.getChildren() != null || node2.getTerminalBitCount() > terminalBitCount) {
                return;
            }
            sink.u(node2.getSymbol());
            terminalBitCount -= node2.getTerminalBitCount();
            node = root;
        }
    }

    public final void c(h source, InterfaceC5482f sink) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(sink, "sink");
        int iB0 = source.b0();
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iB0; i11++) {
            int iD = Util.d(source.l(i11), 255);
            int i12 = CODES[iD];
            byte b10 = CODE_BIT_COUNTS[iD];
            j10 = (j10 << b10) | i12;
            i10 += b10;
            while (i10 >= 8) {
                i10 -= 8;
                sink.u((int) (j10 >> i10));
            }
        }
        if (i10 > 0) {
            sink.u((int) ((j10 << (8 - i10)) | (255 >>> i10)));
        }
    }

    public final int d(h bytes) {
        AbstractC6492s.i(bytes, "bytes");
        long j10 = 0;
        for (int i10 = 0; i10 < bytes.b0(); i10++) {
            j10 += CODE_BIT_COUNTS[Util.d(bytes.l(i10), 255)];
        }
        return (int) ((j10 + 7) >> 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007R!\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/Huffman$Node;", "", "<init>", "()V", "", "symbol", "bits", "(II)V", "", SnmpConfigurator.O_AUTH_PROTOCOL, "[Lokhttp3/internal/http2/Huffman$Node;", "()[Lokhttp3/internal/http2/Huffman$Node;", "children", SnmpConfigurator.O_BIND_ADDRESS, "I", "()I", SnmpConfigurator.O_COMMUNITY, "terminalBitCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Node {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Node[] children;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int symbol;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        /* renamed from: a, reason: from getter */
        public final Node[] getChildren() {
            return this.children;
        }

        /* renamed from: b, reason: from getter */
        public final int getSymbol() {
            return this.symbol;
        }

        /* renamed from: c, reason: from getter */
        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public Node(int i10, int i11) {
            this.children = null;
            this.symbol = i10;
            int i12 = i11 & 7;
            this.terminalBitCount = i12 == 0 ? 8 : i12;
        }
    }
}
