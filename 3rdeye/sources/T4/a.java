package T4;

import android.util.Size;
import com.applovin.impl.o7;
import com.applovin.impl.p7;
import java.io.File;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12273b;

    public /* synthetic */ a(int i) {
        this.f12273b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12273b) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                return o7.a((p7) obj, (p7) obj2);
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }
}
