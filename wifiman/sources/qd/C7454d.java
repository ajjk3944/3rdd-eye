package qd;

import com.ui.wifiman.model.speedtest.Speedtest;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.s;
import qd.InterfaceC7451a;

/* renamed from: qd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7454d extends Speedtest.d {

    /* renamed from: m, reason: collision with root package name */
    public static final a f58641m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7451a.C2063a f58642a;

    /* renamed from: b, reason: collision with root package name */
    private final Speedtest.f f58643b;

    /* renamed from: c, reason: collision with root package name */
    private final Speedtest.f f58644c;

    /* renamed from: d, reason: collision with root package name */
    private final Speedtest.f f58645d;

    /* renamed from: e, reason: collision with root package name */
    private final Speedtest.f f58646e;

    /* renamed from: f, reason: collision with root package name */
    private final Speedtest.f f58647f;

    /* renamed from: g, reason: collision with root package name */
    private final Speedtest.f f58648g;

    /* renamed from: h, reason: collision with root package name */
    private final Speedtest.f f58649h;

    /* renamed from: i, reason: collision with root package name */
    private final Speedtest.f f58650i;

    /* renamed from: j, reason: collision with root package name */
    private final s f58651j;

    /* renamed from: k, reason: collision with root package name */
    private final Speedtest.f f58652k;

    /* renamed from: l, reason: collision with root package name */
    private final Speedtest.f f58653l;

    /* renamed from: qd.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7454d a(InterfaceC7451a.C2063a params) {
            AbstractC6492s.i(params, "params");
            return new C7454d(params, new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b());
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: qd.d$b */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b EVALUATION = new b("EVALUATION", 0);
        public static final b DOWNLOAD_SETUP = new b("DOWNLOAD_SETUP", 1);
        public static final b DOWNLOAD = new b("DOWNLOAD", 2);
        public static final b UPLOAD_SETUP = new b("UPLOAD_SETUP", 3);
        public static final b UPLOAD = new b("UPLOAD", 4);
        public static final b RESULT_SAVE = new b("RESULT_SAVE", 5);
        public static final b RESULT_REPORT = new b("RESULT_REPORT", 6);
        public static final b RESULT_UPDATE_WITH_REPORT = new b("RESULT_UPDATE_WITH_REPORT", 7);
        public static final b END = new b("END", 8);

        private static final /* synthetic */ b[] $values() {
            return new b[]{EVALUATION, DOWNLOAD_SETUP, DOWNLOAD, UPLOAD_SETUP, UPLOAD, RESULT_SAVE, RESULT_REPORT, RESULT_UPDATE_WITH_REPORT, END};
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

    /* renamed from: qd.d$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58654a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.EVALUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.DOWNLOAD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.UPLOAD_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.RESULT_SAVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.RESULT_REPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.END.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f58654a = iArr;
        }
    }

    public C7454d(InterfaceC7451a.C2063a params, Speedtest.f evaluation, Speedtest.f downloadInitialization, Speedtest.f download, Speedtest.f uploadInitialization, Speedtest.f upload, Speedtest.f result, Speedtest.f resultReported, Speedtest.f resultReportStored) {
        Speedtest.f bVar;
        Speedtest.f bVar2;
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(evaluation, "evaluation");
        AbstractC6492s.i(downloadInitialization, "downloadInitialization");
        AbstractC6492s.i(download, "download");
        AbstractC6492s.i(uploadInitialization, "uploadInitialization");
        AbstractC6492s.i(upload, "upload");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(resultReported, "resultReported");
        AbstractC6492s.i(resultReportStored, "resultReportStored");
        this.f58642a = params;
        this.f58643b = evaluation;
        this.f58644c = downloadInitialization;
        this.f58645d = download;
        this.f58646e = uploadInitialization;
        this.f58647f = upload;
        this.f58648g = result;
        this.f58649h = resultReported;
        this.f58650i = resultReportStored;
        this.f58651j = s.APP_TO_APP;
        if (evaluation instanceof Speedtest.f.b) {
            bVar = new Speedtest.f.b();
        } else if (evaluation instanceof Speedtest.f.c) {
            bVar = new Speedtest.f.c(null);
        } else if (evaluation instanceof Speedtest.f.a.c) {
            bVar = new Speedtest.f.a.c(Integer.valueOf(((InterfaceC7451a.b) ((Speedtest.f.a.c) evaluation).c()).b()));
        } else if (evaluation instanceof Speedtest.f.a.C1417a) {
            bVar = new Speedtest.f.a.C1417a(((Speedtest.f.a.C1417a) evaluation).c());
        } else {
            if (!(evaluation instanceof Speedtest.f.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new Speedtest.f.a.b();
        }
        this.f58652k = bVar;
        if (evaluation instanceof Speedtest.f.b) {
            bVar2 = new Speedtest.f.b();
        } else if (evaluation instanceof Speedtest.f.c) {
            bVar2 = new Speedtest.f.c(null);
        } else if (evaluation instanceof Speedtest.f.a.c) {
            bVar2 = new Speedtest.f.a.c(((InterfaceC7451a.b) ((Speedtest.f.a.c) evaluation).c()).a());
        } else if (evaluation instanceof Speedtest.f.a.C1417a) {
            bVar2 = new Speedtest.f.a.C1417a(((Speedtest.f.a.C1417a) evaluation).c());
        } else {
            if (!(evaluation instanceof Speedtest.f.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar2 = new Speedtest.f.a.b();
        }
        this.f58653l = bVar2;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f a() {
        return this.f58645d;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.Error b() {
        Throwable thC;
        Speedtest.f fVar = this.f58643b;
        if (fVar instanceof Speedtest.f.a.C1417a) {
            thC = ((Speedtest.f.a.C1417a) fVar).c();
        } else if (m() instanceof Speedtest.f.a.C1417a) {
            thC = ((Speedtest.f.a.C1417a) m()).c();
        } else if (a() instanceof Speedtest.f.a.C1417a) {
            thC = ((Speedtest.f.a.C1417a) a()).c();
        } else if (q() instanceof Speedtest.f.a.C1417a) {
            thC = ((Speedtest.f.a.C1417a) q()).c();
        } else if (i() instanceof Speedtest.f.a.C1417a) {
            thC = ((Speedtest.f.a.C1417a) i()).c();
        } else if (f() instanceof Speedtest.f.a.C1417a) {
            thC = ((Speedtest.f.a.C1417a) f()).c();
        } else {
            Speedtest.f fVar2 = this.f58649h;
            if (fVar2 instanceof Speedtest.f.a.C1417a) {
                thC = ((Speedtest.f.a.C1417a) fVar2).c();
            } else {
                Speedtest.f fVar3 = this.f58650i;
                thC = fVar3 instanceof Speedtest.f.a.C1417a ? ((Speedtest.f.a.C1417a) fVar3).c() : null;
            }
        }
        if (thC != null) {
            return thC instanceof Speedtest.Error ? (Speedtest.Error) thC : new Speedtest.Error.Unexpected(thC);
        }
        return null;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public boolean c() {
        return l() == b.END || b() != null;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f d() {
        return this.f58653l;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f e() {
        return this.f58652k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7454d)) {
            return false;
        }
        C7454d c7454d = (C7454d) obj;
        return AbstractC6492s.d(this.f58642a, c7454d.f58642a) && AbstractC6492s.d(this.f58643b, c7454d.f58643b) && AbstractC6492s.d(this.f58644c, c7454d.f58644c) && AbstractC6492s.d(this.f58645d, c7454d.f58645d) && AbstractC6492s.d(this.f58646e, c7454d.f58646e) && AbstractC6492s.d(this.f58647f, c7454d.f58647f) && AbstractC6492s.d(this.f58648g, c7454d.f58648g) && AbstractC6492s.d(this.f58649h, c7454d.f58649h) && AbstractC6492s.d(this.f58650i, c7454d.f58650i);
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f f() {
        return this.f58648g;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f g() {
        if (!(f() instanceof Speedtest.f.a.c) || !(this.f58649h instanceof Speedtest.f.a.c) || !(this.f58650i instanceof Speedtest.f.a.c)) {
            return new Speedtest.f.b();
        }
        return new Speedtest.f.a.c(new Speedtest.c(((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).f(), ((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).c(), ((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).i()));
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.e h() {
        switch (c.f58654a[l().ordinal()]) {
            case 1:
                return Speedtest.e.LATENCY_CHECK;
            case 2:
                return Speedtest.e.DOWNLOAD_INIT;
            case 3:
                return Speedtest.e.DOWNLOAD;
            case 4:
                return Speedtest.e.UPLOAD_INIT;
            case 5:
                return Speedtest.e.UPLOAD;
            case 6:
            case 7:
            case 8:
                return Speedtest.e.RESULT_PROCESSING;
            case 9:
                return Speedtest.e.END;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public int hashCode() {
        return (((((((((((((((this.f58642a.hashCode() * 31) + this.f58643b.hashCode()) * 31) + this.f58644c.hashCode()) * 31) + this.f58645d.hashCode()) * 31) + this.f58646e.hashCode()) * 31) + this.f58647f.hashCode()) * 31) + this.f58648g.hashCode()) * 31) + this.f58649h.hashCode()) * 31) + this.f58650i.hashCode();
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f i() {
        return this.f58647f;
    }

    public final C7454d j(InterfaceC7451a.C2063a params, Speedtest.f evaluation, Speedtest.f downloadInitialization, Speedtest.f download, Speedtest.f uploadInitialization, Speedtest.f upload, Speedtest.f result, Speedtest.f resultReported, Speedtest.f resultReportStored) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(evaluation, "evaluation");
        AbstractC6492s.i(downloadInitialization, "downloadInitialization");
        AbstractC6492s.i(download, "download");
        AbstractC6492s.i(uploadInitialization, "uploadInitialization");
        AbstractC6492s.i(upload, "upload");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(resultReported, "resultReported");
        AbstractC6492s.i(resultReportStored, "resultReportStored");
        return new C7454d(params, evaluation, downloadInitialization, download, uploadInitialization, upload, result, resultReported, resultReportStored);
    }

    public final b l() {
        return !this.f58643b.a() ? b.EVALUATION : !m().a() ? b.DOWNLOAD_SETUP : !a().a() ? b.DOWNLOAD : !q().a() ? b.UPLOAD_SETUP : !i().a() ? b.UPLOAD : !f().a() ? b.RESULT_SAVE : !this.f58649h.a() ? b.RESULT_REPORT : !this.f58650i.a() ? b.RESULT_UPDATE_WITH_REPORT : b.END;
    }

    public Speedtest.f m() {
        return this.f58644c;
    }

    public final Speedtest.f n() {
        return this.f58643b;
    }

    public final InterfaceC7451a.C2063a o() {
        return this.f58642a;
    }

    public final Speedtest.f p() {
        return this.f58649h;
    }

    public Speedtest.f q() {
        return this.f58646e;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public String toString() {
        return super.toString();
    }
}
