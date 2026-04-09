package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.yandex.mobile.ads.impl.av;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class un extends vn {

    /* renamed from: g, reason: collision with root package name */
    private final uf1 f34095g = new uf1();

    /* renamed from: h, reason: collision with root package name */
    private final tf1 f34096h = new tf1();
    private int i = -1;

    /* renamed from: j, reason: collision with root package name */
    private final int f34097j;

    /* renamed from: k, reason: collision with root package name */
    private final b[] f34098k;

    /* renamed from: l, reason: collision with root package name */
    private b f34099l;

    /* renamed from: m, reason: collision with root package name */
    private List<av> f34100m;

    /* renamed from: n, reason: collision with root package name */
    private List<av> f34101n;

    /* renamed from: o, reason: collision with root package name */
    private c f34102o;

    /* renamed from: p, reason: collision with root package name */
    private int f34103p;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f34104c = new P2(2);

        /* renamed from: a, reason: collision with root package name */
        public final av f34105a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34106b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i, float f11, int i10, boolean z10, int i11, int i12) {
            av.a aVarD = new av.a().a(spannableStringBuilder).b(alignment).a(0, f10).a(i).b(f11).b(i10).d(-3.4028235E38f);
            if (z10) {
                aVarD.d(i11);
            }
            this.f34105a = aVarD.a();
            this.f34106b = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.f34106b, aVar.f34106b);
        }
    }

    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        private static final int[] f34107A;

        /* renamed from: B, reason: collision with root package name */
        private static final boolean[] f34108B;

        /* renamed from: C, reason: collision with root package name */
        private static final int[] f34109C;

        /* renamed from: D, reason: collision with root package name */
        private static final int[] f34110D;

        /* renamed from: E, reason: collision with root package name */
        private static final int[] f34111E;

        /* renamed from: F, reason: collision with root package name */
        private static final int[] f34112F;

        /* renamed from: w, reason: collision with root package name */
        public static final int f34113w = a(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f34114x;

        /* renamed from: y, reason: collision with root package name */
        private static final int[] f34115y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f34116z;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f34117a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f34118b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f34119c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f34120d;

        /* renamed from: e, reason: collision with root package name */
        private int f34121e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f34122f;

        /* renamed from: g, reason: collision with root package name */
        private int f34123g;

        /* renamed from: h, reason: collision with root package name */
        private int f34124h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private int f34125j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f34126k;

        /* renamed from: l, reason: collision with root package name */
        private int f34127l;

        /* renamed from: m, reason: collision with root package name */
        private int f34128m;

        /* renamed from: n, reason: collision with root package name */
        private int f34129n;

        /* renamed from: o, reason: collision with root package name */
        private int f34130o;

        /* renamed from: p, reason: collision with root package name */
        private int f34131p;

        /* renamed from: q, reason: collision with root package name */
        private int f34132q;

        /* renamed from: r, reason: collision with root package name */
        private int f34133r;

        /* renamed from: s, reason: collision with root package name */
        private int f34134s;

        /* renamed from: t, reason: collision with root package name */
        private int f34135t;

        /* renamed from: u, reason: collision with root package name */
        private int f34136u;

        /* renamed from: v, reason: collision with root package name */
        private int f34137v;

        static {
            int iA = a(0, 0, 0, 0);
            f34114x = iA;
            int iA2 = a(0, 0, 0, 3);
            f34115y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f34116z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f34107A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f34108B = new boolean[]{false, false, false, true, true, true, false};
            f34109C = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
            f34110D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f34111E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f34112F = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
        }

        public b() {
            b();
        }

        public final void a(char c10) {
            if (c10 != '\n') {
                this.f34118b.append(c10);
                return;
            }
            this.f34117a.add(a());
            this.f34118b.clear();
            if (this.f34131p != -1) {
                this.f34131p = 0;
            }
            if (this.f34132q != -1) {
                this.f34132q = 0;
            }
            if (this.f34133r != -1) {
                this.f34133r = 0;
            }
            if (this.f34135t != -1) {
                this.f34135t = 0;
            }
            while (true) {
                if ((!this.f34126k || this.f34117a.size() < this.f34125j) && this.f34117a.size() < 15) {
                    return;
                } else {
                    this.f34117a.remove(0);
                }
            }
        }

        public final void b() {
            this.f34117a.clear();
            this.f34118b.clear();
            this.f34131p = -1;
            this.f34132q = -1;
            this.f34133r = -1;
            this.f34135t = -1;
            this.f34137v = 0;
            this.f34119c = false;
            this.f34120d = false;
            this.f34121e = 4;
            this.f34122f = false;
            this.f34123g = 0;
            this.f34124h = 0;
            this.i = 0;
            this.f34125j = 15;
            this.f34126k = true;
            this.f34127l = 0;
            this.f34128m = 0;
            this.f34129n = 0;
            int i = f34114x;
            this.f34130o = i;
            this.f34134s = f34113w;
            this.f34136u = i;
        }

        public static int a(int i, int i10, int i11, int i12) {
            zf.a(i, 4);
            zf.a(i10, 4);
            zf.a(i11, 4);
            zf.a(i12, 4);
            return Color.argb(i12 != 2 ? i12 != 3 ? 255 : 0 : 127, i > 1 ? 255 : 0, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0);
        }

        public final void a(boolean z10, boolean z11) {
            if (this.f34131p != -1) {
                if (!z10) {
                    this.f34118b.setSpan(new StyleSpan(2), this.f34131p, this.f34118b.length(), 33);
                    this.f34131p = -1;
                }
            } else if (z10) {
                this.f34131p = this.f34118b.length();
            }
            if (this.f34132q == -1) {
                if (z11) {
                    this.f34132q = this.f34118b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f34118b.setSpan(new UnderlineSpan(), this.f34132q, this.f34118b.length(), 33);
                this.f34132q = -1;
            }
        }

        public final void a(int i, int i10) {
            if (this.f34133r != -1 && this.f34134s != i) {
                this.f34118b.setSpan(new ForegroundColorSpan(this.f34134s), this.f34133r, this.f34118b.length(), 33);
            }
            if (i != f34113w) {
                this.f34133r = this.f34118b.length();
                this.f34134s = i;
            }
            if (this.f34135t != -1 && this.f34136u != i10) {
                this.f34118b.setSpan(new BackgroundColorSpan(this.f34136u), this.f34135t, this.f34118b.length(), 33);
            }
            if (i10 != f34114x) {
                this.f34135t = this.f34118b.length();
                this.f34136u = i10;
            }
        }

        public final SpannableString a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f34118b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f34131p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f34131p, length, 33);
                }
                if (this.f34132q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f34132q, length, 33);
                }
                if (this.f34133r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f34134s), this.f34133r, length, 33);
                }
                if (this.f34135t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f34136u), this.f34135t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f34138a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34139b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f34140c;

        /* renamed from: d, reason: collision with root package name */
        int f34141d = 0;

        public c(int i, int i10) {
            this.f34138a = i;
            this.f34139b = i10;
            this.f34140c = new byte[(i10 * 2) - 1];
        }
    }

    public un(int i, List<byte[]> list) {
        this.f34097j = i == -1 ? 1 : i;
        if (list != null) {
            iq.a(list);
        }
        this.f34098k = new b[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f34098k[i10] = new b();
        }
        this.f34099l = this.f34098k[0];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0159. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23, types: [boolean] */
    private void i() {
        int i;
        int i10;
        int i11;
        int i12;
        char c10;
        ?? r32;
        c cVar = this.f34102o;
        if (cVar == null) {
            return;
        }
        int i13 = 2;
        int i14 = 1;
        if (cVar.f34141d != (cVar.f34139b * 2) - 1) {
            rs0.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f34102o.f34139b * 2) - 1) + ", but current index is " + this.f34102o.f34141d + " (sequence number " + this.f34102o.f34138a + ");");
        }
        tf1 tf1Var = this.f34096h;
        c cVar2 = this.f34102o;
        tf1Var.a(cVar2.f34141d, cVar2.f34140c);
        int i15 = 0;
        while (true) {
            if (this.f34096h.b() > 0) {
                int i16 = 3;
                int iB = this.f34096h.b(3);
                int iB2 = this.f34096h.b(5);
                int i17 = 7;
                if (iB == 7) {
                    this.f34096h.d(i13);
                    iB = this.f34096h.b(6);
                    if (iB < 7) {
                        kr0.a("Invalid extended service number: ", iB, "Cea708Decoder");
                    }
                }
                if (iB2 == 0) {
                    if (iB != 0) {
                        rs0.d("Cea708Decoder", "serviceNumber is non-zero (" + iB + ") when blockSize is 0");
                    }
                } else if (iB != this.f34097j) {
                    this.f34096h.e(iB2);
                } else {
                    int iE = (iB2 * 8) + this.f34096h.e();
                    while (this.f34096h.e() < iE) {
                        int iB3 = this.f34096h.b(8);
                        int i18 = i14;
                        if (iB3 == 16) {
                            i = i16;
                            i10 = i18;
                            int iB4 = this.f34096h.b(8);
                            if (iB4 <= 31) {
                                i11 = 7;
                                if (iB4 > 7) {
                                    if (iB4 <= 15) {
                                        this.f34096h.d(8);
                                    } else if (iB4 <= 23) {
                                        this.f34096h.d(16);
                                    } else if (iB4 <= 31) {
                                        this.f34096h.d(24);
                                    }
                                }
                            } else {
                                i11 = 7;
                                if (iB4 <= 127) {
                                    if (iB4 == 32) {
                                        this.f34099l.a(' ');
                                    } else if (iB4 == 33) {
                                        this.f34099l.a((char) 160);
                                    } else if (iB4 == 37) {
                                        this.f34099l.a((char) 8230);
                                    } else if (iB4 == 42) {
                                        this.f34099l.a((char) 352);
                                    } else if (iB4 == 44) {
                                        this.f34099l.a((char) 338);
                                    } else if (iB4 == 63) {
                                        this.f34099l.a((char) 376);
                                    } else if (iB4 == 57) {
                                        this.f34099l.a((char) 8482);
                                    } else if (iB4 == 58) {
                                        this.f34099l.a((char) 353);
                                    } else if (iB4 == 60) {
                                        this.f34099l.a((char) 339);
                                    } else if (iB4 != 61) {
                                        switch (iB4) {
                                            case 48:
                                                this.f34099l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f34099l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f34099l.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f34099l.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f34099l.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f34099l.a((char) 8226);
                                                break;
                                            default:
                                                switch (iB4) {
                                                    case 118:
                                                        this.f34099l.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f34099l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f34099l.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f34099l.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f34099l.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f34099l.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f34099l.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f34099l.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f34099l.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f34099l.a((char) 9484);
                                                        break;
                                                    default:
                                                        kr0.a("Invalid G2 character: ", iB4, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f34099l.a((char) 8480);
                                    }
                                    i12 = 2;
                                    c10 = 6;
                                    i15 = i10;
                                    i16 = i;
                                    i13 = i12;
                                    i17 = i11;
                                    i14 = i15;
                                } else {
                                    if (iB4 > 159) {
                                        i12 = 2;
                                        c10 = 6;
                                        if (iB4 <= 255) {
                                            if (iB4 == 160) {
                                                this.f34099l.a((char) 13252);
                                            } else {
                                                kr0.a("Invalid G3 character: ", iB4, "Cea708Decoder");
                                                this.f34099l.a('_');
                                            }
                                            i15 = i10;
                                            i16 = i;
                                            i13 = i12;
                                            i17 = i11;
                                            i14 = i15;
                                        } else {
                                            kr0.a("Invalid extended command: ", iB4, "Cea708Decoder");
                                        }
                                    } else if (iB4 <= 135) {
                                        this.f34096h.d(32);
                                    } else if (iB4 <= 143) {
                                        this.f34096h.d(40);
                                    } else if (iB4 <= 159) {
                                        i12 = 2;
                                        this.f34096h.d(2);
                                        c10 = 6;
                                        this.f34096h.d(this.f34096h.b(6) * 8);
                                    }
                                    int i19 = i12;
                                    i14 = i10;
                                    i13 = i19;
                                    i16 = i;
                                    i17 = i11;
                                }
                            }
                            i12 = 2;
                            c10 = 6;
                            int i192 = i12;
                            i14 = i10;
                            i13 = i192;
                            i16 = i;
                            i17 = i11;
                        } else if (iB3 <= 31) {
                            if (iB3 != 0) {
                                if (iB3 == i16) {
                                    this.f34100m = j();
                                } else if (iB3 != 8) {
                                    switch (iB3) {
                                        case 12:
                                            for (int i20 = 0; i20 < 8; i20++) {
                                                this.f34098k[i20].b();
                                            }
                                            break;
                                        case 13:
                                            this.f34099l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iB3 < 17 || iB3 > 23) {
                                                if (iB3 < 24 || iB3 > 31) {
                                                    kr0.a("Invalid C0 command: ", iB3, "Cea708Decoder");
                                                    break;
                                                } else {
                                                    kr0.a("Currently unsupported COMMAND_P16 Command: ", iB3, "Cea708Decoder");
                                                    this.f34096h.d(16);
                                                    break;
                                                }
                                            } else {
                                                kr0.a("Currently unsupported COMMAND_EXT1 Command: ", iB3, "Cea708Decoder");
                                                this.f34096h.d(8);
                                                break;
                                            }
                                    }
                                } else {
                                    b bVar = this.f34099l;
                                    int length = bVar.f34118b.length();
                                    if (length > 0) {
                                        bVar.f34118b.delete(length - 1, length);
                                    }
                                }
                            }
                            i12 = i13;
                            i11 = i17;
                            i10 = i18;
                            c10 = 6;
                            i = i16;
                            int i1922 = i12;
                            i14 = i10;
                            i13 = i1922;
                            i16 = i;
                            i17 = i11;
                        } else {
                            if (iB3 > 127) {
                                if (iB3 <= 159) {
                                    switch (iB3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i = i16;
                                            i10 = i18;
                                            int i21 = iB3 - 128;
                                            if (this.f34103p != i21) {
                                                this.f34103p = i21;
                                                this.f34099l = this.f34098k[i21];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i = i16;
                                            i10 = i18;
                                            for (int i22 = i10; i22 <= 8; i22++) {
                                                if (this.f34096h.f()) {
                                                    b bVar2 = this.f34098k[8 - i22];
                                                    bVar2.f34117a.clear();
                                                    bVar2.f34118b.clear();
                                                    bVar2.f34131p = -1;
                                                    bVar2.f34132q = -1;
                                                    bVar2.f34133r = -1;
                                                    bVar2.f34135t = -1;
                                                    bVar2.f34137v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i = i16;
                                            int i23 = i18;
                                            while (i23 <= 8) {
                                                if (this.f34096h.f()) {
                                                    r32 = i18;
                                                    this.f34098k[8 - i23].f34120d = r32;
                                                } else {
                                                    r32 = i18;
                                                }
                                                i23++;
                                                i18 = r32;
                                            }
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case CONFIG_REFRESH_FAILED_VALUE:
                                            i = i16;
                                            for (int i24 = i18; i24 <= 8; i24++) {
                                                if (this.f34096h.f()) {
                                                    this.f34098k[8 - i24].f34120d = false;
                                                }
                                            }
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 139:
                                            i = i16;
                                            for (int i25 = i18; i25 <= 8; i25++) {
                                                if (this.f34096h.f()) {
                                                    this.f34098k[8 - i25].f34120d = !r2.f34120d;
                                                }
                                            }
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 140:
                                            i = i16;
                                            for (int i26 = i18; i26 <= 8; i26++) {
                                                if (this.f34096h.f()) {
                                                    this.f34098k[8 - i26].b();
                                                }
                                            }
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 141:
                                            i = i16;
                                            this.f34096h.d(8);
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 142:
                                            i = i16;
                                            i12 = i13;
                                            i10 = i18;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 143:
                                            i = i16;
                                            for (int i27 = 0; i27 < 8; i27++) {
                                                this.f34098k[i27].b();
                                            }
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 144:
                                            if (!this.f34099l.f34119c) {
                                                this.f34096h.d(16);
                                                i10 = i18;
                                                i12 = 2;
                                                i11 = 7;
                                                i = 3;
                                                c10 = 6;
                                                break;
                                            } else {
                                                this.f34096h.b(4);
                                                this.f34096h.b(2);
                                                this.f34096h.b(2);
                                                boolean zF = this.f34096h.f();
                                                boolean zF2 = this.f34096h.f();
                                                i = 3;
                                                this.f34096h.b(3);
                                                this.f34096h.b(3);
                                                this.f34099l.a(zF, zF2);
                                                i10 = i18;
                                                i12 = 2;
                                                i11 = 7;
                                                c10 = 6;
                                            }
                                        case 145:
                                            if (this.f34099l.f34119c) {
                                                int iA = b.a(this.f34096h.b(2), this.f34096h.b(2), this.f34096h.b(2), this.f34096h.b(2));
                                                int iA2 = b.a(this.f34096h.b(2), this.f34096h.b(2), this.f34096h.b(2), this.f34096h.b(2));
                                                this.f34096h.d(2);
                                                b.a(this.f34096h.b(2), this.f34096h.b(2), this.f34096h.b(2), 0);
                                                this.f34099l.a(iA, iA2);
                                            } else {
                                                this.f34096h.d(24);
                                            }
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            i = 3;
                                            c10 = 6;
                                            break;
                                        case 146:
                                            if (this.f34099l.f34119c) {
                                                this.f34096h.d(4);
                                                int iB5 = this.f34096h.b(4);
                                                this.f34096h.d(2);
                                                this.f34096h.b(6);
                                                b bVar3 = this.f34099l;
                                                if (bVar3.f34137v != iB5) {
                                                    bVar3.a('\n');
                                                }
                                                bVar3.f34137v = iB5;
                                            } else {
                                                this.f34096h.d(16);
                                            }
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            i = 3;
                                            c10 = 6;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            kr0.a("Invalid C1 command: ", iB3, "Cea708Decoder");
                                            break;
                                        case 151:
                                            if (this.f34099l.f34119c) {
                                                int iA3 = b.a(this.f34096h.b(2), this.f34096h.b(2), this.f34096h.b(2), this.f34096h.b(2));
                                                this.f34096h.b(2);
                                                b.a(this.f34096h.b(2), this.f34096h.b(2), this.f34096h.b(2), 0);
                                                this.f34096h.f();
                                                this.f34096h.f();
                                                this.f34096h.b(2);
                                                this.f34096h.b(2);
                                                int iB6 = this.f34096h.b(2);
                                                this.f34096h.d(8);
                                                b bVar4 = this.f34099l;
                                                bVar4.f34130o = iA3;
                                                bVar4.f34127l = iB6;
                                            } else {
                                                this.f34096h.d(32);
                                            }
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            i = 3;
                                            c10 = 6;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i28 = iB3 - 152;
                                            b bVar5 = this.f34098k[i28];
                                            this.f34096h.d(i13);
                                            boolean zF3 = this.f34096h.f();
                                            boolean zF4 = this.f34096h.f();
                                            this.f34096h.f();
                                            int iB7 = this.f34096h.b(i16);
                                            boolean zF5 = this.f34096h.f();
                                            int iB8 = this.f34096h.b(i17);
                                            int iB9 = this.f34096h.b(8);
                                            int iB10 = this.f34096h.b(4);
                                            int iB11 = this.f34096h.b(4);
                                            this.f34096h.d(i13);
                                            this.f34096h.b(6);
                                            this.f34096h.d(i13);
                                            int iB12 = this.f34096h.b(3);
                                            int iB13 = this.f34096h.b(3);
                                            bVar5.f34119c = true;
                                            bVar5.f34120d = zF3;
                                            bVar5.f34126k = zF4;
                                            bVar5.f34121e = iB7;
                                            bVar5.f34122f = zF5;
                                            bVar5.f34123g = iB8;
                                            bVar5.f34124h = iB9;
                                            bVar5.i = iB10;
                                            int i29 = iB11 + 1;
                                            if (bVar5.f34125j != i29) {
                                                bVar5.f34125j = i29;
                                                while (true) {
                                                    if ((zF4 && bVar5.f34117a.size() >= bVar5.f34125j) || bVar5.f34117a.size() >= 15) {
                                                        bVar5.f34117a.remove(0);
                                                    }
                                                }
                                            }
                                            if (iB12 != 0 && bVar5.f34128m != iB12) {
                                                bVar5.f34128m = iB12;
                                                int i30 = iB12 - 1;
                                                int i31 = b.f34109C[i30];
                                                boolean z10 = b.f34108B[i30];
                                                int i32 = b.f34116z[i30];
                                                int i33 = b.f34107A[i30];
                                                int i34 = b.f34115y[i30];
                                                bVar5.f34130o = i31;
                                                bVar5.f34127l = i34;
                                            }
                                            if (iB13 != 0 && bVar5.f34129n != iB13) {
                                                bVar5.f34129n = iB13;
                                                int i35 = iB13 - 1;
                                                int i36 = b.f34111E[i35];
                                                int i37 = b.f34110D[i35];
                                                bVar5.a(false, false);
                                                bVar5.a(b.f34113w, b.f34112F[i35]);
                                            }
                                            if (this.f34103p != i28) {
                                                this.f34103p = i28;
                                                this.f34099l = this.f34098k[i28];
                                            }
                                            i10 = i18;
                                            i12 = 2;
                                            i11 = 7;
                                            i = 3;
                                            c10 = 6;
                                            break;
                                    }
                                    i15 = i10;
                                    i16 = i;
                                    i13 = i12;
                                    i17 = i11;
                                    i14 = i15;
                                } else {
                                    i = i16;
                                    i10 = i18;
                                    if (iB3 <= 255) {
                                        this.f34099l.a((char) (iB3 & KotlinVersion.MAX_COMPONENT_VALUE));
                                    } else {
                                        kr0.a("Invalid base command: ", iB3, "Cea708Decoder");
                                        i12 = 2;
                                        i11 = 7;
                                        c10 = 6;
                                        int i19222 = i12;
                                        i14 = i10;
                                        i13 = i19222;
                                        i16 = i;
                                        i17 = i11;
                                    }
                                }
                                i12 = 2;
                                i11 = 7;
                                c10 = 6;
                                i15 = i10;
                                i16 = i;
                                i13 = i12;
                                i17 = i11;
                                i14 = i15;
                            } else if (iB3 == 127) {
                                this.f34099l.a((char) 9835);
                            } else {
                                this.f34099l.a((char) (iB3 & KotlinVersion.MAX_COMPONENT_VALUE));
                            }
                            i12 = i13;
                            i11 = i17;
                            i10 = i18;
                            c10 = 6;
                            i = i16;
                            i15 = i10;
                            i16 = i;
                            i13 = i12;
                            i17 = i11;
                            i14 = i15;
                        }
                    }
                    i14 = i14;
                    i13 = i13;
                }
            }
        }
        if (i15 != 0) {
            this.f34100m = j();
        }
        this.f34102o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.yandex.mobile.ads.impl.av> j() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.un.j():java.util.List");
    }

    @Override // com.yandex.mobile.ads.impl.vn
    public final void b(f32 f32Var) {
        ByteBuffer byteBuffer = f32Var.f30572d;
        byteBuffer.getClass();
        this.f34095g.a(byteBuffer.limit(), byteBuffer.array());
        while (this.f34095g.a() >= 3) {
            int iT = this.f34095g.t();
            int i = iT & 3;
            boolean z10 = (iT & 4) == 4;
            byte bT = (byte) this.f34095g.t();
            byte bT2 = (byte) this.f34095g.t();
            if (i == 2 || i == 3) {
                if (z10) {
                    if (i == 3) {
                        i();
                        int i10 = (bT & 192) >> 6;
                        int i11 = this.i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            for (int i12 = 0; i12 < 8; i12++) {
                                this.f34098k[i12].b();
                            }
                            rs0.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.i + " current=" + i10);
                        }
                        this.i = i10;
                        int i13 = bT & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i10, i13);
                        this.f34102o = cVar;
                        byte[] bArr = cVar.f34140c;
                        cVar.f34141d = 1;
                        bArr[0] = bT2;
                    } else {
                        if (i != 2) {
                            throw new IllegalArgumentException();
                        }
                        c cVar2 = this.f34102o;
                        if (cVar2 == null) {
                            rs0.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f34140c;
                            int i14 = cVar2.f34141d;
                            bArr2[i14] = bT;
                            cVar2.f34141d = i14 + 2;
                            bArr2[i14 + 1] = bT2;
                        }
                    }
                    c cVar3 = this.f34102o;
                    if (cVar3.f34141d == (cVar3.f34139b * 2) - 1) {
                        i();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.vn
    public final b32 c() {
        List<av> list = this.f34100m;
        this.f34101n = list;
        list.getClass();
        return new wn(list);
    }

    @Override // com.yandex.mobile.ads.impl.vn, com.yandex.mobile.ads.impl.jy
    public final void flush() {
        super.flush();
        this.f34100m = null;
        this.f34101n = null;
        this.f34103p = 0;
        this.f34099l = this.f34098k[0];
        for (int i = 0; i < 8; i++) {
            this.f34098k[i].b();
        }
        this.f34102o = null;
    }

    @Override // com.yandex.mobile.ads.impl.vn
    public final boolean h() {
        return this.f34100m != this.f34101n;
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final /* bridge */ /* synthetic */ void release() {
    }
}
