package V6;

import D9.G;
import H6.C0672i;
import K6.C0713c;
import L0.C0770a;
import L0.I;
import N7.Ka;
import N7.Q6;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import w6.C5738b;

/* compiled from: SpannedTextBuilder.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final B0.f f13003a;

    /* renamed from: b, reason: collision with root package name */
    public final G f13004b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f13005c;

    /* compiled from: SpannedTextBuilder.kt */
    public static final class a extends j6.o {

        /* renamed from: a, reason: collision with root package name */
        public final C0672i f13006a;

        /* renamed from: b, reason: collision with root package name */
        public final Ka.b f13007b;

        /* renamed from: c, reason: collision with root package name */
        public final d f13008c;

        /* renamed from: d, reason: collision with root package name */
        public final SpannableStringBuilder f13009d;

        /* renamed from: e, reason: collision with root package name */
        public final kotlin.jvm.internal.m f13010e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(C0672i c0672i, Ka.b bVar, d dVar, SpannableStringBuilder spannableStringBuilder, p9.l lVar) {
            super(c0672i.f2146a);
            this.f13006a = c0672i;
            this.f13007b = bVar;
            this.f13008c = dVar;
            this.f13009d = spannableStringBuilder;
            this.f13010e = (kotlin.jvm.internal.m) lVar;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.internal.m, p9.l] */
        @Override // w6.C5739c
        public final void c(C5738b c5738b) {
            C0672i c0672i = this.f13006a;
            Resources resources = c0672i.f2146a.getResources();
            Ka.b bVar = this.f13007b;
            A7.b<Integer> bVar2 = bVar.f5707g;
            A7.d dVar = c0672i.f2147b;
            Integer numA = bVar2 != null ? bVar2.a(dVar) : null;
            PorterDuff.Mode modeE0 = C0713c.e0(bVar.f5708h.a(dVar));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, c5738b.f47495a);
            if (numA != null) {
                bitmapDrawable.setColorFilter(new PorterDuffColorFilter(numA.intValue(), modeE0));
            }
            d dVar2 = this.f13008c;
            if (!kotlin.jvm.internal.l.b(dVar2.f12960g, bitmapDrawable)) {
                dVar2.f12960g = bitmapDrawable;
                bitmapDrawable.setBounds(0, 0, dVar2.f12955b, dVar2.f12956c);
                dVar2.f12961h.setEmpty();
            }
            ?? r52 = this.f13010e;
            if (r52 != 0) {
                r52.invoke(this.f13009d);
            }
        }
    }

    /* compiled from: SpannedTextBuilder.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13011a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13012b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13013c;

        static {
            int[] iArr = new int[Ka.b.EnumC0089b.values().length];
            try {
                iArr[Ka.b.EnumC0089b.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ka.b.EnumC0089b.REVERSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13011a = iArr;
            int[] iArr2 = new int[Q6.values().length];
            try {
                iArr2[Q6.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Q6.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f13012b = iArr2;
            int[] iArr3 = new int[Ka.b.a.EnumC0086a.values().length];
            try {
                iArr3[Ka.b.a.EnumC0086a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Ka.b.a.EnumC0086a.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Ka.b.a.EnumC0086a.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Ka.b.a.EnumC0086a.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Ka.b.a.EnumC0086a.AUTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f13013c = iArr3;
        }
    }

    public k(B0.f fVar, G imageLoader) {
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        this.f13003a = fVar;
        this.f13004b = imageLoader;
        this.f13005c = new Paint();
    }

    public static void a(C0672i c0672i, TextView textView, SpannableStringBuilder spannableStringBuilder, int i, int i10, List list, boolean z10) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        spannableStringBuilder.setSpan(new f(c0672i, list), i, i10, 33);
        if (z10) {
            C0770a c0770aD = I.d(textView);
            if (c0770aD == null) {
                c0770aD = new C0770a();
            }
            I.o(textView, c0770aD);
        }
    }

    public static int c(int i, Ka.b bVar, A7.d dVar) {
        long jLongValue = bVar.f5706f.a(dVar).longValue();
        int i10 = b.f13011a[bVar.f5704d.a(dVar).ordinal()];
        if (i10 == 1) {
            long j4 = jLongValue >> 31;
            if (j4 == 0 || j4 == -1) {
                return (int) jLongValue;
            }
            if (jLongValue > 0) {
                return Integer.MAX_VALUE;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != 2) {
            throw new b9.j();
        }
        long j10 = i - jLongValue;
        long j11 = j10 >> 31;
        if (j11 == 0 || j11 == -1) {
            return (int) j10;
        }
        if (j10 > 0) {
            return Integer.MAX_VALUE;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0a5d A[LOOP:5: B:459:0x08d4->B:540:0x0a5d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x078d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0a6d A[EDGE_INSN: B:574:0x0a6d->B:542:0x0a6d BREAK  A[LOOP:5: B:459:0x08d4->B:540:0x0a5d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b4  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.SpannableStringBuilder b(H6.C0672i r53, android.widget.TextView r54, N7.Ka r55, java.lang.String r56, java.util.List r57, java.util.List r58, java.util.List r59, p9.l r60) {
        /*
            Method dump skipped, instructions count: 2675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.k.b(H6.i, android.widget.TextView, N7.Ka, java.lang.String, java.util.List, java.util.List, java.util.List, p9.l):android.text.SpannableStringBuilder");
    }
}
