package B2;

import androidx.camera.core.impl.U;
import java.io.File;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f405b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f405b) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 1:
                String name = ((File) obj).getName();
                int i = T4.c.f12275f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            default:
                return ((U.a) obj).b().compareTo(((U.a) obj2).b());
        }
    }
}
