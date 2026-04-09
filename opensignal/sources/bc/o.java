package bc;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final a f2634a;

    /* renamed from: b, reason: collision with root package name */
    public final Feature f2635b;

    public /* synthetic */ o(a aVar, Feature feature) {
        this.f2634a = aVar;
        this.f2635b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (cc.s.k(this.f2634a, oVar.f2634a) && cc.s.k(this.f2635b, oVar.f2635b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2634a, this.f2635b});
    }

    public final String toString() {
        bm.e eVar = new bm.e(9, this);
        eVar.d(this.f2634a, "key");
        eVar.d(this.f2635b, "feature");
        return eVar.toString();
    }
}
