package B8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ubnt.usurvey.R;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c implements a {
    @Override // B8.a
    public Bitmap a(Context context, b params) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(params, "params");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.floorplan_share, (ViewGroup) null);
        AbstractC6492s.h(viewInflate, "inflate(...)");
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(params.d(), params.b()));
        ((ImageView) viewInflate.findViewById(R.id.floorplan_share_icon)).setImageResource(params.c().b());
        ((TextView) viewInflate.findViewById(R.id.floorplan_share_title)).setText(params.c().c().a(context));
        ((TextView) viewInflate.findViewById(R.id.floorplan_share_title_footer)).setText(params.c().a().a(context));
        ((ImageView) viewInflate.findViewById(R.id.floorplan_share_floorplan_bitmap)).setImageBitmap(params.a());
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(params.d(), 1073741824), View.MeasureSpec.makeMeasureSpec(params.b(), 1073741824));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(params.d(), params.b(), Bitmap.Config.ARGB_8888);
        AbstractC6492s.h(bitmapCreateBitmap, "createBitmap(...)");
        viewInflate.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
