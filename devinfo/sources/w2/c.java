package w2;

import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.k1;
import km.n;
import km.o;
import nk.k;
import nk.l;
import xg.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, Object obj) {
        super(0);
        this.f36422a = i4;
        this.f36423b = obj;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f36422a) {
            case 0:
                Object systemService = ((View) ((n) this.f36423b).f28442b).getContext().getSystemService("input_method");
                k.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 1:
                return new BaseInputConnection((View) ((o) this.f36423b).f28445a, false);
            case 2:
                return (g) this.f36423b;
            default:
                return (k1) ((c) this.f36423b).invoke();
        }
    }
}
