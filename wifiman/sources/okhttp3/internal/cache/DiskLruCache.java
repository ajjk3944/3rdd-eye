package okhttp3.internal.cache;

import Yg.J;
import ej.InterfaceC5474B;
import ej.InterfaceC5476D;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import ej.k;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jh.AbstractC6329b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.p;
import kotlin.text.t;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n*\u0001q\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0004vwxyJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0005J\u001e\u0010\u0018\u001a\b\u0018\u00010\u0017R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\u00032\n\u0010\u001f\u001a\u00060\u001cR\u00020\u00002\u0006\u0010 \u001a\u00020\u000eH\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020\u000e2\n\u0010&\u001a\u00060%R\u00020\u0000H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010\u0005J\r\u0010+\u001a\u00020\u0003¢\u0006\u0004\b+\u0010\u0005J\r\u0010,\u001a\u00020\u0003¢\u0006\u0004\b,\u0010\u0005R\u001a\u00102\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010@\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u0010?R*\u0010G\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010!\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010I\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00105R\u0014\u0010K\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00105R\u0014\u0010M\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u00105R\u0016\u0010O\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010!R\u0018\u0010R\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR*\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060%R\u00020\u00000S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010;R\u0016\u0010]\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010\\R\"\u0010f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010\u0010\"\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010\\R\u0016\u0010j\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010\\R\u0016\u0010l\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010!R\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s¨\u0006z"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "LYg/J;", "r0", "()V", "Lej/f;", "p0", "()Lej/f;", "", "line", "s0", "(Ljava/lang/String;)V", "q0", "", "o0", "()Z", "C", "w0", "key", "y0", "n0", "t0", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", SnmpConfigurator.O_PRIV_PASSPHRASE, "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "S", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", "editor", "success", "J", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "u0", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "v0", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "flush", "close", "x0", "P", "Lokhttp3/internal/io/FileSystem;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/internal/io/FileSystem;", "f0", "()Lokhttp3/internal/io/FileSystem;", "fileSystem", "Ljava/io/File;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/io/File;", "d0", "()Ljava/io/File;", "directory", "", SnmpConfigurator.O_COMMUNITY, "I", "appVersion", "d", "m0", "()I", "valueCount", "value", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getMaxSize", "()J", "setMaxSize", "(J)V", "maxSize", "f", "journalFile", "g", "journalFileTmp", "h", "journalFileBackup", "i", "size", "j", "Lej/f;", "journalWriter", "Ljava/util/LinkedHashMap;", "k", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "l", "redundantOpCount", "m", "Z", "hasJournalErrors", SnmpConfigurator.O_CONTEXT_NAME, "civilizedFileSystem", SnmpConfigurator.O_OPERATION, "initialized", "p", "b0", "setClosed$okhttp", "(Z)V", "closed", "q", "mostRecentTrimFailed", SnmpConfigurator.O_RETRIES, "mostRecentRebuildFailed", "s", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", SnmpConfigurator.O_TIMEOUT, "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", SnmpConfigurator.O_SECURITY_NAME, "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "cleanupTask", SnmpConfigurator.O_VERSION, "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FileSystem fileSystem;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File directory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int appVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int valueCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long maxSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final File journalFile;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final File journalFileTmp;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final File journalFileBackup;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5482f journalWriter;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap lruEntries;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int redundantOpCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean hasJournalErrors;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean civilizedFileSystem;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentTrimFailed;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentRebuildFailed;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long nextSequenceNumber;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final TaskQueue cleanupQueue;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final DiskLruCache$cleanupTask$1 cleanupTask;

    /* renamed from: w, reason: collision with root package name */
    public static final String f56256w = "journal";

    /* renamed from: x, reason: collision with root package name */
    public static final String f56257x = "journal.tmp";

    /* renamed from: y, reason: collision with root package name */
    public static final String f56258y = "journal.bkp";

    /* renamed from: z, reason: collision with root package name */
    public static final String f56259z = "libcore.io.DiskLruCache";

    /* renamed from: A, reason: collision with root package name */
    public static final String f56248A = "1";

    /* renamed from: B, reason: collision with root package name */
    public static final long f56249B = -1;

    /* renamed from: C, reason: collision with root package name */
    public static final p f56250C = new p("[a-z0-9_-]{1,120}");

    /* renamed from: D, reason: collision with root package name */
    public static final String f56251D = "CLEAN";

    /* renamed from: E, reason: collision with root package name */
    public static final String f56252E = "DIRTY";

    /* renamed from: F, reason: collision with root package name */
    public static final String f56253F = "REMOVE";

    /* renamed from: G, reason: collision with root package name */
    public static final String f56254G = "READ";

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "()V", "", "index", "Lej/B;", "f", "(I)Lej/B;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/internal/cache/DiskLruCache$Entry;", "d", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "[Z", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()[Z", "written", "", "Z", "done", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Editor {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Entry entry;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean[] written;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DiskLruCache f56284d;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            AbstractC6492s.i(entry, "entry");
            this.f56284d = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[diskLruCache.getValueCount()];
        }

        public final void a() {
            DiskLruCache diskLruCache = this.f56284d;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC6492s.d(this.entry.getCurrentEditor(), this)) {
                        diskLruCache.J(this, false);
                    }
                    this.done = true;
                    J j10 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = this.f56284d;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC6492s.d(this.entry.getCurrentEditor(), this)) {
                        diskLruCache.J(this, true);
                    }
                    this.done = true;
                    J j10 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            if (AbstractC6492s.d(this.entry.getCurrentEditor(), this)) {
                if (this.f56284d.civilizedFileSystem) {
                    this.f56284d.J(this, false);
                } else {
                    this.entry.q(true);
                }
            }
        }

        /* renamed from: d, reason: from getter */
        public final Entry getEntry() {
            return this.entry;
        }

        /* renamed from: e, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        public final InterfaceC5474B f(int index) {
            DiskLruCache diskLruCache = this.f56284d;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!AbstractC6492s.d(this.entry.getCurrentEditor(), this)) {
                    return ej.p.b();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    AbstractC6492s.f(zArr);
                    zArr[index] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.getFileSystem().b((File) this.entry.getDirtyFiles().get(index)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return ej.p.b();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0018\u00010\u0017R\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b'\u0010)R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R(\u0010<\u001a\b\u0018\u000107R\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00108\u001a\u0004\b \u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b3\u0010?\"\u0004\b@\u0010AR\"\u0010H\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\b=\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "key", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)Ljava/lang/Void;", "", "index", "Lej/D;", "k", "(I)Lej/D;", "LYg/J;", "m", "(Ljava/util/List;)V", "Lej/f;", "writer", "s", "(Lej/f;)V", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", SnmpConfigurator.O_RETRIES, "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", SnmpConfigurator.O_BIND_ADDRESS, "[J", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()[J", "lengths", "", "Ljava/io/File;", SnmpConfigurator.O_COMMUNITY, "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", SnmpConfigurator.O_OPERATION, "(Z)V", "readable", "f", "i", "q", "zombie", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "l", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "currentEditor", "h", "I", "()I", SnmpConfigurator.O_CONTEXT_NAME, "(I)V", "lockingSourceCount", "", "J", "()J", "p", "(J)V", "sequenceNumber", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Entry {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List cleanFiles;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List dirtyFiles;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean readable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean zombie;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Editor currentEditor;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int lockingSourceCount;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long sequenceNumber;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ DiskLruCache f56296j;

        public Entry(DiskLruCache diskLruCache, String key) {
            AbstractC6492s.i(key, "key");
            this.f56296j = diskLruCache;
            this.key = key;
            this.lengths = new long[diskLruCache.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i10 = 0; i10 < valueCount; i10++) {
                sb2.append(i10);
                this.cleanFiles.add(new File(this.f56296j.getDirectory(), sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(new File(this.f56296j.getDirectory(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List strings) throws IOException {
            throw new IOException("unexpected journal line: " + strings);
        }

        private final InterfaceC5476D k(int index) {
            final InterfaceC5476D interfaceC5476DA = this.f56296j.getFileSystem().a((File) this.cleanFiles.get(index));
            if (this.f56296j.civilizedFileSystem) {
                return interfaceC5476DA;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.f56296j;
            return new k(interfaceC5476DA) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private boolean closed;

                @Override // ej.k, ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache2 = diskLruCache;
                    DiskLruCache.Entry entry = this;
                    synchronized (diskLruCache2) {
                        try {
                            entry.n(entry.getLockingSourceCount() - 1);
                            if (entry.getLockingSourceCount() == 0 && entry.getZombie()) {
                                diskLruCache2.v0(entry);
                            }
                            J j10 = J.f24997a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            };
        }

        /* renamed from: a, reason: from getter */
        public final List getCleanFiles() {
            return this.cleanFiles;
        }

        /* renamed from: b, reason: from getter */
        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        /* renamed from: c, reason: from getter */
        public final List getDirtyFiles() {
            return this.dirtyFiles;
        }

        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* renamed from: f, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* renamed from: h, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void l(Editor editor) {
            this.currentEditor = editor;
        }

        public final void m(List strings) throws IOException {
            AbstractC6492s.i(strings, "strings");
            if (strings.size() != this.f56296j.getValueCount()) {
                j(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.lengths[i10] = Long.parseLong((String) strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i10) {
            this.lockingSourceCount = i10;
        }

        public final void o(boolean z10) {
            this.readable = z10;
        }

        public final void p(long j10) {
            this.sequenceNumber = j10;
        }

        public final void q(boolean z10) {
            this.zombie = z10;
        }

        public final Snapshot r() throws IOException {
            DiskLruCache diskLruCache = this.f56296j;
            if (Util.f56223h && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.f56296j.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.f56296j.getValueCount();
                for (int i10 = 0; i10 < valueCount; i10++) {
                    arrayList.add(k(i10));
                }
                return new Snapshot(this.f56296j, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.m((InterfaceC5476D) it.next());
                }
                try {
                    this.f56296j.v0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(InterfaceC5482f writer) {
            AbstractC6492s.i(writer, "writer");
            for (long j10 : this.lengths) {
                writer.u(32).h0(j10);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "Lej/D;", "sources", "", "lengths", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "h", "()Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "index", "g", "(I)Lej/D;", "LYg/J;", "close", "()V", "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "J", SnmpConfigurator.O_COMMUNITY, "Ljava/util/List;", "d", "[J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Snapshot implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long sequenceNumber;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List sources;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DiskLruCache f56304e;

        public Snapshot(DiskLruCache diskLruCache, String key, long j10, List sources, long[] lengths) {
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(sources, "sources");
            AbstractC6492s.i(lengths, "lengths");
            this.f56304e = diskLruCache;
            this.key = key;
            this.sequenceNumber = j10;
            this.sources = sources;
            this.lengths = lengths;
        }

        public final Editor a() {
            return this.f56304e.S(this.key, this.sequenceNumber);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator it = this.sources.iterator();
            while (it.hasNext()) {
                Util.m((InterfaceC5476D) it.next());
            }
        }

        public final InterfaceC5476D g(int index) {
            return (InterfaceC5476D) this.sources.get(index);
        }

        /* renamed from: h, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    private final synchronized void C() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ Editor T(DiskLruCache diskLruCache, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = f56249B;
        }
        return diskLruCache.S(str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o0() {
        int i10 = this.redundantOpCount;
        return i10 >= 2000 && i10 >= this.lruEntries.size();
    }

    private final InterfaceC5482f p0() {
        return ej.p.c(new FaultHidingSink(this.fileSystem.g(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void q0() {
        this.fileSystem.f(this.journalFileTmp);
        Iterator it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC6492s.h(next, "i.next()");
            Entry entry = (Entry) next;
            int i10 = 0;
            if (entry.getCurrentEditor() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    this.size += entry.getLengths()[i10];
                    i10++;
                }
            } else {
                entry.l(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    this.fileSystem.f((File) entry.getCleanFiles().get(i10));
                    this.fileSystem.f((File) entry.getDirtyFiles().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void r0() {
        InterfaceC5483g interfaceC5483gD = ej.p.d(this.fileSystem.a(this.journalFile));
        try {
            String strQ = interfaceC5483gD.Q();
            String strQ2 = interfaceC5483gD.Q();
            String strQ3 = interfaceC5483gD.Q();
            String strQ4 = interfaceC5483gD.Q();
            String strQ5 = interfaceC5483gD.Q();
            if (!AbstractC6492s.d(f56259z, strQ) || !AbstractC6492s.d(f56248A, strQ2) || !AbstractC6492s.d(String.valueOf(this.appVersion), strQ3) || !AbstractC6492s.d(String.valueOf(this.valueCount), strQ4) || strQ5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strQ + ", " + strQ2 + ", " + strQ4 + ", " + strQ5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    s0(interfaceC5483gD.Q());
                    i10++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i10 - this.lruEntries.size();
                    if (interfaceC5483gD.t()) {
                        this.journalWriter = p0();
                    } else {
                        t0();
                    }
                    J j10 = J.f24997a;
                    AbstractC6329b.a(interfaceC5483gD, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final void s0(String line) throws IOException {
        String strSubstring;
        int iJ0 = t.j0(line, ' ', 0, false, 6, null);
        if (iJ0 == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i10 = iJ0 + 1;
        int iJ02 = t.j0(line, ' ', i10, false, 4, null);
        if (iJ02 == -1) {
            strSubstring = line.substring(i10);
            AbstractC6492s.h(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str = f56253F;
            if (iJ0 == str.length() && t.P(line, str, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i10, iJ02);
            AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = (Entry) this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iJ02 != -1) {
            String str2 = f56251D;
            if (iJ0 == str2.length() && t.P(line, str2, false, 2, null)) {
                String strSubstring2 = line.substring(iJ02 + 1);
                AbstractC6492s.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listP0 = t.P0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                entry.o(true);
                entry.l(null);
                entry.m(listP0);
                return;
            }
        }
        if (iJ02 == -1) {
            String str3 = f56252E;
            if (iJ0 == str3.length() && t.P(line, str3, false, 2, null)) {
                entry.l(new Editor(this, entry));
                return;
            }
        }
        if (iJ02 == -1) {
            String str4 = f56254G;
            if (iJ0 == str4.length() && t.P(line, str4, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + line);
    }

    private final boolean w0() {
        for (Entry toEvict : this.lruEntries.values()) {
            if (!toEvict.getZombie()) {
                AbstractC6492s.h(toEvict, "toEvict");
                v0(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void y0(String key) {
        if (f56250C.m(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    public final synchronized void J(Editor editor, boolean success) {
        AbstractC6492s.i(editor, "editor");
        Entry entry = editor.getEntry();
        if (!AbstractC6492s.d(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (success && !entry.getReadable()) {
            int i10 = this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] written = editor.getWritten();
                AbstractC6492s.f(written);
                if (!written[i11]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.fileSystem.d((File) entry.getDirtyFiles().get(i11))) {
                    editor.a();
                    return;
                }
            }
        }
        int i12 = this.valueCount;
        for (int i13 = 0; i13 < i12; i13++) {
            File file = (File) entry.getDirtyFiles().get(i13);
            if (!success || entry.getZombie()) {
                this.fileSystem.f(file);
            } else if (this.fileSystem.d(file)) {
                File file2 = (File) entry.getCleanFiles().get(i13);
                this.fileSystem.e(file, file2);
                long j10 = entry.getLengths()[i13];
                long jH = this.fileSystem.h(file2);
                entry.getLengths()[i13] = jH;
                this.size = (this.size - j10) + jH;
            }
        }
        entry.l(null);
        if (entry.getZombie()) {
            v0(entry);
            return;
        }
        this.redundantOpCount++;
        InterfaceC5482f interfaceC5482f = this.journalWriter;
        AbstractC6492s.f(interfaceC5482f);
        if (entry.getReadable() || success) {
            entry.o(true);
            interfaceC5482f.F(f56251D).u(32);
            interfaceC5482f.F(entry.getKey());
            entry.s(interfaceC5482f);
            interfaceC5482f.u(10);
            if (success) {
                long j11 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j11;
                entry.p(j11);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            interfaceC5482f.F(f56253F).u(32);
            interfaceC5482f.F(entry.getKey());
            interfaceC5482f.u(10);
        }
        interfaceC5482f.flush();
        if (this.size > this.maxSize || o0()) {
            TaskQueue.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void P() {
        close();
        this.fileSystem.c(this.directory);
    }

    public final synchronized Editor S(String key, long expectedSequenceNumber) {
        AbstractC6492s.i(key, "key");
        n0();
        C();
        y0(key);
        Entry entry = (Entry) this.lruEntries.get(key);
        if (expectedSequenceNumber != f56249B && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            InterfaceC5482f interfaceC5482f = this.journalWriter;
            AbstractC6492s.f(interfaceC5482f);
            interfaceC5482f.F(f56252E).u(32).F(key).u(10);
            interfaceC5482f.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.l(editor);
            return editor;
        }
        TaskQueue.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized Snapshot Y(String key) {
        AbstractC6492s.i(key, "key");
        n0();
        C();
        y0(key);
        Entry entry = (Entry) this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotR = entry.r();
        if (snapshotR == null) {
            return null;
        }
        this.redundantOpCount++;
        InterfaceC5482f interfaceC5482f = this.journalWriter;
        AbstractC6492s.f(interfaceC5482f);
        interfaceC5482f.F(f56254G).u(32).F(key).u(10);
        if (o0()) {
            TaskQueue.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshotR;
    }

    /* renamed from: b0, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor currentEditor;
        try {
            if (this.initialized && !this.closed) {
                Collection collectionValues = this.lruEntries.values();
                AbstractC6492s.h(collectionValues, "lruEntries.values");
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                        currentEditor.c();
                    }
                }
                x0();
                InterfaceC5482f interfaceC5482f = this.journalWriter;
                AbstractC6492s.f(interfaceC5482f);
                interfaceC5482f.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d0, reason: from getter */
    public final File getDirectory() {
        return this.directory;
    }

    /* renamed from: f0, reason: from getter */
    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            C();
            x0();
            InterfaceC5482f interfaceC5482f = this.journalWriter;
            AbstractC6492s.f(interfaceC5482f);
            interfaceC5482f.flush();
        }
    }

    /* renamed from: m0, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void n0() {
        try {
            if (Util.f56223h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.d(this.journalFileBackup)) {
                if (this.fileSystem.d(this.journalFile)) {
                    this.fileSystem.f(this.journalFileBackup);
                } else {
                    this.fileSystem.e(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.F(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.d(this.journalFile)) {
                try {
                    r0();
                    q0();
                    this.initialized = true;
                    return;
                } catch (IOException e10) {
                    Platform.INSTANCE.g().k("DiskLruCache " + this.directory + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        P();
                        this.closed = false;
                    } catch (Throwable th2) {
                        this.closed = false;
                        throw th2;
                    }
                }
            }
            t0();
            this.initialized = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void t0() {
        try {
            InterfaceC5482f interfaceC5482f = this.journalWriter;
            if (interfaceC5482f != null) {
                interfaceC5482f.close();
            }
            InterfaceC5482f interfaceC5482fC = ej.p.c(this.fileSystem.b(this.journalFileTmp));
            try {
                interfaceC5482fC.F(f56259z).u(10);
                interfaceC5482fC.F(f56248A).u(10);
                interfaceC5482fC.h0(this.appVersion).u(10);
                interfaceC5482fC.h0(this.valueCount).u(10);
                interfaceC5482fC.u(10);
                for (Entry entry : this.lruEntries.values()) {
                    if (entry.getCurrentEditor() != null) {
                        interfaceC5482fC.F(f56252E).u(32);
                        interfaceC5482fC.F(entry.getKey());
                        interfaceC5482fC.u(10);
                    } else {
                        interfaceC5482fC.F(f56251D).u(32);
                        interfaceC5482fC.F(entry.getKey());
                        entry.s(interfaceC5482fC);
                        interfaceC5482fC.u(10);
                    }
                }
                J j10 = J.f24997a;
                AbstractC6329b.a(interfaceC5482fC, null);
                if (this.fileSystem.d(this.journalFile)) {
                    this.fileSystem.e(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.e(this.journalFileTmp, this.journalFile);
                this.fileSystem.f(this.journalFileBackup);
                this.journalWriter = p0();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean u0(String key) {
        AbstractC6492s.i(key, "key");
        n0();
        C();
        y0(key);
        Entry entry = (Entry) this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean zV0 = v0(entry);
        if (zV0 && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zV0;
    }

    public final boolean v0(Entry entry) {
        InterfaceC5482f interfaceC5482f;
        AbstractC6492s.i(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (interfaceC5482f = this.journalWriter) != null) {
                interfaceC5482f.F(f56252E);
                interfaceC5482f.u(32);
                interfaceC5482f.F(entry.getKey());
                interfaceC5482f.u(10);
                interfaceC5482f.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.q(true);
                return true;
            }
        }
        Editor currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.c();
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.fileSystem.f((File) entry.getCleanFiles().get(i11));
            this.size -= entry.getLengths()[i11];
            entry.getLengths()[i11] = 0;
        }
        this.redundantOpCount++;
        InterfaceC5482f interfaceC5482f2 = this.journalWriter;
        if (interfaceC5482f2 != null) {
            interfaceC5482f2.F(f56253F);
            interfaceC5482f2.u(32);
            interfaceC5482f2.F(entry.getKey());
            interfaceC5482f2.u(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (o0()) {
            TaskQueue.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void x0() {
        while (this.size > this.maxSize) {
            if (!w0()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}
