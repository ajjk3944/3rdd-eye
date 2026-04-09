package g1;

import android.graphics.RectF;

/* loaded from: classes.dex */
public final class z extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public final i f9276e;

    public z(i iVar) {
        this.f9276e = iVar;
    }

    @Override // g1.f0
    public final f1.c i() {
        i iVar = this.f9276e;
        if (iVar.f9239b == null) {
            iVar.f9239b = new RectF();
        }
        RectF rectF = iVar.f9239b;
        br.l.b(rectF);
        iVar.f9238a.computeBounds(rectF, true);
        return new f1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
