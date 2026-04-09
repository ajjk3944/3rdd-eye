package K6;

import H6.C0675l;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TextView.kt */
/* loaded from: classes.dex */
public final class M0 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0759u0 f3281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O6.p f3282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0675l f3283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A7.d f3284f;

    public M0(ArrayList arrayList, C0759u0 c0759u0, O6.p pVar, C0675l c0675l, A7.d dVar) {
        this.f3280b = arrayList;
        this.f3281c = c0759u0;
        this.f3282d = pVar;
        this.f3283e = c0675l;
        this.f3284f = dVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            Iterator it = this.f3280b.iterator();
            while (it.hasNext()) {
                C0759u0.m(this.f3281c, (G6.d) it.next(), String.valueOf(this.f3282d.getText()), this.f3282d, this.f3283e, this.f3284f);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
