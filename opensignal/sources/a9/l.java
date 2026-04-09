package a9;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public final class l extends Paint {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271a;

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        switch (this.f271a) {
            case 2:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(e9.g.c(i10));
                    break;
                } else {
                    setColor((e9.g.c(i10) << 24) | (getColor() & 16777215));
                    break;
                }
            default:
                super.setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f271a) {
            case 2:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11) {
        super(i10);
        this.f271a = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PorterDuff.Mode mode) {
        super(1);
        this.f271a = 2;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
