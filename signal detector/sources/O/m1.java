package o;

import Y2.C0200b;
import Y2.C0204f;
import Y2.C0209k;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lefan.signal.ui.wifi.WifiSignalView;
import com.lefan.signal.view.DiagnosisLevelView;

/* loaded from: classes.dex */
public final class m1 implements O0.a, Y2.N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22581a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22582b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22583c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22584d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f22585e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f22586f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f22587g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f22588h;

    public /* synthetic */ m1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f22581a = i;
        this.f22583c = obj;
        this.f22584d = obj2;
        this.f22582b = obj3;
        this.f22585e = obj4;
        this.f22586f = obj5;
        this.f22587g = obj6;
        this.f22588h = obj7;
    }

    @Override // Y2.O
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0200b a() {
        Application application = (Application) ((A0.e) this.f22583c).f73b;
        Handler handler = Y2.z.f4385a;
        Y2.A.c(handler);
        Y2.y yVar = Y2.z.f4386b;
        Y2.A.c(yVar);
        return new C0200b(application, handler, yVar, (C0204f) ((Y2.O) this.f22582b).a(), (C0209k) ((Y2.O) this.f22585e).a(), ((Y2.U) this.f22586f).b(), ((V2.e) this.f22587g).A(), (Y2.P) ((Y2.O) this.f22588h).a(), 3);
    }

    @Override // O0.a
    public View getRoot() {
        switch (this.f22581a) {
            case 1:
                return (LinearLayout) this.f22583c;
            case 2:
                return (LinearLayout) this.f22583c;
            case 3:
                return (LinearLayout) this.f22583c;
            default:
                return (ConstraintLayout) this.f22583c;
        }
    }

    public m1(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, WifiSignalView wifiSignalView, MaterialButton materialButton, MaterialButton materialButton2, AppCompatTextView appCompatTextView) {
        this.f22581a = 1;
        this.f22583c = linearLayout;
        this.f22582b = textView;
        this.f22584d = textView2;
        this.f22585e = wifiSignalView;
        this.f22586f = materialButton;
        this.f22587g = materialButton2;
        this.f22588h = appCompatTextView;
    }

    public m1(LinearLayout linearLayout, LinearProgressIndicator linearProgressIndicator, MaterialButton materialButton, MaterialButton materialButton2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, TextView textView, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        this.f22581a = 3;
        this.f22583c = linearLayout;
        this.f22584d = linearProgressIndicator;
        this.f22585e = materialButton;
        this.f22586f = materialButton2;
        this.f22582b = textView;
        this.f22587g = textInputEditText;
        this.f22588h = textInputLayout;
    }

    public m1(Context context) {
        this.f22581a = 0;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f22585e = layoutParams;
        this.f22586f = new Rect();
        this.f22587g = new int[2];
        this.f22588h = new int[2];
        this.f22583c = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f22584d = viewInflate;
        this.f22582b = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(m1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = BackupConstant.SCENE_BACKUP_RENDER_FAIL;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public m1(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, AppCompatTextView appCompatTextView, RecyclerView recyclerView, TextView textView, DiagnosisLevelView diagnosisLevelView, TextView textView2, WifiSignalView wifiSignalView) {
        this.f22581a = 2;
        this.f22583c = linearLayout;
        this.f22584d = materialButton;
        this.f22585e = materialButton2;
        this.f22586f = appCompatTextView;
        this.f22587g = recyclerView;
        this.f22582b = textView;
        this.f22588h = diagnosisLevelView;
    }

    public m1(q1.d dVar, q1.d dVar2, q1.d dVar3, q1.d dVar4, n1.l lVar, n1.l lVar2) {
        this.f22581a = 5;
        this.f22588h = I1.c.a(150, new d4.h(9, this));
        this.f22583c = dVar;
        this.f22584d = dVar2;
        this.f22582b = dVar3;
        this.f22585e = dVar4;
        this.f22586f = lVar;
        this.f22587g = lVar2;
    }
}
