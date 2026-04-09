package O4;

import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.ImagePagerActivity;
import java.io.File;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: O4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1463i implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10310b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        switch (this.f10310b) {
            case 0:
                break;
            default:
                int i = ImagePagerActivity.f22079k;
                break;
        }
        return Long.compare(file2.lastModified(), file.lastModified());
    }
}
