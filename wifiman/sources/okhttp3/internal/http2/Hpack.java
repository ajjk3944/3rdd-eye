package okhttp3.internal.http2;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import ej.C5481e;
import ej.InterfaceC5476D;
import ej.InterfaceC5483g;
import ej.h;
import ej.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.asn1.BER;
import org.snmp4j.mp.MPv3;
import org.snmp4j.transport.TLSTM;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\b¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "", "Lej/h;", "", "d", "()Ljava/util/Map;", "name", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lej/h;)Lej/h;", "", "Lokhttp3/internal/http2/Header;", SnmpConfigurator.O_BIND_ADDRESS, "[Lokhttp3/internal/http2/Header;", SnmpConfigurator.O_COMMUNITY, "()[Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Hpack {

    /* renamed from: a, reason: collision with root package name */
    public static final Hpack f56523a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Header[] STATIC_HEADER_TABLE;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map NAME_TO_FIRST_INDEX;

    static {
        Hpack hpack = new Hpack();
        f56523a = hpack;
        Header header = new Header(Header.f56519j, "");
        h hVar = Header.f56516g;
        Header header2 = new Header(hVar, "GET");
        Header header3 = new Header(hVar, "POST");
        h hVar2 = Header.f56517h;
        Header header4 = new Header(hVar2, MqttTopic.TOPIC_LEVEL_SEPARATOR);
        Header header5 = new Header(hVar2, "/index.html");
        h hVar3 = Header.f56518i;
        Header header6 = new Header(hVar3, "http");
        Header header7 = new Header(hVar3, "https");
        h hVar4 = Header.f56515f;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(hVar4, "200"), new Header(hVar4, "204"), new Header(hVar4, "206"), new Header(hVar4, "304"), new Header(hVar4, "400"), new Header(hVar4, "404"), new Header(hVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.d();
    }

    private Hpack() {
    }

    private final Map d() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i10].name)) {
                linkedHashMap.put(headerArr2[i10].name, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC6492s.h(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final h a(h name) throws IOException {
        AbstractC6492s.i(name, "name");
        int iB0 = name.b0();
        for (int i10 = 0; i10 < iB0; i10++) {
            byte bL = name.l(i10);
            if (65 <= bL && bL < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.q0());
            }
        }
        return name;
    }

    public final Map b() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] c() {
        return STATIC_HEADER_TABLE;
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u000bJ\u001d\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\u0003\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0016\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010/¨\u0006;"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "Lej/D;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lej/D;II)V", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "()V", SnmpConfigurator.O_BIND_ADDRESS, "bytesToRecover", "d", "(I)I", "index", "l", "(I)V", SnmpConfigurator.O_COMMUNITY, "p", "q", "nameIndex", SnmpConfigurator.O_CONTEXT_NAME, SnmpConfigurator.O_OPERATION, "Lej/h;", "f", "(I)Lej/h;", "", "h", "(I)Z", "Lokhttp3/internal/http2/Header;", "entry", "g", "(ILokhttp3/internal/http2/Header;)V", "i", "()I", "", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Ljava/util/List;", "k", "firstByte", "prefixMask", "m", "(II)I", "j", "()Lej/h;", "I", "", "Ljava/util/List;", "headerList", "Lej/g;", "Lej/g;", "", "[Lokhttp3/internal/http2/Header;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Reader {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int headerTableSizeSetting;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int maxDynamicTableByteCount;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List headerList;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5483g source;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public Header[] dynamicTable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        public Reader(InterfaceC5476D source, int i10, int i11) {
            AbstractC6492s.i(source, "source");
            this.headerTableSizeSetting = i10;
            this.maxDynamicTableByteCount = i11;
            this.headerList = new ArrayList();
            this.source = p.d(source);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final void a() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC3682n.y(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final int d(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    AbstractC6492s.f(header);
                    int i12 = header.hpackSize;
                    bytesToRecover -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final h f(int index) throws IOException {
            if (h(index)) {
                return Hpack.f56523a.c()[index].name;
            }
            int iC = c(index - Hpack.f56523a.c().length);
            if (iC >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iC < headerArr.length) {
                    Header header = headerArr[iC];
                    AbstractC6492s.f(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void g(int index, Header entry) {
            this.headerList.add(entry);
            int i10 = entry.hpackSize;
            if (index != -1) {
                Header header = this.dynamicTable[c(index)];
                AbstractC6492s.f(header);
                i10 -= header.hpackSize;
            }
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                b();
                return;
            }
            int iD = d((this.dynamicTableByteCount + i10) - i11);
            if (index == -1) {
                int i12 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i12 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i13 = this.nextHeaderIndex;
                this.nextHeaderIndex = i13 - 1;
                this.dynamicTable[i13] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + c(index) + iD] = entry;
            }
            this.dynamicTableByteCount += i10;
        }

        private final boolean h(int index) {
            return index >= 0 && index <= Hpack.f56523a.c().length - 1;
        }

        private final int i() {
            return Util.d(this.source.readByte(), 255);
        }

        private final void l(int index) throws IOException {
            if (h(index)) {
                this.headerList.add(Hpack.f56523a.c()[index]);
                return;
            }
            int iC = c(index - Hpack.f56523a.c().length);
            if (iC >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iC < headerArr.length) {
                    List list = this.headerList;
                    Header header = headerArr[iC];
                    AbstractC6492s.f(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void n(int nameIndex) {
            g(-1, new Header(f(nameIndex), j()));
        }

        private final void o() {
            g(-1, new Header(Hpack.f56523a.a(j()), j()));
        }

        private final void p(int index) throws IOException {
            this.headerList.add(new Header(f(index), j()));
        }

        private final void q() throws IOException {
            this.headerList.add(new Header(Hpack.f56523a.a(j()), j()));
        }

        public final List e() {
            List listI1 = AbstractC3689v.i1(this.headerList);
            this.headerList.clear();
            return listI1;
        }

        public final h j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long jM = m(i10, BER.MAX_OID_LENGTH);
            if (!z10) {
                return this.source.l(jM);
            }
            C5481e c5481e = new C5481e();
            Huffman.f56683a.b(this.source, jM, c5481e);
            return c5481e.v0();
        }

        public final void k() throws IOException {
            while (!this.source.t()) {
                int iD = Util.d(this.source.readByte(), 255);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    l(m(iD, BER.MAX_OID_LENGTH) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.maxDynamicTableByteCount = iM;
                    if (iM < 0 || iM > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final int m(int firstByte, int prefixMask) {
            int i10 = firstByte & prefixMask;
            if (i10 < prefixMask) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = i();
                if ((i12 & 128) == 0) {
                    return prefixMask + (i12 << i11);
                }
                prefixMask += (i12 & BER.MAX_OID_LENGTH) << i11;
                i11 += 7;
            }
        }

        public /* synthetic */ Reader(InterfaceC5476D interfaceC5476D, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC5476D, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010$R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010$¨\u00062"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "", "headerTableSizeSetting", "", "useCompression", "Lej/e;", "out", "<init>", "(IZLej/e;)V", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "()V", "bytesToRecover", SnmpConfigurator.O_COMMUNITY, "(I)I", "Lokhttp3/internal/http2/Header;", "entry", "d", "(Lokhttp3/internal/http2/Header;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "", "headerBlock", "g", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "h", "(III)V", "Lej/h;", "data", "f", "(Lej/h;)V", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(I)V", "I", "Z", "Lej/e;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[Lokhttp3/internal/http2/Header;", "dynamicTable", "nextHeaderIndex", "i", "headerCount", "j", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Writer {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public int headerTableSizeSetting;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean useCompression;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C5481e out;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int smallestHeaderTableSizeSetting;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean emitDynamicTableSizeUpdate;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int maxDynamicTableByteCount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public Header[] dynamicTable;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        public Writer(int i10, boolean z10, C5481e out) {
            AbstractC6492s.i(out, "out");
            this.headerTableSizeSetting = i10;
            this.useCompression = z10;
            this.out = out;
            this.smallestHeaderTableSizeSetting = MPv3.MAX_MESSAGE_ID;
            this.maxDynamicTableByteCount = i10;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final void a() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC3682n.y(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    AbstractC6492s.f(header);
                    bytesToRecover -= header.hpackSize;
                    int i12 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    AbstractC6492s.f(header2);
                    this.dynamicTableByteCount = i12 - header2.hpackSize;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i13 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final void d(Header entry) {
            int i10 = entry.hpackSize;
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i13 = this.nextHeaderIndex;
            this.nextHeaderIndex = i13 - 1;
            this.dynamicTable[i13] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        public final void e(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, TLSTM.TLS_MAX_FRAGMENT_SIZE);
            int i10 = this.maxDynamicTableByteCount;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            a();
        }

        public final void f(h data) {
            AbstractC6492s.i(data, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.f56683a;
                if (huffman.d(data) < data.b0()) {
                    C5481e c5481e = new C5481e();
                    huffman.c(data, c5481e);
                    h hVarV0 = c5481e.v0();
                    h(hVarV0.b0(), BER.MAX_OID_LENGTH, 128);
                    this.out.R(hVarV0);
                    return;
                }
            }
            h(data.b0(), BER.MAX_OID_LENGTH, 0);
            this.out.R(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List r13) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.g(java.util.List):void");
        }

        public final void h(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.u(value | bits);
                return;
            }
            this.out.u(bits | prefixMask);
            int i10 = value - prefixMask;
            while (i10 >= 128) {
                this.out.u(128 | (i10 & BER.MAX_OID_LENGTH));
                i10 >>>= 7;
            }
            this.out.u(i10);
        }

        public /* synthetic */ Writer(int i10, boolean z10, C5481e c5481e, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, c5481e);
        }
    }
}
