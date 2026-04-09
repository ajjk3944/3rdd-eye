package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.c2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class k extends View {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f3700a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3701b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a();

        void b();
    }

    public k(c2 c2Var, Context context) {
        super(context);
        this.f3700a = c2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f3701b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f3700a.b();
    }

    public void a(a aVar) {
        if (this.f3701b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f3700a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f3701b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
