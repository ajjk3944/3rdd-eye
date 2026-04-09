.class public final LDi/j;
.super LDi/b;
.source "SourceFile"

# interfaces
.implements LCi/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDi/j$a;
    }
.end annotation


# static fields
.field public static final c:LDi/j$a;

.field private static final d:LDi/j;


# instance fields
.field private final b:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LDi/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDi/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDi/j;->c:LDi/j$a;

    new-instance v0, LDi/j;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1}, LDi/j;-><init>([Ljava/lang/Object;)V

    sput-object v0, LDi/j;->d:LDi/j;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LDi/b;-><init>()V

    iput-object p1, p0, LDi/j;->b:[Ljava/lang/Object;

    array-length p1, p1

    const/16 v0, 0x20

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, LHi/a;->a(Z)V

    return-void
.end method

.method public static final synthetic y()LDi/j;
    .locals 1

    sget-object v0, LDi/j;->d:LDi/j;

    return-object v0
.end method


# virtual methods
.method public addAll(Ljava/util/Collection;)LCi/f;
    .locals 4

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LZg/b;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x20

    if-gt v0, v1, :cond_2

    iget-object v0, p0, LDi/j;->b:[Ljava/lang/Object;

    invoke-virtual {p0}, LZg/b;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZg/b;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    aput-object v2, v0, v1

    move v1, v3

    goto :goto_0

    :cond_1
    new-instance p1, LDi/j;

    invoke-direct {p1, v0}, LDi/j;-><init>([Ljava/lang/Object;)V

    return-object p1

    :cond_2
    invoke-interface {p0}, LCi/f;->c()LCi/f$a;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, LCi/f$a;->a()LCi/f;

    move-result-object p1

    return-object p1
.end method

.method public c()LCi/f$a;
    .locals 4

    new-instance v0, LDi/f;

    iget-object v1, p0, LDi/j;->b:[Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, LDi/f;-><init>(LCi/f;[Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZg/b;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->a(II)V

    iget-object v0, p0, LDi/j;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LDi/j;->b:[Ljava/lang/Object;

    invoke-static {v0, p1}, LZg/n;->m0([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LDi/j;->b:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LDi/j;->b:[Ljava/lang/Object;

    invoke-static {v0, p1}, LZg/n;->M0([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 3

    invoke-virtual {p0}, LZg/b;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->b(II)V

    new-instance v0, LDi/c;

    iget-object v1, p0, LDi/j;->b:[Ljava/lang/Object;

    invoke-virtual {p0}, LZg/b;->size()I

    move-result v2

    invoke-direct {v0, v1, p1, v2}, LDi/c;-><init>([Ljava/lang/Object;II)V

    return-object v0
.end method
