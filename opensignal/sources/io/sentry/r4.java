package io.sentry;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class r4 {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f12689d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final s4 f12690a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f12691b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f12692c;

    public r4(s4 s4Var, byte[] bArr) {
        this.f12690a = s4Var;
        this.f12692c = bArr;
        this.f12691b = null;
    }

    public static void a(String str, long j, long j7) throws io.sentry.exception.b {
        if (j > j7) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j7)));
        }
    }

    public static r4 b(g1 g1Var, io.sentry.clientreport.b bVar) {
        ir.f0.T(g1Var, "ISerializer is required.");
        t tVar = new t((Callable) new n4(g1Var, 2, bVar));
        return new r4(new s4(a5.resolve(bVar), new o4(tVar, 6), "application/json", null, null), new o4(tVar, 8));
    }

    public static r4 c(d3 d3Var, g1 g1Var) {
        File file = d3Var.G;
        t tVar = new t((Callable) new cf.f(file, d3Var, g1Var, 1));
        return new r4(new s4(a5.ProfileChunk, new o4(tVar, 12), "application-json", file.getName(), (String) null, d3Var.f12184y, (Integer) null), new o4(tVar, 13));
    }

    public static r4 d(g1 g1Var, i6 i6Var) {
        ir.f0.T(g1Var, "ISerializer is required.");
        ir.f0.T(i6Var, "Session is required.");
        t tVar = new t((Callable) new n4(g1Var, 0, i6Var));
        return new r4(new s4(a5.Session, new o4(tVar, 7), "application/json", null, null), new o4(tVar, 11));
    }

    public static byte[] h(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f12689d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.clientreport.b e(g1 g1Var) throws IOException {
        s4 s4Var = this.f12690a;
        if (s4Var == null || s4Var.f12734x != a5.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f12689d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) g1Var.b(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final byte[] f() {
        Callable callable;
        if (this.f12692c == null && (callable = this.f12691b) != null) {
            this.f12692c = (byte[]) callable.call();
        }
        return this.f12692c;
    }

    public final io.sentry.protocol.a0 g(g1 g1Var) throws IOException {
        s4 s4Var = this.f12690a;
        if (s4Var == null || s4Var.f12734x != a5.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f12689d));
        try {
            io.sentry.protocol.a0 a0Var = (io.sentry.protocol.a0) g1Var.b(bufferedReader, io.sentry.protocol.a0.class);
            bufferedReader.close();
            return a0Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public r4(s4 s4Var, Callable callable) {
        this.f12690a = s4Var;
        this.f12691b = callable;
        this.f12692c = null;
    }
}
