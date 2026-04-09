package j5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.z0;
import j4.l;

/* loaded from: classes2.dex */
public class c extends View {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f21754a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f21755b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21756c;

    public c(Context context) {
        this(context, null);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z0 z0VarU = z0.u(context, attributeSet, l.TabItem);
        this.f21754a = z0VarU.p(l.TabItem_android_text);
        this.f21755b = z0VarU.g(l.TabItem_android_icon);
        this.f21756c = z0VarU.n(l.TabItem_android_layout, 0);
        z0VarU.x();
    }
}
