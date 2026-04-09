package ui;

import Bh.InterfaceC2515z;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ui.f;

/* loaded from: classes4.dex */
public abstract class k implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f63095a;

    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final a f63096b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // ui.f
        public boolean b(InterfaceC2515z functionDescriptor) {
            AbstractC6492s.i(functionDescriptor, "functionDescriptor");
            return functionDescriptor.d0() != null;
        }
    }

    public static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final b f63097b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // ui.f
        public boolean b(InterfaceC2515z functionDescriptor) {
            AbstractC6492s.i(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.d0() == null && functionDescriptor.k0() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // ui.f
    public String a() {
        return this.f63095a;
    }

    @Override // ui.f
    public String c(InterfaceC2515z interfaceC2515z) {
        return f.a.a(this, interfaceC2515z);
    }

    private k(String str) {
        this.f63095a = str;
    }
}
