package k8;

import android.content.Context;
import com.ubnt.usurvey.R;
import java.text.NumberFormat;
import java.util.Locale;
import k8.AbstractC6404d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: k8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6404d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f51302a = new a(null);

    /* renamed from: k8.d$a */
    public static final class a {

        /* renamed from: k8.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1897a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51303a;

            static {
                int[] iArr = new int[T7.c.values().length];
                try {
                    iArr[T7.c.METRIC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[T7.c.IMPERIAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f51303a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6404d a(double d10, T7.c system) {
            AbstractC6492s.i(system, "system");
            int i10 = C1897a.f51303a[system.ordinal()];
            if (i10 == 1) {
                if (d10 < 1000.0d) {
                    return new c.b(d10, 0, null, null, 14, null);
                }
                return new c.a(d10, 0, null, null, 14, null);
            }
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (d10 < 1609.34d) {
                return new b.a(d10, 0, null, null, 14, null);
            }
            return new b.C1898b(d10, 0, null, null, 14, null);
        }

        public final AbstractC6404d b(double d10, T7.c system) {
            AbstractC6492s.i(system, "system");
            int i10 = C1897a.f51303a[system.ordinal()];
            if (i10 == 1) {
                return new c.a(d10, 0, null, null, 14, null);
            }
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new b.C1898b(d10, 0, null, null, 14, null);
        }

        private a() {
        }
    }

    /* renamed from: k8.d$b */
    public static abstract class b extends AbstractC6404d {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }

        /* renamed from: k8.d$b$a */
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            private final double f51304b;

            /* renamed from: c, reason: collision with root package name */
            private final int f51305c;

            /* renamed from: d, reason: collision with root package name */
            private final InterfaceC6835l f51306d;

            /* renamed from: e, reason: collision with root package name */
            private final NumberFormat f51307e;

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ a(double d10, int i10, InterfaceC6835l interfaceC6835l, NumberFormat numberFormat, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                int i12 = (i11 & 2) != 0 ? R.string.unit_distance_feat : i10;
                InterfaceC6835l interfaceC6835l2 = (i11 & 4) != 0 ? new InterfaceC6835l() { // from class: k8.e
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return Double.valueOf(AbstractC6404d.b.a.k(((Double) obj).doubleValue()));
                    }
                } : interfaceC6835l;
                if ((i11 & 8) != 0) {
                    numberFormat = NumberFormat.getInstance(Locale.US);
                    numberFormat.setMinimumFractionDigits(0);
                    numberFormat.setMaximumFractionDigits(0);
                }
                this(d10, i12, interfaceC6835l2, numberFormat);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final double k(double d10) {
                return d10 * 3.2808d;
            }

            @Override // k8.AbstractC6404d
            public NumberFormat e() {
                return this.f51307e;
            }

            @Override // k8.AbstractC6404d
            protected InterfaceC6835l f() {
                return this.f51306d;
            }

            @Override // k8.AbstractC6404d
            public double g() {
                return this.f51304b;
            }

            @Override // k8.AbstractC6404d
            public int h() {
                return this.f51305c;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(double d10, int i10, InterfaceC6835l fromMeters, NumberFormat defaultNumberFormat) {
                super(null);
                AbstractC6492s.i(fromMeters, "fromMeters");
                AbstractC6492s.i(defaultNumberFormat, "defaultNumberFormat");
                this.f51304b = d10;
                this.f51305c = i10;
                this.f51306d = fromMeters;
                this.f51307e = defaultNumberFormat;
            }
        }

        /* renamed from: k8.d$b$b, reason: collision with other inner class name */
        public static final class C1898b extends b {

            /* renamed from: b, reason: collision with root package name */
            private final double f51308b;

            /* renamed from: c, reason: collision with root package name */
            private final int f51309c;

            /* renamed from: d, reason: collision with root package name */
            private final InterfaceC6835l f51310d;

            /* renamed from: e, reason: collision with root package name */
            private final NumberFormat f51311e;

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ C1898b(double d10, int i10, InterfaceC6835l interfaceC6835l, NumberFormat numberFormat, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                int i12 = (i11 & 2) != 0 ? R.string.unit_distance_mile : i10;
                InterfaceC6835l interfaceC6835l2 = (i11 & 4) != 0 ? new InterfaceC6835l() { // from class: k8.f
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return Double.valueOf(AbstractC6404d.b.C1898b.k(((Double) obj).doubleValue()));
                    }
                } : interfaceC6835l;
                if ((i11 & 8) != 0) {
                    numberFormat = NumberFormat.getInstance(Locale.US);
                    numberFormat.setMinimumFractionDigits(0);
                    numberFormat.setMaximumFractionDigits(2);
                }
                this(d10, i12, interfaceC6835l2, numberFormat);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final double k(double d10) {
                return d10 * 6.21371E-4d;
            }

            @Override // k8.AbstractC6404d
            public NumberFormat e() {
                return this.f51311e;
            }

            @Override // k8.AbstractC6404d
            protected InterfaceC6835l f() {
                return this.f51310d;
            }

            @Override // k8.AbstractC6404d
            public double g() {
                return this.f51308b;
            }

            @Override // k8.AbstractC6404d
            public int h() {
                return this.f51309c;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1898b(double d10, int i10, InterfaceC6835l fromMeters, NumberFormat defaultNumberFormat) {
                super(null);
                AbstractC6492s.i(fromMeters, "fromMeters");
                AbstractC6492s.i(defaultNumberFormat, "defaultNumberFormat");
                this.f51308b = d10;
                this.f51309c = i10;
                this.f51310d = fromMeters;
                this.f51311e = defaultNumberFormat;
            }
        }
    }

    /* renamed from: k8.d$c */
    public static abstract class c extends AbstractC6404d {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
            super(null);
        }

        /* renamed from: k8.d$c$a */
        public static final class a extends c {

            /* renamed from: b, reason: collision with root package name */
            private final double f51312b;

            /* renamed from: c, reason: collision with root package name */
            private final int f51313c;

            /* renamed from: d, reason: collision with root package name */
            private final InterfaceC6835l f51314d;

            /* renamed from: e, reason: collision with root package name */
            private final NumberFormat f51315e;

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ a(double d10, int i10, InterfaceC6835l interfaceC6835l, NumberFormat numberFormat, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                int i12 = (i11 & 2) != 0 ? R.string.unit_distance_km : i10;
                InterfaceC6835l interfaceC6835l2 = (i11 & 4) != 0 ? new InterfaceC6835l() { // from class: k8.g
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return Double.valueOf(AbstractC6404d.c.a.k(((Double) obj).doubleValue()));
                    }
                } : interfaceC6835l;
                if ((i11 & 8) != 0) {
                    numberFormat = NumberFormat.getInstance(Locale.US);
                    numberFormat.setMinimumFractionDigits(0);
                    numberFormat.setMaximumFractionDigits(2);
                }
                this(d10, i12, interfaceC6835l2, numberFormat);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final double k(double d10) {
                return d10 * 0.001d;
            }

            @Override // k8.AbstractC6404d
            public NumberFormat e() {
                return this.f51315e;
            }

            @Override // k8.AbstractC6404d
            protected InterfaceC6835l f() {
                return this.f51314d;
            }

            @Override // k8.AbstractC6404d
            public double g() {
                return this.f51312b;
            }

            @Override // k8.AbstractC6404d
            public int h() {
                return this.f51313c;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(double d10, int i10, InterfaceC6835l fromMeters, NumberFormat defaultNumberFormat) {
                super(null);
                AbstractC6492s.i(fromMeters, "fromMeters");
                AbstractC6492s.i(defaultNumberFormat, "defaultNumberFormat");
                this.f51312b = d10;
                this.f51313c = i10;
                this.f51314d = fromMeters;
                this.f51315e = defaultNumberFormat;
            }
        }

        /* renamed from: k8.d$c$b */
        public static final class b extends c {

            /* renamed from: b, reason: collision with root package name */
            private final double f51316b;

            /* renamed from: c, reason: collision with root package name */
            private final int f51317c;

            /* renamed from: d, reason: collision with root package name */
            private final InterfaceC6835l f51318d;

            /* renamed from: e, reason: collision with root package name */
            private final NumberFormat f51319e;

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ b(double d10, int i10, InterfaceC6835l interfaceC6835l, NumberFormat numberFormat, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                int i12 = (i11 & 2) != 0 ? R.string.unit_distance_m : i10;
                InterfaceC6835l interfaceC6835l2 = (i11 & 4) != 0 ? new InterfaceC6835l() { // from class: k8.h
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return Double.valueOf(AbstractC6404d.c.b.k(((Double) obj).doubleValue()));
                    }
                } : interfaceC6835l;
                if ((i11 & 8) != 0) {
                    numberFormat = NumberFormat.getInstance(Locale.US);
                    numberFormat.setMinimumFractionDigits(0);
                    numberFormat.setMaximumFractionDigits(0);
                }
                this(d10, i12, interfaceC6835l2, numberFormat);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final double k(double d10) {
                return d10;
            }

            @Override // k8.AbstractC6404d
            public NumberFormat e() {
                return this.f51319e;
            }

            @Override // k8.AbstractC6404d
            protected InterfaceC6835l f() {
                return this.f51318d;
            }

            @Override // k8.AbstractC6404d
            public double g() {
                return this.f51316b;
            }

            @Override // k8.AbstractC6404d
            public int h() {
                return this.f51317c;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(double d10, int i10, InterfaceC6835l fromMeters, NumberFormat defaultNumberFormat) {
                super(null);
                AbstractC6492s.i(fromMeters, "fromMeters");
                AbstractC6492s.i(defaultNumberFormat, "defaultNumberFormat");
                this.f51316b = d10;
                this.f51317c = i10;
                this.f51318d = fromMeters;
                this.f51319e = defaultNumberFormat;
            }
        }
    }

    public /* synthetic */ AbstractC6404d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String c(AbstractC6404d abstractC6404d, Context context, boolean z10, boolean z11, InterfaceC6835l interfaceC6835l, NumberFormat numberFormat, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
        boolean z12 = (i10 & 2) != 0 ? true : z10;
        boolean z13 = (i10 & 4) != 0 ? true : z11;
        if ((i10 & 8) != 0) {
            interfaceC6835l = new InterfaceC6835l() { // from class: k8.c
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj2) {
                    return Double.valueOf(AbstractC6404d.d(((Double) obj2).doubleValue()));
                }
            };
        }
        InterfaceC6835l interfaceC6835l2 = interfaceC6835l;
        if ((i10 & 16) != 0) {
            numberFormat = abstractC6404d.e();
        }
        return abstractC6404d.b(context, z12, z13, interfaceC6835l2, numberFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d10) {
        return d10;
    }

    public final String b(Context context, boolean z10, boolean z11, InterfaceC6835l valueMapper, NumberFormat numberFormat) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(valueMapper, "valueMapper");
        AbstractC6492s.i(numberFormat, "numberFormat");
        return numberFormat.format(((Number) valueMapper.invoke(Double.valueOf(i()))).doubleValue()) + ((z10 && z11) ? " " : "") + (z10 ? context.getString(h()) : "");
    }

    public abstract NumberFormat e();

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC6404d) && ((AbstractC6404d) obj).g() == g();
    }

    protected abstract InterfaceC6835l f();

    public abstract double g();

    public abstract int h();

    public int hashCode() {
        return Double.hashCode(g());
    }

    public final double i() {
        return ((Number) f().invoke(Double.valueOf(g()))).doubleValue();
    }

    private AbstractC6404d() {
    }
}
