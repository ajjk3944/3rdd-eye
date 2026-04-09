package com.ui.wifiman.ui.teleport.consoles;

import Li.InterfaceC3220g;
import Li.N;
import com.ui.wifiman.ui.teleport.consoles.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ze.AbstractC8735d;

/* loaded from: classes4.dex */
public abstract class i extends AbstractC8735d {

    public static abstract class a {

        /* renamed from: com.ui.wifiman.ui.teleport.consoles.i$a$a, reason: collision with other inner class name */
        public static final class C1638a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1638a f45047a = new C1638a();

            private C1638a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1638a);
            }

            public int hashCode() {
                return 1462873126;
            }

            public String toString() {
                return "Dismiss";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public abstract InterfaceC3220g b();

    public abstract N n0();

    public abstract void o0(h.a aVar);

    public abstract void p0(h hVar);

    public abstract void q0();
}
