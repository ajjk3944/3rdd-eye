package I;

import Zg.AbstractC3689v;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final U f8083a = new U();

    private U() {
    }

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(AbstractC3689v.o(K.a(), O.a(), L.a(), M.a(), P.a(), Q.a(), S.a()));
        editorInfo.setSupportedHandwritingGesturePreviews(Zg.d0.i(K.a(), O.a(), L.a(), M.a()));
    }
}
