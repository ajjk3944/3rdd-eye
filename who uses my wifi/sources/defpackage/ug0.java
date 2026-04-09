package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ug0 implements yi, rd0, m2, md0, vo1, ks1, sd3, f41, ws2, dp2, ug2, iq3, oy2, ch3, y23 {
    public static final ts0 h = new ts0();
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ ug0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public static String q(String str, ku kuVar, boolean z) throws NoSuchAlgorithmException {
        String strConcat = kuVar.f;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return ex0.h("lottie_cache_", strReplaceAll, strConcat);
    }

    public static void r(Context context, b3 b3Var, wm0 wm0Var) {
        mz1.a(context);
        if (((Boolean) q02.j.w()).booleanValue()) {
            if (((Boolean) tw1.e.c.a(mz1.Wb)).booleanValue()) {
                uu1.b.execute(new gi(context, b3Var, wm0Var));
                return;
            }
        }
        new l92(context, b3Var.a).L(wm0Var);
    }

    public int A() {
        int iOptInt = ((JSONObject) this.g).optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // defpackage.vo1
    public File a() {
        return (File) this.g;
    }

    @Override // defpackage.ks1
    public void b(byte[] bArr, byte[] bArr2) {
        os1 os1Var = (os1) this.g;
        int i = os1Var.X;
        int i2 = os1Var.H;
        int i3 = i & i2;
        int i4 = ~i;
        int i5 = i2 & i4;
        int i6 = (~i5) & i2;
        int i7 = i | i2;
        int i8 = os1Var.X0;
        int i9 = os1Var.o;
        int i10 = i8 ^ i9;
        int i11 = (os1Var.P0 ^ i10) ^ os1Var.x0;
        int i12 = os1Var.g;
        int i13 = ~i12;
        int i14 = ((i11 & i13) ^ os1Var.n0) ^ os1Var.Z;
        os1Var.Z = i14;
        int i15 = (((i10 ^ os1Var.J0) ^ os1Var.F1) ^ os1Var.w0) ^ os1Var.D;
        os1Var.D = i15;
        int i16 = os1Var.b0;
        int i17 = ~i16;
        int i18 = os1Var.n;
        int i19 = os1Var.O0 ^ ((~os1Var.A0) & i18);
        int i20 = ~i18;
        int i21 = os1Var.I1;
        int i22 = i20 & i21;
        int i23 = os1Var.D0;
        int i24 = i22 ^ i23;
        int i25 = os1Var.L;
        int i26 = i24 & i25;
        int i27 = os1Var.D1 ^ (i18 & (~os1Var.y1));
        int i28 = i25 & (os1Var.z0 ^ (i18 & i23));
        int i29 = os1Var.F0 ^ (i18 & os1Var.z1);
        int i30 = os1Var.h0;
        int i31 = i29 ^ i28;
        int i32 = i30 | i31;
        int i33 = i30 & i31;
        int i34 = os1Var.J1 ^ (i18 & (~os1Var.K1));
        int i35 = os1Var.G1;
        int i36 = i34 ^ i26;
        int i37 = i19 ^ (i25 & (~(os1Var.x1 ^ (i18 & (~i35)))));
        int i38 = os1Var.a0 ^ (i36 ^ ((~i30) & i37));
        os1Var.a0 = i38;
        int i39 = (i38 ^ i12) ^ os1Var.K0;
        int i40 = i38 | i12;
        int i41 = os1Var.S;
        int i42 = i41 & (~i40);
        int i43 = os1Var.C;
        int i44 = (~i42) & i43;
        int i45 = os1Var.s0;
        int i46 = i45 ^ i44;
        int i47 = i38 ^ i41;
        int i48 = (~i38) & i12;
        int i49 = ~i43;
        int i50 = os1Var.i0;
        int i51 = i50 & i48 & i49;
        int i52 = os1Var.u0 ^ i48;
        int i53 = i41 & i48;
        int i54 = i46 ^ (i50 & (~(os1Var.p1 ^ (i41 & (~i48)))));
        int i55 = i38 & i12;
        int i56 = (i55 ^ i53) & i49;
        int i57 = i41 & i55;
        int i58 = i45 ^ (i43 | (i40 ^ i57));
        int i59 = i50 & (~(os1Var.E1 ^ ((i38 ^ i57) | i43)));
        int i60 = i38 ^ os1Var.e1;
        int i61 = i60 & i49;
        int i62 = i50 & i61;
        int i63 = i38 & i13;
        int i64 = i12 | i63;
        int i65 = i50 & ((i64 ^ i53) ^ i61);
        int i66 = i47 ^ (i64 & i49);
        int i67 = i50 & (~(i64 ^ os1Var.B0));
        int i68 = os1Var.K;
        int i69 = i68 & (~(i52 ^ i67));
        int i70 = (i54 ^ (i68 & ((i47 ^ (i43 & (i41 & i64))) ^ i51))) ^ os1Var.f;
        os1Var.f = i70;
        int i71 = ~i70;
        int i72 = i14 & i71;
        int i73 = i70 | i14;
        int i74 = i14 ^ i70;
        int i75 = ~(i14 & i70);
        int i76 = i15 & i71;
        int i77 = i70 | i15;
        os1Var.n0 = i76;
        int i78 = ((i66 ^ i59) ^ (i68 & (~(((i41 & (~i63)) ^ i56) ^ os1Var.Q0)))) ^ os1Var.r;
        os1Var.r = i78;
        int i79 = ((i58 ^ i65) ^ (i68 & (~((i60 ^ (i43 & (i63 ^ i53))) ^ i62)))) ^ os1Var.d;
        os1Var.d = i79;
        int i80 = os1Var.J;
        int i81 = ~i80;
        int i82 = i79 & i80;
        int i83 = os1Var.x ^ ((i39 ^ (i50 & (~(i43 & (i63 ^ (i41 & i63)))))) ^ i69);
        os1Var.x = i83;
        int i84 = i70 & i75;
        int i85 = (i36 ^ (i30 & (~i37))) ^ os1Var.k0;
        os1Var.k0 = i85;
        int i86 = os1Var.M;
        int i87 = i86 & i85;
        int i88 = os1Var.c0;
        int i89 = ~i85;
        int i90 = i88 & i89;
        int i91 = os1Var.E;
        int i92 = ~i91;
        int i93 = os1Var.H1 & i89;
        int i94 = os1Var.C0;
        int i95 = i94 ^ i93;
        int i96 = i94 ^ (os1Var.s1 & i85);
        int i97 = i88 ^ i85;
        int i98 = os1Var.b1 ^ i97;
        int i99 = i91 & (~i98);
        int i100 = i86 & i97;
        int i101 = os1Var.U0;
        int i102 = os1Var.a;
        int i103 = (~(i101 ^ ((i90 ^ i100) & i91))) & i102;
        int i104 = ((~i97) & i86) ^ i88;
        int i105 = i86 & i89;
        int i106 = os1Var.H0 ^ (i85 & (~os1Var.G0));
        int i107 = ~os1Var.R0;
        int i108 = os1Var.L0;
        int i109 = (i96 ^ (i102 & (i108 ^ (i85 & i107)))) ^ os1Var.F;
        os1Var.F = i109;
        int i110 = (i95 ^ ((i108 ^ (os1Var.g1 & i89)) & i102)) ^ os1Var.B;
        os1Var.B = i110;
        int i111 = i110 | i80;
        int i112 = i85 | i88;
        int i113 = i112 ^ os1Var.Z0;
        int i114 = i113 ^ os1Var.I0;
        int i115 = i102 & (i113 ^ ((i86 & i90) & i92));
        int i116 = i90 ^ (i86 & i112);
        int i117 = i116 & i91;
        int i118 = (~(i104 ^ (i91 & (~(i112 ^ i100))))) & i102;
        int i119 = os1Var.U;
        int i120 = ~i119;
        int i121 = i112 & i89;
        int i122 = (~i121) & i86;
        int i123 = i91 & (~i122);
        int i124 = i102 & (~(i116 ^ ((i90 ^ i122) & i92)));
        int i125 = i91 | (i121 ^ os1Var.t0);
        int i126 = i85 & (~i88) & i86;
        int i127 = (((i98 ^ i125) ^ (i102 & (i104 ^ (i91 & (~(i121 ^ i126)))))) ^ (((i104 ^ i99) ^ i118) & i120)) ^ i30;
        os1Var.h0 = i127;
        int i128 = i85 ^ i105;
        os1Var.A1 = (i106 ^ (i102 & (~(os1Var.f1 ^ (i85 & (~os1Var.A1)))))) ^ i18;
        int i129 = i102 & (~(os1Var.o0 ^ (os1Var.r0 & i85)));
        int i130 = ((os1Var.k1 ^ (i85 & (~os1Var.m1))) ^ i129) ^ os1Var.P;
        os1Var.P = i130;
        int i131 = os1Var.y0;
        int i132 = i ^ (i130 | i131);
        int i133 = i130 | i7;
        int i134 = os1Var.C1;
        int i135 = i134 ^ i133;
        int i136 = ~i130;
        int i137 = i2 & i136;
        int i138 = i3 ^ i137;
        int i139 = i134 ^ (i130 | i5);
        int i140 = i6 ^ (i134 & i136);
        int i141 = i ^ (i130 | i);
        int i142 = i131 & i136;
        int i143 = i134 ^ i130;
        int i144 = i & i136;
        int i145 = i3 ^ i144;
        int i146 = i5 & i136;
        int i147 = i ^ i144;
        int i148 = i134 ^ i142;
        int i149 = i ^ i137;
        int i150 = i130 | i2;
        int i151 = i88 & i85;
        int i152 = i85 & (~i151);
        int i153 = i102 & (i87 ^ (i91 & (~(os1Var.w1 ^ i152))));
        int i154 = i102 & (~((i152 ^ i126) ^ i123));
        int i155 = i119 | (i114 ^ (i102 & (i100 ^ (i151 & i91))));
        int i156 = i151 ^ i86;
        int i157 = i119 | ((i156 ^ (i91 | (i151 ^ i87))) ^ i103);
        int i158 = (((i156 ^ i91) ^ i115) ^ i155) ^ os1Var.j0;
        os1Var.j0 = i158;
        int i159 = i112 ^ (i86 & i151);
        int i160 = (((i159 ^ (i151 & i92)) ^ i124) ^ i157) ^ os1Var.l;
        os1Var.l = i160;
        int i161 = (((i159 ^ i117) ^ i154) ^ (((i128 ^ (i91 & i89)) ^ i153) & i120)) ^ os1Var.j;
        os1Var.j = i161;
        int i162 = i78 | i161;
        int i163 = ~i78;
        int i164 = i27 ^ (i25 & (~(i35 ^ (i18 & i21))));
        int i165 = (i164 ^ i33) ^ os1Var.I;
        os1Var.I = i165;
        int i166 = os1Var.k;
        int i167 = i165 ^ i166;
        int i168 = os1Var.e0;
        int i169 = i168 & i167;
        int i170 = os1Var.c;
        int i171 = i167 | i170;
        int i172 = (~i167) & i168;
        int i173 = ~i170;
        int i174 = os1Var.A;
        int i175 = (i166 ^ i169) & i174;
        int i176 = i167 ^ i168;
        int i177 = ~i165;
        int i178 = i166 & i177;
        int i179 = i168 & i178;
        int i180 = i170 | (i166 ^ i179);
        int i181 = ~i166;
        int i182 = i168 & i165 & i181;
        int i183 = i174 & (~(i182 ^ (i170 & i182)));
        int i184 = (i182 ^ (i179 & i173)) & i174;
        int i185 = i177 & i168;
        int i186 = i165 | i166;
        int i187 = i168 & i186;
        int i188 = (~i186) & i168;
        int i189 = i170 | i188;
        int i190 = i178 ^ i169;
        int i191 = i186 & i181;
        int i192 = i174 & (~((i191 ^ i182) ^ (i190 & i173)));
        int i193 = (~(i191 ^ i185)) & i170;
        int i194 = (os1Var.M1 ^ (i165 & os1Var.O1)) ^ os1Var.v;
        os1Var.v = i194;
        int i195 = (~i15) & i194;
        int i196 = i195 & i71;
        os1Var.O1 = i195 ^ i70;
        int i197 = i15 & i194;
        os1Var.D1 = ((~i197) & i194) ^ i76;
        os1Var.B0 = i197 ^ i70;
        os1Var.K1 = (i197 & i71) ^ i197;
        int i198 = i70 | i194;
        os1Var.Q0 = i15 ^ i198;
        os1Var.M1 = (i15 & (~i194)) ^ i196;
        os1Var.o1 = (i194 & i71) ^ i194;
        int i199 = i15 ^ i194;
        int i200 = i194 | i15;
        os1Var.x0 = i200 ^ i77;
        os1Var.n1 = i194 ^ (i200 & i71);
        os1Var.l1 = i200 ^ (i199 & i71);
        os1Var.j1 = i198;
        os1Var.B1 = i199 ^ i198;
        int i201 = i165 ^ i185;
        int i202 = i170 & i201;
        int i203 = i174 & (~(i188 ^ (i201 | i170)));
        int i204 = os1Var.s;
        int i205 = (i167 ^ i172) & i173;
        int i206 = i201 ^ i202;
        int i207 = os1Var.z ^ (((i187 ^ i180) ^ i192) ^ (((i201 ^ i193) ^ i203) & i204));
        os1Var.z = i207;
        int i208 = i207 | i162;
        int i209 = (os1Var.v1 ^ (i165 & (~os1Var.p0))) ^ os1Var.h;
        os1Var.h = i209;
        int i210 = i15 & i209;
        os1Var.v1 = i210 ^ (i210 & i17);
        int i211 = i158 & i209;
        int i212 = i16 | i209;
        int i213 = ~i209;
        os1Var.d1 = (i15 & i213) ^ i212;
        int i214 = i209 & i17;
        int i215 = i204 & (~(i206 ^ (i174 & (i165 ^ ((~i185) & i170)))));
        int i216 = os1Var.N ^ (((i176 ^ i189) ^ i184) ^ (i204 & (i205 ^ (i174 & (~(i182 ^ (i185 & i173)))))));
        os1Var.N = i216;
        int i217 = os1Var.d0;
        int i218 = i217 ^ i216;
        os1Var.L1 = i218;
        int i219 = os1Var.l0;
        int i220 = ~i219;
        int i221 = i158 & i216;
        int i222 = i209 ^ i216;
        int i223 = i222 ^ i158;
        int i224 = i158 & (~i222);
        int i225 = i216 | i217;
        int i226 = i219 | i216;
        int i227 = i216 & i213;
        int i228 = i158 & i227;
        int i229 = ~i227;
        int i230 = i83 & (i209 ^ (i158 & i229));
        int i231 = i158 & i209 & i216;
        int i232 = ~i216;
        int i233 = i209 & i232;
        int i234 = ~i233;
        int i235 = i158 & i234;
        int i236 = i158 & (i216 | i233);
        int i237 = i83 & (i227 ^ i236);
        int i238 = i158 & i233;
        int i239 = i83 & (~i238);
        int i240 = i83 & (~(i233 ^ i238));
        int i241 = i83 & (i216 ^ i221);
        int i242 = i209 | i216;
        int i243 = i158 & (~i242);
        int i244 = (os1Var.S0 ^ (os1Var.v0 & i165)) ^ os1Var.f0;
        os1Var.f0 = i244;
        int i245 = i148 ^ (i244 | (i130 | i134));
        int i246 = i244 & i81;
        int i247 = ~i110;
        int i248 = i246 ^ (i246 & i247);
        int i249 = (~(i244 ^ (i110 | i246))) & i79;
        int i250 = (i132 ^ ((~i144) & i244)) & i79;
        int i251 = i148 ^ ((~i141) & i244);
        int i252 = ~i244;
        int i253 = i143 ^ (i150 & i252);
        int i254 = i79 | (i5 ^ (i138 & i244));
        int i255 = i146 ^ (i244 & i143);
        int i256 = ~i79;
        int i257 = i244 | i79;
        int i258 = ((i250 ^ i251) ^ (i207 | ((i142 ^ (i244 & i150)) ^ (i79 | (i149 & i244))))) ^ i68;
        os1Var.K = i258;
        int i259 = i255 & i256;
        int i260 = i253 ^ i254;
        int i261 = i79 & i81;
        int i262 = i80 & i244;
        int i263 = i262 & i247;
        int i264 = i248 ^ (i263 & i256);
        int i265 = i244 ^ i80;
        int i266 = i79 & (i265 ^ i263);
        int i267 = (i265 ^ i110) ^ i249;
        int i268 = i147 & i244;
        int i269 = ~i207;
        int i270 = i80 & i252;
        int i271 = i80 & (~i270);
        int i272 = i271 ^ i111;
        int i273 = i271 ^ i263;
        int i274 = (~i273) & i79;
        int i275 = i110 | i271;
        int i276 = (~(i80 ^ i275)) & i79;
        int i277 = i262 ^ i275;
        int i278 = i80 ^ (i270 & i247);
        int i279 = i80 ^ (i79 | i278);
        int i280 = i79 & i278;
        int i281 = i270 ^ i110;
        int i282 = i265 ^ (i110 | i270);
        int i283 = i160 | (i79 & i282);
        int i284 = ((i251 ^ ((i139 ^ (i244 | i140)) & i256)) ^ (((i142 ^ i268) ^ ((i135 ^ i268) | i79)) & i269)) ^ i102;
        os1Var.a = i284;
        int i285 = i110 | i244;
        int i286 = i244 | i80;
        int i287 = i286 ^ (i248 | i79);
        int i288 = (~(i286 ^ (i265 & i247))) & i79;
        int i289 = (~i286) & i79;
        int i290 = (((i139 ^ (i244 & i4)) ^ i79) ^ (i207 | ((i137 & i244) ^ i259))) ^ i9;
        os1Var.o = i290;
        os1Var.b1 = (i260 ^ ((i245 ^ ((i148 ^ (i145 & i252)) & i256)) & i269)) ^ i204;
        int i291 = i166 & i165;
        int i292 = ~i291;
        int i293 = i174 & (~(i170 & (~(i191 ^ ((~(i166 & i292)) & i168)))));
        int i294 = i204 & (~((i165 ^ (i170 | (i291 ^ i182))) ^ i175));
        int i295 = i168 & i292;
        int i296 = os1Var.T ^ (((i176 ^ (i170 & (~i295))) ^ i293) ^ i215);
        os1Var.T = i296;
        int i297 = i209 & (~i296);
        int i298 = i15 & i297;
        int i299 = ~i297;
        int i300 = i15 & i299;
        os1Var.w0 = i298 ^ (i15 & i17);
        int i301 = i209 & i299;
        int i302 = i15 & (~i301);
        os1Var.A0 = i301 ^ i214;
        os1Var.y0 = i301 ^ (i16 | i301);
        int i303 = i301 & i17;
        int i304 = i297 ^ i210;
        int i305 = i296 ^ i209;
        os1Var.K0 = (i305 ^ i302) ^ i303;
        int i306 = i15 & (~i305);
        os1Var.E0 = (i305 ^ (i15 & i296)) ^ i16;
        int i307 = i296 & i209;
        int i308 = i15 & i307;
        os1Var.P0 = i298 ^ ((i307 ^ i302) & i17);
        int i309 = i209 | i296;
        os1Var.G0 = i304 ^ (i16 & (~(i309 ^ i308)));
        int i310 = i15 & (~i309);
        int i311 = i296 & i213;
        int i312 = i15 & i311;
        os1Var.s = (i305 ^ i312) ^ (i300 & i17);
        int i313 = i16 & (~(i309 ^ i312));
        int i314 = i209 | i311;
        os1Var.t0 = (i314 ^ i306) ^ (i304 & i17);
        int i315 = i314 ^ i310;
        os1Var.x1 = (i309 ^ i298) ^ (i315 & i17);
        os1Var.k1 = i315 ^ i313;
        os1Var.r0 = i308 ^ ((i314 ^ i300) & i17);
        int i316 = i297 ^ (i15 & (~i311));
        os1Var.q0 = i316;
        os1Var.y1 = i316 ^ i212;
        int i317 = ((((i186 ^ i295) ^ i171) ^ i183) ^ i294) ^ os1Var.R;
        os1Var.R = i317;
        int i318 = i317 & i72;
        int i319 = i110 | i318;
        int i320 = i317 & (~i73) & i247;
        os1Var.G1 = i320;
        int i321 = i317 & i70;
        int i322 = (i14 ^ i321) & i247;
        int i323 = i317 & i75;
        int i324 = i70 ^ i323;
        int i325 = i317 & i74;
        int i326 = ((i84 ^ i318) ^ (i325 & i247)) | i80;
        int i327 = i110 & (~(i84 ^ i325));
        int i328 = i72 ^ i323;
        int i329 = i317 & (~i74);
        os1Var.S0 = i329;
        int i330 = i110 | i84;
        int i331 = (i14 ^ (i110 | (i70 ^ (i317 & (~(i73 & i71)))))) & i81;
        int i332 = i73 ^ i321;
        int i333 = i110 & (~i332);
        int i334 = i110 & i332;
        int i335 = i84 ^ i317;
        os1Var.J0 = i335;
        int i336 = i335 & i247;
        int i337 = i324 ^ (i110 | i335);
        os1Var.e1 = i337;
        int i338 = i317 & i73;
        int i339 = i338 & i247;
        int i340 = i127 | (i329 ^ i339);
        int i341 = i72 ^ i338;
        os1Var.p1 = i341;
        int i342 = i335 ^ (i247 & i341);
        os1Var.z0 = i342;
        int i343 = i342 ^ ((i14 ^ i339) & i81);
        os1Var.o0 = i343;
        int i344 = ((i326 ^ (i319 ^ i341)) ^ i340) ^ os1Var.u;
        os1Var.u = i344;
        int i345 = ~i344;
        int i346 = i258 & i345;
        int i347 = i258 & i344;
        int i348 = i80 | (i341 ^ i327);
        int i349 = i70 ^ (i317 & i14);
        os1Var.D0 = i349;
        int i350 = i74 ^ i317;
        os1Var.g1 = i350;
        os1Var.I0 = (((i320 ^ ((i333 ^ i350) & i81)) | i127) ^ i343) ^ i168;
        int i351 = (((i337 ^ ((i350 ^ i322) | i80)) & (~i127)) ^ ((i335 ^ i334) ^ i348)) ^ i12;
        os1Var.g = i351;
        os1Var.U = (((i328 ^ ((((i317 & i71) ^ i74) ^ i336) | i80)) | i127) ^ ((i349 ^ i330) ^ i331)) ^ i119;
        int i352 = ((i165 & (~os1Var.r1)) ^ os1Var.t1) ^ os1Var.V;
        os1Var.V = i352;
        int i353 = (i164 ^ i32) ^ os1Var.W;
        os1Var.W = i353;
        int i354 = os1Var.O;
        int i355 = i354 ^ i353;
        int i356 = os1Var.G;
        int i357 = i356 & i355;
        int i358 = os1Var.M0;
        int i359 = i358 ^ (i170 & i357);
        int i360 = i355 ^ i356;
        int i361 = os1Var.m0 ^ i360;
        int i362 = i170 & (~i360);
        int i363 = os1Var.T0;
        int i364 = i363 ^ i362;
        int i365 = os1Var.y;
        int i366 = ~i365;
        int i367 = ~i168;
        int i368 = (i270 ^ i285) ^ i289;
        int i369 = i277 ^ i288;
        int i370 = (i286 ^ i263) ^ i274;
        int i371 = os1Var.u1 ^ i353;
        os1Var.C0 = (i358 ^ (i170 & (~i371))) & i366;
        int i372 = i170 & i371;
        int i373 = ~i353;
        int i374 = i356 & i373;
        int i375 = i354 | i353;
        int i376 = i356 & (~i375);
        int i377 = i353 ^ i376;
        int i378 = i170 & (~(i375 ^ i374));
        int i379 = (i376 ^ i355) & i173;
        int i380 = i353 & (~i354);
        int i381 = ~i380;
        int i382 = i353 & i381;
        os1Var.J1 = i382;
        int i383 = i356 & i381;
        int i384 = (i377 ^ (i170 & (~(i354 ^ i383)))) & i366;
        int i385 = i365 | ((i380 ^ (i356 & i380)) ^ i372);
        int i386 = (i359 ^ (((i380 ^ os1Var.a1) ^ i378) & i366)) & i367;
        int i387 = i383 ^ i355;
        int i388 = i365 & (~(i363 ^ (i170 & (~i387))));
        int i389 = i170 & i387;
        int i390 = i373 & i354;
        os1Var.T0 = i390;
        int i391 = (i390 ^ (i170 & i390)) & i366;
        int i392 = i353 | i390;
        os1Var.a1 = i392;
        int i393 = i356 & i392;
        int i394 = os1Var.t ^ ((i361 ^ (i365 | ((i390 ^ i393) & i173))) ^ i386);
        os1Var.t = i394;
        int i395 = ~i394;
        int i396 = ((i267 ^ ((i272 ^ i276) & i395)) ^ i283) ^ i41;
        os1Var.S = i396;
        os1Var.y = (((i282 ^ i280) ^ (i394 | i279)) ^ (i160 | (i369 ^ ((i273 ^ i261) & i395)))) ^ i365;
        int i397 = ~i160;
        os1Var.Q = (((i281 ^ i261) ^ (i394 | (i277 ^ i82))) ^ ((i287 ^ (i394 | i368)) & i397)) ^ os1Var.Q;
        int i398 = (((i264 ^ (i394 | (i248 ^ i257))) & i397) ^ (i370 ^ (((i265 ^ i275) ^ i266) & i395))) ^ i86;
        os1Var.M = i398;
        int i399 = i351 & i398;
        os1Var.h1 = i399;
        os1Var.O0 = i399;
        os1Var.d2 = i399 ^ i398;
        os1Var.f2 = i290 | i398;
        os1Var.F0 = (i398 ^ i351) ^ i290;
        int i400 = (i353 ^ (i364 & i366)) & i367;
        int i401 = i216 ^ i243;
        int i402 = (i216 & i229) ^ i238;
        int i403 = i233 ^ i235;
        int i404 = i354 ^ i393;
        os1Var.u1 = (i404 ^ i379) ^ i385;
        int i405 = i404 ^ i389;
        int i406 = i405 ^ i384;
        int i407 = ((i405 ^ i388) ^ i400) ^ os1Var.p;
        os1Var.p = i407;
        int i408 = i83 & (~(i227 ^ (i407 & (i227 ^ i221))));
        int i409 = i109 & ((i403 ^ ((i216 ^ i228) | i407)) ^ (i83 & (~(i403 ^ (i216 | i407)))));
        int i410 = i109 & ((i236 ^ (i407 & (~i402))) ^ i241);
        int i411 = i223 ^ (i407 & (~i211));
        int i412 = i83 & (i158 ^ (i407 & i211));
        int i413 = ((((i222 ^ i235) ^ (i407 & i402)) ^ i239) ^ i410) ^ i43;
        os1Var.C = i413;
        int i414 = i413 | i344;
        int i415 = (~i414) & i258;
        os1Var.Z0 = i344 ^ i415;
        int i416 = ~i413;
        int i417 = i258 & i416;
        os1Var.T1 = i417;
        os1Var.Y0 = i417;
        int i418 = ~i396;
        os1Var.i1 = i413 & i418;
        os1Var.W1 = i258 & i413;
        os1Var.g2 = (i413 & i344) ^ i346;
        int i419 = i413 ^ i417;
        os1Var.t1 = i419;
        os1Var.z1 = i419 & i418;
        int i420 = i344 & i416;
        int i421 = ~i420;
        os1Var.c2 = i414 ^ (i258 & i421);
        os1Var.Q1 = i420 ^ i258;
        int i422 = (~(i344 & i421)) & i258;
        int i423 = i413 ^ i344;
        os1Var.W0 = i423 ^ i347;
        os1Var.m1 = i423 ^ i422;
        os1Var.X0 = i344 ^ ((~i423) & i258);
        int i424 = i413 & i345;
        int i425 = i258 & i424;
        os1Var.H1 = i413 ^ i425;
        os1Var.X1 = (i344 | i424) ^ i415;
        os1Var.E1 = i344 ^ i425;
        os1Var.U0 = i413 ^ i346;
        os1Var.G = ((i109 & (~((i407 & (~i403)) ^ i240))) ^ (i411 ^ i412)) ^ i356;
        int i426 = (i401 ^ (i407 & (~i231))) ^ i237;
        int i427 = ((((i407 & i234) ^ (i222 ^ i238)) ^ i408) ^ i409) ^ i88;
        os1Var.c0 = i427;
        int i428 = i218 & i220;
        int i429 = i161 & i163;
        os1Var.N1 = i427 & (~i284);
        os1Var.Y = (i426 ^ (i109 & (~(((i407 & (i209 ^ i224)) ^ (i242 ^ i235)) ^ i230)))) ^ os1Var.Y;
        int i430 = (i406 ^ (((i382 ^ (i170 & (i392 ^ i357))) ^ i391) | i168)) ^ os1Var.b;
        os1Var.b = i430;
        int i431 = ~i430;
        int i432 = i217 & i431;
        os1Var.L0 = i432 ^ i216;
        int i433 = i432 & i232;
        int i434 = i161 ^ i430;
        os1Var.c1 = i434;
        int i435 = i78 | i434;
        os1Var.w1 = i207 & (i434 ^ i162);
        int i436 = (i434 & i163) ^ i434;
        os1Var.R0 = i219 & (~(i436 ^ i208));
        os1Var.U1 = i434 ^ i78;
        int i437 = i430 ^ i225;
        int i438 = i161 & i430;
        int i439 = i219 & ((i436 & i207) ^ i438);
        int i440 = i207 | (i438 ^ i78);
        int i441 = i429 ^ i438;
        os1Var.S1 = i441 & i269 & i219;
        os1Var.s1 = i207 & (~i441);
        os1Var.a2 = (~i438) & i430;
        os1Var.R1 = i161 ^ (i438 & i163);
        int i442 = i216 | i430;
        os1Var.b2 = i219 & (~(i432 ^ i442));
        int i443 = i430 | i217;
        os1Var.Y1 = i443;
        int i444 = i217 ^ (i216 | i443);
        int i445 = i443 & i232;
        os1Var.Z1 = i432 ^ i445;
        os1Var.I1 = i445;
        int i446 = ~i217;
        int i447 = i443 & i446;
        os1Var.s0 = i219 | i447;
        int i448 = i219 & (~(i216 | i447));
        int i449 = i430 & i232;
        os1Var.C1 = i449;
        os1Var.f1 = i448 ^ i449;
        int i450 = i430 & i446;
        os1Var.N0 = i450;
        int i451 = i450 & i232;
        int i452 = i447 ^ i451;
        os1Var.v0 = i219 | i452;
        int i453 = ~i352;
        os1Var.P1 = (i452 ^ i226) & i453;
        os1Var.F1 = i451;
        int i454 = i78 | i430;
        os1Var.m0 = (i449 ^ (i442 & i220)) | i352;
        os1Var.u0 = (i352 | ((i433 ^ i443) ^ (i219 | i442))) ^ (i428 ^ i437);
        int i455 = i430 & (~i161);
        int i456 = i207 & (~(i455 ^ i435));
        int i457 = i430 & i163;
        int i458 = ((i455 ^ i457) & i207) ^ i438;
        os1Var.V0 = i2 & (~(i458 ^ i439));
        os1Var.H0 = (i444 ^ (i219 | (i447 ^ i449))) & i453;
        os1Var.p0 = i454;
        int i459 = i434 ^ i454;
        os1Var.V1 = i2 & (~(i458 ^ ((i456 ^ i459) & i220)));
        os1Var.n = (i459 ^ i440) ^ i219;
        os1Var.e2 = i457;
        int i460 = i161 | i430;
        os1Var.r1 = i460;
        os1Var.M0 = i219 & (~(((i454 ^ i460) & i269) ^ i438));
        os1Var.q1 = i460 & i431;
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        switch (this.f) {
            case 20:
                ((xm2) obj).O((nx2) this.g);
                break;
            default:
                ((dq2) obj).a((l22) this.g);
                break;
        }
    }

    @Override // defpackage.ch3
    public void d() {
        ((sm2) ((di2) this.g).z.d()).C();
    }

    @Override // defpackage.oy2
    public n70 e(fa2 fa2Var) {
        iy2 iy2Var = (iy2) ((t83) this.g).h;
        String str = fa2Var.m;
        synchronized (iy2Var.g) {
            try {
                int i = iy2Var.m;
                if (i != 1 && i != 3) {
                    return pu1.B(new my2(2));
                }
                if (iy2Var.h) {
                    return iy2Var.f;
                }
                iy2Var.m = 3;
                iy2Var.h = true;
                iy2Var.l = str;
                iy2Var.k.n();
                pd2 pd2Var = iy2Var.f;
                pd2Var.f.c(new gy2(iy2Var, 0), md2.g);
                return pd2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m2
    public void f(Object obj) {
        l2 l2Var = (l2) obj;
        xw xwVar = (xw) this.g;
        uw uwVar = (uw) xwVar.C.pollFirst();
        if (uwVar == null) {
            return;
        }
        String str = uwVar.f;
        int i = uwVar.g;
        iw iwVarJ = xwVar.c.j(str);
        if (iwVarJ == null) {
            return;
        }
        iwVarJ.s(i, l2Var.f, l2Var.g);
    }

    @Override // defpackage.md0
    public boolean g(od0 od0Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.ch3
    public void h() {
        di2 di2Var = (di2) this.g;
        ((cn2) di2Var.v.d()).a();
        yp2 yp2Var = (yp2) di2Var.B.d();
        synchronized (yp2Var) {
            yp2Var.P1(sd2.A);
        }
    }

    @Override // defpackage.rd0
    public void i(od0 od0Var, MenuItem menuItem) {
        ((xd) this.g).k.removeCallbacksAndMessages(od0Var);
    }

    @Override // defpackage.sd3
    public void j(int i, long j, String str) {
        ((gd3) this.g).e(i, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // defpackage.f41
    public void k(bw1 bw1Var) {
        ((AtomicReference) this.g).set(bw1Var);
    }

    @Override // defpackage.rd0
    public void l(od0 od0Var, sd0 sd0Var) {
        xd xdVar = (xd) this.g;
        Handler handler = xdVar.k;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = xdVar.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (od0Var == ((wd) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new vd(this, i2 < arrayList.size() ? (wd) arrayList.get(i2) : null, sd0Var, od0Var, 0), od0Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.md0
    public void n(od0 od0Var) {
        Toolbar toolbar = (Toolbar) this.g;
        y1 y1Var = toolbar.f.y;
        if (y1Var == null || !y1Var.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.h).iterator();
            while (it.hasNext()) {
                ((rw) it.next()).a.s();
            }
        }
        z71 z71Var = toolbar.T;
        if (z71Var != null) {
            z71Var.n(od0Var);
        }
    }

    @Override // defpackage.sd3
    public void o(int i, long j) {
        ((gd3) this.g).b(i, System.currentTimeMillis() - j);
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            mw2 mw2Var = (mw2) this.g;
            mw2Var.c = true;
            hg4.C.k.getClass();
            mw2Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - mw2Var.d), "", true);
            mw2Var.i.execute(new n62(this, str, 22));
        }
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        synchronized (this) {
            mw2 mw2Var = (mw2) this.g;
            mw2Var.c = true;
            hg4.C.k.getClass();
            mw2Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - mw2Var.d), "Internal Error.", false);
            mw2Var.e.b(new Exception());
        }
    }

    public m61 t(Class cls) {
        String strQ;
        hf hfVarA = dp0.a(cls);
        p21 p21Var = (p21) this.g;
        Map map = hf.b;
        Class cls2 = hfVarA.a;
        String strQ2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType.isPrimitive() && (strQ = i30.q(componentType.getName())) != null) {
                    strQ2 = strQ.concat("Array");
                }
                if (strQ2 == null) {
                    strQ2 = "kotlin.Array";
                }
            } else {
                strQ2 = i30.q(cls2.getName());
                if (strQ2 == null) {
                    strQ2 = cls2.getCanonicalName();
                }
            }
        }
        if (strQ2 != null) {
            return p21Var.r(hfVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strQ2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public File u(String str) {
        File file = new File(x(), q(str, ku.g, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(x(), q(str, ku.h, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(x(), q(str, ku.i, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    @Override // defpackage.ug2
    public void v(String str, int i, String str2, boolean z) {
        yw1 yw1Var = (yw1) this.g;
        if (z) {
            yw1Var.d();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Image Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        yw1Var.b(new r13(ex0.k(sb, ", Failing URL: ", str2), 1));
    }

    @Override // defpackage.y23
    public void w(el2 el2Var) {
        fk2 fk2Var = (fk2) el2Var;
        y63 y63Var = (y63) this.g;
        synchronized (y63Var) {
            try {
                fk2 fk2Var2 = y63Var.p;
                if (fk2Var2 != null) {
                    fk2Var2.d();
                }
                y63Var.p = fk2Var;
                ag2 ag2Var = fk2Var.l;
                if (ag2Var != null) {
                    ag2Var.j0(y63Var);
                }
                y63Var.k.a(new gk2(fk2Var, y63Var, y63Var.k, y63Var.m));
                fk2Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public File x() {
        File file = new File(((Context) ((dk) this.g).f).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File y(String str, InputStream inputStream, ku kuVar) throws NoSuchAlgorithmException, IOException {
        File file = new File(x(), q(str, kuVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public kg4[] z(Handler handler, oa4 oa4Var, oa4 oa4Var2) {
        sf2 sf2Var = (sf2) this.g;
        hd4 hd4Var = hd4.g;
        Context context = sf2Var.f;
        de3 de3Var = new de3(context);
        zt0.b0(!de3Var.f);
        de3Var.f = true;
        if (((jr3) de3Var.i) == null) {
            de3Var.i = new jr3(new qf2[0]);
        }
        if (((wt2) de3Var.j) == null) {
            de3Var.j = new wt2(context, 12);
        }
        ef4 ef4Var = new ef4(context, new cy2(context), handler, oa4Var2, new df4(de3Var));
        zb1 zb1Var = new zb1();
        zb1Var.g = context;
        zb1Var.h = hd4.g;
        zb1Var.i = new cy2(context);
        zb1Var.h = hd4Var;
        zb1Var.j = handler;
        zb1Var.k = oa4Var;
        zt0.b0(!zb1Var.f);
        Handler handler2 = (Handler) zb1Var.j;
        zt0.b0((handler2 == null && ((oa4) zb1Var.k) == null) || !(handler2 == null || ((oa4) zb1Var.k) == null));
        zb1Var.f = true;
        return new kg4[]{ef4Var, new sd1(zb1Var)};
    }

    public /* synthetic */ ug0(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj2;
    }

    @Override // defpackage.eu2
    /* renamed from: a, reason: collision with other method in class */
    public Object mo18a() {
        dk2 dk2Var = ok2.b;
        pu1.s(dk2Var);
        return new z42((zs1) this.g, dk2Var);
    }

    public ug0(int i) {
        this.f = i;
        switch (i) {
            case 17:
                this.g = new WeakHashMap();
                break;
            default:
                this.g = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
        }
    }

    public ug0(mw2 mw2Var) {
        this.f = 24;
        Objects.requireNonNull(mw2Var);
        this.g = mw2Var;
    }

    @Override // defpackage.y23
    /* renamed from: a */
    public void mo8a() {
        y63 y63Var = (y63) this.g;
        synchronized (y63Var) {
            y63Var.p = null;
        }
    }

    public ug0(q61 q61Var, p61 p61Var) {
        this.f = 1;
        i30.m(q61Var, "store");
        vk vkVar = vk.b;
        i30.m(vkVar, "defaultCreationExtras");
        this.g = new p21(q61Var, p61Var, vkVar);
    }

    @Override // defpackage.ch3
    public void m(View view) {
    }
}
