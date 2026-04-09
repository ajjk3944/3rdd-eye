package th;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import bl.z;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends t0 implements ql.d {

    /* renamed from: i, reason: collision with root package name */
    public final z f34617i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f34618k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f34619l = new ArrayList();

    public h(z zVar) {
        this.f34617i = zVar;
    }

    public static SpannableString c(Context context, String str, oh.a aVar) {
        SpannableString spannableString = new SpannableString(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.md_red_700));
        int i4 = aVar.f30546a;
        int i10 = aVar.f30547b + i4;
        spannableString.setSpan(foregroundColorSpan, i4, i10, 33);
        spannableString.setSpan(new StyleSpan(1), i4, i10, 33);
        return spannableString;
    }

    @Override // ql.d
    public final String a(int i4, View view) {
        nk.k.e(view, "v");
        gg.a aVarB = b(i4);
        if (aVarB == null) {
            return "";
        }
        String str = aVarB.f24702b;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strU0 = vk.i.U0(1, str);
        Locale locale = Locale.getDefault();
        nk.k.d(locale, "getDefault(...)");
        String upperCase = strU0.toUpperCase(locale);
        nk.k.d(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public final gg.a b(int i4) {
        if (i4 < 0) {
            return null;
        }
        if (this.j) {
            ArrayList arrayList = this.f34619l;
            if (i4 >= arrayList.size()) {
                return null;
            }
            return ((oh.a) arrayList.get(i4)).f30548c;
        }
        ArrayList arrayList2 = this.f34618k;
        if (i4 >= arrayList2.size()) {
            return null;
        }
        return (gg.a) arrayList2.get(i4);
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        return (this.j ? this.f34619l : this.f34618k).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    @Override // androidx.recyclerview.widget.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.x1 r22, int r23) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.h.onBindViewHolder(androidx.recyclerview.widget.x1, int):void");
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        nk.k.e(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_installed_app, viewGroup, false);
        int i10 = R.id.flutter;
        ImageView imageView = (ImageView) wb.e.s(R.id.flutter, viewInflate);
        if (imageView != null) {
            i10 = R.id.icon;
            ImageView imageView2 = (ImageView) wb.e.s(R.id.icon, viewInflate);
            if (imageView2 != null) {
                i10 = R.id.iv_menu;
                ImageView imageView3 = (ImageView) wb.e.s(R.id.iv_menu, viewInflate);
                if (imageView3 != null) {
                    i10 = R.id.name;
                    TextView textView = (TextView) wb.e.s(R.id.name, viewInflate);
                    if (textView != null) {
                        i10 = R.id.native_lib;
                        TextView textView2 = (TextView) wb.e.s(R.id.native_lib, viewInflate);
                        if (textView2 != null) {
                            i10 = R.id.pkg_name;
                            TextView textView3 = (TextView) wb.e.s(R.id.pkg_name, viewInflate);
                            if (textView3 != null) {
                                i10 = R.id.reactnative;
                                ImageView imageView4 = (ImageView) wb.e.s(R.id.reactnative, viewInflate);
                                if (imageView4 != null) {
                                    i10 = R.id.risk_content;
                                    TextView textView4 = (TextView) wb.e.s(R.id.risk_content, viewInflate);
                                    if (textView4 != null) {
                                        i10 = R.id.tag_disabled;
                                        TextView textView5 = (TextView) wb.e.s(R.id.tag_disabled, viewInflate);
                                        if (textView5 != null) {
                                            i10 = R.id.tags_container;
                                            if (((LinearLayout) wb.e.s(R.id.tags_container, viewInflate)) != null) {
                                                i10 = R.id.target_api;
                                                TextView textView6 = (TextView) wb.e.s(R.id.target_api, viewInflate);
                                                if (textView6 != null) {
                                                    i10 = R.id.unity;
                                                    ImageView imageView5 = (ImageView) wb.e.s(R.id.unity, viewInflate);
                                                    if (imageView5 != null) {
                                                        i10 = R.id.unreal;
                                                        ImageView imageView6 = (ImageView) wb.e.s(R.id.unreal, viewInflate);
                                                        if (imageView6 != null) {
                                                            i10 = R.id.version;
                                                            TextView textView7 = (TextView) wb.e.s(R.id.version, viewInflate);
                                                            if (textView7 != null) {
                                                                return new g(this, new qg.d((FrameLayout) viewInflate, imageView, imageView2, imageView3, textView, textView2, textView3, imageView4, textView4, textView5, textView6, imageView5, imageView6, textView7));
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
