package kotlin.collections.builders;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u000b\b\u0000\u0018\u0000 \u0085\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\f\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001BG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0001\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u001dJ\u0017\u0010,\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0004\b,\u0010$J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00028\u0001H\u0002¢\u0006\u0004\b.\u0010$J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u0013J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u0013J\u001f\u00105\u001a\u00020\u001b2\u000e\u00104\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000303H\u0002¢\u0006\u0004\b5\u00106J#\u00109\u001a\u00020\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107H\u0002¢\u0006\u0004\b9\u0010:J)\u0010=\u001a\u00020\u001b2\u0018\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001070;H\u0002¢\u0006\u0004\b=\u0010>J\u0019\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103¢\u0006\u0004\b\u0018\u0010?J\u000f\u0010@\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u001b2\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\bD\u0010CJ\u001a\u0010E\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bE\u0010FJ!\u0010G\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u00020\u00172\u0014\u0010<\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0016¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\bK\u0010FJ\u000f\u0010L\u001a\u00020\u0017H\u0016¢\u0006\u0004\bL\u0010\u0011J\u001a\u0010M\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\bM\u0010CJ\u000f\u0010N\u001a\u00020\fH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0017H\u0000¢\u0006\u0004\bS\u0010\u0011J\u0017\u0010T\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\bT\u0010$J\u0017\u0010U\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\bU\u0010CJ#\u0010V\u001a\u00020\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107H\u0000¢\u0006\u0004\bV\u0010:J\u001b\u0010W\u001a\u00020\u001b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030;H\u0000¢\u0006\u0004\bW\u0010>J#\u0010X\u001a\u00020\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107H\u0000¢\u0006\u0004\bX\u0010:J\u0017\u0010Z\u001a\u00020\u001b2\u0006\u0010Y\u001a\u00028\u0001H\u0000¢\u0006\u0004\bZ\u0010CJ\u001b\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0000¢\u0006\u0004\b\\\u0010]J\u001b\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010^H\u0000¢\u0006\u0004\b_\u0010`J\u001b\u0010b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010aH\u0000¢\u0006\u0004\bb\u0010cR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010dR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010dR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010eR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010eR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00109R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0016\u0010f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u00109R\u0016\u0010g\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u00109R$\u0010h\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bh\u00109\u001a\u0004\bi\u0010OR\u001e\u0010k\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001e\u0010n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR$\u0010q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010s\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010AR\u0014\u0010w\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010OR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00010|8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R)\u0010\u0082\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0080\u00010x8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010zR\u0016\u0010\u0084\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010O¨\u0006\u008b\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "Ly8/s;", "n", "u", "extraCapacity", "", "R", "(I)Z", "minCapacity", "t", "m", "()[Ljava/lang/Object;", "key", "E", "(Ljava/lang/Object;)I", "updateHashArray", TtmlNode.TAG_P, "(Z)V", "newHashSize", "L", "i", "J", "w", AppMeasurementSdk.ConditionalUserProperty.VALUE, "x", "index", "N", "removedHash", "O", "", "other", "s", "(Ljava/util/Map;)Z", "", "entry", "I", "(Ljava/util/Map$Entry;)Z", "", "from", "H", "(Ljava/util/Collection;)Z", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "o", "l", "P", "r", CampaignEx.JSON_KEY_AD_Q, "M", "element", "Q", "Lkotlin/collections/builders/MapBuilder$e;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Lkotlin/collections/builders/MapBuilder$e;", "Lkotlin/collections/builders/MapBuilder$f;", "S", "()Lkotlin/collections/builders/MapBuilder$f;", "Lkotlin/collections/builders/MapBuilder$b;", "v", "()Lkotlin/collections/builders/MapBuilder$b;", "[Ljava/lang/Object;", "[I", "hashShift", "modCount", "size", "C", "Lkotlin/collections/builders/b;", "keysView", "Lkotlin/collections/builders/b;", "Lkotlin/collections/builders/c;", "valuesView", "Lkotlin/collections/builders/c;", "Lkotlin/collections/builders/a;", "entriesView", "Lkotlin/collections/builders/a;", "isReadOnly", "Z", "F", "A", "hashSize", "", "B", "()Ljava/util/Set;", "keys", "", "D", "()Ljava/util/Collection;", "values", "", "z", "entries", "y", "capacity", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "f", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,747:1\n1#2:748\n*E\n"})
/* loaded from: classes4.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, m9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public static final MapBuilder f21957b;

    @Nullable
    private a entriesView;

    @NotNull
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;

    @NotNull
    private K[] keysArray;

    @Nullable
    private kotlin.collections.builders.b keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;

    @NotNull
    private int[] presenceArray;
    private int size;

    @Nullable
    private V[] valuesArray;

    @Nullable
    private kotlin.collections.builders.c valuesView;

    /* renamed from: kotlin.collections.builders.MapBuilder$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final int c(int i10) {
            return Integer.highestOneBit(q9.e.b(i10, 1) * 3);
        }

        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final MapBuilder e() {
            return MapBuilder.f21957b;
        }

        public Companion() {
        }
    }

    public static final class b extends d implements Iterator, m9.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MapBuilder map) {
            super(map);
            p.e(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (c() >= e().length) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            c cVar = new c(e(), d());
            f();
            return cVar;
        }

        public final void j(StringBuilder sb) {
            p.e(sb, "sb");
            if (c() >= e().length) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            Object obj = e().keysArray[d()];
            if (obj == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = e().valuesArray;
            p.b(objArr);
            Object obj2 = objArr[d()];
            if (obj2 == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            f();
        }

        public final int k() {
            if (c() >= e().length) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            Object obj = e().keysArray[d()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = e().valuesArray;
            p.b(objArr);
            Object obj2 = objArr[d()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    public static final class c implements Map.Entry, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final MapBuilder f21958a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21959b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21960c;

        public c(MapBuilder map, int i10) {
            p.e(map, "map");
            this.f21958a = map;
            this.f21959b = i10;
            this.f21960c = map.modCount;
        }

        private final void a() {
            if (this.f21958a.modCount != this.f21960c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return p.a(entry.getKey(), getKey()) && p.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            a();
            return this.f21958a.keysArray[this.f21959b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a();
            Object[] objArr = this.f21958a.valuesArray;
            p.b(objArr);
            return objArr[this.f21959b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            this.f21958a.o();
            Object[] objArrM = this.f21958a.m();
            int i10 = this.f21959b;
            Object obj2 = objArrM[i10];
            objArrM[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final MapBuilder f21961a;

        /* renamed from: b, reason: collision with root package name */
        public int f21962b;

        /* renamed from: c, reason: collision with root package name */
        public int f21963c;

        /* renamed from: d, reason: collision with root package name */
        public int f21964d;

        public d(MapBuilder map) {
            p.e(map, "map");
            this.f21961a = map;
            this.f21963c = -1;
            this.f21964d = map.modCount;
            f();
        }

        public final void a() {
            if (this.f21961a.modCount != this.f21964d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.f21962b;
        }

        public final int d() {
            return this.f21963c;
        }

        public final MapBuilder e() {
            return this.f21961a;
        }

        public final void f() {
            while (this.f21962b < this.f21961a.length) {
                int[] iArr = this.f21961a.presenceArray;
                int i10 = this.f21962b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f21962b = i10 + 1;
                }
            }
        }

        public final void g(int i10) {
            this.f21962b = i10;
        }

        public final void h(int i10) {
            this.f21963c = i10;
        }

        public final boolean hasNext() {
            return this.f21962b < this.f21961a.length;
        }

        public final void remove() {
            a();
            if (this.f21963c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f21961a.o();
            this.f21961a.N(this.f21963c);
            this.f21963c = -1;
            this.f21964d = this.f21961a.modCount;
        }
    }

    public static final class e extends d implements Iterator, m9.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MapBuilder map) {
            super(map);
            p.e(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (c() >= e().length) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            Object obj = e().keysArray[d()];
            f();
            return obj;
        }
    }

    public static final class f extends d implements Iterator, m9.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MapBuilder map) {
            super(map);
            p.e(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (c() >= e().length) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            Object[] objArr = e().valuesArray;
            p.b(objArr);
            Object obj = objArr[d()];
            f();
            return obj;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        f21957b = mapBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapBuilder(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.keysArray = objArr;
        this.valuesArray = objArr2;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i10;
        this.length = i11;
        this.hashShift = INSTANCE.d(A());
    }

    private final void t(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > y()) {
            int iE = z8.d.Companion.e(y(), minCapacity);
            this.keysArray = (K[]) a9.b.e(this.keysArray, iE);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) a9.b.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iE);
            p.d(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iC = INSTANCE.c(iE);
            if (iC > A()) {
                L(iC);
            }
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int A() {
        return this.hashArray.length;
    }

    public Set B() {
        kotlin.collections.builders.b bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        kotlin.collections.builders.b bVar2 = new kotlin.collections.builders.b(this);
        this.keysView = bVar2;
        return bVar2;
    }

    /* renamed from: C, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public Collection D() {
        kotlin.collections.builders.c cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c cVar2 = new kotlin.collections.builders.c(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    public final int E(Object key) {
        return ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    /* renamed from: F, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final e G() {
        return new e(this);
    }

    public final boolean H(Collection from) {
        boolean z10 = false;
        if (from.isEmpty()) {
            return false;
        }
        u(from.size());
        Iterator it = from.iterator();
        while (it.hasNext()) {
            if (I((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean I(Map.Entry entry) {
        int iL = l(entry.getKey());
        Object[] objArrM = m();
        if (iL >= 0) {
            objArrM[iL] = entry.getValue();
            return true;
        }
        int i10 = (-iL) - 1;
        if (p.a(entry.getValue(), objArrM[i10])) {
            return false;
        }
        objArrM[i10] = entry.getValue();
        return true;
    }

    public final boolean J(int i10) {
        int iE = E(this.keysArray[i10]);
        int i11 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iE] == 0) {
                iArr[iE] = i10 + 1;
                this.presenceArray[i10] = iE;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iE = iE == 0 ? A() - 1 : iE - 1;
        }
    }

    public final void K() {
        this.modCount++;
    }

    public final void L(int newHashSize) {
        K();
        int i10 = 0;
        if (this.length > size()) {
            p(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.d(newHashSize);
        while (i10 < this.length) {
            int i11 = i10 + 1;
            if (!J(i10)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i10 = i11;
        }
    }

    public final boolean M(Map.Entry entry) {
        p.e(entry, "entry");
        o();
        int iW = w(entry.getKey());
        if (iW < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        p.b(vArr);
        if (!p.a(vArr[iW], entry.getValue())) {
            return false;
        }
        N(iW);
        return true;
    }

    public final void N(int index) {
        a9.b.f(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            a9.b.f(vArr, index);
        }
        O(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        K();
    }

    public final void O(int removedHash) {
        int iD = q9.e.d(this.maxProbeDistance * 2, A() / 2);
        int i10 = 0;
        int i11 = removedHash;
        do {
            removedHash = removedHash == 0 ? A() - 1 : removedHash - 1;
            i10++;
            if (i10 > this.maxProbeDistance) {
                this.hashArray[i11] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i12 = iArr[removedHash];
            if (i12 == 0) {
                iArr[i11] = 0;
                return;
            }
            if (i12 < 0) {
                iArr[i11] = -1;
            } else {
                int i13 = i12 - 1;
                if (((E(this.keysArray[i13]) - removedHash) & (A() - 1)) >= i10) {
                    this.hashArray[i11] = i12;
                    this.presenceArray[i13] = i11;
                }
                iD--;
            }
            i11 = removedHash;
            i10 = 0;
            iD--;
        } while (iD >= 0);
        this.hashArray[i11] = -1;
    }

    public final boolean P(Object key) {
        o();
        int iW = w(key);
        if (iW < 0) {
            return false;
        }
        N(iW);
        return true;
    }

    public final boolean Q(Object element) {
        o();
        int iX = x(element);
        if (iX < 0) {
            return false;
        }
        N(iX);
        return true;
    }

    public final boolean R(int extraCapacity) {
        int iY = y();
        int i10 = this.length;
        int i11 = iY - i10;
        int size = i10 - size();
        return i11 < extraCapacity && i11 + size >= extraCapacity && size >= y() / 4;
    }

    public final f S() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        o();
        int i10 = this.length - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.hashArray[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        a9.b.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            a9.b.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        K();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return w(key) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return x(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return z();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Map) && s((Map) other);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object key) {
        int iW = w(key);
        if (iW < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        p.b(vArr);
        return vArr[iW];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarV = v();
        int iK = 0;
        while (bVarV.hasNext()) {
            iK += bVarV.k();
        }
        return iK;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return B();
    }

    public final int l(Object key) {
        o();
        while (true) {
            int iE = E(key);
            int iD = q9.e.d(this.maxProbeDistance * 2, A() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.hashArray[iE];
                if (i11 <= 0) {
                    if (this.length < y()) {
                        int i12 = this.length;
                        int i13 = i12 + 1;
                        this.length = i13;
                        ((K[]) this.keysArray)[i12] = key;
                        this.presenceArray[i12] = iE;
                        this.hashArray[iE] = i13;
                        this.size = size() + 1;
                        K();
                        if (i10 > this.maxProbeDistance) {
                            this.maxProbeDistance = i10;
                        }
                        return i12;
                    }
                    u(1);
                } else {
                    if (p.a(this.keysArray[i11 - 1], key)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iD) {
                        L(A() * 2);
                        break;
                    }
                    iE = iE == 0 ? A() - 1 : iE - 1;
                }
            }
        }
    }

    public final Object[] m() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) a9.b.d(y());
        this.valuesArray = vArr2;
        return vArr2;
    }

    public final Map n() {
        o();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f21957b;
        p.c(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void o() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public final void p(boolean updateHashArray) {
        int i10;
        V[] vArr = this.valuesArray;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.length;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (updateHashArray) {
                    iArr[i12] = i13;
                    this.hashArray[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        a9.b.g(this.keysArray, i12, i10);
        if (vArr != null) {
            a9.b.g(vArr, i12, this.length);
        }
        this.length = i12;
    }

    @Override // java.util.Map
    public Object put(Object key, Object value) {
        o();
        int iL = l(key);
        Object[] objArrM = m();
        if (iL >= 0) {
            objArrM[iL] = value;
            return null;
        }
        int i10 = (-iL) - 1;
        Object obj = objArrM[i10];
        objArrM[i10] = value;
        return obj;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        p.e(from, "from");
        o();
        H(from.entrySet());
    }

    public final boolean q(Collection m10) {
        p.e(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!r((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean r(Map.Entry entry) {
        p.e(entry, "entry");
        int iW = w(entry.getKey());
        if (iW < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        p.b(vArr);
        return p.a(vArr[iW], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object key) {
        o();
        int iW = w(key);
        if (iW < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        p.b(vArr);
        V v10 = vArr[iW];
        N(iW);
        return v10;
    }

    public final boolean s(Map other) {
        return size() == other.size() && q(other.entrySet());
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarV = v();
        int i10 = 0;
        while (bVarV.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            bVarV.j(sb);
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        p.d(string, "toString(...)");
        return string;
    }

    public final void u(int n10) {
        if (R(n10)) {
            p(true);
        } else {
            t(this.length + n10);
        }
    }

    public final b v() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return D();
    }

    public final int w(Object key) {
        int iE = E(key);
        int i10 = this.maxProbeDistance;
        while (true) {
            int i11 = this.hashArray[iE];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (p.a(this.keysArray[i12], key)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iE = iE == 0 ? A() - 1 : iE - 1;
        }
    }

    public final int x(Object value) {
        int i10 = this.length;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.presenceArray[i10] >= 0) {
                V[] vArr = this.valuesArray;
                p.b(vArr);
                if (p.a(vArr[i10], value)) {
                    return i10;
                }
            }
        }
    }

    public final int y() {
        return this.keysArray.length;
    }

    public Set z() {
        a aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i10) {
        this(a9.b.d(i10), null, new int[i10], new int[INSTANCE.c(i10)], 2, 0);
    }
}
