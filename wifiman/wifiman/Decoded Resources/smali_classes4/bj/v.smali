.class final Lbj/v;
.super Lbj/c;
.source "SourceFile"


# instance fields
.field private final h:Laj/j;


# direct methods
.method public constructor <init>(Laj/b;Laj/j;Ljava/lang/String;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lbj/c;-><init>(Laj/b;Laj/j;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p2, p0, Lbj/v;->h:Laj/j;

    .line 4
    const-string p1, "primitive"

    invoke-virtual {p0, p1}, LZi/Z0;->d0(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic constructor <init>(Laj/b;Laj/j;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lbj/v;-><init>(Laj/b;Laj/j;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public A0()Laj/j;
    .locals 1

    iget-object v0, p0, Lbj/v;->h:Laj/j;

    return-object v0
.end method

.method public k(LXi/f;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method protected m0(Ljava/lang/String;)Laj/j;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primitive"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lbj/v;->A0()Laj/j;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This input can only handle primitives with \'primitive\' tag"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
