package of;

import androidx.media3.exoplayer.trackselection.d;
import hf.g;
import hf.i;
import io.sentry.android.core.e0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import lf.j2;
import xu.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f19412e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final int f19413f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final mf.a f19414g = new mf.a();

    /* renamed from: h, reason: collision with root package name */
    public static final d f19415h = new d(28);

    /* renamed from: i, reason: collision with root package name */
    public static final g f19416i = new g(3);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f19417a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final b f19418b;

    /* renamed from: c, reason: collision with root package name */
    public final al.b f19419c;

    /* renamed from: d, reason: collision with root package name */
    public final i f19420d;

    public a(b bVar, al.b bVar2, i iVar) {
        this.f19418b = bVar;
        this.f19419c = bVar2;
        this.f19420d = iVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStreamJ = xu.d.j(file, new FileInputStream(file));
        while (true) {
            try {
                int i10 = fileInputStreamJ.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f19412e);
                    fileInputStreamJ.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStreamJ.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(l.k(new FileOutputStream(file), file), f19412e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f19418b;
        arrayList.addAll(b.m(((File) bVar.f19426y).listFiles()));
        arrayList.addAll(b.m(((File) bVar.B).listFiles()));
        d dVar = f19415h;
        Collections.sort(arrayList, dVar);
        List listM = b.m(((File) bVar.f19425x).listFiles());
        Collections.sort(listM, dVar);
        arrayList.addAll(listM);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.m(((File) this.f19418b.f19424r).list())).descendingSet();
    }

    public final void d(j2 j2Var, String str, boolean z10) {
        b bVar = this.f19418b;
        int i10 = this.f19419c.h().f20887a.f3420a;
        f19414g.getClass();
        try {
            f(bVar.e(str, h0.b.o("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f19417a.getAndIncrement())), z10 ? "_" : "")), mf.a.f16702a.b(j2Var));
        } catch (IOException e4) {
            e0.q("FirebaseCrashlytics", "Could not persist event for session " + str, e4);
        }
        g gVar = new g(4);
        bVar.getClass();
        File file = new File((File) bVar.f19424r, str);
        file.mkdirs();
        List<File> listM = b.m(file.listFiles(gVar));
        Collections.sort(listM, new d(29));
        int size = listM.size();
        for (File file2 : listM) {
            if (size <= i10) {
                return;
            }
            b.h(file2);
            size--;
        }
    }
}
