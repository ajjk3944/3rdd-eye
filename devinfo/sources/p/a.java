package p;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements e4.d1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30605a;

    /* renamed from: b, reason: collision with root package name */
    public int f30606b;

    /* renamed from: c, reason: collision with root package name */
    public final View f30607c;

    public a(FloatingActionButton floatingActionButton) {
        this.f30605a = false;
        this.f30606b = 0;
        this.f30607c = floatingActionButton;
    }

    @Override // e4.d1
    public void a() {
        this.f30605a = true;
    }

    @Override // e4.d1
    public void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f30605a = false;
    }

    @Override // e4.d1
    public void d() {
        if (this.f30605a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f30607c;
        actionBarContextView.f708f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f30606b);
    }

    public a(ActionBarContextView actionBarContextView) {
        this.f30607c = actionBarContextView;
        this.f30605a = false;
    }
}
