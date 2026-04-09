package ic;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.views.InputValidationResult;
import com.survicate.surveys.entities.views.InputValidator;
import h2.o;
import j3.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import k2.q;
import k2.x;
import k2.z;
import on.u;
import t2.e;
import w.g;
import xu.d;

/* loaded from: classes.dex */
public final class b implements InputValidator {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11323a;

    public /* synthetic */ b(Context context, boolean z10) {
        this.f11323a = context;
    }

    public static void a(ZipOutputStream zipOutputStream, File file, FileInputStream fileInputStream) throws IOException {
        byte[] bArr = new byte[(int) Math.pow(2.0d, 10.0d)];
        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 <= 0) {
                zipOutputStream.closeEntry();
                return;
            }
            zipOutputStream.write(bArr, 0, i10);
        }
    }

    public ApplicationInfo b(int i10, String str) {
        return this.f11323a.getPackageManager().getApplicationInfo(str, i10);
    }

    public PackageInfo c(int i10, String str) {
        return this.f11323a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean d() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f11323a;
        if (callingUid == iMyUid) {
            return a.x(context);
        }
        if (!gc.b.e() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public Typeface e(x xVar) {
        String strA;
        if (!(xVar instanceof x)) {
            return null;
        }
        int i10 = xVar.f14007a;
        Context context = this.f11323a;
        Typeface typefaceA = k.a(context, i10);
        l.b(typefaceA);
        q qVar = xVar.f14009c;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            ThreadLocal threadLocal = z.f14010a;
            if (typefaceA == null) {
                return null;
            }
            ArrayList arrayList = qVar.f13998a;
            if (!arrayList.isEmpty()) {
                ThreadLocal threadLocal2 = z.f14010a;
                Paint paint = (Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal2.set(paint);
                }
                paint.setFontVariationSettings(null);
                paint.setTypeface(typefaceA);
                e eVarB = e5.b(context);
                int i12 = (i11 < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
                if (i12 == 0) {
                    strA = v2.a.a(arrayList, null, new o(eVarB), 31);
                } else {
                    if (arrayList.size() > 0) {
                        throw h0.b.e(0, arrayList);
                    }
                    float fG = vc.e.g(i12 + 400.0f, 1.0f, 1000.0f);
                    strA = (!arrayList.isEmpty() ? "," : "") + "'wght' " + fG;
                }
                paint.setFontVariationSettings(strA);
                return paint.getTypeface();
            }
        }
        return typefaceA;
    }

    @Override // com.survicate.surveys.entities.views.InputValidator
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputValidationResult validate(String str) {
        l.e(str, "input");
        if (tt.l.D0(str)) {
            return new InputValidationResult(false, this.f11323a.getString(u.survicate_micro_error_empty_field));
        }
        return new InputValidationResult(true, null, 2, 0 == true ? 1 : 0);
    }

    public File g(File file) throws IOException {
        String str = this.f11323a.getFilesDir().getAbsolutePath() + "/logs/";
        File file2 = new File(g.f(str, "mlvis.zip"));
        if (!file2.exists()) {
            FileInputStream fileInputStreamJ = d.j(file, new FileInputStream(file));
            ZipOutputStream zipOutputStream = new ZipOutputStream(xu.l.k(new FileOutputStream(file2), file2));
            a(zipOutputStream, file, fileInputStreamJ);
            fileInputStreamJ.close();
            zipOutputStream.close();
            return file2;
        }
        l.e(str, "rootDirectory");
        File file3 = new File(str.concat("temp-mlvis.zip"));
        if (file3.exists()) {
            file3.delete();
        }
        file2.renameTo(file3);
        byte[] bArr = new byte[(int) Math.pow(2.0d, 10.0d)];
        ZipInputStream zipInputStream = new ZipInputStream(d.j(file3, new FileInputStream(file3)));
        ZipOutputStream zipOutputStream2 = new ZipOutputStream(xu.l.k(new FileOutputStream(file2), file2));
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        while (nextEntry != null) {
            String name = nextEntry.getName();
            boolean zA = l.a(file.getName(), name);
            if (nextEntry.getCompressedSize() != 0 && !zA) {
                zipOutputStream2.putNextEntry(new ZipEntry(name));
                while (true) {
                    int i10 = zipInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    }
                    zipOutputStream2.write(bArr, 0, i10);
                }
                zipOutputStream2.closeEntry();
            }
            try {
                nextEntry = zipInputStream.getNextEntry();
            } catch (Exception unused) {
                nextEntry = null;
            }
        }
        FileInputStream fileInputStreamJ2 = d.j(file, new FileInputStream(file));
        a(zipOutputStream2, file, fileInputStreamJ2);
        fileInputStreamJ2.close();
        zipInputStream.close();
        zipOutputStream2.close();
        file3.delete();
        return file2;
    }

    public b(Context context) {
        this.f11323a = context.getApplicationContext();
    }
}
