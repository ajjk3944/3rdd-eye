package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class id4 implements ks2, vs2, ng4 {
    public static final /* synthetic */ id4 g = new id4(8);
    public static final /* synthetic */ id4 h = new id4(9);
    public final /* synthetic */ int f;

    public /* synthetic */ id4(int i) {
        this.f = i;
    }

    @Override // defpackage.ks2
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ void mo12c(Object obj) {
        switch (this.f) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
    }

    @Override // defpackage.vs2
    public /* synthetic */ void e(Object obj, of4 of4Var) {
    }

    public id4(Context context) {
        this.f = 10;
        new mr2(context, 11);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.clear();
        map2.clear();
    }

    @Override // defpackage.ng4
    public /* synthetic */ int c(Object obj) {
        HashMap map = og4.a;
        String str = ((bg4) obj).a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }
}
