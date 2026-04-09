package Cd;

import Cd.j;
import com.ui.wifiman.model.speedtest.Speedtest;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.s;

/* loaded from: classes4.dex */
public final class n extends Speedtest.d {

    /* renamed from: m, reason: collision with root package name */
    public static final a f2635m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final j.c f2636a;

    /* renamed from: b, reason: collision with root package name */
    private final Speedtest.f f2637b;

    /* renamed from: c, reason: collision with root package name */
    private final Speedtest.f f2638c;

    /* renamed from: d, reason: collision with root package name */
    private final Speedtest.f f2639d;

    /* renamed from: e, reason: collision with root package name */
    private final Speedtest.f f2640e;

    /* renamed from: f, reason: collision with root package name */
    private final Speedtest.f f2641f;

    /* renamed from: g, reason: collision with root package name */
    private final Speedtest.f f2642g;

    /* renamed from: h, reason: collision with root package name */
    private final Speedtest.f f2643h;

    /* renamed from: i, reason: collision with root package name */
    private final Speedtest.f f2644i;

    /* renamed from: j, reason: collision with root package name */
    private final s f2645j;

    /* renamed from: k, reason: collision with root package name */
    private final Speedtest.f f2646k;

    /* renamed from: l, reason: collision with root package name */
    private final Speedtest.f f2647l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(j.c params) {
            AbstractC6492s.i(params, "params");
            return new n(params, new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b());
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2648a;

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
            f2648a = iArr;
        }
    }

    public n(j.c params, Speedtest.f evaluation, Speedtest.f downloadInitialization, Speedtest.f download, Speedtest.f uploadInitialization, Speedtest.f upload, Speedtest.f result, Speedtest.f resultReported, Speedtest.f resultReportStored) {
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
        this.f2636a = params;
        this.f2637b = evaluation;
        this.f2638c = downloadInitialization;
        this.f2639d = download;
        this.f2640e = uploadInitialization;
        this.f2641f = upload;
        this.f2642g = result;
        this.f2643h = resultReported;
        this.f2644i = resultReportStored;
        this.f2645j = s.LOCAL;
        if (evaluation instanceof Speedtest.f.b) {
            bVar = new Speedtest.f.b();
        } else if (evaluation instanceof Speedtest.f.c) {
            bVar = new Speedtest.f.c(null);
        } else if (evaluation instanceof Speedtest.f.a.c) {
            bVar = new Speedtest.f.a.c(Integer.valueOf(((j.d) ((Speedtest.f.a.c) evaluation).c()).b()));
        } else if (evaluation instanceof Speedtest.f.a.C1417a) {
            bVar = new Speedtest.f.a.C1417a(((Speedtest.f.a.C1417a) evaluation).c());
        } else {
            if (!(evaluation instanceof Speedtest.f.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new Speedtest.f.a.b();
        }
        this.f2646k = bVar;
        if (evaluation instanceof Speedtest.f.b) {
            bVar2 = new Speedtest.f.b();
        } else if (evaluation instanceof Speedtest.f.c) {
            bVar2 = new Speedtest.f.c(null);
        } else if (evaluation instanceof Speedtest.f.a.c) {
            bVar2 = new Speedtest.f.a.c(((j.d) ((Speedtest.f.a.c) evaluation).c()).a());
        } else if (evaluation instanceof Speedtest.f.a.C1417a) {
            bVar2 = new Speedtest.f.a.C1417a(((Speedtest.f.a.C1417a) evaluation).c());
        } else {
            if (!(evaluation instanceof Speedtest.f.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar2 = new Speedtest.f.a.b();
        }
        this.f2647l = bVar2;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f a() {
        return this.f2639d;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.Error b() {
        Throwable thC;
        Speedtest.f fVar = this.f2637b;
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
            Speedtest.f fVar2 = this.f2643h;
            if (fVar2 instanceof Speedtest.f.a.C1417a) {
                thC = ((Speedtest.f.a.C1417a) fVar2).c();
            } else {
                Speedtest.f fVar3 = this.f2644i;
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
        return this.f2647l;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f e() {
        return this.f2646k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC6492s.d(this.f2636a, nVar.f2636a) && AbstractC6492s.d(this.f2637b, nVar.f2637b) && AbstractC6492s.d(this.f2638c, nVar.f2638c) && AbstractC6492s.d(this.f2639d, nVar.f2639d) && AbstractC6492s.d(this.f2640e, nVar.f2640e) && AbstractC6492s.d(this.f2641f, nVar.f2641f) && AbstractC6492s.d(this.f2642g, nVar.f2642g) && AbstractC6492s.d(this.f2643h, nVar.f2643h) && AbstractC6492s.d(this.f2644i, nVar.f2644i);
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f f() {
        return this.f2642g;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f g() {
        if (!(f() instanceof Speedtest.f.a.c) || !(this.f2643h instanceof Speedtest.f.a.c) || !(this.f2644i instanceof Speedtest.f.a.c)) {
            return new Speedtest.f.b();
        }
        return new Speedtest.f.a.c(new Speedtest.c(((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).f(), ((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).c(), ((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).i()));
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.e h() {
        switch (c.f2648a[l().ordinal()]) {
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
        return (((((((((((((((this.f2636a.hashCode() * 31) + this.f2637b.hashCode()) * 31) + this.f2638c.hashCode()) * 31) + this.f2639d.hashCode()) * 31) + this.f2640e.hashCode()) * 31) + this.f2641f.hashCode()) * 31) + this.f2642g.hashCode()) * 31) + this.f2643h.hashCode()) * 31) + this.f2644i.hashCode();
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f i() {
        return this.f2641f;
    }

    public final n j(j.c params, Speedtest.f evaluation, Speedtest.f downloadInitialization, Speedtest.f download, Speedtest.f uploadInitialization, Speedtest.f upload, Speedtest.f result, Speedtest.f resultReported, Speedtest.f resultReportStored) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(evaluation, "evaluation");
        AbstractC6492s.i(downloadInitialization, "downloadInitialization");
        AbstractC6492s.i(download, "download");
        AbstractC6492s.i(uploadInitialization, "uploadInitialization");
        AbstractC6492s.i(upload, "upload");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(resultReported, "resultReported");
        AbstractC6492s.i(resultReportStored, "resultReportStored");
        return new n(params, evaluation, downloadInitialization, download, uploadInitialization, upload, result, resultReported, resultReportStored);
    }

    public final b l() {
        return !this.f2637b.a() ? b.EVALUATION : !m().a() ? b.DOWNLOAD_SETUP : !a().a() ? b.DOWNLOAD : !q().a() ? b.UPLOAD_SETUP : !i().a() ? b.UPLOAD : !f().a() ? b.RESULT_SAVE : !this.f2643h.a() ? b.RESULT_REPORT : !this.f2644i.a() ? b.RESULT_UPDATE_WITH_REPORT : b.END;
    }

    public Speedtest.f m() {
        return this.f2638c;
    }

    public final Speedtest.f n() {
        return this.f2637b;
    }

    public final j.c o() {
        return this.f2636a;
    }

    public final Speedtest.f p() {
        return this.f2643h;
    }

    public Speedtest.f q() {
        return this.f2640e;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public String toString() {
        return super.toString();
    }
}
