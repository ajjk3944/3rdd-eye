package defpackage;

import android.content.DialogInterface;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class mz2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ pz2 g;
    public final /* synthetic */ jh1 h;

    public /* synthetic */ mz2(pz2 pz2Var, jh1 jh1Var, int i) {
        this.f = i;
        this.g = pz2Var;
        this.h = jh1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f) {
            case 0:
                pz2 pz2Var = this.g;
                pz2Var.j.c(pz2Var.k);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                pz2Var.H3(pz2Var.k, "dialog_click", map);
                jh1 jh1Var = this.h;
                if (jh1Var != null) {
                    jh1Var.y();
                    break;
                }
                break;
            default:
                pz2 pz2Var2 = this.g;
                pz2Var2.j.c(pz2Var2.k);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                pz2Var2.H3(pz2Var2.k, "rtsdc", map2);
                jh1 jh1Var2 = this.h;
                if (jh1Var2 != null) {
                    jh1Var2.y();
                    break;
                }
                break;
        }
    }
}
