package Af;

import De.d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import m8.AbstractC6778a;

/* loaded from: classes4.dex */
public abstract class v implements De.d {

    public static final class a extends v {

        /* renamed from: a, reason: collision with root package name */
        public static final a f740a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f741b = AbstractC6778a.f53223d0;

        private a() {
            super(null);
        }

        @Override // De.d
        public long b(InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(1423022440);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1423022440, i10, -1, "com.ui.wifiman.ui.wifi.component.WifiGenerationIconBadge.BE.color (WifiGenerationBadge.kt:33)");
            }
            long jE = C6733v0.f52951b.e();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return jE;
        }

        @Override // De.d
        public int e() {
            return f741b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -890016870;
        }

        public String toString() {
            return "BE";
        }
    }

    public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // De.g
    public void c(InterfaceC3540l interfaceC3540l, int i10) {
        d.a.a(this, interfaceC3540l, i10);
    }

    private v() {
    }
}
