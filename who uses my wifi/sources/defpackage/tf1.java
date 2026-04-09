package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class tf1 implements cl3 {
    public static final /* synthetic */ tf1 g = new tf1(0);
    public static final /* synthetic */ tf1 h = new tf1(1);
    public static final /* synthetic */ tf1 i = new tf1(2);
    public static final /* synthetic */ tf1 j = new tf1(3);
    public final /* synthetic */ int f;

    public /* synthetic */ tf1(int i2) {
        this.f = i2;
    }

    @Override // defpackage.cl3
    public final /* synthetic */ boolean c(Object obj) {
        switch (this.f) {
            case 0:
                yh1 yh1Var = (yh1) obj;
                return yh1Var.b.equals("com.apple.iTunes") && yh1Var.c.equals("iTunSMPB");
            case 1:
                return ((th1) obj).c.equals("iTunSMPB");
            case 2:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
