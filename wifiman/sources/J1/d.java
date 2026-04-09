package j1;

import c1.C4187c;
import c1.C4193i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k1.o;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f49848b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f49849c;

    /* renamed from: d, reason: collision with root package name */
    public final e f49850d;

    /* renamed from: e, reason: collision with root package name */
    public final a f49851e;

    /* renamed from: f, reason: collision with root package name */
    public d f49852f;

    /* renamed from: i, reason: collision with root package name */
    C4193i f49855i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet f49847a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f49853g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f49854h = PduHandle.NONE;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f49850d = eVar;
        this.f49851e = aVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, PduHandle.NONE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z10 && !p(dVar)) {
            return false;
        }
        this.f49852f = dVar;
        if (dVar.f49847a == null) {
            dVar.f49847a = new HashSet();
        }
        HashSet hashSet = this.f49852f.f49847a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f49853g = i10;
        this.f49854h = i11;
        return true;
    }

    public void c(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f49847a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                k1.i.a(((d) it.next()).f49850d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f49847a;
    }

    public int e() {
        if (this.f49849c) {
            return this.f49848b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f49850d.N() == 8) {
            return 0;
        }
        return (this.f49854h == Integer.MIN_VALUE || (dVar = this.f49852f) == null || dVar.f49850d.N() != 8) ? this.f49853g : this.f49854h;
    }

    public final d g() {
        switch (this.f49851e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f49850d.f49881P;
            case TOP:
                return this.f49850d.f49882Q;
            case RIGHT:
                return this.f49850d.f49879N;
            case BOTTOM:
                return this.f49850d.f49880O;
            default:
                throw new AssertionError(this.f49851e.name());
        }
    }

    public e h() {
        return this.f49850d;
    }

    public C4193i i() {
        return this.f49855i;
    }

    public d j() {
        return this.f49852f;
    }

    public a k() {
        return this.f49851e;
    }

    public boolean l() {
        HashSet hashSet = this.f49847a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f49847a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f49849c;
    }

    public boolean o() {
        return this.f49852f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarK = dVar.k();
        a aVar = this.f49851e;
        if (aVarK == aVar) {
            return aVar != a.BASELINE || (dVar.h().R() && h().R());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = aVarK == a.LEFT || aVarK == a.RIGHT;
                if (dVar.h() instanceof h) {
                    return z10 || aVarK == a.CENTER_X;
                }
                return z10;
            case TOP:
            case BOTTOM:
                boolean z11 = aVarK == a.TOP || aVarK == a.BOTTOM;
                if (dVar.h() instanceof h) {
                    return z11 || aVarK == a.CENTER_Y;
                }
                return z11;
            case BASELINE:
                return (aVarK == a.LEFT || aVarK == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarK == a.BASELINE || aVarK == a.CENTER_X || aVarK == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f49851e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        d dVar = this.f49852f;
        if (dVar != null && (hashSet = dVar.f49847a) != null) {
            hashSet.remove(this);
            if (this.f49852f.f49847a.size() == 0) {
                this.f49852f.f49847a = null;
            }
        }
        this.f49847a = null;
        this.f49852f = null;
        this.f49853g = 0;
        this.f49854h = PduHandle.NONE;
        this.f49849c = false;
        this.f49848b = 0;
    }

    public void r() {
        this.f49849c = false;
        this.f49848b = 0;
    }

    public void s(C4187c c4187c) {
        C4193i c4193i = this.f49855i;
        if (c4193i == null) {
            this.f49855i = new C4193i(C4193i.a.UNRESTRICTED, null);
        } else {
            c4193i.g();
        }
    }

    public void t(int i10) {
        this.f49848b = i10;
        this.f49849c = true;
    }

    public String toString() {
        return this.f49850d.q() + ":" + this.f49851e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f49854h = i10;
        }
    }
}
