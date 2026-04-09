package T1;

import android.content.Context;
import java.io.File;

/* compiled from: WorkDatabasePathHelper.kt */
/* renamed from: T1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1589a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1589a f12165a = new C1589a();

    public final File a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.l.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
