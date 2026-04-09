.class public final synthetic Lmb/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lmb/s$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmb/s$a;

    invoke-direct {v0}, Lmb/s$a;-><init>()V

    sput-object v0, Lmb/s$a;->a:Lmb/s$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "protect"

    const/16 v3, 0xf

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

    const-string/jumbo v0, "uiVersion"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isGeofencingEnabled"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "name"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "controllerType"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lmb/s$a;->descriptor:LXi/f;

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

    sget-object v0, Lmb/s$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmb/s$a;->g(LYi/e;)Lmb/s;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 15

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

    move-result-object v7

    sget-object v8, Lmb/g$b;->f:Lmb/g$b;

    invoke-static {v8}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v8

    sget-object v9, Lmb/i$b;->f:Lmb/i$b;

    invoke-static {v9}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v9

    invoke-static {v4}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v10

    sget-object v11, LZi/W;->a:LZi/W;

    invoke-static {v11}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v11

    invoke-static {v4}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v12

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v0

    const/16 v13, 0xf

    new-array v13, v13, [LVi/b;

    const/4 v14, 0x0

    aput-object v1, v13, v14

    const/4 v1, 0x1

    aput-object v2, v13, v1

    const/4 v1, 0x2

    aput-object v3, v13, v1

    const/4 v1, 0x3

    aput-object v5, v13, v1

    const/4 v1, 0x4

    aput-object v6, v13, v1

    const/4 v1, 0x5

    aput-object v7, v13, v1

    const/4 v1, 0x6

    aput-object v8, v13, v1

    const/4 v1, 0x7

    aput-object v9, v13, v1

    sget-object v1, Lmb/k$a;->a:Lmb/k$a;

    const/16 v2, 0x8

    aput-object v1, v13, v2

    const/16 v1, 0x9

    aput-object v10, v13, v1

    const/16 v1, 0xa

    aput-object v11, v13, v1

    const/16 v1, 0xb

    aput-object v12, v13, v1

    const/16 v1, 0xc

    aput-object v0, v13, v1

    const/16 v0, 0xd

    aput-object v4, v13, v0

    sget-object v0, Lmb/j$b;->f:Lmb/j$b;

    const/16 v1, 0xe

    aput-object v0, v13, v1

    return-object v13
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lmb/s;

    invoke-virtual {p0, p1, p2}, Lmb/s$a;->h(LYi/f;Lmb/s;)V

    return-void
.end method

.method public final g(LYi/e;)Lmb/s;
    .locals 44

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lmb/s$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/16 v8, 0x9

    const/4 v9, 0x7

    const/4 v10, 0x6

    const/4 v11, 0x5

    const/4 v12, 0x3

    const/16 v13, 0x8

    const/4 v14, 0x4

    const/4 v15, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    sget-object v2, LZi/i;->a:LZi/i;

    invoke-interface {v0, v1, v4, v2, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v3, v2, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v15, v2, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    sget-object v6, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v12, v6, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v2, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v11, v2, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    sget-object v7, Lmb/g$b;->f:Lmb/g$b;

    invoke-interface {v0, v1, v10, v7, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lmb/g;

    sget-object v10, Lmb/i$b;->f:Lmb/i$b;

    invoke-interface {v0, v1, v9, v10, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lmb/i;

    sget-object v10, Lmb/k$a;->a:Lmb/k$a;

    invoke-interface {v0, v1, v13, v10, v5}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lmb/k;

    invoke-interface {v0, v1, v8, v6, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    sget-object v13, LZi/W;->a:LZi/W;

    move-object/from16 v18, v3

    const/16 v3, 0xa

    invoke-interface {v0, v1, v3, v13, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const/16 v13, 0xb

    invoke-interface {v0, v1, v13, v6, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/16 v13, 0xc

    invoke-interface {v0, v1, v13, v2, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    const/16 v13, 0xd

    invoke-interface {v0, v1, v13}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v16, v2

    sget-object v2, Lmb/j$b;->f:Lmb/j$b;

    move-object/from16 v17, v3

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v2, v5}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/j;

    const/16 v3, 0x7fff

    move-object/from16 v42, v2

    move/from16 v27, v3

    move-object/from16 v28, v4

    move-object/from16 v39, v6

    move-object/from16 v34, v7

    move-object/from16 v37, v8

    move-object/from16 v35, v9

    move-object/from16 v36, v10

    move-object/from16 v33, v11

    move-object/from16 v31, v12

    move-object/from16 v41, v13

    move-object/from16 v32, v14

    move-object/from16 v30, v15

    move-object/from16 v40, v16

    move-object/from16 v38, v17

    move-object/from16 v29, v18

    goto/16 :goto_4

    :cond_0
    move/from16 v23, v3

    move v2, v4

    move-object v3, v5

    move-object v4, v3

    move-object v6, v4

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v21, v15

    move-object/from16 v22, v21

    :goto_0
    if-eqz v23, :cond_1

    move-object/from16 v24, v6

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v6, Lmb/j$b;->f:Lmb/j$b;

    move-object/from16 v25, v7

    const/16 v7, 0xe

    invoke-interface {v0, v1, v7, v6, v5}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmb/j;

    or-int/lit16 v2, v2, 0x4000

    :goto_1
    move-object/from16 v6, v24

    move-object/from16 v7, v25

    goto :goto_0

    :pswitch_1
    move-object/from16 v25, v7

    const/16 v6, 0xd

    const/16 v7, 0xe

    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit16 v2, v2, 0x2000

    goto :goto_1

    :pswitch_2
    move-object/from16 v25, v7

    const/16 v7, 0xe

    sget-object v6, LZi/i;->a:LZi/i;

    const/16 v7, 0xc

    invoke-interface {v0, v1, v7, v6, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ljava/lang/Boolean;

    or-int/lit16 v2, v2, 0x1000

    goto :goto_1

    :pswitch_3
    move-object/from16 v25, v7

    const/16 v7, 0xc

    sget-object v6, LZi/W0;->a:LZi/W0;

    const/16 v7, 0xb

    invoke-interface {v0, v1, v7, v6, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x800

    goto :goto_1

    :pswitch_4
    move-object/from16 v25, v7

    const/16 v7, 0xb

    sget-object v6, LZi/W;->a:LZi/W;

    const/16 v7, 0xa

    invoke-interface {v0, v1, v7, v6, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Ljava/lang/Integer;

    or-int/lit16 v2, v2, 0x400

    goto :goto_1

    :pswitch_5
    move-object/from16 v25, v7

    const/16 v7, 0xa

    sget-object v6, LZi/W0;->a:LZi/W0;

    const/16 v7, 0x9

    invoke-interface {v0, v1, v7, v6, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x200

    goto :goto_1

    :pswitch_6
    move-object/from16 v25, v7

    const/16 v7, 0x9

    sget-object v6, Lmb/k$a;->a:Lmb/k$a;

    const/16 v7, 0x8

    invoke-interface {v0, v1, v7, v6, v11}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Lmb/k;

    or-int/lit16 v2, v2, 0x100

    goto :goto_1

    :pswitch_7
    move-object/from16 v25, v7

    const/16 v7, 0x8

    sget-object v6, Lmb/i$b;->f:Lmb/i$b;

    const/4 v7, 0x7

    invoke-interface {v0, v1, v7, v6, v14}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Lmb/i;

    or-int/lit16 v2, v2, 0x80

    goto :goto_1

    :pswitch_8
    move-object/from16 v25, v7

    const/4 v7, 0x7

    sget-object v6, Lmb/g$b;->f:Lmb/g$b;

    const/4 v7, 0x6

    invoke-interface {v0, v1, v7, v6, v12}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v12, v6

    check-cast v12, Lmb/g;

    or-int/lit8 v2, v2, 0x40

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v25, v7

    const/4 v7, 0x6

    sget-object v6, LZi/i;->a:LZi/i;

    const/4 v7, 0x5

    invoke-interface {v0, v1, v7, v6, v15}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Ljava/lang/Boolean;

    or-int/lit8 v2, v2, 0x20

    goto/16 :goto_1

    :pswitch_a
    move-object/from16 v25, v7

    const/4 v7, 0x5

    sget-object v6, LZi/i;->a:LZi/i;

    const/4 v7, 0x4

    invoke-interface {v0, v1, v7, v6, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    or-int/lit8 v2, v2, 0x10

    goto/16 :goto_1

    :pswitch_b
    move-object/from16 v25, v7

    const/4 v7, 0x4

    sget-object v6, LZi/W0;->a:LZi/W0;

    const/4 v7, 0x3

    invoke-interface {v0, v1, v7, v6, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x8

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v25, v7

    const/4 v7, 0x3

    sget-object v6, LZi/i;->a:LZi/i;

    move-object/from16 v20, v3

    move-object/from16 v3, v25

    const/4 v7, 0x2

    invoke-interface {v0, v1, v7, v6, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    or-int/lit8 v2, v2, 0x4

    move-object v7, v3

    move-object/from16 v3, v20

    move-object/from16 v6, v24

    goto/16 :goto_0

    :pswitch_d
    move-object/from16 v20, v3

    move-object v3, v7

    const/4 v7, 0x2

    sget-object v6, LZi/i;->a:LZi/i;

    move-object/from16 v19, v3

    move-object/from16 v3, v24

    const/4 v7, 0x1

    invoke-interface {v0, v1, v7, v6, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/Boolean;

    or-int/lit8 v2, v2, 0x2

    :goto_2
    move-object/from16 v7, v19

    move-object/from16 v3, v20

    goto/16 :goto_0

    :pswitch_e
    move-object/from16 v20, v3

    move-object/from16 v19, v7

    move-object/from16 v3, v24

    const/4 v7, 0x1

    sget-object v6, LZi/i;->a:LZi/i;

    move-object/from16 v18, v3

    move-object/from16 v3, v22

    const/4 v7, 0x0

    invoke-interface {v0, v1, v7, v6, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v22, v3

    check-cast v22, Ljava/lang/Boolean;

    or-int/lit8 v2, v2, 0x1

    :goto_3
    move-object/from16 v6, v18

    goto :goto_2

    :pswitch_f
    move-object/from16 v20, v3

    move-object/from16 v19, v7

    move-object/from16 v3, v22

    move-object/from16 v18, v24

    const/4 v7, 0x0

    move/from16 v23, v7

    goto :goto_3

    :cond_1
    move-object/from16 v20, v3

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v3, v22

    move/from16 v27, v2

    move-object/from16 v28, v3

    move-object/from16 v31, v4

    move-object/from16 v42, v5

    move-object/from16 v40, v8

    move-object/from16 v38, v9

    move-object/from16 v37, v10

    move-object/from16 v36, v11

    move-object/from16 v34, v12

    move-object/from16 v39, v13

    move-object/from16 v35, v14

    move-object/from16 v33, v15

    move-object/from16 v29, v18

    move-object/from16 v30, v19

    move-object/from16 v32, v20

    move-object/from16 v41, v21

    :goto_4
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lmb/s;

    move-object/from16 v26, v0

    const/16 v43, 0x0

    invoke-direct/range {v26 .. v43}, Lmb/s;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lmb/j;LZi/R0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
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

.method public final h(LYi/f;Lmb/s;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmb/s$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lmb/s;->r(Lmb/s;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
