package fi;

import Bh.InterfaceC2492b;
import xi.AbstractC8535b;

/* renamed from: fi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5831c implements AbstractC8535b.c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f47354a;

    public C5831c(boolean z10) {
        this.f47354a = z10;
    }

    @Override // xi.AbstractC8535b.c
    public Iterable a(Object obj) {
        return AbstractC5833e.j(this.f47354a, (InterfaceC2492b) obj);
    }
}
