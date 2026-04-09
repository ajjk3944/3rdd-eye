package z4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3024a implements O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24478a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialButton f24479b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f24480c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialButton f24481d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f24482e;

    public C3024a(LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, AppCompatImageView appCompatImageView) {
        this.f24482e = linearLayoutCompat;
        this.f24479b = materialButton;
        this.f24480c = materialButton2;
        this.f24481d = materialButton3;
    }

    @Override // O0.a
    public final View getRoot() {
        switch (this.f24478a) {
            case 0:
                return (LinearLayout) this.f24482e;
            default:
                return (LinearLayoutCompat) this.f24482e;
        }
    }

    public C3024a(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, MaterialButton materialButton3, TextView textView2) {
        this.f24482e = linearLayout;
        this.f24479b = materialButton;
        this.f24480c = materialButton2;
        this.f24481d = materialButton3;
    }
}
