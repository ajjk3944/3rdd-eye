package kotlin.coroutines;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import y8.s;

@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000f*\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*¨\u0006,"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", TtmlNode.LEFT, "Lkotlin/coroutines/d$b;", "element", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/d$b;)V", "", CampaignEx.JSON_KEY_AD_K, "()I", "", "writeReplace", "()Ljava/lang/Object;", "E", "Lkotlin/coroutines/d$c;", "key", "get", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Ll9/p;)Ljava/lang/Object;", "minusKey", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "e", "(Lkotlin/coroutines/d$b;)Z", "context", "i", "(Lkotlin/coroutines/CombinedContext;)Z", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/d$b;", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
/* loaded from: classes4.dex */
public final class CombinedContext implements d, Serializable {

    @NotNull
    private final d.b element;

    @NotNull
    private final d left;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "Lkotlin/coroutines/d;", "elements", "<init>", "([Lkotlin/coroutines/d;)V", "", "readResolve", "()Ljava/lang/Object;", "[Lkotlin/coroutines/d;", "getElements", "()[Lkotlin/coroutines/d;", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12813#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;

        @NotNull
        private final d[] elements;

        public Serialized(d[] elements) {
            p.e(elements, "elements");
            this.elements = elements;
        }

        private final Object readResolve() {
            d[] dVarArr = this.elements;
            d dVarPlus = EmptyCoroutineContext.f21979a;
            for (d dVar : dVarArr) {
                dVarPlus = dVarPlus.plus(dVar);
            }
            return dVarPlus;
        }
    }

    public CombinedContext(d left, d.b element) {
        p.e(left, "left");
        p.e(element, "element");
        this.left = left;
        this.element = element;
    }

    private final int k() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            d dVar = combinedContext.left;
            combinedContext = dVar instanceof CombinedContext ? (CombinedContext) dVar : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    public static final String n(String acc, d.b element) {
        p.e(acc, "acc");
        p.e(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    public static final s s(d[] dVarArr, Ref$IntRef ref$IntRef, s sVar, d.b element) {
        p.e(sVar, "<unused var>");
        p.e(element, "element");
        int i10 = ref$IntRef.element;
        ref$IntRef.element = i10 + 1;
        dVarArr[i10] = element;
        return s.f25199a;
    }

    private final Object writeReplace() {
        int iK = k();
        final d[] dVarArr = new d[iK];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(s.f25199a, new l9.p() { // from class: c9.a
            @Override // l9.p
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.s(dVarArr, ref$IntRef, (s) obj, (d.b) obj2);
            }
        });
        if (ref$IntRef.element == iK) {
            return new Serialized(dVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean e(d.b element) {
        return p.a(get(element.getKey()), element);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CombinedContext)) {
            return false;
        }
        CombinedContext combinedContext = (CombinedContext) other;
        return combinedContext.k() == k() && combinedContext.i(this);
    }

    @Override // kotlin.coroutines.d
    public Object fold(Object initial, l9.p operation) {
        p.e(operation, "operation");
        return operation.invoke(this.left.fold(initial, operation), this.element);
    }

    @Override // kotlin.coroutines.d
    public d.b get(d.c key) {
        p.e(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            d.b bVar = combinedContext.element.get(key);
            if (bVar != null) {
                return bVar;
            }
            d dVar = combinedContext.left;
            if (!(dVar instanceof CombinedContext)) {
                return dVar.get(key);
            }
            combinedContext = (CombinedContext) dVar;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public final boolean i(CombinedContext context) {
        while (e(context.element)) {
            d dVar = context.left;
            if (!(dVar instanceof CombinedContext)) {
                p.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return e((d.b) dVar);
            }
            context = (CombinedContext) dVar;
        }
        return false;
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c key) {
        p.e(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        d dVarMinusKey = this.left.minusKey(key);
        return dVarMinusKey == this.left ? this : dVarMinusKey == EmptyCoroutineContext.f21979a ? this.element : new CombinedContext(dVarMinusKey, this.element);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.a.b(this, dVar);
    }

    public String toString() {
        return '[' + ((String) fold("", new l9.p() { // from class: c9.b
            @Override // l9.p
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.n((String) obj, (d.b) obj2);
            }
        })) + ']';
    }
}
