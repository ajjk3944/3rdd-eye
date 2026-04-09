package X6;

import X6.a;
import android.text.TextUtils;
import android.view.ViewTreeObserver;

/* compiled from: AdaptiveMaxLines.kt */
/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f13580b;

    public c(a aVar) {
        this.f13580b = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a aVar = this.f13580b;
        a.C0196a c0196a = aVar.f13575d;
        if (c0196a != null) {
            O6.q qVar = aVar.f13572a;
            if (!TextUtils.isEmpty(qVar.getText())) {
                if (aVar.f13576e) {
                    aVar.a();
                    aVar.f13576e = false;
                    return true;
                }
                int lineCount = qVar.getLineCount();
                int iIntValue = c0196a.f13577a;
                Integer num = lineCount > c0196a.f13578b + iIntValue ? null : Integer.MAX_VALUE;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                if (iIntValue == qVar.getMaxLines()) {
                    aVar.a();
                    return true;
                }
                qVar.setMaxLines(iIntValue);
                aVar.f13576e = true;
                return false;
            }
        }
        return true;
    }
}
