package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sa extends zh {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa(oi oiVar, int i) {
        super(oiVar);
        this.e = i;
    }

    @Override // defpackage.zh
    public final boolean a(oa1 oa1Var) {
        switch (this.e) {
            case 0:
                return oa1Var.j.b;
            case 1:
                return oa1Var.j.d;
            case 2:
                return oa1Var.j.a == 2;
            case 3:
                int i = oa1Var.j.a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return oa1Var.j.e;
        }
    }

    @Override // defpackage.zh
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.e) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                yg0 yg0Var = (yg0) obj;
                return (yg0Var.a && yg0Var.b) ? false : true;
            case 3:
                yg0 yg0Var2 = (yg0) obj;
                return !yg0Var2.a || yg0Var2.c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
