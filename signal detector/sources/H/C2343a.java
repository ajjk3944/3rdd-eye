package h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2343a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2346d f20306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2344b f20307b;

    public C2343a(C2344b c2344b, C2346d c2346d) {
        this.f20307b = c2344b;
        this.f20306a = c2346d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        C2344b c2344b = this.f20307b;
        DialogInterface.OnClickListener onClickListener = c2344b.f20315h;
        C2346d c2346d = this.f20306a;
        onClickListener.onClick(c2346d.f20318b, i);
        if (c2344b.i) {
            return;
        }
        c2346d.f20318b.dismiss();
    }
}
