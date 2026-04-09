package ib;

import ib.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.InterfaceC6518l;
import kotlin.text.p;
import mh.InterfaceC6835l;
import org.webrtc.Loggable;
import org.webrtc.Logging;

/* loaded from: classes3.dex */
public final class h implements Loggable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f49132c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static int f49133d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static int f49134e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final p f49135f = new p("(?:(?<=\\s|,|:|/)|(?<=^))(?:(?:(?:[0-9a-f|x]{1,4}:)|(?:):){2,10})(?:(?:[0-9a-f|x]{1,4})|(?:))");

    /* renamed from: g, reason: collision with root package name */
    private static final p f49136g = new p("(?:[0-9]{1,3}\\.){3}(?:[0-9]{1,3}|x)");

    /* renamed from: h, reason: collision with root package name */
    private static final Map f49137h = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    private boolean f49138a;

    /* renamed from: b, reason: collision with root package name */
    private final List f49139b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String d(String str) {
            Map map = h.f49137h;
            Object obj = map.get(str);
            if (obj == null) {
                int i10 = h.f49134e;
                h.f49134e = i10 + 1;
                obj = "ipv4-" + i10;
                map.put(str, obj);
            }
            return (String) obj;
        }

        private final String e(String str) {
            Map map = h.f49137h;
            Object obj = map.get(str);
            if (obj == null) {
                int i10 = h.f49133d;
                h.f49133d = i10 + 1;
                obj = "ipv6-" + i10;
                map.put(str, obj);
            }
            return (String) obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String str) {
            return h.f49136g.o(h.f49135f.o(str, new InterfaceC6835l() { // from class: ib.f
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return h.a.g((InterfaceC6518l) obj);
                }
            }), new InterfaceC6835l() { // from class: ib.g
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return h.a.h((InterfaceC6518l) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence g(InterfaceC6518l result) {
            AbstractC6492s.i(result, "result");
            return h.f49132c.e(result.getValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence h(InterfaceC6518l result) {
            AbstractC6492s.i(result, "result");
            return h.f49132c.d(result.getValue());
        }

        private a() {
        }
    }

    public h() {
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC6492s.h(listSynchronizedList, "synchronizedList(...)");
        this.f49139b = listSynchronizedList;
    }

    public final List h() {
        ArrayList arrayList;
        synchronized (this.f49139b) {
            arrayList = new ArrayList();
            arrayList.addAll(this.f49139b);
        }
        return arrayList;
    }

    public final void i() {
        this.f49139b.clear();
        this.f49138a = true;
    }

    public final void j() {
        this.f49138a = false;
        this.f49139b.clear();
    }

    @Override // org.webrtc.Loggable
    public void onLogMessage(String message, Logging.Severity severity, String tag) {
        AbstractC6492s.i(message, "message");
        AbstractC6492s.i(severity, "severity");
        AbstractC6492s.i(tag, "tag");
        if (this.f49138a) {
            this.f49139b.add(new b(f49132c.f(message), severity, tag, 0L, 8, null));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f49140a;

        /* renamed from: b, reason: collision with root package name */
        private final Logging.Severity f49141b;

        /* renamed from: c, reason: collision with root package name */
        private final String f49142c;

        /* renamed from: d, reason: collision with root package name */
        private final long f49143d;

        public b(String message, Logging.Severity severity, String tag, long j10) {
            AbstractC6492s.i(message, "message");
            AbstractC6492s.i(severity, "severity");
            AbstractC6492s.i(tag, "tag");
            this.f49140a = message;
            this.f49141b = severity;
            this.f49142c = tag;
            this.f49143d = j10;
        }

        public final String a() {
            return this.f49140a;
        }

        public final Logging.Severity b() {
            return this.f49141b;
        }

        public final String c() {
            return this.f49142c;
        }

        public final long d() {
            return this.f49143d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f49140a, bVar.f49140a) && this.f49141b == bVar.f49141b && AbstractC6492s.d(this.f49142c, bVar.f49142c) && this.f49143d == bVar.f49143d;
        }

        public int hashCode() {
            return (((((this.f49140a.hashCode() * 31) + this.f49141b.hashCode()) * 31) + this.f49142c.hashCode()) * 31) + Long.hashCode(this.f49143d);
        }

        public String toString() {
            return "Log(message=" + this.f49140a + ", severity=" + this.f49141b + ", tag=" + this.f49142c + ", timestamp=" + this.f49143d + ")";
        }

        public /* synthetic */ b(String str, Logging.Severity severity, String str2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, severity, str2, (i10 & 8) != 0 ? System.currentTimeMillis() : j10);
        }
    }
}
