package P7;

/* compiled from: PhAdError.kt */
/* loaded from: classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f10796a;

    /* compiled from: PhAdError.kt */
    public static final class a extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10797b = new a("App is in Background");
    }

    /* compiled from: PhAdError.kt */
    public static final class b extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final b f10798b = new b("Forbidden by AdFraud");
    }

    /* compiled from: PhAdError.kt */
    public static final class c extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final c f10799b = new c("Fullscreen Ad Already In Progress");
    }

    /* compiled from: PhAdError.kt */
    public static final class d extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final d f10800b = new d("Fullscreen Ad Not Ready");
    }

    /* compiled from: PhAdError.kt */
    public static final class e extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final e f10801b = new e("Internal Timeout");
    }

    /* compiled from: PhAdError.kt */
    public static final class f extends t {

        /* renamed from: b, reason: collision with root package name */
        public final String f10802b;

        public f(String str) {
            super(str == null ? "Internal Unknown" : str);
            this.f10802b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.l.b(this.f10802b, ((f) obj).f10802b);
        }

        public final int hashCode() {
            String str = this.f10802b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return B4.f.c(new StringBuilder("InternalUnknown(error="), this.f10802b, ")");
        }
    }

    /* compiled from: PhAdError.kt */
    public static final class g extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final g f10803b = new g("Invalid Request");
    }

    /* compiled from: PhAdError.kt */
    public static final class h extends t {

        /* renamed from: b, reason: collision with root package name */
        public final String f10804b;

        public h(String str) {
            super(str == null ? "Failed to load AD" : str);
            this.f10804b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && kotlin.jvm.internal.l.b(this.f10804b, ((h) obj).f10804b);
        }

        public final int hashCode() {
            String str = this.f10804b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return B4.f.c(new StringBuilder("LoadAdError(error="), this.f10804b, ")");
        }
    }

    /* compiled from: PhAdError.kt */
    public static final class i extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final i f10805b = new i("Network Error");
    }

    /* compiled from: PhAdError.kt */
    public static final class j extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final j f10806b = new j("Network Timeout");
    }

    /* compiled from: PhAdError.kt */
    public static final class k extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final k f10807b = new k("No Background Threshold Time Passed");
    }

    /* compiled from: PhAdError.kt */
    public static final class l extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final l f10808b = new l("No Capping Time Passed");
    }

    /* compiled from: PhAdError.kt */
    public static final class m extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final m f10809b = new m("No Fill");
    }

    /* compiled from: PhAdError.kt */
    public static final class n extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final n f10810b = new n("No Network");
    }

    /* compiled from: PhAdError.kt */
    public static final class o extends t {

        /* renamed from: b, reason: collision with root package name */
        public final int f10811b;

        public o(int i) {
            super(String.valueOf(i));
            this.f10811b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f10811b == ((o) obj).f10811b;
        }

        public final int hashCode() {
            return this.f10811b;
        }

        public final String toString() {
            return B4.i.j(new StringBuilder("Unknown(errorCode="), this.f10811b, ")");
        }
    }

    /* compiled from: PhAdError.kt */
    public static final class p extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final p f10812b = new p("Unspecified");
    }

    /* compiled from: PhAdError.kt */
    public static final class q extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final q f10813b = new q("User is Premium");
    }

    public t(String str) {
        this.f10796a = str;
    }
}
