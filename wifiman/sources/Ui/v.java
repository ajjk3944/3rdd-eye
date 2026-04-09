package ui;

import Bh.InterfaceC2515z;
import fi.AbstractC5833e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import pi.AbstractC7346d0;
import pi.S;
import ui.f;

/* loaded from: classes4.dex */
public abstract class v implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f63173a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f63174b;

    /* renamed from: c, reason: collision with root package name */
    private final String f63175c;

    public static final class a extends v {

        /* renamed from: d, reason: collision with root package name */
        public static final a f63176d = new a();

        private a() {
            super("Boolean", u.f63172a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S d(kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
            AbstractC6492s.i(iVar, "<this>");
            AbstractC7346d0 abstractC7346d0N = iVar.n();
            AbstractC6492s.h(abstractC7346d0N, "getBooleanType(...)");
            return abstractC7346d0N;
        }
    }

    public static final class b extends v {

        /* renamed from: d, reason: collision with root package name */
        public static final b f63177d = new b();

        private b() {
            super("Int", w.f63179a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S d(kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
            AbstractC6492s.i(iVar, "<this>");
            AbstractC7346d0 abstractC7346d0D = iVar.D();
            AbstractC6492s.h(abstractC7346d0D, "getIntType(...)");
            return abstractC7346d0D;
        }
    }

    public static final class c extends v {

        /* renamed from: d, reason: collision with root package name */
        public static final c f63178d = new c();

        private c() {
            super("Unit", x.f63180a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S d(kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
            AbstractC6492s.i(iVar, "<this>");
            AbstractC7346d0 abstractC7346d0Z = iVar.Z();
            AbstractC6492s.h(abstractC7346d0Z, "getUnitType(...)");
            return abstractC7346d0Z;
        }
    }

    public /* synthetic */ v(String str, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC6835l);
    }

    @Override // ui.f
    public String a() {
        return this.f63175c;
    }

    @Override // ui.f
    public boolean b(InterfaceC2515z functionDescriptor) {
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        return AbstractC6492s.d(functionDescriptor.getReturnType(), this.f63174b.invoke(AbstractC5833e.m(functionDescriptor)));
    }

    @Override // ui.f
    public String c(InterfaceC2515z interfaceC2515z) {
        return f.a.a(this, interfaceC2515z);
    }

    private v(String str, InterfaceC6835l interfaceC6835l) {
        this.f63173a = str;
        this.f63174b = interfaceC6835l;
        this.f63175c = "must return " + str;
    }
}
