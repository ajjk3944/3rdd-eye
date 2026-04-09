package io.sentry.internal.modules;

import android.content.Context;
import androidx.lifecycle.f0;
import com.google.android.gms.internal.measurement.y3;
import io.sentry.b5;
import io.sentry.u0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12370e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12371f;

    public f(List list, u0 u0Var) {
        super(u0Var);
        this.f12371f = list;
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() throws IOException {
        InputStream resourceAsStream;
        switch (this.f12370e) {
            case 0:
                u0 u0Var = this.f12366a;
                TreeMap treeMap = new TreeMap();
                try {
                    resourceAsStream = ((ClassLoader) this.f12371f).getResourceAsStream("sentry-external-modules.txt");
                } catch (IOException e4) {
                    u0Var.g(b5.INFO, "Access to resources failed.", e4);
                } catch (SecurityException e10) {
                    u0Var.g(b5.INFO, "Access to resources denied.", e10);
                }
                try {
                    if (resourceAsStream == null) {
                        u0Var.m(b5.INFO, "%s file was not found.", "sentry-external-modules.txt");
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                    } else {
                        TreeMap treeMapC = c(resourceAsStream);
                        resourceAsStream.close();
                        treeMap = treeMapC;
                    }
                    return treeMap;
                } catch (Throwable th2) {
                    if (resourceAsStream != null) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            case 1:
                u0 u0Var2 = this.f12366a;
                TreeMap treeMap2 = new TreeMap();
                try {
                    InputStream inputStreamOpen = ((Context) this.f12371f).getAssets().open("sentry-external-modules.txt");
                    try {
                        TreeMap treeMapC2 = c(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return treeMapC2;
                    } finally {
                    }
                } catch (FileNotFoundException unused) {
                    u0Var2.m(b5.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap2;
                } catch (IOException e11) {
                    u0Var2.g(b5.ERROR, "Error extracting modules.", e11);
                    return treeMap2;
                }
            default:
                TreeMap treeMap3 = new TreeMap();
                Iterator it = ((List) this.f12371f).iterator();
                while (it.hasNext()) {
                    Map mapA = ((a) it.next()).a();
                    if (mapA != null) {
                        treeMap3.putAll(mapA);
                    }
                }
                return treeMap3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u0 u0Var) {
        super(u0Var);
        ClassLoader classLoader = f.class.getClassLoader();
        this.f12371f = y3.e(classLoader);
    }

    public f(Context context, u0 u0Var) {
        super(u0Var);
        Context applicationContext = context.getApplicationContext();
        this.f12371f = applicationContext != null ? applicationContext : context;
        new Thread(new f0(23, this)).start();
    }
}
