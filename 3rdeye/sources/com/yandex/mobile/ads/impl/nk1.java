package com.yandex.mobile.ads.impl;

import b9.C2001h;
import b9.InterfaceC2000g;
import c9.C2091l;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import p9.InterfaceC5480a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@M9.h
/* loaded from: classes3.dex */
public final class nk1 {
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2000g<M9.b<Object>> f30922b;

    /* renamed from: c, reason: collision with root package name */
    public static final nk1 f30923c;

    /* renamed from: d, reason: collision with root package name */
    public static final nk1 f30924d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ nk1[] f30925e;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<M9.b<Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30926b = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4, types: [int] */
        /* JADX WARN: Type inference failed for: r12v7 */
        @Override // p9.InterfaceC5480a
        public final M9.b<Object> invoke() {
            nk1[] values = nk1.values();
            String[] strArr = {"success", com.vungle.ads.internal.presenter.g.ERROR};
            boolean z10 = false;
            Annotation[][] annotationArr = {null, null};
            kotlin.jvm.internal.l.f(values, "values");
            Q9.C c10 = new Q9.C("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", values.length);
            int length = values.length;
            int i = 0;
            int i10 = 0;
            while (i < length) {
                nk1 nk1Var = values[i];
                int i11 = i10 + 1;
                String strName = (String) C2091l.n(strArr, i10);
                if (strName == null) {
                    strName = nk1Var.name();
                }
                c10.k(strName, z10);
                Annotation[] annotationArr2 = (Annotation[]) C2091l.n(annotationArr, i10);
                if (annotationArr2 != null) {
                    int length2 = annotationArr2.length;
                    for (?? r12 = z10; r12 < length2; r12++) {
                        Annotation annotation = annotationArr2[r12];
                        kotlin.jvm.internal.l.f(annotation, "annotation");
                        int i12 = c10.f11511d;
                        List<Annotation>[] listArr = c10.f11513f;
                        List<Annotation> arrayList = listArr[i12];
                        if (arrayList == null) {
                            arrayList = new ArrayList<>(1);
                            listArr[c10.f11511d] = arrayList;
                        }
                        arrayList.add(annotation);
                    }
                }
                i++;
                i10 = i11;
                z10 = false;
            }
            Q9.D d10 = new Q9.D("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", values);
            d10.f11402b = c10;
            return d10;
        }
    }

    public static final class b {
        private b() {
        }

        public final M9.b<nk1> serializer() {
            return (M9.b) nk1.f30922b.getValue();
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    static {
        nk1 nk1Var = new nk1(0, "SUCCESS");
        f30923c = nk1Var;
        nk1 nk1Var2 = new nk1(1, "ERROR");
        f30924d = nk1Var2;
        nk1[] nk1VarArr = {nk1Var, nk1Var2};
        f30925e = nk1VarArr;
        com.google.gson.internal.c.l(nk1VarArr);
        Companion = new b(0);
        f30922b = C2001h.a(b9.i.PUBLICATION, a.f30926b);
    }

    private nk1(int i, String str) {
    }

    public static nk1 valueOf(String str) {
        return (nk1) Enum.valueOf(nk1.class, str);
    }

    public static nk1[] values() {
        return (nk1[]) f30925e.clone();
    }
}
