.class public final synthetic LEb/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:LEb/b$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LEb/b$a;

    invoke-direct {v0}, LEb/b$a;-><init>()V

    sput-object v0, LEb/b$a;->a:LEb/b$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.sso.models.CreateAccountError"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "fields_non_unique"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "password"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "email"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "nonUniqueUsername"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "nonUniqueEmail"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, LEb/b$a;->descriptor:LXi/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LXi/f;
    .locals 1

    sget-object v0, LEb/b$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LEb/b$a;->g(LYi/e;)LEb/b;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 7

    invoke-static {}, LEb/b;->a()[LVi/b;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-static {v2}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v2

    const/4 v3, 0x1

    aget-object v4, v0, v3

    invoke-static {v4}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v4

    const/4 v5, 0x2

    aget-object v0, v0, v5

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v0

    const/4 v6, 0x5

    new-array v6, v6, [LVi/b;

    aput-object v2, v6, v1

    aput-object v4, v6, v3

    aput-object v0, v6, v5

    sget-object v0, LZi/i;->a:LZi/i;

    const/4 v1, 0x3

    aput-object v0, v6, v1

    const/4 v1, 0x4

    aput-object v0, v6, v1

    return-object v6
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LEb/b;

    invoke-virtual {p0, p1, p2}, LEb/b$a;->h(LYi/f;LEb/b;)V

    return-void
.end method

.method public final g(LYi/e;)LEb/b;
    .locals 23

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LEb/b$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-static {}, LEb/b;->a()[LVi/b;

    move-result-object v2

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v3

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v3, :cond_0

    aget-object v3, v2, v8

    invoke-interface {v0, v1, v8, v3, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    aget-object v8, v2, v7

    invoke-interface {v0, v1, v7, v8, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    aget-object v2, v2, v6

    invoke-interface {v0, v1, v6, v2, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v0, v1, v4}, LYi/c;->u(LXi/f;I)Z

    move-result v4

    invoke-interface {v0, v1, v5}, LYi/c;->u(LXi/f;I)Z

    move-result v5

    const/16 v6, 0x1f

    move-object/from16 v19, v2

    move-object/from16 v17, v3

    move/from16 v20, v4

    move/from16 v21, v5

    move/from16 v16, v6

    move-object/from16 v18, v7

    goto/16 :goto_2

    :cond_0
    move v14, v7

    move v3, v8

    move v10, v3

    move-object v11, v9

    move-object v12, v11

    move-object v13, v12

    move v9, v10

    :goto_0
    if-eqz v14, :cond_7

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v15

    const/4 v8, -0x1

    if-eq v15, v8, :cond_6

    if-eqz v15, :cond_5

    if-eq v15, v7, :cond_4

    if-eq v15, v6, :cond_3

    if-eq v15, v4, :cond_2

    if-ne v15, v5, :cond_1

    invoke-interface {v0, v1, v5}, LYi/c;->u(LXi/f;I)Z

    move-result v9

    or-int/lit8 v10, v10, 0x10

    :goto_1
    const/4 v8, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v15}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    invoke-interface {v0, v1, v4}, LYi/c;->u(LXi/f;I)Z

    move-result v3

    or-int/lit8 v10, v10, 0x8

    goto :goto_1

    :cond_3
    aget-object v8, v2, v6

    invoke-interface {v0, v1, v6, v8, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Ljava/util/List;

    or-int/lit8 v10, v10, 0x4

    goto :goto_1

    :cond_4
    aget-object v8, v2, v7

    invoke-interface {v0, v1, v7, v8, v12}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Ljava/util/List;

    or-int/lit8 v10, v10, 0x2

    goto :goto_1

    :cond_5
    const/4 v8, 0x0

    aget-object v15, v2, v8

    invoke-interface {v0, v1, v8, v15, v11}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    or-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_6
    const/4 v8, 0x0

    move v14, v8

    goto :goto_0

    :cond_7
    move/from16 v20, v3

    move/from16 v21, v9

    move/from16 v16, v10

    move-object/from16 v17, v11

    move-object/from16 v18, v12

    move-object/from16 v19, v13

    :goto_2
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, LEb/b;

    const/16 v22, 0x0

    move-object v15, v0

    invoke-direct/range {v15 .. v22}, LEb/b;-><init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;ZZLZi/R0;)V

    return-object v0
.end method

.method public final h(LYi/f;LEb/b;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LEb/b$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, LEb/b;->c(LEb/b;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
