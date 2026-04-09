package Jh;

import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: d, reason: collision with root package name */
    public static final b f10084d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final D f10085e = new D(B.b(null, 1, null), a.f10089a);

    /* renamed from: a, reason: collision with root package name */
    private final G f10086a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f10087b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10088c;

    /* synthetic */ class a extends AbstractC6489o implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10089a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke(Zh.c p02) {
            AbstractC6492s.i(p02, "p0");
            return B.d(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return kotlin.jvm.internal.O.d(B.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D a() {
            return D.f10085e;
        }

        private b() {
        }
    }

    public D(G jsr305, InterfaceC6835l getReportLevelForAnnotation) {
        AbstractC6492s.i(jsr305, "jsr305");
        AbstractC6492s.i(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f10086a = jsr305;
        this.f10087b = getReportLevelForAnnotation;
        this.f10088c = jsr305.f() || getReportLevelForAnnotation.invoke(B.e()) == O.IGNORE;
    }

    public final boolean b() {
        return this.f10088c;
    }

    public final InterfaceC6835l c() {
        return this.f10087b;
    }

    public final G d() {
        return this.f10086a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f10086a + ", getReportLevelForAnnotation=" + this.f10087b + ')';
    }
}
