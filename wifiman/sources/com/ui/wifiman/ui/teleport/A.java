package com.ui.wifiman.ui.teleport;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final s9.d f44936a;

    /* renamed from: b, reason: collision with root package name */
    private final rf.f f44937b;

    /* renamed from: c, reason: collision with root package name */
    private final a f44938c;

    /* renamed from: d, reason: collision with root package name */
    private final x f44939d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f44940e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f44941a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f44942b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f44943c;

        public a(s9.d title, s9.d subtitle, s9.d dVar) {
            AbstractC6492s.i(title, "title");
            AbstractC6492s.i(subtitle, "subtitle");
            this.f44941a = title;
            this.f44942b = subtitle;
            this.f44943c = dVar;
        }

        public final s9.d a() {
            return this.f44943c;
        }

        public final s9.d b() {
            return this.f44942b;
        }

        public final s9.d c() {
            return this.f44941a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f44941a, aVar.f44941a) && AbstractC6492s.d(this.f44942b, aVar.f44942b) && AbstractC6492s.d(this.f44943c, aVar.f44943c);
        }

        public int hashCode() {
            int iHashCode = ((this.f44941a.hashCode() * 31) + this.f44942b.hashCode()) * 31;
            s9.d dVar = this.f44943c;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            return "Error(title=" + this.f44941a + ", subtitle=" + this.f44942b + ", actionButton=" + this.f44943c + ")";
        }
    }

    public A(s9.d connectionState, rf.f topology, a aVar, x xVar, boolean z10) {
        AbstractC6492s.i(connectionState, "connectionState");
        AbstractC6492s.i(topology, "topology");
        this.f44936a = connectionState;
        this.f44937b = topology;
        this.f44938c = aVar;
        this.f44939d = xVar;
        this.f44940e = z10;
    }

    public final s9.d a() {
        return this.f44936a;
    }

    public final a b() {
        return this.f44938c;
    }

    public final x c() {
        return this.f44939d;
    }

    public final rf.f d() {
        return this.f44937b;
    }

    public final boolean e() {
        return this.f44940e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return AbstractC6492s.d(this.f44936a, a10.f44936a) && AbstractC6492s.d(this.f44937b, a10.f44937b) && AbstractC6492s.d(this.f44938c, a10.f44938c) && AbstractC6492s.d(this.f44939d, a10.f44939d) && this.f44940e == a10.f44940e;
    }

    public int hashCode() {
        int iHashCode = ((this.f44936a.hashCode() * 31) + this.f44937b.hashCode()) * 31;
        a aVar = this.f44938c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        x xVar = this.f44939d;
        return ((iHashCode2 + (xVar != null ? xVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f44940e);
    }

    public String toString() {
        return "Status(connectionState=" + this.f44936a + ", topology=" + this.f44937b + ", error=" + this.f44938c + ", speed=" + this.f44939d + ", tunnelSwitchAvailable=" + this.f44940e + ")";
    }
}
