package h7;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase;
import com.staircase3.opensignal.goldstar.persistence.VideoTestResult;
import com.staircase3.opensignal.goldstar.videotest.result.VideoResultActivity;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import com.staircase3.opensignal.models.NetworkUiState;
import com.survicate.surveys.infrastructure.network.image.SurvicateImageLoaderImpl;
import h9.r2;
import io.sentry.b5;
import io.sentry.c2;
import io.sentry.d5;
import io.sentry.e4;
import io.sentry.f5;
import io.sentry.k4;
import io.sentry.n6;
import io.sentry.u3;
import io.sentry.x3;
import io.sentry.x5;
import io.sentry.y3;
import io.sentry.z2;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p.p2;

/* loaded from: classes.dex */
public class r1 implements t1, dd.g, p.x0, p2, y3, io.sentry.logger.a, rr.o0, js.o, rr.t, rr.n, md.b, mh.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10198a;

    /* renamed from: d, reason: collision with root package name */
    public Object f10199d;

    public /* synthetic */ r1(char c4, int i10) {
        this.f10198a = i10;
    }

    @Override // rr.n
    public Object B(ur.z zVar, Object obj) {
        return null;
    }

    @Override // rr.t
    public rr.t C(rr.c cVar) {
        br.l.e(cVar, "kind");
        return this;
    }

    @Override // rr.n
    public Object D(ur.c0 c0Var, Object obj) {
        return null;
    }

    @Override // rr.n
    public Object F(ur.i0 i0Var, Object obj) {
        return h(i0Var, obj);
    }

    @Override // rr.t
    public rr.t G(qs.g gVar) {
        br.l.e(gVar, "name");
        return this;
    }

    @Override // rr.n
    public Object I(ur.h0 h0Var, Object obj) {
        lr.d0 d0Var = (lr.d0) this.f10199d;
        br.l.e(h0Var, "descriptor");
        int i10 = (h0Var.Q != null ? 1 : 0) + (h0Var.R != null ? 1 : 0);
        if (h0Var.B) {
            if (i10 == 0) {
                return new lr.h0(d0Var, h0Var);
            }
            if (i10 == 1) {
                return new lr.j0(d0Var, h0Var);
            }
            if (i10 == 2) {
                return new lr.l0(d0Var, h0Var);
            }
        } else {
            if (i10 == 0) {
                return new lr.w0(d0Var, h0Var);
            }
            if (i10 == 1) {
                return new lr.z0(d0Var, h0Var);
            }
            if (i10 == 2) {
                return new lr.c1(d0Var, h0Var);
            }
        }
        throw new lq.k("Unsupported property: " + h0Var, 1);
    }

    @Override // rr.n
    public Object J(ur.j jVar, Object obj) {
        return h(jVar, obj);
    }

    @Override // js.o
    public js.o K(qs.b bVar, qs.g gVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mh.k
    public void L(mh.m mVar) throws Throwable {
        Throwable th2;
        Object next;
        int i10;
        String str;
        mi.y yVar = (mi.y) this.f10199d;
        r2 r2Var = yVar.S;
        ArrayList arrayList = yVar.Z;
        ch.n.b("UdpJob", "onStop() called with: udpTestResult = " + mVar);
        ak.g1 g1Var = yVar.V;
        if (g1Var == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        Integer num = g1Var.j;
        if (num != null && num.intValue() == 2) {
            List<mh.c> list = mVar.j;
            br.l.d(list, "getPacketPayloadsSent(...)");
            List list2 = mVar.k;
            br.l.d(list2, "getPacketPayloadsReceived(...)");
            jk.a aVar = jk.b.Companion;
            ak.g1 g1Var2 = yVar.V;
            if (g1Var2 == null) {
                br.l.l("udpConfigItem");
                throw null;
            }
            Integer num2 = g1Var2.k;
            aVar.getClass();
            jk.b bVarA = jk.a.a(num2);
            ch.n.b("UdpJob", "Using encryption: " + bVarA.name());
            for (mh.c cVar : list) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((mh.c) next).f16713d == cVar.f16713d) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                mh.c cVar2 = (mh.c) next;
                if (cVar2 == null) {
                    i10 = -1;
                } else if (cVar2.f16710a != 2) {
                    i10 = -2;
                } else {
                    byte[] bArr = cVar2.f16721n;
                    br.l.d(bArr, "getFirst6bytes(...)");
                    byte[] bArr2 = cVar.f16721n;
                    br.l.d(bArr2, "getFirst6bytes(...)");
                    boolean zA = yVar.U.a(bArr2, bArr, bVarA);
                    ch.n.b("UdpJob", "First 6 bytes of sent & received match: " + zA);
                    i10 = zA ? 1 : 0;
                }
                arrayList.add(Integer.valueOf(i10));
            }
            th2 = null;
            ch.n.b("UdpJob", "udpVerification: " + arrayList);
        } else {
            th2 = null;
        }
        if (arrayList.isEmpty()) {
            str = th2;
        } else {
            String string = Arrays.toString(mq.o.P0(arrayList));
            br.l.d(string, "toString(...)");
            str = string;
        }
        long jG = yVar.g();
        long j = yVar.f23926y;
        String str2 = yVar.W;
        String str3 = yVar.f23922d;
        String str4 = yVar.D;
        yVar.Q.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = mVar.f16770b;
        int i12 = mVar.f16771c;
        int i13 = mVar.f16772d;
        float f10 = mVar.f16773e;
        String str5 = mVar.f16774f;
        String str6 = mVar.f16775g;
        String string2 = Arrays.toString(mVar.f16776h);
        br.l.d(string2, "toString(...)");
        String string3 = Arrays.toString(mVar.f16777i);
        br.l.d(string3, "toString(...)");
        boolean z10 = yVar.N;
        String strN = yVar.n();
        String str7 = mVar.f16769a;
        ak.g1 g1Var3 = yVar.V;
        if (g1Var3 == null) {
            br.l.l("udpConfigItem");
            throw th2;
        }
        Integer num3 = g1Var3.j;
        br.l.b(str7);
        yVar.Y = new ni.z0(jG, j, str3, str2, str4, jCurrentTimeMillis, i11, i12, i13, f10, null, str5, str6, string2, string3, null, z10, strN, str7, str, num3);
        r2Var.m1(yVar.f23926y, mVar.f16775g);
        r2Var.n1(yVar.f23926y, mVar.f16774f);
        ch.n.b("UdpJob", "Mapped Result: " + yVar.Y);
    }

    @Override // rr.t
    public rr.t N(rr.l lVar) {
        br.l.e(lVar, "owner");
        return this;
    }

    @Override // rr.n
    public Object O(ur.i iVar, Object obj) {
        return null;
    }

    @Override // js.o
    public js.p P(qs.g gVar) {
        String strB = gVar.b();
        if ("d1".equals(strB)) {
            return new ks.e(this, 0);
        }
        if ("d2".equals(strB)) {
            return new ks.e(this, 1);
        }
        return null;
    }

    @Override // rr.n
    public Object R(ur.x xVar, Object obj) {
        return null;
    }

    @Override // rr.n
    public Object S(ft.u uVar, Object obj) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void T(int i10, int i11, u5.l lVar) throws androidx.media3.common.k0 {
        int i12;
        int i13;
        int i14;
        long j;
        int i15;
        int i16;
        int i17;
        int i18;
        j6.c cVar = (j6.c) this.f10199d;
        j6.d dVar = cVar.f13384b;
        SparseArray sparseArray = cVar.f13386c;
        a5.v vVar = cVar.f13392i;
        a5.v vVar2 = cVar.f13390g;
        int i19 = 1;
        int i20 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (cVar.G != 2) {
                    return;
                }
                j6.b bVar = (j6.b) sparseArray.get(cVar.M);
                int i21 = cVar.P;
                a5.v vVar3 = cVar.f13395n;
                if (i21 != 4 || !"V_VP9".equals(bVar.f13353b)) {
                    lVar.m(i11);
                    return;
                } else {
                    vVar3.B(i11);
                    lVar.readFully(vVar3.f165a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                cVar.b(i10);
                j6.b bVar2 = cVar.f13402u;
                int i22 = bVar2.f13358g;
                if (i22 != 1685485123 && i22 != 1685480259) {
                    lVar.m(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                bVar2.N = bArr;
                lVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                cVar.b(i10);
                byte[] bArr2 = new byte[i11];
                cVar.f13402u.f13360i = bArr2;
                lVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                lVar.readFully(bArr3, 0, i11);
                cVar.b(i10);
                cVar.f13402u.j = new u5.z(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(vVar.f165a, (byte) 0);
                lVar.readFully(vVar.f165a, 4 - i11, i11);
                vVar.E(0);
                cVar.f13404w = (int) vVar.u();
                return;
            }
            if (i10 == 25506) {
                cVar.b(i10);
                byte[] bArr4 = new byte[i11];
                cVar.f13402u.k = bArr4;
                lVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw androidx.media3.common.k0.a(null, "Unexpected id: " + i10);
            }
            cVar.b(i10);
            byte[] bArr5 = new byte[i11];
            cVar.f13402u.f13371v = bArr5;
            lVar.readFully(bArr5, 0, i11);
            return;
        }
        if (cVar.G == 0) {
            cVar.M = (int) dVar.b(lVar, false, true, 8);
            cVar.N = dVar.f13411c;
            cVar.I = -9223372036854775807L;
            cVar.G = 1;
            vVar2.B(0);
        }
        j6.b bVar3 = (j6.b) sparseArray.get(cVar.M);
        if (bVar3 == null) {
            lVar.m(i11 - cVar.N);
            cVar.G = 0;
            return;
        }
        bVar3.X.getClass();
        if (cVar.G == 1) {
            cVar.i(lVar, 3);
            int i23 = (vVar2.f165a[2] & 6) >> 1;
            int i24 = 255;
            if (i23 == 0) {
                cVar.K = 1;
                int[] iArr = cVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                cVar.L = iArr;
                iArr[0] = (i11 - cVar.N) - 3;
            } else {
                cVar.i(lVar, 4);
                int i25 = (vVar2.f165a[3] & 255) + 1;
                cVar.K = i25;
                int[] iArr2 = cVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i25];
                } else if (iArr2.length < i25) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i25)];
                }
                cVar.L = iArr2;
                if (i23 == 2) {
                    int i26 = (i11 - cVar.N) - 4;
                    int i27 = cVar.K;
                    Arrays.fill(iArr2, 0, i27, i26 / i27);
                } else {
                    if (i23 != 1) {
                        if (i23 != 3) {
                            throw androidx.media3.common.k0.a(null, "Unexpected lacing value: " + i23);
                        }
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            int i31 = cVar.K - i19;
                            if (i28 >= i31) {
                                i12 = i19;
                                i13 = i20;
                                cVar.L[i31] = ((i11 - cVar.N) - i30) - i29;
                                break;
                            }
                            cVar.L[i28] = i20;
                            int i32 = i30 + 1;
                            cVar.i(lVar, i32);
                            if (vVar2.f165a[i30] == 0) {
                                throw androidx.media3.common.k0.a(null, "No valid varint length mask found");
                            }
                            int i33 = i19;
                            int i34 = i20;
                            while (true) {
                                if (i34 >= 8) {
                                    i14 = i20;
                                    j = 0;
                                    i15 = i32;
                                    break;
                                }
                                int i35 = i33 << (7 - i34);
                                i14 = i20;
                                if ((vVar2.f165a[i30] & i35) != 0) {
                                    i15 = i32 + i34;
                                    cVar.i(lVar, i15);
                                    j = vVar2.f165a[i30] & i24 & (~i35);
                                    while (i32 < i15) {
                                        j = (j << 8) | (vVar2.f165a[i32] & i24);
                                        i32++;
                                        i24 = 255;
                                    }
                                    if (i28 > 0) {
                                        j -= (1 << ((i34 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i34++;
                                    i20 = i14;
                                    i24 = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i36 = (int) j;
                            int[] iArr3 = cVar.L;
                            if (i28 != 0) {
                                i36 += iArr3[i28 - 1];
                            }
                            iArr3[i28] = i36;
                            i29 += i36;
                            i28++;
                            i30 = i15;
                            i19 = i33;
                            i20 = i14;
                            i24 = 255;
                        }
                        throw androidx.media3.common.k0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 4;
                    while (true) {
                        i16 = cVar.K - 1;
                        if (i37 >= i16) {
                            break;
                        }
                        cVar.L[i37] = 0;
                        while (true) {
                            i17 = i39 + 1;
                            cVar.i(lVar, i17);
                            int i40 = vVar2.f165a[i39] & 255;
                            int[] iArr4 = cVar.L;
                            i18 = iArr4[i37] + i40;
                            iArr4[i37] = i18;
                            if (i40 != 255) {
                                break;
                            } else {
                                i39 = i17;
                            }
                        }
                        i38 += i18;
                        i37++;
                        i39 = i17;
                    }
                    cVar.L[i16] = ((i11 - cVar.N) - i39) - i38;
                }
            }
            i12 = 1;
            i13 = 0;
            byte[] bArr6 = vVar2.f165a;
            cVar.H = cVar.k((bArr6[i12] & 255) | (bArr6[i13] << 8)) + cVar.B;
            cVar.O = (bVar3.f13355d == 2 || (i10 == 163 && (vVar2.f165a[2] & 128) == 128)) ? i12 : i13;
            cVar.G = 2;
            cVar.J = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i41 = cVar.J;
                if (i41 >= cVar.K) {
                    cVar.G = 0;
                    return;
                } else {
                    cVar.d(bVar3, ((cVar.J * bVar3.f13356e) / 1000) + cVar.H, cVar.O, cVar.l(lVar, bVar3, cVar.L[i41], false), 0);
                    cVar.J++;
                }
            }
        } else {
            while (true) {
                int i42 = cVar.J;
                if (i42 >= cVar.K) {
                    return;
                }
                int[] iArr5 = cVar.L;
                boolean z10 = i12;
                iArr5[i42] = cVar.l(lVar, bVar3, iArr5[i42], z10);
                cVar.J += z10 ? 1 : 0;
            }
        }
    }

    public HashMap U(hf.y yVar, String str, n6 n6Var, Object... objArr) {
        u3 u3Var = (u3) this.f10199d;
        HashMap map = new HashMap();
        map.put("sentry.origin", new io.sentry.protocol.j(e4.STRING, (Object) yVar.f10732a));
        int i10 = 0;
        for (Object obj : objArr) {
            map.put(h0.b.h(i10, "sentry.message.parameter."), new io.sentry.protocol.j(obj instanceof Boolean ? e4.BOOLEAN : obj instanceof Integer ? e4.INTEGER : obj instanceof Number ? e4.DOUBLE : e4.STRING, obj));
            i10++;
        }
        if (i10 > 0 && map.get("sentry.message.template") == null) {
            map.put("sentry.message.template", new io.sentry.protocol.j(e4.STRING, (Object) str));
        }
        io.sentry.protocol.r sdkVersion = u3Var.k().getSdkVersion();
        if (sdkVersion != null) {
            e4 e4Var = e4.STRING;
            map.put("sentry.sdk.name", new io.sentry.protocol.j(e4Var, (Object) sdkVersion.f12625a));
            map.put("sentry.sdk.version", new io.sentry.protocol.j(sdkVersion.f12626d, e4Var.apiName()));
        }
        String environment = u3Var.k().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new io.sentry.protocol.j(e4.STRING, (Object) environment));
        }
        io.sentry.protocol.t tVarI = u3Var.f12793e.i();
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        if (tVar.equals(tVarI)) {
            io.sentry.protocol.t tVarI2 = u3Var.k().getReplayController().i();
            if (!tVar.equals(tVarI2)) {
                map.put("sentry.replay_id", new io.sentry.protocol.j(e4.STRING, (Object) tVarI2.toString()));
                map.put("sentry._internal.replay_is_buffering", new io.sentry.protocol.j(e4.BOOLEAN, Boolean.TRUE));
            }
        } else {
            map.put("sentry.replay_id", new io.sentry.protocol.j(e4.STRING, (Object) tVarI.toString()));
        }
        String release = u3Var.k().getRelease();
        if (release != null) {
            map.put("sentry.release", new io.sentry.protocol.j(e4.STRING, (Object) release));
        }
        e4 e4Var2 = e4.STRING;
        map.put("sentry.trace.parent_span_id", new io.sentry.protocol.j(e4Var2, n6Var));
        if (!io.sentry.util.g.f12810a) {
            x5 x5VarK = u3Var.k();
            String serverName = x5VarK.getServerName();
            if (serverName != null) {
                map.put("server.address", new io.sentry.protocol.j(serverName, e4Var2.apiName()));
            } else if (x5VarK.isAttachServerName()) {
                io.sentry.k0 k0VarA = io.sentry.k0.a();
                if (k0VarA.f12405c < System.currentTimeMillis() && k0VarA.f12406d.compareAndSet(false, true)) {
                    k0VarA.b();
                }
                String str2 = k0VarA.f12404b;
                if (str2 != null) {
                    map.put("server.address", new io.sentry.protocol.j(str2, e4Var2.apiName()));
                }
            }
        }
        io.sentry.protocol.e0 e0VarK = u3Var.f12793e.K();
        if (e0VarK != null) {
            String str3 = e0VarK.f12535d;
            if (str3 != null) {
                map.put("user.id", new io.sentry.protocol.j(str3, e4Var2.apiName()));
            }
            String str4 = e0VarK.f12536g;
            if (str4 != null) {
                map.put("user.name", new io.sentry.protocol.j(str4, e4Var2.apiName()));
            }
            String str5 = e0VarK.f12534a;
            if (str5 != null) {
                map.put("user.email", new io.sentry.protocol.j(str5, e4Var2.apiName()));
            }
        }
        return map;
    }

    public void V() {
        ((n0.s) this.f10199d).getClass();
    }

    public vj.d W() {
        Object obj = ((ConcurrentHashMap) this.f10199d).get(mk.c.JOB_RESULT);
        if (obj instanceof vj.d) {
            return (vj.d) obj;
        }
        return null;
    }

    public int X(ArrayList arrayList, hm.a aVar) {
        hm.a aVar2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            bj.a aVar3 = (bj.a) next;
            int i10 = aVar3.f2771b;
            switch (hm.b.f10845b[aVar3.f2773d.ordinal()]) {
                case 1:
                    aVar2 = hm.a.TWO_G;
                    break;
                case 2:
                    aVar2 = hm.a.THREE_G;
                    break;
                case 3:
                    aVar2 = hm.a.FOUR_G;
                    break;
                case 4:
                    aVar2 = hm.a.FIVE_G;
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    aVar2 = hm.a.OTHER;
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    ((com.staircase3.opensignal.utils.o) this.f10199d).getClass();
                    switch (hm.b.f10844a[com.staircase3.opensignal.utils.o.a(i10).ordinal()]) {
                        case 1:
                            aVar2 = hm.a.TWO_G;
                            break;
                        case 2:
                        case 3:
                            aVar2 = hm.a.THREE_G;
                            break;
                        case 4:
                            aVar2 = hm.a.FOUR_G;
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            aVar2 = hm.a.OTHER;
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            aVar2 = hm.a.NO_DATA_CONNECTION;
                            break;
                        default:
                            aVar2 = hm.a.NO_DATA_CONNECTION;
                            break;
                    }
                default:
                    throw new bf.n();
            }
            if (aVar2 == aVar) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            bj.a aVar4 = (bj.a) it2.next();
            i11 += aVar4.f2776g + aVar4.f2775f;
        }
        return i11;
    }

    public void Y(int i10, long j) throws androidx.media3.common.k0 {
        j6.c cVar = (j6.c) this.f10199d;
        if (i10 == 20529) {
            if (j == 0) {
                return;
            }
            throw androidx.media3.common.k0.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i10 == 20530) {
            if (j == 1) {
                return;
            }
            throw androidx.media3.common.k0.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i10) {
            case 131:
                cVar.b(i10);
                cVar.f13402u.f13355d = (int) j;
                return;
            case 136:
                cVar.b(i10);
                cVar.f13402u.V = j == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                cVar.I = cVar.k(j);
                return;
            case 159:
                cVar.b(i10);
                cVar.f13402u.O = (int) j;
                return;
            case 176:
                cVar.b(i10);
                cVar.f13402u.f13362m = (int) j;
                return;
            case 179:
                cVar.a(i10);
                cVar.C.a(cVar.k(j));
                return;
            case 186:
                cVar.b(i10);
                cVar.f13402u.f13363n = (int) j;
                return;
            case 215:
                cVar.b(i10);
                cVar.f13402u.f13354c = (int) j;
                return;
            case 231:
                cVar.B = cVar.k(j);
                return;
            case 238:
                cVar.P = (int) j;
                return;
            case 241:
                if (cVar.E) {
                    return;
                }
                cVar.a(i10);
                cVar.D.a(j);
                cVar.E = true;
                return;
            case 251:
                cVar.Q = true;
                return;
            case 16871:
                cVar.b(i10);
                cVar.f13402u.f13358g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw androidx.media3.common.k0.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw androidx.media3.common.k0.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw androidx.media3.common.k0.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw androidx.media3.common.k0.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw androidx.media3.common.k0.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                cVar.f13405x = j + cVar.f13398q;
                return;
            case 21432:
                int i11 = (int) j;
                cVar.b(i10);
                if (i11 == 0) {
                    cVar.f13402u.f13372w = 0;
                    return;
                }
                if (i11 == 1) {
                    cVar.f13402u.f13372w = 2;
                    return;
                } else if (i11 == 3) {
                    cVar.f13402u.f13372w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    cVar.f13402u.f13372w = 3;
                    return;
                }
            case 21680:
                cVar.b(i10);
                cVar.f13402u.f13364o = (int) j;
                return;
            case 21682:
                cVar.b(i10);
                cVar.f13402u.f13366q = (int) j;
                return;
            case 21690:
                cVar.b(i10);
                cVar.f13402u.f13365p = (int) j;
                return;
            case 21930:
                cVar.b(i10);
                cVar.f13402u.U = j == 1;
                return;
            case 21998:
                cVar.b(i10);
                cVar.f13402u.f13357f = (int) j;
                return;
            case 22186:
                cVar.b(i10);
                cVar.f13402u.R = j;
                return;
            case 22203:
                cVar.b(i10);
                cVar.f13402u.S = j;
                return;
            case 25188:
                cVar.b(i10);
                cVar.f13402u.P = (int) j;
                return;
            case 30114:
                cVar.R = j;
                return;
            case 30321:
                cVar.b(i10);
                int i12 = (int) j;
                if (i12 == 0) {
                    cVar.f13402u.f13367r = 0;
                    return;
                }
                if (i12 == 1) {
                    cVar.f13402u.f13367r = 1;
                    return;
                } else if (i12 == 2) {
                    cVar.f13402u.f13367r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    cVar.f13402u.f13367r = 3;
                    return;
                }
            case 2352003:
                cVar.b(i10);
                cVar.f13402u.f13356e = (int) j;
                return;
            case 2807729:
                cVar.f13399r = j;
                return;
            default:
                switch (i10) {
                    case 21945:
                        cVar.b(i10);
                        int i13 = (int) j;
                        if (i13 == 1) {
                            cVar.f13402u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            cVar.f13402u.A = 1;
                            return;
                        }
                    case 21946:
                        cVar.b(i10);
                        int iB = androidx.media3.common.k.b((int) j);
                        if (iB != -1) {
                            cVar.f13402u.f13375z = iB;
                            return;
                        }
                        return;
                    case 21947:
                        cVar.b(i10);
                        cVar.f13402u.f13373x = true;
                        int iA = androidx.media3.common.k.a((int) j);
                        if (iA != -1) {
                            cVar.f13402u.f13374y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        cVar.b(i10);
                        cVar.f13402u.B = (int) j;
                        return;
                    case 21949:
                        cVar.b(i10);
                        cVar.f13402u.C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void Z() {
        ((o4.x) this.f10199d).f18880y.Q();
    }

    @Override // mh.k
    public void a() {
        ch.n.b("UdpJob", "Start UDP test");
    }

    public void a0(Exception exc) {
        ch.n.b("PingSenderListener", "onPingError() called with: exception = [" + exc + "]");
        ((mh.l) this.f10199d).f16768r.r(exc, null);
    }

    public void b0(VideoTestResult videoTestResult, long j) {
        r2 r2Var = (r2) this.f10199d;
        VideoTestActivity videoTestActivity = (VideoTestActivity) r2Var.f10470a;
        videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 2));
        ((tm.b) videoTestActivity.f6111f0.getValue()).f22889c.interrupt();
        videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 3));
        NetworkUiState networkUiState = videoTestActivity.W;
        OpensignalDatabase opensignalDatabase = (OpensignalDatabase) r2Var.f10473r;
        if (opensignalDatabase == null) {
            br.l.l("database");
            throw null;
        }
        br.l.e(networkUiState, "networkUiState");
        if (videoTestResult != null) {
            if (((nm.e) r2Var.f10472g) == null) {
                br.l.l("videoTestModel");
                throw null;
            }
            AsyncTask.execute(new ch.a(videoTestResult, networkUiState, opensignalDatabase, 12));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("INTENT_EXTRA_VIDEO_TEST_RESULT", videoTestResult);
            bundle.putLong("BUNDLE_EXTRA_TASK_ID_KEY", j);
            Intent intent = new Intent(videoTestActivity, (Class<?>) VideoResultActivity.class);
            intent.putExtra("extras", bundle);
            intent.addFlags(1073741824);
            videoTestActivity.startActivity(intent);
            videoTestActivity.finish();
        }
    }

    @Override // rr.t
    public rr.u build() {
        return (kt.c) this.f10199d;
    }

    public void c0(i4.b bVar, io.sentry.u0 u0Var, Object obj) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) bVar.f11196a;
        if (obj == null) {
            cVar.i();
            return;
        }
        if (obj instanceof Character) {
            bVar.V(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            bVar.V((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            bVar.W(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            bVar.U((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                bVar.V(dr.a.A((Date) obj));
                return;
            } catch (Exception e4) {
                u0Var.g(b5.ERROR, "Error when serializing Date", e4);
                cVar.i();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                bVar.V(((TimeZone) obj).getID());
                return;
            } catch (Exception e10) {
                u0Var.g(b5.ERROR, "Error when serializing TimeZone", e10);
                cVar.i();
                return;
            }
        }
        if (obj instanceof c2) {
            ((c2) obj).serialize(bVar, u0Var);
            return;
        }
        if (obj instanceof Collection) {
            d0(bVar, u0Var, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            d0(bVar, u0Var, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            e0(bVar, u0Var, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            bVar.V(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.c.f12804a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
            }
            d0(bVar, u0Var, arrayList);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            bVar.W(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            bVar.V(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            bVar.V(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            bVar.V(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            bVar.V(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            e0(bVar, u0Var, io.sentry.util.c.a((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            bVar.V(obj.toString());
            return;
        }
        try {
            c0(bVar, u0Var, ((ag.b) this.f10199d).q(u0Var, obj));
        } catch (Exception e11) {
            u0Var.g(b5.ERROR, "Failed serializing unknown object.", e11);
            bVar.V("[OBJECT]");
        }
    }

    @Override // rr.t
    public rr.t d(sr.h hVar) {
        br.l.e(hVar, "additionalAnnotations");
        return this;
    }

    public void d0(i4.b bVar, io.sentry.u0 u0Var, Collection collection) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) bVar.f11196a;
        cVar.y();
        cVar.b();
        int i10 = cVar.f12846g;
        int[] iArr = cVar.f12845d;
        if (i10 == iArr.length) {
            cVar.f12845d = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = cVar.f12845d;
        int i11 = cVar.f12846g;
        cVar.f12846g = i11 + 1;
        iArr2[i11] = 1;
        cVar.f12844a.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c0(bVar, u0Var, it.next());
        }
        cVar.f(1, 2, ']');
    }

    @Override // io.sentry.logger.a
    public void e(f5 f5Var, hf.y yVar, String str, Object... objArr) {
        String str2;
        u3 u3Var = (u3) this.f10199d;
        x5 x5VarK = u3Var.k();
        io.sentry.z0 z0Var = u3Var.f12793e;
        try {
            if (!u3Var.isEnabled()) {
                x5VarK.getLogger().m(b5.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!x5VarK.getLogs().f12693a) {
                x5VarK.getLogger().m(b5.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            k4 k4VarA = x5VarK.getDateProvider().a();
            if (objArr.length == 0) {
                str2 = str;
            } else {
                try {
                    str2 = String.format(str, objArr);
                } catch (Throwable th2) {
                    u3Var.k().getLogger().g(b5.ERROR, "Error while running log through String.format", th2);
                }
            }
            io.sentry.k kVarV = z0Var.v();
            io.sentry.i1 i1VarH = z0Var.h();
            if (i1VarH == null) {
                z0Var.E(new androidx.media3.exoplayer.trackselection.h(z0Var, 28, x5VarK));
            }
            io.sentry.protocol.t tVar = i1VarH == null ? (io.sentry.protocol.t) kVarV.f12397d : i1VarH.t().f12412a;
            n6 n6Var = i1VarH == null ? (n6) kVarV.f12398g : i1VarH.t().f12413d;
            d5 d5Var = new d5(tVar, Double.valueOf(k4VarA.d() / 1.0E9d), str2, f5Var);
            d5Var.f12196y = U(yVar, str, n6Var, objArr);
            d5Var.f12195x = Integer.valueOf(f5Var.getSeverityNumber());
            z0Var.y().h(d5Var, z0Var);
        } catch (Throwable th3) {
            x5VarK.getLogger().g(b5.ERROR, "Error while capturing log event", th3);
        }
    }

    public void e0(i4.b bVar, io.sentry.u0 u0Var, Map map) throws IOException {
        bVar.C();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                bVar.I((String) obj);
                c0(bVar, u0Var, map.get(obj));
            }
        }
        bVar.F();
    }

    @Override // mh.k
    public void f(mh.c cVar) {
        mi.y yVar = (mi.y) this.f10199d;
        if (cVar == null) {
            ch.n.g("UdpJob", "Send progress payload is null");
            return;
        }
        if (yVar.B) {
            ni.y0 y0VarU = mi.y.u(yVar, true, cVar);
            hk.h hVar = yVar.E;
            if (hVar != null) {
                hVar.f(yVar.W, y0VarU);
            }
        }
    }

    @Override // mh.k
    public void g(mh.c cVar) {
        mi.y yVar = (mi.y) this.f10199d;
        if (cVar == null) {
            ch.n.g("UdpJob", "Receive progress payload is null");
            return;
        }
        if (yVar.B) {
            ni.y0 y0VarU = mi.y.u(yVar, false, cVar);
            hk.h hVar = yVar.E;
            if (hVar != null) {
                hVar.f(yVar.W, y0VarU);
            }
        }
    }

    @Override // rr.n
    public Object h(rr.u uVar, Object obj) {
        return new lr.f0((lr.d0) this.f10199d, uVar);
    }

    @Override // rr.n
    public Object j(ur.v vVar, Object obj) {
        return null;
    }

    @Override // io.sentry.y3
    public x3 k(io.sentry.b1 b1Var, x5 x5Var) {
        ir.f0.T(b1Var, "Scopes are required");
        ir.f0.T(x5Var, "SentryOptions is required");
        String outboxPath = ((io.sentry.android.core.m) this.f10199d).f11702a.getOutboxPath();
        if (outboxPath == null || !y3.H(x5Var.getLogger(), outboxPath)) {
            x5Var.getLogger().m(b5.ERROR, "No outbox dir path is defined in options.", new Object[0]);
            return null;
        }
        return new x3(x5Var.getLogger(), outboxPath, new z2(b1Var, x5Var.getEnvelopeReader(), x5Var.getSerializer(), x5Var.getLogger(), x5Var.getFlushTimeoutMillis(), x5Var.getMaxQueueSize()), new File(outboxPath));
    }

    @Override // js.o
    public void l(qs.g gVar, Object obj) {
        ks.g gVar2 = (ks.g) this.f10199d;
        String strB = gVar.b();
        if ("k".equals(strB)) {
            if (obj instanceof Integer) {
                gVar2.B = ks.b.getById(((Integer) obj).intValue());
                return;
            }
            return;
        }
        if ("mv".equals(strB)) {
            if (obj instanceof int[]) {
                gVar2.f14500a = (int[]) obj;
            }
        } else {
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    gVar2.f14501d = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strB)) {
                "pn".equals(strB);
            } else if (obj instanceof Integer) {
                gVar2.f14502g = ((Integer) obj).intValue();
            }
        }
    }

    @Override // dd.g
    public dd.r o(Object obj) {
        qf.b bVar = (qf.b) obj;
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f10199d;
        if (bVar == null) {
            io.sentry.android.core.e0.q("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return e5.u(null);
        }
        hf.l lVar = (hf.l) cVar.f12354g;
        hf.l.a(lVar);
        lVar.f10677m.d1(null, lVar.f10671e.f13707a);
        lVar.f10681q.c(null);
        return e5.u(null);
    }

    @Override // rr.t
    public rr.t p(ht.x xVar) {
        br.l.e(xVar, "type");
        return this;
    }

    @Override // rr.n
    public Object s(ur.q0 q0Var, Object obj) {
        return null;
    }

    public String toString() {
        switch (this.f10198a) {
            case 14:
                StringBuilder sb2 = new StringBuilder();
                es.s sVar = (es.s) this.f10199d;
                sb2.append(sVar);
                sb2.append(": ");
                sb2.append(((Map) io.sentry.config.a.Z(sVar.F, es.s.J[0])).keySet());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // rr.n
    public Object u(ur.j0 j0Var, Object obj) {
        return h(j0Var, obj);
    }

    @Override // rr.t
    public rr.t v(as.p pVar) {
        br.l.e(pVar, "visibility");
        return this;
    }

    @Override // h7.t1
    public s1 w() {
        return (cg.e) this.f10199d;
    }

    @Override // rr.n
    public Object z(Object obj, ur.a0 a0Var) {
        return null;
    }

    public /* synthetic */ r1(int i10, Object obj) {
        this.f10198a = i10;
        this.f10199d = obj;
    }

    public r1(bm.e eVar) {
        this.f10198a = 24;
        br.l.e(eVar, "repository");
        this.f10199d = eVar;
    }

    public r1(SurvicateImageLoaderImpl survicateImageLoaderImpl) {
        this.f10198a = 27;
        br.l.e(survicateImageLoaderImpl, "imageLoader");
        this.f10199d = survicateImageLoaderImpl;
    }

    public r1(com.staircase3.opensignal.utils.o oVar) {
        this.f10198a = 2;
        br.l.e(oVar, "networkTypeUtils");
        this.f10199d = oVar;
    }

    public r1(int i10) {
        this.f10198a = 7;
        this.f10199d = new ag.b(i10);
    }

    public r1(Context context) {
        boolean zIsEmpty;
        this.f10198a = 16;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f10199d = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e4) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e4.getMessage();
            }
        }
    }

    @Override // rr.t
    public rr.t A() {
        return this;
    }

    @Override // rr.t
    public rr.t Q() {
        return this;
    }

    @Override // js.o
    public void b() {
    }

    @Override // rr.t
    public rr.t i() {
        return this;
    }

    @Override // rr.t
    public rr.t m() {
        return this;
    }

    @Override // rr.t
    public rr.t n() {
        return this;
    }

    @Override // rr.t
    public rr.t r() {
        return this;
    }

    @Override // rr.t
    public rr.t x() {
        return this;
    }

    public r1(int i10, byte b2) {
        this.f10198a = i10;
        switch (i10) {
            case 9:
                Looper mainLooper = Looper.getMainLooper();
                br.l.d(mainLooper, "getMainLooper(...)");
                this.f10199d = new Handler(mainLooper);
                break;
            case 12:
                this.f10199d = new com.google.android.exoplayer2.source.hls.c(5, 1.0f, false, 1);
                break;
            default:
                this.f10199d = new cg.e();
                break;
        }
    }

    @Override // rr.t
    public rr.t E(ur.v vVar) {
        return this;
    }

    @Override // rr.t
    public rr.t c(List list) {
        return this;
    }

    @Override // rr.t
    public rr.t t(rr.z zVar) {
        return this;
    }

    @Override // js.o
    public void M(qs.g gVar, vs.f fVar) {
    }

    @Override // js.o
    public void q(qs.g gVar, qs.b bVar, qs.g gVar2) {
    }
}
