package th;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.y;
import com.liuzho.lib.appinfo.AppInfoActivity;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends x1 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final qg.d f34615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f34616d;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(h hVar, qg.d dVar) {
        ImageView imageView = (ImageView) dVar.f32340k;
        this.f34616d = hVar;
        FrameLayout frameLayout = (FrameLayout) dVar.f32338h;
        super(frameLayout);
        this.f34615c = dVar;
        if (com.liuzh.deviceinfo.utilities.d.k()) {
            imageView.setVisibility(8);
            y.j(1.02f, frameLayout);
        }
        ArrayList arrayList = zh.i.f38298a;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iA = com.liuzh.deviceinfo.utilities.f.a();
        iA = iA == this.itemView.getContext().getColor(R.color.colorAccent) ? cm.g.H(this.itemView.getContext().getColor(R.color.colorPrimary), 0.85f) : iA;
        b(iA, dVar.f32337f);
        b(iA, dVar.f32333b);
        b(iA, dVar.f32336e);
        frameLayout.setOnClickListener(this);
        frameLayout.setOnLongClickListener(this);
        imageView.setOnClickListener(this);
    }

    public static void b(int i4, View view) {
        Drawable background = view.getBackground();
        nk.k.d(background, "getBackground(...)");
        Drawable drawableM = wb.e.M(background, i4);
        drawableM.setAlpha(60);
        view.setBackground(drawableM);
    }

    public final void a(Context context, gg.a aVar) throws Resources.NotFoundException {
        String[] stringArray = context.getResources().getStringArray(R.array.app_op);
        nk.k.d(stringArray, "getStringArray(...)");
        if (!mg.d.f29373b) {
            Object[] objArrCopyOf = Arrays.copyOf(stringArray, stringArray.length - 1);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            stringArray = (String[]) objArrCopyOf;
        }
        t7.m mVar = new t7.m(context);
        qh.h hVar = new qh.h(2, this.f34616d, aVar);
        i.b bVar = (i.b) mVar.f34474c;
        bVar.f25244q = stringArray;
        bVar.f25246s = hVar;
        mVar.A();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        nk.k.e(view, "v");
        gg.a aVarB = this.f34616d.b(getBindingAdapterPosition());
        if (aVarB == null) {
            return;
        }
        qg.d dVar = this.f34615c;
        if (view.equals((FrameLayout) dVar.f32338h)) {
            AppInfoActivity.B(view.getContext(), -1, aVarB.f24701a);
        } else if (view == ((ImageView) dVar.f32340k)) {
            Context context = ((ImageView) view).getContext();
            nk.k.d(context, "getContext(...)");
            a(context, aVarB);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        nk.k.e(view, "v");
        gg.a aVarB = this.f34616d.b(getBindingAdapterPosition());
        if (aVarB == null) {
            return false;
        }
        Context context = view.getContext();
        nk.k.d(context, "getContext(...)");
        a(context, aVarB);
        return true;
    }
}
