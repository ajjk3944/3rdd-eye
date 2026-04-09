package K4;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class m implements O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2341a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f2342b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f2343c;

    /* renamed from: d, reason: collision with root package name */
    public final SwitchCompat f2344d;

    public m(LinearLayout linearLayout, RecyclerView recyclerView, MaterialButton materialButton, SwitchCompat switchCompat) {
        this.f2342b = linearLayout;
        this.f2343c = materialButton;
        this.f2344d = switchCompat;
    }

    @Override // O0.a
    public final View getRoot() {
        switch (this.f2341a) {
        }
        return this.f2342b;
    }

    public m(LinearLayout linearLayout, MaterialButton materialButton, RecyclerView recyclerView, SwitchCompat switchCompat) {
        this.f2342b = linearLayout;
        this.f2343c = materialButton;
        this.f2344d = switchCompat;
    }
}
