package o;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f22441a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f22442b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f22443c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f22444d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f22445e;

    public U0(View view) {
        this.f22441a = (TextView) view.findViewById(R.id.text1);
        this.f22442b = (TextView) view.findViewById(R.id.text2);
        this.f22443c = (ImageView) view.findViewById(R.id.icon1);
        this.f22444d = (ImageView) view.findViewById(R.id.icon2);
        this.f22445e = (ImageView) view.findViewById(com.apm.insight.R.id.edit_query);
    }
}
