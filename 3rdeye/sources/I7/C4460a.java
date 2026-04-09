package i7;

import C.e0;
import H6.I;
import N7.AbstractC1293o4;
import N7.AbstractC1339r9;
import N7.Ba;
import N7.C1130d0;
import N7.C1139d9;
import N7.C1217ic;
import N7.C1242k9;
import N7.C1322q5;
import N7.C1332r2;
import N7.C1333r3;
import N7.C1363t5;
import N7.C1405w5;
import N7.C1431y3;
import N7.C1438ya;
import N7.C1447z5;
import N7.C9;
import N7.E5;
import N7.EnumC1195h5;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.EnumC1356sc;
import N7.G5;
import N7.G7;
import N7.H9;
import N7.Ka;
import N7.L9;
import N7.Q6;
import N7.R3;
import N7.T2;
import N7.T5;
import N7.W4;
import N7.X9;
import N7.Z;
import X0.n;
import a7.C1668e;
import android.net.Uri;
import c9.C2078B;
import c9.C2092m;
import c9.C2099t;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o6.C5425b;
import o6.C5426c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivCollectionExtensions.kt */
/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4460a {
    public static final ArrayList a(C1333r3 c1333r3, A7.d resolver) throws JSONException {
        Object next;
        kotlin.jvm.internal.l.f(c1333r3, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        JSONArray jSONArrayA = c1333r3.f9032a.a(resolver);
        int length = jSONArrayA.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayA.get(i);
            kotlin.jvm.internal.l.e(obj, "get(i)");
            A7.d dVarG = g(c1333r3, obj, i, resolver);
            b bVarM = null;
            bVarM = null;
            if (dVarG != null) {
                Iterator<T> it = c1333r3.f9034c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C1333r3.a) next).f9038c.a(dVarG).booleanValue()) {
                        break;
                    }
                }
                C1333r3.a aVar = (C1333r3.a) next;
                if (aVar != null) {
                    A7.b<String> bVar = aVar.f9037b;
                    bVarM = m(e(aVar.f9036a, bVar != null ? bVar.a(dVarG) : null), dVarG);
                }
            }
            if (bVarM != null) {
                arrayList.add(bVarM);
            }
        }
        return arrayList;
    }

    public static final List<b> b(C1431y3 c1431y3, A7.d resolver) {
        kotlin.jvm.internal.l.f(c1431y3, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        C1333r3 c1333r3 = c1431y3.f9876z;
        if (c1333r3 != null) {
            return a(c1333r3, resolver);
        }
        List<Z> list = c1431y3.f9824A;
        return list != null ? l(list, resolver) : C2099t.f18581b;
    }

    public static final List<b> c(C1322q5 c1322q5, A7.d resolver) {
        kotlin.jvm.internal.l.f(c1322q5, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        C1333r3 c1333r3 = c1322q5.f8974s;
        if (c1333r3 != null) {
            return a(c1333r3, resolver);
        }
        List<Z> list = c1322q5.f8976u;
        return list != null ? l(list, resolver) : C2099t.f18581b;
    }

    public static final List<b> d(G7 g72, A7.d resolver) {
        kotlin.jvm.internal.l.f(g72, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        C1333r3 c1333r3 = g72.f5362r;
        if (c1333r3 != null) {
            return a(c1333r3, resolver);
        }
        List<Z> list = g72.f5364t;
        return list != null ? l(list, resolver) : C2099t.f18581b;
    }

    public static final Z e(Z z10, String str) {
        if (z10 instanceof Z.f) {
            C1447z5 c1447z5 = ((Z.f) z10).f7818c;
            C1130d0 c1130d0 = c1447z5.f10060a;
            C1332r2 c1332r2 = c1447z5.f10064c;
            C9 c92 = c1447z5.f10085w;
            A7.b<Uri> bVar = c1447z5.f10035B;
            C9 c93 = c1447z5.f10065c0;
            A7.b<Double> alpha = c1447z5.f10070g;
            kotlin.jvm.internal.l.f(alpha, "alpha");
            A7.b<Boolean> captureFocusOnAction = c1447z5.f10075m;
            kotlin.jvm.internal.l.f(captureFocusOnAction, "captureFocusOnAction");
            A7.b<EnumC1305p2> contentAlignmentHorizontal = c1447z5.f10077o;
            kotlin.jvm.internal.l.f(contentAlignmentHorizontal, "contentAlignmentHorizontal");
            A7.b<EnumC1319q2> contentAlignmentVertical = c1447z5.f10078p;
            kotlin.jvm.internal.l.f(contentAlignmentVertical, "contentAlignmentVertical");
            A7.b<Boolean> highPriorityPreviewShow = c1447z5.f10086x;
            kotlin.jvm.internal.l.f(highPriorityPreviewShow, "highPriorityPreviewShow");
            A7.b<Integer> placeholderColor = c1447z5.f10040G;
            kotlin.jvm.internal.l.f(placeholderColor, "placeholderColor");
            A7.b<Boolean> preloadRequired = c1447z5.f10041H;
            kotlin.jvm.internal.l.f(preloadRequired, "preloadRequired");
            A7.b<E5> scale = c1447z5.f10047N;
            kotlin.jvm.internal.l.f(scale, "scale");
            A7.b<T2> tintMode = c1447z5.f10050Q;
            kotlin.jvm.internal.l.f(tintMode, "tintMode");
            A7.b<EnumC1356sc> visibility = c1447z5.f10059Z;
            kotlin.jvm.internal.l.f(visibility, "visibility");
            return new Z.f(new C1447z5(c1130d0, c1447z5.f10062b, c1332r2, c1447z5.f10066d, c1447z5.f10068e, c1447z5.f10069f, alpha, c1447z5.f10071h, c1447z5.i, c1447z5.f10072j, c1447z5.f10073k, c1447z5.f10074l, captureFocusOnAction, c1447z5.f10076n, contentAlignmentHorizontal, contentAlignmentVertical, c1447z5.f10079q, c1447z5.f10080r, c1447z5.f10081s, c1447z5.f10082t, c1447z5.f10083u, c1447z5.f10084v, c92, highPriorityPreviewShow, c1447z5.f10087y, c1447z5.f10088z, str, bVar, c1447z5.f10036C, c1447z5.f10037D, c1447z5.f10038E, c1447z5.f10039F, placeholderColor, preloadRequired, c1447z5.f10042I, c1447z5.f10043J, c1447z5.f10044K, c1447z5.f10045L, c1447z5.f10046M, scale, c1447z5.f10048O, c1447z5.f10049P, tintMode, c1447z5.f10051R, c1447z5.f10052S, c1447z5.f10053T, c1447z5.f10054U, c1447z5.f10055V, c1447z5.f10056W, c1447z5.f10057X, c1447z5.f10058Y, visibility, c1447z5.f10061a0, c1447z5.f10063b0, c93));
        }
        if (z10 instanceof Z.d) {
            C1363t5 c1363t5 = ((Z.d) z10).f7816c;
            int i = C1363t5.f9224Z;
            C1130d0 c1130d02 = c1363t5.f9250a;
            C1332r2 c1332r22 = c1363t5.f9252c;
            A7.b<Uri> bVar2 = c1363t5.f9269u;
            C9 c94 = c1363t5.f9270v;
            C9 c95 = c1363t5.f9248X;
            A7.b<Double> alpha2 = c1363t5.f9256g;
            kotlin.jvm.internal.l.f(alpha2, "alpha");
            A7.b<Boolean> captureFocusOnAction2 = c1363t5.f9260l;
            kotlin.jvm.internal.l.f(captureFocusOnAction2, "captureFocusOnAction");
            A7.b<EnumC1305p2> contentAlignmentHorizontal2 = c1363t5.f9262n;
            kotlin.jvm.internal.l.f(contentAlignmentHorizontal2, "contentAlignmentHorizontal");
            A7.b<EnumC1319q2> contentAlignmentVertical2 = c1363t5.f9263o;
            kotlin.jvm.internal.l.f(contentAlignmentVertical2, "contentAlignmentVertical");
            A7.b<Integer> placeholderColor2 = c1363t5.f9228D;
            kotlin.jvm.internal.l.f(placeholderColor2, "placeholderColor");
            A7.b<Boolean> preloadRequired2 = c1363t5.f9229E;
            kotlin.jvm.internal.l.f(preloadRequired2, "preloadRequired");
            A7.b<E5> scale2 = c1363t5.f9235K;
            kotlin.jvm.internal.l.f(scale2, "scale");
            A7.b<EnumC1356sc> visibility2 = c1363t5.f9245U;
            kotlin.jvm.internal.l.f(visibility2, "visibility");
            return new Z.d(new C1363t5(c1130d02, c1363t5.f9251b, c1332r22, c1363t5.f9253d, c1363t5.f9254e, c1363t5.f9255f, alpha2, c1363t5.f9257h, c1363t5.i, c1363t5.f9258j, c1363t5.f9259k, captureFocusOnAction2, c1363t5.f9261m, contentAlignmentHorizontal2, contentAlignmentVertical2, c1363t5.f9264p, c1363t5.f9265q, c1363t5.f9266r, c1363t5.f9267s, c1363t5.f9268t, bVar2, c94, c1363t5.f9271w, c1363t5.f9272x, str, c1363t5.f9274z, c1363t5.f9225A, c1363t5.f9226B, c1363t5.f9227C, placeholderColor2, preloadRequired2, c1363t5.f9230F, c1363t5.f9231G, c1363t5.f9232H, c1363t5.f9233I, c1363t5.f9234J, scale2, c1363t5.f9236L, c1363t5.f9237M, c1363t5.f9238N, c1363t5.f9239O, c1363t5.f9240P, c1363t5.f9241Q, c1363t5.f9242R, c1363t5.f9243S, c1363t5.f9244T, visibility2, c1363t5.f9246V, c1363t5.f9247W, c95));
        }
        if (z10 instanceof Z.p) {
            Ka ka2 = ((Z.p) z10).f7828c;
            C1130d0 c1130d03 = ka2.f5653a;
            C1332r2 c1332r23 = ka2.f5657c;
            C9 c96 = ka2.f5628B;
            A7.b<String> bVar3 = ka2.f5649W;
            C9 c97 = ka2.f5685q0;
            A7.b<Double> alpha3 = ka2.f5665g;
            kotlin.jvm.internal.l.f(alpha3, "alpha");
            A7.b<Boolean> captureFocusOnAction3 = ka2.f5674l;
            kotlin.jvm.internal.l.f(captureFocusOnAction3, "captureFocusOnAction");
            A7.b<Long> fontSize = ka2.f5691v;
            kotlin.jvm.internal.l.f(fontSize, "fontSize");
            A7.b<H9> fontSizeUnit = ka2.f5692w;
            kotlin.jvm.internal.l.f(fontSizeUnit, "fontSizeUnit");
            A7.b<EnumC1195h5> fontWeight = ka2.f5694y;
            kotlin.jvm.internal.l.f(fontWeight, "fontWeight");
            A7.b<Double> letterSpacing = ka2.f5634H;
            kotlin.jvm.internal.l.f(letterSpacing, "letterSpacing");
            A7.b<Boolean> selectable = ka2.f5646T;
            kotlin.jvm.internal.l.f(selectable, "selectable");
            A7.b<Q6> strike = ka2.f5648V;
            kotlin.jvm.internal.l.f(strike, "strike");
            A7.b<EnumC1305p2> textAlignmentHorizontal = ka2.f5650X;
            kotlin.jvm.internal.l.f(textAlignmentHorizontal, "textAlignmentHorizontal");
            A7.b<EnumC1319q2> textAlignmentVertical = ka2.f5651Y;
            kotlin.jvm.internal.l.f(textAlignmentVertical, "textAlignmentVertical");
            A7.b<Integer> textColor = ka2.f5652Z;
            kotlin.jvm.internal.l.f(textColor, "textColor");
            A7.b<Boolean> tightenWidth = ka2.f5658c0;
            kotlin.jvm.internal.l.f(tightenWidth, "tightenWidth");
            A7.b<Ka.d> truncate = ka2.f5671j0;
            kotlin.jvm.internal.l.f(truncate, "truncate");
            A7.b<Q6> underline = ka2.f5673k0;
            kotlin.jvm.internal.l.f(underline, "underline");
            A7.b<EnumC1356sc> visibility3 = ka2.f5679n0;
            kotlin.jvm.internal.l.f(visibility3, "visibility");
            return new Z.p(new Ka(c1130d03, ka2.f5655b, c1332r23, ka2.f5659d, ka2.f5661e, ka2.f5663f, alpha3, ka2.f5667h, ka2.i, ka2.f5670j, ka2.f5672k, captureFocusOnAction3, ka2.f5676m, ka2.f5678n, ka2.f5680o, ka2.f5682p, ka2.f5684q, ka2.f5686r, ka2.f5688s, ka2.f5689t, ka2.f5690u, fontSize, fontSizeUnit, ka2.f5693x, fontWeight, ka2.f5695z, ka2.f5627A, c96, ka2.f5629C, ka2.f5630D, str, ka2.f5632F, ka2.f5633G, letterSpacing, ka2.f5635I, ka2.f5636J, ka2.f5637K, ka2.f5638L, ka2.f5639M, ka2.f5640N, ka2.f5641O, ka2.f5642P, ka2.f5643Q, ka2.f5644R, ka2.f5645S, selectable, ka2.f5647U, strike, bVar3, textAlignmentHorizontal, textAlignmentVertical, textColor, ka2.f5654a0, ka2.f5656b0, tightenWidth, ka2.f5660d0, ka2.f5662e0, ka2.f5664f0, ka2.f5666g0, ka2.f5668h0, ka2.f5669i0, truncate, underline, ka2.f5675l0, ka2.f5677m0, visibility3, ka2.f5681o0, ka2.f5683p0, c97));
        }
        if (z10 instanceof Z.k) {
            C1242k9 c1242k9 = ((Z.k) z10).f7823c;
            C1130d0 c1130d04 = c1242k9.f8671a;
            C1332r2 actionAnimation = c1242k9.f8673c;
            kotlin.jvm.internal.l.f(actionAnimation, "actionAnimation");
            A7.b<Double> alpha4 = c1242k9.f8677g;
            kotlin.jvm.internal.l.f(alpha4, "alpha");
            A7.b<Boolean> captureFocusOnAction4 = c1242k9.f8680k;
            kotlin.jvm.internal.l.f(captureFocusOnAction4, "captureFocusOnAction");
            C9 height = c1242k9.f8688s;
            kotlin.jvm.internal.l.f(height, "height");
            A7.b<EnumC1356sc> visibility4 = c1242k9.f8666N;
            kotlin.jvm.internal.l.f(visibility4, "visibility");
            C9 width = c1242k9.f8669Q;
            kotlin.jvm.internal.l.f(width, "width");
            return new Z.k(new C1242k9(c1130d04, c1242k9.f8672b, actionAnimation, c1242k9.f8674d, c1242k9.f8675e, c1242k9.f8676f, alpha4, c1242k9.f8678h, c1242k9.i, c1242k9.f8679j, captureFocusOnAction4, c1242k9.f8681l, c1242k9.f8682m, c1242k9.f8683n, c1242k9.f8684o, c1242k9.f8685p, c1242k9.f8686q, c1242k9.f8687r, height, c1242k9.f8689t, c1242k9.f8690u, str, c1242k9.f8692w, c1242k9.f8693x, c1242k9.f8694y, c1242k9.f8695z, c1242k9.f8653A, c1242k9.f8654B, c1242k9.f8655C, c1242k9.f8656D, c1242k9.f8657E, c1242k9.f8658F, c1242k9.f8659G, c1242k9.f8660H, c1242k9.f8661I, c1242k9.f8662J, c1242k9.f8663K, c1242k9.f8664L, c1242k9.f8665M, visibility4, c1242k9.f8667O, c1242k9.f8668P, width));
        }
        ArrayList arrayList = null;
        if (z10 instanceof Z.a) {
            C1431y3 c1431y3 = ((Z.a) z10).f7813c;
            List<Z> list = c1431y3.f9824A;
            if (list != null) {
                List<Z> list2 = list;
                arrayList = new ArrayList(C2092m.T(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(f((Z) it.next()));
                }
            }
            return new Z.a(C1431y3.a(c1431y3, str, arrayList, -83886081));
        }
        if (z10 instanceof Z.e) {
            C1405w5 c1405w5 = ((Z.e) z10).f7817c;
            List<Z> list3 = c1405w5.f9719y;
            if (list3 != null) {
                List<Z> list4 = list3;
                arrayList = new ArrayList(C2092m.T(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(f((Z) it2.next()));
                }
            }
            return new Z.e(C1405w5.a(c1405w5, str, arrayList, -25165825));
        }
        if (z10 instanceof Z.c) {
            C1322q5 c1322q5 = ((Z.c) z10).f7815c;
            List<Z> list5 = c1322q5.f8976u;
            if (list5 != null) {
                List<Z> list6 = list5;
                arrayList = new ArrayList(C2092m.T(list6, 10));
                Iterator<T> it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList.add(f((Z) it3.next()));
                }
            }
            return new Z.c(C1322q5.a(c1322q5, str, arrayList, -1179649));
        }
        if (z10 instanceof Z.i) {
            G7 g72 = ((Z.i) z10).f7821c;
            List<Z> list7 = g72.f5364t;
            if (list7 != null) {
                List<Z> list8 = list7;
                arrayList = new ArrayList(C2092m.T(list8, 10));
                Iterator<T> it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList.add(f((Z) it4.next()));
                }
            }
            return new Z.i(G7.a(g72, str, arrayList, -557057));
        }
        if (z10 instanceof Z.o) {
            Ba ba2 = ((Z.o) z10).f7827c;
            List<Ba.a> list9 = ba2.f4949q;
            ArrayList arrayList2 = new ArrayList(C2092m.T(list9, 10));
            for (Ba.a aVar : list9) {
                arrayList2.add(new Ba.a(f(aVar.f4959a), aVar.f4960b, aVar.f4961c));
            }
            return new Z.o(Ba.a(ba2, str, arrayList2, -98305));
        }
        if (z10 instanceof Z.m) {
            X9 x92 = ((Z.m) z10).f7825c;
            List<X9.a> list10 = x92.f7743y;
            ArrayList arrayList3 = new ArrayList(C2092m.T(list10, 10));
            for (X9.a aVar2 : list10) {
                Z z11 = aVar2.f7747c;
                Z zE = z11 != null ? e(z11, z11.d().getId()) : null;
                arrayList3.add(new X9.a(aVar2.f7745a, aVar2.f7746b, zE, aVar2.f7748d, aVar2.f7749e));
            }
            return new Z.m(X9.a(x92, str, str, arrayList3, -16844801));
        }
        if (z10 instanceof Z.b) {
            return new Z.b(R3.a(((Z.b) z10).f7814c, str, null, -32769));
        }
        if (z10 instanceof Z.g) {
            G5 g52 = ((Z.g) z10).f7819c;
            C1130d0 c1130d05 = g52.f5296a;
            A7.b<Integer> activeItemColor = g52.f5297b;
            kotlin.jvm.internal.l.f(activeItemColor, "activeItemColor");
            A7.b<Double> activeItemSize = g52.f5298c;
            kotlin.jvm.internal.l.f(activeItemSize, "activeItemSize");
            A7.b<Double> alpha5 = g52.f5302g;
            kotlin.jvm.internal.l.f(alpha5, "alpha");
            A7.b<G5.a> animation = g52.f5303h;
            kotlin.jvm.internal.l.f(animation, "animation");
            C9 height2 = g52.f5311q;
            kotlin.jvm.internal.l.f(height2, "height");
            A7.b<Integer> inactiveItemColor = g52.f5313s;
            kotlin.jvm.internal.l.f(inactiveItemColor, "inactiveItemColor");
            A7.b<Double> minimumItemSize = g52.f5319y;
            kotlin.jvm.internal.l.f(minimumItemSize, "minimumItemSize");
            AbstractC1339r9 shape = g52.f5281E;
            kotlin.jvm.internal.l.f(shape, "shape");
            W4 spaceBetweenCenters = g52.f5282F;
            kotlin.jvm.internal.l.f(spaceBetweenCenters, "spaceBetweenCenters");
            A7.b<EnumC1356sc> visibility5 = g52.f5291O;
            kotlin.jvm.internal.l.f(visibility5, "visibility");
            C9 width2 = g52.f5294R;
            kotlin.jvm.internal.l.f(width2, "width");
            return new Z.g(new G5(c1130d05, activeItemColor, activeItemSize, g52.f5299d, g52.f5300e, g52.f5301f, alpha5, animation, g52.i, g52.f5304j, g52.f5305k, g52.f5306l, g52.f5307m, g52.f5308n, g52.f5309o, g52.f5310p, height2, str, inactiveItemColor, g52.f5314t, g52.f5315u, g52.f5316v, g52.f5317w, g52.f5318x, minimumItemSize, g52.f5320z, g52.f5277A, g52.f5278B, g52.f5279C, g52.f5280D, shape, spaceBetweenCenters, g52.f5283G, g52.f5284H, g52.f5285I, g52.f5286J, g52.f5287K, g52.f5288L, g52.f5289M, g52.f5290N, visibility5, g52.f5292P, g52.f5293Q, width2));
        }
        if (!(z10 instanceof Z.l)) {
            if (z10 instanceof Z.h) {
                return new Z.h(T5.a(((Z.h) z10).f7820c, str));
            }
            if (z10 instanceof Z.j) {
                return new Z.j(C1139d9.a(((Z.j) z10).f7822c, str));
            }
            if (z10 instanceof Z.q) {
                return new Z.q(C1217ic.a(((Z.q) z10).f7829c, str));
            }
            if (z10 instanceof Z.n) {
                return new Z.n(C1438ya.a(((Z.n) z10).f7826c, str));
            }
            throw new b9.j();
        }
        L9 l92 = ((Z.l) z10).f7824c;
        C1130d0 c1130d06 = l92.f5782a;
        C9 c98 = l92.f5793m;
        AbstractC1293o4 abstractC1293o4 = l92.f5762C;
        AbstractC1293o4 abstractC1293o42 = l92.f5768I;
        AbstractC1293o4 abstractC1293o43 = l92.f5769J;
        C9 c99 = l92.f5780U;
        A7.b<Double> alpha6 = l92.f5785d;
        kotlin.jvm.internal.l.f(alpha6, "alpha");
        A7.b<Boolean> isEnabled = l92.f5795o;
        kotlin.jvm.internal.l.f(isEnabled, "isEnabled");
        A7.b<Long> maxValue = l92.f5798r;
        kotlin.jvm.internal.l.f(maxValue, "maxValue");
        A7.b<Long> minValue = l92.f5799s;
        kotlin.jvm.internal.l.f(minValue, "minValue");
        A7.b<EnumC1356sc> visibility6 = l92.f5777R;
        kotlin.jvm.internal.l.f(visibility6, "visibility");
        return new Z.l(new L9(c1130d06, l92.f5783b, l92.f5784c, alpha6, l92.f5786e, l92.f5787f, l92.f5788g, l92.f5789h, l92.i, l92.f5790j, l92.f5791k, l92.f5792l, c98, str, isEnabled, l92.f5796p, l92.f5797q, maxValue, minValue, l92.f5800t, l92.f5801u, l92.f5802v, l92.f5803w, l92.f5804x, l92.f5805y, l92.f5806z, l92.f5760A, l92.f5761B, abstractC1293o4, l92.f5763D, l92.f5764E, l92.f5765F, l92.f5766G, l92.f5767H, abstractC1293o42, abstractC1293o43, l92.f5770K, l92.f5771L, l92.f5772M, l92.f5773N, l92.f5774O, l92.f5775P, l92.f5776Q, visibility6, l92.f5778S, l92.f5779T, c99));
    }

    public static /* synthetic */ Z f(Z z10) {
        return e(z10, z10.d().getId());
    }

    public static final A7.d g(C1333r3 c1333r3, Object element, int i, A7.d dVar) {
        C5425b c5425b;
        C5425b c5425b2 = dVar instanceof C5425b ? (C5425b) dVar : null;
        if (c5425b2 == null) {
            return dVar;
        }
        kotlin.jvm.internal.l.f(element, "element");
        JSONObject jSONObject = element instanceof JSONObject ? (JSONObject) element : null;
        Q6.c cVar = c5425b2.f44852f;
        if (jSONObject == null) {
            z7.d dVar2 = z7.e.f48479a;
            z7.f fVar = z7.f.TYPE_MISMATCH;
            StringBuilder sbJ = C4356c.j(i, "Item builder data at ", " position has wrong type: ");
            sbJ.append(element.getClass().getName());
            cVar.a(new z7.d(fVar, sbJ.toString(), null, null, null, 28));
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        B7.e eVar = new B7.e(C2078B.o(new b9.l(c1333r3.f9033b, jSONObject), new b9.l("index", Long.valueOf(i))), 8);
        StringBuilder sb = new StringBuilder();
        sb.append(element);
        sb.append(':');
        sb.append(i);
        String pathSegment = sb.toString();
        kotlin.jvm.internal.l.f(pathSegment, "pathSegment");
        s6.j jVar = new s6.j(c5425b2.f44850d, eVar);
        String str = c5425b2.f44848b + '/' + pathSegment;
        n nVar = c5425b2.f44851e.f14211a;
        C5425b c5425b3 = new C5425b(str, c5425b2.f44849c, jVar, new C1668e(new n(jVar, (e0) nVar.f13449b, (H7.e) nVar.f13450c, (I) nVar.f13451d)), cVar, c5425b2.f44853g);
        C5426c c5426cE = c5425b2.f44849c.e(str, null, c5425b3, c5425b2);
        return (c5426cE == null || (c5425b = c5426cE.f44857a) == null) ? c5425b3 : c5425b;
    }

    public static final List<Z> h(R3 r32) {
        kotlin.jvm.internal.l.f(r32, "<this>");
        List<Z> list = r32.f6139q;
        return list == null ? C2099t.f18581b : list;
    }

    public static final List<Z> i(C1405w5 c1405w5) {
        kotlin.jvm.internal.l.f(c1405w5, "<this>");
        List<Z> list = c1405w5.f9719y;
        return list == null ? C2099t.f18581b : list;
    }

    public static final ArrayList j(C1405w5 c1405w5, A7.d resolver) {
        kotlin.jvm.internal.l.f(c1405w5, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        return l(i(c1405w5), resolver);
    }

    public static final ArrayList k(Ba ba2, A7.d resolver) {
        kotlin.jvm.internal.l.f(ba2, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        List<Ba.a> list = ba2.f4949q;
        ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m(((Ba.a) it.next()).f4959a, resolver));
        }
        return arrayList;
    }

    public static final ArrayList l(List list, A7.d resolver) {
        kotlin.jvm.internal.l.f(list, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        List list2 = list;
        ArrayList arrayList = new ArrayList(C2092m.T(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m((Z) it.next(), resolver));
        }
        return arrayList;
    }

    public static final b m(Z z10, A7.d resolver) {
        kotlin.jvm.internal.l.f(z10, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        return new b(z10, resolver);
    }
}
