package defpackage;

import android.content.DialogInterface;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jf0 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ kf0 a;

    public jf0(kf0 kf0Var) {
        this.a = kf0Var;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        kf0 kf0Var = this.a;
        HashSet hashSet = kf0Var.x0;
        if (z) {
            kf0Var.y0 = hashSet.add(kf0Var.A0[i].toString()) | kf0Var.y0;
        } else {
            kf0Var.y0 = hashSet.remove(kf0Var.A0[i].toString()) | kf0Var.y0;
        }
    }
}
