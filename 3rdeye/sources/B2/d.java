package B2;

import Q4.f0;
import java.io.File;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f395b;

    public /* synthetic */ d(int i) {
        this.f395b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f395b) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                return ((f0.c) obj).a().compareTo(((f0.c) obj2).a());
        }
    }
}
