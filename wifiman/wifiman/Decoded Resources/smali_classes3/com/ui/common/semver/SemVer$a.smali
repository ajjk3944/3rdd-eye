.class public final Lcom/ui/common/semver/SemVer$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/common/semver/SemVer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/common/semver/SemVer$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;
    .locals 13

    const-string/jumbo v0, "versionString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo9/b;->a:Lo9/b;

    invoke-virtual {v0}, Lo9/b;->a()Lkotlin/text/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkotlin/text/p;->l(Ljava/lang/CharSequence;)Lkotlin/text/l;

    move-result-object v0

    const-string/jumbo v1, "Invalid version: "

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x2

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x3

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0}, Lkotlin/text/l;->c()Lkotlin/text/k;

    move-result-object v5

    const/4 v6, 0x4

    invoke-interface {v5, v6}, Lkotlin/text/k;->get(I)Lkotlin/text/j;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    move-object v11, v6

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Lkotlin/text/j;->a()Ljava/lang/String;

    move-result-object v5

    move-object v11, v5

    :goto_0
    invoke-interface {v0}, Lkotlin/text/l;->c()Lkotlin/text/k;

    move-result-object v0

    const/4 v5, 0x5

    invoke-interface {v0, v5}, Lkotlin/text/k;->get(I)Lkotlin/text/j;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_1
    move-object v12, v6

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lkotlin/text/j;->a()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :goto_2
    if-eqz v2, :cond_4

    new-instance p1, Lcom/ui/common/semver/SemVer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/4 v0, 0x0

    if-nez v3, :cond_2

    move v9, v0

    goto :goto_3

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v9, v1

    :goto_3
    if-nez v4, :cond_3

    :goto_4
    move v10, v0

    goto :goto_5

    :cond_3
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_4

    :goto_5
    move-object v7, p1

    invoke-direct/range {v7 .. v12}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_4
    new-instance v0, Lcom/ui/common/semver/SemVer$FormatException;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/common/semver/SemVer$FormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Lcom/ui/common/semver/SemVer$FormatException;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/common/semver/SemVer$FormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;
    .locals 1

    const-string/jumbo v0, "versionString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/ui/common/semver/SemVer$a;->a(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object p1
    :try_end_0
    .catch Lcom/ui/common/semver/SemVer$FormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
