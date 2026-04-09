package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import java.net.InetAddress;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class al0 {
    public final /* synthetic */ int a;
    public float b;
    public boolean c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public al0(InetAddress inetAddress) {
        this.a = 0;
        this.e = null;
        this.d = inetAddress;
    }

    public float a(String str) {
        if (!this.c) {
            return this.b;
        }
        TextPaint textPaint = (TextPaint) this.d;
        this.b = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.c = false;
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("PingResult{ia=");
                sb.append((InetAddress) this.d);
                sb.append(", isReachable=");
                sb.append(this.c);
                sb.append(", error='");
                sb.append((String) this.e);
                sb.append("', timeTaken=");
                sb.append(this.b);
                sb.append(", fullString='");
                sb.append((String) this.f);
                sb.append("', result='");
                return ex0.k(sb, (String) this.g, "'}");
            default:
                return super.toString();
        }
    }

    public al0(bf bfVar) {
        this.a = 1;
        this.d = new TextPaint(1);
        this.e = new xe(1, this);
        this.c = true;
        this.f = new WeakReference(null);
        this.f = new WeakReference(bfVar);
    }
}
