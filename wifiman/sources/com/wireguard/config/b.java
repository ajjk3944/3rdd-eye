package com.wireguard.config;

import Yf.d;
import com.wireguard.config.BadConfigException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Set f45612a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f45613b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f45614c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f45615d;

    /* renamed from: e, reason: collision with root package name */
    private final com.wireguard.crypto.c f45616e;

    /* renamed from: f, reason: collision with root package name */
    private final Optional f45617f;

    /* renamed from: g, reason: collision with root package name */
    private final Optional f45618g;

    /* renamed from: h, reason: collision with root package name */
    private final Optional f45619h;

    /* renamed from: com.wireguard.config.b$b, reason: collision with other inner class name */
    public static final class C1689b {

        /* renamed from: e, reason: collision with root package name */
        private com.wireguard.crypto.c f45624e;

        /* renamed from: a, reason: collision with root package name */
        private final Set f45620a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        private final Set f45621b = new LinkedHashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f45622c = new LinkedHashSet();

        /* renamed from: d, reason: collision with root package name */
        private final Set f45623d = new LinkedHashSet();

        /* renamed from: f, reason: collision with root package name */
        private Optional f45625f = Optional.empty();

        /* renamed from: g, reason: collision with root package name */
        private Optional f45626g = Optional.empty();

        /* renamed from: h, reason: collision with root package name */
        private Optional f45627h = Optional.empty();

        public C1689b i(d dVar) {
            this.f45620a.add(dVar);
            return this;
        }

        public C1689b j(Collection collection) {
            this.f45621b.addAll(collection);
            return this;
        }

        public b k() throws BadConfigException {
            if (this.f45624e == null) {
                throw new BadConfigException(BadConfigException.c.INTERFACE, BadConfigException.a.PRIVATE_KEY, BadConfigException.b.MISSING_ATTRIBUTE, null);
            }
            if (this.f45623d.isEmpty() || this.f45622c.isEmpty()) {
                return new b(this);
            }
            throw new BadConfigException(BadConfigException.c.INTERFACE, BadConfigException.a.INCLUDED_APPLICATIONS, BadConfigException.b.INVALID_KEY, null);
        }

        public C1689b l(com.wireguard.crypto.c cVar) {
            this.f45624e = cVar;
            return this;
        }

        public C1689b m(InetAddress inetAddress) {
            this.f45625f = inetAddress == null ? Optional.empty() : Optional.of(inetAddress);
            return this;
        }

        public C1689b n(int i10) throws BadConfigException {
            if (i10 < 0 || i10 > 65535) {
                throw new BadConfigException(BadConfigException.c.INTERFACE, BadConfigException.a.LISTEN_PORT, BadConfigException.b.INVALID_VALUE, String.valueOf(i10));
            }
            this.f45626g = i10 == 0 ? Optional.empty() : Optional.of(Integer.valueOf(i10));
            return this;
        }

        public C1689b o(int i10) throws BadConfigException {
            if (i10 < 0) {
                throw new BadConfigException(BadConfigException.c.INTERFACE, BadConfigException.a.MTU, BadConfigException.b.INVALID_VALUE, String.valueOf(i10));
            }
            this.f45627h = i10 == 0 ? Optional.empty() : Optional.of(Integer.valueOf(i10));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(StringBuilder sb2, InetAddress inetAddress) {
        sb2.append(" @");
        sb2.append(inetAddress.getHostAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(StringBuilder sb2, Integer num) {
        sb2.append(" @");
        sb2.append(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(StringBuilder sb2, InetAddress inetAddress) {
        sb2.append("listen_addr=");
        sb2.append(inetAddress.getHostAddress());
        sb2.append('\n');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(StringBuilder sb2, Integer num) {
        sb2.append("listen_port=");
        sb2.append(num);
        sb2.append('\n');
    }

    public Set e() {
        return this.f45612a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f45612a.equals(bVar.f45612a) && this.f45613b.equals(bVar.f45613b) && this.f45614c.equals(bVar.f45614c) && this.f45615d.equals(bVar.f45615d) && this.f45616e.equals(bVar.f45616e) && this.f45617f.equals(bVar.f45617f) && this.f45618g.equals(bVar.f45618g) && this.f45619h.equals(bVar.f45619h);
    }

    public Set f() {
        return this.f45613b;
    }

    public Set g() {
        return this.f45614c;
    }

    public Set h() {
        return this.f45615d;
    }

    public int hashCode() {
        return ((((((((((((((this.f45612a.hashCode() + 31) * 31) + this.f45613b.hashCode()) * 31) + this.f45614c.hashCode()) * 31) + this.f45615d.hashCode()) * 31) + this.f45616e.hashCode()) * 31) + this.f45617f.hashCode()) * 31) + this.f45618g.hashCode()) * 31) + this.f45619h.hashCode();
    }

    public Optional i() {
        return this.f45619h;
    }

    public String n() {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("private_key=");
        sb2.append(this.f45616e.a().i());
        sb2.append('\n');
        this.f45617f.ifPresent(new Consumer() { // from class: Yf.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.wireguard.config.b.l(sb2, (InetAddress) obj);
            }
        });
        this.f45618g.ifPresent(new Consumer() { // from class: Yf.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.wireguard.config.b.m(sb2, (Integer) obj);
            }
        });
        return sb2.toString();
    }

    public String toString() {
        final StringBuilder sb2 = new StringBuilder("(Interface ");
        sb2.append(this.f45616e.b().h());
        this.f45617f.ifPresent(new Consumer() { // from class: Yf.e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.wireguard.config.b.j(sb2, (InetAddress) obj);
            }
        });
        this.f45618g.ifPresent(new Consumer() { // from class: Yf.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.wireguard.config.b.k(sb2, (Integer) obj);
            }
        });
        sb2.append(')');
        return sb2.toString();
    }

    private b(C1689b c1689b) {
        this.f45612a = Collections.unmodifiableSet(new LinkedHashSet(c1689b.f45620a));
        this.f45613b = Collections.unmodifiableSet(new LinkedHashSet(c1689b.f45621b));
        this.f45614c = Collections.unmodifiableSet(new LinkedHashSet(c1689b.f45622c));
        this.f45615d = Collections.unmodifiableSet(new LinkedHashSet(c1689b.f45623d));
        com.wireguard.crypto.c cVar = c1689b.f45624e;
        Objects.requireNonNull(cVar, "Interfaces must have a private key");
        this.f45616e = cVar;
        this.f45617f = c1689b.f45625f;
        this.f45618g = c1689b.f45626g;
        this.f45619h = c1689b.f45627h;
    }
}
