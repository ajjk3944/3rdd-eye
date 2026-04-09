package O3;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar.java */
/* loaded from: classes2.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f10212b;

    /* compiled from: BottomAppBar.java */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = b.this.f10212b;
            int i = BottomAppBar.f22512j0;
        }
    }

    public b(BottomAppBar bottomAppBar, int i) {
        this.f10212b = bottomAppBar;
        this.f10211a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f10212b.B(this.f10211a));
        floatingActionButton.m(new a(), true);
    }
}
