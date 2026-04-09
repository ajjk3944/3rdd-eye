package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g43 implements q53 {
    public static String c;
    public final /* synthetic */ int a;
    public final pq3 b;

    public g43(Context context, pq3 pq3Var) {
        this.a = 3;
        this.b = pq3Var;
    }

    @Override // defpackage.q53
    public final n70 a() {
        switch (this.a) {
            case 0:
                return ((ld2) this.b).c(new gz1(1));
            case 1:
                return ((ld2) this.b).c(gz1.c);
            case 2:
                return ((ld2) this.b).c(gz1.d);
            case 3:
                return ((ld2) this.b).c(new gz1(this));
            case 4:
                return ((ld2) this.b).c(new gz1(5));
            default:
                return ((ld2) this.b).c(gz1.e);
        }
    }

    @Override // defpackage.q53
    public final int d() {
        switch (this.a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 27;
            case 4:
                return 45;
            default:
                return 51;
        }
    }

    public /* synthetic */ g43(pq3 pq3Var, int i) {
        this.a = i;
        this.b = pq3Var;
    }
}
