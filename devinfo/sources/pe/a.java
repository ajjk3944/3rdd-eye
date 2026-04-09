package pe;

import android.util.Log;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.consent_sdk.d;
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
import je.h;
import je.j;
import me.j2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f31740e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final int f31741f = 15;
    public static final ne.a g = new ne.a();

    /* renamed from: h, reason: collision with root package name */
    public static final b4.b f31742h = new b4.b(10);

    /* renamed from: i, reason: collision with root package name */
    public static final h f31743i = new h(2);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f31744a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final c f31745b;

    /* renamed from: c, reason: collision with root package name */
    public final d f31746c;

    /* renamed from: d, reason: collision with root package name */
    public final j f31747d;

    public a(c cVar, d dVar, j jVar) {
        this.f31745b = cVar;
        this.f31746c = dVar;
        this.f31747d = jVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[Segment.SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i4 = fileInputStream.read(bArr);
                if (i4 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f31740e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i4);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f31740e);
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
        c cVar = this.f31745b;
        arrayList.addAll(c.k(((File) cVar.g).listFiles()));
        arrayList.addAll(c.k(((File) cVar.f31755h).listFiles()));
        b4.b bVar = f31742h;
        Collections.sort(arrayList, bVar);
        List listK = c.k(((File) cVar.f31754f).listFiles());
        Collections.sort(listK, bVar);
        arrayList.addAll(listK);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.k(((File) this.f31745b.f31753e).list())).descendingSet();
    }

    public final void d(j2 j2Var, String str, boolean z3) {
        c cVar = this.f31745b;
        int i4 = this.f31746c.b().f32924a.f15910b;
        g.getClass();
        try {
            f(cVar.b(str, d.h.t("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f31744a.getAndIncrement())), z3 ? "_" : "")), ne.a.f29941a.n(j2Var));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        h hVar = new h(3);
        cVar.getClass();
        File file = new File((File) cVar.f31753e, str);
        file.mkdirs();
        List<File> listK = c.k(file.listFiles(hVar));
        Collections.sort(listK, new b4.b(11));
        int size = listK.size();
        for (File file2 : listK) {
            if (size <= i4) {
                return;
            }
            c.j(file2);
            size--;
        }
    }
}
