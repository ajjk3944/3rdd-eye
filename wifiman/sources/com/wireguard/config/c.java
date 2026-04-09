package com.wireguard.config;

import Yf.d;
import com.wireguard.config.BadConfigException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Set f45628a;

    /* renamed from: b, reason: collision with root package name */
    private final Optional f45629b;

    /* renamed from: c, reason: collision with root package name */
    private final Optional f45630c;

    /* renamed from: d, reason: collision with root package name */
    private final Optional f45631d;

    /* renamed from: e, reason: collision with root package name */
    private final com.wireguard.crypto.b f45632e;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Set f45633a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        private Optional f45634b = Optional.empty();

        /* renamed from: c, reason: collision with root package name */
        private Optional f45635c = Optional.empty();

        /* renamed from: d, reason: collision with root package name */
        private Optional f45636d = Optional.empty();

        /* renamed from: e, reason: collision with root package name */
        private com.wireguard.crypto.b f45637e;

        public b f(d dVar) {
            this.f45633a.add(dVar);
            return this;
        }

        public c g() throws BadConfigException {
            if (this.f45637e != null) {
                return new c(this);
            }
            throw new BadConfigException(BadConfigException.c.PEER, BadConfigException.a.PUBLIC_KEY, BadConfigException.b.MISSING_ATTRIBUTE, null);
        }

        public b h(Yf.c cVar) {
            this.f45634b = Optional.of(cVar);
            return this;
        }

        public b i(com.wireguard.crypto.b bVar) {
            this.f45637e = bVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(StringBuilder sb2, Yf.c cVar) {
        sb2.append(" @");
        sb2.append(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(StringBuilder sb2, Yf.c cVar) {
        sb2.append("endpoint=");
        sb2.append(cVar);
        sb2.append('\n');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(StringBuilder sb2, Integer num) {
        sb2.append("persistent_keepalive_interval=");
        sb2.append(num);
        sb2.append('\n');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(StringBuilder sb2, com.wireguard.crypto.b bVar) {
        sb2.append("preshared_key=");
        sb2.append(bVar.i());
        sb2.append('\n');
    }

    public Set e() {
        return this.f45628a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f45628a.equals(cVar.f45628a) && this.f45629b.equals(cVar.f45629b) && this.f45630c.equals(cVar.f45630c) && this.f45631d.equals(cVar.f45631d) && this.f45632e.equals(cVar.f45632e);
    }

    public Optional f() {
        return this.f45629b;
    }

    public int hashCode() {
        return ((((((((this.f45628a.hashCode() + 31) * 31) + this.f45629b.hashCode()) * 31) + this.f45630c.hashCode()) * 31) + this.f45631d.hashCode()) * 31) + this.f45632e.hashCode();
    }

    public String k() {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("public_key=");
        sb2.append(this.f45632e.i());
        sb2.append('\n');
        for (d dVar : this.f45628a) {
            sb2.append("allowed_ip=");
            sb2.append(dVar);
            sb2.append('\n');
        }
        this.f45629b.flatMap(new Function() { // from class: Yf.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((c) obj).b();
            }
        }).ifPresent(new Consumer() { // from class: Yf.k
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.wireguard.config.c.h(sb2, (c) obj);
            }
        });
        this.f45630c.ifPresent(new Consumer() { // from class: Yf.l
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.wireguard.config.c.i(sb2, (Integer) obj);
            }
        });
        this.f45631d.ifPresent(new Consumer() { // from class: Yf.m
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.wireguard.config.c.j(sb2, (com.wireguard.crypto.b) obj);
            }
        });
        return sb2.toString();
    }

    public String toString() {
        final StringBuilder sb2 = new StringBuilder("(Peer ");
        sb2.append(this.f45632e.h());
        this.f45629b.ifPresent(new Consumer() { // from class: Yf.i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.wireguard.config.c.g(sb2, (c) obj);
            }
        });
        sb2.append(')');
        return sb2.toString();
    }

    private c(b bVar) {
        this.f45628a = Collections.unmodifiableSet(new LinkedHashSet(bVar.f45633a));
        this.f45629b = bVar.f45634b;
        this.f45630c = bVar.f45635c;
        this.f45631d = bVar.f45636d;
        com.wireguard.crypto.b bVar2 = bVar.f45637e;
        Objects.requireNonNull(bVar2, "Peers must have a public key");
        this.f45632e = bVar2;
    }
}
