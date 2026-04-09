package L;

import C.W;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import androidx.camera.core.impl.H0;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3781c;

    public /* synthetic */ b(Object obj, int i) {
        this.f3780b = i;
        this.f3781c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3780b) {
            case 0:
                H0.f fVar = (H0.f) obj2;
                ((c) this.f3781c).getClass();
                Class<?> cls = ((H0.f) obj).f().f14995j;
                int i = 1;
                int i10 = cls == MediaCodec.class ? 2 : cls == W.class ? 0 : 1;
                Class<?> cls2 = fVar.f().f14995j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 == W.class) {
                    i = 0;
                }
                return i10 - i;
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int width = size.getWidth();
                Rect rect = (Rect) this.f3781c;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(width - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
