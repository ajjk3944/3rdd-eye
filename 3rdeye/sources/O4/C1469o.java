package O4;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
/* renamed from: O4.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1469o implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10320a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f10320a) {
            case 0:
                return str.startsWith(".ae");
            default:
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
