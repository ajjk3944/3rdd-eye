package Th;

import Bh.g0;
import Jh.I;
import Sh.x;
import Th.a;
import Zh.f;
import di.C5397f;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public class b implements x.c {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f21999j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map f22000k;

    /* renamed from: a, reason: collision with root package name */
    private int[] f22001a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f22002b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f22003c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f22004d = null;

    /* renamed from: e, reason: collision with root package name */
    private String[] f22005e = null;

    /* renamed from: f, reason: collision with root package name */
    private String[] f22006f = null;

    /* renamed from: g, reason: collision with root package name */
    private String[] f22007g = null;

    /* renamed from: h, reason: collision with root package name */
    private a.EnumC0806a f22008h = null;

    /* renamed from: i, reason: collision with root package name */
    private String[] f22009i = null;

    /* renamed from: Th.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0808b implements x.b {

        /* renamed from: a, reason: collision with root package name */
        private final List f22010a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Sh.x.b
        public void a() {
            g((String[]) this.f22010a.toArray(new String[0]));
        }

        @Override // Sh.x.b
        public void b(C5397f c5397f) {
            if (c5397f == null) {
                f(2);
            }
        }

        @Override // Sh.x.b
        public void c(Zh.b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // Sh.x.b
        public void d(Object obj) {
            if (obj instanceof String) {
                this.f22010a.add((String) obj);
            }
        }

        @Override // Sh.x.b
        public x.a e(Zh.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        protected abstract void g(String[] strArr);
    }

    private class c implements x.a {

        class a extends AbstractC0808b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // Th.b.AbstractC0808b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f22005e = strArr;
            }
        }

        /* renamed from: Th.b$c$b, reason: collision with other inner class name */
        class C0809b extends AbstractC0808b {
            C0809b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // Th.b.AbstractC0808b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f22006f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0809b();
        }

        @Override // Sh.x.a
        public void a() {
        }

        @Override // Sh.x.a
        public void b(f fVar, C5397f c5397f) {
            if (c5397f == null) {
                g(0);
            }
        }

        @Override // Sh.x.a
        public void c(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strB = fVar.b();
            if ("k".equals(strB)) {
                if (obj instanceof Integer) {
                    b.this.f22008h = a.EnumC0806a.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strB)) {
                if (obj instanceof int[]) {
                    b.this.f22001a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    b.this.f22002b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strB)) {
                if (obj instanceof Integer) {
                    b.this.f22003c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strB) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                b.this.f22004d = str2;
            }
        }

        @Override // Sh.x.a
        public x.b d(f fVar) {
            String strB = fVar != null ? fVar.b() : null;
            if ("d1".equals(strB)) {
                return h();
            }
            if ("d2".equals(strB)) {
                return i();
            }
            return null;
        }

        @Override // Sh.x.a
        public void e(f fVar, Zh.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // Sh.x.a
        public x.a f(f fVar, Zh.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }
    }

    private class d implements x.a {

        class a extends AbstractC0808b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // Th.b.AbstractC0808b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f22009i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        @Override // Sh.x.a
        public void a() {
        }

        @Override // Sh.x.a
        public void b(f fVar, C5397f c5397f) {
            if (c5397f == null) {
                g(0);
            }
        }

        @Override // Sh.x.a
        public void c(f fVar, Object obj) {
        }

        @Override // Sh.x.a
        public x.b d(f fVar) {
            if (SnmpConfigurator.O_BIND_ADDRESS.equals(fVar != null ? fVar.b() : null)) {
                return h();
            }
            return null;
        }

        @Override // Sh.x.a
        public void e(f fVar, Zh.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // Sh.x.a
        public x.a f(f fVar, Zh.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }
    }

    private class e implements x.a {

        class a extends AbstractC0808b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // Th.b.AbstractC0808b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f22005e = strArr;
            }
        }

        /* renamed from: Th.b$e$b, reason: collision with other inner class name */
        class C0810b extends AbstractC0808b {
            C0810b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // Th.b.AbstractC0808b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f22006f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0810b();
        }

        @Override // Sh.x.a
        public void a() {
        }

        @Override // Sh.x.a
        public void b(f fVar, C5397f c5397f) {
            if (c5397f == null) {
                g(0);
            }
        }

        @Override // Sh.x.a
        public void c(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strB = fVar.b();
            if ("version".equals(strB)) {
                if (obj instanceof int[]) {
                    b.this.f22001a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strB)) {
                b.this.f22002b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // Sh.x.a
        public x.b d(f fVar) {
            String strB = fVar != null ? fVar.b() : null;
            if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
                return h();
            }
            if ("strings".equals(strB)) {
                return i();
            }
            return null;
        }

        @Override // Sh.x.a
        public void e(f fVar, Zh.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // Sh.x.a
        public x.a f(f fVar, Zh.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }
    }

    static {
        try {
            f21999j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f21999j = false;
        }
        HashMap map = new HashMap();
        f22000k = map;
        map.put(Zh.b.k(new Zh.c("kotlin.jvm.internal.KotlinClass")), a.EnumC0806a.CLASS);
        map.put(Zh.b.k(new Zh.c("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0806a.FILE_FACADE);
        map.put(Zh.b.k(new Zh.c("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0806a.MULTIFILE_CLASS);
        map.put(Zh.b.k(new Zh.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0806a.MULTIFILE_CLASS_PART);
        map.put(Zh.b.k(new Zh.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0806a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        a.EnumC0806a enumC0806a = this.f22008h;
        return enumC0806a == a.EnumC0806a.CLASS || enumC0806a == a.EnumC0806a.FILE_FACADE || enumC0806a == a.EnumC0806a.MULTIFILE_CLASS_PART;
    }

    @Override // Sh.x.c
    public void a() {
    }

    @Override // Sh.x.c
    public x.a b(Zh.b bVar, g0 g0Var) {
        a.EnumC0806a enumC0806a;
        if (bVar == null) {
            d(0);
        }
        if (g0Var == null) {
            d(1);
        }
        Zh.c cVarA = bVar.a();
        if (cVarA.equals(I.f10102a)) {
            return new c();
        }
        if (cVarA.equals(I.f10121t)) {
            return new d();
        }
        if (f21999j || this.f22008h != null || (enumC0806a = (a.EnumC0806a) f22000k.get(bVar)) == null) {
            return null;
        }
        this.f22008h = enumC0806a;
        return new e();
    }

    public Th.a m(Yh.e eVar) {
        if (this.f22008h == null || this.f22001a == null) {
            return null;
        }
        Yh.e eVar2 = new Yh.e(this.f22001a, (this.f22003c & 8) != 0);
        if (!eVar2.h(eVar)) {
            this.f22007g = this.f22005e;
            this.f22005e = null;
        } else if (o() && this.f22005e == null) {
            return null;
        }
        String[] strArr = this.f22009i;
        return new Th.a(this.f22008h, eVar2, this.f22005e, this.f22007g, this.f22006f, this.f22002b, this.f22003c, this.f22004d, strArr != null ? Yh.a.e(strArr) : null);
    }

    public Th.a n() {
        return m(Yh.e.f25044i);
    }
}
