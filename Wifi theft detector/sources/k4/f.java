package k4;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class f extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f21842a;

    public f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f21842a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f21842a.set(imageView.getImageMatrix());
        return this.f21842a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
