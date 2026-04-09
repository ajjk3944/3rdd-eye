package kotlin.text;

import Zg.AbstractC3689v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public final class p implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52282b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f52283a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        private a() {
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f52284a = new b();

        b() {
            super(1, InterfaceC6518l.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6518l invoke(InterfaceC6518l p02) {
            AbstractC6492s.i(p02, "p0");
            return p02.next();
        }
    }

    public p(Pattern nativePattern) {
        AbstractC6492s.i(nativePattern, "nativePattern");
        this.f52283a = nativePattern;
    }

    public static /* synthetic */ InterfaceC6518l d(p pVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pVar.c(charSequence, i10);
    }

    public static /* synthetic */ InterfaceC8780j h(p pVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pVar.g(charSequence, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6518l j(p pVar, CharSequence charSequence, int i10) {
        return pVar.c(charSequence, i10);
    }

    public final InterfaceC6518l c(CharSequence input, int i10) {
        AbstractC6492s.i(input, "input");
        Matcher matcher = this.f52283a.matcher(input);
        AbstractC6492s.h(matcher, "matcher(...)");
        return q.e(matcher, i10, input);
    }

    public final InterfaceC8780j g(final CharSequence input, final int i10) {
        AbstractC6492s.i(input, "input");
        if (i10 >= 0 && i10 <= input.length()) {
            return AbstractC8783m.p(new InterfaceC6824a() { // from class: kotlin.text.o
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return p.j(this.f52279a, input, i10);
                }
            }, b.f52284a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + input.length());
    }

    public final InterfaceC6518l l(CharSequence input) {
        AbstractC6492s.i(input, "input");
        Matcher matcher = this.f52283a.matcher(input);
        AbstractC6492s.h(matcher, "matcher(...)");
        return q.f(matcher, input);
    }

    public final boolean m(CharSequence input) {
        AbstractC6492s.i(input, "input");
        return this.f52283a.matcher(input).matches();
    }

    public final String n(CharSequence input, String replacement) {
        AbstractC6492s.i(input, "input");
        AbstractC6492s.i(replacement, "replacement");
        String strReplaceAll = this.f52283a.matcher(input).replaceAll(replacement);
        AbstractC6492s.h(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String o(CharSequence input, InterfaceC6835l transform) {
        AbstractC6492s.i(input, "input");
        AbstractC6492s.i(transform, "transform");
        int iIntValue = 0;
        InterfaceC6518l interfaceC6518lD = d(this, input, 0, 2, null);
        if (interfaceC6518lD == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, interfaceC6518lD.d().e().intValue());
            sb2.append((CharSequence) transform.invoke(interfaceC6518lD));
            iIntValue = interfaceC6518lD.d().g().intValue() + 1;
            interfaceC6518lD = interfaceC6518lD.next();
            if (iIntValue >= length) {
                break;
            }
        } while (interfaceC6518lD != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public final List p(CharSequence input, int i10) {
        AbstractC6492s.i(input, "input");
        I.L0(i10);
        Matcher matcher = this.f52283a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return AbstractC3689v.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? AbstractC7978m.g(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f52283a.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(String pattern) {
        AbstractC6492s.i(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC6492s.h(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(String pattern, r option) {
        AbstractC6492s.i(pattern, "pattern");
        AbstractC6492s.i(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, f52282b.b(option.getValue()));
        AbstractC6492s.h(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
