package m0;

import android.graphics.Shader;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f1 {
    public static final Shader a(long j10, long j11, List list, List list2, int i10) {
        return AbstractC6689Z.a(j10, j11, list, list2, i10);
    }

    public static /* synthetic */ Shader b(long j10, long j11, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i10 = m1.f52935a.a();
        }
        return a(j10, j11, list, list3, i10);
    }

    public static final Shader c(long j10, float f10, List list, List list2, int i10) {
        return AbstractC6689Z.b(j10, f10, list, list2, i10);
    }
}
