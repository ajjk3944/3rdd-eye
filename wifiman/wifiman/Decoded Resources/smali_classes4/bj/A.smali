.class final Lbj/A;
.super Lbj/c;
.source "SourceFile"


# instance fields
.field private final h:Laj/c;

.field private final i:I

.field private j:I


# direct methods
.method public constructor <init>(Laj/b;Laj/c;)V
    .locals 7

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lbj/c;-><init>(Laj/b;Laj/j;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lbj/A;->h:Laj/c;

    invoke-virtual {p0}, Lbj/A;->D0()Laj/c;

    move-result-object p1

    invoke-virtual {p1}, Laj/c;->size()I

    move-result p1

    iput p1, p0, Lbj/A;->i:I

    const/4 p1, -0x1

    iput p1, p0, Lbj/A;->j:I

    return-void
.end method


# virtual methods
.method public bridge synthetic A0()Laj/j;
    .locals 1

    invoke-virtual {p0}, Lbj/A;->D0()Laj/c;

    move-result-object v0

    return-object v0
.end method

.method public D0()Laj/c;
    .locals 1

    iget-object v0, p0, Lbj/A;->h:Laj/c;

    return-object v0
.end method

.method protected g0(LXi/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public k(LXi/f;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lbj/A;->j:I

    iget v0, p0, Lbj/A;->i:I

    add-int/lit8 v0, v0, -0x1

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lbj/A;->j:I

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method protected m0(Ljava/lang/String;)Laj/j;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbj/A;->D0()Laj/c;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Laj/c;->e(I)Laj/j;

    move-result-object p1

    return-object p1
.end method
