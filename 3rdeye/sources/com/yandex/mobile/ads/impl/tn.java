package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.yandex.mobile.ads.impl.av;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class tn extends vn {

    /* renamed from: h, reason: collision with root package name */
    private final int f33696h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private final int f33697j;

    /* renamed from: n, reason: collision with root package name */
    private List<av> f33701n;

    /* renamed from: o, reason: collision with root package name */
    private List<av> f33702o;

    /* renamed from: p, reason: collision with root package name */
    private int f33703p;

    /* renamed from: q, reason: collision with root package name */
    private int f33704q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f33705r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f33706s;

    /* renamed from: t, reason: collision with root package name */
    private byte f33707t;

    /* renamed from: u, reason: collision with root package name */
    private byte f33708u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f33710w;

    /* renamed from: x, reason: collision with root package name */
    private long f33711x;

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f33693y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f33694z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f33687A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f33688B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f33689C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f33690D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f33691E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F, reason: collision with root package name */
    private static final boolean[] f33692F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    private final uf1 f33695g = new uf1();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<a> f33699l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    private a f33700m = new a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    private int f33709v = 0;

    /* renamed from: k, reason: collision with root package name */
    private final long f33698k = 16000000;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f33712a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f33713b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f33714c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f33715d;

        /* renamed from: e, reason: collision with root package name */
        private int f33716e;

        /* renamed from: f, reason: collision with root package name */
        private int f33717f;

        /* renamed from: g, reason: collision with root package name */
        private int f33718g;

        /* renamed from: h, reason: collision with root package name */
        private int f33719h;

        /* renamed from: com.yandex.mobile.ads.impl.tn$a$a, reason: collision with other inner class name */
        public static class C0421a {

            /* renamed from: a, reason: collision with root package name */
            public final int f33720a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f33721b;

            /* renamed from: c, reason: collision with root package name */
            public int f33722c;

            public C0421a(int i, int i10, boolean z10) {
                this.f33720a = i;
                this.f33721b = z10;
                this.f33722c = i10;
            }
        }

        public a(int i, int i10) {
            b(i);
            this.f33719h = i10;
        }

        public final void a() {
            int length = this.f33714c.length();
            if (length > 0) {
                this.f33714c.delete(length - 1, length);
                for (int size = this.f33712a.size() - 1; size >= 0; size--) {
                    C0421a c0421a = (C0421a) this.f33712a.get(size);
                    int i = c0421a.f33722c;
                    if (i != length) {
                        return;
                    }
                    c0421a.f33722c = i - 1;
                }
            }
        }

        public final void b(int i) {
            this.f33718g = i;
            this.f33712a.clear();
            this.f33713b.clear();
            this.f33714c.setLength(0);
            this.f33715d = 15;
            this.f33716e = 0;
            this.f33717f = 0;
        }

        public final av a(int i) {
            float f10;
            int i10 = this.f33716e + this.f33717f;
            int i11 = 32 - i10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.f33713b.size(); i12++) {
                CharSequence charSequenceSubSequence = (CharSequence) this.f33713b.get(i12);
                int i13 = s82.f32899a;
                if (charSequenceSubSequence.length() > i11) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i11);
                }
                spannableStringBuilder.append(charSequenceSubSequence);
                spannableStringBuilder.append('\n');
            }
            SpannableString spannableStringB = b();
            int i14 = s82.f32899a;
            int length = spannableStringB.length();
            CharSequence charSequenceSubSequence2 = spannableStringB;
            if (length > i11) {
                charSequenceSubSequence2 = spannableStringB.subSequence(0, i11);
            }
            spannableStringBuilder.append(charSequenceSubSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i11 - spannableStringBuilder.length();
            int i15 = i10 - length2;
            if (i == Integer.MIN_VALUE) {
                if (this.f33718g != 2 || (Math.abs(i15) >= 3 && length2 >= 0)) {
                    i = (this.f33718g != 2 || i15 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i10 = 32 - length2;
                }
                f10 = ((i10 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i16 = this.f33715d;
            if (i16 > 7) {
                i16 -= 17;
            } else if (this.f33718g == 1) {
                i16 -= this.f33719h - 1;
            }
            return new av.a().a(spannableStringBuilder).b(Layout.Alignment.ALIGN_NORMAL).a(1, i16).b(f10).b(i).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f33714c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = 0;
            boolean z10 = false;
            while (i13 < this.f33712a.size()) {
                C0421a c0421a = (C0421a) this.f33712a.get(i13);
                boolean z11 = c0421a.f33721b;
                int i15 = c0421a.f33720a;
                if (i15 != 8) {
                    boolean z12 = i15 == 7;
                    if (i15 != 7) {
                        i12 = tn.f33687A[i15];
                    }
                    z10 = z12;
                }
                int i16 = c0421a.f33722c;
                i13++;
                if (i16 != (i13 < this.f33712a.size() ? ((C0421a) this.f33712a.get(i13)).f33722c : length)) {
                    if (i != -1 && !z11) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i16, 33);
                        i = -1;
                    } else if (i == -1 && z11) {
                        i = i16;
                    }
                    if (i10 != -1 && !z10) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i10, i16, 33);
                        i10 = -1;
                    } else if (i10 == -1 && z10) {
                        i10 = i16;
                    }
                    if (i12 != i11) {
                        if (i11 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, i16, 33);
                        }
                        i14 = i16;
                        i11 = i12;
                    }
                }
            }
            if (i != -1 && i != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (i10 != -1 && i10 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
            }
            if (i14 != length && i11 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }
    }

    public tn(String str, int i) {
        this.f33696h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f33697j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.f33697j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.f33697j = 0;
            this.i = 1;
        } else if (i != 4) {
            rs0.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f33697j = 0;
            this.i = 0;
        } else {
            this.f33697j = 1;
            this.i = 1;
        }
        a(0);
        j();
        this.f33710w = true;
        this.f33711x = -9223372036854775807L;
    }

    private ArrayList i() {
        int size = this.f33699l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            av avVarA = this.f33699l.get(i).a(RecyclerView.UNDEFINED_DURATION);
            arrayList.add(avVarA);
            if (avVarA != null) {
                iMin = Math.min(iMin, avVarA.f24827j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            av avVarA2 = (av) arrayList.get(i10);
            if (avVarA2 != null) {
                if (avVarA2.f24827j != iMin) {
                    avVarA2 = this.f33699l.get(i10).a(iMin);
                    avVarA2.getClass();
                }
                arrayList2.add(avVarA2);
            }
        }
        return arrayList2;
    }

    private void j() {
        this.f33700m.b(this.f33703p);
        this.f33699l.clear();
        this.f33699l.add(this.f33700m);
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af A[FALL_THROUGH] */
    @Override // com.yandex.mobile.ads.impl.vn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.yandex.mobile.ads.impl.f32 r14) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.tn.b(com.yandex.mobile.ads.impl.f32):void");
    }

    @Override // com.yandex.mobile.ads.impl.vn
    public final b32 c() {
        List<av> list = this.f33701n;
        this.f33702o = list;
        list.getClass();
        return new wn(list);
    }

    @Override // com.yandex.mobile.ads.impl.vn, com.yandex.mobile.ads.impl.jy
    /* renamed from: e */
    public final g32 a() throws d32 {
        g32 g32VarF;
        g32 g32VarA = super.a();
        if (g32VarA != null) {
            return g32VarA;
        }
        if (this.f33698k == -9223372036854775807L || this.f33711x == -9223372036854775807L || g() - this.f33711x < this.f33698k || (g32VarF = f()) == null) {
            return null;
        }
        this.f33701n = Collections.EMPTY_LIST;
        this.f33711x = -9223372036854775807L;
        g32VarF.a(g(), c(), Long.MAX_VALUE);
        return g32VarF;
    }

    @Override // com.yandex.mobile.ads.impl.vn, com.yandex.mobile.ads.impl.jy
    public final void flush() {
        super.flush();
        this.f33701n = null;
        this.f33702o = null;
        a(0);
        this.f33704q = 4;
        this.f33700m.f33719h = 4;
        j();
        this.f33705r = false;
        this.f33706s = false;
        this.f33707t = (byte) 0;
        this.f33708u = (byte) 0;
        this.f33709v = 0;
        this.f33710w = true;
        this.f33711x = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.vn
    public final boolean h() {
        return this.f33701n != this.f33702o;
    }

    private void a(int i) {
        int i10 = this.f33703p;
        if (i10 == i) {
            return;
        }
        this.f33703p = i;
        if (i == 3) {
            for (int i11 = 0; i11 < this.f33699l.size(); i11++) {
                this.f33699l.get(i11).f33718g = i;
            }
            return;
        }
        j();
        if (i10 == 3 || i == 1 || i == 0) {
            this.f33701n = Collections.EMPTY_LIST;
        }
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final void release() {
    }
}
