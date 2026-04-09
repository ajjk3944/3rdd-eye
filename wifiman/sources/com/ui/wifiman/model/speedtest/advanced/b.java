package com.ui.wifiman.model.speedtest.advanced;

import Vd.c;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.advanced.a;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.s;

/* loaded from: classes4.dex */
public final class b extends Speedtest.d {

    /* renamed from: r, reason: collision with root package name */
    public static final a f42921r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final a.C1418a f42922a;

    /* renamed from: b, reason: collision with root package name */
    private final c.a f42923b;

    /* renamed from: c, reason: collision with root package name */
    private final Speedtest.f f42924c;

    /* renamed from: d, reason: collision with root package name */
    private final Speedtest.f f42925d;

    /* renamed from: e, reason: collision with root package name */
    private final Speedtest.f f42926e;

    /* renamed from: f, reason: collision with root package name */
    private final Speedtest.f f42927f;

    /* renamed from: g, reason: collision with root package name */
    private final Speedtest.f f42928g;

    /* renamed from: h, reason: collision with root package name */
    private final Speedtest.f f42929h;

    /* renamed from: i, reason: collision with root package name */
    private final Speedtest.f f42930i;

    /* renamed from: j, reason: collision with root package name */
    private final Speedtest.f f42931j;

    /* renamed from: k, reason: collision with root package name */
    private final Speedtest.f f42932k;

    /* renamed from: l, reason: collision with root package name */
    private final Speedtest.f f42933l;

    /* renamed from: m, reason: collision with root package name */
    private final Speedtest.f f42934m;

    /* renamed from: n, reason: collision with root package name */
    private final Speedtest.f f42935n;

    /* renamed from: o, reason: collision with root package name */
    private final Speedtest.f f42936o;

    /* renamed from: p, reason: collision with root package name */
    private final Speedtest.f f42937p;

    /* renamed from: q, reason: collision with root package name */
    private final s f42938q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(a.C1418a params) {
            AbstractC6492s.i(params, "params");
            return new b(params, null, new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b(), new Speedtest.f.b());
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.ui.wifiman.model.speedtest.advanced.b$b, reason: collision with other inner class name */
    public static final class EnumC1419b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC1419b[] $VALUES;
        public static final EnumC1419b CONSOLE_LATENCY_CHECK = new EnumC1419b("CONSOLE_LATENCY_CHECK", 0);
        public static final EnumC1419b CONSOLE_DOWNLOAD_SETUP = new EnumC1419b("CONSOLE_DOWNLOAD_SETUP", 1);
        public static final EnumC1419b CONSOLE_DOWNLOAD = new EnumC1419b("CONSOLE_DOWNLOAD", 2);
        public static final EnumC1419b CONSOLE_UPLOAD_SETUP = new EnumC1419b("CONSOLE_UPLOAD_SETUP", 3);
        public static final EnumC1419b CONSOLE_UPLOAD = new EnumC1419b("CONSOLE_UPLOAD", 4);
        public static final EnumC1419b EVALUATION = new EnumC1419b("EVALUATION", 5);
        public static final EnumC1419b DOWNLOAD_SETUP = new EnumC1419b("DOWNLOAD_SETUP", 6);
        public static final EnumC1419b DOWNLOAD = new EnumC1419b("DOWNLOAD", 7);
        public static final EnumC1419b UPLOAD_SETUP = new EnumC1419b("UPLOAD_SETUP", 8);
        public static final EnumC1419b UPLOAD = new EnumC1419b("UPLOAD", 9);
        public static final EnumC1419b RESULT_SAVE = new EnumC1419b("RESULT_SAVE", 10);
        public static final EnumC1419b RESULT_REPORT = new EnumC1419b("RESULT_REPORT", 11);
        public static final EnumC1419b RESULT_UPDATE_WITH_REPORT = new EnumC1419b("RESULT_UPDATE_WITH_REPORT", 12);
        public static final EnumC1419b END = new EnumC1419b("END", 13);

        private static final /* synthetic */ EnumC1419b[] $values() {
            return new EnumC1419b[]{CONSOLE_LATENCY_CHECK, CONSOLE_DOWNLOAD_SETUP, CONSOLE_DOWNLOAD, CONSOLE_UPLOAD_SETUP, CONSOLE_UPLOAD, EVALUATION, DOWNLOAD_SETUP, DOWNLOAD, UPLOAD_SETUP, UPLOAD, RESULT_SAVE, RESULT_REPORT, RESULT_UPDATE_WITH_REPORT, END};
        }

        static {
            EnumC1419b[] enumC1419bArr$values = $values();
            $VALUES = enumC1419bArr$values;
            $ENTRIES = AbstractC5827b.a(enumC1419bArr$values);
        }

        private EnumC1419b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1419b valueOf(String str) {
            return (EnumC1419b) Enum.valueOf(EnumC1419b.class, str);
        }

        public static EnumC1419b[] values() {
            return (EnumC1419b[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42939a;

        static {
            int[] iArr = new int[EnumC1419b.values().length];
            try {
                iArr[EnumC1419b.CONSOLE_LATENCY_CHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1419b.CONSOLE_DOWNLOAD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1419b.CONSOLE_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1419b.CONSOLE_UPLOAD_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1419b.CONSOLE_UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC1419b.EVALUATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC1419b.DOWNLOAD_SETUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC1419b.DOWNLOAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC1419b.UPLOAD_SETUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC1419b.UPLOAD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC1419b.RESULT_SAVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC1419b.RESULT_REPORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC1419b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC1419b.END.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f42939a = iArr;
        }
    }

    public b(a.C1418a params, c.a aVar, Speedtest.f consoleLatencyCheck, Speedtest.f consoleJitterCheck, Speedtest.f consoleDownloadInitialization, Speedtest.f consoleDownload, Speedtest.f consoleUploadInitialization, Speedtest.f consoleUpload, Speedtest.f evaluation, Speedtest.f downloadInitialization, Speedtest.f download, Speedtest.f uploadInitialization, Speedtest.f upload, Speedtest.f result, Speedtest.f resultReported, Speedtest.f resultReportStored) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(consoleLatencyCheck, "consoleLatencyCheck");
        AbstractC6492s.i(consoleJitterCheck, "consoleJitterCheck");
        AbstractC6492s.i(consoleDownloadInitialization, "consoleDownloadInitialization");
        AbstractC6492s.i(consoleDownload, "consoleDownload");
        AbstractC6492s.i(consoleUploadInitialization, "consoleUploadInitialization");
        AbstractC6492s.i(consoleUpload, "consoleUpload");
        AbstractC6492s.i(evaluation, "evaluation");
        AbstractC6492s.i(downloadInitialization, "downloadInitialization");
        AbstractC6492s.i(download, "download");
        AbstractC6492s.i(uploadInitialization, "uploadInitialization");
        AbstractC6492s.i(upload, "upload");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(resultReported, "resultReported");
        AbstractC6492s.i(resultReportStored, "resultReportStored");
        this.f42922a = params;
        this.f42923b = aVar;
        this.f42924c = consoleLatencyCheck;
        this.f42925d = consoleJitterCheck;
        this.f42926e = consoleDownloadInitialization;
        this.f42927f = consoleDownload;
        this.f42928g = consoleUploadInitialization;
        this.f42929h = consoleUpload;
        this.f42930i = evaluation;
        this.f42931j = downloadInitialization;
        this.f42932k = download;
        this.f42933l = uploadInitialization;
        this.f42934m = upload;
        this.f42935n = result;
        this.f42936o = resultReported;
        this.f42937p = resultReportStored;
        this.f42938q = s.LOCAL;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f a() {
        return this.f42932k;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.Error b() {
        Throwable thC;
        Speedtest.f fVar = this.f42924c;
        if (fVar instanceof Speedtest.f.a.C1417a) {
            thC = ((Speedtest.f.a.C1417a) fVar).c();
        } else {
            Speedtest.f fVar2 = this.f42927f;
            if (fVar2 instanceof Speedtest.f.a.C1417a) {
                thC = ((Speedtest.f.a.C1417a) fVar2).c();
            } else {
                Speedtest.f fVar3 = this.f42926e;
                if (fVar3 instanceof Speedtest.f.a.C1417a) {
                    thC = ((Speedtest.f.a.C1417a) fVar3).c();
                } else {
                    Speedtest.f fVar4 = this.f42929h;
                    if (fVar4 instanceof Speedtest.f.a.C1417a) {
                        thC = ((Speedtest.f.a.C1417a) fVar4).c();
                    } else {
                        Speedtest.f fVar5 = this.f42928g;
                        if (fVar5 instanceof Speedtest.f.a.C1417a) {
                            thC = ((Speedtest.f.a.C1417a) fVar5).c();
                        } else {
                            Speedtest.f fVar6 = this.f42930i;
                            if (fVar6 instanceof Speedtest.f.a.C1417a) {
                                thC = ((Speedtest.f.a.C1417a) fVar6).c();
                            } else if (a() instanceof Speedtest.f.a.C1417a) {
                                thC = ((Speedtest.f.a.C1417a) a()).c();
                            } else if (x() instanceof Speedtest.f.a.C1417a) {
                                thC = ((Speedtest.f.a.C1417a) x()).c();
                            } else if (i() instanceof Speedtest.f.a.C1417a) {
                                thC = ((Speedtest.f.a.C1417a) i()).c();
                            } else if (f() instanceof Speedtest.f.a.C1417a) {
                                thC = ((Speedtest.f.a.C1417a) f()).c();
                            } else {
                                Speedtest.f fVar7 = this.f42936o;
                                if (fVar7 instanceof Speedtest.f.a.C1417a) {
                                    thC = ((Speedtest.f.a.C1417a) fVar7).c();
                                } else {
                                    Speedtest.f fVar8 = this.f42937p;
                                    thC = fVar8 instanceof Speedtest.f.a.C1417a ? ((Speedtest.f.a.C1417a) fVar8).c() : null;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (thC != null) {
            return thC instanceof IOException ? new Speedtest.Error.NetworkConnection(thC) : new Speedtest.Error.Unexpected(thC);
        }
        return null;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public boolean c() {
        return r() == EnumC1419b.END || b() != null;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f d() {
        return this.f42925d;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f e() {
        return this.f42924c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f42922a, bVar.f42922a) && AbstractC6492s.d(this.f42923b, bVar.f42923b) && AbstractC6492s.d(this.f42924c, bVar.f42924c) && AbstractC6492s.d(this.f42925d, bVar.f42925d) && AbstractC6492s.d(this.f42926e, bVar.f42926e) && AbstractC6492s.d(this.f42927f, bVar.f42927f) && AbstractC6492s.d(this.f42928g, bVar.f42928g) && AbstractC6492s.d(this.f42929h, bVar.f42929h) && AbstractC6492s.d(this.f42930i, bVar.f42930i) && AbstractC6492s.d(this.f42931j, bVar.f42931j) && AbstractC6492s.d(this.f42932k, bVar.f42932k) && AbstractC6492s.d(this.f42933l, bVar.f42933l) && AbstractC6492s.d(this.f42934m, bVar.f42934m) && AbstractC6492s.d(this.f42935n, bVar.f42935n) && AbstractC6492s.d(this.f42936o, bVar.f42936o) && AbstractC6492s.d(this.f42937p, bVar.f42937p);
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f f() {
        return this.f42935n;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f g() {
        if (!(f() instanceof Speedtest.f.a.c) || !(this.f42936o instanceof Speedtest.f.a.c) || !(this.f42937p instanceof Speedtest.f.a.c)) {
            return new Speedtest.f.b();
        }
        return new Speedtest.f.a.c(new Speedtest.c(((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).f(), ((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).c(), ((com.ui.wifiman.model.speedtest.result.b) ((Speedtest.f.a.c) f()).c()).i()));
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.e h() {
        switch (c.f42939a[r().ordinal()]) {
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
                return Speedtest.e.LATENCY_CHECK;
            case 7:
                return Speedtest.e.DOWNLOAD_INIT;
            case 8:
                return Speedtest.e.DOWNLOAD;
            case 9:
                return Speedtest.e.UPLOAD_INIT;
            case 10:
                return Speedtest.e.UPLOAD;
            case 11:
            case 12:
            case 13:
                return Speedtest.e.RESULT_PROCESSING;
            case 14:
                return Speedtest.e.END;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public int hashCode() {
        int iHashCode = this.f42922a.hashCode() * 31;
        c.a aVar = this.f42923b;
        return ((((((((((((((((((((((((((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f42924c.hashCode()) * 31) + this.f42925d.hashCode()) * 31) + this.f42926e.hashCode()) * 31) + this.f42927f.hashCode()) * 31) + this.f42928g.hashCode()) * 31) + this.f42929h.hashCode()) * 31) + this.f42930i.hashCode()) * 31) + this.f42931j.hashCode()) * 31) + this.f42932k.hashCode()) * 31) + this.f42933l.hashCode()) * 31) + this.f42934m.hashCode()) * 31) + this.f42935n.hashCode()) * 31) + this.f42936o.hashCode()) * 31) + this.f42937p.hashCode();
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public Speedtest.f i() {
        return this.f42934m;
    }

    public final b j(a.C1418a params, c.a aVar, Speedtest.f consoleLatencyCheck, Speedtest.f consoleJitterCheck, Speedtest.f consoleDownloadInitialization, Speedtest.f consoleDownload, Speedtest.f consoleUploadInitialization, Speedtest.f consoleUpload, Speedtest.f evaluation, Speedtest.f downloadInitialization, Speedtest.f download, Speedtest.f uploadInitialization, Speedtest.f upload, Speedtest.f result, Speedtest.f resultReported, Speedtest.f resultReportStored) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(consoleLatencyCheck, "consoleLatencyCheck");
        AbstractC6492s.i(consoleJitterCheck, "consoleJitterCheck");
        AbstractC6492s.i(consoleDownloadInitialization, "consoleDownloadInitialization");
        AbstractC6492s.i(consoleDownload, "consoleDownload");
        AbstractC6492s.i(consoleUploadInitialization, "consoleUploadInitialization");
        AbstractC6492s.i(consoleUpload, "consoleUpload");
        AbstractC6492s.i(evaluation, "evaluation");
        AbstractC6492s.i(downloadInitialization, "downloadInitialization");
        AbstractC6492s.i(download, "download");
        AbstractC6492s.i(uploadInitialization, "uploadInitialization");
        AbstractC6492s.i(upload, "upload");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(resultReported, "resultReported");
        AbstractC6492s.i(resultReportStored, "resultReportStored");
        return new b(params, aVar, consoleLatencyCheck, consoleJitterCheck, consoleDownloadInitialization, consoleDownload, consoleUploadInitialization, consoleUpload, evaluation, downloadInitialization, download, uploadInitialization, upload, result, resultReported, resultReportStored);
    }

    public final Speedtest.f l() {
        return this.f42927f;
    }

    public final Speedtest.f m() {
        return this.f42926e;
    }

    public final Speedtest.f n() {
        return this.f42925d;
    }

    public final Speedtest.f o() {
        return this.f42924c;
    }

    public final Speedtest.f p() {
        return this.f42929h;
    }

    public final Speedtest.f q() {
        return this.f42928g;
    }

    public final EnumC1419b r() {
        return !e().a() ? EnumC1419b.CONSOLE_LATENCY_CHECK : !this.f42926e.a() ? EnumC1419b.CONSOLE_DOWNLOAD_SETUP : !this.f42927f.a() ? EnumC1419b.CONSOLE_DOWNLOAD : !this.f42928g.a() ? EnumC1419b.CONSOLE_UPLOAD_SETUP : !this.f42929h.a() ? EnumC1419b.CONSOLE_UPLOAD : !this.f42930i.a() ? EnumC1419b.EVALUATION : !s().a() ? EnumC1419b.DOWNLOAD_SETUP : !a().a() ? EnumC1419b.DOWNLOAD : !x().a() ? EnumC1419b.UPLOAD_SETUP : !i().a() ? EnumC1419b.UPLOAD : !f().a() ? EnumC1419b.RESULT_SAVE : !this.f42936o.a() ? EnumC1419b.RESULT_REPORT : !this.f42937p.a() ? EnumC1419b.RESULT_UPDATE_WITH_REPORT : EnumC1419b.END;
    }

    public Speedtest.f s() {
        return this.f42931j;
    }

    public final Speedtest.f t() {
        return this.f42930i;
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest.d
    public String toString() {
        return super.toString();
    }

    public final a.C1418a u() {
        return this.f42922a;
    }

    public final Speedtest.f v() {
        return this.f42936o;
    }

    public final c.a w() {
        return this.f42923b;
    }

    public Speedtest.f x() {
        return this.f42933l;
    }
}
