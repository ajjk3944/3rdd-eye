package K6;

import C6.i;
import b9.C1992A;
import x6.AbstractC5774f;

/* compiled from: DivVideoBinder.kt */
/* loaded from: classes.dex */
public final class F1 extends kotlin.jvm.internal.m implements p9.l<C6.i, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC5774f f3219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ J1 f3220h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(AbstractC5774f abstractC5774f, J1 j12) {
        super(1);
        this.f3219g = abstractC5774f;
        this.f3220h = j12;
    }

    @Override // p9.l
    public final C1992A invoke(C6.i iVar) {
        C6.i iVar2 = iVar;
        if (iVar2 != null) {
            J1 j12 = this.f3220h;
            j12.setVisibility(0);
            if (iVar2 instanceof i.b) {
                j12.setImageDrawable(((i.b) iVar2).f949a);
            } else if (iVar2 instanceof i.a) {
                j12.setImageBitmap(((i.a) iVar2).f948a);
            }
        }
        this.f3219g.setVisibility(0);
        return C1992A.f18074a;
    }
}
