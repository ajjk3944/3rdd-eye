package A8;

import kotlin.jvm.internal.AbstractC6492s;
import l7.AbstractC6552g;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class s extends AbstractC6552g {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6835l f529b = a.f530a;

    static final class a implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f530a = new a();

        a() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(od.i it) {
            AbstractC6492s.i(it, "it");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l7.AbstractC6552g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public od.i c(W7.d coordinates) {
        AbstractC6492s.i(coordinates, "coordinates");
        od.i iVar = new od.i(coordinates);
        iVar.p(this.f529b);
        return iVar;
    }

    public final void f(InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(interfaceC6835l, "<set-?>");
        this.f529b = interfaceC6835l;
    }
}
