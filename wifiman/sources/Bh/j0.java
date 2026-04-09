package Bh;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public interface j0 {

    public static final class a implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1787a = new a();

        private a() {
        }

        @Override // Bh.j0
        public Collection a(pi.v0 currentTypeConstructor, Collection superTypes, InterfaceC6835l neighbors, InterfaceC6835l reportLoop) {
            AbstractC6492s.i(currentTypeConstructor, "currentTypeConstructor");
            AbstractC6492s.i(superTypes, "superTypes");
            AbstractC6492s.i(neighbors, "neighbors");
            AbstractC6492s.i(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection a(pi.v0 v0Var, Collection collection, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2);
}
