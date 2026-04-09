package kotlin.text;

import Zg.AbstractC3670b;
import Zg.AbstractC3672d;
import Zg.AbstractC3689v;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6519m;
import kotlin.text.InterfaceC6518l;
import mh.InterfaceC6835l;
import sh.C7974i;
import zi.AbstractC8783m;

/* renamed from: kotlin.text.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6519m implements InterfaceC6518l {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f52272a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f52273b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6517k f52274c;

    /* renamed from: d, reason: collision with root package name */
    private List f52275d;

    /* renamed from: kotlin.text.m$a */
    public static final class a extends AbstractC3672d {
        a() {
        }

        public /* bridge */ int C(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int J(String str) {
            return super.lastIndexOf(str);
        }

        @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return v((String) obj);
            }
            return false;
        }

        @Override // Zg.AbstractC3672d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return C((String) obj);
            }
            return -1;
        }

        @Override // Zg.AbstractC3670b
        public int j() {
            return C6519m.this.f().groupCount() + 1;
        }

        @Override // Zg.AbstractC3672d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return J((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean v(String str) {
            return super.contains(str);
        }

        @Override // Zg.AbstractC3672d, java.util.List
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = C6519m.this.f().group(i10);
            return strGroup == null ? "" : strGroup;
        }
    }

    /* renamed from: kotlin.text.m$b */
    public static final class b extends AbstractC3670b implements InterfaceC6517k {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6516j C(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C6516j) {
                return y((C6516j) obj);
            }
            return false;
        }

        @Override // kotlin.text.InterfaceC6517k
        public C6516j get(int i10) {
            C7974i c7974iH = q.h(C6519m.this.f(), i10);
            if (c7974iH.e().intValue() < 0) {
                return null;
            }
            String strGroup = C6519m.this.f().group(i10);
            AbstractC6492s.h(strGroup, "group(...)");
            return new C6516j(strGroup, c7974iH);
        }

        @Override // Zg.AbstractC3670b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC8783m.N(AbstractC3689v.d0(AbstractC3689v.m(this)), new InterfaceC6835l() { // from class: kotlin.text.n
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C6519m.b.C(this.f52278a, ((Integer) obj).intValue());
                }
            }).iterator();
        }

        @Override // Zg.AbstractC3670b
        public int j() {
            return C6519m.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean y(C6516j c6516j) {
            return super.contains(c6516j);
        }
    }

    public C6519m(Matcher matcher, CharSequence input) {
        AbstractC6492s.i(matcher, "matcher");
        AbstractC6492s.i(input, "input");
        this.f52272a = matcher;
        this.f52273b = input;
        this.f52274c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult f() {
        return this.f52272a;
    }

    @Override // kotlin.text.InterfaceC6518l
    public InterfaceC6518l.b a() {
        return InterfaceC6518l.a.a(this);
    }

    @Override // kotlin.text.InterfaceC6518l
    public List b() {
        if (this.f52275d == null) {
            this.f52275d = new a();
        }
        List list = this.f52275d;
        AbstractC6492s.f(list);
        return list;
    }

    @Override // kotlin.text.InterfaceC6518l
    public InterfaceC6517k c() {
        return this.f52274c;
    }

    @Override // kotlin.text.InterfaceC6518l
    public C7974i d() {
        return q.g(f());
    }

    @Override // kotlin.text.InterfaceC6518l
    public String getValue() {
        String strGroup = f().group();
        AbstractC6492s.h(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.InterfaceC6518l
    public InterfaceC6518l next() {
        int iEnd = f().end() + (f().end() == f().start() ? 1 : 0);
        if (iEnd > this.f52273b.length()) {
            return null;
        }
        Matcher matcher = this.f52272a.pattern().matcher(this.f52273b);
        AbstractC6492s.h(matcher, "matcher(...)");
        return q.e(matcher, iEnd, this.f52273b);
    }
}
