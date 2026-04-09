package com.google.android.gms.internal.consent_sdk;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19254a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19255b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19256c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19257d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19258e;

    /* renamed from: f, reason: collision with root package name */
    public Object f19259f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f19260h;

    /* renamed from: i, reason: collision with root package name */
    public Object f19261i;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f19262k;

    public /* synthetic */ a0(int i4) {
        this.f19254a = i4;
    }

    public static final void a(a0 a0Var, i1.m mVar, i2.d1 d1Var) {
        for (i1.m mVar2 = mVar.f25558e; mVar2 != null; mVar2 = mVar2.f25558e) {
            if (mVar2 == ((i2.y0) a0Var.f19256c)) {
                i2.e0 e0VarV = ((i2.e0) a0Var.f19255b).v();
                d1Var.f25612q = e0VarV != null ? (i2.q) e0VarV.G.f19257d : null;
                a0Var.f19258e = d1Var;
                return;
            } else {
                if ((mVar2.f25556c & 2) != 0) {
                    return;
                }
                mVar2.o0(d1Var);
            }
        }
    }

    public static i1.m d(i1.l lVar, i1.m mVar) {
        i1.m mVarD;
        if (lVar instanceof i2.v0) {
            mVarD = ((i2.v0) lVar).d();
            mVarD.f25556c = i2.e1.f(mVarD);
        } else {
            i2.b bVar = new i2.b();
            bVar.f25556c = i2.e1.d(lVar);
            bVar.f25575o = lVar;
            new HashSet();
            mVarD = bVar;
        }
        if (mVarD.f25565n) {
            f2.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        mVarD.f25561i = true;
        i1.m mVar2 = mVar.f25559f;
        if (mVar2 != null) {
            mVar2.f25558e = mVarD;
            mVarD.f25559f = mVar2;
        }
        mVar.f25559f = mVarD;
        mVarD.f25558e = mVar;
        return mVarD;
    }

    public static i1.m e(i1.m mVar) {
        boolean z3 = mVar.f25565n;
        if (z3) {
            x.z zVar = i2.e1.f25651a;
            if (!z3) {
                f2.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            i2.e1.a(mVar, -1, 2);
            mVar.m0();
            mVar.e0();
        }
        i1.m mVar2 = mVar.f25559f;
        i1.m mVar3 = mVar.f25558e;
        if (mVar2 != null) {
            mVar2.f25558e = mVar3;
            mVar.f25559f = null;
        }
        if (mVar3 != null) {
            mVar3.f25559f = mVar2;
            mVar.f25558e = null;
        }
        nk.k.b(mVar3);
        return mVar3;
    }

    public static void j(i1.l lVar, i1.l lVar2, i1.m mVar) {
        if ((lVar instanceof i2.v0) && (lVar2 instanceof i2.v0)) {
            nk.k.c(mVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((i2.v0) lVar2).e(mVar);
            if (mVar.f25565n) {
                i2.e1.c(mVar);
                return;
            } else {
                mVar.j = true;
                return;
            }
        }
        if (!(mVar instanceof i2.b)) {
            f2.a.b("Unknown Modifier.Node type");
            return;
        }
        i2.b bVar = (i2.b) mVar;
        boolean z3 = bVar.f25565n;
        if (z3) {
            if (!z3) {
                f2.a.b("unInitializeModifier called on unattached node");
            }
            if ((bVar.f25556c & 8) != 0) {
                ((j2.r) i2.k.t(bVar)).E();
            }
        }
        bVar.f25575o = lVar2;
        bVar.f25556c = i2.e1.d(lVar2);
        if (bVar.f25565n) {
            bVar.p0(false);
        }
        if (mVar.f25565n) {
            i2.e1.c(mVar);
        } else {
            mVar.j = true;
        }
    }

    public void b(String str, String str2) {
        HashMap map = (HashMap) this.f19260h;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public ea.h c() {
        String strS = ((String) this.f19255b) == null ? " transportName" : "";
        if (((ea.l) this.f19258e) == null) {
            strS = strS.concat(" encodedPayload");
        }
        if (((Long) this.f19259f) == null) {
            strS = d.h.s(strS, " eventMillis");
        }
        if (((Long) this.g) == null) {
            strS = d.h.s(strS, " uptimeMillis");
        }
        if (((HashMap) this.f19260h) == null) {
            strS = d.h.s(strS, " autoMetadata");
        }
        if (strS.isEmpty()) {
            return new ea.h((String) this.f19255b, (Integer) this.f19257d, (ea.l) this.f19258e, ((Long) this.f19259f).longValue(), ((Long) this.g).longValue(), (HashMap) this.f19260h, (Integer) this.f19261i, (String) this.f19256c, (byte[]) this.j, (byte[]) this.f19262k);
        }
        throw new IllegalStateException("Missing required properties:".concat(strS));
    }

    public boolean f(int i4) {
        return (i4 & ((i1.m) this.g).f25557d) != 0;
    }

    public void g() {
        for (i1.m mVar = (i1.m) this.g; mVar != null; mVar = mVar.f25559f) {
            mVar.l0();
            if (mVar.f25561i) {
                x.z zVar = i2.e1.f25651a;
                if (!mVar.f25565n) {
                    f2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                i2.e1.a(mVar, -1, 1);
            }
            if (mVar.j) {
                i2.e1.c(mVar);
            }
            mVar.f25561i = false;
            mVar.j = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(int r32, w0.e r33, w0.e r34, i1.m r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.a0.h(int, w0.e, w0.e, i1.m, boolean):void");
    }

    public void i() {
        i2.w wVar;
        i2.e0 e0Var = (i2.e0) this.f19255b;
        i2.d1 d1Var = (i2.q) this.f19257d;
        for (i1.m mVar = ((i2.w1) this.f19259f).f25558e; mVar != null; mVar = mVar.f25558e) {
            i2.u uVarF = i2.k.f(mVar);
            if (uVarF != null) {
                i2.d1 d1Var2 = mVar.f25560h;
                if (d1Var2 != null) {
                    i2.w wVar2 = (i2.w) d1Var2;
                    i2.u uVar = wVar2.R;
                    wVar2.Y0(uVarF);
                    wVar = wVar2;
                    if (uVar != mVar) {
                        i2.l1 l1Var = wVar2.L;
                        wVar = wVar2;
                        if (l1Var != null) {
                            ((j2.g1) l1Var).invalidate();
                            wVar = wVar2;
                        }
                    }
                } else {
                    i2.w wVar3 = new i2.w(e0Var, uVarF);
                    mVar.o0(wVar3);
                    wVar = wVar3;
                }
                d1Var.f25612q = wVar;
                wVar.f25611p = d1Var;
                d1Var = wVar;
            } else {
                mVar.o0(d1Var);
            }
        }
        i2.e0 e0VarV = e0Var.v();
        d1Var.f25612q = e0VarV != null ? (i2.q) e0VarV.G.f19257d : null;
        this.f19258e = d1Var;
    }

    public String toString() {
        switch (this.f19254a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("[");
                i1.m mVar = (i1.m) this.g;
                i2.w1 w1Var = (i2.w1) this.f19259f;
                if (mVar == w1Var) {
                    sb2.append("]");
                } else {
                    while (true) {
                        if (mVar != null && mVar != w1Var) {
                            sb2.append(String.valueOf(mVar));
                            if (mVar.f25559f == w1Var) {
                                sb2.append("]");
                            } else {
                                sb2.append(",");
                                mVar = mVar.f25559f;
                            }
                        }
                    }
                }
                String string = sb2.toString();
                nk.k.d(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public a0(i2.e0 e0Var) {
        this.f19254a = 2;
        this.f19255b = e0Var;
        i2.y0 y0Var = new i2.y0();
        y0Var.f25557d = -1;
        this.f19256c = y0Var;
        i2.q qVar = new i2.q(e0Var);
        this.f19257d = qVar;
        this.f19258e = qVar;
        i2.w1 w1Var = qVar.R;
        this.f19259f = w1Var;
        this.g = w1Var;
        this.j = new w0.e(new i1.n[16]);
    }

    public a0(CardView cardView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout3) {
        this.f19254a = 4;
        this.f19255b = cardView;
        this.f19256c = imageView;
        this.f19257d = linearLayout;
        this.f19258e = linearLayout2;
        this.f19259f = textView;
        this.g = textView2;
        this.f19260h = textView3;
        this.f19261i = textView4;
        this.j = textView5;
        this.f19262k = linearLayout3;
    }

    public a0(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, LinearLayout linearLayout, FrameLayout frameLayout, ProgressBar progressBar, RecyclerView recyclerView, AppCompatSpinner appCompatSpinner, FrameLayout frameLayout2, TextView textView) {
        this.f19254a = 3;
        this.f19255b = materialButton;
        this.f19256c = materialButton2;
        this.f19257d = imageView;
        this.f19258e = linearLayout;
        this.f19259f = frameLayout;
        this.g = progressBar;
        this.f19260h = recyclerView;
        this.f19261i = appCompatSpinner;
        this.j = frameLayout2;
        this.f19262k = textView;
    }
}
