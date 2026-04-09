.class public final synthetic Lmb/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lmb/d$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmb/d$a;

    invoke-direct {v0}, Lmb/d$a;-><init>()V

    sput-object v0, Lmb/d$a;->a:Lmb/d$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "connect"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "isConfigured"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isRunning"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isInstalled"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "version"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "required"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "harddriveRequired"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "installState"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "state"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "ui"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "updateAvailable"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "updateProgress"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "name"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "controllerType"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lmb/d$a;->descriptor:LXi/f;

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

    sget-object v0, Lmb/d$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmb/d$a;->g(LYi/e;)Lmb/d;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 13

    sget-object v0, LZi/i;->a:LZi/i;

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v1

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v2

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v3

    sget-object v4, LZi/W0;->a:LZi/W0;

    invoke-static {v4}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v5

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v6

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v0

    sget-object v7, Lmb/g$b;->f:Lmb/g$b;

    invoke-static {v7}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v7

    sget-object v8, Lmb/i$b;->f:Lmb/i$b;

    invoke-static {v8}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v8

    invoke-static {v4}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v9

    sget-object v10, LZi/W;->a:LZi/W;

    invoke-static {v10}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v10

    const/16 v11, 0xd

    new-array v11, v11, [LVi/b;

    const/4 v12, 0x0

    aput-object v1, v11, v12

    const/4 v1, 0x1

    aput-object v2, v11, v1

    const/4 v1, 0x2

    aput-object v3, v11, v1

    const/4 v1, 0x3

    aput-object v5, v11, v1

    const/4 v1, 0x4

    aput-object v6, v11, v1

    const/4 v1, 0x5

    aput-object v0, v11, v1

    const/4 v0, 0x6

    aput-object v7, v11, v0

    const/4 v0, 0x7

    aput-object v8, v11, v0

    sget-object v0, Lmb/k$a;->a:Lmb/k$a;

    const/16 v1, 0x8

    aput-object v0, v11, v1

    const/16 v0, 0x9

    aput-object v9, v11, v0

    const/16 v0, 0xa

    aput-object v10, v11, v0

    const/16 v0, 0xb

    aput-object v4, v11, v0

    sget-object v0, Lmb/j$b;->f:Lmb/j$b;

    const/16 v1, 0xc

    aput-object v0, v11, v1

    return-object v11
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lmb/d;

    invoke-virtual {p0, p1, p2}, Lmb/d$a;->h(LYi/f;Lmb/d;)V

    return-void
.end method

.method public final g(LYi/e;)Lmb/d;
    .locals 36

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lmb/d$a;->descriptor:LXi/f;

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

    sget-object v2, LZi/i;->a:LZi/i;

    invoke-interface {v0, v1, v15, v2, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v14, v2, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v13, v2, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    sget-object v4, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v10, v4, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v2, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v9, v2, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    sget-object v9, Lmb/g$b;->f:Lmb/g$b;

    invoke-interface {v0, v1, v8, v9, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lmb/g;

    sget-object v9, Lmb/i$b;->f:Lmb/i$b;

    invoke-interface {v0, v1, v7, v9, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lmb/i;

    sget-object v9, Lmb/k$a;->a:Lmb/k$a;

    invoke-interface {v0, v1, v11, v9, v3}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lmb/k;

    invoke-interface {v0, v1, v6, v4, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v6, LZi/W;->a:LZi/W;

    invoke-interface {v0, v1, v5, v6, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    const/16 v6, 0xb

    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v6

    sget-object v11, Lmb/j$b;->f:Lmb/j$b;

    move-object/from16 v16, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v11, v3}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/j;

    const/16 v3, 0x1fff

    move-object/from16 v34, v2

    move/from16 v21, v3

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    move-object/from16 v29, v7

    move-object/from16 v28, v8

    move-object/from16 v30, v9

    move-object/from16 v25, v10

    move-object/from16 v26, v12

    move-object/from16 v24, v13

    move-object/from16 v23, v14

    move-object/from16 v22, v15

    move-object/from16 v27, v16

    goto/16 :goto_4

    :cond_0
    move-object v2, v3

    move-object v4, v2

    move-object v6, v4

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object/from16 v18, v13

    move/from16 v19, v14

    move-object/from16 v14, v18

    move v3, v15

    move-object v15, v14

    :goto_0
    if-eqz v19, :cond_1

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v5, Lmb/j$b;->f:Lmb/j$b;

    move-object/from16 v20, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v5, v6}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lmb/j;

    or-int/lit16 v3, v3, 0x1000

    :goto_1
    move-object/from16 v2, v20

    :goto_2
    const/16 v5, 0xa

    goto :goto_0

    :pswitch_1
    move-object/from16 v20, v2

    const/16 v2, 0xc

    const/16 v5, 0xb

    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit16 v3, v3, 0x800

    goto :goto_1

    :pswitch_2
    move-object/from16 v20, v2

    const/16 v5, 0xb

    sget-object v2, LZi/W;->a:LZi/W;

    const/16 v5, 0xa

    invoke-interface {v0, v1, v5, v2, v11}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/lang/Integer;

    or-int/lit16 v3, v3, 0x400

    move-object/from16 v2, v20

    goto :goto_0

    :pswitch_3
    move-object/from16 v20, v2

    const/16 v5, 0xa

    sget-object v2, LZi/W0;->a:LZi/W0;

    const/16 v5, 0x9

    invoke-interface {v0, v1, v5, v2, v7}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x200

    goto :goto_1

    :pswitch_4
    move-object/from16 v20, v2

    const/16 v5, 0x9

    sget-object v2, Lmb/k$a;->a:Lmb/k$a;

    const/16 v5, 0x8

    invoke-interface {v0, v1, v5, v2, v8}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lmb/k;

    or-int/lit16 v3, v3, 0x100

    goto :goto_1

    :pswitch_5
    move-object/from16 v20, v2

    const/16 v5, 0x8

    sget-object v2, Lmb/i$b;->f:Lmb/i$b;

    const/4 v5, 0x7

    invoke-interface {v0, v1, v5, v2, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lmb/i;

    or-int/lit16 v3, v3, 0x80

    goto :goto_1

    :pswitch_6
    move-object/from16 v20, v2

    const/4 v5, 0x7

    sget-object v2, Lmb/g$b;->f:Lmb/g$b;

    const/4 v5, 0x6

    invoke-interface {v0, v1, v5, v2, v12}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lmb/g;

    or-int/lit8 v3, v3, 0x40

    goto :goto_1

    :pswitch_7
    move-object/from16 v20, v2

    const/4 v5, 0x6

    sget-object v2, LZi/i;->a:LZi/i;

    const/4 v5, 0x5

    invoke-interface {v0, v1, v5, v2, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/Boolean;

    or-int/lit8 v3, v3, 0x20

    goto :goto_1

    :pswitch_8
    move-object/from16 v20, v2

    const/4 v5, 0x5

    sget-object v2, LZi/i;->a:LZi/i;

    const/4 v5, 0x4

    invoke-interface {v0, v1, v5, v2, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/lang/Boolean;

    or-int/lit8 v3, v3, 0x10

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v20, v2

    const/4 v5, 0x4

    sget-object v2, LZi/W0;->a:LZi/W0;

    const/4 v5, 0x3

    invoke-interface {v0, v1, v5, v2, v14}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x8

    goto/16 :goto_1

    :pswitch_a
    move-object/from16 v20, v2

    const/4 v5, 0x3

    sget-object v2, LZi/i;->a:LZi/i;

    const/4 v5, 0x2

    invoke-interface {v0, v1, v5, v2, v15}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/lang/Boolean;

    or-int/lit8 v3, v3, 0x4

    goto/16 :goto_1

    :pswitch_b
    move-object/from16 v20, v2

    const/4 v5, 0x2

    sget-object v2, LZi/i;->a:LZi/i;

    const/4 v5, 0x1

    invoke-interface {v0, v1, v5, v2, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/Boolean;

    or-int/lit8 v3, v3, 0x2

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v20, v2

    const/4 v5, 0x1

    sget-object v2, LZi/i;->a:LZi/i;

    move-object/from16 v17, v4

    move-object/from16 v4, v20

    const/4 v5, 0x0

    invoke-interface {v0, v1, v5, v2, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    or-int/lit8 v3, v3, 0x1

    :goto_3
    move-object/from16 v4, v17

    goto/16 :goto_2

    :pswitch_d
    move-object/from16 v17, v4

    const/4 v5, 0x0

    move-object v4, v2

    move/from16 v19, v5

    goto :goto_3

    :cond_1
    move-object/from16 v17, v4

    move-object v4, v2

    move/from16 v21, v3

    move-object/from16 v22, v4

    move-object/from16 v34, v6

    move-object/from16 v31, v7

    move-object/from16 v30, v8

    move-object/from16 v29, v9

    move-object/from16 v27, v10

    move-object/from16 v32, v11

    move-object/from16 v28, v12

    move-object/from16 v26, v13

    move-object/from16 v25, v14

    move-object/from16 v24, v15

    move-object/from16 v23, v17

    move-object/from16 v33, v18

    :goto_4
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lmb/d;

    const/16 v35, 0x0

    move-object/from16 v20, v0

    invoke-direct/range {v20 .. v35}, Lmb/d;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lmb/j;LZi/R0;)V

    return-object v0

    nop

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

.method public final h(LYi/f;Lmb/d;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmb/d$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lmb/d;->r(Lmb/d;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
