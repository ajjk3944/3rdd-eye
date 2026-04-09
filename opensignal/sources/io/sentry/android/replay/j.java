package io.sentry.android.replay;

import io.sentry.b5;
import io.sentry.x5;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j implements Closeable {
    public a8.f B;
    public final lq.q D;
    public final ArrayList E;
    public final LinkedHashMap F;
    public final lq.q G;

    /* renamed from: a, reason: collision with root package name */
    public final x5 f11931a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.protocol.t f11932d;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f11933g;

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.util.a f11934r;

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.util.a f11935x;

    /* renamed from: y, reason: collision with root package name */
    public final io.sentry.util.a f11936y;

    public j(x5 x5Var, io.sentry.protocol.t tVar) {
        br.l.e(x5Var, "options");
        br.l.e(tVar, "replayId");
        this.f11931a = x5Var;
        this.f11932d = tVar;
        this.f11933g = new AtomicBoolean(false);
        this.f11934r = new io.sentry.util.a();
        this.f11935x = new io.sentry.util.a();
        this.f11936y = new io.sentry.util.a();
        this.D = kc.f.F(new h(this, 1));
        this.E = new ArrayList();
        this.F = new LinkedHashMap();
        this.G = kc.f.F(new h(this, 0));
    }

    public final void b(File file, long j, String str) throws InterruptedException {
        k kVar = new k(file, j, str);
        io.sentry.q qVarA = this.f11936y.a();
        try {
            this.E.add(kVar);
            vc.e.e(qVarA, null);
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        io.sentry.q qVarA = this.f11934r.a();
        try {
            a8.f fVar = this.B;
            if (fVar != null) {
                fVar.y();
            }
            this.B = null;
            vc.e.e(qVarA, null);
            this.f11933g.set(true);
        } finally {
        }
    }

    public final void f(File file) {
        x5 x5Var = this.f11931a;
        try {
            if (file.delete()) {
                return;
            }
            x5Var.getLogger().m(b5.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final File h() {
        return (File) this.D.getValue();
    }

    public final void i(String str, String str2) throws InterruptedException {
        File file;
        File file2;
        lq.q qVar = this.G;
        LinkedHashMap linkedHashMap = this.F;
        io.sentry.q qVarA = this.f11935x.a();
        try {
            if (this.f11933g.get()) {
                vc.e.e(qVarA, null);
                return;
            }
            File file3 = (File) qVar.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) qVar.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) qVar.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), tt.a.f22975a), 8192);
                try {
                    Iterator it = new st.a(new mq.n(6, bufferedReader)).iterator();
                    while (it.hasNext()) {
                        List listN0 = tt.l.N0((String) it.next(), new String[]{"="}, 2);
                        linkedHashMap.put((String) listN0.get(0), (String) listN0.get(1));
                    }
                    bufferedReader.close();
                } finally {
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) qVar.getValue();
            if (file4 != null) {
                Set setEntrySet = linkedHashMap.entrySet();
                br.l.d(setEntrySet, "<get-entries>(...)");
                String strX0 = mq.o.x0(setEntrySet, "\n", null, null, b.f11845r, 30);
                Charset charset = tt.a.f22975a;
                br.l.e(strX0, "text");
                br.l.e(charset, "charset");
                FileOutputStream fileOutputStreamK = xu.l.k(new FileOutputStream(file4), file4);
                try {
                    wq.a.p0(fileOutputStreamK, strX0, charset);
                    fileOutputStreamK.close();
                } finally {
                }
            }
            vc.e.e(qVarA, null);
        } finally {
        }
    }

    public final String q(long j) throws InterruptedException {
        br.w wVar = new br.w();
        io.sentry.q qVarA = this.f11936y.a();
        try {
            mq.t.e0(this.E, new i(this, j, wVar, 0));
            vc.e.e(qVarA, null);
            return (String) wVar.f2917a;
        } finally {
        }
    }
}
