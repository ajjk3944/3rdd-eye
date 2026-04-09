package bj;

import aj.AbstractC3868b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
final class v extends AbstractC4120c {

    /* renamed from: h, reason: collision with root package name */
    private final aj.j f33465h;

    public /* synthetic */ v(AbstractC3868b abstractC3868b, aj.j jVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3868b, jVar, (i10 & 4) != 0 ? null : str);
    }

    @Override // bj.AbstractC4120c
    public aj.j A0() {
        return this.f33465h;
    }

    @Override // Yi.c
    public int k(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bj.AbstractC4120c
    public aj.j m0(String tag) {
        AbstractC6492s.i(tag, "tag");
        if (tag == "primitive") {
            return A0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AbstractC3868b json, aj.j value, String str) {
        super(json, value, str, null);
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(value, "value");
        this.f33465h = value;
        d0("primitive");
    }
}
