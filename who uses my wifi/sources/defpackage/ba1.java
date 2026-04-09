package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ba1 {
    public static final String[] a;

    static {
        h80.f("WrkDbPathHelper");
        a = new String[]{"-journal", "-shm", "-wal"};
    }

    public static void a(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            h80.d().a(new Throwable[0]);
            HashMap map = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath, file);
            for (String str : a) {
                map.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            for (File file2 : map.keySet()) {
                File file3 = (File) map.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        String.format("Over-writing contents of %s", file3);
                        h80.d().g(new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        String.format("Migrated %s to %s", file2, file3);
                    } else {
                        String.format("Renaming %s to %s failed", file2, file3);
                    }
                    h80.d().a(new Throwable[0]);
                }
            }
        }
    }
}
