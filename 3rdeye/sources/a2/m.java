package A2;

import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;

/* compiled from: BlockModelDao_Impl.java */
/* loaded from: classes.dex */
public final class m extends I9.g {
    @Override // I9.g
    public final void K(E1.c cVar, Object obj) {
        cVar.b(1, ((Model) obj).getId());
    }

    @Override // I9.g
    public final String L() {
        return "DELETE FROM `Model` WHERE `id` = ?";
    }
}
