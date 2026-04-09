package i9;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class h extends g {
    public static final d p(File file, FileWalkDirection direction) {
        p.e(file, "<this>");
        p.e(direction, "direction");
        return new d(file, direction);
    }

    public static /* synthetic */ d q(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.f21995a;
        }
        return p(file, fileWalkDirection);
    }

    public static d r(File file) {
        p.e(file, "<this>");
        return p(file, FileWalkDirection.f21995a);
    }
}
