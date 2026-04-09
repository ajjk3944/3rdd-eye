package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0967c1 implements X0 {

    /* renamed from: a, reason: collision with root package name */
    public final LB f13511a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13512b;

    public C0967c1(int i, C1197gC c1197gC) {
        this.f13512b = i;
        this.f13511a = c1197gC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C0967c1 b(int i, C2036vr c2036vr) {
        String str;
        X0 c1022d1;
        String str2;
        C1476lN.v(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = c2036vr.f17356c;
        int iB = -2;
        int i6 = 0;
        while (c2036vr.B() > 8) {
            int iC = c2036vr.c();
            int iC2 = c2036vr.f17355b + c2036vr.c();
            c2036vr.C(iC2);
            if (iC != 1414744396) {
                C0858a1 c0858a1 = null;
                switch (iC) {
                    case 1718776947:
                        if (iB == 2) {
                            c2036vr.G(4);
                            int iC3 = c2036vr.c();
                            int iC4 = c2036vr.c();
                            c2036vr.G(4);
                            int iC5 = c2036vr.c();
                            switch (iC5) {
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
                            if (str2 != null) {
                                C1855sP c1855sP = new C1855sP();
                                c1855sP.f16739s = iC3;
                                c1855sP.f16740t = iC4;
                                c1855sP.e(str2);
                                c1022d1 = new C1022d1(new TP(c1855sP));
                                break;
                            } else {
                                A.f.u(new StringBuilder(String.valueOf(iC5).length() + 44), "Ignoring track with unsupported compression ", iC5, "StreamFormatChunk");
                                c1022d1 = c0858a1;
                                break;
                            }
                        } else {
                            if (iB == 1) {
                                int iM = c2036vr.M();
                                String str3 = iM != 1 ? iM != 85 ? iM != 255 ? iM != 8192 ? iM != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str3 != null) {
                                    int iM2 = c2036vr.M();
                                    int iC6 = c2036vr.c();
                                    c2036vr.G(6);
                                    int iY = Vt.y(c2036vr.M(), ByteOrder.LITTLE_ENDIAN);
                                    int iM3 = c2036vr.B() > 0 ? c2036vr.M() : 0;
                                    C1855sP c1855sP2 = new C1855sP();
                                    c1855sP2.e(str3);
                                    c1855sP2.f16714D = iM2;
                                    c1855sP2.f16715E = iC6;
                                    if (str3.equals("audio/raw") && iY != 0) {
                                        c1855sP2.f16716F = iY;
                                    }
                                    if (str3.equals("audio/mp4a-latm") && iM3 > 0) {
                                        byte[] bArr = new byte[iM3];
                                        c2036vr.H(0, iM3, bArr);
                                        c1855sP2.f16735o = LB.i(bArr);
                                    }
                                    c1022d1 = new C1022d1(new TP(c1855sP2));
                                    break;
                                } else {
                                    A.f.u(new StringBuilder(String.valueOf(iM).length() + 43), "Ignoring track with unsupported format tag ", iM, "StreamFormatChunk");
                                }
                            } else {
                                String str4 = Vt.f12096a;
                                switch (iB) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = "unknown";
                                        break;
                                    case 0:
                                        str = "default";
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = "video";
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                AbstractC2022vd.v("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            c1022d1 = c0858a1;
                        }
                    case 1751742049:
                        int iC7 = c2036vr.c();
                        c2036vr.G(8);
                        int iC8 = c2036vr.c();
                        int iC9 = c2036vr.c();
                        c2036vr.G(4);
                        c2036vr.c();
                        c2036vr.G(12);
                        c1022d1 = new Z0(iC7, iC8, iC9);
                        break;
                    case 1752331379:
                        int iC10 = c2036vr.c();
                        c2036vr.G(12);
                        c2036vr.c();
                        int iC11 = c2036vr.c();
                        int iC12 = c2036vr.c();
                        c2036vr.G(4);
                        int iC13 = c2036vr.c();
                        int iC14 = c2036vr.c();
                        c2036vr.G(4);
                        c0858a1 = new C0858a1(iC10, iC11, iC12, iC13, iC14, c2036vr.c());
                        c1022d1 = c0858a1;
                        break;
                    case 1852994675:
                        c1022d1 = new C1076e1(c2036vr.k(c2036vr.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        c1022d1 = c0858a1;
                        break;
                }
            } else {
                c1022d1 = b(c2036vr.c(), c2036vr);
            }
            if (c1022d1 != null) {
                if (c1022d1.a() == 1752331379) {
                    iB = ((C0858a1) c1022d1).b();
                }
                int length = objArrCopyOf.length;
                int i7 = i6 + 1;
                int iD = GB.d(length, i7);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i6] = c1022d1;
                i6 = i7;
            }
            c2036vr.E(iC2);
            c2036vr.C(i3);
        }
        return new C0967c1(i, LB.o(i6, objArrCopyOf));
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final int a() {
        return this.f13512b;
    }

    public final X0 c(Class cls) {
        LB lb = this.f13511a;
        int size = lb.size();
        int i = 0;
        while (i < size) {
            X0 x02 = (X0) lb.get(i);
            i++;
            if (x02.getClass() == cls) {
                return x02;
            }
        }
        return null;
    }
}
