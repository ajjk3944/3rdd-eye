package d4;

import java.io.File;
import java.io.FileFilter;

/* renamed from: d4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2271e implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C2271e f19799a = new C2271e();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = C2267a.f19773p;
        return file.getName().endsWith(".apk");
    }
}
