package G;

import android.util.Size;
import java.util.Comparator;

/* compiled from: CompareSizesByArea.java */
/* loaded from: classes.dex */
public final class d implements Comparator<Size> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1801b;

    public d(boolean z10) {
        this.f1801b = z10;
    }

    @Override // java.util.Comparator
    public final int compare(Size size, Size size2) {
        Size size3 = size;
        Size size4 = size2;
        int iSignum = Long.signum((size3.getWidth() * size3.getHeight()) - (size4.getWidth() * size4.getHeight()));
        return this.f1801b ? iSignum * (-1) : iSignum;
    }
}
