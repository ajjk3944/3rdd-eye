package r2;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: r2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7561d {

    /* renamed from: a, reason: collision with root package name */
    public static final C7561d f60051a = new C7561d();

    private C7561d() {
    }

    public static final File a(Context context) {
        AbstractC6492s.i(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC6492s.h(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
