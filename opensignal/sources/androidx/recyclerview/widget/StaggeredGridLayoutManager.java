package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.l;
import h7.b0;
import h7.e0;
import h7.f1;
import h7.i1;
import h7.j0;
import h7.j1;
import h7.t;
import h7.u1;
import h7.v1;
import h7.w1;
import h7.x0;
import h7.y0;
import h7.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import u3.i0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends y0 implements i1 {
    public int A;
    public final e B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public final Rect G;
    public final u1 H;
    public final boolean I;
    public int[] J;
    public final b4.e K;

    /* renamed from: p, reason: collision with root package name */
    public int f2089p;

    /* renamed from: q, reason: collision with root package name */
    public w1[] f2090q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f2091r;

    /* renamed from: s, reason: collision with root package name */
    public final j0 f2092s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2093t;

    /* renamed from: u, reason: collision with root package name */
    public int f2094u;

    /* renamed from: v, reason: collision with root package name */
    public final b0 f2095v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2096w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2097x;

    /* renamed from: y, reason: collision with root package name */
    public BitSet f2098y;

    /* renamed from: z, reason: collision with root package name */
    public int f2099z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();
        public ArrayList B;
        public boolean D;
        public boolean E;
        public boolean F;

        /* renamed from: a, reason: collision with root package name */
        public int f2104a;

        /* renamed from: d, reason: collision with root package name */
        public int f2105d;

        /* renamed from: g, reason: collision with root package name */
        public int f2106g;

        /* renamed from: r, reason: collision with root package name */
        public int[] f2107r;

        /* renamed from: x, reason: collision with root package name */
        public int f2108x;

        /* renamed from: y, reason: collision with root package name */
        public int[] f2109y;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2104a);
            parcel.writeInt(this.f2105d);
            parcel.writeInt(this.f2106g);
            if (this.f2106g > 0) {
                parcel.writeIntArray(this.f2107r);
            }
            parcel.writeInt(this.f2108x);
            if (this.f2108x > 0) {
                parcel.writeIntArray(this.f2109y);
            }
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeList(this.B);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2089p = -1;
        this.f2096w = false;
        this.f2097x = false;
        this.f2099z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new e();
        this.C = 2;
        this.G = new Rect();
        this.H = new u1(this);
        this.I = true;
        this.K = new b4.e(8, this);
        x0 x0VarI = y0.I(context, attributeSet, i10, i11);
        int i12 = x0VarI.f10259a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f2093t) {
            this.f2093t = i12;
            j0 j0Var = this.f2091r;
            this.f2091r = this.f2092s;
            this.f2092s = j0Var;
            o0();
        }
        b1(x0VarI.f10260b);
        boolean z10 = x0VarI.f10261c;
        c(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.D != z10) {
            savedState.D = z10;
        }
        this.f2096w = z10;
        o0();
        this.f2095v = new b0();
        this.f2091r = j0.a(this, this.f2093t);
        this.f2092s = j0.a(this, 1 - this.f2093t);
    }

    public static int e1(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // h7.y0
    public final void A0(RecyclerView recyclerView, int i10) {
        e0 e0Var = new e0(recyclerView.getContext());
        e0Var.f10038a = i10;
        B0(e0Var);
    }

    @Override // h7.y0
    public final boolean C0() {
        return this.F == null;
    }

    public final boolean D0() {
        int iK0;
        if (v() != 0 && this.C != 0 && this.f10279g) {
            if (this.f2097x) {
                iK0 = L0();
                K0();
            } else {
                iK0 = K0();
                L0();
            }
            if (iK0 == 0 && P0() != null) {
                this.B.a();
                this.f10278f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int E0(j1 j1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return t.b(j1Var, this.f2091r, H0(z10), G0(z10), this, this.I, this.f2097x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int F0(f1 f1Var, b0 b0Var, j1 j1Var) {
        w1 w1Var;
        ?? r82;
        int iK;
        int iC;
        int iK2;
        int iC2;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f2098y.set(0, this.f2089p, true);
        b0 b0Var2 = this.f2095v;
        int i15 = b0Var2.f10013i ? b0Var.f10009e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : b0Var.f10009e == 1 ? b0Var.f10011g + b0Var.f10006b : b0Var.f10010f - b0Var.f10006b;
        int i16 = b0Var.f10009e;
        for (int i17 = 0; i17 < this.f2089p; i17++) {
            if (!((ArrayList) this.f2090q[i17].f10233f).isEmpty()) {
                d1(this.f2090q[i17], i16, i15);
            }
        }
        int iG = this.f2097x ? this.f2091r.g() : this.f2091r.k();
        boolean z10 = false;
        while (true) {
            int i18 = b0Var.f10007c;
            if (i18 < 0 || i18 >= j1Var.b() || (!b0Var2.f10013i && this.f2098y.isEmpty())) {
                break;
            }
            View viewD = f1Var.d(b0Var.f10007c);
            b0Var.f10007c += b0Var.f10008d;
            v1 v1Var = (v1) viewD.getLayoutParams();
            int iB = v1Var.f10292a.b();
            e eVar = this.B;
            int[] iArr = eVar.f2111a;
            int i19 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i19 == -1) {
                if (T0(b0Var.f10009e)) {
                    i12 = this.f2089p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f2089p;
                    i12 = i13;
                }
                w1 w1Var2 = null;
                if (b0Var.f10009e == i14) {
                    int iK3 = this.f2091r.k();
                    int i20 = Integer.MAX_VALUE;
                    while (i12 != i11) {
                        w1 w1Var3 = this.f2090q[i12];
                        int i21 = w1Var3.i(iK3);
                        if (i21 < i20) {
                            i20 = i21;
                            w1Var2 = w1Var3;
                        }
                        i12 += i10;
                    }
                } else {
                    int iG2 = this.f2091r.g();
                    int i22 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        w1 w1Var4 = this.f2090q[i12];
                        int iK4 = w1Var4.k(iG2);
                        if (iK4 > i22) {
                            w1Var2 = w1Var4;
                            i22 = iK4;
                        }
                        i12 += i10;
                    }
                }
                w1Var = w1Var2;
                eVar.b(iB);
                eVar.f2111a[iB] = w1Var.f10232e;
            } else {
                w1Var = this.f2090q[i19];
            }
            v1Var.f10224e = w1Var;
            if (b0Var.f10009e == 1) {
                r82 = 0;
                b(viewD, -1, false);
            } else {
                r82 = 0;
                b(viewD, 0, false);
            }
            if (this.f2093t == 1) {
                R0(viewD, y0.w(r82, this.f2094u, this.f10282l, r82, ((ViewGroup.MarginLayoutParams) v1Var).width), y0.w(true, this.f10285o, this.f10283m, D() + G(), ((ViewGroup.MarginLayoutParams) v1Var).height));
            } else {
                R0(viewD, y0.w(true, this.f10284n, this.f10282l, F() + E(), ((ViewGroup.MarginLayoutParams) v1Var).width), y0.w(false, this.f2094u, this.f10283m, 0, ((ViewGroup.MarginLayoutParams) v1Var).height));
            }
            if (b0Var.f10009e == 1) {
                iC = w1Var.i(iG);
                iK = this.f2091r.c(viewD) + iC;
            } else {
                iK = w1Var.k(iG);
                iC = iK - this.f2091r.c(viewD);
            }
            if (b0Var.f10009e == 1) {
                w1 w1Var5 = v1Var.f10224e;
                w1Var5.getClass();
                v1 v1Var2 = (v1) viewD.getLayoutParams();
                v1Var2.f10224e = w1Var5;
                ArrayList arrayList = (ArrayList) w1Var5.f10233f;
                arrayList.add(viewD);
                w1Var5.f10230c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    w1Var5.f10229b = Integer.MIN_VALUE;
                }
                if (v1Var2.f10292a.h() || v1Var2.f10292a.k()) {
                    w1Var5.f10231d = ((StaggeredGridLayoutManager) w1Var5.f10234g).f2091r.c(viewD) + w1Var5.f10231d;
                }
            } else {
                w1 w1Var6 = v1Var.f10224e;
                w1Var6.getClass();
                v1 v1Var3 = (v1) viewD.getLayoutParams();
                v1Var3.f10224e = w1Var6;
                ArrayList arrayList2 = (ArrayList) w1Var6.f10233f;
                arrayList2.add(0, viewD);
                w1Var6.f10229b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    w1Var6.f10230c = Integer.MIN_VALUE;
                }
                if (v1Var3.f10292a.h() || v1Var3.f10292a.k()) {
                    w1Var6.f10231d = ((StaggeredGridLayoutManager) w1Var6.f10234g).f2091r.c(viewD) + w1Var6.f10231d;
                }
            }
            if (Q0() && this.f2093t == 1) {
                iC2 = this.f2092s.g() - (((this.f2089p - 1) - w1Var.f10232e) * this.f2094u);
                iK2 = iC2 - this.f2092s.c(viewD);
            } else {
                iK2 = this.f2092s.k() + (w1Var.f10232e * this.f2094u);
                iC2 = this.f2092s.c(viewD) + iK2;
            }
            if (this.f2093t == 1) {
                y0.N(viewD, iK2, iC, iC2, iK);
            } else {
                y0.N(viewD, iC, iK2, iK, iC2);
            }
            d1(w1Var, b0Var2.f10009e, i15);
            V0(f1Var, b0Var2);
            if (b0Var2.f10012h && viewD.hasFocusable()) {
                this.f2098y.set(w1Var.f10232e, false);
            }
            i14 = 1;
            z10 = true;
            i13 = 0;
        }
        if (!z10) {
            V0(f1Var, b0Var2);
        }
        int iK5 = b0Var2.f10009e == -1 ? this.f2091r.k() - N0(this.f2091r.k()) : M0(this.f2091r.g()) - this.f2091r.g();
        if (iK5 > 0) {
            return Math.min(b0Var.f10006b, iK5);
        }
        return 0;
    }

    public final View G0(boolean z10) {
        int iK = this.f2091r.k();
        int iG = this.f2091r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.f2091r.e(viewU);
            int iB = this.f2091r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z10) {
        int iK = this.f2091r.k();
        int iG = this.f2091r.g();
        int iV = v();
        View view = null;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            int iE = this.f2091r.e(viewU);
            if (this.f2091r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void I0(f1 f1Var, j1 j1Var, boolean z10) {
        int iG;
        int iM0 = M0(Integer.MIN_VALUE);
        if (iM0 != Integer.MIN_VALUE && (iG = this.f2091r.g() - iM0) > 0) {
            int i10 = iG - (-Z0(-iG, f1Var, j1Var));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f2091r.o(i10);
        }
    }

    public final void J0(f1 f1Var, j1 j1Var, boolean z10) {
        int iK;
        int iN0 = N0(Integer.MAX_VALUE);
        if (iN0 != Integer.MAX_VALUE && (iK = iN0 - this.f2091r.k()) > 0) {
            int iZ0 = iK - Z0(iK, f1Var, j1Var);
            if (!z10 || iZ0 <= 0) {
                return;
            }
            this.f2091r.o(-iZ0);
        }
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return y0.H(u(0));
    }

    @Override // h7.y0
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return y0.H(u(iV - 1));
    }

    public final int M0(int i10) {
        int i11 = this.f2090q[0].i(i10);
        for (int i12 = 1; i12 < this.f2089p; i12++) {
            int i13 = this.f2090q[i12].i(i10);
            if (i13 > i11) {
                i11 = i13;
            }
        }
        return i11;
    }

    public final int N0(int i10) {
        int iK = this.f2090q[0].k(i10);
        for (int i11 = 1; i11 < this.f2089p; i11++) {
            int iK2 = this.f2090q[i11].k(i10);
            if (iK2 < iK) {
                iK = iK2;
            }
        }
        return iK;
    }

    @Override // h7.y0
    public final void O(int i10) {
        super.O(i10);
        for (int i11 = 0; i11 < this.f2089p; i11++) {
            w1 w1Var = this.f2090q[i11];
            int i12 = w1Var.f10229b;
            if (i12 != Integer.MIN_VALUE) {
                w1Var.f10229b = i12 + i10;
            }
            int i13 = w1Var.f10230c;
            if (i13 != Integer.MIN_VALUE) {
                w1Var.f10230c = i13 + i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(int r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.f2097x
            if (r0 == 0) goto L9
            int r0 = r9.L0()
            goto Ld
        L9:
            int r0 = r9.K0()
        Ld:
            r1 = 8
            if (r12 != r1) goto L1b
            if (r10 >= r11) goto L17
            int r2 = r11 + 1
        L15:
            r3 = r10
            goto L1e
        L17:
            int r2 = r10 + 1
            r3 = r11
            goto L1e
        L1b:
            int r2 = r10 + r11
            goto L15
        L1e:
            androidx.recyclerview.widget.e r4 = r9.B
            int[] r5 = r4.f2111a
            if (r5 != 0) goto L26
            goto L9a
        L26:
            int r5 = r5.length
            if (r3 < r5) goto L2b
            goto L9a
        L2b:
            java.util.ArrayList r5 = r4.f2112b
            r6 = -1
            if (r5 != 0) goto L32
        L30:
            r5 = r6
            goto L80
        L32:
            if (r5 != 0) goto L35
            goto L4d
        L35:
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L3b:
            if (r5 < 0) goto L4d
            java.util.ArrayList r7 = r4.f2112b
            java.lang.Object r7 = r7.get(r5)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r7
            int r8 = r7.f2100a
            if (r8 != r3) goto L4a
            goto L4e
        L4a:
            int r5 = r5 + (-1)
            goto L3b
        L4d:
            r7 = 0
        L4e:
            if (r7 == 0) goto L55
            java.util.ArrayList r5 = r4.f2112b
            r5.remove(r7)
        L55:
            java.util.ArrayList r5 = r4.f2112b
            int r5 = r5.size()
            r7 = 0
        L5c:
            if (r7 >= r5) goto L6e
            java.util.ArrayList r8 = r4.f2112b
            java.lang.Object r8 = r8.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r8
            int r8 = r8.f2100a
            if (r8 < r3) goto L6b
            goto L6f
        L6b:
            int r7 = r7 + 1
            goto L5c
        L6e:
            r7 = r6
        L6f:
            if (r7 == r6) goto L30
            java.util.ArrayList r5 = r4.f2112b
            java.lang.Object r5 = r5.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r5
            java.util.ArrayList r8 = r4.f2112b
            r8.remove(r7)
            int r5 = r5.f2100a
        L80:
            if (r5 != r6) goto L8c
            int[] r5 = r4.f2111a
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            int[] r5 = r4.f2111a
            int r5 = r5.length
            goto L9a
        L8c:
            int r5 = r5 + 1
            int[] r7 = r4.f2111a
            int r7 = r7.length
            int r5 = java.lang.Math.min(r5, r7)
            int[] r7 = r4.f2111a
            java.util.Arrays.fill(r7, r3, r5, r6)
        L9a:
            r5 = 1
            if (r12 == r5) goto Lae
            r6 = 2
            if (r12 == r6) goto Laa
            if (r12 == r1) goto La3
            goto Lb1
        La3:
            r4.d(r10, r5)
            r4.c(r11, r5)
            goto Lb1
        Laa:
            r4.d(r10, r11)
            goto Lb1
        Lae:
            r4.c(r10, r11)
        Lb1:
            if (r2 > r0) goto Lb4
            goto Lc6
        Lb4:
            boolean r10 = r9.f2097x
            if (r10 == 0) goto Lbd
            int r10 = r9.K0()
            goto Lc1
        Lbd:
            int r10 = r9.L0()
        Lc1:
            if (r3 > r10) goto Lc6
            r9.o0()
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0(int, int, int):void");
    }

    @Override // h7.y0
    public final void P(int i10) {
        super.P(i10);
        for (int i11 = 0; i11 < this.f2089p; i11++) {
            w1 w1Var = this.f2090q[i11];
            int i12 = w1Var.f10229b;
            if (i12 != Integer.MIN_VALUE) {
                w1Var.f10229b = i12 + i10;
            }
            int i13 = w1Var.f10230c;
            if (i13 != Integer.MIN_VALUE) {
                w1Var.f10230c = i13 + i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View P0() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P0():android.view.View");
    }

    @Override // h7.y0
    public final void Q() {
        this.B.a();
        for (int i10 = 0; i10 < this.f2089p; i10++) {
            this.f2090q[i10].b();
        }
    }

    public final boolean Q0() {
        return C() == 1;
    }

    public final void R0(View view, int i10, int i11) {
        RecyclerView recyclerView = this.f10274b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.O(view));
        }
        v1 v1Var = (v1) view.getLayoutParams();
        int iE1 = e1(i10, ((ViewGroup.MarginLayoutParams) v1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) v1Var).rightMargin + rect.right);
        int iE12 = e1(i11, ((ViewGroup.MarginLayoutParams) v1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) v1Var).bottomMargin + rect.bottom);
        if (x0(view, iE1, iE12, v1Var)) {
            view.measure(iE1, iE12);
        }
    }

    @Override // h7.y0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10274b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f2089p; i10++) {
            this.f2090q[i10].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S0(h7.f1 r17, h7.j1 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0(h7.f1, h7.j1, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // h7.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r9, int r10, h7.f1 r11, h7.j1 r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, h7.f1, h7.j1):android.view.View");
    }

    public final boolean T0(int i10) {
        if (this.f2093t == 0) {
            return (i10 == -1) != this.f2097x;
        }
        return ((i10 == -1) == this.f2097x) == Q0();
    }

    @Override // h7.y0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewH0 = H0(false);
            View viewG0 = G0(false);
            if (viewH0 == null || viewG0 == null) {
                return;
            }
            int iH = y0.H(viewH0);
            int iH2 = y0.H(viewG0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    public final void U0(int i10, j1 j1Var) {
        int iK0;
        int i11;
        if (i10 > 0) {
            iK0 = L0();
            i11 = 1;
        } else {
            iK0 = K0();
            i11 = -1;
        }
        b0 b0Var = this.f2095v;
        b0Var.f10005a = true;
        c1(iK0, j1Var);
        a1(i11);
        b0Var.f10007c = iK0 + b0Var.f10008d;
        b0Var.f10006b = Math.abs(i10);
    }

    public final void V0(f1 f1Var, b0 b0Var) {
        if (!b0Var.f10005a || b0Var.f10013i) {
            return;
        }
        if (b0Var.f10006b == 0) {
            if (b0Var.f10009e == -1) {
                W0(f1Var, b0Var.f10011g);
                return;
            } else {
                X0(f1Var, b0Var.f10010f);
                return;
            }
        }
        int i10 = 1;
        if (b0Var.f10009e == -1) {
            int i11 = b0Var.f10010f;
            int iK = this.f2090q[0].k(i11);
            while (i10 < this.f2089p) {
                int iK2 = this.f2090q[i10].k(i11);
                if (iK2 > iK) {
                    iK = iK2;
                }
                i10++;
            }
            int i12 = i11 - iK;
            W0(f1Var, i12 < 0 ? b0Var.f10011g : b0Var.f10011g - Math.min(i12, b0Var.f10006b));
            return;
        }
        int i13 = b0Var.f10011g;
        int i14 = this.f2090q[0].i(i13);
        while (i10 < this.f2089p) {
            int i15 = this.f2090q[i10].i(i13);
            if (i15 < i14) {
                i14 = i15;
            }
            i10++;
        }
        int i16 = i14 - b0Var.f10011g;
        X0(f1Var, i16 < 0 ? b0Var.f10010f : Math.min(i16, b0Var.f10006b) + b0Var.f10010f);
    }

    public final void W0(f1 f1Var, int i10) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f2091r.e(viewU) < i10 || this.f2091r.n(viewU) < i10) {
                return;
            }
            v1 v1Var = (v1) viewU.getLayoutParams();
            v1Var.getClass();
            if (((ArrayList) v1Var.f10224e.f10233f).size() == 1) {
                return;
            }
            w1 w1Var = v1Var.f10224e;
            ArrayList arrayList = (ArrayList) w1Var.f10233f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            v1 v1Var2 = (v1) view.getLayoutParams();
            v1Var2.f10224e = null;
            if (v1Var2.f10292a.h() || v1Var2.f10292a.k()) {
                w1Var.f10231d -= ((StaggeredGridLayoutManager) w1Var.f10234g).f2091r.c(view);
            }
            if (size == 1) {
                w1Var.f10229b = Integer.MIN_VALUE;
            }
            w1Var.f10230c = Integer.MIN_VALUE;
            l0(viewU, f1Var);
        }
    }

    public final void X0(f1 f1Var, int i10) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f2091r.b(viewU) > i10 || this.f2091r.m(viewU) > i10) {
                return;
            }
            v1 v1Var = (v1) viewU.getLayoutParams();
            v1Var.getClass();
            if (((ArrayList) v1Var.f10224e.f10233f).size() == 1) {
                return;
            }
            w1 w1Var = v1Var.f10224e;
            ArrayList arrayList = (ArrayList) w1Var.f10233f;
            View view = (View) arrayList.remove(0);
            v1 v1Var2 = (v1) view.getLayoutParams();
            v1Var2.f10224e = null;
            if (arrayList.size() == 0) {
                w1Var.f10230c = Integer.MIN_VALUE;
            }
            if (v1Var2.f10292a.h() || v1Var2.f10292a.k()) {
                w1Var.f10231d -= ((StaggeredGridLayoutManager) w1Var.f10234g).f2091r.c(view);
            }
            w1Var.f10229b = Integer.MIN_VALUE;
            l0(viewU, f1Var);
        }
    }

    @Override // h7.y0
    public final void Y(int i10, int i11) {
        O0(i10, i11, 1);
    }

    public final void Y0() {
        if (this.f2093t == 1 || !Q0()) {
            this.f2097x = this.f2096w;
        } else {
            this.f2097x = !this.f2096w;
        }
    }

    @Override // h7.y0
    public final void Z() {
        this.B.a();
        o0();
    }

    public final int Z0(int i10, f1 f1Var, j1 j1Var) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        U0(i10, j1Var);
        b0 b0Var = this.f2095v;
        int iF0 = F0(f1Var, b0Var, j1Var);
        if (b0Var.f10006b >= iF0) {
            i10 = i10 < 0 ? -iF0 : iF0;
        }
        this.f2091r.o(-i10);
        this.D = this.f2097x;
        b0Var.f10006b = 0;
        V0(f1Var, b0Var);
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // h7.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f2097x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.K0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f2097x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f2093t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // h7.y0
    public final void a0(int i10, int i11) {
        O0(i10, i11, 8);
    }

    public final void a1(int i10) {
        b0 b0Var = this.f2095v;
        b0Var.f10009e = i10;
        b0Var.f10008d = this.f2097x != (i10 == -1) ? -1 : 1;
    }

    @Override // h7.y0
    public final void b0(int i10, int i11) {
        O0(i10, i11, 2);
    }

    public final void b1(int i10) {
        c(null);
        if (i10 != this.f2089p) {
            this.B.a();
            o0();
            this.f2089p = i10;
            this.f2098y = new BitSet(this.f2089p);
            this.f2090q = new w1[this.f2089p];
            for (int i11 = 0; i11 < this.f2089p; i11++) {
                this.f2090q[i11] = new w1(this, i11);
            }
            o0();
        }
    }

    @Override // h7.y0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // h7.y0
    public final void c0(int i10, int i11) {
        O0(i10, i11, 4);
    }

    public final void c1(int i10, j1 j1Var) {
        int iL;
        int iL2;
        int i11;
        b0 b0Var = this.f2095v;
        boolean z10 = false;
        b0Var.f10006b = 0;
        b0Var.f10007c = i10;
        e0 e0Var = this.f10277e;
        if (e0Var == null || !e0Var.f10042e || (i11 = j1Var.f10101a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f2097x == (i11 < i10)) {
                iL = this.f2091r.l();
                iL2 = 0;
            } else {
                iL2 = this.f2091r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.f10274b;
        if (recyclerView == null || !recyclerView.D) {
            b0Var.f10011g = this.f2091r.f() + iL;
            b0Var.f10010f = -iL2;
        } else {
            b0Var.f10010f = this.f2091r.k() - iL2;
            b0Var.f10011g = this.f2091r.g() + iL;
        }
        b0Var.f10012h = false;
        b0Var.f10005a = true;
        if (this.f2091r.i() == 0 && this.f2091r.f() == 0) {
            z10 = true;
        }
        b0Var.f10013i = z10;
    }

    @Override // h7.y0
    public final boolean d() {
        return this.f2093t == 0;
    }

    @Override // h7.y0
    public final void d0(f1 f1Var, j1 j1Var) {
        S0(f1Var, j1Var, true);
    }

    public final void d1(w1 w1Var, int i10, int i11) {
        int i12 = w1Var.f10231d;
        int i13 = w1Var.f10232e;
        if (i10 != -1) {
            int i14 = w1Var.f10230c;
            if (i14 == Integer.MIN_VALUE) {
                w1Var.a();
                i14 = w1Var.f10230c;
            }
            if (i14 - i12 >= i11) {
                this.f2098y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = w1Var.f10229b;
        if (i15 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) w1Var.f10233f).get(0);
            v1 v1Var = (v1) view.getLayoutParams();
            w1Var.f10229b = ((StaggeredGridLayoutManager) w1Var.f10234g).f2091r.e(view);
            v1Var.getClass();
            i15 = w1Var.f10229b;
        }
        if (i15 + i12 <= i11) {
            this.f2098y.set(i13, false);
        }
    }

    @Override // h7.y0
    public final boolean e() {
        return this.f2093t == 1;
    }

    @Override // h7.y0
    public final void e0(j1 j1Var) {
        this.f2099z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // h7.y0
    public final boolean f(z0 z0Var) {
        return z0Var instanceof v1;
    }

    @Override // h7.y0
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            if (this.f2099z != -1) {
                savedState.f2104a = -1;
                savedState.f2105d = -1;
                savedState.f2107r = null;
                savedState.f2106g = 0;
                savedState.f2108x = 0;
                savedState.f2109y = null;
                savedState.B = null;
            }
            o0();
        }
    }

    @Override // h7.y0
    public final Parcelable g0() {
        int iK;
        int iK2;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f2106g = savedState.f2106g;
            savedState2.f2104a = savedState.f2104a;
            savedState2.f2105d = savedState.f2105d;
            savedState2.f2107r = savedState.f2107r;
            savedState2.f2108x = savedState.f2108x;
            savedState2.f2109y = savedState.f2109y;
            savedState2.D = savedState.D;
            savedState2.E = savedState.E;
            savedState2.F = savedState.F;
            savedState2.B = savedState.B;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.D = this.f2096w;
        savedState3.E = this.D;
        savedState3.F = this.E;
        e eVar = this.B;
        if (eVar == null || (iArr = eVar.f2111a) == null) {
            savedState3.f2108x = 0;
        } else {
            savedState3.f2109y = iArr;
            savedState3.f2108x = iArr.length;
            savedState3.B = eVar.f2112b;
        }
        if (v() <= 0) {
            savedState3.f2104a = -1;
            savedState3.f2105d = -1;
            savedState3.f2106g = 0;
            return savedState3;
        }
        savedState3.f2104a = this.D ? L0() : K0();
        View viewG0 = this.f2097x ? G0(true) : H0(true);
        savedState3.f2105d = viewG0 != null ? y0.H(viewG0) : -1;
        int i10 = this.f2089p;
        savedState3.f2106g = i10;
        savedState3.f2107r = new int[i10];
        for (int i11 = 0; i11 < this.f2089p; i11++) {
            if (this.D) {
                iK = this.f2090q[i11].i(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iK2 = this.f2091r.g();
                    iK -= iK2;
                }
            } else {
                iK = this.f2090q[i11].k(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iK2 = this.f2091r.k();
                    iK -= iK2;
                }
            }
            savedState3.f2107r[i11] = iK;
        }
        return savedState3;
    }

    @Override // h7.y0
    public final void h(int i10, int i11, j1 j1Var, l lVar) {
        b0 b0Var;
        int i12;
        int iK;
        if (this.f2093t != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        U0(i10, j1Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f2089p) {
            this.J = new int[this.f2089p];
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f2089p;
            b0Var = this.f2095v;
            if (i13 >= i15) {
                break;
            }
            if (b0Var.f10008d == -1) {
                i12 = b0Var.f10010f;
                iK = this.f2090q[i13].k(i12);
            } else {
                i12 = this.f2090q[i13].i(b0Var.f10011g);
                iK = b0Var.f10011g;
            }
            int i16 = i12 - iK;
            if (i16 >= 0) {
                this.J[i14] = i16;
                i14++;
            }
            i13++;
        }
        Arrays.sort(this.J, 0, i14);
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = b0Var.f10007c;
            if (i18 < 0 || i18 >= j1Var.b()) {
                return;
            }
            lVar.b(b0Var.f10007c, this.J[i17]);
            b0Var.f10007c += b0Var.f10008d;
        }
    }

    @Override // h7.y0
    public final void h0(int i10) {
        if (i10 == 0) {
            D0();
        }
    }

    @Override // h7.y0
    public final int j(j1 j1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return t.a(j1Var, this.f2091r, H0(z10), G0(z10), this, this.I);
    }

    @Override // h7.y0
    public final int k(j1 j1Var) {
        return E0(j1Var);
    }

    @Override // h7.y0
    public final int l(j1 j1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return t.c(j1Var, this.f2091r, H0(z10), G0(z10), this, this.I);
    }

    @Override // h7.y0
    public final int m(j1 j1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return t.a(j1Var, this.f2091r, H0(z10), G0(z10), this, this.I);
    }

    @Override // h7.y0
    public final int n(j1 j1Var) {
        return E0(j1Var);
    }

    @Override // h7.y0
    public final int o(j1 j1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return t.c(j1Var, this.f2091r, H0(z10), G0(z10), this, this.I);
    }

    @Override // h7.y0
    public final int p0(int i10, f1 f1Var, j1 j1Var) {
        return Z0(i10, f1Var, j1Var);
    }

    @Override // h7.y0
    public final void q0(int i10) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.f2104a != i10) {
            savedState.f2107r = null;
            savedState.f2106g = 0;
            savedState.f2104a = -1;
            savedState.f2105d = -1;
        }
        this.f2099z = i10;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    @Override // h7.y0
    public final z0 r() {
        return this.f2093t == 0 ? new v1(-2, -1) : new v1(-1, -2);
    }

    @Override // h7.y0
    public final int r0(int i10, f1 f1Var, j1 j1Var) {
        return Z0(i10, f1Var, j1Var);
    }

    @Override // h7.y0
    public final z0 s(Context context, AttributeSet attributeSet) {
        return new v1(context, attributeSet);
    }

    @Override // h7.y0
    public final z0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new v1((ViewGroup.MarginLayoutParams) layoutParams) : new v1(layoutParams);
    }

    @Override // h7.y0
    public final void u0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        int iF = F() + E();
        int iD = D() + G();
        if (this.f2093t == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f10274b;
            WeakHashMap weakHashMap = i0.f23177a;
            iG2 = y0.g(i11, iHeight, recyclerView.getMinimumHeight());
            iG = y0.g(i10, (this.f2094u * this.f2089p) + iF, this.f10274b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f10274b;
            WeakHashMap weakHashMap2 = i0.f23177a;
            iG = y0.g(i10, iWidth, recyclerView2.getMinimumWidth());
            iG2 = y0.g(i11, (this.f2094u * this.f2089p) + iD, this.f10274b.getMinimumHeight());
        }
        this.f10274b.setMeasuredDimension(iG, iG2);
    }

    public StaggeredGridLayoutManager() {
        this.f2089p = -1;
        this.f2096w = false;
        this.f2097x = false;
        this.f2099z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new e();
        this.C = 2;
        this.G = new Rect();
        this.H = new u1(this);
        this.I = true;
        this.K = new b4.e(8, this);
        this.f2093t = 0;
        b1(2);
        this.f2095v = new b0();
        this.f2091r = j0.a(this, this.f2093t);
        this.f2092s = j0.a(this, 1 - this.f2093t);
    }
}
