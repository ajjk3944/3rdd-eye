package okhttp3.internal.http2;

import Yg.J;
import ej.C5481e;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import ej.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import mh.InterfaceC6824a;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import org.snmp4j.transport.TLSTM;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\t\u0018\u0000 Ã\u00012\u00020\u0001:\bÄ\u0001Å\u0001Æ\u0001Ç\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\b.\u0010,J\u001f\u00100\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001aH\u0000¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00122\u0006\u0010-\u001a\u00020)¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u00108J)\u0010?\u001a\u00020\u00122\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)2\b\u0010>\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b?\u0010@J#\u0010D\u001a\u00020\u00122\b\b\u0002\u0010A\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u001a¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0012H\u0000¢\u0006\u0004\bI\u00108J\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\bL\u0010MJ-\u0010O\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bO\u0010PJ/\u0010S\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010R\u001a\u00020Q2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\bU\u0010,R\u001a\u0010Z\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R&\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010l\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\"\u0010r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR\u0016\u0010x\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010WR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010}R\u0016\u0010\u0082\u0001\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010}R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0088\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0088\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0088\u0001R\u001d\u0010\u0099\u0001\u001a\u00030\u0094\u00018\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010\u009e\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u0096\u0001\u001a\u0006\b\u009b\u0001\u0010\u0098\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010£\u0001\u001a\u00020\u001a2\u0007\u0010\u009f\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010\u0088\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R*\u0010¦\u0001\u001a\u00020\u001a2\u0007\u0010\u009f\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u0088\u0001\u001a\u0006\b¥\u0001\u0010¢\u0001R*\u0010©\u0001\u001a\u00020\u001a2\u0007\u0010\u009f\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b§\u0001\u0010\u0088\u0001\u001a\u0006\b¨\u0001\u0010¢\u0001R*\u0010¬\u0001\u001a\u00020\u001a2\u0007\u0010\u009f\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bª\u0001\u0010\u0088\u0001\u001a\u0006\b«\u0001\u0010¢\u0001R \u0010²\u0001\u001a\u00030\u00ad\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001d\u0010¸\u0001\u001a\u00030³\u00018\u0006¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R!\u0010¾\u0001\u001a\u00070¹\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u001e\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001¨\u0006È\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "Lokhttp3/internal/http2/Http2Stream;", "B0", "(ILjava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "Ljava/io/IOException;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "LYg/J;", "o0", "(Ljava/io/IOException;)V", "id", "w0", "(I)Lokhttp3/internal/http2/Http2Stream;", "streamId", "I0", "", "read", "P0", "(J)V", "C0", "(Ljava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "outFinished", "alternating", "R0", "(IZLjava/util/List;)V", "Lej/e;", "buffer", "byteCount", "Q0", "(IZLej/e;J)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "U0", "(ILokhttp3/internal/http2/ErrorCode;)V", "statusCode", "T0", "unacknowledgedBytesRead", "V0", "(IJ)V", "reply", "payload1", "payload2", "S0", "(ZII)V", "flush", "()V", "M0", "(Lokhttp3/internal/http2/ErrorCode;)V", "close", "connectionCode", "streamCode", "cause", "n0", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "N0", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "nowNs", "A0", "(J)Z", "J0", "H0", "(I)Z", "F0", "(ILjava/util/List;)V", "inFinished", "E0", "(ILjava/util/List;Z)V", "Lej/g;", "source", "D0", "(ILej/g;IZ)V", "G0", SnmpConfigurator.O_AUTH_PROTOCOL, "Z", "p0", "()Z", "client", "Lokhttp3/internal/http2/Http2Connection$Listener;", SnmpConfigurator.O_BIND_ADDRESS, "Lokhttp3/internal/http2/Http2Connection$Listener;", "s0", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "", SnmpConfigurator.O_COMMUNITY, "Ljava/util/Map;", "x0", "()Ljava/util/Map;", "streams", "", "d", "Ljava/lang/String;", "q0", "()Ljava/lang/String;", "connectionName", "I", "r0", "()I", "K0", "(I)V", "lastGoodStreamId", "f", "t0", "setNextStreamId$okhttp", "nextStreamId", "g", "isShutdown", "h", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/TaskQueue;", "i", "Lokhttp3/internal/concurrent/TaskQueue;", "writerQueue", "j", "pushQueue", "k", "settingsListenerQueue", "Lokhttp3/internal/http2/PushObserver;", "l", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "m", "J", "intervalPingsSent", SnmpConfigurator.O_CONTEXT_NAME, "intervalPongsReceived", SnmpConfigurator.O_OPERATION, "degradedPingsSent", "p", "degradedPongsReceived", "q", "awaitPongsReceived", SnmpConfigurator.O_RETRIES, "degradedPongDeadlineNs", "Lokhttp3/internal/http2/Settings;", "s", "Lokhttp3/internal/http2/Settings;", "u0", "()Lokhttp3/internal/http2/Settings;", "okHttpSettings", SnmpConfigurator.O_TIMEOUT, "v0", "L0", "(Lokhttp3/internal/http2/Settings;)V", "peerSettings", "<set-?>", SnmpConfigurator.O_SECURITY_NAME, "getReadBytesTotal", "()J", "readBytesTotal", SnmpConfigurator.O_VERSION, "getReadBytesAcknowledged", "readBytesAcknowledged", "w", "getWriteBytesTotal", "writeBytesTotal", "x", "y0", "writeBytesMaximum", "Ljava/net/Socket;", SnmpConfigurator.O_PRIV_PROTOCOL, "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "Lokhttp3/internal/http2/Http2Writer;", "z", "Lokhttp3/internal/http2/Http2Writer;", "z0", "()Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", SnmpConfigurator.O_AUTH_PASSPHRASE, "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "", "B", "Ljava/util/Set;", "currentPushRequests", "C", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Http2Connection implements Closeable {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final Settings f56550D;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final ReaderRunnable readerRunnable;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Set currentPushRequests;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Listener listener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map streams;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String connectionName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastGoodStreamId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int nextStreamId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isShutdown;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TaskRunner taskRunner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final TaskQueue writerQueue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TaskQueue pushQueue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final TaskQueue settingsListenerQueue;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final PushObserver pushObserver;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long intervalPingsSent;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long intervalPongsReceived;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long degradedPingsSent;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long degradedPongsReceived;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long awaitPongsReceived;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long degradedPongDeadlineNs;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Settings okHttpSettings;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Settings peerSettings;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long readBytesTotal;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long readBytesAcknowledged;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Socket socket;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Http2Writer writer;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00100\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-\"\u0004\b.\u0010/R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010=\u001a\u0004\b+\u0010>\"\u0004\b?\u0010@R\"\u0010F\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010B\u001a\u0004\b7\u0010C\"\u0004\bD\u0010ER\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010G\u001a\u0004\b1\u0010H\"\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "", "client", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "Ljava/net/Socket;", "socket", "", "peerName", "Lej/g;", "source", "Lej/f;", "sink", "q", "(Ljava/net/Socket;Ljava/lang/String;Lej/g;Lej/f;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "k", "(Lokhttp3/internal/http2/Http2Connection$Listener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "", "pingIntervalMillis", "l", "(I)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lokhttp3/internal/http2/Http2Connection;", "Z", SnmpConfigurator.O_BIND_ADDRESS, "()Z", "setClient$okhttp", "(Z)V", "Lokhttp3/internal/concurrent/TaskRunner;", "j", "()Lokhttp3/internal/concurrent/TaskRunner;", SnmpConfigurator.O_COMMUNITY, "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", SnmpConfigurator.O_OPERATION, "(Ljava/net/Socket;)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "connectionName", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lej/g;", "i", "()Lej/g;", "p", "(Lej/g;)V", "f", "Lej/f;", "g", "()Lej/f;", SnmpConfigurator.O_CONTEXT_NAME, "(Lej/f;)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "Lokhttp3/internal/http2/PushObserver;", "Lokhttp3/internal/http2/PushObserver;", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "pushObserver", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean client;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final TaskRunner taskRunner;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Socket socket;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public String connectionName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public InterfaceC5483g source;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public InterfaceC5482f sink;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Listener listener;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private PushObserver pushObserver;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int pingIntervalMillis;

        public Builder(boolean z10, TaskRunner taskRunner) {
            AbstractC6492s.i(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = Listener.f56623b;
            this.pushObserver = PushObserver.f56691b;
        }

        public final Http2Connection a() {
            return new Http2Connection(this);
        }

        /* renamed from: b, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        public final String c() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            AbstractC6492s.v("connectionName");
            return null;
        }

        /* renamed from: d, reason: from getter */
        public final Listener getListener() {
            return this.listener;
        }

        /* renamed from: e, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        /* renamed from: f, reason: from getter */
        public final PushObserver getPushObserver() {
            return this.pushObserver;
        }

        public final InterfaceC5482f g() {
            InterfaceC5482f interfaceC5482f = this.sink;
            if (interfaceC5482f != null) {
                return interfaceC5482f;
            }
            AbstractC6492s.v("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            AbstractC6492s.v("socket");
            return null;
        }

        public final InterfaceC5483g i() {
            InterfaceC5483g interfaceC5483g = this.source;
            if (interfaceC5483g != null) {
                return interfaceC5483g;
            }
            AbstractC6492s.v("source");
            return null;
        }

        /* renamed from: j, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        public final Builder k(Listener listener) {
            AbstractC6492s.i(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final Builder l(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        public final void m(String str) {
            AbstractC6492s.i(str, "<set-?>");
            this.connectionName = str;
        }

        public final void n(InterfaceC5482f interfaceC5482f) {
            AbstractC6492s.i(interfaceC5482f, "<set-?>");
            this.sink = interfaceC5482f;
        }

        public final void o(Socket socket) {
            AbstractC6492s.i(socket, "<set-?>");
            this.socket = socket;
        }

        public final void p(InterfaceC5483g interfaceC5483g) {
            AbstractC6492s.i(interfaceC5483g, "<set-?>");
            this.source = interfaceC5483g;
        }

        public final Builder q(Socket socket, String peerName, InterfaceC5483g source, InterfaceC5482f sink) {
            String str;
            AbstractC6492s.i(socket, "socket");
            AbstractC6492s.i(peerName, "peerName");
            AbstractC6492s.i(source, "source");
            AbstractC6492s.i(sink, "sink");
            o(socket);
            if (this.client) {
                str = Util.f56224i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            p(source);
            n(sink);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "Lokhttp3/internal/http2/Settings;", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lokhttp3/internal/http2/Settings;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Settings a() {
            return Http2Connection.f56550D;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "Lokhttp3/internal/http2/Http2Stream;", "stream", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Listener {

        /* renamed from: b, reason: collision with root package name */
        public static final Listener f56623b = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void c(Http2Stream stream) {
                AbstractC6492s.i(stream, "stream");
                stream.d(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void b(Http2Connection connection, Settings settings) {
            AbstractC6492s.i(connection, "connection");
            AbstractC6492s.i(settings, "settings");
        }

        public abstract void c(Http2Stream stream);
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ'\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J-\u00109\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "LYg/J;", "Lokhttp3/internal/http2/Http2Reader;", "reader", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", SnmpConfigurator.O_OPERATION, "()V", "", "inFinished", "", "streamId", "Lej/g;", "source", "length", "h", "(ZILej/g;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", SnmpConfigurator.O_COMMUNITY, "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "k", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", SnmpConfigurator.O_BIND_ADDRESS, "(ZLokhttp3/internal/http2/Settings;)V", SnmpConfigurator.O_CONTEXT_NAME, SnmpConfigurator.O_AUTH_PROTOCOL, "ack", "payload1", "payload2", "i", "(ZII)V", "lastGoodStreamId", "Lej/h;", "debugData", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(ILokhttp3/internal/http2/ErrorCode;Lej/h;)V", "", "windowSizeIncrement", "f", "(IJ)V", "streamDependency", "weight", "exclusive", "j", "(IIIZ)V", "promisedStreamId", "requestHeaders", "l", "(IILjava/util/List;)V", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ReaderRunnable implements Http2Reader.Handler, InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Http2Reader reader;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Http2Connection f56625b;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader reader) {
            AbstractC6492s.i(reader, "reader");
            this.f56625b = http2Connection;
            this.reader = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void a() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void b(final boolean clearPrevious, final Settings settings) {
            AbstractC6492s.i(settings, "settings");
            TaskQueue taskQueue = this.f56625b.writerQueue;
            final String str = this.f56625b.getConnectionName() + " applyAndAckSettings";
            final boolean z10 = true;
            taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long f() {
                    this.n(clearPrevious, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void c(boolean inFinished, int streamId, int associatedStreamId, List headerBlock) {
            AbstractC6492s.i(headerBlock, "headerBlock");
            if (this.f56625b.H0(streamId)) {
                this.f56625b.E0(streamId, headerBlock, inFinished);
                return;
            }
            final Http2Connection http2Connection = this.f56625b;
            synchronized (http2Connection) {
                Http2Stream http2StreamW0 = http2Connection.w0(streamId);
                if (http2StreamW0 != null) {
                    J j10 = J.f24997a;
                    http2StreamW0.x(Util.Q(headerBlock), inFinished);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (streamId <= http2Connection.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == http2Connection.getNextStreamId() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(streamId, http2Connection, false, inFinished, Util.Q(headerBlock));
                http2Connection.K0(streamId);
                http2Connection.getStreams().put(Integer.valueOf(streamId), http2Stream);
                TaskQueue taskQueueI = http2Connection.taskRunner.i();
                final String str = http2Connection.getConnectionName() + '[' + streamId + "] onStream";
                final boolean z10 = true;
                taskQueueI.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long f() {
                        try {
                            http2Connection.getListener().c(http2Stream);
                            return -1L;
                        } catch (IOException e10) {
                            Platform.INSTANCE.g().k("Http2Connection.Listener failure for " + http2Connection.getConnectionName(), 4, e10);
                            try {
                                http2Stream.d(ErrorCode.PROTOCOL_ERROR, e10);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void e(int lastGoodStreamId, ErrorCode errorCode, h debugData) {
            int i10;
            Object[] array;
            AbstractC6492s.i(errorCode, "errorCode");
            AbstractC6492s.i(debugData, "debugData");
            debugData.b0();
            Http2Connection http2Connection = this.f56625b;
            synchronized (http2Connection) {
                array = http2Connection.getStreams().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
                J j10 = J.f24997a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > lastGoodStreamId && http2Stream.t()) {
                    http2Stream.y(ErrorCode.REFUSED_STREAM);
                    this.f56625b.I0(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void f(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                Http2Connection http2Connection = this.f56625b;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + windowSizeIncrement;
                    AbstractC6492s.g(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    J j10 = J.f24997a;
                }
                return;
            }
            Http2Stream http2StreamW0 = this.f56625b.w0(streamId);
            if (http2StreamW0 != null) {
                synchronized (http2StreamW0) {
                    http2StreamW0.a(windowSizeIncrement);
                    J j11 = J.f24997a;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void h(boolean inFinished, int streamId, InterfaceC5483g source, int length) {
            AbstractC6492s.i(source, "source");
            if (this.f56625b.H0(streamId)) {
                this.f56625b.D0(streamId, source, length, inFinished);
                return;
            }
            Http2Stream http2StreamW0 = this.f56625b.w0(streamId);
            if (http2StreamW0 == null) {
                this.f56625b.U0(streamId, ErrorCode.PROTOCOL_ERROR);
                long j10 = length;
                this.f56625b.P0(j10);
                source.d(j10);
                return;
            }
            http2StreamW0.w(source, length);
            if (inFinished) {
                http2StreamW0.x(Util.f56217b, true);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void i(boolean ack, final int payload1, final int payload2) {
            if (!ack) {
                TaskQueue taskQueue = this.f56625b.writerQueue;
                final String str = this.f56625b.getConnectionName() + " ping";
                final Http2Connection http2Connection = this.f56625b;
                final boolean z10 = true;
                taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long f() throws IOException {
                        http2Connection.S0(true, payload1, payload2);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.f56625b;
            synchronized (http2Connection2) {
                try {
                    if (payload1 == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            http2Connection2.awaitPongsReceived++;
                            AbstractC6492s.g(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection2.notifyAll();
                        }
                        J j10 = J.f24997a;
                    } else {
                        http2Connection2.degradedPongsReceived++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            o();
            return J.f24997a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void j(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void k(int streamId, ErrorCode errorCode) {
            AbstractC6492s.i(errorCode, "errorCode");
            if (this.f56625b.H0(streamId)) {
                this.f56625b.G0(streamId, errorCode);
                return;
            }
            Http2Stream http2StreamI0 = this.f56625b.I0(streamId);
            if (http2StreamI0 != null) {
                http2StreamI0.y(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void l(int streamId, int promisedStreamId, List requestHeaders) {
            AbstractC6492s.i(requestHeaders, "requestHeaders");
            this.f56625b.F0(promisedStreamId, requestHeaders);
        }

        public final void n(boolean clearPrevious, Settings settings) {
            long jC;
            int i10;
            Http2Stream[] http2StreamArr;
            final boolean z10 = true;
            AbstractC6492s.i(settings, "settings");
            final N n10 = new N();
            Http2Writer writer = this.f56625b.getWriter();
            final Http2Connection http2Connection = this.f56625b;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!clearPrevious) {
                            Settings settings2 = new Settings();
                            settings2.g(peerSettings);
                            settings2.g(settings);
                            settings = settings2;
                        }
                        n10.f51689a = settings;
                        jC = settings.c() - peerSettings.c();
                        http2StreamArr = (jC == 0 || http2Connection.getStreams().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams().values().toArray(new Http2Stream[0]);
                        http2Connection.L0((Settings) n10.f51689a);
                        TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                        final String str = http2Connection.getConnectionName() + " onSettings";
                        taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long f() {
                                http2Connection.getListener().b(http2Connection, (Settings) n10.f51689a);
                                return -1L;
                            }
                        }, 0L);
                        J j10 = J.f24997a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    http2Connection.getWriter().a((Settings) n10.f51689a);
                } catch (IOException e10) {
                    http2Connection.o0(e10);
                }
                J j11 = J.f24997a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.a(jC);
                        J j12 = J.f24997a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        public void o() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.reader.h(this);
                    while (this.reader.g(false, this)) {
                    }
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    errorCode = errorCode3;
                    this.f56625b.n0(errorCode, errorCode3, e10);
                    Util.m(this.reader);
                    throw th;
                }
                try {
                    this.f56625b.n0(errorCode2, ErrorCode.CANCEL, null);
                    errorCode = errorCode2;
                } catch (IOException e12) {
                    e10 = e12;
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection http2Connection = this.f56625b;
                    http2Connection.n0(errorCode4, errorCode4, e10);
                    errorCode = http2Connection;
                    errorCode3 = this.reader;
                    Util.m(errorCode3);
                }
                errorCode3 = this.reader;
                Util.m(errorCode3);
            } catch (Throwable th3) {
                th = th3;
                this.f56625b.n0(errorCode, errorCode3, e10);
                Util.m(this.reader);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.h(7, 65535);
        settings.h(5, TLSTM.TLS_MAX_FRAGMENT_SIZE);
        f56550D = settings;
    }

    public Http2Connection(Builder builder) {
        AbstractC6492s.i(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new LinkedHashMap();
        String strC = builder.c();
        this.connectionName = strC;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        TaskQueue taskQueueI = taskRunner.i();
        this.writerQueue = taskQueueI;
        this.pushQueue = taskRunner.i();
        this.settingsListenerQueue = taskRunner.i();
        this.pushObserver = builder.getPushObserver();
        Settings settings = new Settings();
        if (builder.getClient()) {
            settings.h(7, 16777216);
        }
        this.okHttpSettings = settings;
        this.peerSettings = f56550D;
        this.writeBytesMaximum = r2.c();
        this.socket = builder.h();
        this.writer = new Http2Writer(builder.g(), client);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.i(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            final String str = strC + " ping";
            taskQueueI.i(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long f() throws IOException {
                    boolean z10;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z10 = true;
                        } else {
                            this.intervalPingsSent++;
                            z10 = false;
                        }
                    }
                    if (z10) {
                        this.o0(null);
                        return -1L;
                    }
                    this.S0(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    private final Http2Stream B0(int associatedStreamId, List requestHeaders, boolean out) {
        int i10;
        Http2Stream http2Stream;
        boolean z10 = true;
        boolean z11 = !out;
        synchronized (this.writer) {
            try {
                synchronized (this) {
                    try {
                        if (this.nextStreamId > 1073741823) {
                            M0(ErrorCode.REFUSED_STREAM);
                        }
                        if (this.isShutdown) {
                            throw new ConnectionShutdownException();
                        }
                        i10 = this.nextStreamId;
                        this.nextStreamId = i10 + 2;
                        http2Stream = new Http2Stream(i10, this, z11, false, null);
                        if (out && this.writeBytesTotal < this.writeBytesMaximum && http2Stream.getWriteBytesTotal() < http2Stream.getWriteBytesMaximum()) {
                            z10 = false;
                        }
                        if (http2Stream.u()) {
                            this.streams.put(Integer.valueOf(i10), http2Stream);
                        }
                        J j10 = J.f24997a;
                    } finally {
                    }
                }
                if (associatedStreamId == 0) {
                    this.writer.v(z11, i10, requestHeaders);
                } else {
                    if (this.client) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    this.writer.J(associatedStreamId, i10, requestHeaders);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public static /* synthetic */ void O0(Http2Connection http2Connection, boolean z10, TaskRunner taskRunner, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            taskRunner = TaskRunner.f56345i;
        }
        http2Connection.N0(z10, taskRunner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(IOException e10) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        n0(errorCode, errorCode, e10);
    }

    public final synchronized boolean A0(long nowNs) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (nowNs >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream C0(List requestHeaders, boolean out) {
        AbstractC6492s.i(requestHeaders, "requestHeaders");
        return B0(0, requestHeaders, out);
    }

    public final void D0(final int streamId, InterfaceC5483g source, final int byteCount, final boolean inFinished) {
        AbstractC6492s.i(source, "source");
        final C5481e c5481e = new C5481e();
        long j10 = byteCount;
        source.g0(j10);
        source.U(c5481e, j10);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + streamId + "] onData";
        final boolean z10 = true;
        taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                try {
                    boolean zC = this.pushObserver.c(streamId, c5481e, byteCount, inFinished);
                    if (zC) {
                        this.getWriter().P(streamId, ErrorCode.CANCEL);
                    }
                    if (!zC && !inFinished) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(Integer.valueOf(streamId));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void E0(final int streamId, final List requestHeaders, final boolean inFinished) {
        AbstractC6492s.i(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + streamId + "] onHeaders";
        final boolean z10 = true;
        taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                boolean zB = this.pushObserver.b(streamId, requestHeaders, inFinished);
                if (zB) {
                    try {
                        this.getWriter().P(streamId, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zB && !inFinished) {
                    return -1L;
                }
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(streamId));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void F0(final int streamId, final List requestHeaders) {
        AbstractC6492s.i(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                U0(streamId, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            TaskQueue taskQueue = this.pushQueue;
            final String str = this.connectionName + '[' + streamId + "] onRequest";
            final boolean z10 = true;
            taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long f() {
                    if (!this.pushObserver.a(streamId, requestHeaders)) {
                        return -1L;
                    }
                    try {
                        this.getWriter().P(streamId, ErrorCode.CANCEL);
                        synchronized (this) {
                            this.currentPushRequests.remove(Integer.valueOf(streamId));
                        }
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }

    public final void G0(final int streamId, final ErrorCode errorCode) {
        AbstractC6492s.i(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + streamId + "] onReset";
        final boolean z10 = true;
        taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                this.pushObserver.d(streamId, errorCode);
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(streamId));
                    J j10 = J.f24997a;
                }
                return -1L;
            }
        }, 0L);
    }

    public final boolean H0(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    public final synchronized Http2Stream I0(int streamId) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.streams.remove(Integer.valueOf(streamId));
        AbstractC6492s.g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2Stream;
    }

    public final void J0() {
        synchronized (this) {
            long j10 = this.degradedPongsReceived;
            long j11 = this.degradedPingsSent;
            if (j10 < j11) {
                return;
            }
            this.degradedPingsSent = j11 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            J j12 = J.f24997a;
            TaskQueue taskQueue = this.writerQueue;
            final String str = this.connectionName + " ping";
            final boolean z10 = true;
            taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long f() throws IOException {
                    this.S0(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void K0(int i10) {
        this.lastGoodStreamId = i10;
    }

    public final void L0(Settings settings) {
        AbstractC6492s.i(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void M0(ErrorCode statusCode) {
        AbstractC6492s.i(statusCode, "statusCode");
        synchronized (this.writer) {
            L l10 = new L();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i10 = this.lastGoodStreamId;
                l10.f51687a = i10;
                J j10 = J.f24997a;
                this.writer.s(i10, statusCode, Util.f56216a);
            }
        }
    }

    public final void N0(boolean sendConnectionPreface, TaskRunner taskRunner) {
        AbstractC6492s.i(taskRunner, "taskRunner");
        if (sendConnectionPreface) {
            this.writer.g();
            this.writer.S(this.okHttpSettings);
            if (this.okHttpSettings.c() != 65535) {
                this.writer.T(0, r5 - 65535);
            }
        }
        TaskQueue taskQueueI = taskRunner.i();
        final String str = this.connectionName;
        final ReaderRunnable readerRunnable = this.readerRunnable;
        final boolean z10 = true;
        taskQueueI.i(new Task(str, z10) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                readerRunnable.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final synchronized void P0(long read) {
        long j10 = this.readBytesTotal + read;
        this.readBytesTotal = j10;
        long j11 = j10 - this.readBytesAcknowledged;
        if (j11 >= this.okHttpSettings.c() / 2) {
            V0(0, j11);
            this.readBytesAcknowledged += j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.y());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = Yg.J.f24997a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q0(int r9, boolean r10, ej.C5481e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.h(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.streams     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.AbstractC6492s.g(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.http2.Http2Writer r4 = r8.writer     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.getMaxFrameSize()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2f
            Yg.J r4 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.h(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.Q0(int, boolean, ej.e, long):void");
    }

    public final void R0(int streamId, boolean outFinished, List alternating) {
        AbstractC6492s.i(alternating, "alternating");
        this.writer.v(outFinished, streamId, alternating);
    }

    public final void S0(boolean reply, int payload1, int payload2) throws IOException {
        try {
            this.writer.C(reply, payload1, payload2);
        } catch (IOException e10) {
            o0(e10);
        }
    }

    public final void T0(int streamId, ErrorCode statusCode) {
        AbstractC6492s.i(statusCode, "statusCode");
        this.writer.P(streamId, statusCode);
    }

    public final void U0(final int streamId, final ErrorCode errorCode) {
        AbstractC6492s.i(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + streamId + "] writeSynReset";
        final boolean z10 = true;
        taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() throws IOException {
                try {
                    this.T0(streamId, errorCode);
                    return -1L;
                } catch (IOException e10) {
                    this.o0(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void V0(final int streamId, final long unacknowledgedBytesRead) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + streamId + "] windowUpdate";
        final boolean z10 = true;
        taskQueue.i(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() throws IOException {
                try {
                    this.getWriter().T(streamId, unacknowledgedBytesRead);
                    return -1L;
                } catch (IOException e10) {
                    this.o0(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        n0(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() {
        this.writer.flush();
    }

    public final void n0(ErrorCode connectionCode, ErrorCode streamCode, IOException cause) throws IOException {
        int i10;
        Object[] array;
        AbstractC6492s.i(connectionCode, "connectionCode");
        AbstractC6492s.i(streamCode, "streamCode");
        if (Util.f56223h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            M0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.streams.isEmpty()) {
                    array = null;
                } else {
                    array = this.streams.values().toArray(new Http2Stream[0]);
                    this.streams.clear();
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.d(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.n();
        this.pushQueue.n();
        this.settingsListenerQueue.n();
    }

    /* renamed from: p0, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    /* renamed from: q0, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    /* renamed from: r0, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    /* renamed from: s0, reason: from getter */
    public final Listener getListener() {
        return this.listener;
    }

    /* renamed from: t0, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    /* renamed from: u0, reason: from getter */
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    /* renamed from: v0, reason: from getter */
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final synchronized Http2Stream w0(int id2) {
        return (Http2Stream) this.streams.get(Integer.valueOf(id2));
    }

    /* renamed from: x0, reason: from getter */
    public final Map getStreams() {
        return this.streams;
    }

    /* renamed from: y0, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* renamed from: z0, reason: from getter */
    public final Http2Writer getWriter() {
        return this.writer;
    }
}
