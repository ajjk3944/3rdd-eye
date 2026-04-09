package org.ocpsoft.prettytime.impl;

import Aj.f;
import Cj.b;
import java.util.Locale;
import java.util.ResourceBundle;

/* loaded from: classes2.dex */
public class a extends Bj.a {

    /* renamed from: o, reason: collision with root package name */
    private final ResourcesTimeUnit f57142o;

    /* renamed from: p, reason: collision with root package name */
    private f f57143p;

    /* renamed from: q, reason: collision with root package name */
    private String f57144q;

    public a(ResourcesTimeUnit resourcesTimeUnit, String str) {
        this.f57142o = resourcesTimeUnit;
        this.f57144q = str;
    }

    @Override // Bj.a, Aj.f
    public String a(Aj.a aVar, String str) {
        f fVar = this.f57143p;
        return fVar == null ? super.a(aVar, str) : fVar.a(aVar, str);
    }

    @Override // Bj.a, Aj.f
    public String b(Aj.a aVar) {
        f fVar = this.f57143p;
        return fVar == null ? super.b(aVar) : fVar.b(aVar);
    }

    @Override // Bj.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public a c(Locale locale) {
        ResourceBundle bundle;
        String str = this.f57144q;
        if (str != null) {
            try {
                bundle = ResourceBundle.getBundle(str, locale);
            } catch (Exception unused) {
            }
        } else {
            bundle = null;
        }
        if (bundle == null) {
            bundle = ResourceBundle.getBundle(this.f57142o.c(), locale);
        }
        if (bundle instanceof b) {
            f fVarA = ((b) bundle).a(this.f57142o);
            if (fVarA != null) {
                this.f57143p = fVarA;
            }
        } else {
            this.f57143p = null;
        }
        if (this.f57143p == null) {
            w(bundle.getString(this.f57142o.d() + "Pattern"));
            o(bundle.getString(this.f57142o.d() + "FuturePrefix"));
            q(bundle.getString(this.f57142o.d() + "FutureSuffix"));
            t(bundle.getString(this.f57142o.d() + "PastPrefix"));
            v(bundle.getString(this.f57142o.d() + "PastSuffix"));
            y(bundle.getString(this.f57142o.d() + "SingularName"));
            x(bundle.getString(this.f57142o.d() + "PluralName"));
            try {
                n(bundle.getString(this.f57142o.d() + "FuturePluralName"));
            } catch (Exception unused2) {
            }
            try {
                p(bundle.getString(this.f57142o.d() + "FutureSingularName"));
            } catch (Exception unused3) {
            }
            try {
                s(bundle.getString(this.f57142o.d() + "PastPluralName"));
            } catch (Exception unused4) {
            }
            try {
                u(bundle.getString(this.f57142o.d() + "PastSingularName"));
            } catch (Exception unused5) {
            }
        }
        return this;
    }
}
