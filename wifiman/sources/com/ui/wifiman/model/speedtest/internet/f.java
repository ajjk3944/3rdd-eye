package com.ui.wifiman.model.speedtest.internet;

import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.s;

/* loaded from: classes4.dex */
public final class f extends Speedtest.d {

    /* renamed from: n, reason: collision with root package name */
    public static final a f43086n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InternetSpeedtest.a f43087a;

    /* renamed from: b, reason: collision with root package name */
    private final Speedtest.f f43088b;

    /* renamed from: c, reason: collision with root package name */
    private final Speedtest.f f43089c;

    /* renamed from: d, reason: collision with root package name */
    private final Speedtest.f f43090d;

    /* renamed from: e, reason: collision with root package name */
    private final Speedtest.f f43091e;

    /* renamed from: f, reason: collision with root package name */
    private final Speedtest.f f43092f;

    /* renamed from: g, reason: collision with root package name */
    private final Speedtest.f f43093g;

    /* renamed from: h, reason: collision with root package name */
    private final Speedtest.f f43094h;

    /* renamed from: i, reason: collision with root package name */
    private final Speedtest.f f43095i;

    /* renamed from: j, reason: collision with root package name */
    private final Speedtest.f f43096j;

    /* renamed from: k, reason: collision with root package name */
    private final Speedtest.f f43097k;

    /* renamed from: l, reason: collision with root package name */
    private final Speedtest.f f43098l;

    /* renamed from: m, reason: collision with root package name */
    private final s f43099m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InternetSpeedtest.a params, boolean z10, boolean z11) {
            AbstractC6492s.i(params, "params");
            return new f(params, new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), z10 ? new Speedtest.f.b() : new Speedtest.f.a.b(), z10 ? new Speedtest.f.b() : new Speedtest.f.a.b(), z11 ? new Speedtest.f.b() : new Speedtest.f.a.b(), z11 ? new Speedtest.f.b() : new Speedtest.f.a.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b());
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b TOKEN_FETCH = new b("TOKEN_FETCH", 0);
        public static final b SERVER_FETCH = new b("SERVER_FETCH", 1);
        public static final b SERVER_EVALUATION = new b("SERVER_EVALUATION", 2);
        public static final b SERVER_WAKEUP = new b("SERVER_WAKEUP", 3);
        public static final b DOWNLOAD_INTERNET_SETUP = new b("DOWNLOAD_INTERNET_SETUP", 4);
        public static final b DOWNLOAD_INTERNET = new b("DOWNLOAD_INTERNET", 5);
        public static final b UPLOAD_INTERNET_SETUP = new b("UPLOAD_INTERNET_SETUP", 6);
        public static final b UPLOAD_INTERNET = new b("UPLOAD_INTERNET", 7);
        public static final b RESULT_SAVE = new b("RESULT_SAVE", 8);
        public static final b RESULT_REPORT = new b("RESULT_REPORT", 9);
        public static final b RESULT_UPDATE_WITH_REPORT = new b("RESULT_UPDATE_WITH_REPORT", 10);
        public static final b END = new b("END", 11);

        private static final /* synthetic */ b[] $values() {
            return new b[]{TOKEN_FETCH, SERVER_FETCH, SERVER_EVALUATION, SERVER_WAKEUP, DOWNLOAD_INTERNET_SETUP, DOWNLOAD_INTERNET, UPLOAD_INTERNET_SETUP, UPLOAD_INTERNET, RESULT_SAVE, RESULT_REPORT, RESULT_UPDATE_WITH_REPORT, END};
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
        public static final /* synthetic */ int[] f43100a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.TOKEN_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SERVER_FETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.SERVER_EVALUATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SERVER_WAKEUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.DOWNLOAD_INTERNET_SETUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.DOWNLOAD_INTERNET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.UPLOAD_INTERNET_SETUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.UPLOAD_INTERNET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.RESULT_SAVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.RESULT_REPORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.END.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f43100a = iArr;
        }
    }

    public f(InternetSpeedtest.a params, Speedtest.f tokenFetch, Speedtest.f serverWakeup, Speedtest.f serverFetch, Speedtest.f serverEvaluation, Speedtest.f downloadInitialization, Speedtest.f download, Speedtest.f uploadInitialization, Speedtest.f upload, Speedtest.f result, Speedtest.f resultReported, Speedtest.f resultReportStored) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(tokenFetch, "tokenFetch");
        AbstractC6492s.i(serverWakeup, "serverWakeup");
        AbstractC6492s.i(serverFetch, "serverFetch");
        AbstractC6492s.i(serverEvaluation, "serverEvaluation");
        AbstractC6492s.i(downloadInitialization, "downloadInitialization");
        AbstractC6492s.i(download, "download");
        AbstractC6492s.i(uploadInitialization, "uploadInitialization");
        AbstractC6492s.i(upload, "upload");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(resultReported, "resultReported");
        AbstractC6492s.i(resultReportStored, "resultReportStored");
        this.f43087a = params;
        this.f43088b = tokenFetch;
        this.f43089c = serverWakeup;
        this.f43090d = serverFetch;
        this.f43091e = serverEvaluation;
        this.f43092f = downloadInitialization;
        this.f43093g = download;
        this.f43094h = uploadInitialization;
        this.f43095i = upload;
        this.f43096j = result;
        this.f43097k = resultReported;
        this.f43098l = resultReportStored;
        this.f43099m = s.INTERNET;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f a() {
        return this.f43093g;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.Error b() {
        Throwable thC;
        Speedtest.f fVar = this.f43088b;
        if (fVar instanceof Speedtest.f.a.C1417a) {
            thC = ((Speedtest.f.a.C1417a) fVar).c();
        } else {
            Speedtest.f fVar2 = this.f43090d;
            if (fVar2 instanceof Speedtest.f.a.C1417a) {
                thC = ((Speedtest.f.a.C1417a) fVar2).c();
            } else {
                Speedtest.f fVar3 = this.f43089c;
                if (fVar3 instanceof Speedtest.f.a.C1417a) {
                    thC = ((Speedtest.f.a.C1417a) fVar3).c();
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
                    Speedtest.f fVar4 = this.f43097k;
                    if (fVar4 instanceof Speedtest.f.a.C1417a) {
                        thC = ((Speedtest.f.a.C1417a) fVar4).c();
                    } else {
                        Speedtest.f fVar5 = this.f43098l;
                        thC = fVar5 instanceof Speedtest.f.a.C1417a ? ((Speedtest.f.a.C1417a) fVar5).c() : null;
                    }
                }
            }
        }
        if (thC == null) {
            return null;
        }
        if (thC instanceof Speedtest.Error) {
            return (Speedtest.Error) thC;
        }
        return thC instanceof InternetSpeedtest.Error.NoServerAvailable ? new Speedtest.Error.NetworkConnection(thC) : new Speedtest.Error.Unexpected(thC);
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public boolean c() {
        return l() == b.END || b() != null;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f d() {
        Speedtest.f c1417a;
        Speedtest.f fVar = this.f43091e;
        if (fVar instanceof Speedtest.f.b) {
            return new Speedtest.f.b();
        }
        if (fVar instanceof Speedtest.f.c) {
            return new Speedtest.f.c(null);
        }
        if (fVar instanceof Speedtest.f.a.c) {
            Integer numL = ((InternetSpeedtest.b.C1420b) ((Speedtest.f.a.c) fVar).c()).l();
            if (numL == null) {
                return new Speedtest.f.a.b();
            }
            c1417a = new Speedtest.f.a.c(Integer.valueOf(numL.intValue()));
        } else {
            if (!(fVar instanceof Speedtest.f.a.C1417a)) {
                if (fVar instanceof Speedtest.f.a.b) {
                    return new Speedtest.f.a.b();
                }
                throw new NoWhenBranchMatchedException();
            }
            c1417a = new Speedtest.f.a.C1417a(((Speedtest.f.a.C1417a) fVar).c());
        }
        return c1417a;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f e() {
        Speedtest.f c1417a;
        Speedtest.f fVar = this.f43091e;
        if (fVar instanceof Speedtest.f.b) {
            return new Speedtest.f.b();
        }
        if (fVar instanceof Speedtest.f.c) {
            return new Speedtest.f.c(null);
        }
        if (fVar instanceof Speedtest.f.a.c) {
            Integer numB = ((InternetSpeedtest.b.C1420b) ((Speedtest.f.a.c) fVar).c()).b();
            if (numB == null) {
                return new Speedtest.f.a.b();
            }
            c1417a = new Speedtest.f.a.c(Integer.valueOf(numB.intValue()));
        } else {
            if (!(fVar instanceof Speedtest.f.a.C1417a)) {
                if (fVar instanceof Speedtest.f.a.b) {
                    return new Speedtest.f.a.b();
                }
                throw new NoWhenBranchMatchedException();
            }
            c1417a = new Speedtest.f.a.C1417a(((Speedtest.f.a.C1417a) fVar).c());
        }
        return c1417a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC6492s.d(this.f43087a, fVar.f43087a) && AbstractC6492s.d(this.f43088b, fVar.f43088b) && AbstractC6492s.d(this.f43089c, fVar.f43089c) && AbstractC6492s.d(this.f43090d, fVar.f43090d) && AbstractC6492s.d(this.f43091e, fVar.f43091e) && AbstractC6492s.d(this.f43092f, fVar.f43092f) && AbstractC6492s.d(this.f43093g, fVar.f43093g) && AbstractC6492s.d(this.f43094h, fVar.f43094h) && AbstractC6492s.d(this.f43095i, fVar.f43095i) && AbstractC6492s.d(this.f43096j, fVar.f43096j) && AbstractC6492s.d(this.f43097k, fVar.f43097k) && AbstractC6492s.d(this.f43098l, fVar.f43098l);
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f f() {
        return this.f43096j;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f g() {
        if (!(f() instanceof Speedtest.f.a.c) || !(this.f43097k instanceof Speedtest.f.a.c) || !(this.f43098l instanceof Speedtest.f.a.c)) {
            return new Speedtest.f.b();
        }
        return new Speedtest.f.a.c(new Speedtest.c(((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).f(), ((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).c(), ((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).i()));
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.e h() {
        switch (c.f43100a[l().ordinal()]) {
            case 1:
                return Speedtest.e.SETUP;
            case 2:
            case 3:
            case 4:
                return Speedtest.e.LATENCY_CHECK;
            case 5:
                return Speedtest.e.DOWNLOAD_INIT;
            case 6:
                return Speedtest.e.DOWNLOAD;
            case 7:
                return Speedtest.e.UPLOAD_INIT;
            case 8:
                return Speedtest.e.UPLOAD;
            case 9:
            case 10:
            case 11:
                return Speedtest.e.RESULT_PROCESSING;
            case 12:
                return Speedtest.e.END;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f43087a.hashCode() * 31) + this.f43088b.hashCode()) * 31) + this.f43089c.hashCode()) * 31) + this.f43090d.hashCode()) * 31) + this.f43091e.hashCode()) * 31) + this.f43092f.hashCode()) * 31) + this.f43093g.hashCode()) * 31) + this.f43094h.hashCode()) * 31) + this.f43095i.hashCode()) * 31) + this.f43096j.hashCode()) * 31) + this.f43097k.hashCode()) * 31) + this.f43098l.hashCode();
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f i() {
        return this.f43095i;
    }

    public final f j(InternetSpeedtest.a params, Speedtest.f tokenFetch, Speedtest.f serverWakeup, Speedtest.f serverFetch, Speedtest.f serverEvaluation, Speedtest.f downloadInitialization, Speedtest.f download, Speedtest.f uploadInitialization, Speedtest.f upload, Speedtest.f result, Speedtest.f resultReported, Speedtest.f resultReportStored) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(tokenFetch, "tokenFetch");
        AbstractC6492s.i(serverWakeup, "serverWakeup");
        AbstractC6492s.i(serverFetch, "serverFetch");
        AbstractC6492s.i(serverEvaluation, "serverEvaluation");
        AbstractC6492s.i(downloadInitialization, "downloadInitialization");
        AbstractC6492s.i(download, "download");
        AbstractC6492s.i(uploadInitialization, "uploadInitialization");
        AbstractC6492s.i(upload, "upload");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(resultReported, "resultReported");
        AbstractC6492s.i(resultReportStored, "resultReportStored");
        return new f(params, tokenFetch, serverWakeup, serverFetch, serverEvaluation, downloadInitialization, download, uploadInitialization, upload, result, resultReported, resultReportStored);
    }

    public final b l() {
        return !this.f43088b.a() ? b.TOKEN_FETCH : !this.f43090d.a() ? b.SERVER_FETCH : !this.f43089c.a() ? b.SERVER_WAKEUP : !this.f43091e.a() ? b.SERVER_EVALUATION : !m().a() ? b.DOWNLOAD_INTERNET_SETUP : !a().a() ? b.DOWNLOAD_INTERNET : !q().a() ? b.UPLOAD_INTERNET_SETUP : !i().a() ? b.UPLOAD_INTERNET : !f().a() ? b.RESULT_SAVE : !this.f43097k.a() ? b.RESULT_REPORT : !this.f43098l.a() ? b.RESULT_UPDATE_WITH_REPORT : b.END;
    }

    public Speedtest.f m() {
        return this.f43092f;
    }

    public final Speedtest.f n() {
        return this.f43097k;
    }

    public final Speedtest.f o() {
        return this.f43090d;
    }

    public final Speedtest.f p() {
        return this.f43088b;
    }

    public Speedtest.f q() {
        return this.f43094h;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public String toString() {
        return super.toString();
    }
}
