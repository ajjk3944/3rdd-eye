package L6;

import H6.C0672i;
import N7.C1322q5;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;

/* compiled from: DivGalleryItemHelper.kt */
/* loaded from: classes.dex */
public interface e {

    /* compiled from: DivGalleryItemHelper.kt */
    public static final class a {

        /* compiled from: DivGalleryItemHelper.kt */
        /* renamed from: L6.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0071a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4085a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f4086b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f4087c;

            static {
                int[] iArr = new int[C1322q5.a.values().length];
                try {
                    iArr[C1322q5.a.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C1322q5.a.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C1322q5.a.END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4085a = iArr;
                int[] iArr2 = new int[EnumC1305p2.values().length];
                try {
                    iArr2[EnumC1305p2.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[EnumC1305p2.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[EnumC1305p2.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[EnumC1305p2.START.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[EnumC1305p2.END.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                f4086b = iArr2;
                int[] iArr3 = new int[EnumC1319q2.values().length];
                try {
                    iArr3[EnumC1319q2.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[EnumC1319q2.BASELINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[EnumC1319q2.CENTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[EnumC1319q2.BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                f4087c = iArr3;
            }
        }

        public static final int a(int i, int i10, C1322q5.a aVar) {
            int i11 = i - i10;
            int i12 = C0071a.f4085a[aVar.ordinal()];
            if (i12 == 1) {
                return 0;
            }
            if (i12 == 2) {
                return i11 / 2;
            }
            if (i12 == 3) {
                return i11;
            }
            throw new b9.j();
        }
    }

    /* compiled from: DivGalleryItemHelper.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4088a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4088a = iArr;
        }
    }

    HashSet a();

    void b(View view, int i, int i10, int i11, int i12, boolean z10);

    void c(int i, l lVar);

    void d(int i, int i10, l lVar);

    int e();

    void g(View view, int i, int i10, int i11, int i12);

    C0672i getBindingContext();

    C1322q5 getDiv();

    RecyclerView getView();

    int h();

    int i(View view);

    int j();

    int k();

    int l();

    void m(View view, boolean z10);

    RecyclerView.p n();

    int o(View view);

    i7.b p(int i);

    int q();
}
