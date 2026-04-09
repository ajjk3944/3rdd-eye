package j2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f27067a = new a0();

    public final boolean onClearTranslation(View view) {
        mk.a aVar;
        nk.k.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        k1.e contentCaptureManager$ui = ((r) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f27797f = k1.a.f27781a;
        x.j jVarF = contentCaptureManager$ui.f();
        Object[] objArr = jVarF.f36906c;
        long[] jArr = jVarF.f36904a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        x.e0 e0Var = ((p2.q) objArr[(i4 << 3) + i11]).f31107a.f31104d.f31095a;
                        Object objG = e0Var.g(p2.t.B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = e0Var.g(p2.k.f31082n);
                            p2.a aVar2 = (p2.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = (mk.a) aVar2.f31037b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i4 == length) {
                return true;
            }
            i4++;
        }
    }

    public final boolean onHideTranslation(View view) {
        mk.c cVar;
        nk.k.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        k1.e contentCaptureManager$ui = ((r) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f27797f = k1.a.f27781a;
        x.j jVarF = contentCaptureManager$ui.f();
        Object[] objArr = jVarF.f36906c;
        long[] jArr = jVarF.f36904a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        x.e0 e0Var = ((p2.q) objArr[(i4 << 3) + i11]).f31107a.f31104d.f31095a;
                        Object objG = e0Var.g(p2.t.B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (nk.k.a(objG, Boolean.TRUE)) {
                            Object objG2 = e0Var.g(p2.k.f31081m);
                            p2.a aVar = (p2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (mk.c) aVar.f31037b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i4 == length) {
                return true;
            }
            i4++;
        }
    }

    public final boolean onShowTranslation(View view) {
        mk.c cVar;
        nk.k.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        k1.e contentCaptureManager$ui = ((r) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f27797f = k1.a.f27782b;
        x.j jVarF = contentCaptureManager$ui.f();
        Object[] objArr = jVarF.f36906c;
        long[] jArr = jVarF.f36904a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        x.e0 e0Var = ((p2.q) objArr[(i4 << 3) + i11]).f31107a.f31104d.f31095a;
                        Object objG = e0Var.g(p2.t.B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (nk.k.a(objG, Boolean.FALSE)) {
                            Object objG2 = e0Var.g(p2.k.f31081m);
                            p2.a aVar = (p2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (mk.c) aVar.f31037b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i4 == length) {
                return true;
            }
            i4++;
        }
    }
}
