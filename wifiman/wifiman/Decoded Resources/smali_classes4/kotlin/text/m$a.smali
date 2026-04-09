.class public final Lkotlin/text/m$a;
.super LZg/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/m;->b()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lkotlin/text/m;


# direct methods
.method constructor <init>(Lkotlin/text/m;)V
    .locals 0

    iput-object p1, p0, Lkotlin/text/m$a;->b:Lkotlin/text/m;

    invoke-direct {p0}, LZg/d;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge C(Ljava/lang/String;)I
    .locals 0

    invoke-super {p0, p1}, LZg/d;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge J(Ljava/lang/String;)I
    .locals 0

    invoke-super {p0, p1}, LZg/d;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lkotlin/text/m$a;->v(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/text/m$a;->y(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lkotlin/text/m$a;->C(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lkotlin/text/m$a;->b:Lkotlin/text/m;

    invoke-static {v0}, Lkotlin/text/m;->e(Lkotlin/text/m;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->groupCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lkotlin/text/m$a;->J(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge v(Ljava/lang/String;)Z
    .locals 0

    invoke-super {p0, p1}, LZg/b;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public y(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/text/m$a;->b:Lkotlin/text/m;

    invoke-static {v0}, Lkotlin/text/m;->e(Lkotlin/text/m;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method
