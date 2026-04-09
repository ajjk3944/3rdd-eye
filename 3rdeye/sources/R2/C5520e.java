package r2;

import android.content.Context;
import i2.C4434G;
import i2.C4448h;
import i2.C4453m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import u2.C5624c;

/* compiled from: NetworkFetcher.java */
/* renamed from: r2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5520e {

    /* renamed from: a, reason: collision with root package name */
    public final C5519d f45674a;

    /* compiled from: NetworkFetcher.java */
    /* renamed from: r2.e$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45675a;

        static {
            int[] iArr = new int[EnumC5518c.values().length];
            f45675a = iArr;
            try {
                iArr[EnumC5518c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45675a[EnumC5518c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5520e(C5519d c5519d, C5517b c5517b) {
        this.f45674a = c5519d;
    }

    public final C4434G<C4448h> a(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        C4434G<C4448h> c4434gF;
        EnumC5518c enumC5518c;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        C5519d c5519d = this.f45674a;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            C5624c.a();
            EnumC5518c enumC5518c2 = EnumC5518c.ZIP;
            c4434gF = str3 != null ? C4453m.f(context, new ZipInputStream(new FileInputStream(c5519d.d(str, inputStream, enumC5518c2))), str) : C4453m.f(context, new ZipInputStream(inputStream), null);
            enumC5518c = enumC5518c2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            C5624c.a();
            enumC5518c = EnumC5518c.GZIP;
            c4434gF = str3 != null ? C4453m.c(new GZIPInputStream(new FileInputStream(c5519d.d(str, inputStream, enumC5518c))), str) : C4453m.c(new GZIPInputStream(inputStream), null);
        } else {
            C5624c.a();
            enumC5518c = EnumC5518c.JSON;
            c4434gF = str3 != null ? C4453m.c(new FileInputStream(c5519d.d(str, inputStream, enumC5518c).getAbsolutePath()), str) : C4453m.c(inputStream, null);
        }
        if (str3 != null && c4434gF.f38325a != null) {
            File file = new File(c5519d.c(), C5519d.a(str, enumC5518c, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            C5624c.a();
            if (!zRenameTo) {
                C5624c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c4434gF;
    }
}
