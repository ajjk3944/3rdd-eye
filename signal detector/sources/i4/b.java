package i4;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.lefan.signal.MainActivity;
import e.InterfaceC2285b;
import java.util.ArrayDeque;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements p, InterfaceC2285b, H1.i, c3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20587a;

    public /* synthetic */ b(int i) {
        this.f20587a = i;
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        int i = MainActivity.f18804V;
    }

    @Override // i4.p
    public Object d() {
        switch (this.f20587a) {
            case 0:
                return new TreeSet();
            case 1:
                return new ArrayDeque();
            default:
                return new o(true);
        }
    }

    @Override // c3.b
    public void e(c3.j jVar) {
        q5.i.e(jVar, "it");
        if (jVar.e()) {
            com.bumptech.glide.e.f6495a = jVar;
        }
    }

    @Override // H1.i
    public Object get() {
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }
}
