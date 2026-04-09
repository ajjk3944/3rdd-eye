package O4;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
/* renamed from: O4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1462h implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("aqs.");
    }
}
