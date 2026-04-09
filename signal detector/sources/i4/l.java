package i4;

import com.google.android.gms.internal.ads.AbstractC2012vK;

/* loaded from: classes.dex */
public final class l extends AbstractC2012vK {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, int i) {
        super(oVar);
        this.f20608f = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2012vK, java.util.Iterator
    public Object next() {
        switch (this.f20608f) {
            case 1:
                return a().f20616f;
            default:
                return super.next();
        }
    }
}
