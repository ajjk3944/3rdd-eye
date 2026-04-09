package h7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f10154t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f10155a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f10156b;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f10170r;

    /* renamed from: s, reason: collision with root package name */
    public q0 f10171s;

    /* renamed from: c, reason: collision with root package name */
    public int f10157c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f10158d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f10159e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f10160f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f10161g = -1;

    /* renamed from: h, reason: collision with root package name */
    public n1 f10162h = null;

    /* renamed from: i, reason: collision with root package name */
    public n1 f10163i = null;
    public final ArrayList k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f10164l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f10165m = 0;

    /* renamed from: n, reason: collision with root package name */
    public f1 f10166n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10167o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f10168p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f10169q = -1;

    public n1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f10155a = view;
    }

    public final void a(int i10) {
        this.j = i10 | this.j;
    }

    public final int b() {
        int i10 = this.f10161g;
        return i10 == -1 ? this.f10157c : i10;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? f10154t : this.f10164l;
    }

    public final boolean d() {
        View view = this.f10155a;
        return (view.getParent() == null || view.getParent() == this.f10170r) ? false : true;
    }

    public final boolean e() {
        return (this.j & 1) != 0;
    }

    public final boolean f() {
        return (this.j & 4) != 0;
    }

    public final boolean g() {
        if ((this.j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = u3.i0.f23177a;
        return !this.f10155a.hasTransientState();
    }

    public final boolean h() {
        return (this.j & 8) != 0;
    }

    public final boolean i() {
        return this.f10166n != null;
    }

    public final boolean j() {
        return (this.j & 256) != 0;
    }

    public final boolean k() {
        return (this.j & 2) != 0;
    }

    public final void l(int i10, boolean z10) {
        if (this.f10158d == -1) {
            this.f10158d = this.f10157c;
        }
        if (this.f10161g == -1) {
            this.f10161g = this.f10157c;
        }
        if (z10) {
            this.f10161g += i10;
        }
        this.f10157c += i10;
        View view = this.f10155a;
        if (view.getLayoutParams() != null) {
            ((z0) view.getLayoutParams()).f10294c = true;
        }
    }

    public final void m() {
        if (RecyclerView.W0 && j()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.j = 0;
        this.f10157c = -1;
        this.f10158d = -1;
        this.f10159e = -1L;
        this.f10161g = -1;
        this.f10165m = 0;
        this.f10162h = null;
        this.f10163i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f10168p = 0;
        this.f10169q = -1;
        RecyclerView.l(this);
    }

    public final void n(boolean z10) {
        int i10 = this.f10165m;
        int i11 = z10 ? i10 - 1 : i10 + 1;
        this.f10165m = i11;
        if (i11 < 0) {
            this.f10165m = 0;
            if (RecyclerView.W0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            io.sentry.android.core.e0.d("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i11 == 1) {
            this.j |= 16;
        } else if (z10 && i11 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.X0) {
            toString();
        }
    }

    public final boolean o() {
        return (this.j & 128) != 0;
    }

    public final boolean p() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sbL = w.g.l(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbL.append(Integer.toHexString(hashCode()));
        sbL.append(" position=");
        sbL.append(this.f10157c);
        sbL.append(" id=");
        sbL.append(this.f10159e);
        sbL.append(", oldPos=");
        sbL.append(this.f10158d);
        sbL.append(", pLpos:");
        sbL.append(this.f10161g);
        StringBuilder sb2 = new StringBuilder(sbL.toString());
        if (i()) {
            sb2.append(" scrap ");
            sb2.append(this.f10167o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb2.append(" invalid");
        }
        if (!e()) {
            sb2.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb2.append(" update");
        }
        if (h()) {
            sb2.append(" removed");
        }
        if (o()) {
            sb2.append(" ignored");
        }
        if (j()) {
            sb2.append(" tmpDetached");
        }
        if (!g()) {
            sb2.append(" not recyclable(" + this.f10165m + ")");
        }
        if ((this.j & 512) != 0 || f()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f10155a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
