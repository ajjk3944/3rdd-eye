package io.sentry;

import io.sentry.protocol.DebugImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d2 implements g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f12176c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final x5 f12177a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12178b;

    public d2(x5 x5Var) {
        this.f12177a = x5Var;
        HashMap map = new HashMap();
        this.f12178b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.clientreport.a(4));
        map.put(e.class, new d(0));
        map.put(io.sentry.protocol.b.class, new io.sentry.clientreport.a(5));
        map.put(io.sentry.protocol.c.class, new io.sentry.clientreport.a(6));
        map.put(DebugImage.class, new io.sentry.clientreport.a(7));
        map.put(io.sentry.protocol.d.class, new io.sentry.clientreport.a(8));
        map.put(io.sentry.protocol.f.class, new io.sentry.clientreport.a(9));
        map.put(io.sentry.protocol.e.class, new io.sentry.clientreport.a(10));
        map.put(io.sentry.protocol.g.class, new io.sentry.clientreport.a(11));
        map.put(io.sentry.protocol.i.class, new io.sentry.clientreport.a(13));
        map.put(io.sentry.protocol.j.class, new io.sentry.clientreport.a(14));
        map.put(io.sentry.protocol.k.class, new io.sentry.clientreport.a(15));
        map.put(io.sentry.protocol.l.class, new io.sentry.clientreport.a(16));
        map.put(io.sentry.protocol.m.class, new io.sentry.clientreport.a(17));
        map.put(d3.class, new d(1));
        map.put(e3.class, new d(2));
        map.put(g3.class, new d(3));
        map.put(h3.class, new d(4));
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.a(2));
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.a(3));
        map.put(io.sentry.protocol.n.class, new io.sentry.clientreport.a(18));
        map.put(l3.class, new d(5));
        map.put(io.sentry.rrweb.a.class, new io.sentry.protocol.d0(7));
        map.put(io.sentry.rrweb.c.class, new io.sentry.protocol.d0(8));
        map.put(io.sentry.rrweb.g.class, new io.sentry.protocol.d0(10));
        map.put(io.sentry.rrweb.i.class, new io.sentry.protocol.d0(12));
        map.put(io.sentry.rrweb.j.class, new io.sentry.protocol.d0(14));
        map.put(io.sentry.rrweb.l.class, new io.sentry.protocol.d0(15));
        map.put(io.sentry.rrweb.m.class, new io.sentry.protocol.d0(16));
        map.put(io.sentry.protocol.q.class, new io.sentry.clientreport.a(19));
        map.put(io.sentry.protocol.r.class, new io.sentry.clientreport.a(20));
        map.put(m4.class, new d(7));
        map.put(s4.class, new d(8));
        map.put(t4.class, new d(9));
        map.put(io.sentry.protocol.s.class, new io.sentry.clientreport.a(21));
        map.put(a5.class, new d(10));
        map.put(b5.class, new d(11));
        map.put(c5.class, new d(12));
        map.put(e5.class, new d(15));
        map.put(io.sentry.protocol.u.class, new io.sentry.clientreport.a(23));
        map.put(io.sentry.protocol.v.class, new io.sentry.clientreport.a(24));
        map.put(z5.class, new d(17));
        map.put(io.sentry.protocol.w.class, new io.sentry.clientreport.a(25));
        map.put(io.sentry.protocol.x.class, new io.sentry.clientreport.a(26));
        map.put(io.sentry.protocol.y.class, new io.sentry.clientreport.a(27));
        map.put(d4.class, new d(6));
        map.put(io.sentry.protocol.z.class, new io.sentry.clientreport.a(28));
        map.put(io.sentry.protocol.a0.class, new io.sentry.clientreport.a(29));
        map.put(i6.class, new d(19));
        map.put(k6.class, new d(20));
        map.put(n6.class, new d(21));
        map.put(o6.class, new d(22));
        map.put(io.sentry.protocol.e0.class, new io.sentry.protocol.d0(0));
        map.put(io.sentry.protocol.h.class, new io.sentry.clientreport.a(12));
        map.put(v6.class, new d(24));
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.a(0));
        map.put(io.sentry.protocol.g0.class, new io.sentry.protocol.d0(2));
        map.put(io.sentry.protocol.f0.class, new io.sentry.protocol.d0(1));
    }

    @Override // io.sentry.g1
    public final String a(ConcurrentHashMap concurrentHashMap) {
        return f(concurrentHashMap, false);
    }

    @Override // io.sentry.g1
    public final Object b(Reader reader, Class cls) {
        Object objQ0;
        x5 x5Var = this.f12177a;
        try {
            b2 b2Var = new b2(reader);
            try {
                s1 s1Var = (s1) this.f12178b.get(cls);
                if (s1Var != null) {
                    objQ0 = cls.cast(s1Var.a(b2Var, x5Var.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        b2Var.close();
                        return null;
                    }
                    objQ0 = b2Var.q0();
                }
                b2Var.close();
                return objQ0;
            } finally {
            }
        } catch (Exception e4) {
            x5Var.getLogger().g(b5.ERROR, "Error when deserializing", e4);
            return null;
        }
    }

    @Override // io.sentry.g1
    public final i4.b c(BufferedInputStream bufferedInputStream) {
        x5 x5Var = this.f12177a;
        try {
            return x5Var.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e4) {
            x5Var.getLogger().g(b5.ERROR, "Error deserializing envelope.", e4);
            return null;
        }
    }

    @Override // io.sentry.g1
    public final void d(i4.b bVar, OutputStream outputStream) throws IOException {
        x5 x5Var = this.f12177a;
        ir.f0.T(bVar, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f12176c));
        try {
            ((m4) bVar.f11196a).serialize(new i4.b(bufferedWriter, x5Var.getMaxDepth()), x5Var.getLogger());
            bufferedWriter.write("\n");
            for (r4 r4Var : (Iterable) bVar.f11197d) {
                try {
                    byte[] bArrF = r4Var.f();
                    r4Var.f12690a.serialize(new i4.b(bufferedWriter, x5Var.getMaxDepth()), x5Var.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrF);
                    bufferedWriter.write("\n");
                } catch (Exception e4) {
                    x5Var.getLogger().g(b5.ERROR, "Failed to create envelope item. Dropping it.", e4);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.g1
    public final void e(Object obj, BufferedWriter bufferedWriter) throws IOException {
        ir.f0.T(obj, "The entity is required.");
        x5 x5Var = this.f12177a;
        u0 logger = x5Var.getLogger();
        b5 b5Var = b5.DEBUG;
        if (logger.o(b5Var)) {
            x5Var.getLogger().m(b5Var, "Serializing object: %s", f(obj, x5Var.isEnablePrettySerializationOutput()));
        }
        i4.b bVar = new i4.b(bufferedWriter, x5Var.getMaxDepth());
        ((h7.r1) bVar.f11197d).c0(bVar, x5Var.getLogger(), obj);
        bufferedWriter.flush();
    }

    public final String f(Object obj, boolean z10) throws IOException {
        StringWriter stringWriter = new StringWriter();
        x5 x5Var = this.f12177a;
        i4.b bVar = new i4.b(stringWriter, x5Var.getMaxDepth());
        if (z10) {
            bVar.N("\t");
        }
        ((h7.r1) bVar.f11197d).c0(bVar, x5Var.getLogger(), obj);
        return stringWriter.toString();
    }
}
