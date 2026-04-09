package com.wireguard.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.wireguard.config.b f45608a;

    /* renamed from: b, reason: collision with root package name */
    private final List f45609b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f45610a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private com.wireguard.config.b f45611b;

        public b c(c cVar) {
            this.f45610a.add(cVar);
            return this;
        }

        public a d() {
            if (this.f45611b != null) {
                return new a(this);
            }
            throw new IllegalArgumentException("An [Interface] section is required");
        }

        public b e(com.wireguard.config.b bVar) {
            this.f45611b = bVar;
            return this;
        }
    }

    public com.wireguard.config.b a() {
        return this.f45608a;
    }

    public List b() {
        return this.f45609b;
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45608a.n());
        sb2.append("replace_peers=true\n");
        Iterator it = this.f45609b.iterator();
        while (it.hasNext()) {
            sb2.append(((c) it.next()).k());
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f45608a.equals(aVar.f45608a) && this.f45609b.equals(aVar.f45609b);
    }

    public int hashCode() {
        return (this.f45608a.hashCode() * 31) + this.f45609b.hashCode();
    }

    public String toString() {
        return "(Config " + this.f45608a + " (" + this.f45609b.size() + " peers))";
    }

    private a(b bVar) {
        com.wireguard.config.b bVar2 = bVar.f45611b;
        Objects.requireNonNull(bVar2, "An [Interface] section is required");
        this.f45608a = bVar2;
        this.f45609b = Collections.unmodifiableList(new ArrayList(bVar.f45610a));
    }
}
