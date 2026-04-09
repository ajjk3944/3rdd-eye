package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class et2 implements yp3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp3 b;

    public /* synthetic */ et2(qp3 qp3Var, int i) {
        this.a = i;
        this.b = qp3Var;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) throws r13 {
        ag2 ag2Var = (ag2) obj;
        switch (this.a) {
            case 0:
                if (ag2Var != null) {
                    return this.b;
                }
                throw new r13("Retrieve Web View from image ad response failed.", 1);
            default:
                if (ag2Var == null || ag2Var.f() == null) {
                    throw new r13("Retrieve video view in html5 ad response failed.", 1);
                }
                return this.b;
        }
    }
}
