package kotlin.collections.builders;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z8.d;
import z8.f;
import z8.m;
import z8.q;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 `*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003`abB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0001\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u001dJ5\u0010+\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010*\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u00028\u00002\u0006\u00101\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b2\u0010&J \u00103\u001a\u00028\u00002\u0006\u00101\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b7\u00106J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010>J\u0017\u0010?\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010?\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010 J\u001d\u0010A\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\bA\u0010BJ%\u0010A\u001a\u00020\u00192\u0006\u00101\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\bA\u0010CJ\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u0011J\u0017\u0010E\u001a\u00028\u00002\u0006\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\bE\u0010&J\u0017\u0010F\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bF\u0010@J\u001d\u0010G\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\bG\u0010BJ\u001d\u0010H\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\bH\u0010BJ%\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bK\u0010LJ)\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010N\"\u0004\b\u0001\u0010M2\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00010NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0NH\u0016¢\u0006\u0004\bP\u0010RJ\u001a\u0010S\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\bS\u0010@J\u000f\u0010T\u001a\u00020\bH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010+R\u0016\u0010\\\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010U¨\u0006c"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lz8/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "Ly8/s;", "F", "()V", "A", "n", "D", "minCapacity", "C", "", "other", "", "B", "(Ljava/util/List;)Z", "i", "(II)V", "element", "y", "(ILjava/lang/Object;)V", "", "elements", "x", "(ILjava/util/Collection;I)V", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "H", "retain", "I", "(IILjava/util/Collection;Z)I", "z", "()Ljava/util/List;", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "e", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "backing", "[Ljava/lang/Object;", "length", "isReadOnly", "Z", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "size", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
/* loaded from: classes4.dex */
public final class ListBuilder<E> extends f implements List<E>, RandomAccess, Serializable, m9.b {

    /* renamed from: b, reason: collision with root package name */
    public static final ListBuilder f21947b;

    @NotNull
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001bBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001b\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0002¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010-J5\u0010/\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u00102J\u0018\u00104\u001a\u00028\u00012\u0006\u00103\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b4\u0010)J \u00105\u001a\u00028\u00012\u0006\u00103\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b9\u00108J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010:H\u0096\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010=H\u0016¢\u0006\u0004\b>\u0010?J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010=2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010@J\u0017\u0010A\u001a\u00020\u001c2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010A\u001a\u00020\u00152\u0006\u00103\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\bA\u0010\"J\u001d\u0010C\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bC\u0010DJ%\u0010C\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bC\u0010EJ\u000f\u0010F\u001a\u00020\u0015H\u0016¢\u0006\u0004\bF\u0010\u0017J\u0017\u0010G\u001a\u00028\u00012\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010)J\u0017\u0010H\u001a\u00020\u001c2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\bH\u0010BJ\u001d\u0010I\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bI\u0010DJ\u001d\u0010J\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bJ\u0010DJ%\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010NJ)\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u0010O2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\bH\u0016¢\u0006\u0004\bQ\u0010SJ\u001a\u0010T\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\bT\u0010BJ\u000f\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010[R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010[R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\\R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010]R\u0014\u0010_\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u00102R\u0014\u0010a\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010V¨\u0006c"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lz8/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "Lkotlin/collections/builders/ListBuilder;", "root", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ly8/s;", "z", "()V", "v", "w", "", "other", "", "x", "(Ljava/util/List;)Z", "i", "element", "u", "(ILjava/lang/Object;)V", "", "elements", "n", "s", "(ILjava/util/Collection;I)V", "A", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "B", "(II)V", "retain", "C", "(IILjava/util/Collection;Z)I", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "e", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[Ljava/lang/Object;", "I", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "Lkotlin/collections/builders/ListBuilder;", "y", "isReadOnly", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "size", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuilderSubList<E> extends f implements List<E>, RandomAccess, Serializable, m9.b {

        @NotNull
        private E[] backing;
        private int length;
        private final int offset;

        @Nullable
        private final BuilderSubList<E> parent;

        @NotNull
        private final ListBuilder<E> root;

        public static final class a implements ListIterator, m9.a {

            /* renamed from: a, reason: collision with root package name */
            public final BuilderSubList f21948a;

            /* renamed from: b, reason: collision with root package name */
            public int f21949b;

            /* renamed from: c, reason: collision with root package name */
            public int f21950c;

            /* renamed from: d, reason: collision with root package name */
            public int f21951d;

            public a(BuilderSubList list, int i10) {
                p.e(list, "list");
                this.f21948a = list;
                this.f21949b = i10;
                this.f21950c = -1;
                this.f21951d = ((AbstractList) list).modCount;
            }

            public final void a() {
                if (((AbstractList) this.f21948a.root).modCount != this.f21951d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a();
                BuilderSubList builderSubList = this.f21948a;
                int i10 = this.f21949b;
                this.f21949b = i10 + 1;
                builderSubList.add(i10, obj);
                this.f21950c = -1;
                this.f21951d = ((AbstractList) this.f21948a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f21949b < this.f21948a.length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f21949b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                a();
                if (this.f21949b >= this.f21948a.length) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f21949b;
                this.f21949b = i10 + 1;
                this.f21950c = i10;
                return this.f21948a.backing[this.f21948a.offset + this.f21950c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f21949b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                a();
                int i10 = this.f21949b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f21949b = i11;
                this.f21950c = i11;
                return this.f21948a.backing[this.f21948a.offset + this.f21950c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f21949b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f21950c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f21948a.remove(i10);
                this.f21949b = this.f21950c;
                this.f21950c = -1;
                this.f21951d = ((AbstractList) this.f21948a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a();
                int i10 = this.f21950c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f21948a.set(i10, obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderSubList(Object[] backing, int i10, int i11, BuilderSubList builderSubList, ListBuilder root) {
            p.e(backing, "backing");
            p.e(root, "root");
            this.backing = backing;
            this.offset = i10;
            this.length = i11;
            this.parent = builderSubList;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void v() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final Object writeReplace() throws NotSerializableException {
            if (y()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void z() {
            ((AbstractList) this).modCount++;
        }

        public final Object A(int i10) {
            z();
            BuilderSubList<E> builderSubList = this.parent;
            this.length--;
            return builderSubList != null ? builderSubList.A(i10) : this.root.G(i10);
        }

        public final void B(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                z();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.B(rangeOffset, rangeLength);
            } else {
                this.root.H(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        public final int C(int rangeOffset, int rangeLength, Collection elements, boolean retain) {
            BuilderSubList<E> builderSubList = this.parent;
            int iC = builderSubList != null ? builderSubList.C(rangeOffset, rangeLength, elements, retain) : this.root.I(rangeOffset, rangeLength, elements, retain);
            if (iC > 0) {
                z();
            }
            this.length -= iC;
            return iC;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object element) {
            w();
            v();
            u(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            p.e(elements, "elements");
            w();
            v();
            int size = elements.size();
            s(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            w();
            v();
            B(this.offset, this.length);
        }

        @Override // z8.f
        /* renamed from: d */
        public int getLength() {
            v();
            return this.length;
        }

        @Override // z8.f
        public Object e(int index) {
            w();
            v();
            d.Companion.b(index, this.length);
            return A(this.offset + index);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object other) {
            v();
            if (other != this) {
                return (other instanceof List) && x((List) other);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int index) {
            v();
            d.Companion.b(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            v();
            return a9.b.i(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            v();
            for (int i10 = 0; i10 < this.length; i10++) {
                if (p.a(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            v();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            v();
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (p.a(this.backing[this.offset + i10], element)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            w();
            v();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            p.e(elements, "elements");
            w();
            v();
            return C(this.offset, this.length, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            p.e(elements, "elements");
            w();
            v();
            return C(this.offset, this.length, elements, true) > 0;
        }

        public final void s(int i10, Collection elements, int n10) {
            z();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.s(i10, elements, n10);
            } else {
                this.root.x(i10, elements, n10);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += n10;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int index, Object element) {
            w();
            v();
            d.Companion.b(index, this.length);
            Object[] objArr = this.backing;
            int i10 = this.offset;
            Object obj = objArr[i10 + index];
            objArr[i10 + index] = element;
            return obj;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int fromIndex, int toIndex) {
            d.Companion.d(fromIndex, toIndex, this.length);
            return new BuilderSubList(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            p.e(array, "array");
            v();
            int length = array.length;
            int i10 = this.length;
            if (length >= i10) {
                E[] eArr = this.backing;
                int i11 = this.offset;
                m.g(eArr, array, 0, i11, i10 + i11);
                return q.f(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i12 = this.offset;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(eArr2, i12, i10 + i12, array.getClass());
            p.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            v();
            return a9.b.j(this.backing, this.offset, this.length, this);
        }

        public final void u(int i10, Object element) {
            z();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.u(i10, element);
            } else {
                this.root.y(i10, element);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        public final void w() {
            if (y()) {
                throw new UnsupportedOperationException();
            }
        }

        public final boolean x(List other) {
            return a9.b.h(this.backing, this.offset, this.length, other);
        }

        public final boolean y() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int index) {
            v();
            d.Companion.c(index, this.length);
            return new a(this, index);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, Object element) {
            w();
            v();
            d.Companion.c(index, this.length);
            u(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection elements) {
            p.e(elements, "elements");
            w();
            v();
            d.Companion.c(index, this.length);
            int size = elements.size();
            s(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            v();
            E[] eArr = this.backing;
            int i10 = this.offset;
            return m.l(eArr, i10, this.length + i10);
        }
    }

    public static final class b implements ListIterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final ListBuilder f21952a;

        /* renamed from: b, reason: collision with root package name */
        public int f21953b;

        /* renamed from: c, reason: collision with root package name */
        public int f21954c;

        /* renamed from: d, reason: collision with root package name */
        public int f21955d;

        public b(ListBuilder list, int i10) {
            p.e(list, "list");
            this.f21952a = list;
            this.f21953b = i10;
            this.f21954c = -1;
            this.f21955d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f21952a).modCount != this.f21955d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            ListBuilder listBuilder = this.f21952a;
            int i10 = this.f21953b;
            this.f21953b = i10 + 1;
            listBuilder.add(i10, obj);
            this.f21954c = -1;
            this.f21955d = ((AbstractList) this.f21952a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f21953b < this.f21952a.length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f21953b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f21953b >= this.f21952a.length) {
                throw new NoSuchElementException();
            }
            int i10 = this.f21953b;
            this.f21953b = i10 + 1;
            this.f21954c = i10;
            return this.f21952a.backing[this.f21954c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f21953b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i10 = this.f21953b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f21953b = i11;
            this.f21954c = i11;
            return this.f21952a.backing[this.f21954c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f21953b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f21954c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f21952a.remove(i10);
            this.f21953b = this.f21954c;
            this.f21954c = -1;
            this.f21955d = ((AbstractList) this.f21952a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i10 = this.f21954c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f21952a.set(i10, obj);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        f21947b = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    private final void A() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean B(List other) {
        return a9.b.h(this.backing, 0, this.length, other);
    }

    private final void D(int n10) {
        C(this.length + n10);
    }

    private final void F() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(int i10) {
        F();
        E[] eArr = this.backing;
        E e10 = eArr[i10];
        m.g(eArr, eArr, i10, i10 + 1, this.length);
        a9.b.f(this.backing, this.length - 1);
        this.length--;
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            F();
        }
        E[] eArr = this.backing;
        m.g(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i10 = this.length;
        a9.b.g(eArr2, i10 - rangeLength, i10);
        this.length -= rangeLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I(int rangeOffset, int rangeLength, Collection elements, boolean retain) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < rangeLength) {
            int i12 = rangeOffset + i10;
            if (elements.contains(this.backing[i12]) == retain) {
                E[] eArr = this.backing;
                i10++;
                eArr[i11 + rangeOffset] = eArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = rangeLength - i11;
        E[] eArr2 = this.backing;
        m.g(eArr2, eArr2, rangeOffset + i11, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i14 = this.length;
        a9.b.g(eArr3, i14 - i13, i14);
        if (i13 > 0) {
            F();
        }
        this.length -= i13;
        return i13;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i10, Collection elements, int n10) {
        F();
        E(i10, n10);
        Iterator<E> it = elements.iterator();
        for (int i11 = 0; i11 < n10; i11++) {
            this.backing[i10 + i11] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i10, Object element) {
        F();
        E(i10, 1);
        ((E[]) this.backing)[i10] = element;
    }

    public final void C(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) a9.b.e(this.backing, d.Companion.e(eArr.length, minCapacity));
        }
    }

    public final void E(int i10, int n10) {
        D(n10);
        E[] eArr = this.backing;
        m.g(eArr, eArr, i10 + n10, i10, this.length);
        this.length += n10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object element) {
        A();
        y(this.length, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        p.e(elements, "elements");
        A();
        int size = elements.size();
        x(this.length, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        A();
        H(0, this.length);
    }

    @Override // z8.f
    /* renamed from: d, reason: from getter */
    public int getLength() {
        return this.length;
    }

    @Override // z8.f
    public Object e(int index) {
        A();
        d.Companion.b(index, this.length);
        return G(index);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof List) && B((List) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int index) {
        d.Companion.b(index, this.length);
        return this.backing[index];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return a9.b.i(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (p.a(this.backing[i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i10 = this.length - 1; i10 >= 0; i10--) {
            if (p.a(this.backing[i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        A();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        p.e(elements, "elements");
        A();
        return I(0, this.length, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        p.e(elements, "elements");
        A();
        return I(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int index, Object element) {
        A();
        d.Companion.b(index, this.length);
        Object[] objArr = this.backing;
        Object obj = objArr[index];
        objArr[index] = element;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int fromIndex, int toIndex) {
        d.Companion.d(fromIndex, toIndex, this.length);
        return new BuilderSubList(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        p.e(array, "array");
        int length = array.length;
        int i10 = this.length;
        if (length >= i10) {
            m.g(this.backing, array, 0, 0, i10);
            return q.f(this.length, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.backing, 0, i10, array.getClass());
        p.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return a9.b.j(this.backing, 0, this.length, this);
    }

    public final List z() {
        A();
        this.isReadOnly = true;
        return this.length > 0 ? this : f21947b;
    }

    public ListBuilder(int i10) {
        this.backing = (E[]) a9.b.d(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int index) {
        d.Companion.c(index, this.length);
        return new b(this, index);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, Object element) {
        A();
        d.Companion.c(index, this.length);
        y(index, element);
    }

    public /* synthetic */ ListBuilder(int i10, int i11, i iVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection elements) {
        p.e(elements, "elements");
        A();
        d.Companion.c(index, this.length);
        int size = elements.size();
        x(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return m.l(this.backing, 0, this.length);
    }
}
