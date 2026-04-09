package Af;

import h9.C5969a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* renamed from: Af.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2428c {

    /* renamed from: a, reason: collision with root package name */
    private final String f675a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f676b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f677c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f678d;

    /* renamed from: e, reason: collision with root package name */
    private final List f679e;

    /* renamed from: f, reason: collision with root package name */
    private final a f680f;

    /* renamed from: g, reason: collision with root package name */
    private final a f681g;

    /* renamed from: h, reason: collision with root package name */
    private final a f682h;

    /* renamed from: Af.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final S8.c f683a;

        /* renamed from: b, reason: collision with root package name */
        private final C5969a f684b;

        /* renamed from: c, reason: collision with root package name */
        private final List f685c;

        /* renamed from: d, reason: collision with root package name */
        private final int f686d;

        /* renamed from: e, reason: collision with root package name */
        private final S8.d f687e;

        /* renamed from: f, reason: collision with root package name */
        private final W7.f f688f;

        /* renamed from: g, reason: collision with root package name */
        private final W7.f f689g;

        public a(S8.c band, C5969a bssid, List labels, int i10, S8.d dVar, W7.f fVar, W7.f fVar2) {
            AbstractC6492s.i(band, "band");
            AbstractC6492s.i(bssid, "bssid");
            AbstractC6492s.i(labels, "labels");
            this.f683a = band;
            this.f684b = bssid;
            this.f685c = labels;
            this.f686d = i10;
            this.f687e = dVar;
            this.f688f = fVar;
            this.f689g = fVar2;
        }

        public final S8.c a() {
            return this.f683a;
        }

        public final S8.d b() {
            return this.f687e;
        }

        public final C5969a c() {
            return this.f684b;
        }

        public final int d() {
            return this.f686d;
        }

        public final List e() {
            return this.f685c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f683a == aVar.f683a && AbstractC6492s.d(this.f684b, aVar.f684b) && AbstractC6492s.d(this.f685c, aVar.f685c) && this.f686d == aVar.f686d && this.f687e == aVar.f687e && AbstractC6492s.d(this.f688f, aVar.f688f) && AbstractC6492s.d(this.f689g, aVar.f689g);
        }

        public final W7.f f() {
            return this.f688f;
        }

        public final W7.f g() {
            return this.f689g;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f683a.hashCode() * 31) + this.f684b.hashCode()) * 31) + this.f685c.hashCode()) * 31) + Integer.hashCode(this.f686d)) * 31;
            S8.d dVar = this.f687e;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            W7.f fVar = this.f688f;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            W7.f fVar2 = this.f689g;
            return iHashCode3 + (fVar2 != null ? fVar2.hashCode() : 0);
        }

        public String toString() {
            return "Signal(band=" + this.f683a + ", bssid=" + this.f684b + ", labels=" + this.f685c + ", channelNum=" + this.f686d + ", bandwidth=" + this.f687e + ", signal=" + this.f688f + ", signalMax=" + this.f689g + ")";
        }
    }

    public C2428c(String id2, InterfaceC7929a interfaceC7929a, s9.d name, boolean z10, List labels, a aVar, a aVar2, a aVar3) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(labels, "labels");
        this.f675a = id2;
        this.f676b = interfaceC7929a;
        this.f677c = name;
        this.f678d = z10;
        this.f679e = labels;
        this.f680f = aVar;
        this.f681g = aVar2;
        this.f682h = aVar3;
    }

    public final String a() {
        return this.f675a;
    }

    public final boolean b() {
        return this.f678d;
    }

    public final InterfaceC7929a c() {
        return this.f676b;
    }

    public final List d() {
        return this.f679e;
    }

    public final s9.d e() {
        return this.f677c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2428c)) {
            return false;
        }
        C2428c c2428c = (C2428c) obj;
        return AbstractC6492s.d(this.f675a, c2428c.f675a) && AbstractC6492s.d(this.f676b, c2428c.f676b) && AbstractC6492s.d(this.f677c, c2428c.f677c) && this.f678d == c2428c.f678d && AbstractC6492s.d(this.f679e, c2428c.f679e) && AbstractC6492s.d(this.f680f, c2428c.f680f) && AbstractC6492s.d(this.f681g, c2428c.f681g) && AbstractC6492s.d(this.f682h, c2428c.f682h);
    }

    public final a f() {
        return this.f680f;
    }

    public final a g() {
        return this.f681g;
    }

    public final a h() {
        return this.f682h;
    }

    public int hashCode() {
        int iHashCode = this.f675a.hashCode() * 31;
        InterfaceC7929a interfaceC7929a = this.f676b;
        int iHashCode2 = (((((((iHashCode + (interfaceC7929a == null ? 0 : interfaceC7929a.hashCode())) * 31) + this.f677c.hashCode()) * 31) + Boolean.hashCode(this.f678d)) * 31) + this.f679e.hashCode()) * 31;
        a aVar = this.f680f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f681g;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.f682h;
        return iHashCode4 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    public String toString() {
        return "WifiAccessPoint(id=" + this.f675a + ", image=" + this.f676b + ", name=" + this.f677c + ", identified=" + this.f678d + ", labels=" + this.f679e + ", signal2Ghz=" + this.f680f + ", signal5Ghz=" + this.f681g + ", signal6Ghz=" + this.f682h + ")";
    }
}
