package E;

import Q4.m;
import R.F;
import R.O;
import V4.l;
import android.net.wifi.ScanResult;
import android.view.View;
import androidx.recyclerview.widget.C0319p;
import androidx.recyclerview.widget.RecyclerView;
import d5.y;
import java.io.File;
import java.util.Comparator;
import java.util.WeakHashMap;
import x.C2985f;

/* loaded from: classes.dex */
public final class h implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1329a;

    public /* synthetic */ h(int i) {
        this.f1329a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1329a) {
            case 0:
                WeakHashMap weakHashMap = O.f3270a;
                float fG = F.g((View) obj);
                float fG2 = F.g((View) obj2);
                if (fG > fG2) {
                    return -1;
                }
                return fG < fG2 ? 1 : 0;
            case 1:
                return y.g(Integer.valueOf(((m) obj2).f3216c), Integer.valueOf(((m) obj).f3216c));
            case 2:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 3:
                long jLastModified = ((File) obj2).lastModified() - ((File) obj).lastModified();
                if (jLastModified == 0) {
                    return 0;
                }
                return jLastModified < 0 ? -1 : 1;
            case 4:
                return y.g(Float.valueOf(((l) obj2).f3908d), Float.valueOf(((l) obj).f3908d));
            case 5:
                return y.g(Integer.valueOf(((V4.m) obj2).f3915c), Integer.valueOf(((V4.m) obj).f3915c));
            case 6:
                return y.g(Float.valueOf(((l) obj2).f3908d), Float.valueOf(((l) obj).f3908d));
            case 7:
                return y.g(((W4.e) obj).f4101b, ((W4.e) obj2).f4101b);
            case 8:
                return y.g(((W4.e) obj).f4101b, ((W4.e) obj2).f4101b);
            case 9:
                return y.g(((W4.e) obj).f4101b, ((W4.e) obj2).f4101b);
            case 10:
                return y.g(((W4.e) obj).f4101b, ((W4.e) obj2).f4101b);
            case 11:
                return y.g(Integer.valueOf(((ScanResult) obj2).level), Integer.valueOf(((ScanResult) obj).level));
            case 12:
                String str = ((U4.b) obj).f3709c;
                Integer numValueOf = str != null ? Integer.valueOf(str.length()) : null;
                String str2 = ((U4.b) obj2).f3709c;
                return y.g(numValueOf, str2 != null ? Integer.valueOf(str2.length()) : null);
            case 13:
                C0319p c0319p = (C0319p) obj;
                C0319p c0319p2 = (C0319p) obj2;
                RecyclerView recyclerView = c0319p.f5574d;
                if ((recyclerView == null) == (c0319p2.f5574d == null)) {
                    boolean z6 = c0319p.f5571a;
                    if (z6 == c0319p2.f5571a) {
                        int i = c0319p2.f5572b - c0319p.f5572b;
                        if (i != 0) {
                            return i;
                        }
                        int i3 = c0319p.f5573c - c0319p2.f5573c;
                        if (i3 != 0) {
                            return i3;
                        }
                        return 0;
                    }
                    if (!z6) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 14:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 15:
                return ((C2985f) obj).f24021b - ((C2985f) obj2).f24021b;
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
