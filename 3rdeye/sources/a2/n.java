package A2;

import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;

/* compiled from: BlockModelDao_Impl.java */
/* loaded from: classes.dex */
public final class n extends I9.g {
    @Override // I9.g
    public final void K(E1.c cVar, Object obj) {
        Model model = (Model) obj;
        cVar.b(1, model.getId());
        if (model.getName() == null) {
            cVar.f(2);
        } else {
            cVar.Q(2, model.getName());
        }
        if (model.getPack() == null) {
            cVar.f(3);
        } else {
            cVar.Q(3, model.getPack());
        }
        cVar.b(4, model.getId());
    }

    @Override // I9.g
    public final String L() {
        return "UPDATE OR ABORT `Model` SET `id` = ?,`name` = ?,`pack` = ? WHERE `id` = ?";
    }
}
