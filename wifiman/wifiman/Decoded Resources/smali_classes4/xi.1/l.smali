.class public final Lxi/l;
.super LZg/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxi/l$a;,
        Lxi/l$b;,
        Lxi/l$c;
    }
.end annotation


# static fields
.field public static final c:Lxi/l$b;


# instance fields
.field private a:Ljava/lang/Object;

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxi/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxi/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxi/l;->c:Lxi/l$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, LZg/j;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxi/l;-><init>()V

    return-void
.end method

.method public static final j()Lxi/l;
    .locals 1

    sget-object v0, Lxi/l;->c:Lxi/l$b;

    invoke-virtual {v0}, Lxi/l$b;->a()Lxi/l;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 4

    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-object p1, p0, Lxi/l;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lxi/l;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    const/4 v3, 0x5

    if-ge v0, v3, :cond_5

    iget-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    const-string v3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0, p1}, LZg/n;->U([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, LZg/j;->size()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_4

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->g([Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, LZg/j;->size()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "copyOf(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    sub-int/2addr v2, v1

    aput-object p1, v0, v2

    :goto_0
    iput-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    const-string v3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/V;->e(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    :goto_1
    invoke-virtual {p0}, LZg/j;->size()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p0, p1}, Lxi/l;->s(I)V

    return v1
.end method

.method public clear()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lxi/l;->s(I)V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2

    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0, p1}, LZg/n;->U([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lxi/l;->b:I

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    new-instance v0, Lxi/l$c;

    iget-object v1, p0, Lxi/l;->a:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lxi/l$c;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_2

    new-instance v0, Lxi/l$a;

    iget-object v1, p0, Lxi/l;->a:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    invoke-direct {v0, v1}, Lxi/l$a;-><init>([Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lxi/l;->a:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/V;->e(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, Lxi/l;->b:I

    return-void
.end method
