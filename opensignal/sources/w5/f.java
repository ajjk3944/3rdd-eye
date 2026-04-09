package w5;

import a5.d0;
import a5.v;
import androidx.media3.common.q;
import androidx.media3.common.r;
import java.util.Arrays;
import oe.e0;
import oe.f0;
import oe.h0;
import oe.s;
import oe.u0;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f24228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24229b;

    public f(int i10, u0 u0Var) {
        this.f24229b = i10;
        this.f24228a = u0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i10, v vVar) {
        a gVar;
        String str;
        int i11;
        int i12 = 4;
        s.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i13 = vVar.f167c;
        int i14 = 0;
        int i15 = -2;
        int i16 = 0;
        while (vVar.a() > 8) {
            int i17 = vVar.i();
            int i18 = vVar.f166b + vVar.i();
            vVar.D(i18);
            if (i17 != 1414744396) {
                d dVar = null;
                switch (i17) {
                    case 1718776947:
                        if (i15 == 2) {
                            vVar.F(i12);
                            int i19 = vVar.i();
                            int i20 = vVar.i();
                            vVar.F(i12);
                            int i21 = vVar.i();
                            switch (i21) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                q qVar = new q();
                                qVar.f1747p = i19;
                                qVar.f1748q = i20;
                                qVar.k = str;
                                gVar = new g(new r(qVar));
                                break;
                            } else {
                                c7.a.z("Ignoring track with unsupported compression ", i21, "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i15 == 1) {
                                int iM = vVar.m();
                                String str2 = iM != 1 ? iM != 85 ? iM != 255 ? iM != 8192 ? iM != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iM2 = vVar.m();
                                    int i22 = vVar.i();
                                    vVar.F(6);
                                    int iV = d0.v(vVar.y());
                                    int iM3 = vVar.m();
                                    byte[] bArr = new byte[iM3];
                                    vVar.e(bArr, i14, iM3);
                                    q qVar2 = new q();
                                    qVar2.k = str2;
                                    qVar2.f1755x = iM2;
                                    qVar2.f1756y = i22;
                                    if ("audio/raw".equals(str2) && iV != 0) {
                                        qVar2.f1757z = iV;
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && iM3 > 0) {
                                        qVar2.f1744m = h0.p(bArr);
                                    }
                                    gVar = new g(new r(qVar2));
                                    break;
                                } else {
                                    c7.a.z("Ignoring track with unsupported format tag ", iM, "StreamFormatChunk");
                                }
                            } else {
                                a5.a.B("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + d0.A(i15));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int i23 = vVar.i();
                        vVar.F(8);
                        int i24 = vVar.i();
                        int i25 = vVar.i();
                        vVar.F(i12);
                        vVar.i();
                        vVar.F(12);
                        gVar = new c(i23, i24, i25);
                        break;
                    case 1752331379:
                        int i26 = vVar.i();
                        vVar.F(12);
                        vVar.i();
                        int i27 = vVar.i();
                        int i28 = vVar.i();
                        vVar.F(i12);
                        int i29 = vVar.i();
                        int i30 = vVar.i();
                        vVar.F(8);
                        dVar = new d(i26, i27, i28, i29, i30);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(vVar.r(vVar.a(), ne.g.f17524c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(vVar.i(), vVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i31 = ((d) gVar).f24213a;
                    if (i31 == 1935960438) {
                        i15 = 2;
                    } else if (i31 != 1935963489) {
                        if (i31 != 1937012852) {
                            a5.a.B("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i31));
                            i11 = -1;
                        } else {
                            i11 = 3;
                        }
                        i15 = i11;
                    } else {
                        i15 = 1;
                    }
                }
                int i32 = i16 + 1;
                if (objArrCopyOf.length < i32) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, e0.e(objArrCopyOf.length, i32));
                }
                objArrCopyOf[i16] = gVar;
                i16 = i32;
            }
            vVar.E(i18);
            vVar.D(i13);
            i12 = 4;
            i14 = 0;
        }
        return new f(i10, h0.k(i16, objArrCopyOf));
    }

    public final a a(Class cls) {
        f0 f0VarListIterator = this.f24228a.listIterator(0);
        while (f0VarListIterator.hasNext()) {
            a aVar = (a) f0VarListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // w5.a
    public final int getType() {
        return this.f24229b;
    }
}
