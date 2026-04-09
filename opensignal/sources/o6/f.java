package o6;

import a5.u;
import a5.v;
import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import fb.j;
import gb.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: h, reason: collision with root package name */
    public final v f19157h;

    /* renamed from: i, reason: collision with root package name */
    public final u f19158i;
    public int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final e[] f19159l;

    /* renamed from: m, reason: collision with root package name */
    public e f19160m;

    /* renamed from: n, reason: collision with root package name */
    public List f19161n;

    /* renamed from: o, reason: collision with root package name */
    public List f19162o;

    /* renamed from: p, reason: collision with root package name */
    public u f19163p;

    /* renamed from: q, reason: collision with root package name */
    public int f19164q;

    public f(int i10, List list) {
        super(1);
        this.f19157h = new v();
        this.f19158i = new u(0);
        this.j = -1;
        this.k = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b2 = ((byte[]) list.get(0))[0];
        }
        this.f19159l = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f19159l[i11] = new e();
        }
        this.f19160m = this.f19159l[0];
    }

    @Override // fb.j, z9.a, c5.d
    public final void flush() {
        super.flush();
        this.f19161n = null;
        this.f19162o = null;
        this.f19164q = 0;
        this.f19160m = this.f19159l[0];
        q();
        this.f19163p = null;
    }

    @Override // fb.j
    public final k g() {
        List list = this.f19161n;
        this.f19162o = list;
        list.getClass();
        return new k(1, list);
    }

    @Override // fb.j
    public final void i(g gVar) {
        ByteBuffer byteBuffer = gVar.f3306r;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        v vVar = this.f19157h;
        vVar.C(iLimit, bArrArray);
        while (vVar.a() >= 3) {
            int iT = vVar.t();
            int i10 = iT & 3;
            boolean z10 = (iT & 4) == 4;
            byte bT = (byte) vVar.t();
            byte bT2 = (byte) vVar.t();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        o();
                        int i11 = (bT & 192) >> 6;
                        int i12 = this.j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            q();
                            a5.a.B("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i11);
                        }
                        this.j = i11;
                        int i13 = bT & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        u uVar = new u(i11, i13);
                        this.f19163p = uVar;
                        byte[] bArr = uVar.f158b;
                        uVar.f161e = 1;
                        bArr[0] = bT2;
                    } else {
                        a5.a.e(i10 == 2);
                        u uVar2 = this.f19163p;
                        if (uVar2 == null) {
                            a5.a.m("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = uVar2.f158b;
                            int i14 = uVar2.f161e;
                            int i15 = i14 + 1;
                            uVar2.f161e = i15;
                            bArr2[i14] = bT;
                            uVar2.f161e = i14 + 2;
                            bArr2[i15] = bT2;
                        }
                    }
                    u uVar3 = this.f19163p;
                    if (uVar3.f161e == (uVar3.f160d * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // fb.j
    public final boolean l() {
        return this.f19161n != this.f19162o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void o() {
        int i10;
        int i11;
        boolean z10;
        char c4;
        int i12;
        u uVar = this.f19163p;
        if (uVar == null) {
            return;
        }
        int i13 = 2;
        if (uVar.f161e != (uVar.f160d * 2) - 1) {
            int i14 = uVar.f159c;
            a5.a.l();
        }
        u uVar2 = this.f19163p;
        byte[] bArr = uVar2.f158b;
        int i15 = uVar2.f161e;
        u uVar3 = this.f19158i;
        uVar3.n(i15, bArr);
        boolean z11 = false;
        while (true) {
            if (uVar3.b() > 0) {
                int i16 = 3;
                int i17 = uVar3.i(3);
                int i18 = uVar3.i(5);
                if (i17 == 7) {
                    uVar3.s(i13);
                    i17 = uVar3.i(6);
                    if (i17 < 7) {
                        c7.a.z("Invalid extended service number: ", i17, "Cea708Decoder");
                    }
                }
                if (i18 == 0) {
                    if (i17 != 0) {
                        a5.a.B("Cea708Decoder", "serviceNumber is non-zero (" + i17 + ") when blockSize is 0");
                    }
                } else if (i17 != this.k) {
                    uVar3.t(i18);
                } else {
                    int iG = (i18 * 8) + uVar3.g();
                    while (uVar3.g() < iG) {
                        int i19 = uVar3.i(8);
                        if (i19 != 16) {
                            if (i19 <= 31) {
                                if (i19 != 0) {
                                    if (i19 == i16) {
                                        this.f19161n = p();
                                    } else if (i19 != 8) {
                                        switch (i19) {
                                            case 12:
                                                q();
                                                break;
                                            case 13:
                                                this.f19160m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i19 < 17 || i19 > 23) {
                                                    if (i19 < 24 || i19 > 31) {
                                                        c7.a.z("Invalid C0 command: ", i19, "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        a5.a.B("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i19);
                                                        uVar3.s(16);
                                                        break;
                                                    }
                                                } else {
                                                    a5.a.B("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i19);
                                                    uVar3.s(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f19160m.f19138b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i12 = i13;
                                i10 = i16;
                                i11 = iG;
                            } else if (i19 <= 127) {
                                if (i19 == 127) {
                                    this.f19160m.a((char) 9835);
                                } else {
                                    this.f19160m.a((char) (i19 & 255));
                                }
                                i12 = i13;
                                i10 = i16;
                                i11 = iG;
                                z11 = true;
                            } else {
                                if (i19 <= 159) {
                                    e[] eVarArr = this.f19159l;
                                    switch (i19) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i10 = i16;
                                            i11 = iG;
                                            z10 = true;
                                            int i20 = i19 - 128;
                                            if (this.f19164q != i20) {
                                                this.f19164q = i20;
                                                this.f19160m = eVarArr[i20];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i10 = i16;
                                            i11 = iG;
                                            z10 = true;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (uVar3.h()) {
                                                    e eVar = eVarArr[8 - i21];
                                                    eVar.f19137a.clear();
                                                    eVar.f19138b.clear();
                                                    eVar.f19150p = -1;
                                                    eVar.f19151q = -1;
                                                    eVar.f19152r = -1;
                                                    eVar.f19154t = -1;
                                                    eVar.f19156v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i10 = i16;
                                            i11 = iG;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (uVar3.h()) {
                                                    eVarArr[8 - i22].f19140d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            i10 = i16;
                                            i11 = iG;
                                            for (int i23 = 1; i23 <= 8; i23++) {
                                                if (uVar3.h()) {
                                                    eVarArr[8 - i23].f19140d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            i10 = i16;
                                            i11 = iG;
                                            for (int i24 = 1; i24 <= 8; i24++) {
                                                if (uVar3.h()) {
                                                    eVarArr[8 - i24].f19140d = !r1.f19140d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            i10 = i16;
                                            i11 = iG;
                                            for (int i25 = 1; i25 <= 8; i25++) {
                                                if (uVar3.h()) {
                                                    eVarArr[8 - i25].d();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            i10 = i16;
                                            i11 = iG;
                                            uVar3.s(8);
                                            z10 = true;
                                            break;
                                        case 142:
                                            i10 = i16;
                                            i11 = iG;
                                            z10 = true;
                                            break;
                                        case 143:
                                            i10 = i16;
                                            i11 = iG;
                                            q();
                                            z10 = true;
                                            break;
                                        case 144:
                                            int i26 = i13;
                                            i11 = iG;
                                            if (!this.f19160m.f19139c) {
                                                uVar3.s(16);
                                                i10 = 3;
                                                z10 = true;
                                                break;
                                            } else {
                                                uVar3.i(4);
                                                uVar3.i(i26);
                                                uVar3.i(i26);
                                                boolean zH = uVar3.h();
                                                boolean zH2 = uVar3.h();
                                                i10 = 3;
                                                uVar3.i(3);
                                                uVar3.i(3);
                                                this.f19160m.e(zH, zH2);
                                                z10 = true;
                                            }
                                        case 145:
                                            i11 = iG;
                                            if (this.f19160m.f19139c) {
                                                int iC = e.c(uVar3.i(2), uVar3.i(2), uVar3.i(2), uVar3.i(2));
                                                int iC2 = e.c(uVar3.i(2), uVar3.i(2), uVar3.i(2), uVar3.i(2));
                                                uVar3.s(2);
                                                e.c(uVar3.i(2), uVar3.i(2), uVar3.i(2), 0);
                                                this.f19160m.f(iC, iC2);
                                            } else {
                                                uVar3.s(24);
                                            }
                                            i10 = 3;
                                            z10 = true;
                                            break;
                                        case 146:
                                            i11 = iG;
                                            if (this.f19160m.f19139c) {
                                                uVar3.s(4);
                                                int i27 = uVar3.i(4);
                                                uVar3.s(2);
                                                uVar3.i(6);
                                                e eVar2 = this.f19160m;
                                                if (eVar2.f19156v != i27) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f19156v = i27;
                                            } else {
                                                uVar3.s(16);
                                            }
                                            i10 = 3;
                                            z10 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            c7.a.z("Invalid C1 command: ", i19, "Cea708Decoder");
                                            i10 = i16;
                                            i11 = iG;
                                            z10 = true;
                                            break;
                                        case 151:
                                            i11 = iG;
                                            if (this.f19160m.f19139c) {
                                                int iC3 = e.c(uVar3.i(2), uVar3.i(2), uVar3.i(2), uVar3.i(2));
                                                uVar3.i(2);
                                                e.c(uVar3.i(2), uVar3.i(2), uVar3.i(2), 0);
                                                uVar3.h();
                                                uVar3.h();
                                                uVar3.i(2);
                                                uVar3.i(2);
                                                int i28 = uVar3.i(2);
                                                uVar3.s(8);
                                                e eVar3 = this.f19160m;
                                                eVar3.f19149o = iC3;
                                                eVar3.f19146l = i28;
                                            } else {
                                                uVar3.s(32);
                                            }
                                            i10 = 3;
                                            z10 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i29 = i19 - 152;
                                            e eVar4 = eVarArr[i29];
                                            uVar3.s(i13);
                                            boolean zH3 = uVar3.h();
                                            boolean zH4 = uVar3.h();
                                            uVar3.h();
                                            int i30 = uVar3.i(i16);
                                            boolean zH5 = uVar3.h();
                                            int i31 = uVar3.i(7);
                                            int i32 = uVar3.i(8);
                                            int i33 = uVar3.i(4);
                                            int i34 = uVar3.i(4);
                                            uVar3.s(i13);
                                            uVar3.i(6);
                                            uVar3.s(i13);
                                            int i35 = uVar3.i(3);
                                            int i36 = uVar3.i(3);
                                            ArrayList arrayList = eVar4.f19137a;
                                            i11 = iG;
                                            eVar4.f19139c = true;
                                            eVar4.f19140d = zH3;
                                            eVar4.k = zH4;
                                            eVar4.f19141e = i30;
                                            eVar4.f19142f = zH5;
                                            eVar4.f19143g = i31;
                                            eVar4.f19144h = i32;
                                            eVar4.f19145i = i33;
                                            int i37 = i34 + 1;
                                            if (eVar4.j != i37) {
                                                eVar4.j = i37;
                                                while (true) {
                                                    if ((zH4 && arrayList.size() >= eVar4.j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i35 != 0 && eVar4.f19147m != i35) {
                                                eVar4.f19147m = i35;
                                                int i38 = i35 - 1;
                                                int i39 = e.C[i38];
                                                boolean z12 = e.B[i38];
                                                int i40 = e.f19136z[i38];
                                                int i41 = e.A[i38];
                                                int i42 = e.f19135y[i38];
                                                eVar4.f19149o = i39;
                                                eVar4.f19146l = i42;
                                            }
                                            if (i36 != 0 && eVar4.f19148n != i36) {
                                                eVar4.f19148n = i36;
                                                int i43 = i36 - 1;
                                                int i44 = e.E[i43];
                                                int i45 = e.D[i43];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f19133w, e.F[i43]);
                                            }
                                            if (this.f19164q != i29) {
                                                this.f19164q = i29;
                                                this.f19160m = eVarArr[i29];
                                            }
                                            i10 = 3;
                                            z10 = true;
                                            break;
                                    }
                                } else {
                                    i10 = i16;
                                    i11 = iG;
                                    z10 = true;
                                    if (i19 <= 255) {
                                        this.f19160m.a((char) (i19 & 255));
                                    } else {
                                        c7.a.z("Invalid base command: ", i19, "Cea708Decoder");
                                        i12 = 2;
                                        c4 = 7;
                                    }
                                }
                                z11 = z10;
                                i12 = 2;
                                c4 = 7;
                            }
                            z10 = true;
                            c4 = 7;
                        } else {
                            i10 = i16;
                            i11 = iG;
                            z10 = true;
                            int i46 = uVar3.i(8);
                            if (i46 <= 31) {
                                c4 = 7;
                                if (i46 > 7) {
                                    if (i46 <= 15) {
                                        uVar3.s(8);
                                    } else if (i46 <= 23) {
                                        uVar3.s(16);
                                    } else if (i46 <= 31) {
                                        uVar3.s(24);
                                    }
                                }
                            } else {
                                c4 = 7;
                                if (i46 <= 127) {
                                    if (i46 == 32) {
                                        this.f19160m.a(' ');
                                    } else if (i46 == 33) {
                                        this.f19160m.a((char) 160);
                                    } else if (i46 == 37) {
                                        this.f19160m.a((char) 8230);
                                    } else if (i46 == 42) {
                                        this.f19160m.a((char) 352);
                                    } else if (i46 == 44) {
                                        this.f19160m.a((char) 338);
                                    } else if (i46 == 63) {
                                        this.f19160m.a((char) 376);
                                    } else if (i46 == 57) {
                                        this.f19160m.a((char) 8482);
                                    } else if (i46 == 58) {
                                        this.f19160m.a((char) 353);
                                    } else if (i46 == 60) {
                                        this.f19160m.a((char) 339);
                                    } else if (i46 != 61) {
                                        switch (i46) {
                                            case 48:
                                                this.f19160m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f19160m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f19160m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f19160m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f19160m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f19160m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i46) {
                                                    case 118:
                                                        this.f19160m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f19160m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f19160m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f19160m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f19160m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f19160m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f19160m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f19160m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f19160m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f19160m.a((char) 9484);
                                                        break;
                                                    default:
                                                        c7.a.z("Invalid G2 character: ", i46, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f19160m.a((char) 8480);
                                    }
                                    z11 = true;
                                } else if (i46 > 159) {
                                    i12 = 2;
                                    if (i46 <= 255) {
                                        if (i46 == 160) {
                                            this.f19160m.a((char) 13252);
                                        } else {
                                            c7.a.z("Invalid G3 character: ", i46, "Cea708Decoder");
                                            this.f19160m.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        c7.a.z("Invalid extended command: ", i46, "Cea708Decoder");
                                    }
                                } else if (i46 <= 135) {
                                    uVar3.s(32);
                                } else if (i46 <= 143) {
                                    uVar3.s(40);
                                } else if (i46 <= 159) {
                                    i12 = 2;
                                    uVar3.s(2);
                                    uVar3.s(uVar3.i(6) * 8);
                                }
                            }
                            i12 = 2;
                        }
                        iG = i11;
                        i16 = i10;
                        i13 = i12;
                    }
                }
            }
        }
        if (z11) {
            this.f19161n = p();
        }
        this.f19163p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List p() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.f.p():java.util.List");
    }

    public final void q() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f19159l[i10].d();
        }
    }
}
