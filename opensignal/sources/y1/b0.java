package y1;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class b0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f25633a = new b0();

    public final boolean onClearTranslation(View view) {
        ar.a aVar;
        br.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        b1.e contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f2374y = b1.a.SHOW_ORIGINAL;
        u.j jVarD = contentCaptureManager.d();
        Object[] objArr = jVarD.f23080c;
        long[] jArr = jVarD.f23078a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        u.a0 a0Var = ((e2.l) objArr[(i10 << 3) + i12]).f7721a.f7717d.f1191a;
                        Object objG = a0Var.g(e2.p.f7756z);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = a0Var.g(e2.g.f7695l);
                            e2.a aVar2 = (e2.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = (ar.a) aVar2.f7678b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onHideTranslation(View view) {
        ar.k kVar;
        br.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        b1.e contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f2374y = b1.a.SHOW_ORIGINAL;
        u.j jVarD = contentCaptureManager.d();
        Object[] objArr = jVarD.f23080c;
        long[] jArr = jVarD.f23078a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        u.a0 a0Var = ((e2.l) objArr[(i10 << 3) + i12]).f7721a.f7717d.f1191a;
                        Object objG = a0Var.g(e2.p.f7756z);
                        if (objG == null) {
                            objG = null;
                        }
                        if (br.l.a(objG, Boolean.TRUE)) {
                            Object objG2 = a0Var.g(e2.g.k);
                            e2.a aVar = (e2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (kVar = (ar.k) aVar.f7678b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onShowTranslation(View view) {
        ar.k kVar;
        br.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        b1.e contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f2374y = b1.a.SHOW_TRANSLATED;
        u.j jVarD = contentCaptureManager.d();
        Object[] objArr = jVarD.f23080c;
        long[] jArr = jVarD.f23078a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        u.a0 a0Var = ((e2.l) objArr[(i10 << 3) + i12]).f7721a.f7717d.f1191a;
                        Object objG = a0Var.g(e2.p.f7756z);
                        if (objG == null) {
                            objG = null;
                        }
                        if (br.l.a(objG, Boolean.FALSE)) {
                            Object objG2 = a0Var.g(e2.g.k);
                            e2.a aVar = (e2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (kVar = (ar.k) aVar.f7678b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
