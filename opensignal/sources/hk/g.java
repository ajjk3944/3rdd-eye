package hk;

import androidx.lifecycle.o;
import com.squareup.picasso.s;

/* loaded from: classes.dex */
public final class g extends o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10802g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f10803r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, fh.f fVar, int i10) {
        super(16, fVar);
        this.f10802g = i10;
        this.f10803r = obj;
    }

    @Override // androidx.lifecycle.o
    public final long Y0() {
        switch (this.f10802g) {
            case 0:
                return ((h) this.f10803r).a();
            default:
                return ((mi.f) this.f10803r).m();
        }
    }

    @Override // androidx.lifecycle.o
    public void l1(s sVar) {
        switch (this.f10802g) {
            case 1:
                super.l1(sVar);
                ((mi.f) this.f10803r).N = true;
                break;
            default:
                super.l1(sVar);
                break;
        }
    }
}
