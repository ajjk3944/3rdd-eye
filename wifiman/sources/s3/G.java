package s3;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import r3.C7568f;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f61181a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private C7568f f61182b;

    public G(C7568f c7568f) {
        AbstractC7901p.l(c7568f);
        this.f61182b = c7568f;
    }

    public final int a(Context context, int i10) {
        return this.f61181a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        AbstractC7901p.l(context);
        AbstractC7901p.l(fVar);
        int i10 = 0;
        if (!fVar.g()) {
            return 0;
        }
        int iH = fVar.h();
        int iA = a(context, iH);
        if (iA == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f61181a.size()) {
                    i10 = -1;
                    break;
                }
                int iKeyAt = this.f61181a.keyAt(i11);
                if (iKeyAt > iH && this.f61181a.get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            }
            iA = i10 == -1 ? this.f61182b.h(context, iH) : i10;
            this.f61181a.put(iH, iA);
        }
        return iA;
    }

    public final void c() {
        this.f61181a.clear();
    }
}
