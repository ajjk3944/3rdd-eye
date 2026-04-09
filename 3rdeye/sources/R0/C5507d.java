package r0;

import androidx.recyclerview.widget.RecyclerView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p0.e;
import s0.o;

/* compiled from: ConstraintAnchor.java */
/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5507d {

    /* renamed from: b, reason: collision with root package name */
    public int f45507b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f45508c;

    /* renamed from: d, reason: collision with root package name */
    public final C5508e f45509d;

    /* renamed from: e, reason: collision with root package name */
    public final b f45510e;

    /* renamed from: f, reason: collision with root package name */
    public C5507d f45511f;
    public p0.e i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet<C5507d> f45506a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f45512g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f45513h = RecyclerView.UNDEFINED_DURATION;

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: r0.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45514a;

        static {
            int[] iArr = new int[b.values().length];
            f45514a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45514a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45514a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45514a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45514a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45514a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45514a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45514a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45514a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: r0.d$b */
    public enum b {
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

    public C5507d(C5508e c5508e, b bVar) {
        this.f45509d = c5508e;
        this.f45510e = bVar;
    }

    public final void a(C5507d c5507d, int i) {
        b(c5507d, i, RecyclerView.UNDEFINED_DURATION, false);
    }

    public final boolean b(C5507d c5507d, int i, int i10, boolean z10) {
        if (c5507d == null) {
            j();
            return true;
        }
        if (!z10 && !i(c5507d)) {
            return false;
        }
        this.f45511f = c5507d;
        if (c5507d.f45506a == null) {
            c5507d.f45506a = new HashSet<>();
        }
        HashSet<C5507d> hashSet = this.f45511f.f45506a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f45512g = i;
        this.f45513h = i10;
        return true;
    }

    public final void c(int i, ArrayList<o> arrayList, o oVar) {
        HashSet<C5507d> hashSet = this.f45506a;
        if (hashSet != null) {
            Iterator<C5507d> it = hashSet.iterator();
            while (it.hasNext()) {
                s0.i.a(it.next().f45509d, i, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f45508c) {
            return this.f45507b;
        }
        return 0;
    }

    public final int e() {
        C5507d c5507d;
        if (this.f45509d.f45557i0 == 8) {
            return 0;
        }
        int i = this.f45513h;
        return (i == Integer.MIN_VALUE || (c5507d = this.f45511f) == null || c5507d.f45509d.f45557i0 != 8) ? this.f45512g : i;
    }

    public final C5507d f() {
        int[] iArr = a.f45514a;
        b bVar = this.f45510e;
        int i = iArr[bVar.ordinal()];
        C5508e c5508e = this.f45509d;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return c5508e.f45526L;
            case 3:
                return c5508e.f45524J;
            case 4:
                return c5508e.f45527M;
            case 5:
                return c5508e.f45525K;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public final boolean g() {
        HashSet<C5507d> hashSet = this.f45506a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C5507d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f45511f != null;
    }

    public final boolean i(C5507d c5507d) {
        if (c5507d == null) {
            return false;
        }
        b bVar = this.f45510e;
        C5508e c5508e = c5507d.f45509d;
        b bVar2 = c5507d.f45510e;
        if (bVar2 == bVar) {
            return bVar != b.BASELINE || (c5508e.f45519E && this.f45509d.f45519E);
        }
        switch (a.f45514a[bVar.ordinal()]) {
            case 1:
                return (bVar2 == b.BASELINE || bVar2 == b.CENTER_X || bVar2 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = bVar2 == b.LEFT || bVar2 == b.RIGHT;
                return c5508e instanceof C5511h ? z10 || bVar2 == b.CENTER_X : z10;
            case 4:
            case 5:
                boolean z11 = bVar2 == b.TOP || bVar2 == b.BOTTOM;
                return c5508e instanceof C5511h ? z11 || bVar2 == b.CENTER_Y : z11;
            case 6:
                return (bVar2 == b.LEFT || bVar2 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public final void j() {
        HashSet<C5507d> hashSet;
        C5507d c5507d = this.f45511f;
        if (c5507d != null && (hashSet = c5507d.f45506a) != null) {
            hashSet.remove(this);
            if (this.f45511f.f45506a.size() == 0) {
                this.f45511f.f45506a = null;
            }
        }
        this.f45506a = null;
        this.f45511f = null;
        this.f45512g = 0;
        this.f45513h = RecyclerView.UNDEFINED_DURATION;
        this.f45508c = false;
        this.f45507b = 0;
    }

    public final void k() {
        p0.e eVar = this.i;
        if (eVar == null) {
            this.i = new p0.e(e.a.UNRESTRICTED);
        } else {
            eVar.c();
        }
    }

    public final void l(int i) {
        this.f45507b = i;
        this.f45508c = true;
    }

    public final String toString() {
        return this.f45509d.f45559j0 + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f45510e.toString();
    }
}
