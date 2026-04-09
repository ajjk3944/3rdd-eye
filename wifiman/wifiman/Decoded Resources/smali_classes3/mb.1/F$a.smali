.class public final synthetic Lmb/F$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lmb/F$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmb/F$a;

    invoke-direct {v0}, Lmb/F$a;-><init>()V

    sput-object v0, Lmb/F$a;->a:Lmb/F$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "users"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "uiVersion"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "ui"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "name"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "controllerType"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isConfigured"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isRunning"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isInstalled"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "required"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "harddriveRequired"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "installState"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "state"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "updateAvailable"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "updateProgress"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lmb/F$a;->descriptor:LXi/f;

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

    sget-object v0, Lmb/F$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmb/F$a;->g(LYi/e;)Lmb/F;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 11

    sget-object v0, LZi/W0;->a:LZi/W0;

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v1

    sget-object v2, LZi/i;->a:LZi/i;

    invoke-static {v2}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v3

    invoke-static {v2}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v4

    sget-object v5, Lmb/g$b;->f:Lmb/g$b;

    invoke-static {v5}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v5

    sget-object v6, Lmb/i$b;->f:Lmb/i$b;

    invoke-static {v6}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v6

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v7

    sget-object v8, LZi/W;->a:LZi/W;

    invoke-static {v8}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v8

    const/16 v9, 0xd

    new-array v9, v9, [LVi/b;

    const/4 v10, 0x0

    aput-object v1, v9, v10

    sget-object v1, Lmb/k$a;->a:Lmb/k$a;

    const/4 v10, 0x1

    aput-object v1, v9, v10

    const/4 v1, 0x2

    aput-object v0, v9, v1

    sget-object v0, Lmb/j$b;->f:Lmb/j$b;

    const/4 v1, 0x3

    aput-object v0, v9, v1

    const/4 v0, 0x4

    aput-object v2, v9, v0

    const/4 v0, 0x5

    aput-object v2, v9, v0

    const/4 v0, 0x6

    aput-object v2, v9, v0

    const/4 v0, 0x7

    aput-object v3, v9, v0

    const/16 v0, 0x8

    aput-object v4, v9, v0

    const/16 v0, 0x9

    aput-object v5, v9, v0

    const/16 v0, 0xa

    aput-object v6, v9, v0

    const/16 v0, 0xb

    aput-object v7, v9, v0

    const/16 v0, 0xc

    aput-object v8, v9, v0

    return-object v9
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lmb/F;

    invoke-virtual {p0, p1, p2}, Lmb/F$a;->h(LYi/f;Lmb/F;)V

    return-void
.end method

.method public final g(LYi/e;)Lmb/F;
    .locals 38

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lmb/F$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/16 v5, 0xa

    const/16 v6, 0x9

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/16 v11, 0x8

    const/4 v12, 0x4

    const/4 v13, 0x2

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    sget-object v2, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v15, v2, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    sget-object v4, Lmb/k$a;->a:Lmb/k$a;

    invoke-interface {v0, v1, v14, v4, v3}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmb/k;

    invoke-interface {v0, v1, v13}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v13

    sget-object v14, Lmb/j$b;->f:Lmb/j$b;

    invoke-interface {v0, v1, v10, v14, v3}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lmb/j;

    invoke-interface {v0, v1, v12}, LYi/c;->u(LXi/f;I)Z

    move-result v12

    invoke-interface {v0, v1, v9}, LYi/c;->u(LXi/f;I)Z

    move-result v9

    invoke-interface {v0, v1, v8}, LYi/c;->u(LXi/f;I)Z

    move-result v8

    sget-object v14, LZi/i;->a:LZi/i;

    invoke-interface {v0, v1, v7, v14, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v11, v14, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    sget-object v14, Lmb/g$b;->f:Lmb/g$b;

    invoke-interface {v0, v1, v6, v14, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lmb/g;

    sget-object v14, Lmb/i$b;->f:Lmb/i$b;

    invoke-interface {v0, v1, v5, v14, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmb/i;

    const/16 v14, 0xb

    invoke-interface {v0, v1, v14, v2, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v14, LZi/W;->a:LZi/W;

    move-object/from16 v16, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v14, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const/16 v3, 0x1fff

    move-object/from16 v36, v2

    move/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v34, v5

    move-object/from16 v33, v6

    move-object/from16 v31, v7

    move/from16 v30, v8

    move/from16 v29, v9

    move-object/from16 v27, v10

    move-object/from16 v32, v11

    move/from16 v28, v12

    move-object/from16 v26, v13

    move-object/from16 v24, v15

    move-object/from16 v35, v16

    goto/16 :goto_7

    :cond_0
    move-object v2, v3

    move-object v4, v2

    move-object v8, v4

    move-object v9, v8

    move-object v10, v9

    move-object v12, v10

    move-object v13, v12

    move-object/from16 v17, v13

    move/from16 v21, v14

    move/from16 v18, v15

    move/from16 v19, v18

    move/from16 v20, v19

    move-object/from16 v14, v17

    move/from16 v3, v20

    move-object v15, v14

    :goto_0
    if-eqz v21, :cond_1

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v7

    packed-switch v7, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v7}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v7, LZi/W;->a:LZi/W;

    const/16 v11, 0xc

    invoke-interface {v0, v1, v11, v7, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/Integer;

    or-int/lit16 v3, v3, 0x1000

    :goto_1
    const/4 v7, 0x7

    :goto_2
    const/16 v11, 0x8

    goto :goto_0

    :pswitch_1
    const/16 v11, 0xc

    sget-object v7, LZi/W0;->a:LZi/W0;

    const/16 v11, 0xb

    invoke-interface {v0, v1, v11, v7, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x800

    goto :goto_1

    :pswitch_2
    const/16 v11, 0xb

    sget-object v7, Lmb/i$b;->f:Lmb/i$b;

    invoke-interface {v0, v1, v5, v7, v12}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Lmb/i;

    or-int/lit16 v3, v3, 0x400

    goto :goto_1

    :pswitch_3
    const/16 v11, 0xb

    sget-object v7, Lmb/g$b;->f:Lmb/g$b;

    invoke-interface {v0, v1, v6, v7, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Lmb/g;

    or-int/lit16 v3, v3, 0x200

    goto :goto_1

    :pswitch_4
    const/16 v11, 0xb

    sget-object v7, LZi/i;->a:LZi/i;

    const/16 v5, 0x8

    invoke-interface {v0, v1, v5, v7, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Ljava/lang/Boolean;

    or-int/lit16 v3, v3, 0x100

    move v11, v5

    const/16 v5, 0xa

    const/4 v7, 0x7

    goto :goto_0

    :pswitch_5
    move v5, v11

    const/16 v11, 0xb

    sget-object v7, LZi/i;->a:LZi/i;

    const/4 v5, 0x7

    invoke-interface {v0, v1, v5, v7, v14}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v14, v7

    check-cast v14, Ljava/lang/Boolean;

    or-int/lit16 v3, v3, 0x80

    :goto_3
    move v7, v5

    const/16 v5, 0xa

    goto :goto_2

    :pswitch_6
    const/4 v5, 0x7

    const/4 v7, 0x6

    const/16 v11, 0xb

    invoke-interface {v0, v1, v7}, LYi/c;->u(LXi/f;I)Z

    move-result v18

    or-int/lit8 v3, v3, 0x40

    goto :goto_3

    :pswitch_7
    const/4 v5, 0x5

    const/4 v7, 0x6

    const/16 v11, 0xb

    invoke-interface {v0, v1, v5}, LYi/c;->u(LXi/f;I)Z

    move-result v19

    or-int/lit8 v3, v3, 0x20

    :goto_4
    const/16 v5, 0xa

    goto :goto_1

    :pswitch_8
    const/4 v5, 0x4

    const/4 v7, 0x6

    const/16 v11, 0xb

    invoke-interface {v0, v1, v5}, LYi/c;->u(LXi/f;I)Z

    move-result v20

    or-int/lit8 v3, v3, 0x10

    goto :goto_4

    :pswitch_9
    const/4 v7, 0x6

    const/16 v11, 0xb

    sget-object v5, Lmb/j$b;->f:Lmb/j$b;

    const/4 v6, 0x3

    invoke-interface {v0, v1, v6, v5, v15}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Lmb/j;

    or-int/lit8 v3, v3, 0x8

    :goto_5
    const/16 v5, 0xa

    :goto_6
    const/16 v6, 0x9

    goto/16 :goto_1

    :pswitch_a
    const/4 v5, 0x2

    const/4 v6, 0x3

    const/4 v7, 0x6

    const/16 v11, 0xb

    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v3, v3, 0x4

    goto :goto_5

    :pswitch_b
    const/4 v6, 0x3

    const/4 v7, 0x6

    const/16 v11, 0xb

    sget-object v5, Lmb/k$a;->a:Lmb/k$a;

    const/4 v6, 0x1

    invoke-interface {v0, v1, v6, v5, v4}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmb/k;

    or-int/lit8 v3, v3, 0x2

    goto :goto_5

    :pswitch_c
    const/4 v6, 0x1

    const/4 v7, 0x6

    const/16 v11, 0xb

    sget-object v5, LZi/W0;->a:LZi/W0;

    const/4 v6, 0x0

    invoke-interface {v0, v1, v6, v5, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x1

    goto :goto_5

    :pswitch_d
    const/4 v6, 0x0

    const/4 v7, 0x6

    move/from16 v21, v6

    goto :goto_6

    :cond_1
    move-object/from16 v24, v2

    move/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v36, v8

    move-object/from16 v35, v9

    move-object/from16 v33, v10

    move-object/from16 v34, v12

    move-object/from16 v32, v13

    move-object/from16 v31, v14

    move-object/from16 v27, v15

    move-object/from16 v26, v17

    move/from16 v30, v18

    move/from16 v29, v19

    move/from16 v28, v20

    :goto_7
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lmb/F;

    const/16 v37, 0x0

    move-object/from16 v22, v0

    invoke-direct/range {v22 .. v37}, Lmb/F;-><init>(ILjava/lang/String;Lmb/k;Ljava/lang/String;Lmb/j;ZZZLjava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Ljava/lang/String;Ljava/lang/Integer;LZi/R0;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LYi/f;Lmb/F;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmb/F$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lmb/F;->r(Lmb/F;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
