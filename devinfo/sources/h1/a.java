package h1;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f24800a;

    public a(List list) {
        this.f24800a = list;
    }

    public final boolean a() {
        List list = this.f24800a;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((b) list.get(i4)).getClass();
        }
        return false;
    }
}
