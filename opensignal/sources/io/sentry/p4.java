package io.sentry;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12498a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f12500c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12502e;

    public /* synthetic */ p4(a aVar, long j, g1 g1Var, u0 u0Var) {
        this.f12501d = aVar;
        this.f12499b = j;
        this.f12500c = g1Var;
        this.f12502e = u0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws io.sentry.exception.b {
        int i10 = this.f12498a;
        Object obj = this.f12502e;
        g1 g1Var = this.f12500c;
        long j = this.f12499b;
        Object obj2 = this.f12501d;
        switch (i10) {
            case 0:
                File file = (File) obj2;
                g3 g3Var = (g3) obj;
                if (!file.exists()) {
                    throw new io.sentry.exception.b(h0.b.o("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str = new String(io.sentry.vendor.a.a(com.google.android.gms.internal.measurement.e5.M(j, file.getPath())), "US-ASCII");
                    if (str.isEmpty()) {
                        throw new io.sentry.exception.b("Profiling trace file is empty");
                    }
                    g3Var.X = str;
                    try {
                        g3Var.H = (List) g3Var.f12263d.call();
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, r4.f12689d));
                                try {
                                    g1Var.e(g3Var, bufferedWriter);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    bufferedWriter.close();
                                    byteArrayOutputStream.close();
                                    return byteArray;
                                } finally {
                                }
                            } catch (Throwable th2) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (IOException e4) {
                            throw new io.sentry.exception.b("Failed to serialize profiling trace data\n" + e4.getMessage());
                        }
                    } finally {
                        file.delete();
                    }
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError(e10);
                }
            default:
                a aVar = (a) obj2;
                u0 u0Var = (u0) obj;
                byte[] byteArray2 = aVar.f11452a;
                String str2 = aVar.f11455d;
                if (byteArray2 == null) {
                    io.sentry.protocol.f0 f0Var = aVar.f11453b;
                    if (f0Var == null) {
                        n4 n4Var = aVar.f11454c;
                        if (n4Var != null && (byteArray2 = (byte[]) n4Var.call()) != null) {
                            r4.a(str2, byteArray2.length, j);
                        }
                        throw new io.sentry.exception.b(h0.b.o("Couldn't attach the attachment ", str2, ".\nPlease check that either bytes, serializable, path or provider is set."));
                    }
                    Charset charset = io.sentry.util.c.f12804a;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, io.sentry.util.c.f12804a));
                            try {
                                g1Var.e(f0Var, bufferedWriter2);
                                byteArray2 = byteArrayOutputStream2.toByteArray();
                                bufferedWriter2.close();
                                byteArrayOutputStream2.close();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th4) {
                        u0Var.g(b5.ERROR, "Could not serialize serializable", th4);
                        byteArray2 = null;
                    }
                    if (byteArray2 != null) {
                        r4.a(str2, byteArray2.length, j);
                    }
                    throw new io.sentry.exception.b(h0.b.o("Couldn't attach the attachment ", str2, ".\nPlease check that either bytes, serializable, path or provider is set."));
                }
                r4.a(str2, byteArray2.length, j);
                return byteArray2;
        }
    }

    public /* synthetic */ p4(File file, long j, g3 g3Var, g1 g1Var) {
        this.f12501d = file;
        this.f12499b = j;
        this.f12502e = g3Var;
        this.f12500c = g1Var;
    }
}
