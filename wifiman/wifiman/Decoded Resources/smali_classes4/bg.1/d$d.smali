.class Lbg/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbg/d;->C1(ILinet/ipaddr/c$a;Ljava/util/function/Supplier;Ljava/util/function/IntFunction;Ljava/util/function/Predicate;IILjava/util/function/IntFunction;)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field private final b:[Ljava/util/Iterator;

.field private c:[LZf/d;

.field final synthetic d:I

.field final synthetic e:Linet/ipaddr/c$a;

.field final synthetic f:I

.field final synthetic g:Ljava/util/function/IntFunction;

.field final synthetic h:Ljava/util/function/Predicate;

.field final synthetic i:I

.field final synthetic j:Ljava/util/function/IntFunction;


# direct methods
.method constructor <init>(ILinet/ipaddr/c$a;ILjava/util/function/IntFunction;Ljava/util/function/Predicate;ILjava/util/function/IntFunction;)V
    .locals 0

    iput p1, p0, Lbg/d$d;->d:I

    iput-object p2, p0, Lbg/d$d;->e:Linet/ipaddr/c$a;

    iput p3, p0, Lbg/d$d;->f:I

    iput-object p4, p0, Lbg/d$d;->g:Ljava/util/function/IntFunction;

    iput-object p5, p0, Lbg/d$d;->h:Ljava/util/function/Predicate;

    iput p6, p0, Lbg/d$d;->i:I

    iput-object p7, p0, Lbg/d$d;->j:Ljava/util/function/IntFunction;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p4, p1, [Ljava/util/Iterator;

    iput-object p4, p0, Lbg/d$d;->b:[Ljava/util/Iterator;

    invoke-interface {p2, p1}, Linet/ipaddr/c$a;->d(I)[LZf/d;

    move-result-object p1

    iput-object p1, p0, Lbg/d$d;->c:[LZf/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lbg/d$d;->d(I)V

    :goto_0
    add-int/lit8 p3, p3, 0x1

    iget p1, p0, Lbg/d$d;->d:I

    if-ge p3, p1, :cond_0

    iget-object p1, p0, Lbg/d$d;->b:[Ljava/util/Iterator;

    iget-object p2, p0, Lbg/d$d;->g:Ljava/util/function/IntFunction;

    invoke-interface {p2, p3}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Iterator;

    aput-object p2, p1, p3

    iget-object p1, p0, Lbg/d$d;->c:[LZf/d;

    iget-object p2, p0, Lbg/d$d;->b:[Ljava/util/Iterator;

    aget-object p2, p2, p3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LZf/d;

    aput-object p2, p1, p3

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lbg/d$d;->h:Ljava/util/function/Predicate;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lbg/d$d;->c:[LZf/d;

    invoke-interface {p1, p2}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lbg/d$d;->a()[LZf/d;

    :cond_1
    return-void
.end method

.method private a()[LZf/d;
    .locals 4

    iget v0, p0, Lbg/d$d;->f:I

    const/4 v1, 0x0

    :goto_0
    if-ltz v0, :cond_3

    :goto_1
    iget-object v2, p0, Lbg/d$d;->b:[Ljava/util/Iterator;

    aget-object v2, v2, v0

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    if-nez v1, :cond_0

    iget-object v1, p0, Lbg/d$d;->c:[LZf/d;

    invoke-virtual {v1}, [LZf/d;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LZf/d;

    :cond_0
    iget-object v2, p0, Lbg/d$d;->c:[LZf/d;

    iget-object v3, p0, Lbg/d$d;->b:[Ljava/util/Iterator;

    aget-object v3, v3, v0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZf/d;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lbg/d$d;->d(I)V

    iget-object v0, p0, Lbg/d$d;->h:Ljava/util/function/Predicate;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lbg/d$d;->c:[LZf/d;

    invoke-interface {v0, v2}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lbg/d$d;->f:I

    goto :goto_1

    :cond_1
    return-object v1

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbg/d$d;->a:Z

    if-nez v1, :cond_4

    iget-object v1, p0, Lbg/d$d;->c:[LZf/d;

    :cond_4
    return-object v1
.end method

.method private d(I)V
    .locals 2

    :goto_0
    iget v0, p0, Lbg/d$d;->i:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lbg/d$d;->b:[Ljava/util/Iterator;

    iget-object v1, p0, Lbg/d$d;->j:Ljava/util/function/IntFunction;

    invoke-interface {v1, p1}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Iterator;

    aput-object v1, v0, p1

    iget-object v0, p0, Lbg/d$d;->c:[LZf/d;

    iget-object v1, p0, Lbg/d$d;->b:[Ljava/util/Iterator;

    aget-object v1, v1, p1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZf/d;

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lbg/d$d;->f:I

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lbg/d$d;->b:[Ljava/util/Iterator;

    iget-object v1, p0, Lbg/d$d;->g:Ljava/util/function/IntFunction;

    invoke-interface {v1, p1}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Iterator;

    aput-object v1, v0, p1

    iget-object v0, p0, Lbg/d$d;->c:[LZf/d;

    iget-object v1, p0, Lbg/d$d;->b:[Ljava/util/Iterator;

    aget-object v1, v1, p1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZf/d;

    aput-object v1, v0, p1

    :cond_1
    return-void
.end method


# virtual methods
.method public c()[LZf/d;
    .locals 1

    iget-boolean v0, p0, Lbg/d$d;->a:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lbg/d$d;->a()[LZf/d;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, Lbg/d$d;->a:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbg/d$d;->c()[LZf/d;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
