package T1;

/* compiled from: WorkDatabasePathHelper.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12222a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f12223b;

    static {
        String strG = androidx.work.m.g("WrkDbPathHelper");
        kotlin.jvm.internal.l.e(strG, "tagWithPrefix(\"WrkDbPathHelper\")");
        f12222a = strG;
        f12223b = new String[]{"-journal", "-shm", "-wal"};
    }
}
