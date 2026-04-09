package g7;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import r7.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends Paint {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24546a;

    @Override // android.graphics.Paint
    public void setAlpha(int i4) {
        switch (this.f24546a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(h.c(i4));
                    break;
                } else {
                    setColor((h.c(i4) << 24) | (getColor() & 16777215));
                    break;
                }
            default:
                super.setAlpha(i4);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f24546a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, int i10) {
        super(i4);
        this.f24546a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PorterDuff.Mode mode) {
        super(1);
        this.f24546a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
