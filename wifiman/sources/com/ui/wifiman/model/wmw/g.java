package com.ui.wifiman.model.wmw;

import com.ui.common.semver.SemVer;
import com.ui.wifiman.model.wmw.WifimanWizard;
import gg.AbstractC5912b;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface g {

    public static abstract class a {

        /* renamed from: com.ui.wifiman.model.wmw.g$a$a, reason: collision with other inner class name */
        public static final class C1534a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final b f44118a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f44119b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1534a(b fw, boolean z10) {
                super(null);
                AbstractC6492s.i(fw, "fw");
                this.f44118a = fw;
                this.f44119b = z10;
            }

            public final b a() {
                return this.f44118a;
            }

            public final boolean b() {
                return this.f44119b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1534a)) {
                    return false;
                }
                C1534a c1534a = (C1534a) obj;
                return AbstractC6492s.d(this.f44118a, c1534a.f44118a) && this.f44119b == c1534a.f44119b;
            }

            public int hashCode() {
                return (this.f44118a.hashCode() * 31) + Boolean.hashCode(this.f44119b);
            }

            public String toString() {
                return "Available(fw=" + this.f44118a + ", seen=" + this.f44119b + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f44120a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -780604443;
            }

            public String toString() {
                return "Latest";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f44121a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1332796332;
            }

            public String toString() {
                return "Unknown";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final com.ui.wifiman.model.ubiquiti.firmware.a f44122a;

        /* renamed from: b, reason: collision with root package name */
        private final SemVer f44123b;

        public b(com.ui.wifiman.model.ubiquiti.firmware.a firmware) {
            AbstractC6492s.i(firmware, "firmware");
            this.f44122a = firmware;
            this.f44123b = firmware.a();
        }

        public final com.ui.wifiman.model.ubiquiti.firmware.a a() {
            return this.f44122a;
        }

        public final SemVer c() {
            return this.f44123b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f44122a, ((b) obj).f44122a);
        }

        public int hashCode() {
            return this.f44122a.hashCode();
        }

        public String toString() {
            return "Firmware(firmware=" + this.f44122a + ")";
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f44124a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1437090170;
            }

            public String toString() {
                return "Idle";
            }
        }

        public static abstract class b extends c {

            public static final class a extends b {

                /* renamed from: a, reason: collision with root package name */
                private final SemVer f44125a;

                /* renamed from: b, reason: collision with root package name */
                private final long f44126b;

                /* renamed from: c, reason: collision with root package name */
                private final long f44127c;

                /* renamed from: d, reason: collision with root package name */
                private final long f44128d;

                /* renamed from: e, reason: collision with root package name */
                private final float f44129e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SemVer fwVersion, long j10, long j11, long j12, float f10) {
                    super(null);
                    AbstractC6492s.i(fwVersion, "fwVersion");
                    this.f44125a = fwVersion;
                    this.f44126b = j10;
                    this.f44127c = j11;
                    this.f44128d = j12;
                    this.f44129e = f10;
                }

                @Override // com.ui.wifiman.model.wmw.g.c.b
                public float a() {
                    return this.f44129e;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return AbstractC6492s.d(this.f44125a, aVar.f44125a) && this.f44126b == aVar.f44126b && this.f44127c == aVar.f44127c && this.f44128d == aVar.f44128d && Float.compare(this.f44129e, aVar.f44129e) == 0;
                }

                public int hashCode() {
                    return (((((((this.f44125a.hashCode() * 31) + Long.hashCode(this.f44126b)) * 31) + Long.hashCode(this.f44127c)) * 31) + Long.hashCode(this.f44128d)) * 31) + Float.hashCode(this.f44129e);
                }

                public String toString() {
                    return "Download(fwVersion=" + this.f44125a + ", startedAt=" + this.f44126b + ", totalBytes=" + this.f44127c + ", downloadedBytes=" + this.f44128d + ", progress=" + this.f44129e + ")";
                }
            }

            /* renamed from: com.ui.wifiman.model.wmw.g$c$b$b, reason: collision with other inner class name */
            public static abstract class AbstractC1535b extends b {

                /* renamed from: com.ui.wifiman.model.wmw.g$c$b$b$a */
                public static final class a extends AbstractC1535b {

                    /* renamed from: a, reason: collision with root package name */
                    private final SemVer f44130a;

                    /* renamed from: b, reason: collision with root package name */
                    private final long f44131b;

                    /* renamed from: c, reason: collision with root package name */
                    private final WifimanWizard.Error f44132c;

                    /* renamed from: d, reason: collision with root package name */
                    private final float f44133d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(SemVer fwVersion, long j10, WifimanWizard.Error error) {
                        super(null);
                        AbstractC6492s.i(fwVersion, "fwVersion");
                        AbstractC6492s.i(error, "error");
                        this.f44130a = fwVersion;
                        this.f44131b = j10;
                        this.f44132c = error;
                        this.f44133d = 1.0f;
                    }

                    @Override // com.ui.wifiman.model.wmw.g.c.b
                    public float a() {
                        return this.f44133d;
                    }

                    public SemVer b() {
                        return this.f44130a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof a)) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return AbstractC6492s.d(this.f44130a, aVar.f44130a) && this.f44131b == aVar.f44131b && AbstractC6492s.d(this.f44132c, aVar.f44132c);
                    }

                    public int hashCode() {
                        return (((this.f44130a.hashCode() * 31) + Long.hashCode(this.f44131b)) * 31) + this.f44132c.hashCode();
                    }

                    public String toString() {
                        return "Failed(fwVersion=" + this.f44130a + ", startedAt=" + this.f44131b + ", error=" + this.f44132c + ")";
                    }
                }

                /* renamed from: com.ui.wifiman.model.wmw.g$c$b$b$b, reason: collision with other inner class name */
                public static final class C1536b extends AbstractC1535b {

                    /* renamed from: a, reason: collision with root package name */
                    private final SemVer f44134a;

                    /* renamed from: b, reason: collision with root package name */
                    private final long f44135b;

                    /* renamed from: c, reason: collision with root package name */
                    private final float f44136c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1536b(SemVer fwVersion, long j10) {
                        super(null);
                        AbstractC6492s.i(fwVersion, "fwVersion");
                        this.f44134a = fwVersion;
                        this.f44135b = j10;
                        this.f44136c = 1.0f;
                    }

                    @Override // com.ui.wifiman.model.wmw.g.c.b
                    public float a() {
                        return this.f44136c;
                    }

                    public SemVer b() {
                        return this.f44134a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1536b)) {
                            return false;
                        }
                        C1536b c1536b = (C1536b) obj;
                        return AbstractC6492s.d(this.f44134a, c1536b.f44134a) && this.f44135b == c1536b.f44135b;
                    }

                    public int hashCode() {
                        return (this.f44134a.hashCode() * 31) + Long.hashCode(this.f44135b);
                    }

                    public String toString() {
                        return "Success(fwVersion=" + this.f44134a + ", startedAt=" + this.f44135b + ")";
                    }
                }

                public /* synthetic */ AbstractC1535b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private AbstractC1535b() {
                    super(null);
                }
            }

            /* renamed from: com.ui.wifiman.model.wmw.g$c$b$c, reason: collision with other inner class name */
            public static final class C1537c extends b {

                /* renamed from: a, reason: collision with root package name */
                private final SemVer f44137a;

                /* renamed from: b, reason: collision with root package name */
                private final long f44138b;

                /* renamed from: c, reason: collision with root package name */
                private final float f44139c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1537c(SemVer fwVersion, long j10, float f10) {
                    super(null);
                    AbstractC6492s.i(fwVersion, "fwVersion");
                    this.f44137a = fwVersion;
                    this.f44138b = j10;
                    this.f44139c = f10;
                }

                @Override // com.ui.wifiman.model.wmw.g.c.b
                public float a() {
                    return this.f44139c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1537c)) {
                        return false;
                    }
                    C1537c c1537c = (C1537c) obj;
                    return AbstractC6492s.d(this.f44137a, c1537c.f44137a) && this.f44138b == c1537c.f44138b && Float.compare(this.f44139c, c1537c.f44139c) == 0;
                }

                public int hashCode() {
                    return (((this.f44137a.hashCode() * 31) + Long.hashCode(this.f44138b)) * 31) + Float.hashCode(this.f44139c);
                }

                public String toString() {
                    return "Upgrade(fwVersion=" + this.f44137a + ", startedAt=" + this.f44138b + ", progress=" + this.f44139c + ")";
                }
            }

            public static final class d extends b {

                /* renamed from: a, reason: collision with root package name */
                private final SemVer f44140a;

                /* renamed from: b, reason: collision with root package name */
                private final long f44141b;

                /* renamed from: c, reason: collision with root package name */
                private final long f44142c;

                /* renamed from: d, reason: collision with root package name */
                private final long f44143d;

                /* renamed from: e, reason: collision with root package name */
                private final float f44144e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(SemVer fwVersion, long j10, long j11, long j12, float f10) {
                    super(null);
                    AbstractC6492s.i(fwVersion, "fwVersion");
                    this.f44140a = fwVersion;
                    this.f44141b = j10;
                    this.f44142c = j11;
                    this.f44143d = j12;
                    this.f44144e = f10;
                }

                @Override // com.ui.wifiman.model.wmw.g.c.b
                public float a() {
                    return this.f44144e;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return AbstractC6492s.d(this.f44140a, dVar.f44140a) && this.f44141b == dVar.f44141b && this.f44142c == dVar.f44142c && this.f44143d == dVar.f44143d && Float.compare(this.f44144e, dVar.f44144e) == 0;
                }

                public int hashCode() {
                    return (((((((this.f44140a.hashCode() * 31) + Long.hashCode(this.f44141b)) * 31) + Long.hashCode(this.f44142c)) * 31) + Long.hashCode(this.f44143d)) * 31) + Float.hashCode(this.f44144e);
                }

                public String toString() {
                    return "Upload(fwVersion=" + this.f44140a + ", startedAt=" + this.f44141b + ", totalBytes=" + this.f44142c + ", uploadedBytes=" + this.f44143d + ", progress=" + this.f44144e + ")";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract float a();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    gg.i a();

    AbstractC5912b c();

    AbstractC5912b d(b bVar);

    AbstractC5912b e();

    gg.i f();

    gg.i getState();
}
