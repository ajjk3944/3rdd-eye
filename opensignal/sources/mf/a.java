package mf;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import lf.a2;
import lf.b;
import lf.b0;
import lf.b1;
import lf.b2;
import lf.c0;
import lf.c1;
import lf.c2;
import lf.d;
import lf.d0;
import lf.d2;
import lf.e;
import lf.e0;
import lf.e1;
import lf.e2;
import lf.f;
import lf.f0;
import lf.f1;
import lf.f2;
import lf.g;
import lf.g0;
import lf.g1;
import lf.g2;
import lf.h;
import lf.h0;
import lf.h2;
import lf.i;
import lf.i1;
import lf.i2;
import lf.j0;
import lf.j1;
import lf.j2;
import lf.k;
import lf.k0;
import lf.k2;
import lf.l;
import lf.l0;
import lf.l2;
import lf.m;
import lf.m2;
import lf.n;
import lf.n0;
import lf.n2;
import lf.o;
import lf.o1;
import lf.p;
import lf.p0;
import lf.p1;
import lf.q;
import lf.q0;
import lf.q1;
import lf.r;
import lf.r0;
import lf.r1;
import lf.s;
import lf.s0;
import lf.s1;
import lf.t;
import lf.t0;
import lf.t1;
import lf.u;
import lf.u0;
import lf.u1;
import lf.v;
import lf.v0;
import lf.v1;
import lf.w;
import lf.w0;
import lf.w1;
import lf.x;
import lf.x0;
import lf.x1;
import lf.y;
import lf.y0;
import lf.y1;
import lf.z;
import lf.z0;
import lf.z1;
import z7.j;
import zf.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f16702a;

    static {
        c cVar = new c();
        d dVar = d.f15201a;
        cVar.a(n2.class, dVar);
        cVar.a(b0.class, dVar);
        lf.j jVar = lf.j.f15286a;
        cVar.a(m2.class, jVar);
        cVar.a(j0.class, jVar);
        g gVar = g.f15243a;
        cVar.a(u1.class, gVar);
        cVar.a(k0.class, gVar);
        h hVar = h.f15254a;
        cVar.a(t1.class, hVar);
        cVar.a(l0.class, hVar);
        z zVar = z.f15480a;
        cVar.a(l2.class, zVar);
        cVar.a(j1.class, zVar);
        y yVar = y.f15470a;
        cVar.a(k2.class, yVar);
        cVar.a(i1.class, yVar);
        i iVar = i.f15262a;
        cVar.a(v1.class, iVar);
        cVar.a(n0.class, iVar);
        t tVar = t.f15429a;
        cVar.a(j2.class, tVar);
        cVar.a(p0.class, tVar);
        k kVar = k.f15308a;
        cVar.a(d2.class, kVar);
        cVar.a(q0.class, kVar);
        m mVar = m.f15336a;
        cVar.a(b2.class, mVar);
        cVar.a(r0.class, mVar);
        p pVar = p.f15385a;
        cVar.a(a2.class, pVar);
        cVar.a(v0.class, pVar);
        q qVar = q.f15395a;
        cVar.a(z1.class, qVar);
        cVar.a(x0.class, qVar);
        n nVar = n.f15357a;
        cVar.a(x1.class, nVar);
        cVar.a(t0.class, nVar);
        b bVar = b.f15163a;
        cVar.a(p1.class, bVar);
        cVar.a(d0.class, bVar);
        lf.a aVar = lf.a.f15141a;
        cVar.a(o1.class, aVar);
        cVar.a(e0.class, aVar);
        o oVar = o.f15374a;
        cVar.a(y1.class, oVar);
        cVar.a(u0.class, oVar);
        l lVar = l.f15325a;
        cVar.a(w1.class, lVar);
        cVar.a(s0.class, lVar);
        lf.c cVar2 = lf.c.f15188a;
        cVar.a(q1.class, cVar2);
        cVar.a(f0.class, cVar2);
        r rVar = r.f15408a;
        cVar.a(c2.class, rVar);
        cVar.a(z0.class, rVar);
        s sVar = s.f15418a;
        cVar.a(e2.class, sVar);
        cVar.a(b1.class, sVar);
        u uVar = u.f15441a;
        cVar.a(f2.class, uVar);
        cVar.a(c1.class, uVar);
        x xVar = x.f15463a;
        cVar.a(i2.class, xVar);
        cVar.a(g1.class, xVar);
        v vVar = v.f15446a;
        cVar.a(h2.class, vVar);
        cVar.a(e1.class, vVar);
        w wVar = w.f15454a;
        cVar.a(g2.class, wVar);
        cVar.a(f1.class, wVar);
        e eVar = e.f15226a;
        cVar.a(s1.class, eVar);
        cVar.a(g0.class, eVar);
        f fVar = f.f15236a;
        cVar.a(r1.class, fVar);
        cVar.a(h0.class, fVar);
        cVar.f27374d = true;
        f16702a = new j(5, cVar);
    }

    public static x0 a(JsonReader jsonReader) throws IOException {
        w0 w0Var = new w0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    w0Var.f15460d = jsonReader.nextLong();
                    w0Var.f15462f = (byte) (w0Var.f15462f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    w0Var.f15458b = strNextString;
                    break;
                case "pc":
                    w0Var.f15457a = jsonReader.nextLong();
                    w0Var.f15462f = (byte) (w0Var.f15462f | 1);
                    break;
                case "file":
                    w0Var.f15459c = jsonReader.nextString();
                    break;
                case "importance":
                    w0Var.f15461e = jsonReader.nextInt();
                    w0Var.f15462f = (byte) (w0Var.f15462f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return w0Var.a();
    }

    public static f0 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new f0(strNextString, strNextString2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (strNextString == null) {
            sb2.append(" key");
        }
        if (strNextString2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }

    public static d0 c(JsonReader jsonReader) throws IOException {
        c0 c0Var = new c0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c0Var.f15199i = d(jsonReader, new io.sentry.android.core.u0(18));
                    break;
                case "pid":
                    c0Var.f15191a = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 1);
                    break;
                case "pss":
                    c0Var.f15195e = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 8);
                    break;
                case "rss":
                    c0Var.f15196f = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 16);
                    break;
                case "timestamp":
                    c0Var.f15197g = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0Var.f15192b = strNextString;
                    break;
                case "reasonCode":
                    c0Var.f15193c = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 2);
                    break;
                case "traceFile":
                    c0Var.f15198h = jsonReader.nextString();
                    break;
                case "importance":
                    c0Var.f15194d = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List d(android.util.JsonReader r22, io.sentry.android.core.u0 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.a.d(android.util.JsonReader, io.sentry.android.core.u0):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lf.p0 e(android.util.JsonReader r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.a.e(android.util.JsonReader):lf.p0");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lf.t0 f(android.util.JsonReader r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.a.f(android.util.JsonReader):lf.t0");
    }

    public static z0 g(JsonReader jsonReader) throws IOException {
        y0 y0Var = new y0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    y0Var.f15476b = jsonReader.nextInt();
                    y0Var.f15479e = (byte) (y0Var.f15479e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    y0Var.f15475a = strNextString;
                    break;
                case "defaultProcess":
                    y0Var.f15478d = jsonReader.nextBoolean();
                    y0Var.f15479e = (byte) (y0Var.f15479e | 4);
                    break;
                case "importance":
                    y0Var.f15477c = jsonReader.nextInt();
                    y0Var.f15479e = (byte) (y0Var.f15479e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lf.b0 h(android.util.JsonReader r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.a.h(android.util.JsonReader):lf.b0");
    }

    public static b0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0 b0VarH = h(jsonReader);
                jsonReader.close();
                return b0VarH;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }
}
