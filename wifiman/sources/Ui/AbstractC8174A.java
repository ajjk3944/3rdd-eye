package ui;

import Bh.InterfaceC2515z;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ui.f;

/* renamed from: ui.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8174A implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f63068a;

    /* renamed from: ui.A$a */
    public static final class a extends AbstractC8174A {

        /* renamed from: b, reason: collision with root package name */
        private final int f63069b;

        public a(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? "s" : "");
            super(sb2.toString(), null);
            this.f63069b = i10;
        }

        @Override // ui.f
        public boolean b(InterfaceC2515z functionDescriptor) {
            AbstractC6492s.i(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() >= this.f63069b;
        }
    }

    /* renamed from: ui.A$b */
    public static final class b extends AbstractC8174A {

        /* renamed from: b, reason: collision with root package name */
        private final int f63070b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f63070b = i10;
        }

        @Override // ui.f
        public boolean b(InterfaceC2515z functionDescriptor) {
            AbstractC6492s.i(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == this.f63070b;
        }
    }

    /* renamed from: ui.A$c */
    public static final class c extends AbstractC8174A {

        /* renamed from: b, reason: collision with root package name */
        public static final c f63071b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // ui.f
        public boolean b(InterfaceC2515z functionDescriptor) {
            AbstractC6492s.i(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().isEmpty();
        }
    }

    /* renamed from: ui.A$d */
    public static final class d extends AbstractC8174A {

        /* renamed from: b, reason: collision with root package name */
        public static final d f63072b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // ui.f
        public boolean b(InterfaceC2515z functionDescriptor) {
            AbstractC6492s.i(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == 1;
        }
    }

    public /* synthetic */ AbstractC8174A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // ui.f
    public String a() {
        return this.f63068a;
    }

    @Override // ui.f
    public String c(InterfaceC2515z interfaceC2515z) {
        return f.a.a(this, interfaceC2515z);
    }

    private AbstractC8174A(String str) {
        this.f63068a = str;
    }
}
