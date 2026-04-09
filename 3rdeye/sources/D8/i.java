package D8;

import A9.C0575f;
import D9.A;
import D9.E;
import D9.H;
import D9.J;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import i9.InterfaceC4463a;
import java.util.List;

/* compiled from: PhSecretSettingsViewModel.kt */
/* loaded from: classes3.dex */
public final class i extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public final J f1105b;

    /* renamed from: c, reason: collision with root package name */
    public final A f1106c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhSecretSettingsViewModel.kt */
    public static final class a {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a LOCAL = new a("LOCAL", 0);
        public static final a REMOTE = new a("REMOTE", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{LOCAL, REMOTE};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(aVarArr$values);
        }

        private a(String str, int i) {
        }

        public static InterfaceC4463a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: PhSecretSettingsViewModel.kt */
    public static abstract class b {

        /* compiled from: PhSecretSettingsViewModel.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Exception f1107a;

            public a(Exception exc) {
                this.f1107a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f1107a, ((a) obj).f1107a);
            }

            public final int hashCode() {
                return this.f1107a.hashCode();
            }

            public final String toString() {
                return "Error(e=" + this.f1107a + ")";
            }
        }

        /* compiled from: PhSecretSettingsViewModel.kt */
        /* renamed from: D8.i$b$b, reason: collision with other inner class name */
        public static final class C0012b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0012b f1108a = new C0012b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0012b);
            }

            public final int hashCode() {
                return 2106463837;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: PhSecretSettingsViewModel.kt */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public final List<n> f1109a;

            /* renamed from: b, reason: collision with root package name */
            public final a f1110b;

            /* renamed from: c, reason: collision with root package name */
            public final long f1111c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f1112d;

            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends n> totoParams, a source, long j4, boolean z10) {
                kotlin.jvm.internal.l.f(totoParams, "totoParams");
                kotlin.jvm.internal.l.f(source, "source");
                this.f1109a = totoParams;
                this.f1110b = source;
                this.f1111c = j4;
                this.f1112d = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.l.b(this.f1109a, cVar.f1109a) && this.f1110b == cVar.f1110b && this.f1111c == cVar.f1111c && this.f1112d == cVar.f1112d;
            }

            public final int hashCode() {
                int iHashCode = (this.f1110b.hashCode() + (this.f1109a.hashCode() * 31)) * 31;
                long j4 = this.f1111c;
                return ((iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f1112d ? 1231 : 1237);
            }

            public final String toString() {
                return "Success(totoParams=" + this.f1109a + ", source=" + this.f1110b + ", responseTime=" + this.f1111c + ", isConfigVisible=" + this.f1112d + ")";
            }
        }
    }

    public i() {
        J jC = E.c(b.C0012b.f1108a);
        this.f1105b = jC;
        this.f1106c = H.a(jC);
        C0575f.e(c0.a(this), null, null, new j(this, null), 3);
    }
}
