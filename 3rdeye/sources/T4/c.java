package T4;

import B2.h;
import N7.C1154e9;
import O4.C1465k;
import O4.C1469o;
import Q4.f0;
import V4.b;
import android.util.Log;
import com.singular.sdk.internal.Constants;
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

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f12274e = Charset.forName(Constants.ENCODING);

    /* renamed from: f, reason: collision with root package name */
    public static final int f12275f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final R4.a f12276g = new R4.a();

    /* renamed from: h, reason: collision with root package name */
    public static final a f12277h = new a(0);
    public static final b i = new b();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f12278a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final e f12279b;

    /* renamed from: c, reason: collision with root package name */
    public final V4.e f12280c;

    /* renamed from: d, reason: collision with root package name */
    public final C1465k f12281d;

    public c(e eVar, V4.e eVar2, C1465k c1465k) {
        this.f12279b = eVar;
        this.f12280c = eVar2;
        this.f12281d = c1465k;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f12274e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f12274e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        e eVar = this.f12279b;
        arrayList.addAll(e.e(eVar.f12288f.listFiles()));
        arrayList.addAll(e.e(eVar.f12289g.listFiles()));
        a aVar = f12277h;
        Collections.sort(arrayList, aVar);
        List listE = e.e(eVar.f12287e.listFiles());
        Collections.sort(listE, aVar);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(e.e(this.f12279b.f12286d.list())).descendingSet();
    }

    public final void d(f0.e.d dVar, String str, boolean z10) {
        e eVar = this.f12279b;
        b.C0184b c0184b = this.f12280c.b().f12921a;
        f12276g.getClass();
        try {
            f(eVar.b(str, C1154e9.i("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f12278a.getAndIncrement())), z10 ? "_" : "")), R4.a.f11730a.a(dVar));
        } catch (IOException e4) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e4);
        }
        C1469o c1469o = new C1469o(1);
        eVar.getClass();
        File file = new File(eVar.f12286d, str);
        file.mkdirs();
        List<File> listE = e.e(file.listFiles(c1469o));
        Collections.sort(listE, new h(1));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= c0184b.f12930a) {
                return;
            }
            e.d(file2);
            size--;
        }
    }
}
