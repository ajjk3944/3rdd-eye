package z2;

import a3.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public int f26527b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26528c;

    /* renamed from: d, reason: collision with root package name */
    public final g f26529d;

    /* renamed from: e, reason: collision with root package name */
    public final c f26530e;

    /* renamed from: f, reason: collision with root package name */
    public d f26531f;

    /* renamed from: i, reason: collision with root package name */
    public x2.f f26534i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f26526a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f26532g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f26533h = Integer.MIN_VALUE;

    public d(g gVar, c cVar) {
        this.f26529d = gVar;
        this.f26530e = cVar;
    }

    public final void a(d dVar, int i10) {
        b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            j();
            return true;
        }
        if (!z10 && !i(dVar)) {
            return false;
        }
        this.f26531f = dVar;
        if (dVar.f26526a == null) {
            dVar.f26526a = new HashSet();
        }
        HashSet hashSet = this.f26531f.f26526a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f26532g = i10;
        this.f26533h = i11;
        return true;
    }

    public final void c(int i10, q qVar, ArrayList arrayList) {
        HashSet hashSet = this.f26526a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                a3.i.b(((d) it.next()).f26529d, i10, arrayList, qVar);
            }
        }
    }

    public final int d() {
        if (this.f26528c) {
            return this.f26527b;
        }
        return 0;
    }

    public final int e() {
        d dVar;
        if (this.f26529d.f26551h0 == 8) {
            return 0;
        }
        int i10 = this.f26533h;
        return (i10 == Integer.MIN_VALUE || (dVar = this.f26531f) == null || dVar.f26529d.f26551h0 != 8) ? this.f26532g : i10;
    }

    public final d f() {
        c cVar = this.f26530e;
        int iOrdinal = cVar.ordinal();
        g gVar = this.f26529d;
        switch (iOrdinal) {
            case 0:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 1:
                return gVar.K;
            case 2:
                return gVar.L;
            case 3:
                return gVar.I;
            case 4:
                return gVar.J;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f26526a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f26531f != null;
    }

    public final boolean i(d dVar) {
        if (dVar == null) {
            return false;
        }
        g gVar = dVar.f26529d;
        c cVar = dVar.f26530e;
        c cVar2 = this.f26530e;
        if (cVar == cVar2) {
            return cVar2 != c.BASELINE || (gVar.E && this.f26529d.E);
        }
        switch (cVar2.ordinal()) {
            case 0:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return false;
            case 1:
            case 3:
                boolean z10 = cVar == c.LEFT || cVar == c.RIGHT;
                return gVar instanceof l ? z10 || cVar == c.CENTER_X : z10;
            case 2:
            case 4:
                boolean z11 = cVar == c.TOP || cVar == c.BOTTOM;
                return gVar instanceof l ? z11 || cVar == c.CENTER_Y : z11;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return (cVar == c.LEFT || cVar == c.RIGHT) ? false : true;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return (cVar == c.BASELINE || cVar == c.CENTER_X || cVar == c.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(cVar2.name());
        }
    }

    public final void j() {
        HashSet hashSet;
        d dVar = this.f26531f;
        if (dVar != null && (hashSet = dVar.f26526a) != null) {
            hashSet.remove(this);
            if (this.f26531f.f26526a.size() == 0) {
                this.f26531f.f26526a = null;
            }
        }
        this.f26526a = null;
        this.f26531f = null;
        this.f26532g = 0;
        this.f26533h = Integer.MIN_VALUE;
        this.f26528c = false;
        this.f26527b = 0;
    }

    public final void k() {
        x2.f fVar = this.f26534i;
        if (fVar == null) {
            this.f26534i = new x2.f(x2.e.UNRESTRICTED);
        } else {
            fVar.c();
        }
    }

    public final void l(int i10) {
        this.f26527b = i10;
        this.f26528c = true;
    }

    public final String toString() {
        return this.f26529d.f26553i0 + ":" + this.f26530e.toString();
    }
}
