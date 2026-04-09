package sk;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends x7.a {
    public static ObjectAnimator A;

    /* renamed from: t, reason: collision with root package name */
    public static ObjectAnimator f22075t;

    /* renamed from: u, reason: collision with root package name */
    public static ObjectAnimator f22076u;

    /* renamed from: v, reason: collision with root package name */
    public static ObjectAnimator f22077v;

    /* renamed from: w, reason: collision with root package name */
    public static ObjectAnimator f22078w;

    /* renamed from: x, reason: collision with root package name */
    public static ObjectAnimator f22079x;

    /* renamed from: y, reason: collision with root package name */
    public static ObjectAnimator f22080y;

    /* renamed from: z, reason: collision with root package name */
    public static ObjectAnimator f22081z;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22082b;

    /* renamed from: c, reason: collision with root package name */
    public final com.staircase3.opensignal.utils.a f22083c;

    /* renamed from: d, reason: collision with root package name */
    public final List f22084d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22085e;

    /* renamed from: f, reason: collision with root package name */
    public c f22086f;

    /* renamed from: g, reason: collision with root package name */
    public c f22087g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f22088h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f22089i;
    public ImageView j;
    public ImageView k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22090l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22091m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22092n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22093o = false;

    /* renamed from: p, reason: collision with root package name */
    public final e f22094p = new e(this, 0);

    /* renamed from: q, reason: collision with root package name */
    public final e f22095q = new e(this, 1);

    /* renamed from: r, reason: collision with root package name */
    public final e f22096r = new e(this, 2);

    /* renamed from: s, reason: collision with root package name */
    public final e f22097s = new e(this, 3);

    public h(Context context, com.staircase3.opensignal.utils.a aVar, ArrayList arrayList, String str) {
        this.f22082b = context;
        this.f22083c = aVar;
        this.f22084d = arrayList;
        this.f22085e = str;
    }

    public static void i(h hVar, g gVar, f fVar) {
        String str;
        List list = hVar.f22084d;
        int i10 = d.f22071a[gVar.ordinal()];
        if (i10 == 1) {
            k(hVar.f22089i, hVar.j, hVar.k);
            if (hVar.f22090l) {
                if (list != null) {
                    Collections.sort(list, new dv.h(25));
                    hVar.l();
                }
                hVar.m(f.ASCENDING);
            } else {
                if (list != null) {
                    Collections.sort(list, new dv.h(26));
                    hVar.l();
                }
                hVar.m(f.DESCENDING);
            }
            hVar.f22090l = !hVar.f22090l;
            str = "clicked_sort_download";
        } else if (i10 == 2) {
            k(hVar.f22088h, hVar.j, hVar.k);
            if (hVar.f22091m) {
                if (list != null) {
                    Collections.sort(list, new dv.h(27));
                    hVar.l();
                }
                hVar.p(f.ASCENDING);
            } else {
                if (list != null) {
                    Collections.sort(list, new dv.h(28));
                    hVar.l();
                }
                hVar.p(f.DESCENDING);
            }
            hVar.f22091m = !hVar.f22091m;
            str = "clicked_sort_upload";
        } else if (i10 == 3) {
            k(hVar.f22088h, hVar.f22089i, hVar.k);
            if (hVar.f22092n) {
                if (list != null) {
                    Collections.sort(list, new dv.h(29));
                    hVar.l();
                }
                hVar.n(f.ASCENDING);
            } else {
                if (list != null) {
                    Collections.sort(list, new dv.h(22));
                    hVar.l();
                }
                hVar.n(f.DESCENDING);
            }
            hVar.f22092n = !hVar.f22092n;
            str = "clicked_sort_latency";
        } else if (i10 != 4) {
            str = "";
        } else {
            k(hVar.f22088h, hVar.f22089i, hVar.j);
            if (hVar.f22093o) {
                if (list != null) {
                    Collections.sort(list, new dv.h(23));
                    hVar.l();
                }
                hVar.o(f.ASCENDING);
            } else {
                if (list != null) {
                    Collections.sort(list, new dv.h(24));
                    hVar.l();
                }
                hVar.o(f.DESCENDING);
            }
            hVar.f22093o = !hVar.f22093o;
            str = "clicked_sort_signal_bars";
        }
        hVar.f22083c.c("network_stats_dialog", str, fVar == f.DESCENDING ? "ascending" : "descending");
    }

    public static void j(ImageView imageView, ObjectAnimator objectAnimator) {
        if (imageView != null) {
            imageView.setBackgroundResource(qk.f.ic_arrow_down);
            if (objectAnimator != null) {
                objectAnimator.start();
            }
        }
    }

    public static void k(ImageView... imageViewArr) {
        for (ImageView imageView : imageViewArr) {
            if (imageView != null) {
                imageView.setBackgroundResource(0);
            }
        }
    }

    @Override // x7.a
    public final void a(ViewPager viewPager, Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // x7.a
    public final int c() {
        return cl.a.values().length;
    }

    @Override // x7.a
    public final String d(int i10) {
        return this.f22082b.getString(cl.a.values()[i10].getLayoutResId());
    }

    @Override // x7.a
    public final Object e(ViewPager viewPager, int i10) {
        cl.a aVar = (cl.a) ((sq.b) cl.a.getEntries()).get(i10);
        Context context = this.f22082b;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(aVar.getLayoutResId(), (ViewGroup) viewPager, false);
        viewPager.addView(viewGroup);
        TextView textView = (TextView) viewGroup.findViewById(qk.h.tvSelectedNetworkTypes);
        String str = this.f22085e;
        textView.setText(str);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(qk.h.llFilterHeader);
        if (str.contains("2G") && str.contains("3G") && str.contains("4G")) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        ListView listView = (ListView) viewPager.findViewById(qk.h.lvNetworkRankPage1);
        List list = this.f22084d;
        if (listView != null) {
            c cVar = new c(context, qk.i.network_rank_page1_row, list, 0);
            this.f22086f = cVar;
            if (list == null) {
                cVar = null;
            }
            listView.setAdapter((ListAdapter) cVar);
            RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(qk.h.rlDownload);
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(this.f22094p);
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(qk.h.rlUpload);
            if (relativeLayout2 != null) {
                relativeLayout2.setOnClickListener(this.f22095q);
            }
            if (viewGroup.findViewById(qk.h.ivSortArrowDownload) != null) {
                ImageView imageView = (ImageView) viewGroup.findViewById(qk.h.ivSortArrowDownload);
                this.f22088h = imageView;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 180.0f);
                f22075t = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                f22075t.setDuration(1000L);
                f22075t.start();
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f22088h, "rotation", 180.0f, 0.0f);
                f22076u = objectAnimatorOfFloat2;
                objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
                f22076u.setDuration(1000L);
                f22076u.start();
            }
            if (viewGroup.findViewById(qk.h.ivSortArrowUpload) != null) {
                ImageView imageView2 = (ImageView) viewGroup.findViewById(qk.h.ivSortArrowUpload);
                this.f22089i = imageView2;
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView2, "rotation", 180.0f, 0.0f);
                f22077v = objectAnimatorOfFloat3;
                objectAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator());
                f22077v.setDuration(1000L);
                f22077v.start();
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f22089i, "rotation", 0.0f, 180.0f);
                f22078w = objectAnimatorOfFloat4;
                objectAnimatorOfFloat4.setInterpolator(new DecelerateInterpolator());
                f22078w.setDuration(1000L);
                f22078w.start();
            }
        }
        ListView listView2 = (ListView) viewPager.findViewById(qk.h.lvNetworkRankPage2);
        if (listView2 != null) {
            c cVar2 = new c(context, qk.i.network_rank_page2_row, list, 1);
            this.f22087g = cVar2;
            listView2.setAdapter((ListAdapter) (list != null ? cVar2 : null));
            RelativeLayout relativeLayout3 = (RelativeLayout) viewGroup.findViewById(qk.h.rlLatency);
            if (relativeLayout3 != null) {
                relativeLayout3.setOnClickListener(this.f22096r);
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) viewGroup.findViewById(qk.h.rlSignalBars);
            if (relativeLayout4 != null) {
                relativeLayout4.setOnClickListener(this.f22097s);
            }
            if (viewGroup.findViewById(qk.h.ivSortArrowLatency) != null) {
                ImageView imageView3 = (ImageView) viewGroup.findViewById(qk.h.ivSortArrowLatency);
                this.j = imageView3;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView3, "rotation", 0.0f, 180.0f);
                f22079x = objectAnimatorOfFloat5;
                objectAnimatorOfFloat5.setInterpolator(new DecelerateInterpolator());
                f22079x.setDuration(1000L);
                f22079x.start();
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.j, "rotation", 180.0f, 0.0f);
                f22080y = objectAnimatorOfFloat6;
                objectAnimatorOfFloat6.setInterpolator(new DecelerateInterpolator());
                f22080y.setDuration(1000L);
                f22080y.start();
            }
            if (viewGroup.findViewById(qk.h.ivSortArrowSignalBars) != null) {
                ImageView imageView4 = (ImageView) viewGroup.findViewById(qk.h.ivSortArrowSignalBars);
                this.k = imageView4;
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(imageView4, "rotation", 180.0f, 0.0f);
                f22081z = objectAnimatorOfFloat7;
                objectAnimatorOfFloat7.setInterpolator(new DecelerateInterpolator());
                f22081z.setDuration(1000L);
                f22081z.start();
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.k, "rotation", 0.0f, 180.0f);
                A = objectAnimatorOfFloat8;
                objectAnimatorOfFloat8.setInterpolator(new DecelerateInterpolator());
                A.setDuration(1000L);
                A.start();
            }
        }
        return viewGroup;
    }

    @Override // x7.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }

    public final void l() {
        this.f22086f.notifyDataSetChanged();
        this.f22087g.notifyDataSetChanged();
    }

    public final void m(f fVar) {
        if (this.f22084d == null) {
            return;
        }
        int i10 = d.f22072b[fVar.ordinal()];
        if (i10 == 1) {
            j(this.f22088h, f22075t);
        } else if (i10 == 2) {
            j(this.f22088h, f22076u);
        } else {
            if (i10 != 3) {
                return;
            }
            k(this.f22088h);
        }
    }

    public final void n(f fVar) {
        if (this.f22084d == null) {
            return;
        }
        int i10 = d.f22072b[fVar.ordinal()];
        if (i10 == 1) {
            j(this.j, f22079x);
        } else if (i10 == 2) {
            j(this.j, f22080y);
        } else {
            if (i10 != 3) {
                return;
            }
            k(this.j);
        }
    }

    public final void o(f fVar) {
        if (this.f22084d == null) {
            return;
        }
        int i10 = d.f22072b[fVar.ordinal()];
        if (i10 == 1) {
            j(this.k, f22081z);
        } else if (i10 == 2) {
            j(this.k, A);
        } else {
            if (i10 != 3) {
                return;
            }
            k(this.k);
        }
    }

    public final void p(f fVar) {
        if (this.f22084d == null) {
            return;
        }
        int i10 = d.f22072b[fVar.ordinal()];
        if (i10 == 1) {
            j(this.f22089i, f22077v);
        } else if (i10 == 2) {
            j(this.f22089i, f22078w);
        } else {
            if (i10 != 3) {
                return;
            }
            k(this.f22089i);
        }
    }
}
