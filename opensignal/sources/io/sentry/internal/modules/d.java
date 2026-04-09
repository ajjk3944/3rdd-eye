package io.sentry.internal.modules;

import io.sentry.b5;
import io.sentry.q;
import io.sentry.u0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class d implements a {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f12365d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final u0 f12366a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f12367b = new io.sentry.util.a();

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f12368c = null;

    public d(u0 u0Var) {
        this.f12366a = u0Var;
    }

    @Override // io.sentry.internal.modules.a
    public final Map a() {
        if (this.f12368c == null) {
            q qVarA = this.f12367b.a();
            try {
                if (this.f12368c == null) {
                    this.f12368c = b();
                }
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this.f12368c;
    }

    public abstract Map b();

    public final TreeMap c(InputStream inputStream) throws IOException {
        u0 u0Var = this.f12366a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f12365d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                u0Var.m(b5.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e4) {
            u0Var.g(b5.ERROR, "Error extracting modules.", e4);
            return treeMap;
        } catch (RuntimeException e10) {
            u0Var.f(b5.ERROR, e10, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
