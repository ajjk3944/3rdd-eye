package a2;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.profileinstaller.ProfileInstallReceiver;
import bb.p;
import br.l;
import ch.n;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.y0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedResultActivity;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import d4.f1;
import d4.g1;
import dd.r;
import ee.i;
import ee.j;
import h7.s1;
import h7.t1;
import hk.h;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import r5.o;
import rr.f0;
import rr.i0;
import rr.w;
import sm.m;
import zt.o0;

/* loaded from: classes.dex */
public final class g implements p, bb.b, dd.e, dt.g, f7.d, ff.a, o, om.e, DashSegmentIndex, t1, dd.g {

    /* renamed from: a, reason: collision with root package name */
    public Object f31a;

    public /* synthetic */ g(Object obj) {
        this.f31a = obj;
    }

    public static void j(long j, long j7, long j10, h hVar) {
        String str;
        if (hVar == null || (str = hVar.f10805b) == null) {
            str = "SDK";
        }
        n.b("DataUsageLimitsChecker", "Checking data limits for " + str + " with allowed data " + j7 + "Kb in " + j10 + " days");
        n.b("DataUsageLimitsChecker", str + " consumed " + j + '/' + j7 + ", " + ((100 * j) / j7) + "% of allowed data in this period");
    }

    @Override // dt.g
    public dt.f B(qs.b bVar) {
        dt.f fVarB;
        l.e(bVar, "classId");
        i0 i0Var = (i0) this.f31a;
        qs.c cVarG = bVar.g();
        l.d(cVarG, "classId.packageFqName");
        Iterator it = w.i(i0Var, cVarG).iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            if ((f0Var instanceof et.c) && (fVarB = ((et.c) f0Var).F.B(bVar)) != null) {
                return fVarB;
            }
        }
        return null;
    }

    @Override // r5.o
    public void a() throws IOException {
        DashMediaSource dashMediaSource = (DashMediaSource) this.f31a;
        dashMediaSource.loader.a();
        if (dashMediaSource.manifestFatalError != null) {
            throw dashMediaSource.manifestFatalError;
        }
    }

    public void b(int i10, boolean z10) {
        androidx.media3.common.o oVar = (androidx.media3.common.o) this.f31a;
        if (z10) {
            oVar.a(i10);
        } else {
            oVar.getClass();
        }
    }

    public ee.d c(ee.d dVar) {
        return dVar instanceof j ? dVar : new ee.b(-((i) this.f31a).j(), dVar);
    }

    public void d(int i10, int i11, ca.l lVar) throws y0 {
        int i12;
        int i13;
        int i14;
        long j;
        int i15;
        int i16;
        int i17;
        int i18;
        ha.e eVar = (ha.e) this.f31a;
        ha.f fVar = eVar.f10578b;
        SparseArray sparseArray = eVar.f10579c;
        fb.f fVar2 = eVar.f10585i;
        fb.f fVar3 = eVar.f10583g;
        int i19 = 1;
        int i20 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (eVar.G != 2) {
                    return;
                }
                ha.c cVar = (ha.c) sparseArray.get(eVar.M);
                int i21 = eVar.P;
                fb.f fVar4 = eVar.f10588n;
                if (i21 != 4 || !"V_VP9".equals(cVar.f10541b)) {
                    lVar.m(i11);
                    return;
                } else {
                    fVar4.v(i11);
                    lVar.readFully(fVar4.f8800a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                eVar.b(i10);
                ha.c cVar2 = eVar.f10595u;
                int i22 = cVar2.f10546g;
                if (i22 != 1685485123 && i22 != 1685480259) {
                    lVar.m(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                cVar2.N = bArr;
                lVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                eVar.b(i10);
                byte[] bArr2 = new byte[i11];
                eVar.f10595u.f10548i = bArr2;
                lVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                lVar.readFully(bArr3, 0, i11);
                eVar.b(i10);
                eVar.f10595u.j = new ca.w(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(fVar2.f8800a, (byte) 0);
                lVar.readFully(fVar2.f8800a, 4 - i11, i11);
                fVar2.y(0);
                eVar.f10597w = (int) fVar2.p();
                return;
            }
            if (i10 == 25506) {
                eVar.b(i10);
                byte[] bArr4 = new byte[i11];
                eVar.f10595u.k = bArr4;
                lVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unexpected id: ");
                sb2.append(i10);
                throw y0.a(null, sb2.toString());
            }
            eVar.b(i10);
            byte[] bArr5 = new byte[i11];
            eVar.f10595u.f10559v = bArr5;
            lVar.readFully(bArr5, 0, i11);
            return;
        }
        if (eVar.G == 0) {
            eVar.M = (int) fVar.b(lVar, false, true, 8);
            eVar.N = fVar.f10604c;
            eVar.I = -9223372036854775807L;
            eVar.G = 1;
            fVar3.v(0);
        }
        ha.c cVar3 = (ha.c) sparseArray.get(eVar.M);
        if (cVar3 == null) {
            lVar.m(i11 - eVar.N);
            eVar.G = 0;
            return;
        }
        cVar3.X.getClass();
        if (eVar.G == 1) {
            eVar.i(lVar, 3);
            int i23 = (fVar3.f8800a[2] & 6) >> 1;
            byte b2 = 255;
            if (i23 == 0) {
                eVar.K = 1;
                int[] iArr = eVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                eVar.L = iArr;
                iArr[0] = (i11 - eVar.N) - 3;
            } else {
                eVar.i(lVar, 4);
                int i24 = (fVar3.f8800a[3] & 255) + 1;
                eVar.K = i24;
                int[] iArr2 = eVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i24];
                } else if (iArr2.length < i24) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i24)];
                }
                eVar.L = iArr2;
                if (i23 == 2) {
                    int i25 = (i11 - eVar.N) - 4;
                    int i26 = eVar.K;
                    Arrays.fill(iArr2, 0, i26, i25 / i26);
                } else {
                    if (i23 != 1) {
                        if (i23 != 3) {
                            StringBuilder sb3 = new StringBuilder(36);
                            sb3.append("Unexpected lacing value: ");
                            sb3.append(i23);
                            throw y0.a(null, sb3.toString());
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = eVar.K - i19;
                            if (i27 >= i30) {
                                i12 = i19;
                                i13 = i20;
                                eVar.L[i30] = ((i11 - eVar.N) - i29) - i28;
                                break;
                            }
                            eVar.L[i27] = i20;
                            int i31 = i29 + 1;
                            eVar.i(lVar, i31);
                            if (fVar3.f8800a[i29] == 0) {
                                throw y0.a(null, "No valid varint length mask found");
                            }
                            int i32 = i19;
                            int i33 = i20;
                            while (true) {
                                if (i33 >= 8) {
                                    i14 = i20;
                                    j = 0;
                                    i15 = i31;
                                    break;
                                }
                                int i34 = i32 << (7 - i33);
                                i14 = i20;
                                if ((fVar3.f8800a[i29] & i34) != 0) {
                                    i15 = i31 + i33;
                                    eVar.i(lVar, i15);
                                    j = fVar3.f8800a[i29] & b2 & (~i34);
                                    while (i31 < i15) {
                                        j = (j << 8) | (fVar3.f8800a[i31] & b2);
                                        i31++;
                                        b2 = 255;
                                    }
                                    if (i27 > 0) {
                                        j -= (1 << ((i33 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i33++;
                                    i20 = i14;
                                    b2 = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i35 = (int) j;
                            int[] iArr3 = eVar.L;
                            if (i27 != 0) {
                                i35 += iArr3[i27 - 1];
                            }
                            iArr3[i27] = i35;
                            i28 += i35;
                            i27++;
                            i29 = i15;
                            i19 = i32;
                            i20 = i14;
                            b2 = 255;
                        }
                        throw y0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 4;
                    while (true) {
                        i16 = eVar.K - 1;
                        if (i36 >= i16) {
                            break;
                        }
                        eVar.L[i36] = 0;
                        while (true) {
                            i17 = i38 + 1;
                            eVar.i(lVar, i17);
                            int i39 = fVar3.f8800a[i38] & 255;
                            int[] iArr4 = eVar.L;
                            i18 = iArr4[i36] + i39;
                            iArr4[i36] = i18;
                            if (i39 != 255) {
                                break;
                            } else {
                                i38 = i17;
                            }
                        }
                        i37 += i18;
                        i36++;
                        i38 = i17;
                    }
                    eVar.L[i16] = ((i11 - eVar.N) - i38) - i37;
                }
            }
            i12 = 1;
            i13 = 0;
            byte[] bArr6 = fVar3.f8800a;
            eVar.H = eVar.k((bArr6[i12] & 255) | (bArr6[i13] << 8)) + eVar.B;
            eVar.O = (cVar3.f10543d == 2 || (i10 == 163 && (fVar3.f8800a[2] & 128) == 128)) ? i12 : i13;
            eVar.G = 2;
            eVar.J = i13;
        }
        if (i10 == 163) {
            while (true) {
                int i40 = eVar.J;
                if (i40 >= eVar.K) {
                    eVar.G = 0;
                    return;
                } else {
                    eVar.d(cVar3, ((eVar.J * cVar3.f10544e) / 1000) + eVar.H, eVar.O, eVar.l(lVar, cVar3, eVar.L[i40]), 0);
                    eVar.J++;
                }
            }
        } else {
            while (true) {
                int i41 = eVar.J;
                if (i41 >= eVar.K) {
                    return;
                }
                int[] iArr5 = eVar.L;
                iArr5[i41] = eVar.l(lVar, cVar3, iArr5[i41]);
                eVar.J++;
            }
        }
    }

    public f1 e() {
        return (f1) ((o0) this.f31a).getValue();
    }

    @Override // f7.d
    public void f(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            e0.c("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f31a).setResultCode(i10);
    }

    public void g(int i10, long j) throws y0 {
        ha.e eVar = (ha.e) this.f31a;
        if (i10 == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j);
            sb2.append(" not supported");
            throw y0.a(null, sb2.toString());
        }
        if (i10 == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("ContentEncodingScope ");
            sb3.append(j);
            sb3.append(" not supported");
            throw y0.a(null, sb3.toString());
        }
        int i11 = 3;
        switch (i10) {
            case 131:
                eVar.b(i10);
                eVar.f10595u.f10543d = (int) j;
                return;
            case 136:
                eVar.b(i10);
                eVar.f10595u.V = j == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                eVar.I = eVar.k(j);
                return;
            case 159:
                eVar.b(i10);
                eVar.f10595u.O = (int) j;
                return;
            case 176:
                eVar.b(i10);
                eVar.f10595u.f10550m = (int) j;
                return;
            case 179:
                eVar.a(i10);
                eVar.C.a(eVar.k(j));
                return;
            case 186:
                eVar.b(i10);
                eVar.f10595u.f10551n = (int) j;
                return;
            case 215:
                eVar.b(i10);
                eVar.f10595u.f10542c = (int) j;
                return;
            case 231:
                eVar.B = eVar.k(j);
                return;
            case 238:
                eVar.P = (int) j;
                return;
            case 241:
                if (eVar.E) {
                    return;
                }
                eVar.a(i10);
                eVar.D.a(j);
                eVar.E = true;
                return;
            case 251:
                eVar.Q = true;
                return;
            case 16871:
                eVar.b(i10);
                eVar.f10595u.f10546g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(50);
                sb4.append("ContentCompAlgo ");
                sb4.append(j);
                sb4.append(" not supported");
                throw y0.a(null, sb4.toString());
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb5 = new StringBuilder(53);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw y0.a(null, sb5.toString());
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(50);
                sb6.append("EBMLReadVersion ");
                sb6.append(j);
                sb6.append(" not supported");
                throw y0.a(null, sb6.toString());
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(49);
                sb7.append("ContentEncAlgo ");
                sb7.append(j);
                sb7.append(" not supported");
                throw y0.a(null, sb7.toString());
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(56);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j);
                sb8.append(" not supported");
                throw y0.a(null, sb8.toString());
            case 21420:
                eVar.f10598x = j + eVar.f10591q;
                return;
            case 21432:
                int i12 = (int) j;
                eVar.b(i10);
                if (i12 == 0) {
                    eVar.f10595u.f10560w = 0;
                    return;
                }
                if (i12 == 1) {
                    eVar.f10595u.f10560w = 2;
                    return;
                } else if (i12 == 3) {
                    eVar.f10595u.f10560w = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    eVar.f10595u.f10560w = 3;
                    return;
                }
            case 21680:
                eVar.b(i10);
                eVar.f10595u.f10552o = (int) j;
                return;
            case 21682:
                eVar.b(i10);
                eVar.f10595u.f10554q = (int) j;
                return;
            case 21690:
                eVar.b(i10);
                eVar.f10595u.f10553p = (int) j;
                return;
            case 21930:
                eVar.b(i10);
                eVar.f10595u.U = j == 1;
                return;
            case 21998:
                eVar.b(i10);
                eVar.f10595u.f10545f = (int) j;
                return;
            case 22186:
                eVar.b(i10);
                eVar.f10595u.R = j;
                return;
            case 22203:
                eVar.b(i10);
                eVar.f10595u.S = j;
                return;
            case 25188:
                eVar.b(i10);
                eVar.f10595u.P = (int) j;
                return;
            case 30321:
                eVar.b(i10);
                int i13 = (int) j;
                if (i13 == 0) {
                    eVar.f10595u.f10555r = 0;
                    return;
                }
                if (i13 == 1) {
                    eVar.f10595u.f10555r = 1;
                    return;
                } else if (i13 == 2) {
                    eVar.f10595u.f10555r = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    eVar.f10595u.f10555r = 3;
                    return;
                }
            case 2352003:
                eVar.b(i10);
                eVar.f10595u.f10544e = (int) j;
                return;
            case 2807729:
                eVar.f10592r = j;
                return;
            default:
                switch (i10) {
                    case 21945:
                        eVar.b(i10);
                        int i14 = (int) j;
                        if (i14 == 1) {
                            eVar.f10595u.A = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            eVar.f10595u.A = 1;
                            return;
                        }
                    case 21946:
                        eVar.b(i10);
                        int i15 = (int) j;
                        if (i15 != 1) {
                            if (i15 == 16) {
                                i11 = 6;
                            } else if (i15 == 18) {
                                i11 = 7;
                            } else if (i15 != 6 && i15 != 7) {
                                i11 = -1;
                            }
                        }
                        if (i11 != -1) {
                            eVar.f10595u.f10563z = i11;
                            return;
                        }
                        return;
                    case 21947:
                        eVar.b(i10);
                        eVar.f10595u.f10561x = true;
                        int iD = ColorInfo.d((int) j);
                        if (iD != -1) {
                            eVar.f10595u.f10562y = iD;
                            return;
                        }
                        return;
                    case 21948:
                        eVar.b(i10);
                        eVar.f10595u.B = (int) j;
                        return;
                    case 21949:
                        eVar.b(i10);
                        eVar.f10595u.C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j, long j7) {
        return 1L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j, long j7) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j, long j7) {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentCount(long j) {
        return 1L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j, long j7) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public h5.i getSegmentUrl(long j) {
        return (h5.i) this.f31a;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override // dd.e
    public void h(Object obj) {
        ((dd.h) ((g) this.f31a).f31a).f7294a.o();
    }

    public void i(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((ge.h) this.f31a).a(0);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Type inference failed for: r3v4, types: [bu.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(d4.f1 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            br.l.e(r6, r0)
            java.lang.Object r0 = r5.f31a
            zt.o0 r0 = (zt.o0) r0
        L9:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            d4.f1 r2 = (d4.f1) r2
            boolean r3 = r2 instanceof d4.x0
            if (r3 == 0) goto L16
            r3 = 1
            goto L1c
        L16:
            d4.g1 r3 = d4.g1.f6811b
            boolean r3 = br.l.a(r2, r3)
        L1c:
            if (r3 == 0) goto L1f
            goto L29
        L1f:
            boolean r3 = r2 instanceof d4.c
            if (r3 == 0) goto L2b
            int r3 = r6.f6805a
            int r4 = r2.f6805a
            if (r3 <= r4) goto L2f
        L29:
            r2 = r6
            goto L2f
        L2b:
            boolean r3 = r2 instanceof d4.m0
            if (r3 == 0) goto L3e
        L2f:
            bu.t r3 = au.c.f2321b
            if (r1 != 0) goto L34
            r1 = r3
        L34:
            if (r2 != 0) goto L37
            r2 = r3
        L37:
            boolean r1 = r0.h(r1, r2)
            if (r1 == 0) goto L9
            return
        L3e:
            bf.n r6 = new bf.n
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g.k(d4.f1):void");
    }

    @Override // ff.a
    public void l(Bundle bundle) {
        ((we.c) ((we.b) this.f31a)).a("clx", "_ae", bundle);
    }

    @Override // dd.g
    public r o(Object obj) {
        qf.b bVar = (qf.b) obj;
        hf.l lVar = ((hf.j) this.f31a).f10662e;
        if (bVar != null) {
            return e5.U(Arrays.asList(hf.l.a(lVar), lVar.f10677m.d1(null, lVar.f10671e.f13707a)));
        }
        e0.q("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return e5.u(null);
    }

    @Override // om.e
    public void p() {
        int i10 = VideoTestActivity.f6105h0;
        SpeedResultActivity speedResultActivity = (SpeedResultActivity) this.f31a;
        Intent intent = new Intent(speedResultActivity, (Class<?>) VideoTestActivity.class);
        intent.addFlags(1073741824);
        speedResultActivity.startActivity(intent);
        speedResultActivity.finish();
    }

    @Override // h7.t1
    public s1 w() {
        return (m) this.f31a;
    }

    public g(int i10) {
        switch (i10) {
            case 3:
                this.f31a = new androidx.media3.common.o(0);
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f31a = new fb.f(10);
                break;
            case 10:
                this.f31a = androidx.compose.runtime.c.f(Boolean.FALSE);
                break;
            case 11:
                this.f31a = zt.f0.a(g1.f6811b);
                break;
            case 26:
                this.f31a = new m();
                break;
            default:
                this.f31a = new AtomicReference(null);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j, long j7) {
        return j7;
    }
}
