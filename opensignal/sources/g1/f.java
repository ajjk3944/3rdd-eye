package g1;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import io.sentry.SpotlightIntegration;
import io.sentry.a5;
import io.sentry.b5;
import io.sentry.d1;
import io.sentry.d3;
import io.sentry.d5;
import io.sentry.e5;
import io.sentry.g1;
import io.sentry.g3;
import io.sentry.g4;
import io.sentry.i1;
import io.sentry.i4;
import io.sentry.i6;
import io.sentry.j2;
import io.sentry.k1;
import io.sentry.k6;
import io.sentry.l3;
import io.sentry.l5;
import io.sentry.m1;
import io.sentry.m4;
import io.sentry.n4;
import io.sentry.o4;
import io.sentry.p4;
import io.sentry.q6;
import io.sentry.r4;
import io.sentry.s4;
import io.sentry.s6;
import io.sentry.t4;
import io.sentry.u0;
import io.sentry.w2;
import io.sentry.x5;
import io.sentry.z0;
import io.sentry.z4;
import io.sentry.z5;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.regex.Pattern;
import n0.b2;
import n0.g2;
import n0.x0;
import p.l2;

/* loaded from: classes.dex */
public final class f implements w, d1, g2 {

    /* renamed from: y, reason: collision with root package name */
    public static boolean f9207y = true;

    /* renamed from: d, reason: collision with root package name */
    public Object f9209d;

    /* renamed from: g, reason: collision with root package name */
    public Object f9210g;

    /* renamed from: x, reason: collision with root package name */
    public Object f9212x;

    /* renamed from: r, reason: collision with root package name */
    public Object f9211r = new i4();

    /* renamed from: a, reason: collision with root package name */
    public boolean f9208a = true;

    public f(x5 x5Var) throws IllegalArgumentException {
        this.f9209d = x5Var;
        m1 transportFactory = x5Var.getTransportFactory();
        if (transportFactory instanceof w2) {
            transportFactory = new j2();
            x5Var.setTransportFactory(transportFactory);
        }
        io.sentry.z zVarRetrieveParsedDsn = x5Var.retrieveParsedDsn();
        String sentryClientName = x5Var.getSentryClientName();
        URI uri = zVarRetrieveParsedDsn.f12872c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = zVarRetrieveParsedDsn.f12871b;
        String str2 = zVarRetrieveParsedDsn.f12870a;
        StringBuilder sb2 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb2.append(sentryClientName);
        sb2.append(",sentry_key=");
        sb2.append(str);
        sb2.append((str2 == null || str2.length() <= 0) ? "" : ",sentry_secret=".concat(str2));
        String string2 = sb2.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        io.sentry.t tVar = new io.sentry.t();
        ir.f0.T(string, "url is required");
        try {
            tVar.f12736a = URI.create(string).toURL();
            tVar.f12737d = map;
            this.f9210g = transportFactory.c(x5Var, tVar);
            if (x5Var.getLogs().f12693a) {
                this.f9212x = new io.sentry.logger.c(x5Var, this);
            } else {
                this.f9212x = io.sentry.logger.d.f12432d;
            }
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e4);
        }
    }

    public static ArrayList u(io.sentry.h0 h0Var) {
        ArrayList arrayList = new ArrayList(h0Var.f12294b);
        io.sentry.a aVar = h0Var.f12296d;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        io.sentry.a aVar2 = h0Var.f12297e;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        io.sentry.a aVar3 = h0Var.f12298f;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        return arrayList;
    }

    public d5 A(d5 d5Var, List list) {
        x5 x5Var = (x5) this.f9209d;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            io.sentry.c0 c0Var = (io.sentry.c0) it.next();
            try {
                d5Var = c0Var.i(d5Var);
            } catch (Throwable th2) {
                x5Var.getLogger().f(b5.ERROR, th2, "An exception occurred while processing log event by processor: %s", c0Var.getClass().getName());
            }
            if (d5Var == null) {
                x5Var.getLogger().m(b5.DEBUG, "Log event was dropped by a processor: %s", c0Var.getClass().getName());
                x5Var.getClientReportRecorder().l(io.sentry.clientreport.d.EVENT_PROCESSOR, io.sentry.m.LogItem);
                break;
            }
        }
        return d5Var;
    }

    public io.sentry.protocol.a0 B(io.sentry.protocol.a0 a0Var, io.sentry.h0 h0Var, List list) {
        x5 x5Var = (x5) this.f9209d;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            io.sentry.c0 c0Var = (io.sentry.c0) it.next();
            int size = a0Var.O.size();
            try {
                a0Var = c0Var.h(a0Var, h0Var);
            } catch (Throwable th2) {
                x5Var.getLogger().f(b5.ERROR, th2, "An exception occurred while processing transaction by processor: %s", c0Var.getClass().getName());
            }
            int size2 = a0Var == null ? 0 : a0Var.O.size();
            if (a0Var == null) {
                x5Var.getLogger().m(b5.DEBUG, "Transaction was dropped by a processor: %s", c0Var.getClass().getName());
                io.sentry.clientreport.f clientReportRecorder = x5Var.getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                clientReportRecorder.l(dVar, io.sentry.m.Transaction);
                x5Var.getClientReportRecorder().p(dVar, io.sentry.m.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i10 = size - size2;
                x5Var.getLogger().m(b5.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i10), c0Var.getClass().getName());
                x5Var.getClientReportRecorder().p(io.sentry.clientreport.d.EVENT_PROCESSOR, io.sentry.m.Span, i10);
            }
        }
        return a0Var;
    }

    public io.sentry.protocol.t C(i4.b bVar, io.sentry.h0 h0Var) {
        io.sentry.transport.g gVar = (io.sentry.transport.g) this.f9210g;
        x5 x5Var = (x5) this.f9209d;
        l5 beforeEnvelopeCallback = x5Var.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) beforeEnvelopeCallback;
                try {
                    spotlightIntegration.f11446g.submit(new a5.o(spotlightIntegration, 19, bVar));
                } catch (RejectedExecutionException e4) {
                    spotlightIntegration.f11445d.g(b5.WARNING, "Spotlight envelope submission rejected.", e4);
                }
            } catch (Throwable th2) {
                x5Var.getLogger().g(b5.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        z4.d().c(x5Var.getLogger());
        if (h0Var == null) {
            gVar.getClass();
            gVar.v(bVar, new io.sentry.h0());
        } else {
            gVar.v(bVar, h0Var);
        }
        io.sentry.protocol.t tVar = ((m4) bVar.f11196a).f12435a;
        return tVar != null ? tVar : io.sentry.protocol.t.f12636d;
    }

    public boolean D(g4 g4Var, io.sentry.h0 h0Var) {
        if (dr.a.H(h0Var)) {
            return true;
        }
        ((x5) this.f9209d).getLogger().m(b5.DEBUG, "Event was cached so not applying scope: %s", g4Var.f12268a);
        return false;
    }

    @Override // io.sentry.d1
    public void a(boolean z10) throws IOException {
        long shutdownTimeoutMillis;
        x5 x5Var = (x5) this.f9209d;
        x5Var.getLogger().m(b5.INFO, "Closing SentryClient.", new Object[0]);
        if (z10) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = x5Var.getShutdownTimeoutMillis();
            } catch (IOException e4) {
                x5Var.getLogger().g(b5.WARNING, "Failed to close the connection to the Sentry Server.", e4);
            }
        }
        c(shutdownTimeoutMillis);
        ((io.sentry.logger.b) this.f9212x).a(z10);
        ((io.sentry.transport.g) this.f9210g).a(z10);
        for (io.sentry.c0 c0Var : x5Var.getEventProcessors()) {
            if (c0Var instanceof Closeable) {
                try {
                    ((Closeable) c0Var).close();
                } catch (IOException e10) {
                    x5Var.getLogger().m(b5.WARNING, "Failed to close the event processor {}.", c0Var, e10);
                }
            }
        }
        this.f9208a = false;
    }

    @Override // io.sentry.d1
    public void b(i6 i6Var, io.sentry.h0 h0Var) {
        x5 x5Var = (x5) this.f9209d;
        ir.f0.T(i6Var, "Session is required.");
        String str = i6Var.I;
        if (str == null || str.isEmpty()) {
            x5Var.getLogger().m(b5.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            g1 serializer = x5Var.getSerializer();
            io.sentry.protocol.r sdkVersion = x5Var.getSdkVersion();
            ir.f0.T(serializer, "Serializer is required.");
            j(new i4.b(null, sdkVersion, r4.d(serializer, i6Var)), h0Var);
        } catch (IOException e4) {
            x5Var.getLogger().g(b5.ERROR, "Failed to capture session.", e4);
        }
    }

    @Override // io.sentry.d1
    public void c(long j) {
        ((io.sentry.logger.b) this.f9212x).c(j);
        ((io.sentry.transport.g) this.f9210g).c(j);
    }

    @Override // io.sentry.d1
    public io.sentry.transport.p d() {
        return ((io.sentry.transport.g) this.f9210g).d();
    }

    @Override // io.sentry.d1
    public boolean e() {
        return ((io.sentry.transport.g) this.f9210g).e();
    }

    @Override // io.sentry.d1
    public io.sentry.protocol.t f(z5 z5Var, z0 z0Var, io.sentry.h0 h0Var) {
        x5 x5Var = (x5) this.f9209d;
        if (D(z5Var, h0Var)) {
            io.sentry.protocol.n nVar = z5Var.f12271r;
            io.sentry.protocol.c cVar = z5Var.f12269d;
            if (nVar == null) {
                z5Var.f12271r = z0Var.L();
            }
            if (z5Var.E == null) {
                z5Var.E = z0Var.K();
            }
            if (z5Var.f12272x == null) {
                z5Var.f12272x = new HashMap(new HashMap(z0Var.z()));
            } else {
                for (Map.Entry entry : z0Var.z().entrySet()) {
                    if (!z5Var.f12272x.containsKey(entry.getKey())) {
                        z5Var.f12272x.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new io.sentry.protocol.c(z0Var.D()).f12528a.entrySet()) {
                if (!cVar.a(entry2.getKey())) {
                    cVar.j(entry2.getValue(), (String) entry2.getKey());
                }
            }
            i1 i1VarH = z0Var.h();
            if (cVar.h() == null) {
                if (i1VarH == null) {
                    cVar.t(s6.b(z0Var.v()));
                } else {
                    cVar.t(i1VarH.t());
                }
            }
        }
        x5Var.getLogger().m(b5.DEBUG, "Capturing session replay: %s", z5Var.f12268a);
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        io.sentry.protocol.t tVar2 = z5Var.f12268a;
        if (tVar2 != null) {
            tVar = tVar2;
        }
        Iterator<io.sentry.c0> it = x5Var.getEventProcessors().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            io.sentry.c0 next = it.next();
            try {
                z5Var = next.b(z5Var, h0Var);
            } catch (Throwable th2) {
                x5Var.getLogger().f(b5.ERROR, th2, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (z5Var == null) {
                x5Var.getLogger().m(b5.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                x5Var.getClientReportRecorder().l(io.sentry.clientreport.d.EVENT_PROCESSOR, io.sentry.m.Replay);
                break;
            }
        }
        if (z5Var != null) {
            x5Var.getBeforeSendReplay();
        }
        if (z5Var == null) {
            return io.sentry.protocol.t.f12636d;
        }
        try {
            i4.b bVarT = t(z5Var, h0Var.f12299g, v(z0Var, h0Var, z5Var, null), io.sentry.hints.b.class.isInstance(dr.a.y(h0Var)));
            h0Var.a();
            ((io.sentry.transport.g) this.f9210g).v(bVarT, h0Var);
            return tVar;
        } catch (IOException e4) {
            x5Var.getLogger().f(b5.WARNING, e4, "Capturing event %s failed.", tVar);
            return io.sentry.protocol.t.f12636d;
        }
    }

    @Override // n0.g2
    public Object getValue() {
        return ((b2) ((x0) this.f9212x)).getValue();
    }

    @Override // io.sentry.d1
    public void h(d5 d5Var, z0 z0Var) {
        d5 d5VarA;
        x5 x5Var = (x5) this.f9209d;
        d5 d5VarA2 = A(d5Var, z0Var.M());
        if (d5VarA2 == null || (d5VarA = A(d5VarA2, x5Var.getEventProcessors())) == null) {
            return;
        }
        x5Var.getLogs().getClass();
        ((io.sentry.logger.b) this.f9212x).b(d5VarA);
    }

    @Override // io.sentry.d1
    public boolean isEnabled() {
        return this.f9208a;
    }

    @Override // io.sentry.d1
    public io.sentry.protocol.t j(i4.b bVar, io.sentry.h0 h0Var) {
        try {
            h0Var.a();
            return C(bVar, h0Var);
        } catch (IOException e4) {
            ((x5) this.f9209d).getLogger().g(b5.ERROR, "Failed to capture envelope.", e4);
            return io.sentry.protocol.t.f12636d;
        }
    }

    @Override // g1.w
    public void k(j1.c cVar) {
        synchronized (this.f9210g) {
            if (!cVar.f13066s) {
                cVar.f13066s = true;
                cVar.b();
            }
        }
    }

    @Override // io.sentry.d1
    public io.sentry.protocol.t l(io.sentry.protocol.a0 a0Var, q6 q6Var, z0 z0Var, io.sentry.h0 h0Var, g3 g3Var) {
        Throwable th2;
        ArrayList arrayList;
        Pattern pattern;
        x5 x5Var = (x5) this.f9209d;
        if (h0Var == null) {
            h0Var = new io.sentry.h0();
        }
        if (D(a0Var, h0Var)) {
            h0Var.f12294b.addAll(z0Var.B());
        }
        x5Var.getLogger().m(b5.DEBUG, "Capturing transaction: %s", a0Var.f12268a);
        List<io.sentry.f0> ignoredTransactions = x5Var.getIgnoredTransactions();
        String str = a0Var.L;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<io.sentry.f0> it = ignoredTransactions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<io.sentry.f0> it2 = ignoredTransactions.iterator();
                    while (it2.hasNext()) {
                        try {
                            pattern = it2.next().f12250b;
                        } catch (Throwable unused) {
                        }
                        if (pattern == null ? false : pattern.matcher(str).matches()) {
                        }
                    }
                } else if (it.next().f12249a.equalsIgnoreCase(str)) {
                    break;
                }
            }
            x5Var.getLogger().m(b5.DEBUG, "Transaction was dropped as transaction name %s is ignored", a0Var.L);
            io.sentry.clientreport.f clientReportRecorder = x5Var.getClientReportRecorder();
            io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
            clientReportRecorder.l(dVar, io.sentry.m.Transaction);
            x5Var.getClientReportRecorder().p(dVar, io.sentry.m.Span, a0Var.O.size() + 1);
            return io.sentry.protocol.t.f12636d;
        }
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        io.sentry.protocol.t tVar2 = a0Var.f12268a;
        if (tVar2 == null) {
            tVar2 = tVar;
        }
        if (D(a0Var, h0Var)) {
            q(a0Var, z0Var);
            a0Var = B(a0Var, h0Var, z0Var.M());
            if (a0Var == null) {
                x5Var.getLogger().m(b5.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (a0Var != null) {
            a0Var = B(a0Var, h0Var, x5Var.getEventProcessors());
        }
        io.sentry.protocol.a0 a0Var2 = a0Var;
        if (a0Var2 == null) {
            x5Var.getLogger().m(b5.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return tVar;
        }
        ArrayList arrayList2 = a0Var2.O;
        int size = arrayList2.size();
        x5Var.getBeforeSendTransaction();
        int size2 = arrayList2.size();
        if (size2 < size) {
            int i10 = size - size2;
            x5Var.getLogger().m(b5.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i10));
            x5Var.getClientReportRecorder().p(io.sentry.clientreport.d.BEFORE_SEND, io.sentry.m.Span, i10);
        }
        try {
            ArrayList arrayListU = u(h0Var);
            arrayList = new ArrayList();
            Iterator it3 = arrayListU.iterator();
            while (it3.hasNext()) {
                try {
                    try {
                        ((io.sentry.a) it3.next()).getClass();
                    } catch (io.sentry.exception.b e4) {
                        e = e4;
                        th2 = e;
                        x5Var.getLogger().f(b5.WARNING, th2, "Capturing transaction %s failed.", tVar2);
                        return io.sentry.protocol.t.f12636d;
                    } catch (IOException e10) {
                        e = e10;
                        th2 = e;
                        x5Var.getLogger().f(b5.WARNING, th2, "Capturing transaction %s failed.", tVar2);
                        return io.sentry.protocol.t.f12636d;
                    }
                } catch (io.sentry.exception.b e11) {
                    e = e11;
                } catch (IOException e12) {
                    e = e12;
                }
            }
        } catch (io.sentry.exception.b | IOException e13) {
            e = e13;
        }
        try {
            i4.b bVarR = r(a0Var2, arrayList, null, q6Var, g3Var);
            h0Var.a();
            return bVarR != null ? C(bVarR, h0Var) : tVar2;
        } catch (io.sentry.exception.b e14) {
            e = e14;
            th2 = e;
            x5Var.getLogger().f(b5.WARNING, th2, "Capturing transaction %s failed.", tVar2);
            return io.sentry.protocol.t.f12636d;
        } catch (IOException e15) {
            e = e15;
            th2 = e;
            x5Var.getLogger().f(b5.WARNING, th2, "Capturing transaction %s failed.", tVar2);
            return io.sentry.protocol.t.f12636d;
        }
    }

    @Override // g1.w
    public j1.c m() {
        j1.e jVar;
        j1.c cVar;
        synchronized (this.f9210g) {
            try {
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f9209d;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    androidComposeView.getUniqueDrawingId();
                }
                if (i10 >= 29) {
                    jVar = new j1.h();
                } else if (f9207y) {
                    try {
                        jVar = new j1.f((AndroidComposeView) this.f9209d, new q(), new i1.b());
                    } catch (Throwable unused) {
                        f9207y = false;
                        jVar = new j1.j(x((AndroidComposeView) this.f9209d));
                    }
                } else {
                    jVar = new j1.j(x((AndroidComposeView) this.f9209d));
                }
                cVar = new j1.c(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // io.sentry.d1
    public io.sentry.protocol.t n(d3 d3Var) {
        ir.f0.T(d3Var, "profileChunk is required.");
        x5 x5Var = (x5) this.f9209d;
        x5Var.getLogger().m(b5.DEBUG, "Capturing profile chunk: %s", d3Var.f12181g);
        io.sentry.protocol.t tVar = d3Var.f12181g;
        io.sentry.protocol.d dVarA = io.sentry.protocol.d.a(d3Var.f12179a, x5Var);
        if (dVarA != null) {
            d3Var.f12179a = dVarA;
        }
        try {
            return C(new i4.b(new m4(tVar, x5Var.getSdkVersion(), null), Collections.singletonList(r4.c(d3Var, x5Var.getSerializer()))), null);
        } catch (io.sentry.exception.b | IOException e4) {
            x5Var.getLogger().f(b5.WARNING, e4, "Capturing profile chunk %s failed.", tVar);
            return io.sentry.protocol.t.f12636d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032d  */
    @Override // io.sentry.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.protocol.t o(io.sentry.t4 r13, io.sentry.z0 r14, io.sentry.h0 r15) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f.o(io.sentry.t4, io.sentry.z0, io.sentry.h0):io.sentry.protocol.t");
    }

    public void p() throws IOException {
        synchronized (((ou.g) this.f9212x)) {
            if (this.f9208a) {
                return;
            }
            this.f9208a = true;
            pu.b.d((cv.d0) this.f9210g);
            try {
                ((d8.a) this.f9209d).a();
            } catch (IOException unused) {
            }
        }
    }

    public void q(g4 g4Var, z0 z0Var) {
        if (z0Var != null) {
            if (g4Var.f12271r == null) {
                g4Var.f12271r = z0Var.L();
            }
            if (g4Var.E == null) {
                g4Var.E = z0Var.K();
            }
            if (g4Var.f12272x == null) {
                g4Var.f12272x = new HashMap(new HashMap(z0Var.z()));
            } else {
                for (Map.Entry entry : z0Var.z().entrySet()) {
                    if (!g4Var.f12272x.containsKey(entry.getKey())) {
                        g4Var.f12272x.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (g4Var.I == null) {
                g4Var.I = new ArrayList(new ArrayList(z0Var.s()));
            } else {
                Queue queueS = z0Var.s();
                List list = g4Var.I;
                if (list != null && !queueS.isEmpty()) {
                    list.addAll(queueS);
                    Collections.sort(list, (i4) this.f9211r);
                }
            }
            if (g4Var.K == null) {
                g4Var.K = new HashMap(new HashMap(z0Var.getExtras()));
            } else {
                for (Map.Entry entry2 : z0Var.getExtras().entrySet()) {
                    if (!g4Var.K.containsKey(entry2.getKey())) {
                        g4Var.K.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVar = g4Var.f12269d;
            for (Map.Entry entry3 : new io.sentry.protocol.c(z0Var.D()).f12528a.entrySet()) {
                if (!cVar.a(entry3.getKey())) {
                    cVar.j(entry3.getValue(), (String) entry3.getKey());
                }
            }
        }
    }

    public i4.b r(g4 g4Var, ArrayList arrayList, i6 i6Var, q6 q6Var, g3 g3Var) {
        io.sentry.protocol.t tVar;
        x5 x5Var = (x5) this.f9209d;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 1;
        if (g4Var != null) {
            g1 serializer = x5Var.getSerializer();
            Charset charset = r4.f12689d;
            ir.f0.T(serializer, "ISerializer is required.");
            io.sentry.t tVar2 = new io.sentry.t((Callable) new n4(serializer, 1, g4Var));
            arrayList2.add(new r4(new s4(a5.resolve(g4Var), new o4(tVar2, 4), "application/json", null, null), new o4(tVar2, 5)));
            tVar = g4Var.f12268a;
        } else {
            tVar = null;
        }
        if (i6Var != null) {
            arrayList2.add(r4.d(x5Var.getSerializer(), i6Var));
        }
        if (g3Var != null) {
            long maxTraceFileSize = x5Var.getMaxTraceFileSize();
            g1 serializer2 = x5Var.getSerializer();
            Charset charset2 = r4.f12689d;
            File file = g3Var.f12262a;
            io.sentry.t tVar3 = new io.sentry.t((Callable) new p4(file, maxTraceFileSize, g3Var, serializer2));
            arrayList2.add(new r4(new s4(a5.Profile, new o4(tVar3, 2), "application-json", file.getName(), null), new o4(tVar3, 3)));
            if (tVar == null) {
                tVar = new io.sentry.protocol.t(g3Var.S);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.sentry.a aVar = (io.sentry.a) it.next();
                g1 serializer3 = x5Var.getSerializer();
                u0 logger = x5Var.getLogger();
                long maxAttachmentSize = x5Var.getMaxAttachmentSize();
                Charset charset3 = r4.f12689d;
                io.sentry.t tVar4 = new io.sentry.t((Callable) new p4(aVar, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new r4(new s4(a5.Attachment, new o4(tVar4, 0), aVar.f11456e, aVar.f11455d, aVar.f11457f), new o4(tVar4, i10)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new i4.b(new m4(tVar, x5Var.getSdkVersion(), q6Var), (List) arrayList2);
    }

    public i4.b s(e5 e5Var) {
        ArrayList arrayList = new ArrayList();
        x5 x5Var = (x5) this.f9209d;
        g1 serializer = x5Var.getSerializer();
        Charset charset = r4.f12689d;
        ir.f0.T(serializer, "ISerializer is required.");
        io.sentry.t tVar = new io.sentry.t((Callable) new n4(serializer, 3, e5Var));
        arrayList.add(new r4(new s4(a5.Log, new o4(tVar, 14), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(((List) e5Var.f12237d).size())), new o4(tVar, 15)));
        return new i4.b(new m4(null, x5Var.getSdkVersion(), null), (List) arrayList);
    }

    public i4.b t(final z5 z5Var, final l3 l3Var, q6 q6Var, final boolean z10) {
        ArrayList arrayList = new ArrayList();
        x5 x5Var = (x5) this.f9209d;
        final g1 serializer = x5Var.getSerializer();
        final u0 logger = x5Var.getLogger();
        Charset charset = r4.f12689d;
        final File file = z5Var.L;
        io.sentry.t tVar = new io.sentry.t(new Callable() { // from class: io.sentry.q4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g1 g1Var = serializer;
                z5 z5Var2 = z5Var;
                File file2 = file;
                u0 u0Var = logger;
                boolean z11 = z10;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, r4.f12689d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            g1Var.e(z5Var2, bufferedWriter);
                            linkedHashMap.put(a5.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            l3 l3Var2 = l3Var;
                            if (l3Var2 != null) {
                                g1Var.e(l3Var2, bufferedWriter);
                                linkedHashMap.put(a5.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrM = com.google.android.gms.internal.measurement.e5.M(10485760L, file2.getPath());
                                if (bArrM.length > 0) {
                                    linkedHashMap.put(a5.ReplayVideo.getItemType(), bArrM);
                                }
                            }
                            byte[] bArrH = r4.h(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z11) {
                                    return bArrH;
                                }
                            }
                            return bArrH;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        u0Var.g(b5.ERROR, "Could not serialize replay recording", th2);
                        if (file2 == null) {
                            return null;
                        }
                        if (z11) {
                            com.google.android.gms.internal.measurement.e5.r(file2.getParentFile());
                            return null;
                        }
                        file2.delete();
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z11) {
                                com.google.android.gms.internal.measurement.e5.r(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new r4(new s4(a5.ReplayVideo, new o4(tVar, 9), null, null, null), new o4(tVar, 10)));
        return new i4.b(new m4(z5Var.f12268a, x5Var.getSessionReplay().k, q6Var), (List) arrayList);
    }

    public q6 v(z0 z0Var, io.sentry.h0 h0Var, g4 g4Var, String str) {
        x5 x5Var = (x5) this.f9209d;
        if (io.sentry.hints.b.class.isInstance(dr.a.y(h0Var))) {
            if (g4Var != null) {
                io.sentry.c cVar = new io.sentry.c(x5Var.getLogger());
                io.sentry.protocol.c cVar2 = g4Var.f12269d;
                k6 k6VarH = cVar2.h();
                cVar.c("sentry-trace_id", k6VarH != null ? k6VarH.f12412a.toString() : null);
                cVar.c("sentry-public_key", x5Var.retrieveParsedDsn().f12871b);
                cVar.c("sentry-release", g4Var.f12273y);
                cVar.c("sentry-environment", g4Var.B);
                cVar.c("sentry-transaction", str);
                if (cVar.f12097f) {
                    cVar.f12094c = null;
                }
                cVar.c("sentry-sampled", null);
                if (cVar.f12097f) {
                    cVar.f12095d = null;
                }
                Object objC = cVar2.c("replay_id");
                if (objC != null && !objC.toString().equals(io.sentry.protocol.t.f12636d.toString())) {
                    cVar.c("sentry-replay_id", objC.toString());
                    cVar2.f12528a.remove("replay_id");
                }
                cVar.f12097f = false;
                return cVar.e();
            }
        } else if (z0Var != null) {
            k1 k1VarL = z0Var.l();
            return k1VarL != null ? k1VarL.b() : ((io.sentry.c) z0Var.E(new androidx.media3.exoplayer.trackselection.h(z0Var, 28, x5Var)).f12399r).e();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0037, B:34:0x00a7, B:21:0x004f, B:23:0x0054, B:27:0x0082, B:32:0x009b), top: B:39:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a7 -> B:35:0x00b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object w(rq.c r13) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f.w(rq.c):java.lang.Object");
    }

    public k1.a x(AndroidComposeView androidComposeView) {
        k1.b bVar = (k1.b) this.f9211r;
        if (bVar != null) {
            return bVar;
        }
        k1.b bVar2 = new k1.b(androidComposeView.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(d0.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(bVar2, -1);
        this.f9211r = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int y(om.f fVar, AndroidComposeView androidComposeView, boolean z10) {
        byte b2;
        int i10;
        int i11;
        r1.b bVar = (r1.b) this.f9210g;
        x1.p pVar = (x1.p) this.f9212x;
        if (this.f9208a) {
            return 0;
        }
        try {
            this.f9208a = true;
            q3.a aVarH = ((l2) this.f9211r).H(fVar, androidComposeView);
            u.o oVar = (u.o) aVarH.f20679d;
            int iG = oVar.g();
            for (int i12 = 0; i12 < iG; i12++) {
                r1.j jVar = (r1.j) oVar.h(i12);
                if (!jVar.f21169d && !jVar.f21173h) {
                }
                b2 = false;
                break;
            }
            b2 = true;
            int iG2 = oVar.g();
            for (int i13 = 0; i13 < iG2; i13++) {
                r1.j jVar2 = (r1.j) oVar.h(i13);
                if (b2 != false || dr.a.e(jVar2)) {
                    ((x1.f0) this.f9209d).J(jVar2.f21168c, (x1.p) this.f9212x, jVar2.f21174i, true);
                    if (!pVar.f24906a.g()) {
                        bVar.a(jVar2.f21166a, pVar, dr.a.e(jVar2));
                        pVar.clear();
                    }
                }
            }
            boolean zB = bVar.b(aVarH, z10);
            int iG3 = oVar.g();
            int i14 = 0;
            while (true) {
                if (i14 >= iG3) {
                    i10 = 0;
                    break;
                }
                r1.j jVar3 = (r1.j) oVar.h(i14);
                if (!f1.b.a(f1.b.d(jVar3.f21168c, jVar3.f21172g), 0L) && jVar3.b()) {
                    i10 = 1;
                    break;
                }
                i14++;
            }
            int iG4 = oVar.g();
            int i15 = 0;
            while (true) {
                if (i15 >= iG4) {
                    i11 = 0;
                    break;
                }
                if (((r1.j) oVar.h(i15)).b()) {
                    i11 = 1;
                    break;
                }
                i15++;
            }
            int i16 = (zB ? 1 : 0) | (i10 << 1) | (i11 << 2);
            this.f9208a = false;
            return i16;
        } catch (Throwable th2) {
            this.f9208a = false;
            throw th2;
        }
    }

    public t4 z(t4 t4Var, io.sentry.h0 h0Var, List list) {
        x5 x5Var = (x5) this.f9209d;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            io.sentry.c0 c0Var = (io.sentry.c0) it.next();
            try {
                boolean z10 = c0Var instanceof io.sentry.android.core.v;
                boolean zIsInstance = io.sentry.hints.b.class.isInstance(dr.a.y(h0Var));
                if (zIsInstance && z10) {
                    ((io.sentry.android.core.v) c0Var).f(t4Var, h0Var);
                } else if (!zIsInstance && !z10) {
                    t4Var = c0Var.f(t4Var, h0Var);
                }
            } catch (Throwable th2) {
                x5Var.getLogger().f(b5.ERROR, th2, "An exception occurred while processing event by processor: %s", c0Var.getClass().getName());
            }
            if (t4Var == null) {
                x5Var.getLogger().m(b5.DEBUG, "Event was dropped by a processor: %s", c0Var.getClass().getName());
                x5Var.getClientReportRecorder().l(io.sentry.clientreport.d.EVENT_PROCESSOR, io.sentry.m.Error);
                break;
            }
        }
        return t4Var;
    }
}
