package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class of3 implements n51, zb3, u9, e41, rd2, ad0, dp2, iq3, ug2, xp3, y23, o93, dj0, xh3, kl3 {
    public static of3 h;
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ of3(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public static final of3 f(Context context) {
        of3 of3Var;
        synchronized (of3.class) {
            try {
                if (h == null) {
                    h = new of3(context);
                }
                of3Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return of3Var;
    }

    @Override // defpackage.ad0
    public void C(r2 r2Var) {
        try {
            ((b82) this.g).a(r2Var.d());
        } catch (RemoteException e) {
            gi2.c0("", e);
        }
    }

    @Override // defpackage.n51
    public View H(int i) {
        return ((ho0) this.g).u(i);
    }

    @Override // defpackage.n51
    public int J() {
        return ((ho0) this.g).G();
    }

    @Override // defpackage.n51
    public int R(View view) {
        return view.getBottom() + ((io0) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((io0) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.zb3
    public /* synthetic */ void S(long j, kz2 kz2Var) {
        zt0.L(j, kz2Var, (jg1[]) ((xb4) this.g).h);
    }

    @Override // defpackage.u9
    public void U(rh rhVar) {
        bu1 bu1Var = (bu1) this.g;
        synchronized (bu1Var.i) {
            try {
                bu1Var.l = null;
                if (((vw1) bu1Var.j) != null) {
                    bu1Var.j = null;
                }
                bu1Var.i.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xp3
    /* renamed from: a */
    public n70 mo9a() {
        Bundle bundle;
        String str;
        HashMap map;
        xn3 xn3VarA;
        i53 i53Var = (i53) this.g;
        iz1 iz1Var = mz1.Ib;
        tw1 tw1Var = tw1.e;
        String lowerCase = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue() ? i53Var.e.g.toLowerCase(Locale.ROOT) : i53Var.e.g;
        if (((Boolean) tw1Var.c.a(mz1.L1)).booleanValue()) {
            nw2 nw2Var = i53Var.h;
            synchronized (nw2Var) {
                bundle = new Bundle(nw2Var.f);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (((Boolean) tw1Var.c.a(mz1.C4)).booleanValue()) {
            ed2 ed2VarM = hg4.C.h.g().m();
            str = (TextUtils.isEmpty(ed2VarM.e) || ed2VarM.g == null) ? "EMPTY" : ed2VarM.b() ? "VALID" : "INVALID";
        } else {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) tw1Var.c.a(mz1.U1)).booleanValue()) {
            j23 j23Var = i53Var.c;
            String str3 = i53Var.j;
            synchronized (j23Var) {
                try {
                    xn3 xn3VarA2 = j23Var.a(str3, lowerCase);
                    xn3 xn3VarI = j23Var.i(lowerCase);
                    map = new HashMap();
                    Iterator it = ((un3) xn3VarA2.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str4 = (String) entry.getKey();
                        if (xn3VarI.containsKey(str4)) {
                            m23 m23Var = (m23) xn3VarI.get(str4);
                            List list = (List) entry.getValue();
                            map.put(str4, new m23(str4, m23Var.b, m23Var.c, m23Var.d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                        }
                    }
                    yq2 yq2VarA = xn3VarI.entrySet().a();
                    while (yq2VarA.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) yq2VarA.next();
                        String str5 = (String) entry2.getKey();
                        if (!map.containsKey(str5) && ((m23) entry2.getValue()).d) {
                            map.put(str5, (m23) entry2.getValue());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i53Var.b(arrayList, map);
        } else {
            j23 j23Var2 = i53Var.c;
            Iterator it2 = ((un3) j23Var2.a(i53Var.j, lowerCase).entrySet()).iterator();
            while (it2.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it2.next();
                String str6 = (String) entry3.getKey();
                List list2 = (List) entry3.getValue();
                Bundle bundle3 = i53Var.e.d.r;
                arrayList.add(i53Var.c(str6, list2, bundle3 != null ? bundle3.getBundle(str6) : null, true, true));
            }
            synchronized (j23Var2) {
                xn3VarA = TextUtils.isEmpty(hg4.C.h.g().m().e) ? xn3.l : xn3.a(j23Var2.b);
            }
            i53Var.b(arrayList, xn3VarA);
        }
        xm3 xm3VarM = xm3.m(arrayList);
        yi1 yi1Var = new yi1(arrayList, bundle2, str2, 5);
        pq3 pq3Var = i53Var.a;
        cq3 cq3Var = new cq3(xm3VarM, true, false);
        cq3Var.u = new bq3(cq3Var, yi1Var, pq3Var);
        cq3Var.v();
        return cq3Var;
    }

    @Override // defpackage.xh3
    public void b(byte[] bArr, byte[] bArr2) {
        os1 os1Var = (os1) this.g;
        int i = os1Var.W;
        int i2 = (os1Var.g2 ^ i) ^ os1Var.E;
        os1Var.E = i2;
        int i3 = os1Var.U;
        int i4 = i2 & i3;
        int i5 = ~i3;
        int i6 = os1Var.S0;
        int i7 = os1Var.l1;
        int i8 = i6 & i7;
        int i9 = os1Var.E1;
        int i10 = (((i8 & i9) ^ os1Var.Y0) & (~os1Var.j)) ^ os1Var.m1;
        int i11 = os1Var.l0;
        int i12 = (i ^ (i10 | i11)) ^ os1Var.A;
        os1Var.A = i12;
        int i13 = os1Var.e;
        int i14 = i12 & i13;
        int i15 = i12 ^ i13;
        int i16 = os1Var.I;
        int i17 = i13 | i12;
        int i18 = (~i13) & i12;
        int i19 = i13 | i18;
        int i20 = (~i12) & i13;
        int i21 = i16 | i20;
        int i22 = (~i20) & i13;
        int i23 = i16 | i22;
        int i24 = ((os1Var.Q1 ^ i8) ^ os1Var.S1) ^ os1Var.c1;
        int i25 = os1Var.L0;
        int i26 = os1Var.l ^ ((~i25) & i8);
        int i27 = (((((~i26) & i9) ^ os1Var.b2) ^ os1Var.T0) ^ os1Var.m0) ^ os1Var.m;
        os1Var.m = i27;
        int i28 = (i24 ^ ((i26 ^ os1Var.V1) | i11)) ^ os1Var.O;
        os1Var.O = i28;
        int i29 = os1Var.F1;
        int i30 = i29 & i28;
        int i31 = ~i28;
        int i32 = i29 & i31;
        int i33 = (os1Var.v0 ^ os1Var.X1) ^ os1Var.B;
        int i34 = os1Var.g;
        int i35 = os1Var.S;
        int i36 = i35 ^ (i34 | i35);
        int i37 = (os1Var.K0 ^ i36) ^ os1Var.W1;
        int i38 = os1Var.K;
        int i39 = os1Var.x ^ (i33 ^ (i37 & (~i38)));
        int i40 = os1Var.k1;
        int i41 = i39 & i40;
        int i42 = os1Var.F;
        int i43 = i42 ^ i41;
        int i44 = os1Var.j0;
        int i45 = i39 & i44;
        int i46 = os1Var.h;
        int i47 = ~i46;
        int i48 = os1Var.Z0;
        int i49 = i48 ^ ((i44 ^ i45) & i47);
        int i50 = os1Var.p;
        int i51 = i50 | i49;
        int i52 = i39 & i48;
        int i53 = os1Var.i2;
        int i54 = i53 ^ i52;
        int i55 = os1Var.f1;
        int i56 = (i55 ^ (i39 & i55)) ^ i46;
        int i57 = i39 & (~i48);
        int i58 = os1Var.u0;
        int i59 = ((i58 ^ i57) ^ i46) ^ os1Var.J1;
        int i60 = i48 ^ (i39 & (~i42));
        int i61 = i53 ^ (i39 & (~i44));
        int i62 = (i40 ^ (i46 & (os1Var.C ^ (i39 & (~i58))))) ^ os1Var.H1;
        int i63 = os1Var.N;
        int i64 = i62 | i63;
        int i65 = os1Var.D0 ^ (i54 ^ ((i58 ^ i45) & i47));
        int i66 = ~i63;
        int i67 = os1Var.s1 ^ ((i65 & i66) ^ i59);
        os1Var.s1 = i67;
        int i68 = os1Var.e0;
        int i69 = ~i67;
        int i70 = i68 & i69;
        int i71 = os1Var.e1;
        int i72 = i71 & i69;
        int i73 = i68 & i72;
        int i74 = os1Var.s;
        int i75 = i74 & i69;
        int i76 = ~i71;
        int i77 = i67 & i76;
        int i78 = i77 ^ os1Var.q1;
        os1Var.q1 = i78;
        int i79 = i71 ^ (i68 & i77);
        int i80 = os1Var.u;
        int i81 = i67 & i80;
        int i82 = i67 ^ i71;
        int i83 = i82 ^ i68;
        int i84 = i68 & i82;
        int i85 = (~i82) & i68;
        int i86 = i68 & i67;
        int i87 = i71 | i67;
        int i88 = i82 ^ ((~(i87 & i76)) & i68);
        os1Var.w0 = i88;
        int i89 = i67 & i74;
        int i90 = i67 & i71;
        int i91 = ~i90;
        int i92 = i68 & i91;
        int i93 = i71 & i91;
        int i94 = i68 & i90;
        int i95 = i67 ^ i94;
        os1Var.z = i95;
        int i96 = i53 ^ i39;
        int i97 = i96 | i46;
        int i98 = i50 | (i61 ^ (i96 & i47));
        int i99 = os1Var.c0 ^ (((i43 ^ i97) ^ i98) ^ (((i60 ^ ((i55 ^ i57) & i47)) ^ (i50 | ((i48 ^ (i39 & (~i55))) ^ i97))) & i66));
        os1Var.c0 = i99;
        int i100 = i56 ^ i51;
        int i101 = i99 | i2;
        int i102 = i99 & i5;
        int i103 = (((i61 ^ (i57 & i47)) ^ os1Var.L1) ^ i64) ^ os1Var.Y;
        os1Var.Y = i103;
        int i104 = i19 ^ (i103 | i12);
        int i105 = (~i104) & i16;
        int i106 = ~i16;
        int i107 = ~i103;
        int i108 = i18 & i107;
        int i109 = i14 ^ i108;
        int i110 = i103 | i17;
        int i111 = i16 & (i22 ^ i110);
        int i112 = i13 & i107;
        int i113 = (i13 ^ i112) ^ (i16 | i15);
        int i114 = i15 ^ i112;
        int i115 = i17 ^ (i103 | i15);
        int i116 = i103 | i22;
        int i117 = i15 ^ i116;
        int i118 = i103 | i18;
        int i119 = i15 ^ i118;
        int i120 = (i12 ^ i108) & i16;
        int i121 = i14 ^ (i19 & i107);
        int i122 = i12 ^ i116;
        int i123 = i12 ^ i118;
        int i124 = i16 & i123;
        int i125 = i16 | i123;
        int i126 = i18 ^ i110;
        int i127 = i20 ^ ((i19 ^ (i15 & i107)) & i106);
        int i128 = i20 & i107;
        int i129 = (i100 ^ (i63 | ((i52 & i47) ^ os1Var.O1))) ^ os1Var.G;
        os1Var.G = i129;
        int i130 = os1Var.q;
        int i131 = i130 & i129;
        int i132 = i129 & i31;
        int i133 = i29 & i132;
        int i134 = i132 ^ i30;
        int i135 = os1Var.T1;
        int i136 = i135 & i134;
        int i137 = (~i134) & i135;
        int i138 = ~i129;
        int i139 = i130 & i138;
        int i140 = os1Var.i;
        int i141 = i139 & i140;
        int i142 = i129 | i28;
        int i143 = i142 ^ i32;
        int i144 = i135 & i143;
        int i145 = (~i143) & i135;
        int i146 = ~i135;
        int i147 = ~i142;
        int i148 = i135 & i147;
        int i149 = i29 & i142;
        int i150 = i142 ^ i29;
        int i151 = i28 ^ (i29 & i147);
        int i152 = i142 & i31;
        int i153 = i152 ^ i29;
        int i154 = i135 & (~i153);
        int i155 = i135 & i153;
        int i156 = i152 ^ i133;
        int i157 = i156 ^ os1Var.n;
        int i158 = (~(i129 ^ i139)) & i140;
        int i159 = i29 & i28 & i129;
        int i160 = i129 ^ i28;
        int i161 = i29 & (~i160);
        int i162 = (i160 ^ i32) ^ i135;
        int i163 = i160 ^ i30;
        int i164 = i135 & (i142 ^ i161);
        int i165 = i28 & i138;
        int i166 = i135 & (~(i29 & i138));
        int i167 = i140 & i138;
        int i168 = os1Var.i0;
        int i169 = os1Var.a0 & (~(i168 & (~i36)));
        int i170 = (((os1Var.F0 ^ (i36 & i168)) ^ i169) ^ os1Var.U0) ^ os1Var.d;
        os1Var.d = i170;
        int i171 = os1Var.R1;
        int i172 = ~i170;
        int i173 = os1Var.J ^ (i171 & i172);
        int i174 = os1Var.Y1;
        int i175 = (~i173) & i174;
        int i176 = os1Var.M1;
        int i177 = i176 & i172;
        int i178 = os1Var.t;
        int i179 = (i178 ^ i177) & i174;
        int i180 = os1Var.X;
        int i181 = i180 & i170;
        int i182 = ~i6;
        int i183 = i180 & i9 & i170;
        int i184 = i183 & i182;
        os1Var.i0 = i184;
        int i185 = os1Var.t1 ^ (i170 | os1Var.G1);
        int i186 = os1Var.D1 ^ (i170 | os1Var.r);
        int i187 = (~(os1Var.q0 ^ (os1Var.E0 & i172))) & i174;
        int i188 = i9 & i172;
        int i189 = i180 & i188;
        int i190 = i180 & (i170 | i188);
        int i191 = i170 & (~i9);
        int i192 = i6 & (i191 ^ i189);
        int i193 = os1Var.P;
        int i194 = i193 & (i170 ^ i192);
        int i195 = ~i191;
        int i196 = i180 & i195;
        int i197 = i170 & i195;
        int i198 = i180 & (~i197);
        int i199 = i191 ^ i196;
        int i200 = i193 & ((i6 & (~i199)) ^ i199);
        int i201 = i93 ^ i70;
        int i202 = i82 ^ i86;
        int i203 = i193 & (~(i191 ^ os1Var.n0));
        int i204 = os1Var.f0;
        int i205 = i204 & (~((i199 ^ (i191 & i182)) ^ i203));
        int i206 = i9 | i170;
        int i207 = i206 | i6;
        int i208 = (i180 & (~i206)) ^ i9;
        os1Var.g = i208;
        int i209 = i193 & (~(i9 ^ (i208 & i182)));
        int i210 = i197 ^ i181;
        int i211 = i210 ^ i6;
        int i212 = i210 | i6;
        int i213 = i193 & (~((i9 ^ i181) ^ i207));
        int i214 = os1Var.P1 ^ (os1Var.h0 & i172);
        int i215 = i9 ^ i170;
        int i216 = i211 ^ (i193 & (~(i170 ^ (i6 & (i180 & (~i215))))));
        os1Var.p2 = i216;
        int i217 = i204 & (~(i184 ^ (i193 & (i208 ^ (i215 & i182)))));
        int i218 = i215 ^ i198;
        os1Var.m2 = i218;
        int i219 = i218 ^ i212;
        os1Var.o2 = i219;
        int i220 = i219 ^ i194;
        int i221 = i215 ^ i196;
        os1Var.F0 = i221;
        int i222 = ((i221 ^ i213) & i204) ^ i216;
        os1Var.G1 = i222;
        int i223 = i222 ^ i38;
        os1Var.K = i223;
        int i224 = os1Var.C1;
        int i225 = i224 & (i78 ^ (i223 | i79));
        int i226 = (i82 ^ i73) ^ (i223 | i94);
        os1Var.R0 = i226;
        int i227 = i224 & (~(i95 ^ (i223 | i83)));
        int i228 = i223 | i93;
        int i229 = i224 & (~(i78 ^ (i223 | i87)));
        int i230 = ~i223;
        int i231 = i88 ^ (i202 & i230);
        int i232 = i67 | (i74 ^ (os1Var.x1 & i230));
        int i233 = i223 | i74;
        int i234 = i224 & ((i90 ^ i92) ^ (i223 | i201));
        int i235 = os1Var.j1 & i230;
        int i236 = i74 ^ i235;
        int i237 = i83 ^ (i223 | (i82 ^ i84));
        int i238 = i80 ^ (i223 | os1Var.p1);
        os1Var.p1 = i238;
        int i239 = i27 & (~(i238 ^ i89));
        int i240 = os1Var.K1;
        int i241 = (i188 ^ i183) & i182;
        int i242 = i87 ^ i73;
        int i243 = i72 ^ i86;
        int i244 = os1Var.Z1 ^ (i223 | i240);
        int i245 = i27 & (~(i244 ^ i75));
        int i246 = i244 ^ i81;
        int i247 = i224 & (~(i242 ^ i223));
        int i248 = i13 ^ i233;
        os1Var.T0 = i248;
        int i249 = i27 & (i13 ^ (i248 & i69));
        int i250 = os1Var.u1;
        int i251 = (i248 ^ i232) ^ i245;
        int i252 = i224 & (~(i86 & i223));
        int i253 = (i236 ^ (i67 | (i240 ^ i235))) ^ i239;
        int i254 = i74 ^ i233;
        int i255 = i238 ^ (i254 | i67);
        os1Var.s = i255;
        int i256 = i255 ^ i249;
        int i257 = i256 ^ (i251 & i250);
        os1Var.x1 = i257;
        int i258 = i257 ^ os1Var.b0;
        os1Var.b0 = i258;
        int i259 = (i256 ^ (i250 | i251)) ^ i11;
        os1Var.l0 = i259;
        int i260 = i246 ^ (i27 & (~(i254 ^ (i67 & (i80 ^ i233)))));
        os1Var.x0 = (i260 ^ (i250 | i253)) ^ os1Var.x0;
        int i261 = (i260 ^ (i253 & i250)) ^ i180;
        os1Var.l = i261;
        int i262 = (i202 ^ (i223 & i91)) ^ i225;
        int i263 = i224 & (~((i87 ^ i85) ^ (i243 & i230)));
        int i264 = (i68 ^ (i223 | i202)) ^ i234;
        int i265 = i237 ^ (i224 & (~((i67 ^ i84) & i230)));
        int i266 = ((((i215 ^ i190) ^ i241) ^ i209) ^ i217) ^ os1Var.b1;
        os1Var.b1 = i266;
        int i267 = os1Var.t0 ^ i266;
        int i268 = os1Var.c;
        int i269 = ~i268;
        int i270 = os1Var.k;
        int i271 = ~i266;
        int i272 = i270 & i271;
        int i273 = i12 & (i266 ^ i272);
        int i274 = i16 ^ i266;
        int i275 = i270 & (~i274);
        int i276 = i270 & i266;
        int i277 = i12 & i271;
        int i278 = i16 | i266;
        int i279 = i12 & (i278 ^ (i267 & i269));
        int i280 = i278 ^ i270;
        int i281 = i270 & i278;
        int i282 = i268 & (~(i275 ^ i278));
        int i283 = i268 | (i266 ^ i281);
        int i284 = i270 & (~i278);
        int i285 = i278 & i271;
        int i286 = i285 ^ i272;
        int i287 = i268 | i286;
        int i288 = i12 & (i286 ^ os1Var.R);
        int i289 = i266 & i16;
        int i290 = i289 ^ os1Var.c2;
        int i291 = i289 ^ i281;
        os1Var.j1 = i291;
        int i292 = i268 | i291;
        int i293 = i289 ^ os1Var.s0;
        int i294 = i29 & (~((i285 ^ (i290 & i269)) ^ (i12 & (~(i268 | i293)))));
        int i295 = i293 & i269;
        int i296 = i29 & (~(i282 ^ (i12 & (i291 ^ i295))));
        int i297 = i270 & i289;
        int i298 = i289 ^ i276;
        os1Var.Q1 = i298;
        int i299 = i298 ^ i287;
        os1Var.J0 = i299;
        int i300 = ((i299 ^ i277) ^ i296) ^ i63;
        os1Var.N = i300;
        int i301 = i284 & i269;
        int i302 = i289 ^ i270;
        int i303 = i12 & (~(i302 ^ i295));
        int i304 = i289 ^ i297;
        int i305 = i29 & (~((i289 ^ i295) ^ (i12 & (i304 ^ (i302 & i269)))));
        int i306 = (((i280 ^ i283) ^ i303) ^ i305) ^ i9;
        os1Var.E1 = i306;
        os1Var.T = (((i302 ^ (i278 & i269)) ^ i279) ^ i294) ^ os1Var.T;
        int i307 = i270 & i266 & i106;
        int i308 = i29 & (((i16 ^ i307) ^ i301) ^ i288);
        int i309 = os1Var.H ^ ((((i274 ^ i307) ^ i292) ^ i273) ^ i308);
        os1Var.H = i309;
        int i310 = os1Var.o ^ ((((i215 ^ i180) ^ i6) ^ i200) ^ i205);
        os1Var.o = i310;
        int i311 = os1Var.d1;
        int i312 = ~i310;
        int i313 = (i311 & i312) ^ i68;
        int i314 = os1Var.B0;
        int i315 = i186 ^ (i174 & (~(os1Var.A1 ^ (i170 | i314))));
        int i316 = os1Var.z1;
        int i317 = ~i316;
        int i318 = i170 & (~i314);
        int i319 = i214 ^ (i174 & (~(os1Var.e2 & i172)));
        int i320 = os1Var.a2;
        int i321 = i174 & (~(i176 ^ (i170 & (~i320))));
        int i322 = i108 ^ (i121 & i106);
        int i323 = i126 ^ i124;
        int i324 = i126 ^ (i115 & i106);
        int i325 = i2 & i5;
        int i326 = i316 | ((os1Var.j2 & i172) ^ i175);
        int i327 = i170 | os1Var.g1;
        int i328 = os1Var.N0;
        int i329 = os1Var.Q ^ (((i328 ^ i327) ^ os1Var.I1) ^ (i315 & i317));
        os1Var.Q = i329;
        int i330 = ~i329;
        int i331 = i250 | ((i128 ^ (i104 & i106)) ^ ((i114 ^ i23) & i330));
        int i332 = (((i114 ^ i111) ^ (i329 | i127)) ^ i331) ^ i46;
        os1Var.h = i332;
        int i333 = i332 | i300;
        os1Var.w1 = i333;
        int i334 = ~i300;
        os1Var.W = i333 & i334;
        os1Var.v0 = i332 & i334;
        int i335 = i332 & i300;
        os1Var.L1 = i335;
        os1Var.H1 = i300 & (~i335);
        os1Var.n0 = i300 & (~i332);
        int i336 = i332 ^ i300;
        os1Var.I1 = i336;
        int i337 = os1Var.v ^ (((i122 ^ i105) ^ (i324 & i330)) ^ ((i119 ^ (i329 | i119)) | i250));
        os1Var.v = i337;
        int i338 = ((i103 ^ (i122 & i106)) ^ (i113 & i330)) | i250;
        int i339 = ((i323 ^ (i329 | i120)) ^ ((i322 ^ (i329 | (i108 ^ i21))) & (~i250))) ^ i204;
        os1Var.f2 = i339;
        int i340 = i339 & i261;
        int i341 = (~(i261 ^ i339)) & i306;
        int i342 = os1Var.V ^ (((i117 ^ i125) ^ ((i103 ^ (i109 & i106)) & i330)) ^ i338);
        os1Var.V = i342;
        int i343 = i342 & i334;
        os1Var.m1 = i343;
        os1Var.r0 = i300 ^ i343;
        os1Var.a1 = i342 & i300;
        int i344 = os1Var.M ^ (((i320 ^ (i170 | os1Var.d2)) ^ i179) ^ i326);
        os1Var.M = i344;
        int i345 = ~i344;
        int i346 = i2 & i345;
        int i347 = i99 | i346;
        int i348 = i2 & i344;
        int i349 = i99 & (i344 ^ i325);
        int i350 = (i344 ^ i224) ^ i310;
        int i351 = i68 ^ i344;
        int i352 = i224 & (~i351);
        int i353 = i351 ^ i224;
        int i354 = i224 & i345;
        int i355 = i310 & i344;
        int i356 = i3 | i344;
        int i357 = (~i356) & i2;
        int i358 = i68 & i345;
        int i359 = i224 & i358;
        int i360 = i310 | i359;
        int i361 = i224 & (~i358);
        int i362 = i2 | (i310 & (i358 ^ i359));
        int i363 = i344 | i358;
        int i364 = i310 & (i363 ^ i224);
        int i365 = i2 & i3 & i344;
        int i366 = i3 ^ i344;
        int i367 = i344 ^ (i2 & i366);
        int i368 = (~i367) & i99;
        int i369 = i367 | i99;
        int i370 = (~i366) & i2;
        int i371 = ~i99;
        int i372 = i370 & i371;
        os1Var.f1 = (i344 ^ i365) ^ i372;
        int i373 = i165 ^ i133;
        int i374 = i356 ^ i348;
        int i375 = i363 ^ i352;
        int i376 = i344 ^ i354;
        int i377 = i3 & i345;
        int i378 = i344 | i377;
        int i379 = i2 & i378;
        int i380 = i378 ^ i325;
        int i381 = (~i377) & i2;
        int i382 = i377 ^ i4;
        os1Var.a0 = (i366 ^ i381) ^ (i382 & i371);
        int i383 = i382 ^ i99;
        int i384 = (i377 ^ i357) & i371;
        int i385 = i99 | (i356 ^ i381);
        int i386 = i344 & i5;
        int i387 = i344 & (~i386);
        int i388 = i387 ^ i4;
        int i389 = i388 ^ i101;
        int i390 = i388 ^ i347;
        int i391 = i387 ^ i369;
        int i392 = i387 ^ i348;
        os1Var.Z1 = i368 ^ i392;
        os1Var.J = i99 | i392;
        int i393 = (i386 ^ i379) ^ i372;
        int i394 = i357 ^ ((i2 & i386) & i371);
        int i395 = i386 ^ i381;
        os1Var.B1 = i395 ^ i349;
        os1Var.r = i380 ^ (i99 & (~(i344 ^ i346)));
        int i396 = i68 & i344;
        int i397 = i224 & i396;
        int i398 = (os1Var.V0 ^ i396) & i312;
        int i399 = ~i2;
        int i400 = i344 | i68;
        int i401 = (i400 ^ i354) | i310;
        int i402 = i400 | i2;
        int i403 = os1Var.w;
        int i404 = ~i403;
        int i405 = i344 & (~i68);
        int i406 = i224 & (~i405);
        int i407 = i400 ^ i406;
        int i408 = (i407 ^ ((i396 ^ i361) & i399)) | i403;
        int i409 = i310 & (~i406);
        int i410 = os1Var.D ^ (((i353 ^ (i406 & i312)) ^ ((i376 ^ i409) & i399)) ^ ((i397 ^ i402) & i404));
        os1Var.D = i410;
        int i411 = i224 & i405;
        int i412 = i403 | (i313 ^ (i2 | i411));
        int i413 = i411 ^ i68;
        int i414 = ((i350 ^ (i2 | ((i310 & (~i413)) ^ i68))) ^ i412) ^ i6;
        os1Var.i1 = i414;
        int i415 = i165 ^ i161;
        int i416 = i185 ^ i187;
        int i417 = i156 ^ (i143 & i146);
        int i418 = i134 ^ i145;
        int i419 = (((i407 ^ i364) ^ i362) ^ (i403 | ((i376 ^ i401) ^ ((i413 ^ i355) & i399)))) ^ os1Var.d0;
        os1Var.d0 = i419;
        int i420 = (i375 ^ i398) & i399;
        int i421 = i373 ^ i155;
        int i422 = (i160 ^ i161) ^ i154;
        os1Var.g1 = i259 | (i342 & (~i419));
        int i423 = ((((i68 ^ i354) ^ i360) ^ i420) ^ i408) ^ os1Var.Z;
        os1Var.Z = i423;
        int i424 = (i319 ^ (i316 | ((i170 & (~i328)) ^ i321))) ^ os1Var.y;
        os1Var.y = i424;
        int i425 = ~i156;
        int i426 = ((i162 ^ (i424 & (i134 ^ i137))) ^ (i268 | ((i159 ^ i166) ^ ((~(i163 ^ i136)) & i424)))) ^ i25;
        os1Var.L0 = i426;
        int i427 = (((((~i422) & i424) ^ i422) & i269) ^ (i421 ^ (i424 & i425))) ^ i50;
        os1Var.p = i427;
        os1Var.h1 = i427 & i334;
        os1Var.Z0 = i336 ^ i427;
        int i428 = i424 & i158;
        os1Var.t = ((i418 ^ ((~(i373 ^ i144)) & i424)) ^ (i268 | (i417 ^ (i424 & (i415 ^ i164))))) ^ i178;
        int i429 = (((i373 ^ (i150 & i146)) ^ ((~(i149 ^ i148)) & i424)) ^ (((i151 ^ i136) ^ (i424 & i157)) & i269)) ^ os1Var.L;
        os1Var.L = i429;
        os1Var.n = i410 ^ i429;
        int i430 = i337 | i429;
        os1Var.V1 = i430;
        os1Var.U1 = (~i337) & i429;
        int i431 = i410 & i429;
        os1Var.c1 = i431;
        os1Var.P0 = i258 & i431;
        os1Var.M0 = i430;
        int i432 = (~i410) & i429;
        os1Var.A0 = i432;
        os1Var.N1 = (~i432) & i429;
        os1Var.C0 = i258 & i429;
        os1Var.v1 = i430;
        os1Var.B = i410 | i429;
        int i433 = i410 & (~i429);
        os1Var.m0 = i433;
        os1Var.b = i433 | i429;
        int i434 = (i416 ^ (i316 | (i318 ^ ((i170 & (~os1Var.H0)) & i174)))) ^ i35;
        os1Var.S = i434;
        int i435 = ((i226 ^ i252) ^ ((~i263) & i434)) ^ i170;
        os1Var.n1 = i435;
        int i436 = i435 | i261;
        int i437 = i339 & (~i436);
        int i438 = ~i306;
        int i439 = (i436 ^ i339) & i306;
        int i440 = i339 ^ ((~(i339 & i436)) & i306);
        int i441 = ~i261;
        int i442 = i436 & i441;
        int i443 = i339 & (~i442);
        int i444 = (i435 ^ i443) & i306;
        int i445 = (~(i442 ^ i437)) & i306;
        int i446 = i339 & i435;
        int i447 = ~i435;
        int i448 = i261 & i447;
        int i449 = i339 & i447;
        int i450 = (~(i261 ^ i449)) & i306;
        int i451 = i435 & i261;
        int i452 = (~(i339 & i451)) & i306;
        int i453 = (~i451) & i261;
        os1Var.y0 = (i414 & (~((i436 ^ i446) ^ ((~i453) & i306)))) ^ (i339 ^ ((i453 ^ i437) | i306));
        int i454 = i451 ^ i339;
        int i455 = i414 & ((i454 & i306) ^ i261);
        int i456 = (i451 ^ i443) ^ i341;
        os1Var.B0 = i440 ^ (i414 & (~(i449 ^ i439)));
        int i457 = i446 & i306;
        os1Var.d2 = i455 ^ i457;
        int i458 = i414 & (~i457);
        int i459 = i435 & i441;
        os1Var.X = i456 ^ (i414 & (i459 ^ i450));
        int i460 = i451 ^ (i339 & i459);
        os1Var.h2 = (i454 ^ (i436 & i438)) ^ (i414 & (~(i306 | i460)));
        int i461 = i414 & (~(i460 ^ (i435 & i306)));
        int i462 = i435 ^ i261;
        os1Var.h0 = i458 ^ ((i462 ^ i340) ^ i452);
        os1Var.N0 = ((i451 ^ (i339 & i462)) ^ i444) ^ i414;
        os1Var.M1 = ((i448 ^ (i339 & (~i462))) ^ i445) ^ i461;
        int i463 = (i262 ^ (((i201 ^ i228) ^ i229) & i434)) ^ os1Var.f;
        os1Var.f = i463;
        int i464 = i170 ^ i190;
        int i465 = i181 & i182;
        int i466 = i242 ^ i247;
        int i467 = ~i309;
        os1Var.k1 = i309 | i463;
        int i468 = i463 ^ i423;
        int i469 = i309 | i468;
        os1Var.Q0 = i468 ^ i469;
        os1Var.d1 = i468 ^ i309;
        int i470 = i463 & i467;
        os1Var.W0 = i468 ^ i470;
        int i471 = (~i463) & i423;
        os1Var.X1 = i471 ^ (i471 & i467);
        int i472 = ~i423;
        int i473 = i463 & i472;
        os1Var.E0 = i473 & i467;
        int i474 = i463 & i423;
        os1Var.e2 = i474;
        int i475 = (~i474) & i423;
        int i476 = i309 | i475;
        os1Var.P1 = i474 ^ i476;
        os1Var.a2 = i475 ^ i476;
        os1Var.g0 = i463 ^ i476;
        os1Var.X0 = i474 ^ i309;
        os1Var.l2 = i474 & i467;
        int i477 = i423 | i463;
        int i478 = i477 & i467;
        os1Var.C = i475 ^ i478;
        os1Var.A1 = (i309 | i477) ^ i477;
        os1Var.u0 = i474 ^ i478;
        os1Var.n2 = i477 ^ (i309 | i423);
        int i479 = (i477 & i472) | i309;
        os1Var.t1 = i423 ^ i479;
        os1Var.c2 = i473 ^ i479;
        os1Var.V0 = i477 ^ i469;
        os1Var.z0 = i477 ^ i470;
        os1Var.g2 = i471 ^ i470;
        os1Var.x = (i265 ^ (i434 & i466)) ^ i39;
        int i480 = ((i434 & (~i264)) ^ (i231 ^ i227)) ^ i7;
        os1Var.l1 = i480;
        int i481 = i480 & i438;
        os1Var.D0 = i481;
        os1Var.K0 = (~i481) & i480;
        os1Var.b2 = i480 & i306;
        int i482 = (~i480) & i306;
        os1Var.S1 = i482;
        os1Var.H0 = i482 | i480;
        os1Var.s0 = i306 | i480;
        os1Var.J1 = i480 & i426;
        int i483 = (i220 ^ (i204 & ((i193 & (~(i189 ^ (i170 & i182)))) ^ (i464 ^ i465)))) ^ os1Var.a;
        os1Var.a = i483;
        os1Var.t0 = i383 ^ (i483 | (i374 ^ i384));
        os1Var.o0 = i390 ^ (i483 | i394);
        int i484 = ~i483;
        int i485 = os1Var.k0;
        os1Var.r1 = (((i389 ^ (i393 & i484)) & i485) ^ ((i395 ^ i384) ^ ((i380 ^ i385) | i483))) ^ os1Var.r1;
        int i486 = i483 & i138;
        int i487 = (i130 & (i129 | i486)) ^ i483;
        os1Var.R = i487;
        os1Var.Y0 = (i487 ^ i141) & i424;
        int i488 = i130 & i486;
        os1Var.j2 = i488;
        int i489 = (~i486) & i140;
        os1Var.R1 = i486 ^ i488;
        os1Var.o1 = (~(i102 ^ (i391 & i484))) & i485;
        int i490 = i483 | i129;
        int i491 = i130 & (~i490);
        os1Var.y1 = i491;
        os1Var.O0 = i485 & (~(i428 ^ (i491 ^ i167)));
        os1Var.O1 = (~(i490 ^ i131)) & i140;
        os1Var.i2 = (~(i490 ^ i130)) & i140;
        int i492 = i129 & i484;
        int i493 = i129 & (~i492);
        os1Var.p0 = i493;
        os1Var.I0 = i493 ^ i131;
        os1Var.S0 = i130 & i492;
        int i494 = i492 ^ i130;
        int i495 = (~i140) & i494;
        os1Var.q0 = (~i495) & i424;
        os1Var.W1 = i494 ^ i489;
        os1Var.k2 = (i491 ^ i495) & i424;
        os1Var.f0 = (i130 & i483) ^ i483;
        int i496 = i483 ^ i129;
        os1Var.U0 = i496;
        os1Var.D1 = ((i496 ^ i130) & i140) ^ i487;
    }

    @Override // defpackage.o93
    public /* synthetic */ Object c(Object obj) {
        if (((Boolean) n02.c.w()).booleanValue()) {
            ((aa3) this.g).a();
        }
        return obj;
    }

    @Override // defpackage.kl3
    public /* synthetic */ Iterator d(sq0 sq0Var, CharSequence charSequence) {
        return new gl3(charSequence, (yk3) this.g, 0);
    }

    public void e() {
        ((kw) this.g).z.L();
    }

    public void g(ImageView.ScaleType scaleType) {
        f22 f22Var = ((NativeAdView) this.g).g;
        if (f22Var == null || scaleType == null) {
            return;
        }
        try {
            f22Var.z1(new oi0(scaleType));
        } catch (RemoteException e) {
            gi2.c0("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public void h() {
        synchronized (of3.class) {
            wt2 wt2Var = (wt2) this.g;
            wt2Var.m("vendor_scoped_gpid_v2_id");
            wt2Var.m("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // defpackage.dj0
    public void i(gi4 gi4Var) {
        sf3 sf3Var = (sf3) this.g;
        if (gi4Var.d) {
            sf3Var.cancel(false);
            return;
        }
        if (gi4Var.c()) {
            sf3Var.d(gi4Var.b());
            return;
        }
        Exception excA = gi4Var.a();
        if (excA == null) {
            throw new IllegalStateException();
        }
        sf3Var.e(excA);
    }

    @Override // defpackage.e41
    public void j(bw bwVar) {
        ((lz) this.g).a(bwVar);
    }

    @Override // defpackage.n51
    public int l() {
        ho0 ho0Var = (ho0) this.g;
        return ho0Var.o - ho0Var.D();
    }

    @Override // defpackage.iq3
    public /* synthetic */ void p(Object obj) {
        ((ky2) this.g).c.B((h83) obj);
    }

    @Override // defpackage.n51
    public int r(View view) {
        return (view.getTop() - ((io0) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((io0) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.ug2
    public /* synthetic */ void v(String str, int i, String str2, boolean z) {
        ag2 ag2Var = (ag2) this.g;
        ag2Var.L0();
        ag2Var.e0().U();
    }

    @Override // defpackage.y23
    public void w(el2 el2Var) {
        y73 y73Var = (y73) this.g;
        iu2 iu2Var = (iu2) el2Var;
        synchronized (y73Var) {
            try {
                y73Var.i = iu2Var;
                if (((Boolean) tw1.e.c.a(mz1.T3)).booleanValue()) {
                    iu2Var.u.a = y73Var.h;
                }
                y73Var.i.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public of3(Context context) {
        this.f = 0;
        if (wt2.i == null) {
            wt2.i = new wt2(context, 4);
        }
        this.g = wt2.i;
        kf3.U(context);
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        switch (this.f) {
            case 16:
                bn2 bn2Var = (bn2) obj;
                String message = ((pq2) this.g).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                bn2Var.s(zt0.Q(12, message, null));
                break;
            case 17:
                ((bo2) obj).h((dg4) this.g);
                break;
            default:
                ((ov1) obj).S0((nv1) this.g);
                break;
        }
    }

    public of3(b62 b62Var, x52 x52Var) {
        this.f = 13;
        this.g = x52Var;
        Objects.requireNonNull(b62Var);
    }

    public of3(h82 h82Var, b82 b82Var) {
        this.f = 14;
        this.g = b82Var;
    }

    public of3(th2 th2Var, Context context, String str, xe4 xe4Var) {
        this.f = 15;
        da4 da4VarA = da4.a(context);
        da4 da4VarA2 = da4.a(xe4Var);
        da4 da4VarA3 = da4.a(str);
        ba4 ba4Var = th2Var.j;
        ba4 ba4VarA = ba4.a(new ri2(ba4Var, 23));
        ba4 ba4VarA2 = ba4.a(new u43(th2Var.I0, 7));
        this.g = ba4.a(new nz1(da4VarA, da4VarA2, da4VarA3, ba4.a(new ic2(da4VarA, (ga4) th2Var.c, (ca4) th2Var.D, ba4VarA, ba4VarA2, 18)), ba4VarA, ba4VarA2, th2Var.h, th2Var.E, ba4Var));
    }

    public of3(byte[] bArr) {
        this.f = 27;
        this.g = new byte[256];
        for (int i = 0; i < 256; i++) {
            ((byte[]) this.g)[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = (byte[]) this.g;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
    }

    @Override // defpackage.rd2, defpackage.y23
    /* renamed from: a */
    public void mo8a() {
        switch (this.f) {
            case 13:
                x52 x52Var = (x52) this.g;
                gi2.G("Rejecting reference for JS Engine.");
                if (((Boolean) tw1.e.c.a(mz1.g8)).booleanValue()) {
                    x52Var.v("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    return;
                } else {
                    x52Var.u();
                    return;
                }
            default:
                y73 y73Var = (y73) this.g;
                synchronized (y73Var) {
                    y73Var.i = null;
                }
                return;
        }
    }
}
