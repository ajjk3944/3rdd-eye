package m3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Observable;
import kotlin.jvm.internal.l;
import m3.AbstractC5321b;

/* compiled from: Indicator.kt */
/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5321b<I extends AbstractC5321b<? extends I>> extends Observable {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f44059f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f44060a;

    /* renamed from: b, reason: collision with root package name */
    public final float f44061b;

    /* renamed from: c, reason: collision with root package name */
    public k3.e f44062c;

    /* renamed from: d, reason: collision with root package name */
    public float f44063d;

    /* renamed from: e, reason: collision with root package name */
    public int f44064e;

    /* compiled from: Indicator.kt */
    /* renamed from: m3.b$a */
    public enum a {
        NoIndicator,
        NormalIndicator,
        NormalSmallIndicator,
        TriangleIndicator,
        SpindleIndicator,
        LineIndicator,
        HalfLineIndicator,
        QuarterLineIndicator,
        KiteIndicator,
        NeedleIndicator
    }

    public AbstractC5321b(Context context) {
        Paint paint = new Paint(1);
        this.f44060a = paint;
        this.f44061b = context.getResources().getDisplayMetrics().density;
        this.f44064e = -14575885;
        paint.setColor(-14575885);
    }

    public abstract void a(Canvas canvas);

    public float b() {
        return d();
    }

    public final float c() {
        k3.e eVar = this.f44062c;
        if (eVar == null) {
            return 0.0f;
        }
        l.c(eVar);
        return eVar.getSize() / 2.0f;
    }

    public final float d() {
        k3.e eVar = this.f44062c;
        if (eVar == null) {
            return 0.0f;
        }
        l.c(eVar);
        return eVar.getSize() / 2.0f;
    }

    public float e() {
        k3.e eVar = this.f44062c;
        if (eVar == null) {
            return 0.0f;
        }
        l.c(eVar);
        return eVar.getPadding();
    }

    public final float f() {
        if (this.f44062c == null) {
            return 0.0f;
        }
        return r0.getSize() - (r0.getPadding() * 2.0f);
    }

    public final void g(int i) {
        this.f44064e = i;
        if (this.f44062c != null) {
            j();
        }
        setChanged();
        notifyObservers(null);
    }

    public final void h(k3.e eVar) {
        deleteObservers();
        addObserver(eVar);
        this.f44062c = eVar;
        j();
    }

    public final void i(float f10) {
        this.f44063d = f10;
        if (this.f44062c != null) {
            j();
        }
        setChanged();
        notifyObservers(null);
    }

    public abstract void j();
}
