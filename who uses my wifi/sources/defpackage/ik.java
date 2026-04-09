package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ik extends e50 implements hy {
    public static final ik h;
    public static final ik i;
    public static final ik j;
    public static final ik k;
    public static final ik l;
    public static final ik m;
    public final /* synthetic */ int g;

    static {
        int i2 = 2;
        h = new ik(i2, 0);
        i = new ik(i2, 1);
        j = new ik(i2, 2);
        k = new ik(i2, 3);
        l = new ik(i2, 4);
        m = new ik(i2, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik(int i2, int i3) {
        super(i2);
        this.g = i3;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                return ((hk) obj).g((fk) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                return Integer.valueOf(((Number) obj).intValue() + 1);
            case 3:
                fk fkVar = (fk) obj2;
                if (!(fkVar instanceof o11)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? fkVar : Integer.valueOf(iIntValue + 1);
            case 4:
                o11 o11Var = (o11) obj;
                fk fkVar2 = (fk) obj2;
                if (o11Var != null) {
                    return o11Var;
                }
                if (fkVar2 instanceof o11) {
                    return (o11) fkVar2;
                }
                return null;
            case 5:
                return (r11) obj;
            default:
                return ((hk) obj).g((fk) obj2);
        }
    }
}
