package oc;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import t.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30496d;

    public /* synthetic */ a(Object obj, int i4, Object obj2, int i10) {
        this.f30493a = i10;
        this.f30496d = obj;
        this.f30494b = i4;
        this.f30495c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30493a) {
            case 0:
                ((BottomSheetBehavior) this.f30496d).M((View) this.f30495c, this.f30494b, false);
                break;
            case 1:
                ((TextView) this.f30495c).setTypeface((Typeface) this.f30496d, this.f30494b);
                break;
            case 2:
                ((m) this.f30496d).i0(this.f30494b, (CharSequence) this.f30495c);
                break;
            default:
                ((u.g) this.f30496d).f34708b.onNavigationEvent(this.f30494b, (Bundle) this.f30495c);
                break;
        }
    }

    public a(TextView textView, Typeface typeface, int i4) {
        this.f30493a = 1;
        this.f30495c = textView;
        this.f30496d = typeface;
        this.f30494b = i4;
    }

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i4) {
        this.f30493a = 0;
        this.f30496d = bottomSheetBehavior;
        this.f30495c = view;
        this.f30494b = i4;
    }
}
