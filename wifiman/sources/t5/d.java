package t5;

import com.google.gson.q;
import f.AbstractC5487d;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s5.InterfaceC7912a;
import v5.AbstractC8192a;
import w5.C8268a;
import w5.C8270c;

/* loaded from: classes3.dex */
public final class d implements q, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final d f61748g = new d();

    /* renamed from: d, reason: collision with root package name */
    private boolean f61752d;

    /* renamed from: a, reason: collision with root package name */
    private double f61749a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private int f61750b = 136;

    /* renamed from: c, reason: collision with root package name */
    private boolean f61751c = true;

    /* renamed from: e, reason: collision with root package name */
    private List f61753e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    private List f61754f = Collections.emptyList();

    class a extends com.google.gson.p {

        /* renamed from: a, reason: collision with root package name */
        private volatile com.google.gson.p f61755a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f61756b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f61757c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.gson.e f61758d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f61759e;

        a(boolean z10, boolean z11, com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            this.f61756b = z10;
            this.f61757c = z11;
            this.f61758d = eVar;
            this.f61759e = aVar;
        }

        private com.google.gson.p e() {
            com.google.gson.p pVar = this.f61755a;
            if (pVar != null) {
                return pVar;
            }
            com.google.gson.p pVarN = this.f61758d.n(d.this, this.f61759e);
            this.f61755a = pVarN;
            return pVarN;
        }

        @Override // com.google.gson.p
        public Object b(C8268a c8268a) throws IOException {
            if (!this.f61756b) {
                return e().b(c8268a);
            }
            c8268a.F0();
            return null;
        }

        @Override // com.google.gson.p
        public void d(C8270c c8270c, Object obj) throws IOException {
            if (this.f61757c) {
                c8270c.b0();
            } else {
                e().d(c8270c, obj);
            }
        }
    }

    private static boolean f(Class cls) {
        return cls.isMemberClass() && !AbstractC8192a.n(cls);
    }

    private boolean h(s5.d dVar) {
        if (dVar != null) {
            return this.f61749a >= dVar.value();
        }
        return true;
    }

    private boolean i(s5.e eVar) {
        if (eVar != null) {
            return this.f61749a < eVar.value();
        }
        return true;
    }

    private boolean k(s5.d dVar, s5.e eVar) {
        return h(dVar) && i(eVar);
    }

    @Override // com.google.gson.q
    public com.google.gson.p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        Class clsC = aVar.c();
        boolean zD = d(clsC, true);
        boolean zD2 = d(clsC, false);
        if (zD || zD2) {
            return new a(zD2, zD, eVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(Class cls, boolean z10) {
        if (this.f61749a != -1.0d && !k((s5.d) cls.getAnnotation(s5.d.class), (s5.e) cls.getAnnotation(s5.e.class))) {
            return true;
        }
        if (!this.f61751c && f(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && AbstractC8192a.l(cls)) {
            return true;
        }
        Iterator it = (z10 ? this.f61753e : this.f61754f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC5487d.a(it.next());
        throw null;
    }

    public boolean e(Field field, boolean z10) {
        InterfaceC7912a interfaceC7912a;
        if ((this.f61750b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f61749a != -1.0d && !k((s5.d) field.getAnnotation(s5.d.class), (s5.e) field.getAnnotation(s5.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f61752d && ((interfaceC7912a = (InterfaceC7912a) field.getAnnotation(InterfaceC7912a.class)) == null || (!z10 ? interfaceC7912a.deserialize() : interfaceC7912a.serialize()))) || d(field.getType(), z10)) {
            return true;
        }
        List list = z10 ? this.f61753e : this.f61754f;
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC5487d.a(it.next());
        throw null;
    }
}
