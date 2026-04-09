package ks;

import as.a0;
import h7.h0;
import h7.r1;
import i.g0;
import java.util.HashMap;
import js.o;
import js.q;

/* loaded from: classes.dex */
public final class g implements q {
    public static final boolean E = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    public static final HashMap F;
    public b B;
    public String[] D;

    /* renamed from: a, reason: collision with root package name */
    public int[] f14500a;

    /* renamed from: d, reason: collision with root package name */
    public String f14501d;

    /* renamed from: g, reason: collision with root package name */
    public int f14502g;

    /* renamed from: r, reason: collision with root package name */
    public String[] f14503r;

    /* renamed from: x, reason: collision with root package name */
    public String[] f14504x;

    /* renamed from: y, reason: collision with root package name */
    public String[] f14505y;

    static {
        HashMap map = new HashMap();
        F = map;
        map.put(qs.b.j(new qs.c("kotlin.jvm.internal.KotlinClass")), b.CLASS);
        map.put(qs.b.j(new qs.c("kotlin.jvm.internal.KotlinFileFacade")), b.FILE_FACADE);
        map.put(qs.b.j(new qs.c("kotlin.jvm.internal.KotlinMultifileClass")), b.MULTIFILE_CLASS);
        map.put(qs.b.j(new qs.c("kotlin.jvm.internal.KotlinMultifileClassPart")), b.MULTIFILE_CLASS_PART);
        map.put(qs.b.j(new qs.c("kotlin.jvm.internal.KotlinSyntheticClass")), b.SYNTHETIC_CLASS);
    }

    @Override // js.q
    public final o a(qs.b bVar, wr.a aVar) {
        b bVar2;
        qs.c cVarB = bVar.b();
        if (cVarB.equals(a0.f2166a)) {
            return new r1(17, this);
        }
        if (cVarB.equals(a0.f2178o)) {
            return new h0(this);
        }
        if (E || this.B != null || (bVar2 = (b) F.get(bVar)) == null) {
            return null;
        }
        this.B = bVar2;
        return new g0(this);
    }
}
