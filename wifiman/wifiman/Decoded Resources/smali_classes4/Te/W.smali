.class public final LTe/W;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls9/d;

.field private final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls9/d;Ljava/util/List;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/W;->a:Ls9/d;

    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, LTe/W$a;

    invoke-direct {p1}, LTe/W$a;-><init>()V

    invoke-static {p2, p1}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LTe/W;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(F)LTe/X;
    .locals 3

    iget-object v0, p0, LTe/W;->b:Ljava/util/List;

    invoke-static {v0}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTe/X;

    invoke-virtual {v0}, LTe/X;->c()Lsh/i;

    move-result-object v0

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    iget-object p1, p0, LTe/W;->b:Ljava/util/List;

    invoke-static {p1}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LTe/X;

    goto :goto_1

    :cond_0
    iget-object v0, p0, LTe/W;->b:Ljava/util/List;

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTe/X;

    invoke-virtual {v0}, LTe/X;->c()Lsh/i;

    move-result-object v0

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_1

    iget-object p1, p0, LTe/W;->b:Ljava/util/List;

    invoke-static {p1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LTe/X;

    goto :goto_1

    :cond_1
    iget-object v0, p0, LTe/W;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LTe/X;

    invoke-virtual {v2}, LTe/X;->c()Lsh/i;

    move-result-object v2

    invoke-virtual {v2}, Lsh/g;->j()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v2, p1, v2

    if-gtz v2, :cond_2

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object p1, v1

    check-cast p1, LTe/X;

    :goto_1
    return-object p1
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LTe/W;->b:Ljava/util/List;

    return-object v0
.end method

.method public final c()Ls9/d;
    .locals 1

    iget-object v0, p0, LTe/W;->a:Ls9/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LTe/W;

    if-eqz v0, :cond_0

    check-cast p1, LTe/W;

    iget-object v0, p1, LTe/W;->a:Ls9/d;

    iget-object v1, p0, LTe/W;->a:Ls9/d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, LTe/W;->b:Ljava/util/List;

    iget-object v0, p0, LTe/W;->b:Ljava/util/List;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LTe/W;->a:Ls9/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, LTe/W;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/2addr v0, v1

    return v0
.end method
