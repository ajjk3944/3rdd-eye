package y2;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.ImagePagerActivity;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: SlidingImageAdapter.java */
/* renamed from: y2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5803e extends androidx.viewpager.widget.a {

    /* renamed from: a, reason: collision with root package name */
    public final ImagePagerActivity f48028a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f48029b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f48030c;

    public C5803e(ImagePagerActivity imagePagerActivity, ArrayList arrayList) {
        this.f48028a = imagePagerActivity;
        this.f48029b = arrayList;
        this.f48030c = LayoutInflater.from(imagePagerActivity);
    }

    @Override // androidx.viewpager.widget.a
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public final int getCount() {
        return this.f48029b.size();
    }

    @Override // androidx.viewpager.widget.a
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewInflate = this.f48030c.inflate(R.layout.sliding_images_layout, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.date);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.time);
        ArrayList arrayList = this.f48029b;
        long jLastModified = ((File) arrayList.get(i)).lastModified();
        String string = DateFormat.format("dd/MM/yyyy", new Date(jLastModified)).toString();
        String string2 = DateFormat.format("hh:mm aa", new Date(jLastModified)).toString();
        textView.setText(string);
        textView2.setText(string2);
        l lVarD = com.bumptech.glide.b.d(this.f48028a);
        File file = (File) arrayList.get(i);
        lVarD.getClass();
        new k(lVarD.f22280b, lVarD, Drawable.class, lVarD.f22281c).x(file).v(imageView);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.a
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }
}
