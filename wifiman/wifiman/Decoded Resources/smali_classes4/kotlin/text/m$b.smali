.class public final Lkotlin/text/m$b;
.super LZg/b;
.source "SourceFile"

# interfaces
.implements Lkotlin/text/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/m;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/text/m;


# direct methods
.method constructor <init>(Lkotlin/text/m;)V
    .locals 0

    iput-object p1, p0, Lkotlin/text/m$b;->a:Lkotlin/text/m;

    invoke-direct {p0}, LZg/b;-><init>()V

    return-void
.end method

.method private static final C(Lkotlin/text/m$b;I)Lkotlin/text/j;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/text/m$b;->get(I)Lkotlin/text/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lkotlin/text/m$b;I)Lkotlin/text/j;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/text/m$b;->C(Lkotlin/text/m$b;I)Lkotlin/text/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lkotlin/text/j;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lkotlin/text/j;

    invoke-virtual {p0, p1}, Lkotlin/text/m$b;->y(Lkotlin/text/j;)Z

    move-result p1

    return p1
.end method

.method public get(I)Lkotlin/text/j;
    .locals 3

    iget-object v0, p0, Lkotlin/text/m$b;->a:Lkotlin/text/m;

    invoke-static {v0}, Lkotlin/text/m;->e(Lkotlin/text/m;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/text/q;->d(Ljava/util/regex/MatchResult;I)Lsh/i;

    move-result-object v0

    invoke-virtual {v0}, Lsh/i;->w()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    new-instance v1, Lkotlin/text/j;

    iget-object v2, p0, Lkotlin/text/m$b;->a:Lkotlin/text/m;

    invoke-static {v2}, Lkotlin/text/m;->e(Lkotlin/text/m;)Ljava/util/regex/MatchResult;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "group(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, Lkotlin/text/j;-><init>(Ljava/lang/String;Lsh/i;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    invoke-static {p0}, LZg/v;->m(Ljava/util/Collection;)Lsh/i;

    move-result-object v0

    invoke-static {v0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v0

    new-instance v1, Lkotlin/text/n;

    invoke-direct {v1, p0}, Lkotlin/text/n;-><init>(Lkotlin/text/m$b;)V

    invoke-static {v0, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-interface {v0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lkotlin/text/m$b;->a:Lkotlin/text/m;

    invoke-static {v0}, Lkotlin/text/m;->e(Lkotlin/text/m;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->groupCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public bridge y(Lkotlin/text/j;)Z
    .locals 0

    invoke-super {p0, p1}, LZg/b;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
