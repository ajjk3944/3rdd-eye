package I;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* renamed from: I.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2930f {

    /* renamed from: a, reason: collision with root package name */
    public static final C2930f f8307a = new C2930f();

    private C2930f() {
    }

    public final boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i10, bundle);
    }
}
