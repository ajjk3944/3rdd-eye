package okhttp3.internal.ws;

import Yg.J;
import Zg.AbstractC3689v;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import ej.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketReader;
import org.snmp4j.util.SnmpConfigurator;
import sh.C7974i;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0005vwxyzBA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0015¢\u0006\u0004\b)\u0010\u0017J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\u00152\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\b3\u00100J\u001f\u00107\u001a\u00020\u00152\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020#H\u0016¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\u00122\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b9\u0010:J'\u0010<\u001a\u00020\u00122\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010#2\u0006\u0010;\u001a\u00020\u000b¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0012H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0015H\u0000¢\u0006\u0004\b@\u0010\u0017J#\u0010C\u001a\u00020\u00152\n\u00102\u001a\u00060Aj\u0002`B2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010ER\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010JR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010KR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010JR\u0014\u0010N\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\\R\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010_R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010MR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010aR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020-0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020e0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010cR\u0016\u0010g\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010JR\u0016\u0010i\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010hR\u0016\u0010k\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010MR\u0016\u0010m\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010hR\u0016\u0010n\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010jR\u0016\u0010p\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010jR\u0016\u0010r\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010jR\u0016\u0010t\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010h¨\u0006{"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Request;", "originalRequest", "Lokhttp3/WebSocketListener;", "listener", "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lokhttp3/internal/ws/WebSocketExtensions;", "extensions", "minimumDeflateSize", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "", SnmpConfigurator.O_RETRIES, "(Lokhttp3/internal/ws/WebSocketExtensions;)Z", "LYg/J;", SnmpConfigurator.O_TIMEOUT, "()V", "k", "Lokhttp3/OkHttpClient;", "client", SnmpConfigurator.O_CONTEXT_NAME, "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "response", "Lokhttp3/internal/connection/Exchange;", "exchange", "l", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "q", "(Ljava/lang/String;Lokhttp3/internal/ws/RealWebSocket$Streams;)V", "s", "text", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;)V", "Lej/h;", "bytes", "d", "(Lej/h;)V", "payload", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, SnmpConfigurator.O_BIND_ADDRESS, "", "code", "reason", "f", "(ILjava/lang/String;)V", SnmpConfigurator.O_COMMUNITY, "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "m", "(ILjava/lang/String;J)Z", SnmpConfigurator.O_SECURITY_NAME, "()Z", SnmpConfigurator.O_VERSION, "Ljava/lang/Exception;", "Lkotlin/Exception;", SnmpConfigurator.O_OPERATION, "(Ljava/lang/Exception;Lokhttp3/Response;)V", "Lokhttp3/Request;", "Lokhttp3/WebSocketListener;", "p", "()Lokhttp3/WebSocketListener;", "Ljava/util/Random;", "J", "Lokhttp3/internal/ws/WebSocketExtensions;", "g", "Ljava/lang/String;", "key", "Lokhttp3/Call;", "h", "Lokhttp3/Call;", "call", "Lokhttp3/internal/concurrent/Task;", "i", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/ws/WebSocketReader;", "j", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "pongQueue", "", "messageAndCloseQueue", "queueSize", "Z", "enqueuedClose", "I", "receivedCloseCode", "receivedCloseReason", "failed", "sentPingCount", "w", "receivedPingCount", "x", "receivedPongCount", SnmpConfigurator.O_PRIV_PROTOCOL, "awaitingPong", "z", "Close", "Companion", "Message", "Streams", "WriterTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Request originalRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WebSocketListener listener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Random random;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long pingIntervalMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private WebSocketExtensions extensions;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long minimumDeflateSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Call call;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Task writerTask;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private WebSocketReader reader;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private WebSocketWriter writer;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private TaskQueue taskQueue;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Streams streams;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque pongQueue;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque messageAndCloseQueue;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long queueSize;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean enqueuedClose;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int receivedCloseCode;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private String receivedCloseReason;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean failed;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int sentPingCount;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int receivedPingCount;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int receivedPongCount;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean awaitingPong;

    /* renamed from: A, reason: collision with root package name */
    private static final List f56783A = AbstractC3689v.e(Protocol.HTTP_1_1);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", "code", "Lej/h;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILej/h;J)V", SnmpConfigurator.O_AUTH_PROTOCOL, "I", SnmpConfigurator.O_BIND_ADDRESS, "()I", "Lej/h;", SnmpConfigurator.O_COMMUNITY, "()Lej/h;", "J", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Close {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final h reason;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long cancelAfterCloseMillis;

        public Close(int i10, h hVar, long j10) {
            this.code = i10;
            this.reason = hVar;
            this.cancelAfterCloseMillis = j10;
        }

        /* renamed from: a, reason: from getter */
        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        /* renamed from: b, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: c, reason: from getter */
        public final h getReason() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", SnmpConfigurator.O_AUTH_PROTOCOL, "I", SnmpConfigurator.O_BIND_ADDRESS, "()I", "formatOpcode", "Lej/h;", "Lej/h;", "()Lej/h;", "data", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Message {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int formatOpcode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final h data;

        /* renamed from: a, reason: from getter */
        public final h getData() {
            return this.data;
        }

        /* renamed from: b, reason: from getter */
        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "", "client", "Lej/g;", "source", "Lej/f;", "sink", "<init>", "(ZLej/g;Lej/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Z", "()Z", SnmpConfigurator.O_BIND_ADDRESS, "Lej/g;", "h", "()Lej/g;", SnmpConfigurator.O_COMMUNITY, "Lej/f;", "g", "()Lej/f;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Streams implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean client;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5483g source;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5482f sink;

        public Streams(boolean z10, InterfaceC5483g source, InterfaceC5482f sink) {
            AbstractC6492s.i(source, "source");
            AbstractC6492s.i(sink, "sink");
            this.client = z10;
            this.source = source;
            this.sink = sink;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        /* renamed from: g, reason: from getter */
        public final InterfaceC5482f getSink() {
            return this.sink;
        }

        /* renamed from: h, reason: from getter */
        public final InterfaceC5483g getSource() {
            return this.source;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long f() throws IOException {
            try {
                return RealWebSocket.this.u() ? 0L : -1L;
            } catch (IOException e10) {
                RealWebSocket.this.o(e10, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request originalRequest, WebSocketListener listener, Random random, long j10, WebSocketExtensions webSocketExtensions, long j11) {
        AbstractC6492s.i(taskRunner, "taskRunner");
        AbstractC6492s.i(originalRequest, "originalRequest");
        AbstractC6492s.i(listener, "listener");
        AbstractC6492s.i(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j10;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j11;
        this.taskQueue = taskRunner.i();
        this.pongQueue = new ArrayDeque();
        this.messageAndCloseQueue = new ArrayDeque();
        this.receivedCloseCode = -1;
        if (!AbstractC6492s.d("GET", originalRequest.getMethod())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.getMethod()).toString());
        }
        h.a aVar = h.f46470d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        J j12 = J.f24997a;
        this.key = h.a.f(aVar, bArr, 0, 0, 3, null).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            return webSocketExtensions.serverMaxWindowBits == null || new C7974i(8, 15).u(webSocketExtensions.serverMaxWindowBits.intValue());
        }
        return false;
    }

    private final void t() {
        if (!Util.f56223h || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.j(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void a(String text) {
        AbstractC6492s.i(text, "text");
        this.listener.e(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void b(h payload) {
        AbstractC6492s.i(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    @Override // okhttp3.WebSocket
    public boolean c(int code, String reason) {
        return m(code, reason, 60000L);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void d(h bytes) {
        AbstractC6492s.i(bytes, "bytes");
        this.listener.d(this, bytes);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void e(h payload) {
        try {
            AbstractC6492s.i(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                t();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void f(int code, String reason) throws IOException {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        AbstractC6492s.i(reason, "reason");
        if (code == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.receivedCloseCode != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.receivedCloseCode = code;
                this.receivedCloseReason = reason;
                streams = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    Streams streams2 = this.streams;
                    this.streams = null;
                    webSocketReader = this.reader;
                    this.reader = null;
                    webSocketWriter = this.writer;
                    this.writer = null;
                    this.taskQueue.n();
                    streams = streams2;
                } else {
                    webSocketReader = null;
                    webSocketWriter = null;
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.listener.b(this, code, reason);
            if (streams != null) {
                this.listener.a(this, code, reason);
            }
        } finally {
            if (streams != null) {
                Util.m(streams);
            }
            if (webSocketReader != null) {
                Util.m(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.m(webSocketWriter);
            }
        }
    }

    public void k() {
        Call call = this.call;
        AbstractC6492s.f(call);
        call.cancel();
    }

    public final void l(Response response, Exchange exchange) throws ProtocolException {
        AbstractC6492s.i(response, "response");
        if (response.getCode() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.getCode() + ' ' + response.getMessage() + '\'');
        }
        String strC = Response.C(response, "Connection", null, 2, null);
        if (!t.C("Upgrade", strC, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strC + '\'');
        }
        String strC2 = Response.C(response, "Upgrade", null, 2, null);
        if (!t.C("websocket", strC2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strC2 + '\'');
        }
        String strC3 = Response.C(response, "Sec-WebSocket-Accept", null, 2, null);
        String strC4 = h.f46470d.d(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").P().c();
        if (AbstractC6492s.d(strC4, strC3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strC4 + "' but was '" + strC3 + '\'');
    }

    public final synchronized boolean m(int code, String reason, long cancelAfterCloseMillis) {
        h hVarD;
        try {
            WebSocketProtocol.f56831a.c(code);
            if (reason != null) {
                hVarD = h.f46470d.d(reason);
                if (hVarD.b0() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + reason).toString());
                }
            } else {
                hVarD = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(code, hVarD, cancelAfterCloseMillis));
                t();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void n(OkHttpClient client) {
        AbstractC6492s.i(client, "client");
        if (this.originalRequest.d("Sec-WebSocket-Extensions") != null) {
            o(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient okHttpClientC = client.E().g(EventListener.f56012b).N(f56783A).c();
        final Request requestB = this.originalRequest.i().c("Upgrade", "websocket").c("Connection", "Upgrade").c("Sec-WebSocket-Key", this.key).c("Sec-WebSocket-Version", "13").c("Sec-WebSocket-Extensions", "permessage-deflate").b();
        RealCall realCall = new RealCall(okHttpClientC, requestB, true);
        this.call = realCall;
        AbstractC6492s.f(realCall);
        realCall.T(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void a(Call call, Response response) throws IOException {
                AbstractC6492s.i(call, "call");
                AbstractC6492s.i(response, "response");
                Exchange exchange = response.getExchange();
                try {
                    this.f56822a.l(response, exchange);
                    AbstractC6492s.f(exchange);
                    RealWebSocket.Streams streamsN = exchange.n();
                    WebSocketExtensions webSocketExtensionsA = WebSocketExtensions.INSTANCE.a(response.getHeaders());
                    this.f56822a.extensions = webSocketExtensionsA;
                    if (!this.f56822a.r(webSocketExtensionsA)) {
                        RealWebSocket realWebSocket = this.f56822a;
                        synchronized (realWebSocket) {
                            realWebSocket.messageAndCloseQueue.clear();
                            realWebSocket.c(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        this.f56822a.q(Util.f56224i + " WebSocket " + requestB.getUrl().r(), streamsN);
                        this.f56822a.getListener().f(this.f56822a, response);
                        this.f56822a.s();
                    } catch (Exception e10) {
                        this.f56822a.o(e10, null);
                    }
                } catch (IOException e11) {
                    this.f56822a.o(e11, response);
                    Util.m(response);
                    if (exchange != null) {
                        exchange.v();
                    }
                }
            }

            @Override // okhttp3.Callback
            public void b(Call call, IOException e10) throws IOException {
                AbstractC6492s.i(call, "call");
                AbstractC6492s.i(e10, "e");
                this.f56822a.o(e10, null);
            }
        });
    }

    public final void o(Exception e10, Response response) throws IOException {
        AbstractC6492s.i(e10, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.n();
            J j10 = J.f24997a;
            try {
                this.listener.c(this, e10, response);
            } finally {
                if (streams != null) {
                    Util.m(streams);
                }
                if (webSocketReader != null) {
                    Util.m(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.m(webSocketWriter);
                }
            }
        }
    }

    /* renamed from: p, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    public final void q(String name, Streams streams) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        AbstractC6492s.f(webSocketExtensions);
        synchronized (this) {
            try {
                this.name = name;
                this.streams = streams;
                this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.a(streams.getClient()), this.minimumDeflateSize);
                this.writerTask = new WriterTask();
                long j10 = this.pingIntervalMillis;
                if (j10 != 0) {
                    final long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                    final String str = name + " ping";
                    this.taskQueue.i(new Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long f() throws IOException {
                            this.v();
                            return nanos;
                        }
                    }, nanos);
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    t();
                }
                J j11 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.a(!streams.getClient()));
    }

    public final void s() {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            AbstractC6492s.f(webSocketReader);
            webSocketReader.a();
        }
    }

    public final boolean u() throws IOException {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i10;
        Streams streams;
        synchronized (this) {
            try {
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                Object objPoll = this.pongQueue.poll();
                final boolean z10 = true;
                Object obj = null;
                if (objPoll == null) {
                    Object objPoll2 = this.messageAndCloseQueue.poll();
                    if (objPoll2 instanceof Close) {
                        i10 = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i10 != -1) {
                            streams = this.streams;
                            this.streams = null;
                            webSocketReader = this.reader;
                            this.reader = null;
                            webSocketWriter = this.writer;
                            this.writer = null;
                            this.taskQueue.n();
                        } else {
                            long cancelAfterCloseMillis = ((Close) objPoll2).getCancelAfterCloseMillis();
                            TaskQueue taskQueue = this.taskQueue;
                            final String str2 = this.name + " cancel";
                            taskQueue.i(new Task(str2, z10) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                                @Override // okhttp3.internal.concurrent.Task
                                public long f() {
                                    this.k();
                                    return -1L;
                                }
                            }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                            streams = null;
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        i10 = -1;
                        streams = null;
                    }
                    obj = objPoll2;
                } else {
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i10 = -1;
                    streams = null;
                }
                J j10 = J.f24997a;
                try {
                    if (objPoll != null) {
                        AbstractC6492s.f(webSocketWriter2);
                        webSocketWriter2.p((h) objPoll);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        AbstractC6492s.f(webSocketWriter2);
                        webSocketWriter2.h(message.getFormatOpcode(), message.getData());
                        synchronized (this) {
                            this.queueSize -= message.getData().b0();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        AbstractC6492s.f(webSocketWriter2);
                        webSocketWriter2.a(close.getCode(), close.getReason());
                        if (streams != null) {
                            WebSocketListener webSocketListener = this.listener;
                            AbstractC6492s.f(str);
                            webSocketListener.a(this, i10, str);
                        }
                    }
                    return true;
                } finally {
                    if (streams != null) {
                        Util.m(streams);
                    }
                    if (webSocketReader != null) {
                        Util.m(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.m(webSocketWriter);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v() throws IOException {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                int i10 = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                J j10 = J.f24997a;
                if (i10 == -1) {
                    try {
                        webSocketWriter.j(h.f46471e);
                        return;
                    } catch (IOException e10) {
                        o(e10, null);
                        return;
                    }
                }
                o(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
