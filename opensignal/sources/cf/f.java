package cf;

import a5.o;
import com.google.android.gms.internal.measurement.e5;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.d3;
import io.sentry.g1;
import io.sentry.r4;
import io.sentry.u0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3730d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i10) {
        this.f3727a = i10;
        this.f3728b = obj;
        this.f3729c = obj2;
        this.f3730d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws io.sentry.exception.b {
        Iterator it;
        switch (this.f3727a) {
            case 0:
                return ((g) this.f3728b).f3731a.submit(new o((Callable) this.f3729c, 7, (a2.g) this.f3730d));
            default:
                File file = (File) this.f3728b;
                d3 d3Var = (d3) this.f3729c;
                g1 g1Var = (g1) this.f3730d;
                if (!file.exists()) {
                    throw new io.sentry.exception.b(h0.b.o("Dropping profile chunk, because the file '", file.getName(), "' doesn't exists"));
                }
                if ("java".equals(d3Var.f12184y)) {
                    u0 logger = c4.f12108c.G.getLogger();
                    try {
                        it = ServiceLoader.load(io.sentry.profiling.b.class).iterator();
                    } catch (Throwable th2) {
                        logger.g(b5.ERROR, "Failed to load profile converter provider, returning null", th2);
                    }
                    if ((it.hasNext() ? it.next() : null) != null) {
                        throw new ClassCastException();
                    }
                    logger.m(b5.DEBUG, "No profile converter provider found, returning null", new Object[0]);
                    throw new io.sentry.exception.b("Could not load a ProfileConverter, dropping chunk.");
                }
                try {
                    String str = new String(io.sentry.vendor.a.a(e5.M(52428800L, file.getPath())), "US-ASCII");
                    if (str.isEmpty()) {
                        throw new io.sentry.exception.b("Profiling trace file is empty");
                    }
                    d3Var.H = str;
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, r4.f12689d));
                                try {
                                    g1Var.e(d3Var, bufferedWriter);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    bufferedWriter.close();
                                    byteArrayOutputStream.close();
                                    return byteArray;
                                } finally {
                                }
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (IOException e4) {
                            throw new io.sentry.exception.b("Failed to serialize profile chunk\n" + e4.getMessage());
                        }
                    } finally {
                        file.delete();
                    }
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError(e10);
                }
        }
    }
}
