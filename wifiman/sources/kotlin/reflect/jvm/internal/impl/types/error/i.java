package kotlin.reflect.jvm.internal.impl.types.error;

import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import pi.AbstractC7346d0;
import pi.r0;
import pi.v0;

/* loaded from: classes4.dex */
public final class i extends AbstractC7346d0 {

    /* renamed from: b, reason: collision with root package name */
    private final v0 f52188b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6164k f52189c;

    /* renamed from: d, reason: collision with root package name */
    private final k f52190d;

    /* renamed from: e, reason: collision with root package name */
    private final List f52191e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f52192f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f52193g;

    /* renamed from: h, reason: collision with root package name */
    private final String f52194h;

    public /* synthetic */ i(v0 v0Var, InterfaceC6164k interfaceC6164k, k kVar, List list, boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0Var, interfaceC6164k, kVar, (i10 & 8) != 0 ? AbstractC3689v.l() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // pi.S
    public List L0() {
        return this.f52191e;
    }

    @Override // pi.S
    public r0 M0() {
        return r0.f58162b.j();
    }

    @Override // pi.S
    public v0 N0() {
        return this.f52188b;
    }

    @Override // pi.S
    public boolean O0() {
        return this.f52192f;
    }

    @Override // pi.M0
    /* renamed from: U0 */
    public AbstractC7346d0 R0(boolean z10) {
        v0 v0VarN0 = N0();
        InterfaceC6164k interfaceC6164kR = r();
        k kVar = this.f52190d;
        List listL0 = L0();
        String[] strArr = this.f52193g;
        return new i(v0VarN0, interfaceC6164kR, kVar, listL0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // pi.M0
    /* renamed from: V0 */
    public AbstractC7346d0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return this;
    }

    public final String W0() {
        return this.f52194h;
    }

    public final k X0() {
        return this.f52190d;
    }

    @Override // pi.M0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public i X0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final i Z0(List newArguments) {
        AbstractC6492s.i(newArguments, "newArguments");
        v0 v0VarN0 = N0();
        InterfaceC6164k interfaceC6164kR = r();
        k kVar = this.f52190d;
        boolean zO0 = O0();
        String[] strArr = this.f52193g;
        return new i(v0VarN0, interfaceC6164kR, kVar, newArguments, zO0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // pi.S
    public InterfaceC6164k r() {
        return this.f52189c;
    }

    public i(v0 constructor, InterfaceC6164k memberScope, k kind, List arguments, boolean z10, String... formatParams) {
        AbstractC6492s.i(constructor, "constructor");
        AbstractC6492s.i(memberScope, "memberScope");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(arguments, "arguments");
        AbstractC6492s.i(formatParams, "formatParams");
        this.f52188b = constructor;
        this.f52189c = memberScope;
        this.f52190d = kind;
        this.f52191e = arguments;
        this.f52192f = z10;
        this.f52193g = formatParams;
        U u10 = U.f51694a;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC6492s.h(str, "format(...)");
        this.f52194h = str;
    }
}
