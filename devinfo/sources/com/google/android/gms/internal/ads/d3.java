package com.google.android.gms.internal.ads;

import com.applovin.sdk.AppLovinMediationProvider;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d3 implements y2 {

    /* renamed from: a, reason: collision with root package name */
    public final x41 f10309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10310b;

    public d3(int i4, u51 u51Var) {
        this.f10310b = i4;
        this.f10309a = u51Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d3 a(int i4, sk0 sk0Var) {
        String str;
        y2 e3Var;
        String str2;
        yr1.u(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = sk0Var.f16448c;
        int iA = -2;
        int i11 = 0;
        while (sk0Var.B() > 8) {
            int iC = sk0Var.c();
            int iC2 = sk0Var.f16447b + sk0Var.c();
            sk0Var.C(iC2);
            if (iC != 1414744396) {
                b3 b3Var = null;
                switch (iC) {
                    case 1718776947:
                        if (iA == 2) {
                            sk0Var.G(4);
                            int iC3 = sk0Var.c();
                            int iC4 = sk0Var.c();
                            sk0Var.G(4);
                            int iC5 = sk0Var.c();
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
                                lw1 lw1Var = new lw1();
                                lw1Var.f13668s = iC3;
                                lw1Var.f13669t = iC4;
                                lw1Var.e(str2);
                                e3Var = new e3(new mx1(lw1Var));
                                break;
                            } else {
                                a0.g.z(new StringBuilder(String.valueOf(iC5).length() + 44), "Ignoring track with unsupported compression ", iC5, "StreamFormatChunk");
                                e3Var = b3Var;
                                break;
                            }
                        } else {
                            if (iA == 1) {
                                int iM = sk0Var.M();
                                String str3 = iM != 1 ? iM != 85 ? iM != 255 ? iM != 8192 ? iM != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str3 != null) {
                                    int iM2 = sk0Var.M();
                                    int iC6 = sk0Var.c();
                                    sk0Var.G(6);
                                    int iY = bq0.y(sk0Var.M(), ByteOrder.LITTLE_ENDIAN);
                                    int iM3 = sk0Var.B() > 0 ? sk0Var.M() : 0;
                                    lw1 lw1Var2 = new lw1();
                                    lw1Var2.e(str3);
                                    lw1Var2.D = iM2;
                                    lw1Var2.E = iC6;
                                    if (str3.equals("audio/raw") && iY != 0) {
                                        lw1Var2.F = iY;
                                    }
                                    if (str3.equals("audio/mp4a-latm") && iM3 > 0) {
                                        byte[] bArr = new byte[iM3];
                                        sk0Var.H(0, iM3, bArr);
                                        lw1Var2.f13664o = x41.l(bArr);
                                    }
                                    e3Var = new e3(new mx1(lw1Var2));
                                    break;
                                } else {
                                    a0.g.z(new StringBuilder(String.valueOf(iM).length() + 43), "Ignoring track with unsupported format tag ", iM, "StreamFormatChunk");
                                }
                            } else {
                                String str4 = bq0.f9768a;
                                switch (iA) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = AppLovinMediationProvider.UNKNOWN;
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
                                ls.t("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            e3Var = b3Var;
                        }
                    case 1751742049:
                        int iC7 = sk0Var.c();
                        sk0Var.G(8);
                        int iC8 = sk0Var.c();
                        int iC9 = sk0Var.c();
                        sk0Var.G(4);
                        sk0Var.c();
                        sk0Var.G(12);
                        e3Var = new a3(iC7, iC8, iC9);
                        break;
                    case 1752331379:
                        int iC10 = sk0Var.c();
                        sk0Var.G(12);
                        sk0Var.c();
                        int iC11 = sk0Var.c();
                        int iC12 = sk0Var.c();
                        sk0Var.G(4);
                        int iC13 = sk0Var.c();
                        int iC14 = sk0Var.c();
                        sk0Var.G(4);
                        b3Var = new b3(iC10, iC11, iC12, iC13, iC14, sk0Var.c());
                        e3Var = b3Var;
                        break;
                    case 1852994675:
                        e3Var = new f3(sk0Var.k(sk0Var.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        e3Var = b3Var;
                        break;
                }
            } else {
                e3Var = a(sk0Var.c(), sk0Var);
            }
            if (e3Var != null) {
                if (e3Var.b() == 1752331379) {
                    iA = ((b3) e3Var).a();
                }
                int length = objArrCopyOf.length;
                int i12 = i11 + 1;
                int iD = s41.d(length, i12);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i11] = e3Var;
                i11 = i12;
            }
            sk0Var.E(iC2);
            sk0Var.C(i10);
        }
        return new d3(i4, x41.s(objArrCopyOf, i11));
    }

    @Override // com.google.android.gms.internal.ads.y2
    public final int b() {
        return this.f10310b;
    }

    public final y2 c(Class cls) {
        x41 x41Var = this.f10309a;
        int size = x41Var.size();
        int i4 = 0;
        while (i4 < size) {
            y2 y2Var = (y2) x41Var.get(i4);
            i4++;
            if (y2Var.getClass() == cls) {
                return y2Var;
            }
        }
        return null;
    }
}
