package com.yandex.mobile.ads.impl;

import c9.C2097r;
import c9.C2099t;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class qj0 {

    /* renamed from: a, reason: collision with root package name */
    private final ra0 f32231a;

    /* renamed from: b, reason: collision with root package name */
    private final vg f32232b;

    /* renamed from: c, reason: collision with root package name */
    private final m02 f32233c;

    public /* synthetic */ qj0() {
        this(new ra0(), new vg(), new m02());
    }

    public final Set<jj0> a(List<? extends ag<?>> assets, ir0 ir0Var) {
        Object next;
        Object obj;
        w20 w20VarC;
        List<jj0> listD;
        List<InterfaceC4200t> listA;
        Object next2;
        kotlin.jvm.internal.l.f(assets, "assets");
        this.f32232b.getClass();
        Set<jj0> setK0 = C2097r.K0(vg.a(assets));
        Iterator<T> it = assets.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.b(((ag) next).b(), "feedback")) {
                break;
            }
        }
        ag agVar = (ag) next;
        this.f32231a.getClass();
        List<jj0> listY0 = C2099t.f18581b;
        if (agVar != null && (agVar.d() instanceof ua0)) {
            jj0 jj0VarA = ((ua0) agVar.d()).a();
            List<jj0> listG = jj0VarA != null ? E.u.G(jj0VarA) : listY0;
            ir0 ir0VarA = agVar.a();
            if (ir0VarA == null || (listA = ir0VarA.a()) == null) {
                obj = null;
            } else {
                Iterator<T> it2 = listA.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (kotlin.jvm.internal.l.b(((InterfaceC4200t) next2).a(), "divkit_adtune")) {
                        break;
                    }
                }
                obj = (InterfaceC4200t) next2;
            }
            i20 i20Var = obj instanceof i20 ? (i20) obj : null;
            if (i20Var != null && (w20VarC = i20Var.c()) != null && (listD = w20VarC.d()) != null) {
                listY0 = listD;
            }
            listY0 = C2097r.y0(listY0, listG);
        }
        setK0.addAll(listY0);
        this.f32233c.getClass();
        setK0.addAll(m02.a(assets, ir0Var));
        return setK0;
    }

    public qj0(ra0 feedbackImageProvider, vg assetsImagesProvider, m02 socialActionImageProvider) {
        kotlin.jvm.internal.l.f(feedbackImageProvider, "feedbackImageProvider");
        kotlin.jvm.internal.l.f(assetsImagesProvider, "assetsImagesProvider");
        kotlin.jvm.internal.l.f(socialActionImageProvider, "socialActionImageProvider");
        this.f32231a = feedbackImageProvider;
        this.f32232b = assetsImagesProvider;
        this.f32233c = socialActionImageProvider;
    }
}
