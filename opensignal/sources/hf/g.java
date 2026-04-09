package hf;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10650a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f10650a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.endsWith(".envelope");
            case 3:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
