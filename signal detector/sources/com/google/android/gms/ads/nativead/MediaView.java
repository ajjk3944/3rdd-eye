package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import d4.h;
import h2.d;
import j2.InterfaceC2557m;

/* loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2557m f6880a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6881b;

    /* renamed from: c, reason: collision with root package name */
    public d f6882c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView.ScaleType f6883d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6884e;

    /* renamed from: f, reason: collision with root package name */
    public h f6885f;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final synchronized void a(h hVar) {
        this.f6885f = hVar;
        if (this.f6884e) {
            hVar.k(this.f6883d);
        }
    }

    public InterfaceC2557m getMediaContent() {
        return this.f6880a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f6884e = true;
        this.f6883d = scaleType;
        h hVar = this.f6885f;
        if (hVar != null) {
            hVar.k(scaleType);
        }
    }

    public void setMediaContent(InterfaceC2557m interfaceC2557m) {
        this.f6881b = true;
        this.f6880a = interfaceC2557m;
        d dVar = this.f6882c;
        if (dVar != null) {
            dVar.r(interfaceC2557m);
        }
    }
}
