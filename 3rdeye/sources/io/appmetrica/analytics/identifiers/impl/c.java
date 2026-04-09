package io.appmetrica.analytics.identifiers.impl;

import N7.B8;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f39050a;

    /* renamed from: b, reason: collision with root package name */
    public final a f39051b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39052c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f39050a = identifierStatus;
        this.f39051b = aVar;
        this.f39052c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f39050a == cVar.f39050a && kotlin.jvm.internal.l.b(this.f39051b, cVar.f39051b) && kotlin.jvm.internal.l.b(this.f39052c, cVar.f39052c);
    }

    public final int hashCode() {
        int iHashCode = this.f39050a.hashCode() * 31;
        a aVar = this.f39051b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f39052c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvIdResult(status=");
        sb.append(this.f39050a);
        sb.append(", advIdInfo=");
        sb.append(this.f39051b);
        sb.append(", errorExplanation=");
        return B8.j(sb, this.f39052c, ')');
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i) {
        this(identifierStatus, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : str);
    }
}
