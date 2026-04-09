package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.xj0;

/* loaded from: classes3.dex */
final class lr0 implements hi {

    /* renamed from: a, reason: collision with root package name */
    public final xj0<hi> f30087a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30088b;

    private lr0(int i, xj0<hi> xj0Var) {
        this.f30088b = i;
        this.f30087a = xj0Var;
    }

    public final <T extends hi> T a(Class<T> cls) {
        w72<hi> w72VarListIterator = this.f30087a.listIterator(0);
        while (w72VarListIterator.hasNext()) {
            T t10 = (T) w72VarListIterator.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.hi
    public final int getType() {
        return this.f30088b;
    }

    public static lr0 a(int i, uf1 uf1Var) {
        String str;
        hi j22Var;
        String str2;
        xj0.a aVar = new xj0.a();
        int iE = uf1Var.e();
        int i10 = -2;
        while (uf1Var.a() > 8) {
            int iK = uf1Var.k();
            int iD = uf1Var.d() + uf1Var.k();
            uf1Var.d(iD);
            if (iK == 1414744396) {
                j22Var = a(uf1Var.k(), uf1Var);
            } else if (iK != 1718776947) {
                if (iK == 1751742049) {
                    j22Var = ji.a(uf1Var);
                } else if (iK != 1752331379) {
                    j22Var = iK != 1852994675 ? null : l22.a(uf1Var);
                } else {
                    j22Var = ki.a(uf1Var);
                }
            } else if (i10 == 2) {
                uf1Var.f(4);
                int iK2 = uf1Var.k();
                int iK3 = uf1Var.k();
                uf1Var.f(4);
                int iK4 = uf1Var.k();
                switch (iK4) {
                    case 808802372:
                    case 877677894:
                    case 1145656883:
                    case 1145656920:
                    case 1482049860:
                    case 1684633208:
                    case 2021026148:
                        str2 = "video/mp4v-es";
                        break;
                    case 826496577:
                    case 828601953:
                    case 875967048:
                        str2 = "video/avc";
                        break;
                    case 842289229:
                        str2 = "video/mp42";
                        break;
                    case 859066445:
                        str2 = "video/mp43";
                        break;
                    case 1196444237:
                    case 1735420525:
                        str2 = "video/mjpeg";
                        break;
                    default:
                        str2 = null;
                        break;
                }
                if (str2 == null) {
                    kr0.a("Ignoring track with unsupported compression ", iK4, "StreamFormatChunk");
                } else {
                    dc0.a aVar2 = new dc0.a();
                    aVar2.o(iK2).f(iK3).e(str2);
                    j22Var = new j22(aVar2.a());
                }
            } else {
                if (i10 == 1) {
                    int iO = uf1Var.o();
                    if (iO == 1) {
                        str = "audio/raw";
                    } else if (iO == 85) {
                        str = "audio/mpeg";
                    } else if (iO == 255) {
                        str = "audio/mp4a-latm";
                    } else if (iO != 8192) {
                        str = iO != 8193 ? null : "audio/vnd.dts";
                    } else {
                        str = "audio/ac3";
                    }
                    if (str == null) {
                        kr0.a("Ignoring track with unsupported format tag ", iO, "StreamFormatChunk");
                    } else {
                        int iO2 = uf1Var.o();
                        int iK5 = uf1Var.k();
                        uf1Var.f(6);
                        int iB = s82.b(uf1Var.z());
                        int iO3 = uf1Var.o();
                        byte[] bArr = new byte[iO3];
                        uf1Var.a(bArr, 0, iO3);
                        dc0.a aVar3 = new dc0.a();
                        aVar3.e(str).c(iO2).l(iK5);
                        if ("audio/raw".equals(str) && iB != 0) {
                            aVar3.i(iB);
                        }
                        if ("audio/mp4a-latm".equals(str) && iO3 > 0) {
                            aVar3.a(xj0.a(bArr));
                        }
                        j22Var = new j22(aVar3.a());
                    }
                } else {
                    rs0.d("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + s82.d(i10));
                }
            }
            if (j22Var != null) {
                if (j22Var.getType() == 1752331379) {
                    ki kiVar = (ki) j22Var;
                    int i11 = kiVar.f29667a;
                    if (i11 == 1935960438) {
                        i10 = 2;
                    } else if (i11 == 1935963489) {
                        i10 = 1;
                    } else if (i11 != 1937012852) {
                        rs0.d("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(kiVar.f29667a));
                        i10 = -1;
                    } else {
                        i10 = 3;
                    }
                }
                aVar.b(j22Var);
            }
            uf1Var.e(iD);
            uf1Var.d(iE);
        }
        return new lr0(i, aVar.a());
    }
}
