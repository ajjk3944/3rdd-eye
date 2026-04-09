package L8;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f11265a = new h();

    private h() {
    }

    public static /* synthetic */ File b(h hVar, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "Screenshot_" + System.currentTimeMillis() + ".png";
        }
        return hVar.a(context, str);
    }

    public final File a(Context context, String fileName) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(fileName, "fileName");
        String str = context.getExternalCacheDir() + "/screenshots";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str, fileName);
    }
}
