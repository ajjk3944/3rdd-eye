package Mh;

import Bh.InterfaceC2503m;
import Bh.l0;
import Nh.c0;
import Qh.y;
import Qh.z;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import xi.AbstractC8534a;

/* loaded from: classes4.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    private final k f13218a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2503m f13219b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13220c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f13221d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.h f13222e;

    public m(k c10, InterfaceC2503m containingDeclaration, z typeParameterOwner, int i10) {
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(typeParameterOwner, "typeParameterOwner");
        this.f13218a = c10;
        this.f13219b = containingDeclaration;
        this.f13220c = i10;
        this.f13221d = AbstractC8534a.d(typeParameterOwner.getTypeParameters());
        this.f13222e = c10.e().i(new l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 c(m mVar, y typeParameter) {
        AbstractC6492s.i(typeParameter, "typeParameter");
        Integer num = (Integer) mVar.f13221d.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new c0(c.k(c.d(mVar.f13218a, mVar), mVar.f13219b.getAnnotations()), typeParameter, mVar.f13220c + num.intValue(), mVar.f13219b);
    }

    @Override // Mh.p
    public l0 a(y javaTypeParameter) {
        AbstractC6492s.i(javaTypeParameter, "javaTypeParameter");
        c0 c0Var = (c0) this.f13222e.invoke(javaTypeParameter);
        return c0Var != null ? c0Var : this.f13218a.f().a(javaTypeParameter);
    }
}
