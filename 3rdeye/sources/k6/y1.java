package K6;

import H6.C0672i;
import N7.AbstractC1408w8;
import N7.C1298o9;
import N7.C1325q8;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.H9;
import N7.I8;
import N7.Ka;
import N7.Q6;
import N7.S8;
import X6.a;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import c9.C2097r;
import j7.b;
import j7.d;
import java.util.List;
import java.util.WeakHashMap;
import k7.C5248a;
import r7.C5535f;

/* compiled from: DivTextBinder.kt */
/* loaded from: classes.dex */
public final class y1 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final B0.f f3719c;

    /* renamed from: d, reason: collision with root package name */
    public final V6.k f3720d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3721e;

    /* compiled from: DivTextBinder.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3722a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3723b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f3724c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f3725d;

        static {
            int[] iArr = new int[EnumC1305p2.values().length];
            try {
                iArr[EnumC1305p2.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1305p2.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1305p2.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1305p2.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1305p2.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3722a = iArr;
            int[] iArr2 = new int[Q6.values().length];
            try {
                iArr2[Q6.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Q6.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f3723b = iArr2;
            int[] iArr3 = new int[S8.a.values().length];
            try {
                iArr3[S8.a.FARTHEST_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[S8.a.NEAREST_CORNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[S8.a.FARTHEST_SIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[S8.a.NEAREST_SIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            f3724c = iArr3;
            int[] iArr4 = new int[Ka.d.values().length];
            try {
                iArr4[Ka.d.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[Ka.d.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[Ka.d.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[Ka.d.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            f3725d = iArr4;
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f3726b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f3727c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C5248a f3728d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y1 f3729e;

        public b(TextView textView, long j4, C5248a c5248a, y1 y1Var) {
            this.f3726b = textView;
            this.f3727c = j4;
            this.f3728d = c5248a;
            this.f3729e = y1Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            view.removeOnLayoutChangeListener(this);
            TextView textView = this.f3726b;
            TextPaint paint = textView.getPaint();
            int i17 = j7.b.f43080e;
            float f10 = this.f3727c;
            C5248a c5248a = this.f3728d;
            paint.setShader(b.a.a(f10, c5248a.f43428a, c5248a.f43429b, y1.m(this.f3729e, textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* compiled from: View.kt */
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f3730b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d.c f3731c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d.a f3732d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d.a f3733e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List f3734f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ y1 f3735g;

        public c(TextView textView, d.c cVar, d.a aVar, d.a aVar2, List list, y1 y1Var) {
            this.f3730b = textView;
            this.f3731c = cVar;
            this.f3732d = aVar;
            this.f3733e = aVar2;
            this.f3734f = list;
            this.f3735g = y1Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            view.removeOnLayoutChangeListener(this);
            TextView textView = this.f3730b;
            TextPaint paint = textView.getPaint();
            int i17 = j7.d.f43091g;
            paint.setShader(d.b.b(this.f3731c, this.f3732d, this.f3733e, C2097r.F0(this.f3734f), y1.m(this.f3735g, textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* compiled from: DivTextBinder.kt */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<Spanned, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C5535f f3736g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C5535f c5535f) {
            super(1);
            this.f3736g = c5535f;
        }

        @Override // p9.l
        public final C1992A invoke(Spanned spanned) {
            Spanned ellipsis = spanned;
            kotlin.jvm.internal.l.f(ellipsis, "ellipsis");
            this.f3736g.setEllipsis(ellipsis);
            return C1992A.f18074a;
        }
    }

    /* compiled from: DivTextBinder.kt */
    public static final class e extends kotlin.jvm.internal.m implements p9.l<Spanned, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ TextView f3737g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextView textView) {
            super(1);
            this.f3737g = textView;
        }

        @Override // p9.l
        public final C1992A invoke(Spanned spanned) {
            Spanned spannedText = spanned;
            kotlin.jvm.internal.l.f(spannedText, "spannedText");
            this.f3737g.setText(spannedText, TextView.BufferType.NORMAL);
            return C1992A.f18074a;
        }
    }

    public y1(D d10, B0.f fVar, V6.k kVar, boolean z10) {
        super(d10);
        this.f3719c = fVar;
        this.f3720d = kVar;
        this.f3721e = z10;
    }

    public static void A(TextView textView, Q6 q62) {
        int i = a.f3723b[q62.ordinal()];
        if (i == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        } else {
            if (i != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        }
    }

    public static V6.g B(C1298o9 c1298o9, A7.d dVar, DisplayMetrics displayMetrics, int i) {
        float fD = C0713c.D(c1298o9.f8863b.a(dVar), displayMetrics);
        C1325q8 c1325q8 = c1298o9.f8865d;
        float fG0 = C0713c.g0(c1325q8.f8992a, displayMetrics, dVar);
        float fG02 = C0713c.g0(c1325q8.f8993b, displayMetrics, dVar);
        Paint paint = new Paint();
        paint.setColor(c1298o9.f8864c.a(dVar).intValue());
        paint.setAlpha((int) (c1298o9.f8862a.a(dVar).doubleValue() * (i >>> 24)));
        return new V6.g(fG0, fG02, fD, paint.getColor());
    }

    public static d.a C(AbstractC1408w8 abstractC1408w8, DisplayMetrics displayMetrics, A7.d dVar) {
        if (abstractC1408w8 instanceof AbstractC1408w8.a) {
            return new d.a.C0480a(C0713c.D(((AbstractC1408w8.a) abstractC1408w8).f9724b.f5116b.a(dVar), displayMetrics));
        }
        if (abstractC1408w8 instanceof AbstractC1408w8.b) {
            return new d.a.b((float) ((AbstractC1408w8.b) abstractC1408w8).f9725b.f5938a.a(dVar).doubleValue());
        }
        throw new b9.j();
    }

    public static d.c D(I8 i82, DisplayMetrics displayMetrics, A7.d dVar) {
        d.c.b.a aVar;
        if (i82 instanceof I8.a) {
            return new d.c.a(C0713c.D(((I8.a) i82).f5476b.f7613b.a(dVar), displayMetrics));
        }
        if (!(i82 instanceof I8.b)) {
            throw new b9.j();
        }
        int i = a.f3724c[((I8.b) i82).f5477b.f6207a.a(dVar).ordinal()];
        if (i == 1) {
            aVar = d.c.b.a.FARTHEST_CORNER;
        } else if (i == 2) {
            aVar = d.c.b.a.NEAREST_CORNER;
        } else if (i == 3) {
            aVar = d.c.b.a.FARTHEST_SIDE;
        } else {
            if (i != 4) {
                throw new b9.j();
            }
            aVar = d.c.b.a.NEAREST_SIDE;
        }
        return new d.c.b(aVar);
    }

    public static final int m(y1 y1Var, TextView textView) {
        y1Var.getClass();
        return Math.min((textView.getWidth() - textView.getPaddingRight()) - textView.getPaddingLeft(), (int) textView.getPaint().measureText(textView.getText().toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(O6.q r4, N7.Ka r5, A7.d r6) {
        /*
            A7.b<N7.Ka$d> r0 = r5.f5671j0
            java.lang.Object r0 = r0.a(r6)
            N7.Ka$d r0 = (N7.Ka.d) r0
            int[] r1 = K6.y1.a.f3725d
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L2b
            r3 = 2
            if (r1 == r3) goto L28
            r3 = 3
            if (r1 == r3) goto L25
            r3 = 4
            if (r1 != r3) goto L1f
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            goto L2c
        L1f:
            b9.j r4 = new b9.j
            r4.<init>()
            throw r4
        L25:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L2c
        L28:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r4.setEllipsisLocation(r1)
            N7.Ka$d r1 = N7.Ka.d.NONE
            r3 = 0
            if (r0 == r1) goto L47
            A7.b<java.lang.Boolean> r5 = r5.i
            if (r5 == 0) goto L43
            java.lang.Object r5 = r5.a(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L44
        L43:
            r5 = r3
        L44:
            if (r5 == 0) goto L47
            goto L48
        L47:
            r2 = r3
        L48:
            r4.setAutoEllipsize(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.y1.n(O6.q, N7.Ka, A7.d):void");
    }

    public static void o(TextView textView, long j4, H9 h92, double d10) {
        long j10 = j4 >> 31;
        int i = (j10 == 0 || j10 == -1) ? (int) j4 : j4 > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        C0713c.e(textView, i, h92);
        C0713c.h(textView, d10, i);
    }

    public static void r(O6.q qVar, Long l5, Long l10) {
        X6.a adaptiveMaxLines$div_release = qVar.getAdaptiveMaxLines$div_release();
        if (adaptiveMaxLines$div_release != null) {
            X6.b bVar = adaptiveMaxLines$div_release.f13573b;
            if (bVar != null) {
                adaptiveMaxLines$div_release.f13572a.removeOnAttachStateChangeListener(bVar);
            }
            adaptiveMaxLines$div_release.f13573b = null;
            adaptiveMaxLines$div_release.a();
        }
        int i = RecyclerView.UNDEFINED_DURATION;
        int i10 = Integer.MAX_VALUE;
        if (l5 == null || l10 == null) {
            if (l5 != null) {
                long jLongValue = l5.longValue();
                long j4 = jLongValue >> 31;
                if (j4 == 0 || j4 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    if (jLongValue > 0) {
                        i = Integer.MAX_VALUE;
                    }
                    i10 = i;
                }
            }
            qVar.setMaxLines(i10);
            return;
        }
        X6.a aVar = new X6.a(qVar);
        long jLongValue2 = l5.longValue();
        long j10 = jLongValue2 >> 31;
        int i11 = (j10 == 0 || j10 == -1) ? (int) jLongValue2 : jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long jLongValue3 = l10.longValue();
        long j11 = jLongValue3 >> 31;
        if (j11 == 0 || j11 == -1) {
            i = (int) jLongValue3;
        } else if (jLongValue3 > 0) {
            i = Integer.MAX_VALUE;
        }
        a.C0196a c0196a = new a.C0196a(i11, i);
        if (!kotlin.jvm.internal.l.b(aVar.f13575d, c0196a)) {
            aVar.f13575d = c0196a;
            WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
            if (qVar.isAttachedToWindow() && aVar.f13574c == null) {
                X6.c cVar = new X6.c(aVar);
                ViewTreeObserver viewTreeObserver = qVar.getViewTreeObserver();
                kotlin.jvm.internal.l.e(viewTreeObserver, "textView.viewTreeObserver");
                viewTreeObserver.addOnPreDrawListener(cVar);
                aVar.f13574c = cVar;
            }
            if (aVar.f13573b == null) {
                X6.b bVar2 = new X6.b(aVar);
                qVar.addOnAttachStateChangeListener(bVar2);
                aVar.f13573b = bVar2;
            }
        }
        qVar.setAdaptiveMaxLines$div_release(aVar);
    }

    public static void w(TextView textView, Q6 q62) {
        int i = a.f3723b[q62.ordinal()];
        if (i == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        } else {
            if (i != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        }
    }

    public static void x(TextView textView, EnumC1305p2 enumC1305p2, EnumC1319q2 enumC1319q2) {
        textView.setGravity(C0713c.F(enumC1305p2, enumC1319q2));
        int i = a.f3722a[enumC1305p2.ordinal()];
        int i10 = 5;
        if (i != 1) {
            if (i == 2) {
                i10 = 4;
            } else if (i == 3 || (i != 4 && i == 5)) {
                i10 = 6;
            }
        }
        textView.setTextAlignment(i10);
    }

    public static void y(TextView textView, int i, Integer num) {
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{num != null ? num.intValue() : i, i}));
    }

    public static void z(TextView textView, V6.g gVar) {
        X6.g gVar2;
        if (gVar == null) {
            ViewParent parent = textView.getParent();
            gVar2 = parent instanceof X6.g ? (X6.g) parent : null;
            if (gVar2 != null) {
                gVar2.setClipChildren(true);
                gVar2.setClipToPadding(true);
            }
            textView.setClipToOutline(true);
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            return;
        }
        ViewParent parent2 = textView.getParent();
        gVar2 = parent2 instanceof X6.g ? (X6.g) parent2 : null;
        if (gVar2 != null) {
            gVar2.setClipChildren(false);
            gVar2.setClipToPadding(false);
        }
        textView.setClipToOutline(false);
        textView.setShadowLayer(gVar.f12977c, gVar.f12975a, gVar.f12976b, gVar.f12978d);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x08e2 A[PHI: r2 r6
  0x08e2: PHI (r2v7 O6.q) = (r2v4 O6.q), (r2v6 O6.q), (r2v6 O6.q), (r2v4 O6.q), (r2v4 O6.q), (r2v4 O6.q) binds: [B:516:0x0868, B:540:0x08dc, B:542:0x08e0, B:530:0x08a4, B:510:0x084d, B:736:0x08e2] A[DONT_GENERATE, DONT_INLINE]
  0x08e2: PHI (r6v5 A7.d) = (r6v4 A7.d), (r6v4 A7.d), (r6v4 A7.d), (r6v4 A7.d), (r6v7 A7.d), (r6v7 A7.d) binds: [B:516:0x0868, B:540:0x08dc, B:542:0x08e0, B:530:0x08a4, B:510:0x084d, B:736:0x08e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152 A[PHI: r2
  0x0152: PHI (r2v11 O6.q) = (r2v2 O6.q), (r2v1 O6.q) binds: [B:75:0x0150, B:68:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // H6.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r22, H6.C0672i r23, N7.S2 r24, N7.S2 r25) {
        /*
            Method dump skipped, instructions count: 2868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.y1.d(android.view.View, H6.i, N7.S2, N7.S2):void");
    }

    public final void p(TextView textView, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i = 0;
            if (this.f3721e && TextUtils.indexOf((CharSequence) str, (char) 173, 0, Math.min(str.length(), 10)) > 0) {
                i = 1;
            }
            if (hyphenationFrequency != i) {
                textView.setHyphenationFrequency(i);
            }
        }
    }

    public final void q(TextView textView, long j4, C5248a c5248a) {
        if (!C6.r.c(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new b(textView, j4, c5248a, this));
            return;
        }
        TextPaint paint = textView.getPaint();
        int i = j7.b.f43080e;
        paint.setShader(b.a.a(j4, c5248a.f43428a, c5248a.f43429b, m(this, textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
        textView.invalidate();
    }

    public final void s(TextView textView, C0672i c0672i, Ka ka2) {
        V6.k kVar = this.f3720d;
        kVar.getClass();
        kotlin.jvm.internal.l.f(textView, "textView");
        textView.setText(kVar.b(c0672i, textView, ka2, ka2.f5649W.a(c0672i.f2147b), null, null, null, null));
    }

    public final void t(TextView textView, d.c cVar, d.a aVar, d.a aVar2, List<Integer> list) {
        if (!C6.r.c(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new c(textView, cVar, aVar, aVar2, list, this));
            return;
        }
        TextPaint paint = textView.getPaint();
        int i = j7.d.f43091g;
        paint.setShader(d.b.b(cVar, aVar, aVar2, C2097r.F0(list), m(this, textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
        textView.invalidate();
    }

    public final void u(C5535f textView, C0672i c0672i, Ka ka2) {
        Ka.a aVar = ka2.f5682p;
        if (aVar == null) {
            textView.setEllipsis("…");
            return;
        }
        d dVar = new d(textView);
        V6.k kVar = this.f3720d;
        kVar.getClass();
        kotlin.jvm.internal.l.f(textView, "textView");
        kVar.b(c0672i, textView, ka2, aVar.f5699d.a(c0672i.f2147b), aVar.f5698c, aVar.f5697b, aVar.f5696a, dVar);
    }

    public final void v(TextView textView, C0672i c0672i, Ka ka2) {
        e eVar = new e(textView);
        V6.k kVar = this.f3720d;
        kVar.getClass();
        kotlin.jvm.internal.l.f(textView, "textView");
        kVar.b(c0672i, textView, ka2, ka2.f5649W.a(c0672i.f2147b), ka2.f5643Q, ka2.f5632F, ka2.f5659d, eVar);
    }
}
