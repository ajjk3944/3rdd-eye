package mm;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import br.l;
import com.staircase3.opensignal.utils.o;
import h7.n1;

/* loaded from: classes.dex */
public final class c extends n1 {
    public final TextView A;
    public final TextView B;

    /* renamed from: u, reason: collision with root package name */
    public final of.b f16876u;

    /* renamed from: v, reason: collision with root package name */
    public final o f16877v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f16878w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f16879x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f16880y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f16881z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(of.b bVar, o oVar) {
        super((ConstraintLayout) bVar.f19421a);
        l.e(bVar, "itemBinding");
        l.e(oVar, "networkTypeUtils");
        this.f16876u = bVar;
        this.f16877v = oVar;
        TextView textView = (TextView) bVar.f19425x;
        l.d(textView, "networkInformationTextVideo");
        this.f16878w = textView;
        TextView textView2 = (TextView) bVar.f19423g;
        l.d(textView2, "elapsedTimeTextVideo");
        this.f16879x = textView2;
        TextView textView3 = (TextView) bVar.f19424r;
        l.d(textView3, "loadTimeValue");
        this.f16880y = textView3;
        TextView textView4 = (TextView) bVar.f19422d;
        l.d(textView4, "bufferTimeValue");
        this.f16881z = textView4;
        TextView textView5 = (TextView) bVar.f19426y;
        l.d(textView5, "smoothPlaybackValue");
        this.A = textView5;
        TextView textView6 = (TextView) bVar.B;
        l.d(textView6, "videoResolution");
        this.B = textView6;
    }
}
