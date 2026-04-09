.class public final Ly7/n$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
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
    invoke-direct {p0}, Ly7/n$d;-><init>()V

    return-void
.end method

.method private final a()Lkotlin/text/p;
    .locals 1

    invoke-static {}, Ly7/n;->a()LYg/m;

    move-result-object v0

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/text/p;

    return-object v0
.end method

.method private final b()Lkotlin/text/p;
    .locals 1

    invoke-static {}, Ly7/n;->b()LYg/m;

    move-result-object v0

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/text/p;

    return-object v0
.end method

.method private final c()Lkotlin/text/p;
    .locals 1

    invoke-static {}, Ly7/n;->c()LYg/m;

    move-result-object v0

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/text/p;

    return-object v0
.end method


# virtual methods
.method public final d(Ljava/lang/String;)Ly7/n;
    .locals 22

    move-object/from16 v0, p1

    const-string/jumbo v1, "firmwareString"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ly7/n$d;->a()Lkotlin/text/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkotlin/text/p;->l(Ljava/lang/CharSequence;)Lkotlin/text/l;

    move-result-object v1

    const/16 v2, 0x9

    const/16 v3, 0x8

    const/4 v4, 0x7

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x2

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Ljava/lang/String;

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Ljava/lang/String;

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v15

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v16

    const-string v5, "-"

    invoke-static {v0, v5, v9, v10, v9}, Lkotlin/text/t;->l1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v17

    const-string v6, ""

    invoke-static {v0, v5, v6}, Lkotlin/text/t;->b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_0

    move-object/from16 v18, v9

    goto :goto_0

    :cond_0
    move-object/from16 v18, v0

    :goto_0
    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Ljava/lang/String;

    new-instance v0, Lcom/ui/common/semver/SemVer;

    move-object v14, v0

    invoke-direct/range {v14 .. v19}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ljava/lang/String;

    new-instance v1, Ly7/n;

    move-object v11, v1

    invoke-direct/range {v11 .. v16}, Ly7/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ui/common/semver/SemVer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    invoke-direct/range {p0 .. p0}, Ly7/n$d;->b()Lkotlin/text/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkotlin/text/p;->l(Ljava/lang/CharSequence;)Lkotlin/text/l;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v0, Ly7/n;

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Ljava/lang/String;

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Ljava/lang/String;

    new-instance v8, Lcom/ui/common/semver/SemVer;

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v15

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v16

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v17

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v19, v4

    check-cast v19, Ljava/lang/String;

    const/16 v20, 0x8

    const/16 v21, 0x0

    const/16 v18, 0x0

    move-object v14, v8

    invoke-direct/range {v14 .. v21}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ljava/lang/String;

    move-object v11, v0

    invoke-direct/range {v11 .. v16}, Ly7/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ui/common/semver/SemVer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_2
    invoke-direct/range {p0 .. p0}, Ly7/n$d;->c()Lkotlin/text/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkotlin/text/p;->l(Ljava/lang/CharSequence;)Lkotlin/text/l;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Ly7/n;

    invoke-interface {v0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    new-instance v2, Lcom/ui/common/semver/SemVer;

    invoke-interface {v0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    invoke-interface {v0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v15

    invoke-interface {v0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v16

    invoke-interface {v0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v0

    const/4 v3, 0x6

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    const/16 v19, 0x10

    const/16 v20, 0x0

    const/16 v18, 0x0

    move-object v13, v2

    invoke-direct/range {v13 .. v20}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x0

    move-object v11, v1

    move-object v14, v2

    invoke-direct/range {v11 .. v16}, Ly7/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ui/common/semver/SemVer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_3
    return-object v9
.end method
