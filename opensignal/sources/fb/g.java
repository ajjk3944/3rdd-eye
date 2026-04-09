package fb;

import a5.u;
import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import dd.s;
import io.sentry.android.core.e0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends j {

    /* renamed from: h, reason: collision with root package name */
    public final f f8803h;

    /* renamed from: i, reason: collision with root package name */
    public final u f8804i;
    public int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final e[] f8805l;

    /* renamed from: m, reason: collision with root package name */
    public e f8806m;

    /* renamed from: n, reason: collision with root package name */
    public List f8807n;

    /* renamed from: o, reason: collision with root package name */
    public List f8808o;

    /* renamed from: p, reason: collision with root package name */
    public f f8809p;

    /* renamed from: q, reason: collision with root package name */
    public int f8810q;

    public g(int i10, List list) {
        super(0);
        this.f8803h = new f();
        this.f8804i = new u(3);
        this.j = -1;
        this.k = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b2 = ((byte[]) list.get(0))[0];
        }
        this.f8805l = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f8805l[i11] = new e();
        }
        this.f8806m = this.f8805l[0];
    }

    @Override // fb.j
    public final s f() {
        List list = this.f8807n;
        this.f8808o = list;
        list.getClass();
        return new s(1, list);
    }

    @Override // fb.j, z9.a, c5.d
    public final void flush() {
        super.flush();
        this.f8807n = null;
        this.f8808o = null;
        this.f8810q = 0;
        this.f8806m = this.f8805l[0];
        q();
        this.f8809p = null;
    }

    @Override // fb.j
    public final void h(h hVar) {
        ByteBuffer byteBuffer = hVar.f26791r;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        f fVar = this.f8803h;
        fVar.w(iLimit, bArrArray);
        while (fVar.a() >= 3) {
            int iO = fVar.o();
            int i10 = iO & 3;
            boolean z10 = (iO & 4) == 4;
            byte bO = (byte) fVar.o();
            byte bO2 = (byte) fVar.o();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        o();
                        int i11 = (bO & 192) >> 6;
                        int i12 = this.j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            q();
                            int i13 = this.j;
                            StringBuilder sb2 = new StringBuilder(71);
                            sb2.append("Sequence number discontinuity. previous=");
                            sb2.append(i13);
                            sb2.append(" current=");
                            sb2.append(i11);
                            e0.p("Cea708Decoder", sb2.toString());
                        }
                        this.j = i11;
                        int i14 = bO & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        f fVar2 = new f();
                        fVar2.f8801b = i14;
                        fVar2.f8800a = new byte[(i14 * 2) - 1];
                        fVar2.f8802c = 0;
                        this.f8809p = fVar2;
                        byte[] bArr = fVar2.f8800a;
                        fVar2.f8802c = 1;
                        bArr[0] = bO2;
                    } else {
                        qb.b.g(i10 == 2);
                        f fVar3 = this.f8809p;
                        if (fVar3 == null) {
                            e0.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = fVar3.f8800a;
                            int i15 = fVar3.f8802c;
                            int i16 = i15 + 1;
                            fVar3.f8802c = i16;
                            bArr2[i15] = bO;
                            fVar3.f8802c = i15 + 2;
                            bArr2[i16] = bO2;
                        }
                    }
                    f fVar4 = this.f8809p;
                    if (fVar4.f8802c == (fVar4.f8801b * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // fb.j
    public final boolean l() {
        return this.f8807n != this.f8808o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void o() {
        int i10;
        int i11;
        char c4;
        int i12;
        char c10;
        boolean z10;
        f fVar = this.f8809p;
        if (fVar == null) {
            return;
        }
        int i13 = fVar.f8802c;
        byte[] bArr = fVar.f8800a;
        u uVar = this.f8804i;
        uVar.n(i13, bArr);
        int i14 = 3;
        int i15 = uVar.i(3);
        int i16 = uVar.i(5);
        int i17 = 7;
        int i18 = 2;
        if (i15 == 7) {
            uVar.s(2);
            i15 = uVar.i(6);
            if (i15 < 7) {
                c7.a.y("Invalid extended service number: ", 44, i15, "Cea708Decoder");
            }
        }
        if (i16 == 0) {
            if (i15 != 0) {
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("serviceNumber is non-zero (");
                sb2.append(i15);
                sb2.append(") when blockSize is 0");
                e0.p("Cea708Decoder", sb2.toString());
            }
        } else if (i15 == this.k) {
            boolean z11 = false;
            while (uVar.b() > 0) {
                int i19 = uVar.i(8);
                if (i19 == 16) {
                    i10 = i14;
                    int i20 = uVar.i(8);
                    if (i20 <= 31) {
                        i11 = 7;
                        if (i20 > 7) {
                            if (i20 <= 15) {
                                uVar.s(8);
                            } else if (i20 <= 23) {
                                uVar.s(16);
                            } else if (i20 <= 31) {
                                uVar.s(24);
                            }
                        }
                        i12 = 2;
                    } else {
                        i11 = 7;
                        if (i20 <= 127) {
                            if (i20 == 32) {
                                c4 = ',';
                                this.f8806m.a(' ');
                            } else if (i20 == 33) {
                                c4 = ',';
                                this.f8806m.a((char) 160);
                            } else if (i20 == 37) {
                                c4 = ',';
                                this.f8806m.a((char) 8230);
                            } else if (i20 != 42) {
                                c4 = ',';
                                if (i20 == 44) {
                                    this.f8806m.a((char) 338);
                                } else if (i20 == 63) {
                                    this.f8806m.a((char) 376);
                                } else if (i20 == 57) {
                                    this.f8806m.a((char) 8482);
                                } else if (i20 == 58) {
                                    this.f8806m.a((char) 353);
                                } else if (i20 == 60) {
                                    this.f8806m.a((char) 339);
                                } else if (i20 != 61) {
                                    switch (i20) {
                                        case 48:
                                            this.f8806m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.f8806m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f8806m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.f8806m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.f8806m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.f8806m.a((char) 8226);
                                            break;
                                        default:
                                            switch (i20) {
                                                case 118:
                                                    this.f8806m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f8806m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f8806m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f8806m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f8806m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f8806m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f8806m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f8806m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f8806m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f8806m.a((char) 9484);
                                                    break;
                                                default:
                                                    c7.a.y("Invalid G2 character: ", 33, i20, "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.f8806m.a((char) 8480);
                                }
                            } else {
                                c4 = ',';
                                this.f8806m.a((char) 352);
                            }
                            z11 = true;
                        } else {
                            c4 = ',';
                            if (i20 > 159) {
                                i12 = 2;
                                c10 = 6;
                                if (i20 <= 255) {
                                    if (i20 == 160) {
                                        this.f8806m.a((char) 13252);
                                    } else {
                                        c7.a.y("Invalid G3 character: ", 33, i20, "Cea708Decoder");
                                        this.f8806m.a('_');
                                    }
                                    z11 = true;
                                } else {
                                    c7.a.y("Invalid extended command: ", 37, i20, "Cea708Decoder");
                                }
                            } else if (i20 <= 135) {
                                uVar.s(32);
                            } else if (i20 <= 143) {
                                uVar.s(40);
                            } else if (i20 <= 159) {
                                i12 = 2;
                                uVar.s(2);
                                c10 = 6;
                                uVar.s(uVar.i(6) * 8);
                            }
                            i18 = i12;
                            i14 = i10;
                            i17 = i11;
                        }
                        i12 = 2;
                        c10 = 6;
                        i18 = i12;
                        i14 = i10;
                        i17 = i11;
                    }
                } else if (i19 <= 31) {
                    if (i19 != 0) {
                        if (i19 == i14) {
                            this.f8807n = p();
                        } else if (i19 != 8) {
                            switch (i19) {
                                case 12:
                                    q();
                                    break;
                                case 13:
                                    this.f8806m.a('\n');
                                    break;
                                case 14:
                                    break;
                                default:
                                    if (i19 < 17 || i19 > 23) {
                                        if (i19 < 24 || i19 > 31) {
                                            c7.a.y("Invalid C0 command: ", 31, i19, "Cea708Decoder");
                                            break;
                                        } else {
                                            c7.a.y("Currently unsupported COMMAND_P16 Command: ", 54, i19, "Cea708Decoder");
                                            uVar.s(16);
                                            break;
                                        }
                                    } else {
                                        c7.a.y("Currently unsupported COMMAND_EXT1 Command: ", 55, i19, "Cea708Decoder");
                                        uVar.s(8);
                                        break;
                                    }
                            }
                        } else {
                            SpannableStringBuilder spannableStringBuilder = this.f8806m.f8781b;
                            int length = spannableStringBuilder.length();
                            if (length > 0) {
                                spannableStringBuilder.delete(length - 1, length);
                            }
                        }
                    }
                    i10 = i14;
                    i11 = i17;
                    i12 = i18;
                } else if (i19 <= 127) {
                    if (i19 == 127) {
                        this.f8806m.a((char) 9835);
                    } else {
                        this.f8806m.a((char) (i19 & 255));
                    }
                    i10 = i14;
                    i11 = i17;
                    i12 = i18;
                    z11 = true;
                } else {
                    if (i19 <= 159) {
                        e[] eVarArr = this.f8805l;
                        switch (i19) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                                i10 = i14;
                                z10 = true;
                                int i21 = i19 - 128;
                                if (this.f8810q != i21) {
                                    this.f8810q = i21;
                                    this.f8806m = eVarArr[i21];
                                    break;
                                }
                                break;
                            case 136:
                                i10 = i14;
                                z10 = true;
                                for (int i22 = 1; i22 <= 8; i22++) {
                                    if (uVar.h()) {
                                        e eVar = eVarArr[8 - i22];
                                        eVar.f8780a.clear();
                                        eVar.f8781b.clear();
                                        eVar.f8793p = -1;
                                        eVar.f8794q = -1;
                                        eVar.f8795r = -1;
                                        eVar.f8797t = -1;
                                        eVar.f8799v = 0;
                                    }
                                }
                                break;
                            case 137:
                                i10 = i14;
                                for (int i23 = 1; i23 <= 8; i23++) {
                                    if (uVar.h()) {
                                        eVarArr[8 - i23].f8783d = true;
                                    }
                                }
                                z10 = true;
                                break;
                            case 138:
                                i10 = i14;
                                for (int i24 = 1; i24 <= 8; i24++) {
                                    if (uVar.h()) {
                                        eVarArr[8 - i24].f8783d = false;
                                    }
                                }
                                z10 = true;
                                break;
                            case 139:
                                i10 = i14;
                                for (int i25 = 1; i25 <= 8; i25++) {
                                    if (uVar.h()) {
                                        eVarArr[8 - i25].f8783d = !r1.f8783d;
                                    }
                                }
                                z10 = true;
                                break;
                            case 140:
                                i10 = i14;
                                for (int i26 = 1; i26 <= 8; i26++) {
                                    if (uVar.h()) {
                                        eVarArr[8 - i26].d();
                                    }
                                }
                                z10 = true;
                                break;
                            case 141:
                                i10 = i14;
                                uVar.s(8);
                                z10 = true;
                                break;
                            case 142:
                                i10 = i14;
                                z10 = true;
                                break;
                            case 143:
                                i10 = i14;
                                q();
                                z10 = true;
                                break;
                            case 144:
                                int i27 = i18;
                                if (!this.f8806m.f8782c) {
                                    uVar.s(16);
                                    i10 = 3;
                                    z10 = true;
                                    break;
                                } else {
                                    uVar.i(4);
                                    uVar.i(i27);
                                    uVar.i(i27);
                                    boolean zH = uVar.h();
                                    boolean zH2 = uVar.h();
                                    i10 = 3;
                                    uVar.i(3);
                                    uVar.i(3);
                                    this.f8806m.e(zH, zH2);
                                    z10 = true;
                                }
                            case 145:
                                if (this.f8806m.f8782c) {
                                    int iC = e.c(uVar.i(2), uVar.i(2), uVar.i(2), uVar.i(2));
                                    int iC2 = e.c(uVar.i(2), uVar.i(2), uVar.i(2), uVar.i(2));
                                    uVar.s(2);
                                    e.c(uVar.i(2), uVar.i(2), uVar.i(2), 0);
                                    this.f8806m.f(iC, iC2);
                                } else {
                                    uVar.s(24);
                                }
                                i10 = 3;
                                z10 = true;
                                break;
                            case 146:
                                if (this.f8806m.f8782c) {
                                    uVar.s(4);
                                    int i28 = uVar.i(4);
                                    uVar.s(2);
                                    uVar.i(6);
                                    e eVar2 = this.f8806m;
                                    if (eVar2.f8799v != i28) {
                                        eVar2.a('\n');
                                    }
                                    eVar2.f8799v = i28;
                                } else {
                                    uVar.s(16);
                                }
                                i10 = 3;
                                z10 = true;
                                break;
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            default:
                                c7.a.y("Invalid C1 command: ", 31, i19, "Cea708Decoder");
                                i10 = i14;
                                z10 = true;
                                break;
                            case 151:
                                if (this.f8806m.f8782c) {
                                    int iC3 = e.c(uVar.i(2), uVar.i(2), uVar.i(2), uVar.i(2));
                                    uVar.i(2);
                                    e.c(uVar.i(2), uVar.i(2), uVar.i(2), 0);
                                    uVar.h();
                                    uVar.h();
                                    uVar.i(2);
                                    uVar.i(2);
                                    int i29 = uVar.i(2);
                                    uVar.s(8);
                                    e eVar3 = this.f8806m;
                                    eVar3.f8792o = iC3;
                                    eVar3.f8789l = i29;
                                } else {
                                    uVar.s(32);
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
                                int i30 = i19 - 152;
                                e eVar4 = eVarArr[i30];
                                uVar.s(i18);
                                boolean zH3 = uVar.h();
                                boolean zH4 = uVar.h();
                                uVar.h();
                                int i31 = uVar.i(i14);
                                boolean zH5 = uVar.h();
                                int i32 = uVar.i(i17);
                                int i33 = uVar.i(8);
                                int i34 = uVar.i(4);
                                int i35 = uVar.i(4);
                                uVar.s(i18);
                                uVar.i(6);
                                uVar.s(i18);
                                int i36 = uVar.i(3);
                                int i37 = uVar.i(3);
                                ArrayList arrayList = eVar4.f8780a;
                                eVar4.f8782c = true;
                                eVar4.f8783d = zH3;
                                eVar4.k = zH4;
                                eVar4.f8784e = i31;
                                eVar4.f8785f = zH5;
                                eVar4.f8786g = i32;
                                eVar4.f8787h = i33;
                                eVar4.f8788i = i34;
                                int i38 = i35 + 1;
                                if (eVar4.j != i38) {
                                    eVar4.j = i38;
                                    while (true) {
                                        if ((zH4 && arrayList.size() >= eVar4.j) || arrayList.size() >= 15) {
                                            arrayList.remove(0);
                                        }
                                    }
                                }
                                if (i36 != 0 && eVar4.f8790m != i36) {
                                    eVar4.f8790m = i36;
                                    int i39 = i36 - 1;
                                    int i40 = e.C[i39];
                                    boolean z12 = e.B[i39];
                                    int i41 = e.f8779z[i39];
                                    int i42 = e.A[i39];
                                    int i43 = e.f8778y[i39];
                                    eVar4.f8792o = i40;
                                    eVar4.f8789l = i43;
                                }
                                if (i37 != 0 && eVar4.f8791n != i37) {
                                    eVar4.f8791n = i37;
                                    int i44 = i37 - 1;
                                    int i45 = e.E[i44];
                                    int i46 = e.D[i44];
                                    eVar4.e(false, false);
                                    eVar4.f(e.f8776w, e.F[i44]);
                                }
                                if (this.f8810q != i30) {
                                    this.f8810q = i30;
                                    this.f8806m = eVarArr[i30];
                                }
                                i10 = 3;
                                z10 = true;
                                break;
                        }
                    } else {
                        i10 = i14;
                        z10 = true;
                        if (i19 <= 255) {
                            this.f8806m.a((char) (i19 & 255));
                        } else {
                            c7.a.y("Invalid base command: ", 33, i19, "Cea708Decoder");
                            i12 = 2;
                            i11 = 7;
                        }
                    }
                    z11 = z10;
                    i12 = 2;
                    i11 = 7;
                }
                c4 = ',';
                c10 = 6;
                i18 = i12;
                i14 = i10;
                i17 = i11;
            }
            if (z11) {
                this.f8807n = p();
            }
        }
        this.f8809p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List p() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.g.p():java.util.List");
    }

    public final void q() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f8805l[i10].d();
        }
    }
}
