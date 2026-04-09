package com.ui.wifiman.model.teleport;

import Fd.B;
import Kd.a;
import Rd.a;
import ch.AbstractC4260a;
import com.ui.wifiman.model.teleport.n;
import com.ui.wifiman.model.teleport.tunnel.TeleportAvailableNonFatal;
import com.ui.wifiman.model.ubiquiti.console.e;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public abstract class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f43292a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Yg.m f43293b = Yg.n.b(new InterfaceC6824a() { // from class: Fd.A
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return com.ui.wifiman.model.teleport.h.c();
        }
    });

    public static final class a extends h {

        /* renamed from: c, reason: collision with root package name */
        private final String f43294c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f43295d;

        /* renamed from: e, reason: collision with root package name */
        private final com.ui.wifiman.model.ubiquiti.console.e f43296e;

        /* renamed from: f, reason: collision with root package name */
        private final Kd.a f43297f;

        /* renamed from: g, reason: collision with root package name */
        private final n.b f43298g;

        /* renamed from: h, reason: collision with root package name */
        private final B f43299h;

        public /* synthetic */ a(String str, boolean z10, com.ui.wifiman.model.ubiquiti.console.e eVar, Kd.a aVar, n.b bVar, B b10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z10, eVar, aVar, bVar, b10);
        }

        @Override // com.ui.wifiman.model.teleport.h
        protected Kd.a B() {
            return this.f43297f;
        }

        @Override // com.ui.wifiman.model.teleport.h
        public boolean C() {
            return this.f43295d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return e.b.h(this.f43294c, aVar.f43294c) && this.f43295d == aVar.f43295d && AbstractC6492s.d(this.f43296e, aVar.f43296e) && AbstractC6492s.d(this.f43297f, aVar.f43297f) && AbstractC6492s.d(this.f43298g, aVar.f43298g) && this.f43299h == aVar.f43299h;
        }

        @Override // com.ui.wifiman.model.teleport.h
        protected com.ui.wifiman.model.ubiquiti.console.e g() {
            return this.f43296e;
        }

        public int hashCode() {
            int iJ = ((((e.b.j(this.f43294c) * 31) + Boolean.hashCode(this.f43295d)) * 31) + this.f43296e.hashCode()) * 31;
            Kd.a aVar = this.f43297f;
            int iHashCode = (((iJ + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f43298g.hashCode()) * 31;
            B b10 = this.f43299h;
            return iHashCode + (b10 != null ? b10.hashCode() : 0);
        }

        @Override // com.ui.wifiman.model.teleport.h
        public String j() {
            return this.f43294c;
        }

        @Override // com.ui.wifiman.model.teleport.h
        public Rd.a t() {
            e.a.b bVarL = g().l();
            if ((bVarL != null ? bVarL.a() : null) != null) {
                return g().l().a();
            }
            if (B() != null) {
                return a.b.C0706a.f19713a;
            }
            e.a.b bVarL2 = g().l();
            e.a.b bVarL3 = g().l();
            Rd.a aVarA = bVarL3 != null ? bVarL3.a() : null;
            Z7.b.f(new TeleportAvailableNonFatal("Teleport unsupported and cloudConsole?.network: " + bVarL2 + " and : cloudConsole.network?.teleportStatus : " + aVarA + ", tunnelRecord : " + B() + " "), null, 2, null);
            return a.c.f19716a;
        }

        public String toString() {
            return "Cloud(id=" + e.b.l(this.f43294c) + ", isMain=" + this.f43295d + ", cloudConsole=" + this.f43296e + ", tunnelRecord=" + this.f43297f + ", tokenState=" + this.f43298g + ", teleportConnection=" + this.f43299h + ")";
        }

        @Override // com.ui.wifiman.model.teleport.h
        protected B v() {
            return this.f43299h;
        }

        @Override // com.ui.wifiman.model.teleport.h
        public n.b y() {
            return this.f43298g;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private a(String id2, boolean z10, com.ui.wifiman.model.ubiquiti.console.e cloudConsole, Kd.a aVar, n.b tokenState, B b10) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(cloudConsole, "cloudConsole");
            AbstractC6492s.i(tokenState, "tokenState");
            this.f43294c = id2;
            this.f43295d = z10;
            this.f43296e = cloudConsole;
            this.f43297f = aVar;
            this.f43298g = tokenState;
            this.f43299h = b10;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Comparator a() {
            return (Comparator) h.f43293b.getValue();
        }

        private b() {
        }
    }

    public static final class c extends h {

        /* renamed from: c, reason: collision with root package name */
        private final String f43300c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f43301d;

        /* renamed from: e, reason: collision with root package name */
        private final com.ui.wifiman.model.ubiquiti.console.e f43302e;

        /* renamed from: f, reason: collision with root package name */
        private final Kd.a f43303f;

        /* renamed from: g, reason: collision with root package name */
        private final n.b f43304g;

        /* renamed from: h, reason: collision with root package name */
        private final B f43305h;

        /* renamed from: i, reason: collision with root package name */
        private final Rd.a f43306i;

        public /* synthetic */ c(String str, boolean z10, com.ui.wifiman.model.ubiquiti.console.e eVar, Kd.a aVar, n.b bVar, B b10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z10, eVar, aVar, bVar, b10);
        }

        @Override // com.ui.wifiman.model.teleport.h
        protected Kd.a B() {
            return this.f43303f;
        }

        @Override // com.ui.wifiman.model.teleport.h
        public boolean C() {
            return this.f43301d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return e.b.h(this.f43300c, cVar.f43300c) && this.f43301d == cVar.f43301d && AbstractC6492s.d(this.f43302e, cVar.f43302e) && AbstractC6492s.d(this.f43303f, cVar.f43303f) && AbstractC6492s.d(this.f43304g, cVar.f43304g) && this.f43305h == cVar.f43305h;
        }

        @Override // com.ui.wifiman.model.teleport.h
        protected com.ui.wifiman.model.ubiquiti.console.e g() {
            return this.f43302e;
        }

        public int hashCode() {
            int iJ = ((e.b.j(this.f43300c) * 31) + Boolean.hashCode(this.f43301d)) * 31;
            com.ui.wifiman.model.ubiquiti.console.e eVar = this.f43302e;
            int iHashCode = (((((iJ + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f43303f.hashCode()) * 31) + this.f43304g.hashCode()) * 31;
            B b10 = this.f43305h;
            return iHashCode + (b10 != null ? b10.hashCode() : 0);
        }

        @Override // com.ui.wifiman.model.teleport.h
        public String j() {
            return this.f43300c;
        }

        @Override // com.ui.wifiman.model.teleport.h
        public Rd.a t() {
            return this.f43306i;
        }

        public String toString() {
            return "TeleportInvitation(id=" + e.b.l(this.f43300c) + ", isMain=" + this.f43301d + ", cloudConsole=" + this.f43302e + ", tunnelRecord=" + this.f43303f + ", tokenState=" + this.f43304g + ", teleportConnection=" + this.f43305h + ")";
        }

        @Override // com.ui.wifiman.model.teleport.h
        protected B v() {
            return this.f43305h;
        }

        @Override // com.ui.wifiman.model.teleport.h
        public n.b y() {
            return this.f43304g;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private c(String id2, boolean z10, com.ui.wifiman.model.ubiquiti.console.e eVar, Kd.a tunnelRecord, n.b tokenState, B b10) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(tunnelRecord, "tunnelRecord");
            AbstractC6492s.i(tokenState, "tokenState");
            this.f43300c = id2;
            this.f43301d = z10;
            this.f43302e = eVar;
            this.f43303f = tunnelRecord;
            this.f43304g = tokenState;
            this.f43305h = b10;
            this.f43306i = a.b.AbstractC0707b.C0708a.f19714a;
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43307a;

        static {
            int[] iArr = new int[B.values().length];
            try {
                iArr[B.REACHABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B.UNSTABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[B.UNREACHABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43307a = iArr;
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(((h) obj).C() ? num : 1, !((h) obj2).C() ? 1 : 0);
        }
    }

    public static final class f implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f43308a;

        public f(Comparator comparator) {
            this.f43308a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f43308a.compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            return AbstractC4260a.e(((h) obj).t() instanceof a.c ? 1 : 0, ((h) obj2).t() instanceof a.c ? 1 : 0);
        }
    }

    public static final class g implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f43309a;

        public g(Comparator comparator) {
            this.f43309a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i10;
            int i11;
            int iCompare = this.f43309a.compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            B bS = ((h) obj).s();
            int i12 = bS == null ? -1 : d.f43307a[bS.ordinal()];
            if (i12 == -1) {
                i10 = 1;
            } else if (i12 == 1 || i12 == 2) {
                i10 = 0;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 1;
            }
            B bS2 = ((h) obj2).s();
            int i13 = bS2 == null ? -1 : d.f43307a[bS2.ordinal()];
            if (i13 == -1) {
                i11 = 1;
            } else if (i13 == 1 || i13 == 2) {
                i11 = 0;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i11 = 1;
            }
            return AbstractC4260a.e(i10, i11);
        }
    }

    /* renamed from: com.ui.wifiman.model.teleport.h$h, reason: collision with other inner class name */
    public static final class C1451h implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f43310a;

        public C1451h(Comparator comparator) {
            this.f43310a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i10;
            int iValueOf;
            int iValueOf2;
            int iCompare = this.f43310a.compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            h hVar = (h) obj;
            Rd.a aVarT = hVar.t();
            int i11 = 1;
            if (aVarT instanceof a.b.C0706a) {
                iValueOf = 0;
            } else {
                if (!(aVarT instanceof a.b.AbstractC0707b) && !(aVarT instanceof a.C0705a) && !(aVarT instanceof a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                n.b bVarY = hVar.y();
                if (bVarY instanceof n.b.a) {
                    i10 = 0;
                } else {
                    if (!(bVarY instanceof n.b.C1474b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = 1;
                }
                iValueOf = Integer.valueOf(i10);
            }
            h hVar2 = (h) obj2;
            Rd.a aVarT2 = hVar2.t();
            if (aVarT2 instanceof a.b.C0706a) {
                iValueOf2 = 0;
            } else {
                if (!(aVarT2 instanceof a.b.AbstractC0707b) && !(aVarT2 instanceof a.C0705a) && !(aVarT2 instanceof a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                n.b bVarY2 = hVar2.y();
                if (bVarY2 instanceof n.b.a) {
                    i11 = 0;
                } else if (!(bVarY2 instanceof n.b.C1474b)) {
                    throw new NoWhenBranchMatchedException();
                }
                iValueOf2 = Integer.valueOf(i11);
            }
            return AbstractC4260a.e(iValueOf, iValueOf2);
        }
    }

    public static final class i implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f43311a;

        public i(Comparator comparator) {
            this.f43311a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f43311a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : AbstractC4260a.e(((h) obj).l(), ((h) obj2).l());
        }
    }

    public static final class j implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f43312a;

        public j(Comparator comparator) {
            this.f43312a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f43312a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : AbstractC4260a.e(e.b.a(((h) obj).j()), e.b.a(((h) obj2).j()));
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparator c() {
        return new j(new i(new C1451h(new g(new f(new e())))));
    }

    protected abstract Kd.a B();

    public abstract boolean C();

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        AbstractC6492s.i(other, "other");
        return e.b.c(j(), other.j());
    }

    protected abstract com.ui.wifiman.model.ubiquiti.console.e g();

    public final boolean h() {
        return B() != null;
    }

    public abstract String j();

    public final String l() {
        a.C0428a c0428aC;
        String strK;
        com.ui.wifiman.model.ubiquiti.console.e eVarG = g();
        if (eVarG != null && (strK = eVarG.k()) != null) {
            return strK;
        }
        Kd.a aVarB = B();
        if (aVarB == null || (c0428aC = aVarB.c()) == null) {
            return null;
        }
        return c0428aC.g();
    }

    public final InterfaceC8439a.d n() {
        a.C0428a c0428aC;
        InterfaceC8439a.d dVarM;
        com.ui.wifiman.model.ubiquiti.console.e eVarG = g();
        if (eVarG != null && (dVarM = eVarG.m()) != null) {
            return dVarM;
        }
        Kd.a aVarB = B();
        if (aVarB == null || (c0428aC = aVarB.c()) == null) {
            return null;
        }
        return c0428aC.i();
    }

    public final String p() {
        a.C0428a c0428aC;
        Kd.a aVarB = B();
        if (aVarB == null || (c0428aC = aVarB.c()) == null) {
            return null;
        }
        return c0428aC.d();
    }

    public final Integer r() {
        a.C0428a c0428aC;
        Kd.a aVarB = B();
        if (aVarB == null || (c0428aC = aVarB.c()) == null) {
            return null;
        }
        return c0428aC.c();
    }

    public final B s() {
        com.ui.wifiman.model.ubiquiti.console.e eVarG;
        Boolean boolD;
        com.ui.wifiman.model.ubiquiti.console.e eVarG2 = g();
        if ((eVarG2 != null ? eVarG2.d() : null) != null && v() != null) {
            com.ui.wifiman.model.ubiquiti.console.e eVarG3 = g();
            if ((eVarG3 != null ? AbstractC6492s.d(eVarG3.d(), Boolean.TRUE) : false) || v() == B.REACHABLE) {
                return B.REACHABLE;
            }
            B bV = v();
            B b10 = B.UNSTABLE;
            return bV == b10 ? b10 : B.UNREACHABLE;
        }
        if (v() != null) {
            return v();
        }
        com.ui.wifiman.model.ubiquiti.console.e eVarG4 = g();
        if ((eVarG4 != null ? eVarG4.d() : null) == null || (eVarG = g()) == null || (boolD = eVarG.d()) == null) {
            return null;
        }
        return boolD.booleanValue() ? B.REACHABLE : B.UNREACHABLE;
    }

    public abstract Rd.a t();

    protected abstract B v();

    public abstract n.b y();

    public final String z() {
        Kd.a aVarB = B();
        if (aVarB != null) {
            return aVarB.g();
        }
        return null;
    }

    private h() {
    }
}
