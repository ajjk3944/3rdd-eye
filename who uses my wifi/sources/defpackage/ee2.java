package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ee2 extends FrameLayout implements zd2 {
    public final ag2 f;
    public final FrameLayout g;
    public final View h;
    public final tz1 i;
    public final de2 j;
    public final long k;
    public final ae2 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public String s;
    public String[] t;
    public Bitmap u;
    public final ImageView v;
    public boolean w;

    public ee2(Context context, ag2 ag2Var, int i, boolean z, tz1 tz1Var, je2 je2Var, mv2 mv2Var) {
        ae2 yd2Var;
        ae2 wf2Var;
        super(context);
        this.f = ag2Var;
        this.i = tz1Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        ou1.j(ag2Var.k());
        Object obj = ag2Var.k().f;
        ke2 ke2Var = new ke2(context, ag2Var.u(), ag2Var.n(), tz1Var, ag2Var.j());
        if (i == 3) {
            wf2Var = new wf2(context, ke2Var);
        } else {
            if (i == 2) {
                ag2Var.x().getClass();
                yd2Var = new se2(context, ke2Var, ag2Var, z, je2Var, mv2Var);
            } else {
                yd2Var = new yd2(context, ag2Var, z, ag2Var.x().b(), new ke2(context, ag2Var.u(), ag2Var.n(), tz1Var, ag2Var.j()), mv2Var);
            }
            wf2Var = yd2Var;
        }
        this.l = wf2Var;
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(0);
        frameLayout.addView(wf2Var, new FrameLayout.LayoutParams(-1, -1, 17));
        iz1 iz1Var = mz1.R;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) tw1Var.c.a(mz1.O)).booleanValue()) {
            a();
        }
        this.v = new ImageView(context);
        this.k = ((Long) tw1Var.c.a(mz1.T)).longValue();
        boolean zBooleanValue = ((Boolean) tw1Var.c.a(mz1.Q)).booleanValue();
        this.p = zBooleanValue;
        tz1Var.c("spinner_used", true != zBooleanValue ? "0" : "1");
        this.j = new de2(this);
        wf2Var.e(this);
    }

    public final void a() {
        ae2 ae2Var = this.l;
        if (ae2Var == null) {
            return;
        }
        TextView textView = new TextView(ae2Var.getContext());
        Resources resourcesC = hg4.C.h.c();
        textView.setText(String.valueOf(resourcesC == null ? "AdMob - " : resourcesC.getString(R.string.watermark_label_prefix)).concat(ae2Var.d()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.g;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        ae2 ae2Var = this.l;
        if (ae2Var == null) {
            return;
        }
        long jK = ae2Var.k();
        if (this.q == jK || jK <= 0) {
            return;
        }
        float f = jK / 1000.0f;
        if (((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue()) {
            String strValueOf = String.valueOf(f);
            String strValueOf2 = String.valueOf(ae2Var.s());
            String strValueOf3 = String.valueOf(ae2Var.r());
            String strValueOf4 = String.valueOf(ae2Var.q());
            String strValueOf5 = String.valueOf(ae2Var.y());
            hg4.C.k.getClass();
            c("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f));
        }
        this.q = jK;
    }

    public final void c(String str, String... strArr) {
        HashMap map = new HashMap();
        ae2 ae2Var = this.l;
        Integer numZ = ae2Var != null ? ae2Var.z() : null;
        if (numZ != null) {
            map.put("playerId", numZ.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f.a("onVideoEvent", map);
    }

    public final void d() {
        ag2 ag2Var = this.f;
        if (ag2Var.g() == null || !this.n || this.o) {
            return;
        }
        ag2Var.g().getWindow().clearFlags(128);
        this.n = false;
    }

    public final void e() {
        ae2 ae2Var = this.l;
        if (ae2Var != null && this.r == 0) {
            c("canplaythrough", "duration", String.valueOf(ae2Var.j() / 1000.0f), "videoWidth", String.valueOf(ae2Var.o()), "videoHeight", String.valueOf(ae2Var.p()));
        }
    }

    public final void f() {
        if (((Boolean) tw1.e.c.a(mz1.a2)).booleanValue()) {
            de2 de2Var = this.j;
            de2Var.h = false;
            i63 i63Var = lf4.l;
            i63Var.removeCallbacks(de2Var);
            i63Var.postDelayed(de2Var, 250L);
        }
        ag2 ag2Var = this.f;
        if (ag2Var.g() != null && !this.n) {
            boolean z = (ag2Var.g().getWindow().getAttributes().flags & 128) != 0;
            this.o = z;
            if (!z) {
                ag2Var.g().getWindow().addFlags(128);
                this.n = true;
            }
        }
        this.m = true;
    }

    public final void finalize() throws Throwable {
        try {
            this.j.a();
            ae2 ae2Var = this.l;
            if (ae2Var != null) {
                md2.f.execute(new fu1(12, ae2Var));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c("pause", new String[0]);
        d();
        this.m = false;
    }

    public final void h() {
        if (((Boolean) tw1.e.c.a(mz1.a2)).booleanValue()) {
            this.j.a();
        }
        c("ended", new String[0]);
        d();
    }

    public final void i() {
        if (this.w && this.u != null) {
            ImageView imageView = this.v;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.u);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.g;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.j.a();
        this.r = this.q;
        lf4.l.post(new be2(this, 1));
    }

    public final void j(int i, int i2) {
        if (this.p) {
            iz1 iz1Var = mz1.S;
            tw1 tw1Var = tw1.e;
            int iMax = Math.max(i / ((Integer) tw1Var.c.a(iz1Var)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) tw1Var.c.a(iz1Var)).intValue(), 1);
            Bitmap bitmap = this.u;
            if (bitmap != null && bitmap.getWidth() == iMax && this.u.getHeight() == iMax2) {
                return;
            }
            this.u = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.w = false;
        }
    }

    public final void k() {
        this.h.setVisibility(4);
        lf4.l.post(new be2(this, 2));
    }

    public final void l(int i, int i2, int i3, int i4) {
        if (gi2.R()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 3 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length());
            ex0.o(sb, "Set video bounds to x:", i, ";y:", i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            gi2.G(sb.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.g.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        de2 de2Var = this.j;
        if (z) {
            de2Var.h = false;
            i63 i63Var = lf4.l;
            i63Var.removeCallbacks(de2Var);
            i63Var.postDelayed(de2Var, 250L);
        } else {
            de2Var.a();
            this.r = this.q;
        }
        lf4.l.post(new de2(this, z, 1));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        de2 de2Var = this.j;
        if (i == 0) {
            de2Var.h = false;
            i63 i63Var = lf4.l;
            i63Var.removeCallbacks(de2Var);
            i63Var.postDelayed(de2Var, 250L);
            z = true;
        } else {
            de2Var.a();
            this.r = this.q;
        }
        lf4.l.post(new de2(this, z, 0));
    }
}
