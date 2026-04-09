package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.i;

/* loaded from: classes4.dex */
public class PluginGeneratedSerialDescriptor implements kotlinx.serialization.descriptors.f, n {

    /* renamed from: a, reason: collision with root package name */
    public final String f22802a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f22803b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22804c;

    /* renamed from: d, reason: collision with root package name */
    public int f22805d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f22806e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f22807f;

    /* renamed from: g, reason: collision with root package name */
    public List f22808g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f22809h;

    /* renamed from: i, reason: collision with root package name */
    public Map f22810i;

    /* renamed from: j, reason: collision with root package name */
    public final y8.h f22811j;

    /* renamed from: k, reason: collision with root package name */
    public final y8.h f22812k;

    /* renamed from: l, reason: collision with root package name */
    public final y8.h f22813l;

    public PluginGeneratedSerialDescriptor(String serialName, i0 i0Var, int i10) {
        kotlin.jvm.internal.p.e(serialName, "serialName");
        this.f22802a = serialName;
        this.f22803b = i0Var;
        this.f22804c = i10;
        this.f22805d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f22806e = strArr;
        int i12 = this.f22804c;
        this.f22807f = new List[i12];
        this.f22809h = new boolean[i12];
        this.f22810i = kotlin.collections.a.h();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21908b;
        this.f22811j = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$childSerializers$2
            {
                super(0);
            }

            @Override // l9.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.b[] invoke() {
                kotlinx.serialization.b[] bVarArrChildSerializers;
                i0 i0Var2 = this.this$0.f22803b;
                return (i0Var2 == null || (bVarArrChildSerializers = i0Var2.childSerializers()) == null) ? o1.f22893a : bVarArrChildSerializers;
            }
        });
        this.f22812k = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$typeParameterDescriptors$2
            {
                super(0);
            }

            @Override // l9.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f[] invoke() {
                ArrayList arrayList;
                kotlinx.serialization.b[] bVarArrTypeParametersSerializers;
                i0 i0Var2 = this.this$0.f22803b;
                if (i0Var2 == null || (bVarArrTypeParametersSerializers = i0Var2.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                    for (kotlinx.serialization.b bVar : bVarArrTypeParametersSerializers) {
                        arrayList.add(bVar.getDescriptor());
                    }
                }
                return l1.b(arrayList);
            }
        });
        this.f22813l = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$_hashCode$2
            {
                super(0);
            }

            @Override // l9.a
            public final Integer invoke() {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.this$0;
                return Integer.valueOf(n1.a(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.o()));
            }
        });
    }

    public static /* synthetic */ void l(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        pluginGeneratedSerialDescriptor.k(str, z10);
    }

    private final int p() {
        return ((Number) this.f22813l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.internal.n
    public Set a() {
        return this.f22810i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int c(String name) {
        kotlin.jvm.internal.p.e(name, "name");
        Integer num = (Integer) this.f22810i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int d() {
        return this.f22804c;
    }

    @Override // kotlinx.serialization.descriptors.f
    public String e(int i10) {
        return this.f22806e[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginGeneratedSerialDescriptor)) {
            return false;
        }
        kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
        if (!kotlin.jvm.internal.p.a(h(), fVar.h()) || !Arrays.equals(o(), ((PluginGeneratedSerialDescriptor) obj).o()) || d() != fVar.d()) {
            return false;
        }
        int iD = d();
        for (int i10 = 0; i10 < iD; i10++) {
            if (!kotlin.jvm.internal.p.a(g(i10).h(), fVar.g(i10).h()) || !kotlin.jvm.internal.p.a(g(i10).getKind(), fVar.g(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.f
    public List f(int i10) {
        List list = this.f22807f[i10];
        return list == null ? z8.r.j() : list;
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.f g(int i10) {
        return n()[i10].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.f
    public List getAnnotations() {
        List list = this.f22808g;
        return list == null ? z8.r.j() : list;
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.h getKind() {
        return i.a.f22786a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public String h() {
        return this.f22802a;
    }

    public int hashCode() {
        return p();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean i(int i10) {
        return this.f22809h[i10];
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public final void k(String name, boolean z10) {
        kotlin.jvm.internal.p.e(name, "name");
        String[] strArr = this.f22806e;
        int i10 = this.f22805d + 1;
        this.f22805d = i10;
        strArr[i10] = name;
        this.f22809h[i10] = z10;
        this.f22807f[i10] = null;
        if (i10 == this.f22804c - 1) {
            this.f22810i = m();
        }
    }

    public final Map m() {
        HashMap map = new HashMap();
        int length = this.f22806e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f22806e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    public final kotlinx.serialization.b[] n() {
        return (kotlinx.serialization.b[]) this.f22811j.getValue();
    }

    public final kotlinx.serialization.descriptors.f[] o() {
        return (kotlinx.serialization.descriptors.f[]) this.f22812k.getValue();
    }

    public String toString() {
        return z8.z.O(q9.e.j(0, this.f22804c), ", ", h() + '(', ")", 0, null, new l9.l() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.toString.1
            {
                super(1);
            }

            public final CharSequence a(int i10) {
                return PluginGeneratedSerialDescriptor.this.e(i10) + ": " + PluginGeneratedSerialDescriptor.this.g(i10).h();
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }, 24, null);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, i0 i0Var, int i10, int i11, kotlin.jvm.internal.i iVar) {
        this(str, (i11 & 2) != 0 ? null : i0Var, i10);
    }
}
