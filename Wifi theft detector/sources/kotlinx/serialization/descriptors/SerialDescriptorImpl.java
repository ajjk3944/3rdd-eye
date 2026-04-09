package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.p;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.internal.l1;
import kotlinx.serialization.internal.n;
import kotlinx.serialization.internal.n1;
import l9.l;
import z8.b0;
import z8.o;
import z8.s;
import z8.z;

/* loaded from: classes4.dex */
public final class SerialDescriptorImpl implements f, n {

    /* renamed from: a, reason: collision with root package name */
    public final String f22744a;

    /* renamed from: b, reason: collision with root package name */
    public final h f22745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22746c;

    /* renamed from: d, reason: collision with root package name */
    public final List f22747d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f22748e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f22749f;

    /* renamed from: g, reason: collision with root package name */
    public final f[] f22750g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f22751h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f22752i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f22753j;

    /* renamed from: k, reason: collision with root package name */
    public final f[] f22754k;

    /* renamed from: l, reason: collision with root package name */
    public final y8.h f22755l;

    public SerialDescriptorImpl(String serialName, h kind, int i10, List typeParameters, a builder) {
        p.e(serialName, "serialName");
        p.e(kind, "kind");
        p.e(typeParameters, "typeParameters");
        p.e(builder, "builder");
        this.f22744a = serialName;
        this.f22745b = kind;
        this.f22746c = i10;
        this.f22747d = builder.c();
        this.f22748e = z.d0(builder.f());
        Object[] array = builder.f().toArray(new String[0]);
        p.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        this.f22749f = strArr;
        this.f22750g = l1.b(builder.e());
        Object[] array2 = builder.d().toArray(new List[0]);
        p.c(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f22751h = (List[]) array2;
        this.f22752i = z.b0(builder.g());
        Iterable<b0> iterableU = o.U(strArr);
        ArrayList arrayList = new ArrayList(s.s(iterableU, 10));
        for (b0 b0Var : iterableU) {
            arrayList.add(y8.i.a(b0Var.b(), Integer.valueOf(b0Var.a())));
        }
        this.f22753j = kotlin.collections.a.s(arrayList);
        this.f22754k = l1.b(typeParameters);
        this.f22755l = kotlin.b.b(new l9.a() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$_hashCode$2
            {
                super(0);
            }

            @Override // l9.a
            public final Integer invoke() {
                SerialDescriptorImpl serialDescriptorImpl = this.this$0;
                return Integer.valueOf(n1.a(serialDescriptorImpl, serialDescriptorImpl.f22754k));
            }
        });
    }

    @Override // kotlinx.serialization.internal.n
    public Set a() {
        return this.f22748e;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int c(String name) {
        p.e(name, "name");
        Integer num = (Integer) this.f22753j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d() {
        return this.f22746c;
    }

    @Override // kotlinx.serialization.descriptors.f
    public String e(int i10) {
        return this.f22749f[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerialDescriptorImpl)) {
            return false;
        }
        f fVar = (f) obj;
        if (!p.a(h(), fVar.h()) || !Arrays.equals(this.f22754k, ((SerialDescriptorImpl) obj).f22754k) || d() != fVar.d()) {
            return false;
        }
        int iD = d();
        for (int i10 = 0; i10 < iD; i10++) {
            if (!p.a(g(i10).h(), fVar.g(i10).h()) || !p.a(g(i10).getKind(), fVar.g(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.f
    public List f(int i10) {
        return this.f22751h[i10];
    }

    @Override // kotlinx.serialization.descriptors.f
    public f g(int i10) {
        return this.f22750g[i10];
    }

    @Override // kotlinx.serialization.descriptors.f
    public List getAnnotations() {
        return this.f22747d;
    }

    @Override // kotlinx.serialization.descriptors.f
    public h getKind() {
        return this.f22745b;
    }

    @Override // kotlinx.serialization.descriptors.f
    public String h() {
        return this.f22744a;
    }

    public int hashCode() {
        return k();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean i(int i10) {
        return this.f22752i[i10];
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public final int k() {
        return ((Number) this.f22755l.getValue()).intValue();
    }

    public String toString() {
        return z.O(q9.e.j(0, d()), ", ", h() + '(', ")", 0, null, new l() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl.toString.1
            {
                super(1);
            }

            public final CharSequence a(int i10) {
                return SerialDescriptorImpl.this.e(i10) + ": " + SerialDescriptorImpl.this.g(i10).h();
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }, 24, null);
    }
}
