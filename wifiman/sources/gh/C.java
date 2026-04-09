package Gh;

import Zg.AbstractC3689v;
import gi.EnumC5923e;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class C extends E implements Qh.v {

    /* renamed from: b, reason: collision with root package name */
    private final Class f7444b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection f7445c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7446d;

    public C(Class reflectType) {
        AbstractC6492s.i(reflectType, "reflectType");
        this.f7444b = reflectType;
        this.f7445c = AbstractC3689v.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Gh.E
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public Class R() {
        return this.f7444b;
    }

    @Override // Qh.InterfaceC3447d
    public Collection getAnnotations() {
        return this.f7445c;
    }

    @Override // Qh.v
    public kotlin.reflect.jvm.internal.impl.builtins.l getType() {
        if (AbstractC6492s.d(R(), Void.TYPE)) {
            return null;
        }
        return EnumC5923e.get(R().getName()).getPrimitiveType();
    }

    @Override // Qh.InterfaceC3447d
    public boolean h() {
        return this.f7446d;
    }
}
