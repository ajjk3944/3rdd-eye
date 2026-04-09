package Q0;

import Q0.f;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputConnectionCompat.java */
/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M8.a f10856a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, M8.a aVar) {
        super(inputConnection, false);
        this.f10856a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        f fVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            fVar = new f(new f.a(inputContentInfo));
        }
        if (this.f10856a.c(fVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
