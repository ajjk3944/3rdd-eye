.class final Lbj/B;
.super Lbj/z;
.source "SourceFile"


# instance fields
.field private final l:Laj/E;

.field private final m:Ljava/util/List;

.field private final n:I

.field private o:I


# direct methods
.method public constructor <init>(Laj/b;Laj/E;)V
    .locals 8

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lbj/z;-><init>(Laj/b;Laj/E;Ljava/lang/String;LXi/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lbj/B;->l:Laj/E;

    invoke-virtual {p0}, Lbj/B;->F0()Laj/E;

    move-result-object p1

    invoke-virtual {p1}, Laj/E;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lbj/B;->m:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    iput p1, p0, Lbj/B;->n:I

    const/4 p1, -0x1

    iput p1, p0, Lbj/B;->o:I

    return-void
.end method


# virtual methods
.method public bridge synthetic A0()Laj/j;
    .locals 1

    invoke-virtual {p0}, Lbj/B;->F0()Laj/E;

    move-result-object v0

    return-object v0
.end method

.method public F0()Laj/E;
    .locals 1

    iget-object v0, p0, Lbj/B;->l:Laj/E;

    return-object v0
.end method

.method public b(LXi/f;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected g0(LXi/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    div-int/lit8 p2, p2, 0x2

    iget-object p1, p0, Lbj/B;->m:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public k(LXi/f;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lbj/B;->o:I

    iget v0, p0, Lbj/B;->n:I

    add-int/lit8 v0, v0, -0x1

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lbj/B;->o:I

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method protected m0(Ljava/lang/String;)Laj/j;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lbj/B;->o:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    invoke-static {p1}, Laj/k;->b(Ljava/lang/String;)Laj/G;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lbj/B;->F0()Laj/E;

    move-result-object v0

    invoke-static {v0, p1}, LZg/U;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laj/j;

    :goto_0
    return-object p1
.end method
