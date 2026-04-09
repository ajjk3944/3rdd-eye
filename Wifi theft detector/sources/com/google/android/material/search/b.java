package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public Animator f10869d;

    /* renamed from: e, reason: collision with root package name */
    public Animator f10870e;

    /* renamed from: a, reason: collision with root package name */
    public final Set f10866a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set f10867b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final Set f10868c = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public boolean f10871f = true;

    /* renamed from: g, reason: collision with root package name */
    public Animator f10872g = null;

    public void a(boolean z10) {
        this.f10871f = z10;
    }

    public void b(SearchBar searchBar) {
        Animator animator = this.f10869d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f10870e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }
}
