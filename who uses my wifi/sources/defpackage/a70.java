package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a70 implements hu0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ a70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hu0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new z60(this);
            default:
                return (Iterator) this.b;
        }
    }
}
