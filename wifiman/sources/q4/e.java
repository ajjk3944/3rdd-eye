package Q4;

import M4.o;
import N4.F;
import O4.j;
import com.google.firebase.crashlytics.internal.common.C5111m;
import com.google.firebase.crashlytics.internal.common.D;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f19164e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    private static final int f19165f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final j f19166g = new j();

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f19167h = new Comparator() { // from class: Q4.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.u((File) obj, (File) obj2);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f19168i = new FilenameFilter() { // from class: Q4.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return e.v(file, str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f19169a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final g f19170b;

    /* renamed from: c, reason: collision with root package name */
    private final S4.j f19171c;

    /* renamed from: d, reason: collision with root package name */
    private final C5111m f19172d;

    public e(g gVar, S4.j jVar, C5111m c5111m) {
        this.f19170b = gVar;
        this.f19171c = jVar;
        this.f19172d = c5111m;
    }

    private static String A(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f19164e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
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

    private void B(File file, F.d dVar, String str, F.a aVar) {
        String strD = this.f19172d.d(str);
        try {
            j jVar = f19166g;
            F(this.f19170b.i(str), jVar.M(jVar.L(A(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e10) {
            I4.g.f().l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void C(String str, long j10) {
        boolean z10;
        List<File> listR = this.f19170b.r(str, f19168i);
        if (listR.isEmpty()) {
            I4.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : listR) {
                try {
                    arrayList.add(f19166g.j(A(file)));
                } catch (IOException e10) {
                    I4.g.f().l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.f19170b.q(str, "report"), arrayList, j10, z10, o.l(str, this.f19170b), this.f19172d.d(str));
        } else {
            I4.g.f().k("Could not parse event files for session " + str);
        }
    }

    private void D(File file, List list, long j10, boolean z10, String str, String str2) {
        try {
            j jVar = f19166g;
            F fR = jVar.L(A(file)).v(j10, z10, str).p(str2).r(list);
            F.e eVarN = fR.n();
            if (eVarN == null) {
                return;
            }
            I4.g.f().b("appQualitySessionId: " + str2);
            F(z10 ? this.f19170b.l(eVarN.i()) : this.f19170b.n(eVarN.i()), jVar.M(fR));
        } catch (IOException e10) {
            I4.g.f().l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int E(String str, int i10) {
        List listR = this.f19170b.r(str, new FilenameFilter() { // from class: Q4.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: Q4.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.x((File) obj, (File) obj2);
            }
        });
        return f(listR, i10);
    }

    private static void F(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f19164e);
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

    private static void G(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f19164e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
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

    private SortedSet e(String str) {
        this.f19170b.d();
        SortedSet sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() <= 8) {
            return sortedSetP;
        }
        while (sortedSetP.size() > 8) {
            String str2 = (String) sortedSetP.last();
            I4.g.f().b("Removing session over cap: " + str2);
            this.f19170b.e(str2);
            sortedSetP.remove(str2);
        }
        return sortedSetP;
    }

    private static int f(List list, int i10) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i10) {
                return size;
            }
            g.v(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f19171c.b().f20250a.f20262b;
        List listN = n();
        int size = listN.size();
        if (size <= i10) {
            return;
        }
        Iterator it = listN.subList(i10, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static String m(int i10, boolean z10) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    private List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f19170b.m());
        arrayList.addAll(this.f19170b.j());
        Comparator comparator = f19167h;
        Collections.sort(arrayList, comparator);
        List listO = this.f19170b.o();
        Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f19165f);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f19170b.o());
        j(this.f19170b.m());
        j(this.f19170b.j());
    }

    public void k(String str, long j10) {
        for (String str2 : e(str)) {
            I4.g.f().i("Finalizing report for session " + str2);
            C(str2, j10);
            this.f19170b.e(str2);
        }
        g();
    }

    public void l(String str, F.d dVar, F.a aVar) {
        File fileQ = this.f19170b.q(str, "report");
        I4.g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        B(fileQ, dVar, str, aVar);
    }

    public SortedSet p() {
        return new TreeSet(this.f19170b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f19170b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f19170b.o().isEmpty() && this.f19170b.m().isEmpty() && this.f19170b.j().isEmpty()) ? false : true;
    }

    public List w() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(D.a(f19166g.L(A(file)), file.getName(), file));
            } catch (IOException e10) {
                I4.g.f().l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(F.e.d dVar, String str, boolean z10) {
        int i10 = this.f19171c.b().f20250a.f20261a;
        try {
            F(this.f19170b.q(str, m(this.f19169a.getAndIncrement(), z10)), f19166g.k(dVar));
        } catch (IOException e10) {
            I4.g.f().l("Could not persist event for session " + str, e10);
        }
        E(str, i10);
    }

    public void z(F f10) {
        F.e eVarN = f10.n();
        if (eVarN == null) {
            I4.g.f().b("Could not get session for report");
            return;
        }
        String strI = eVarN.i();
        try {
            F(this.f19170b.q(strI, "report"), f19166g.M(f10));
            G(this.f19170b.q(strI, "start-time"), "", eVarN.l());
        } catch (IOException e10) {
            I4.g.f().c("Could not persist report for session " + strI, e10);
        }
    }
}
