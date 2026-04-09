package T1;

import android.content.Context;
import c9.C2077A;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WorkDatabasePathHelper.kt */
/* loaded from: classes.dex */
public final class v {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void a(Context context) {
        LinkedHashMap linkedHashMapM;
        kotlin.jvm.internal.l.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.l.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            androidx.work.m.e().a(w.f12222a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            kotlin.jvm.internal.l.e(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(C1589a.f12165a.a(context), "androidx.work.workdb");
            String[] strArr = w.f12223b;
            int iL = C2077A.l(strArr.length);
            if (iL < 16) {
                iL = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            b9.l lVar = new b9.l(databasePath2, file);
            if (linkedHashMap.isEmpty()) {
                linkedHashMapM = C2077A.m(lVar);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                linkedHashMapM = linkedHashMap2;
            }
            for (Map.Entry entry : linkedHashMapM.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        androidx.work.m.e().h(w.f12222a, "Over-writing contents of " + file3);
                    }
                    androidx.work.m.e().a(w.f12222a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }
}
