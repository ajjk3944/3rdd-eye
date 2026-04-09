package ca;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import ma.d0;
import ma.z;
import oe.f0;
import oe.h0;
import oe.u0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3481a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f3482b;

    static {
        Constructor constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating FLAC extension", e4);
        }
        f3482b = constructor;
    }

    public static void a(int i10, ArrayList arrayList) {
        int i11 = 0;
        switch (i10) {
            case 0:
                arrayList.add(new ma.a());
                return;
            case 1:
                arrayList.add(new ma.c());
                return;
            case 2:
                arrayList.add(new ma.d(0));
                return;
            case 3:
                arrayList.add(new da.a());
                return;
            case 4:
                Constructor constructor = f3482b;
                if (constructor == null) {
                    arrayList.add(new ea.c());
                    return;
                }
                try {
                    arrayList.add((k) constructor.newInstance(0));
                    return;
                } catch (Exception e4) {
                    throw new IllegalStateException("Unexpected error creating FLAC extractor", e4);
                }
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                arrayList.add(new fa.b());
                return;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                arrayList.add(new ha.e(0));
                return;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                arrayList.add(new ia.c(0));
                return;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                arrayList.add(new ja.i(0, null, Collections.EMPTY_LIST, null));
                arrayList.add(new ja.l(0));
                return;
            case 9:
                arrayList.add(new ka.d());
                return;
            case 10:
                arrayList.add(new z());
                return;
            case 11:
                qb.u uVar = new qb.u(0L);
                f0 f0Var = h0.f19336d;
                arrayList.add(new d0(1, uVar, new ma.f(i11, i11, u0.f19383x)));
                return;
            case 12:
                na.d dVar = new na.d();
                dVar.f17429d = -1;
                dVar.f17430e = -1L;
                arrayList.add(dVar);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new ga.a());
                return;
        }
    }
}
