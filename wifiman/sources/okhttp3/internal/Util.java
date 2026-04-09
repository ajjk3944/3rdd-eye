package okhttp3.internal;

import Yg.AbstractC3663g;
import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.Q;
import Zg.U;
import ej.C5481e;
import ej.InterfaceC5474B;
import ej.InterfaceC5476D;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import ej.h;
import ej.s;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import jh.AbstractC6329b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;
import kotlin.text.p;
import kotlin.text.t;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import org.snmp4j.asn1.BER;
import org.snmp4j.mp.MPv3;
import org.snmp4j.util.SnmpConfigurator;
import sh.AbstractC7978m;
import sh.C7974i;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010,\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b0\u00101\u001a\u0015\u00102\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b2\u00101\u001a)\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u0002040\u000e\"\u000204¢\u0006\u0004\b6\u00107\u001a\u0019\u0010;\u001a\u000209*\u0002082\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a'\u0010@\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010B\u001a\u00020\u001b*\u00020*¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010G\u001a\u00020F*\b\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020E0D*\u00020F¢\u0006\u0004\bI\u0010J\u001a\u0019\u0010K\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010O\u001a\u00020N*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u001c\u0010S\u001a\u00020\u001b*\u00020Q2\u0006\u0010R\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bS\u0010T\u001a\u001c\u0010V\u001a\u00020\u001b*\u00020U2\u0006\u0010R\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bV\u0010W\u001a\u001c\u0010X\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010R\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bX\u0010Y\u001a\u0019\u0010\\\u001a\u00020\u0004*\u00020Z2\u0006\u0010[\u001a\u00020\u001b¢\u0006\u0004\b\\\u0010]\u001a\u0011\u0010^\u001a\u00020\u001b*\u000208¢\u0006\u0004\b^\u0010_\u001a!\u0010b\u001a\u00020\t*\u00020`2\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\bb\u0010c\u001a!\u0010e\u001a\u00020\t*\u00020`2\u0006\u0010d\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\be\u0010c\u001a\u0019\u0010h\u001a\u00020\t*\u00020f2\u0006\u0010g\u001a\u000208¢\u0006\u0004\bh\u0010i\u001a\u0019\u0010l\u001a\u00020\u001b*\u00020j2\u0006\u0010k\u001a\u00020Q¢\u0006\u0004\bl\u0010m\u001a\u001b\u0010n\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010q\u001a\u00020\u0000*\u00020p¢\u0006\u0004\bq\u0010r\u001a\u0019\u0010t\u001a\u00020\u0000*\u00020\u00072\u0006\u0010s\u001a\u00020\u0000¢\u0006\u0004\bt\u0010u\u001a\u001b\u0010v\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010s\u001a\u00020\u001b¢\u0006\u0004\bv\u0010o\u001a#\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000D¢\u0006\u0004\bw\u0010x\u001a/\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010\u00182\u0012\u0010y\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0004\bz\u0010{\u001a5\u0010}\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|\"\u0004\b\u0000\u0010^\"\u0004\b\u0001\u0010w*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|¢\u0006\u0004\b}\u0010~\u001a\u0014\u0010\u0080\u0001\u001a\u00020\u0004*\u00020\u007f¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0014\u0010\u0082\u0001\u001a\u00020\u0004*\u00020f¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u001f\u0010\u0087\u0001\u001a\u00020\t*\u00030\u0084\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0014\u0010\u0089\u0001\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0014\u0010\u008b\u0001\u001a\u00020\u0007*\u00020\u001b¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a,\u0010\u008f\u0001\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0012*\t\u0012\u0004\u0012\u00028\u00000\u008d\u00012\u0007\u0010\u008e\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a0\u0010\u0095\u0001\u001a\u00030\u0094\u0001*\b0\u0091\u0001j\u0003`\u0092\u00012\u0013\u0010\u0093\u0001\u001a\u000e\u0012\n\u0012\b0\u0091\u0001j\u0003`\u0092\u00010D¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0016\u0010\u009c\u0001\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bk\u0010\u009b\u0001\"\u0018\u0010\u009f\u0001\u001a\u00030\u009d\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u009e\u0001\"\u0017\u0010¢\u0001\u001a\u00030 \u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bS\u0010¡\u0001\"\u0017\u0010¥\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010¤\u0001\"\u0017\u0010¨\u0001\u001a\u00030¦\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bX\u0010§\u0001\"\u0017\u0010«\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010ª\u0001\"\u0016\u0010\u00ad\u0001\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b¬\u0001\u0010%\"\u0016\u0010¯\u0001\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b0\u0010®\u0001¨\u0006°\u0001"}, d2 = {"", "arrayLength", "offset", "count", "LYg/J;", "l", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "N", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", "other", "Ljava/util/Comparator;", "comparator", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", SnmpConfigurator.O_SECURITY_NAME, "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "T", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "value", "", "x", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", SnmpConfigurator.O_OPERATION, "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "z", "(Ljava/lang/String;II)I", "B", "Z", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "q", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "p", "(Ljava/lang/String;CII)I", SnmpConfigurator.O_PRIV_PROTOCOL, "(Ljava/lang/String;)I", "i", "(Ljava/lang/String;)Z", "H", "format", "", "args", SnmpConfigurator.O_TIMEOUT, "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lej/g;", "Ljava/nio/charset/Charset;", "default", "J", "(Lej/g;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "k", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "I", "(C)I", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "Q", "(Ljava/util/List;)Lokhttp3/Headers;", "P", "(Lokhttp3/Headers;)Ljava/util/List;", "j", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "g", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "", "mask", "d", "(BI)I", "", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(SI)I", "f", "(IJ)J", "Lej/f;", "medium", "c0", "(Lej/f;I)V", "K", "(Lej/g;)I", "Lej/D;", "timeUnit", "M", "(Lej/D;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "s", "Ljava/net/Socket;", "source", "G", "(Ljava/net/Socket;Lej/g;)Z", "Lej/e;", SnmpConfigurator.O_BIND_ADDRESS, "L", "(Lej/e;B)I", "D", "(Ljava/lang/String;I)I", "Lokhttp3/Response;", SnmpConfigurator.O_VERSION, "(Lokhttp3/Response;)J", "defaultValue", "X", "(Ljava/lang/String;J)J", SnmpConfigurator.O_PRIV_PASSPHRASE, "V", "(Ljava/util/List;)Ljava/util/List;", "elements", "w", "([Ljava/lang/Object;)Ljava/util/List;", "", "W", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "m", "(Ljava/io/Closeable;)V", SnmpConfigurator.O_CONTEXT_NAME, "(Ljava/net/Socket;)V", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "F", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;)Z", "S", "(J)Ljava/lang/String;", "R", "(I)Ljava/lang/String;", "", "element", SnmpConfigurator.O_COMMUNITY, "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "b0", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", SnmpConfigurator.O_AUTH_PROTOCOL, "[B", "EMPTY_BYTE_ARRAY", "Lokhttp3/Headers;", "EMPTY_HEADERS", "Lokhttp3/ResponseBody;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/RequestBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lej/s;", "Lej/s;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "Lkotlin/text/p;", "Lkotlin/text/p;", "VERIFY_AS_IP_ADDRESS", "h", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f56216a;

    /* renamed from: b, reason: collision with root package name */
    public static final Headers f56217b = Headers.INSTANCE.g(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final ResponseBody f56218c;

    /* renamed from: d, reason: collision with root package name */
    public static final RequestBody f56219d;

    /* renamed from: e, reason: collision with root package name */
    private static final s f56220e;

    /* renamed from: f, reason: collision with root package name */
    public static final TimeZone f56221f;

    /* renamed from: g, reason: collision with root package name */
    private static final p f56222g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f56223h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f56224i;

    static {
        byte[] bArr = new byte[0];
        f56216a = bArr;
        f56218c = ResponseBody.Companion.d(ResponseBody.INSTANCE, bArr, null, 1, null);
        f56219d = RequestBody.Companion.i(RequestBody.INSTANCE, bArr, null, 0, 0, 7, null);
        s.a aVar = s.f46493d;
        h.a aVar2 = h.f46470d;
        f56220e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC6492s.f(timeZone);
        f56221f = timeZone;
        f56222g = new p("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f56223h = false;
        String name = OkHttpClient.class.getName();
        AbstractC6492s.h(name, "OkHttpClient::class.java.name");
        f56224i = t.H0(t.G0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        AbstractC6492s.i(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        AbstractC6492s.i(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator comparator) {
        AbstractC6492s.i(strArr, "<this>");
        AbstractC6492s.i(other, "other");
        AbstractC6492s.i(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean F(FileSystem fileSystem, File file) {
        AbstractC6492s.i(fileSystem, "<this>");
        AbstractC6492s.i(file, "file");
        InterfaceC5474B interfaceC5474BB = fileSystem.b(file);
        try {
            try {
                fileSystem.f(file);
                AbstractC6329b.a(interfaceC5474BB, null);
                return true;
            } finally {
            }
        } catch (IOException unused) {
            J j10 = J.f24997a;
            AbstractC6329b.a(interfaceC5474BB, null);
            fileSystem.f(file);
            return false;
        }
    }

    public static final boolean G(Socket socket, InterfaceC5483g source) throws SocketException {
        AbstractC6492s.i(socket, "<this>");
        AbstractC6492s.i(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !source.t();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th2) {
                socket.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String name) {
        AbstractC6492s.i(name, "name");
        return t.C(name, "Authorization", true) || t.C(name, "Cookie", true) || t.C(name, "Proxy-Authorization", true) || t.C(name, "Set-Cookie", true);
    }

    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset J(InterfaceC5483g interfaceC5483g, Charset charset) {
        AbstractC6492s.i(interfaceC5483g, "<this>");
        AbstractC6492s.i(charset, "default");
        int iE = interfaceC5483g.E(f56220e);
        if (iE == -1) {
            return charset;
        }
        if (iE == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC6492s.h(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iE == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            AbstractC6492s.h(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iE == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            AbstractC6492s.h(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iE == 3) {
            return C6510d.f52214a.a();
        }
        if (iE == 4) {
            return C6510d.f52214a.b();
        }
        throw new AssertionError();
    }

    public static final int K(InterfaceC5483g interfaceC5483g) {
        AbstractC6492s.i(interfaceC5483g, "<this>");
        return d(interfaceC5483g.readByte(), 255) | (d(interfaceC5483g.readByte(), 255) << 16) | (d(interfaceC5483g.readByte(), 255) << 8);
    }

    public static final int L(C5481e c5481e, byte b10) throws EOFException {
        AbstractC6492s.i(c5481e, "<this>");
        int i10 = 0;
        while (!c5481e.t() && c5481e.f0(0L) == b10) {
            i10++;
            c5481e.readByte();
        }
        return i10;
    }

    public static final boolean M(InterfaceC5476D interfaceC5476D, int i10, TimeUnit timeUnit) {
        AbstractC6492s.i(interfaceC5476D, "<this>");
        AbstractC6492s.i(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jD = interfaceC5476D.c().f() ? interfaceC5476D.c().d() - jNanoTime : Long.MAX_VALUE;
        interfaceC5476D.c().e(Math.min(jD, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C5481e c5481e = new C5481e();
            while (interfaceC5476D.U(c5481e, 8192L) != -1) {
                c5481e.clear();
            }
            if (jD == Long.MAX_VALUE) {
                interfaceC5476D.c().b();
            } else {
                interfaceC5476D.c().e(jNanoTime + jD);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jD == Long.MAX_VALUE) {
                interfaceC5476D.c().b();
            } else {
                interfaceC5476D.c().e(jNanoTime + jD);
            }
            return false;
        } catch (Throwable th2) {
            if (jD == Long.MAX_VALUE) {
                interfaceC5476D.c().b();
            } else {
                interfaceC5476D.c().e(jNanoTime + jD);
            }
            throw th2;
        }
    }

    public static final ThreadFactory N(final String name, final boolean z10) {
        AbstractC6492s.i(name, "name");
        return new ThreadFactory() { // from class: dj.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.O(name, z10, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread O(String name, boolean z10, Runnable runnable) {
        AbstractC6492s.i(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List P(Headers headers) {
        AbstractC6492s.i(headers, "<this>");
        C7974i c7974iS = AbstractC7978m.s(0, headers.size());
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974iS, 10));
        Iterator it = c7974iS.iterator();
        while (it.hasNext()) {
            int iD = ((Q) it).d();
            arrayList.add(new Header(headers.e(iD), headers.j(iD)));
        }
        return arrayList;
    }

    public static final Headers Q(List list) {
        AbstractC6492s.i(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.d(header.getName().q0(), header.getValue().q0());
        }
        return builder.f();
    }

    public static final String R(int i10) {
        String hexString = Integer.toHexString(i10);
        AbstractC6492s.h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(long j10) {
        String hexString = Long.toHexString(j10);
        AbstractC6492s.h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String T(HttpUrl httpUrl, boolean z10) {
        String strI;
        AbstractC6492s.i(httpUrl, "<this>");
        if (t.W(httpUrl.getHost(), ":", false, 2, null)) {
            strI = '[' + httpUrl.getHost() + ']';
        } else {
            strI = httpUrl.getHost();
        }
        if (!z10 && httpUrl.getPort() == HttpUrl.INSTANCE.c(httpUrl.getScheme())) {
            return strI;
        }
        return strI + ':' + httpUrl.getPort();
    }

    public static /* synthetic */ String U(HttpUrl httpUrl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return T(httpUrl, z10);
    }

    public static final List V(List list) {
        AbstractC6492s.i(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC3689v.l1(list));
        AbstractC6492s.h(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map W(Map map) {
        AbstractC6492s.i(map, "<this>");
        if (map.isEmpty()) {
            return U.h();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        AbstractC6492s.h(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long X(String str, long j10) {
        AbstractC6492s.i(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int Y(String str, int i10) throws NumberFormatException {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return MPv3.MAX_MESSAGE_ID;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String Z(String str, int i10, int i11) {
        AbstractC6492s.i(str, "<this>");
        int iZ = z(str, i10, i11);
        String strSubstring = str.substring(iZ, B(str, iZ, i11));
        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String a0(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return Z(str, i10, i11);
    }

    public static final Throwable b0(Exception exc, List suppressed) {
        AbstractC6492s.i(exc, "<this>");
        AbstractC6492s.i(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC3663g.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void c(List list, Object obj) {
        AbstractC6492s.i(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final void c0(InterfaceC5482f interfaceC5482f, int i10) {
        AbstractC6492s.i(interfaceC5482f, "<this>");
        interfaceC5482f.u((i10 >>> 16) & 255);
        interfaceC5482f.u((i10 >>> 8) & 255);
        interfaceC5482f.u(i10 & 255);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return i10 & j10;
    }

    public static final EventListener.Factory g(final EventListener eventListener) {
        AbstractC6492s.i(eventListener, "<this>");
        return new EventListener.Factory() { // from class: dj.a
            @Override // okhttp3.EventListener.Factory
            public final EventListener a(Call call) {
                return Util.h(eventListener, call);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener h(EventListener this_asFactory, Call it) {
        AbstractC6492s.i(this_asFactory, "$this_asFactory");
        AbstractC6492s.i(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        AbstractC6492s.i(str, "<this>");
        return f56222g.m(str);
    }

    public static final boolean j(HttpUrl httpUrl, HttpUrl other) {
        AbstractC6492s.i(httpUrl, "<this>");
        AbstractC6492s.i(other, "other");
        return AbstractC6492s.d(httpUrl.getHost(), other.getHost()) && httpUrl.getPort() == other.getPort() && AbstractC6492s.d(httpUrl.getScheme(), other.getScheme());
    }

    public static final int k(String name, long j10, TimeUnit timeUnit) {
        AbstractC6492s.i(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) throws IOException {
        AbstractC6492s.i(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) throws IOException {
        AbstractC6492s.i(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!AbstractC6492s.d(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        AbstractC6492s.i(strArr, "<this>");
        AbstractC6492s.i(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[AbstractC3682n.g0(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        AbstractC6492s.i(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int q(String str, String delimiters, int i10, int i11) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(delimiters, "delimiters");
        while (i10 < i11) {
            if (t.V(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(InterfaceC5476D interfaceC5476D, int i10, TimeUnit timeUnit) {
        AbstractC6492s.i(interfaceC5476D, "<this>");
        AbstractC6492s.i(timeUnit, "timeUnit");
        try {
            return M(interfaceC5476D, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        AbstractC6492s.i(format, "format");
        AbstractC6492s.i(args, "args");
        kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f51694a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC6492s.h(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC6492s.i(strArr, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = AbstractC6477c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(Response response) {
        AbstractC6492s.i(response, "<this>");
        String strB = response.getHeaders().b("Content-Length");
        if (strB != null) {
            return X(strB, -1L);
        }
        return -1L;
    }

    public static final List w(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC3689v.o(Arrays.copyOf(objArr, objArr.length)));
        AbstractC6492s.h(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator comparator) {
        AbstractC6492s.i(strArr, "<this>");
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        AbstractC6492s.i(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC6492s.k(cCharAt, 31) <= 0 || AbstractC6492s.k(cCharAt, BER.MAX_OID_LENGTH) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        AbstractC6492s.i(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
