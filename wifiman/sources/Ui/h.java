package ui;

import Bh.InterfaceC2515z;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import ui.g;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Zh.f f63084a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.text.p f63085b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection f63086c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f63087d;

    /* renamed from: e, reason: collision with root package name */
    private final f[] f63088e;

    static final class a implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63089a = new a();

        a() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC2515z interfaceC2515z) {
            AbstractC6492s.i(interfaceC2515z, "<this>");
            return null;
        }
    }

    static final class b implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f63090a = new b();

        b() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC2515z interfaceC2515z) {
            AbstractC6492s.i(interfaceC2515z, "<this>");
            return null;
        }
    }

    static final class c implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f63091a = new c();

        c() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC2515z interfaceC2515z) {
            AbstractC6492s.i(interfaceC2515z, "<this>");
            return null;
        }
    }

    private h(Zh.f fVar, kotlin.text.p pVar, Collection collection, InterfaceC6835l interfaceC6835l, f... fVarArr) {
        this.f63084a = fVar;
        this.f63085b = pVar;
        this.f63086c = collection;
        this.f63087d = interfaceC6835l;
        this.f63088e = fVarArr;
    }

    public final g a(InterfaceC2515z functionDescriptor) {
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        for (f fVar : this.f63088e) {
            String strC = fVar.c(functionDescriptor);
            if (strC != null) {
                return new g.b(strC);
            }
        }
        String str = (String) this.f63087d.invoke(functionDescriptor);
        return str != null ? new g.b(str) : g.c.f63083b;
    }

    public final boolean b(InterfaceC2515z functionDescriptor) {
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        if (this.f63084a != null && !AbstractC6492s.d(functionDescriptor.getName(), this.f63084a)) {
            return false;
        }
        if (this.f63085b != null) {
            String strB = functionDescriptor.getName().b();
            AbstractC6492s.h(strB, "asString(...)");
            if (!this.f63085b.m(strB)) {
                return false;
            }
        }
        Collection collection = this.f63086c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ h(Zh.f fVar, f[] fVarArr, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVarArr, (i10 & 4) != 0 ? a.f63089a : interfaceC6835l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Zh.f name, f[] checks, InterfaceC6835l additionalChecks) {
        this(name, (kotlin.text.p) null, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(checks, "checks");
        AbstractC6492s.i(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(kotlin.text.p pVar, f[] fVarArr, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, fVarArr, (i10 & 4) != 0 ? b.f63090a : interfaceC6835l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(kotlin.text.p regex, f[] checks, InterfaceC6835l additionalChecks) {
        this((Zh.f) null, regex, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        AbstractC6492s.i(regex, "regex");
        AbstractC6492s.i(checks, "checks");
        AbstractC6492s.i(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, fVarArr, (i10 & 4) != 0 ? c.f63091a : interfaceC6835l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection nameList, f[] checks, InterfaceC6835l additionalChecks) {
        this((Zh.f) null, (kotlin.text.p) null, nameList, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        AbstractC6492s.i(nameList, "nameList");
        AbstractC6492s.i(checks, "checks");
        AbstractC6492s.i(additionalChecks, "additionalChecks");
    }
}
