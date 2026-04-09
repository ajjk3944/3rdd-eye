package K6;

import E6.a;
import N7.AbstractC1239k6;
import N7.InterfaceC1253l6;
import N7.M3;
import N7.S4;
import N7.T5;
import N7.Y7;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import b9.C1992A;
import c9.C2092m;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class H0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T5 f3228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w<E6.a> f3229h;
    public final /* synthetic */ O6.p i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ KeyListener f3230j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3231k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H6.y f3232l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D0 f3233m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q6.c f3234n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(T5 t52, kotlin.jvm.internal.w wVar, O6.p pVar, KeyListener keyListener, A7.d dVar, H6.y yVar, D0 d02, Q6.c cVar) {
        super(1);
        this.f3228g = t52;
        this.f3229h = wVar;
        this.i = pVar;
        this.f3230j = keyListener;
        this.f3231k = dVar;
        this.f3232l = yVar;
        this.f3233m = d02;
        this.f3234n = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p9.l
    public final C1992A invoke(Object obj) {
        Locale locale;
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        AbstractC1239k6 abstractC1239k6 = this.f3228g.f6272H;
        T dVar = 0;
        InterfaceC1253l6 interfaceC1253l6A = abstractC1239k6 != null ? abstractC1239k6.a() : null;
        boolean z10 = interfaceC1253l6A instanceof S4;
        D0 d02 = this.f3233m;
        kotlin.jvm.internal.w<E6.a> wVar = this.f3229h;
        KeyListener keyListener = this.f3230j;
        A7.d dVar2 = this.f3231k;
        O6.p pVar = this.i;
        if (z10) {
            pVar.setKeyListener(keyListener);
            S4 s42 = (S4) interfaceC1253l6A;
            String strA = s42.f6197b.a(dVar2);
            List<S4.a> list = s42.f6198c;
            ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
            for (S4.a aVar : list) {
                String strA2 = aVar.f6201a.a(dVar2);
                kotlin.jvm.internal.l.f(strA2, "<this>");
                if (strA2.length() == 0) {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
                char cCharValue = 0;
                char cCharAt = strA2.charAt(0);
                A7.b<String> bVar = aVar.f6203c;
                String strA3 = bVar != null ? bVar.a(dVar2) : null;
                String strA4 = aVar.f6202b.a(dVar2);
                kotlin.jvm.internal.l.f(strA4, "<this>");
                Character chValueOf = strA4.length() == 0 ? null : Character.valueOf(strA4.charAt(0));
                if (chValueOf != null) {
                    cCharValue = chValueOf.charValue();
                }
                arrayList.add(new a.c(cCharAt, cCharValue, strA3));
            }
            a.b bVar2 = new a.b(strA, arrayList, s42.f6196a.a(dVar2).booleanValue());
            E6.a cVar = wVar.f43660b;
            if (cVar != null) {
                cVar.o(bVar2, true);
            } else {
                cVar = new E6.c(bVar2, new F7.h(d02, 3));
            }
            dVar = cVar;
        } else if (interfaceC1253l6A instanceof M3) {
            A7.b<String> bVar3 = ((M3) interfaceC1253l6A).f5830a;
            String strA5 = bVar3 != null ? bVar3.a(dVar2) : null;
            if (strA5 != null) {
                locale = Locale.forLanguageTag(strA5);
                String languageTag = locale.toLanguageTag();
                if (!kotlin.jvm.internal.l.b(languageTag, strA5)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Original locale tag '" + strA5 + "' is not equals to final one '" + languageTag + '\'');
                    Q6.c cVar2 = this.f3234n;
                    cVar2.f11320d.add(illegalArgumentException);
                    cVar2.b();
                }
            } else {
                locale = Locale.getDefault();
            }
            pVar.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
            E6.a aVar2 = wVar.f43660b;
            E6.a aVar3 = aVar2;
            if (aVar3 != null) {
                kotlin.jvm.internal.l.d(aVar2, "null cannot be cast to non-null type com.yandex.div.core.util.mask.CurrencyInputMask");
                E6.b bVar4 = (E6.b) aVar2;
                kotlin.jvm.internal.l.e(locale, "locale");
                String strY = y9.n.Y(bVar4.q().getDecimalSeparator(), '.', bVar4.i());
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
                kotlin.jvm.internal.l.e(currencyInstance, "getCurrencyInstance(locale)");
                bVar4.p(currencyInstance);
                bVar4.f1465h = currencyInstance;
                bVar4.a(y9.n.Y('.', bVar4.q().getDecimalSeparator(), strY), null);
                dVar = aVar3;
            } else {
                kotlin.jvm.internal.l.e(locale, "locale");
                dVar = new E6.b(locale, new C0749p(d02, 1));
            }
        } else if (interfaceC1253l6A instanceof Y7) {
            pVar.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
            E6.a aVar4 = wVar.f43660b;
            if (aVar4 != null) {
                aVar4.o(E6.e.f1469b, true);
                dVar = aVar4;
            } else {
                dVar = new E6.d(new E7.a(d02, 2));
            }
        } else {
            pVar.setKeyListener(keyListener);
        }
        wVar.f43660b = dVar;
        this.f3232l.invoke(dVar);
        return C1992A.f18074a;
    }
}
