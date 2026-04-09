package defpackage;

import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b4 extends f74 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(int i, List list) {
        super(2, list);
        this.i = i;
    }

    @Override // defpackage.j4
    public final ba Q0() {
        switch (this.i) {
            case 0:
                return new fg(0, (List) this.g);
            case 1:
                return new rz(0, (List) this.g);
            case 2:
                return new fg(1, (List) this.g);
            case 3:
                return new rz(1, (List) this.g);
            case 4:
                return new rz(2, (List) this.g);
            case 5:
                return new cv0((List) this.g);
            default:
                return new fg(2, (List) this.g);
        }
    }
}
