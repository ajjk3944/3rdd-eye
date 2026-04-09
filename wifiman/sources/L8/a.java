package L8;

import android.graphics.Bitmap;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class a {
    public static final void a(Bitmap bitmap, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        AbstractC6492s.i(bitmap, "<this>");
        AbstractC6492s.i(file, "file");
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            Z7.b.h("Bitmap " + bitmap + " successfully dumped into the file " + file.getName(), null, 2, null);
            bufferedOutputStream.close();
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            throw th;
        }
    }
}
