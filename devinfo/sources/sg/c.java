package sg;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.diskpartition.DiskPartitionActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import nk.k;
import p.r3;
import vk.i;
import zj.n;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f33602i = n.s0(s.f38317a);
    public String j = "";

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DiskPartitionActivity f33603k;

    public c(DiskPartitionActivity diskPartitionActivity) {
        this.f33603k = diskPartitionActivity;
    }

    public final CharSequence b(int i4, String str) {
        int iC0;
        if (i.H0(this.j) || (iC0 = i.C0(str, this.j, i4, true)) < 0) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(this.f33603k.getColor(R.color.md_red_700)), iC0, this.j.length() + iC0, 33);
        spannableString.setSpan(new StyleSpan(1), iC0, this.j.length() + iC0, 33);
        return spannableString;
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        return this.f33602i.size();
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) {
        String str;
        d dVar = (d) x1Var;
        k.e(dVar, "holder");
        r3 r3Var = dVar.f33604c;
        if (i4 == -1) {
            return;
        }
        g gVar = (g) this.f33602i.get(i4);
        TextView textView = (TextView) r3Var.f30848e;
        TextView textView2 = (TextView) r3Var.g;
        String str2 = gVar.f33612a;
        vg.c cVar = gVar.f33615d;
        textView.setText(b(0, str2));
        ((TextView) r3Var.f30847d).setText(b(0, gVar.f33613b));
        ((TextView) r3Var.f30846c).setText(b(4, "fs: " + gVar.f33614c));
        textView2.setVisibility(cVar != null ? 0 : 8);
        if (cVar != null) {
            String str3 = cVar.f36222b > 500.0d ? String.format(Locale.getDefault(), "%.2fG", Arrays.copyOf(new Object[]{Double.valueOf(cVar.f36222b / 1024.0f)}, 1)) : String.format(Locale.getDefault(), "%.3fM", Arrays.copyOf(new Object[]{Double.valueOf(cVar.f36222b)}, 1));
            textView2.setText((cVar.f36224d > 500.0d ? String.format(Locale.getDefault(), "%.2fG", Arrays.copyOf(new Object[]{Double.valueOf(cVar.f36224d / 1024.0f)}, 1)) : String.format(Locale.getDefault(), "%.3fM", Arrays.copyOf(new Object[]{Double.valueOf(cVar.f36224d)}, 1))) + "/" + str3);
        } else {
            textView2.setText("");
        }
        Integer numValueOf = cVar != null ? Integer.valueOf((int) cVar.f36225e) : null;
        TextView textView3 = (TextView) r3Var.f30849f;
        if (numValueOf == null) {
            str = "N/A";
        } else {
            str = numValueOf + "%";
        }
        textView3.setText(str);
        ((ProgressBar) r3Var.f30845b).setProgress(numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        k.e(viewGroup, "parent");
        View viewInflate = this.f33603k.getLayoutInflater().inflate(R.layout.item_disk_partition, viewGroup, false);
        int i10 = R.id.filesystem;
        TextView textView = (TextView) wb.e.s(R.id.filesystem, viewInflate);
        if (textView != null) {
            i10 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) wb.e.s(R.id.progress, viewInflate);
            if (progressBar != null) {
                i10 = R.id.tv_part;
                TextView textView2 = (TextView) wb.e.s(R.id.tv_part, viewInflate);
                if (textView2 != null) {
                    i10 = R.id.tv_path;
                    TextView textView3 = (TextView) wb.e.s(R.id.tv_path, viewInflate);
                    if (textView3 != null) {
                        i10 = R.id.tv_percent;
                        TextView textView4 = (TextView) wb.e.s(R.id.tv_percent, viewInflate);
                        if (textView4 != null) {
                            i10 = R.id.tv_stat;
                            TextView textView5 = (TextView) wb.e.s(R.id.tv_stat, viewInflate);
                            if (textView5 != null) {
                                return new d(new r3((LinearLayout) viewInflate, textView, progressBar, textView2, textView3, textView4, textView5));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
