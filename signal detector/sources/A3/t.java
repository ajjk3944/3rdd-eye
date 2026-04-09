package A3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class t extends FrameLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f497a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f498b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f499c;

    /* renamed from: d, reason: collision with root package name */
    public n.m f500d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f501e;

    public t(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f497a = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    @Override // n.x
    public final void a(n.m mVar) {
        this.f500d = mVar;
        mVar.setCheckable(false);
        this.f497a.setText(mVar.f22110e);
        b();
    }

    public final void b() {
        n.m mVar = this.f500d;
        if (mVar != null) {
            setVisibility((!mVar.isVisible() || (!this.f498b && this.f499c)) ? 8 : 0);
        }
    }

    @Override // n.x
    public n.m getItemData() {
        return this.f500d;
    }

    @Override // A3.n
    public void setExpanded(boolean z6) {
        this.f498b = z6;
        b();
    }

    @Override // A3.n
    public void setOnlyShowWhenExpanded(boolean z6) {
        this.f499c = z6;
        b();
    }

    public void setTextAppearance(int i) {
        TextView textView = this.f497a;
        textView.setTextAppearance(i);
        ColorStateList colorStateList = this.f501e;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f501e = colorStateList;
        if (colorStateList != null) {
            this.f497a.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
