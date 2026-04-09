package K4;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class l implements O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2338a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f2339b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f2340c;

    public /* synthetic */ l(LinearLayout linearLayout, MaterialButton materialButton, RecyclerView recyclerView, int i) {
        this.f2338a = i;
        this.f2339b = linearLayout;
        this.f2340c = materialButton;
    }

    @Override // O0.a
    public final View getRoot() {
        switch (this.f2338a) {
        }
        return this.f2339b;
    }
}
