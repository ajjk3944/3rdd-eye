package J8;

import i9.InterfaceC4463a;

/* compiled from: SubscriptionUtils.kt */
/* loaded from: classes3.dex */
public final class Q {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionUtils.kt */
    public static final class a {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NONE = new a("NONE", 0);
        public static final a THREE_DAYS = new a("THREE_DAYS", 1);
        public static final a SEVEN_DAYS = new a("SEVEN_DAYS", 2);
        public static final a THIRTY_DAYS = new a("THIRTY_DAYS", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{NONE, THREE_DAYS, SEVEN_DAYS, THIRTY_DAYS};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionUtils.kt */
    public static final class b {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NONE = new b("NONE", 0);
        public static final b YEARLY = new b("YEARLY", 1);
        public static final b MONTHLY = new b("MONTHLY", 2);
        public static final b WEEKLY = new b("WEEKLY", 3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NONE, YEARLY, MONTHLY, WEEKLY};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(bVarArr$values);
        }

        private b(String str, int i) {
        }

        public static InterfaceC4463a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static a a(String str) {
        return y9.q.b0(str, "trial_0d", false) ? a.NONE : y9.q.b0(str, "trial_3d", false) ? a.THREE_DAYS : y9.q.b0(str, "trial_7d", false) ? a.SEVEN_DAYS : y9.q.b0(str, "trial_30d", false) ? a.THIRTY_DAYS : a.NONE;
    }

    public static b b(String str) {
        return y9.n.T(str, "_onetime") ? b.NONE : y9.n.T(str, "_weekly") ? b.WEEKLY : y9.n.T(str, "_monthly") ? b.MONTHLY : y9.n.T(str, "_yearly") ? b.YEARLY : b.NONE;
    }
}
