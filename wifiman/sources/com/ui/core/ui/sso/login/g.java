package com.ui.core.ui.sso.login;

import H.l;
import Li.InterfaceC3220g;
import Li.z;
import com.ui.core.ui.sso.UiSSO;
import dh.InterfaceC5380e;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class g extends R9.a {

    public static abstract class a {

        /* renamed from: com.ui.core.ui.sso.login.g$a$a, reason: collision with other inner class name */
        public static final class C1334a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1334a f41573a = new C1334a();

            private C1334a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final UiSSO.d f41574a;

            /* renamed from: b, reason: collision with root package name */
            private final UiSSO.e f41575b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(UiSSO.d mfaParams, UiSSO.e eVar) {
                super(null);
                AbstractC6492s.i(mfaParams, "mfaParams");
                this.f41574a = mfaParams;
                this.f41575b = eVar;
            }

            public final UiSSO.d a() {
                return this.f41574a;
            }

            public final UiSSO.e b() {
                return this.f41575b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC6492s.d(this.f41574a, bVar.f41574a) && AbstractC6492s.d(this.f41575b, bVar.f41575b);
            }

            public int hashCode() {
                int iHashCode = this.f41574a.hashCode() * 31;
                UiSSO.e eVar = this.f41575b;
                return iHashCode + (eVar == null ? 0 : eVar.hashCode());
            }

            public String toString() {
                return "LaunchMFAAuth(mfaParams=" + this.f41574a + ", pkceParams=" + this.f41575b + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b INITIAL = new b("INITIAL", 0);
        public static final b ANIMATED = new b("ANIMATED", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{INITIAL, ANIMATED};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public abstract InterfaceC3220g b();

    public abstract z e0();

    public abstract z f0();

    public abstract z g0();

    public abstract z h0();

    public abstract z i0();

    public abstract z j0();

    public abstract l k0();

    public abstract l l0();

    public abstract Object m0(InterfaceC5380e interfaceC5380e);

    public abstract void n0();

    public abstract void o0();

    public abstract Object p0(InterfaceC5380e interfaceC5380e);

    public abstract Object q0(InterfaceC5380e interfaceC5380e);

    public abstract Object r0(InterfaceC5380e interfaceC5380e);

    public abstract void s0();
}
