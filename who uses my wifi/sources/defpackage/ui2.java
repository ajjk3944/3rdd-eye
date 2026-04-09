package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ui2 {
    public static final hm3 a = new hm3();

    static {
        vm3 vm3Var = xm3.g;
        new ui2(sn3.j);
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public ui2(sn3 sn3Var) {
        vm3 vm3Var = xm3.g;
        Object[] array = (sn3Var == null ? gi2.C(sn3Var.listIterator(0)) : sn3Var).toArray();
        int length = array.length;
        wl2.G(array, length);
        Arrays.sort(array, a);
        xm3.o(array, length);
    }
}
