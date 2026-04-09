package ab;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.Layout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.media3.common.a1;
import com.google.android.exoplayer2.w1;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.m4;
import h2.b0;
import h2.g0;
import h2.p;
import i.h0;
import java.util.ArrayList;
import mu.a0;
import o.x;

/* loaded from: classes.dex */
public class g implements x, io.sentry.android.replay.util.g, kf.j, xd.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f308d;

    /* renamed from: g, reason: collision with root package name */
    public Object f309g;

    public m4 A(String str, String str2) {
        Object obj = m4.f5114g;
        return new m4(this, str, str2, 3);
    }

    @Override // o.x
    public boolean Q(o.m mVar) {
        ((h0) this.f309g).f11055d.onMenuOpened(108, mVar);
        return true;
    }

    @Override // io.sentry.android.replay.util.g
    public int a(int i10) {
        return dr.a.F(((g0) this.f309g).e(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    @Override // xd.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u3.h1 b(android.view.View r17, u3.h1 r18, pb.d0 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            u3.f1 r4 = r2.f23176a
            r5 = 7
            k3.d r5 = r4.f(r5)
            r6 = 32
            k3.d r4 = r4.f(r6)
            java.lang.Object r6 = r0.f309g
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r6
            boolean r7 = r6.f5527o
            int r8 = r5.f14015b
            int r9 = r5.f14016c
            int r10 = r5.f14014a
            r6.f5535w = r8
            int r8 = r1.getLayoutDirection()
            r12 = 1
            if (r8 != r12) goto L2c
            r8 = r12
            goto L2d
        L2c:
            r8 = 0
        L2d:
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            if (r7 == 0) goto L44
            int r13 = r2.a()
            r6.f5534v = r13
            int r11 = r3.f20364e
            int r13 = r13 + r11
        L44:
            boolean r11 = r6.f5528p
            if (r11 == 0) goto L51
            if (r8 == 0) goto L4d
            int r11 = r3.f20363d
            goto L4f
        L4d:
            int r11 = r3.f20361b
        L4f:
            int r14 = r11 + r10
        L51:
            boolean r11 = r6.f5529q
            if (r11 == 0) goto L5e
            if (r8 == 0) goto L5a
            int r3 = r3.f20361b
            goto L5c
        L5a:
            int r3 = r3.f20363d
        L5c:
            int r15 = r3 + r9
        L5e:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r8 = r6.f5531s
            if (r8 == 0) goto L70
            int r8 = r3.leftMargin
            if (r8 == r10) goto L70
            r3.leftMargin = r10
            r11 = r12
            goto L71
        L70:
            r11 = 0
        L71:
            boolean r8 = r6.f5532t
            if (r8 == 0) goto L7c
            int r8 = r3.rightMargin
            if (r8 == r9) goto L7c
            r3.rightMargin = r9
            r11 = r12
        L7c:
            boolean r8 = r6.f5533u
            if (r8 == 0) goto L89
            int r8 = r3.topMargin
            int r5 = r5.f14015b
            if (r8 == r5) goto L89
            r3.topMargin = r5
            goto L8a
        L89:
            r12 = r11
        L8a:
            if (r12 == 0) goto L8f
            r1.setLayoutParams(r3)
        L8f:
            int r3 = r1.getPaddingTop()
            r1.setPadding(r14, r3, r15, r13)
            boolean r1 = r0.f308d
            if (r1 == 0) goto L9e
            int r3 = r4.f14017d
            r6.f5525m = r3
        L9e:
            if (r7 != 0) goto La4
            if (r1 == 0) goto La3
            goto La4
        La3:
            return r2
        La4:
            r6.J()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.g.b(android.view.View, u3.h1, pb.d0):u3.h1");
    }

    @Override // o.x
    public void c(o.m mVar, boolean z10) {
        androidx.appcompat.widget.b bVar;
        h0 h0Var = (h0) this.f309g;
        if (this.f308d) {
            return;
        }
        this.f308d = true;
        ActionMenuView actionMenuView = h0Var.f11054c.f20152a.f1011a;
        if (actionMenuView != null && (bVar = actionMenuView.P) != null) {
            bVar.g();
            p.f fVar = bVar.Q;
            if (fVar != null && fVar.b()) {
                fVar.f18681i.dismiss();
            }
        }
        h0Var.f11055d.onPanelClosed(108, mVar);
        this.f308d = false;
    }

    @Override // kf.j
    public void d(kf.i iVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f309g;
        if (this.f308d) {
            this.f308d = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    @Override // io.sentry.android.replay.util.g
    public float e(int i10, int i11) {
        h2.m mVar = ((g0) this.f309g).f9825b;
        ArrayList arrayList = mVar.f9854h;
        mVar.b(i11);
        p pVar = (p) arrayList.get(i11 == ((h2.f) mVar.f9847a.f3974d).f9811d.length() ? e5.z(arrayList) : b0.c(i11, arrayList));
        float fG = pVar.f9859a.f9781d.g(pVar.a(i11), false);
        if (this.f308d || h() != 1) {
            return fG;
        }
        mVar.c(i10);
        ArrayList arrayList2 = mVar.f9854h;
        p pVar2 = (p) arrayList2.get(b0.d(i10, arrayList2));
        h2.b bVar = pVar2.f9859a;
        int i12 = i10 - pVar2.f9862d;
        i2.h hVar = bVar.f9781d;
        return fG - (hVar.f11173e.getLineLeft(i12) + (i12 == hVar.f11174f - 1 ? hVar.f11177i : 0.0f));
    }

    @Override // io.sentry.android.replay.util.g
    public int f(int i10) {
        h2.m mVar = ((g0) this.f309g).f9825b;
        mVar.c(i10);
        ArrayList arrayList = mVar.f9854h;
        p pVar = (p) arrayList.get(b0.d(i10, arrayList));
        h2.b bVar = pVar.f9859a;
        return dr.a.F(bVar.f9781d.d(i10 - pVar.f9862d) + pVar.f9864f);
    }

    @Override // io.sentry.android.replay.util.g
    public int g(int i10) {
        return ((g0) this.f309g).d(i10);
    }

    @Override // io.sentry.android.replay.util.g
    public int h() {
        return ((g0) this.f309g).f9825b.f9852f;
    }

    public boolean i() {
        return this.f308d;
    }

    @Override // io.sentry.android.replay.util.g
    public Integer j() {
        return null;
    }

    public qj.a k() {
        ch.d dVar = (ch.d) this.f309g;
        if (!this.f308d) {
            ch.n.b("DatabaseDataSourceFactory", "Using RawDatabaseDataSource");
            return new b9.e(23, dVar.x());
        }
        ch.n.b("DatabaseDataSourceFactory", "Using ContentProviderDatabaseDataSource");
        ContentResolver contentResolver = dVar.d().getContentResolver();
        br.l.d(contentResolver, "getContentResolver(...)");
        if (dVar.f3938z2 == null) {
            dVar.f3938z2 = new vi.a(dVar.d());
        }
        vi.a aVar = dVar.f3938z2;
        if (aVar != null) {
            return new bm.d(contentResolver, aVar, dVar.F(), dVar.r(), 19);
        }
        br.l.l("_sdkProviderUris");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f309g
            s3.f r0 = (s3.f) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.i()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r8) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            ab.g r5 = s3.g.f21868a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.i()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.g.l(java.lang.CharSequence, int):boolean");
    }

    @Override // io.sentry.android.replay.util.g
    public int m(int i10) {
        return ((g0) this.f309g).a(i10, true);
    }

    public void n() {
        this.f308d = false;
    }

    @Override // io.sentry.android.replay.util.g
    public int o(int i10) {
        h2.m mVar = ((g0) this.f309g).f9825b;
        mVar.c(i10);
        ArrayList arrayList = mVar.f9854h;
        Layout layout = ((p) arrayList.get(b0.d(i10, arrayList))).f9859a.f9781d.f11173e;
        i2.g gVar = i2.i.f11183a;
        return layout.getEllipsisCount(i10) > 0 ? 1 : 0;
    }

    public void p(byte b2) {
        ((ag.b) this.f309g).t(String.valueOf(b2));
    }

    public void q(char c4) {
        ag.b bVar = (ag.b) this.f309g;
        bVar.f(bVar.f345d, 1);
        char[] cArr = (char[]) bVar.f346g;
        int i10 = bVar.f345d;
        bVar.f345d = i10 + 1;
        cArr[i10] = c4;
    }

    public void r(int i10) {
        ((ag.b) this.f309g).t(String.valueOf(i10));
    }

    public void s(long j) {
        ((ag.b) this.f309g).t(String.valueOf(j));
    }

    public void t(String str) {
        br.l.e(str, "v");
        ((ag.b) this.f309g).t(str);
    }

    public String toString() {
        switch (this.f307a) {
            case 4:
                return this.f308d ? "FALL_THROUGH" : String.valueOf(this.f309g);
            default:
                return super.toString();
        }
    }

    public void u(short s8) {
        ((ag.b) this.f309g).t(String.valueOf(s8));
    }

    public void v(String str) {
        byte b2;
        br.l.e(str, "value");
        ag.b bVar = (ag.b) this.f309g;
        bVar.f(bVar.f345d, str.length() + 2);
        char[] cArr = (char[]) bVar.f346g;
        int i10 = bVar.f345d;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c4 = cArr[i13];
            byte[] bArr = a0.f17007b;
            if (c4 < bArr.length && bArr[c4] != 0) {
                int length2 = str.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    bVar.f(i13, 2);
                    char cCharAt = str.charAt(i14);
                    byte[] bArr2 = a0.f17007b;
                    if (cCharAt >= bArr2.length || (b2 = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        ((char[]) bVar.f346g)[i13] = cCharAt;
                        i13 = i15;
                    } else {
                        if (b2 == 1) {
                            String str2 = a0.f17006a[cCharAt];
                            br.l.b(str2);
                            bVar.f(i13, str2.length());
                            str2.getChars(0, str2.length(), (char[]) bVar.f346g, i13);
                            int length3 = str2.length() + i13;
                            bVar.f345d = length3;
                            i13 = length3;
                        } else {
                            char[] cArr2 = (char[]) bVar.f346g;
                            cArr2[i13] = '\\';
                            cArr2[i13 + 1] = (char) b2;
                            i13 += 2;
                            bVar.f345d = i13;
                        }
                    }
                }
                bVar.f(i13, 1);
                ((char[]) bVar.f346g)[i13] = '\"';
                bVar.f345d = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        bVar.f345d = i12 + 1;
    }

    public m4 y(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = m4.f5114g;
        return new m4(this, str, lValueOf, 0);
    }

    public m4 z(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Object obj = m4.f5114g;
        return new m4(this, str, boolValueOf, 1);
    }

    public /* synthetic */ g(int i10, Object obj) {
        this.f307a = i10;
        this.f309g = obj;
    }

    public g(Uri uri, boolean z10, boolean z11) {
        this.f307a = 1;
        this.f309g = uri;
        this.f308d = z10;
    }

    public /* synthetic */ g(Object obj, int i10, boolean z10) {
        this.f307a = i10;
        this.f309g = obj;
        this.f308d = true;
    }

    public /* synthetic */ g(Object obj, boolean z10, int i10) {
        this.f307a = i10;
        this.f309g = obj;
        this.f308d = z10;
    }

    public g(a1 a1Var) {
        this.f307a = 13;
        br.l.e(a1Var, "timeLine");
        this.f309g = a1Var;
        this.f308d = a1Var.p();
    }

    public g(w1 w1Var) {
        this.f307a = 12;
        br.l.e(w1Var, "timeLine");
        this.f309g = w1Var;
        this.f308d = w1Var.p();
    }

    public g(boolean z10, String[] strArr) {
        this.f307a = 6;
        this.f308d = z10;
        this.f309g = strArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(s3.f fVar, boolean z10) {
        this(14, fVar);
        this.f307a = 14;
        this.f308d = z10;
    }

    public void w() {
    }

    public void x() {
    }
}
