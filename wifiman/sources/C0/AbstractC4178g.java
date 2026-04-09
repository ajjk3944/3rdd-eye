package c0;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4178g {

    /* renamed from: c0.g$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33628a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4177f invoke() {
            return new C4177f(null, 1, null);
        }
    }

    public static final InterfaceC4176e a(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)");
        }
        interfaceC3540l.U(-796080049);
        C4177f c4177f = (C4177f) AbstractC4174c.e(new Object[0], C4177f.f33606d.a(), null, a.f33628a, interfaceC3540l, 3072, 4);
        c4177f.i((InterfaceC4179h) interfaceC3540l.t(AbstractC4181j.d()));
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c4177f;
    }
}
