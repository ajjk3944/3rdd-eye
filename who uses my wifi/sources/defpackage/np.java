package defpackage;

import java.io.EOFException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class np implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ np(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((t3) this.b).q(((Integer) obj).intValue());
                break;
            default:
                ((mh0) obj).b((EOFException) this.b);
                break;
        }
    }
}
