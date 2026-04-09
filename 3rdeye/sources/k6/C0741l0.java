package K6;

import C6.i;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: DivGifImageBinder.kt */
/* renamed from: K6.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741l0 extends kotlin.jvm.internal.m implements p9.l<C6.i, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.j f3519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0741l0(O6.j jVar) {
        super(1);
        this.f3519g = jVar;
    }

    @Override // p9.l
    public final C1992A invoke(C6.i iVar) {
        C6.i it = iVar;
        kotlin.jvm.internal.l.f(it, "it");
        O6.j jVar = this.f3519g;
        if (!jVar.m()) {
            if (it instanceof i.a) {
                jVar.setPreview(((i.a) it).f948a);
            } else if (it instanceof i.b) {
                jVar.setPreview(((i.b) it).f949a);
            }
            jVar.setTag(R.id.image_loaded_flag, Boolean.FALSE);
        }
        return C1992A.f18074a;
    }
}
