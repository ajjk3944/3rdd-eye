package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.c2;

/* loaded from: classes.dex */
public class k extends View {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f5512a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5513b;

    public interface a {
        void a();

        void b();
    }

    public k(c2 c2Var, Context context) {
        super(context);
        this.f5512a = c2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f5513b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f5512a.b();
    }

    public void a(a aVar) {
        if (this.f5513b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f5512a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f5513b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
