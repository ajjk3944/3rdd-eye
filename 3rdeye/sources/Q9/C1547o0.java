package Q9;

import O9.l;
import b9.C2001h;
import c9.C2097r;
import c9.C2099t;
import c9.C2100u;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p9.InterfaceC5480a;
import t4.C5606d;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
/* renamed from: Q9.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1547o0 implements O9.e, InterfaceC1542m {

    /* renamed from: a, reason: collision with root package name */
    public final String f11508a;

    /* renamed from: b, reason: collision with root package name */
    public final H<?> f11509b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11510c;

    /* renamed from: d, reason: collision with root package name */
    public int f11511d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f11512e;

    /* renamed from: f, reason: collision with root package name */
    public final List<Annotation>[] f11513f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f11514g;

    /* renamed from: h, reason: collision with root package name */
    public Object f11515h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f11516j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f11517k;

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    /* renamed from: Q9.o0$a */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<Integer> {
        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [b9.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final Integer invoke() {
            C1547o0 c1547o0 = C1547o0.this;
            return Integer.valueOf(C5606d.y(c1547o0, (O9.e[]) c1547o0.f11516j.getValue()));
        }
    }

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    /* renamed from: Q9.o0$b */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<M9.b<?>[]> {
        public b() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final M9.b<?>[] invoke() {
            M9.b<?>[] bVarArrChildSerializers;
            H<?> h10 = C1547o0.this.f11509b;
            return (h10 == null || (bVarArrChildSerializers = h10.childSerializers()) == null) ? C1549p0.f11523a : bVarArrChildSerializers;
        }
    }

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    /* renamed from: Q9.o0$c */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Integer, CharSequence> {
        public c() {
            super(1);
        }

        @Override // p9.l
        public final CharSequence invoke(Integer num) {
            int iIntValue = num.intValue();
            StringBuilder sb = new StringBuilder();
            C1547o0 c1547o0 = C1547o0.this;
            sb.append(c1547o0.f11512e[iIntValue]);
            sb.append(": ");
            sb.append(c1547o0.i(iIntValue).a());
            return sb.toString();
        }
    }

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    /* renamed from: Q9.o0$d */
    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<O9.e[]> {
        public d() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final O9.e[] invoke() {
            ArrayList arrayList;
            M9.b<?>[] bVarArrTypeParametersSerializers;
            H<?> h10 = C1547o0.this.f11509b;
            if (h10 == null || (bVarArrTypeParametersSerializers = h10.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                for (M9.b<?> bVar : bVarArrTypeParametersSerializers) {
                    arrayList.add(bVar.getDescriptor());
                }
            }
            return C1545n0.b(arrayList);
        }
    }

    public C1547o0(String str, H<?> h10, int i) {
        this.f11508a = str;
        this.f11509b = h10;
        this.f11510c = i;
        String[] strArr = new String[i];
        for (int i10 = 0; i10 < i; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f11512e = strArr;
        int i11 = this.f11510c;
        this.f11513f = new List[i11];
        this.f11514g = new boolean[i11];
        this.f11515h = C2100u.f18582b;
        b9.i iVar = b9.i.PUBLICATION;
        this.i = C2001h.a(iVar, new b());
        this.f11516j = C2001h.a(iVar, new d());
        this.f11517k = C2001h.a(iVar, new a());
    }

    @Override // O9.e
    public final String a() {
        return this.f11508a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q9.InterfaceC1542m
    public final Set<String> b() {
        return this.f11515h.keySet();
    }

    @Override // O9.e
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // O9.e
    public final int d(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        Integer num = (Integer) this.f11515h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // O9.e
    public O9.k e() {
        return l.a.f10523a;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [b9.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [b9.g, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1547o0) {
            O9.e eVar = (O9.e) obj;
            if (this.f11508a.equals(eVar.a()) && Arrays.equals((O9.e[]) this.f11516j.getValue(), (O9.e[]) ((C1547o0) obj).f11516j.getValue())) {
                int iF = eVar.f();
                int i = this.f11510c;
                if (i == iF) {
                    for (int i10 = 0; i10 < i; i10++) {
                        if (kotlin.jvm.internal.l.b(i(i10).a(), eVar.i(i10).a()) && kotlin.jvm.internal.l.b(i(i10).e(), eVar.i(i10).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // O9.e
    public final int f() {
        return this.f11510c;
    }

    @Override // O9.e
    public final String g(int i) {
        return this.f11512e[i];
    }

    @Override // O9.e
    public final List<Annotation> getAnnotations() {
        return C2099t.f18581b;
    }

    @Override // O9.e
    public final List<Annotation> h(int i) {
        List<Annotation> list = this.f11513f[i];
        return list == null ? C2099t.f18581b : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f11517k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    @Override // O9.e
    public O9.e i(int i) {
        return ((M9.b[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // O9.e
    public boolean isInline() {
        return false;
    }

    @Override // O9.e
    public final boolean j(int i) {
        return this.f11514g[i];
    }

    public final void k(String name, boolean z10) {
        kotlin.jvm.internal.l.f(name, "name");
        int i = this.f11511d + 1;
        this.f11511d = i;
        String[] strArr = this.f11512e;
        strArr[i] = name;
        this.f11514g[i] = z10;
        this.f11513f[i] = null;
        if (i == this.f11510c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f11515h = map;
        }
    }

    public String toString() {
        return C2097r.u0(v9.h.O(0, this.f11510c), ", ", this.f11508a.concat("("), ")", new c(), 24);
    }
}
