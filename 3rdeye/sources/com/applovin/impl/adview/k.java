package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.x1;

/* loaded from: classes.dex */
public class k extends View {

    /* renamed from: a, reason: collision with root package name */
    private final x1 f19062a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19063b;

    public interface a {
        void a();

        void onFailure();
    }

    public k(x1 x1Var, Context context) {
        super(context);
        this.f19062a = x1Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f19063b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f19062a.b();
    }

    public void a(a aVar) {
        if (this.f19063b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f19062a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.onFailure();
            }
        } else {
            setBackground(drawableA);
            this.f19063b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
