package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import y.j;

/* loaded from: classes.dex */
public class ConstraintAnchor {

    /* renamed from: b, reason: collision with root package name */
    public int f1656b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1657c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintWidget f1658d;

    /* renamed from: e, reason: collision with root package name */
    public final Type f1659e;

    /* renamed from: f, reason: collision with root package name */
    public ConstraintAnchor f1660f;

    /* renamed from: i, reason: collision with root package name */
    public SolverVariable f1663i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f1655a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f1661g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f1662h = Integer.MIN_VALUE;

    public enum Type {
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

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1674a;

        static {
            int[] iArr = new int[Type.values().length];
            f1674a = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1674a[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1674a[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1674a[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1674a[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1674a[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1674a[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1674a[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1674a[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f1658d = constraintWidget;
        this.f1659e = type;
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i10) {
        return b(constraintAnchor, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i10, int i11, boolean z10) {
        if (constraintAnchor == null) {
            q();
            return true;
        }
        if (!z10 && !p(constraintAnchor)) {
            return false;
        }
        this.f1660f = constraintAnchor;
        if (constraintAnchor.f1655a == null) {
            constraintAnchor.f1655a = new HashSet();
        }
        HashSet hashSet = this.f1660f.f1655a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f1661g = i10;
        this.f1662h = i11;
        return true;
    }

    public void c(int i10, ArrayList arrayList, j jVar) {
        HashSet hashSet = this.f1655a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                y.g.a(((ConstraintAnchor) it.next()).f1658d, i10, arrayList, jVar);
            }
        }
    }

    public HashSet d() {
        return this.f1655a;
    }

    public int e() {
        if (this.f1657c) {
            return this.f1656b;
        }
        return 0;
    }

    public int f() {
        ConstraintAnchor constraintAnchor;
        if (this.f1658d.T() == 8) {
            return 0;
        }
        return (this.f1662h == Integer.MIN_VALUE || (constraintAnchor = this.f1660f) == null || constraintAnchor.f1658d.T() != 8) ? this.f1661g : this.f1662h;
    }

    public final ConstraintAnchor g() {
        switch (a.f1674a[this.f1659e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f1658d.R;
            case 3:
                return this.f1658d.P;
            case 4:
                return this.f1658d.S;
            case 5:
                return this.f1658d.Q;
            default:
                throw new AssertionError(this.f1659e.name());
        }
    }

    public ConstraintWidget h() {
        return this.f1658d;
    }

    public SolverVariable i() {
        return this.f1663i;
    }

    public ConstraintAnchor j() {
        return this.f1660f;
    }

    public Type k() {
        return this.f1659e;
    }

    public boolean l() {
        HashSet hashSet = this.f1655a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConstraintAnchor) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f1655a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f1657c;
    }

    public boolean o() {
        return this.f1660f != null;
    }

    public boolean p(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type typeK = constraintAnchor.k();
        Type type = this.f1659e;
        if (typeK == type) {
            return type != Type.BASELINE || (constraintAnchor.h().X() && h().X());
        }
        switch (a.f1674a[type.ordinal()]) {
            case 1:
                return (typeK == Type.BASELINE || typeK == Type.CENTER_X || typeK == Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = typeK == Type.LEFT || typeK == Type.RIGHT;
                return constraintAnchor.h() instanceof f ? z10 || typeK == Type.CENTER_X : z10;
            case 4:
            case 5:
                boolean z11 = typeK == Type.TOP || typeK == Type.BOTTOM;
                return constraintAnchor.h() instanceof f ? z11 || typeK == Type.CENTER_Y : z11;
            case 6:
                return (typeK == Type.LEFT || typeK == Type.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f1659e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        ConstraintAnchor constraintAnchor = this.f1660f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f1655a) != null) {
            hashSet.remove(this);
            if (this.f1660f.f1655a.size() == 0) {
                this.f1660f.f1655a = null;
            }
        }
        this.f1655a = null;
        this.f1660f = null;
        this.f1661g = 0;
        this.f1662h = Integer.MIN_VALUE;
        this.f1657c = false;
        this.f1656b = 0;
    }

    public void r() {
        this.f1657c = false;
        this.f1656b = 0;
    }

    public void s(u.a aVar) {
        SolverVariable solverVariable = this.f1663i;
        if (solverVariable == null) {
            this.f1663i = new SolverVariable(SolverVariable.Type.UNRESTRICTED, null);
        } else {
            solverVariable.f();
        }
    }

    public void t(int i10) {
        this.f1656b = i10;
        this.f1657c = true;
    }

    public String toString() {
        return this.f1658d.u() + ":" + this.f1659e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f1662h = i10;
        }
    }
}
