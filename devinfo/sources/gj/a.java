package gj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.liuzh.deviceinfo.R;
import com.liuzho.lib.ui.CardRecyclerView;
import nj.b;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final CardView f24742a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f24743b;

    /* renamed from: c, reason: collision with root package name */
    public final View f24744c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f24745d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f24746e;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f24747f;
    public final ProgressBar g;

    /* renamed from: h, reason: collision with root package name */
    public final CardRecyclerView f24748h;

    /* renamed from: i, reason: collision with root package name */
    public final FrameLayout f24749i;
    public final TextView j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f24750k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f24751l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f24752m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f24753n;

    public a(b bVar, CardView cardView, LinearLayout linearLayout, View view, FrameLayout frameLayout, ImageView imageView, ConstraintLayout constraintLayout, ProgressBar progressBar, CardRecyclerView cardRecyclerView, FrameLayout frameLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f24742a = cardView;
        this.f24743b = linearLayout;
        this.f24744c = view;
        this.f24745d = frameLayout;
        this.f24746e = imageView;
        this.f24747f = constraintLayout;
        this.g = progressBar;
        this.f24748h = cardRecyclerView;
        this.f24749i = frameLayout2;
        this.j = textView;
        this.f24750k = textView2;
        this.f24751l = textView3;
        this.f24752m = textView4;
        this.f24753n = textView5;
    }

    public static a a(b bVar) {
        int i4 = R.id.analyze_item;
        CardView cardView = (CardView) e.s(R.id.analyze_item, bVar);
        if (cardView != null) {
            i4 = R.id.buttons_container;
            LinearLayout linearLayout = (LinearLayout) e.s(R.id.buttons_container, bVar);
            if (linearLayout != null) {
                i4 = R.id.buttons_divider;
                View viewS = e.s(R.id.buttons_divider, bVar);
                if (viewS != null) {
                    i4 = R.id.clear_btn;
                    FrameLayout frameLayout = (FrameLayout) e.s(R.id.clear_btn, bVar);
                    if (frameLayout != null) {
                        i4 = R.id.empty_file;
                        ImageView imageView = (ImageView) e.s(R.id.empty_file, bVar);
                        if (imageView != null) {
                            i4 = R.id.head_icon;
                            if (((ImageView) e.s(R.id.head_icon, bVar)) != null) {
                                i4 = R.id.list_data_area;
                                ConstraintLayout constraintLayout = (ConstraintLayout) e.s(R.id.list_data_area, bVar);
                                if (constraintLayout != null) {
                                    i4 = R.id.progress;
                                    ProgressBar progressBar = (ProgressBar) e.s(R.id.progress, bVar);
                                    if (progressBar != null) {
                                        i4 = R.id.recyclerview;
                                        CardRecyclerView cardRecyclerView = (CardRecyclerView) e.s(R.id.recyclerview, bVar);
                                        if (cardRecyclerView != null) {
                                            i4 = R.id.sort_btn;
                                            FrameLayout frameLayout2 = (FrameLayout) e.s(R.id.sort_btn, bVar);
                                            if (frameLayout2 != null) {
                                                i4 = R.id.tv_size;
                                                TextView textView = (TextView) e.s(R.id.tv_size, bVar);
                                                if (textView != null) {
                                                    i4 = R.id.tv_summary;
                                                    TextView textView2 = (TextView) e.s(R.id.tv_summary, bVar);
                                                    if (textView2 != null) {
                                                        i4 = R.id.tv_title;
                                                        TextView textView3 = (TextView) e.s(R.id.tv_title, bVar);
                                                        if (textView3 != null) {
                                                            i4 = R.id.txt_delete;
                                                            TextView textView4 = (TextView) e.s(R.id.txt_delete, bVar);
                                                            if (textView4 != null) {
                                                                i4 = R.id.txt_sort;
                                                                TextView textView5 = (TextView) e.s(R.id.txt_sort, bVar);
                                                                if (textView5 != null) {
                                                                    return new a(bVar, cardView, linearLayout, viewS, frameLayout, imageView, constraintLayout, progressBar, cardRecyclerView, frameLayout2, textView, textView2, textView3, textView4, textView5);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(bVar.getResources().getResourceName(i4)));
    }
}
