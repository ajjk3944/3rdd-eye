package n1;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceViewHolder.java */
/* loaded from: classes.dex */
public final class h extends RecyclerView.F {

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f44228l;

    /* renamed from: m, reason: collision with root package name */
    public final ColorStateList f44229m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray<View> f44230n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f44231o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f44232p;

    public h(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f44230n = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.icon_frame, view.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f44228l = view.getBackground();
        if (textView != null) {
            this.f44229m = textView.getTextColors();
        }
    }

    public final View a(int i) {
        SparseArray<View> sparseArray = this.f44230n;
        View view = sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
