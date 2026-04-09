package n8;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import br.l;

/* loaded from: classes.dex */
public class b extends a {
    private final ImageView view;

    public b(ImageView imageView) {
        this.view = imageView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l.a(getView(), ((b) obj).getView());
    }

    @Override // n8.a
    public Drawable getDrawable() {
        return getView().getDrawable();
    }

    public int hashCode() {
        return getView().hashCode();
    }

    @Override // n8.a
    public void setDrawable(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    @Override // n8.a
    public ImageView getView() {
        return this.view;
    }
}
