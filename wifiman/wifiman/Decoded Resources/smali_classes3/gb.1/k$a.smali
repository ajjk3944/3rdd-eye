.class public final synthetic Lgb/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lgb/k$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgb/k$a;

    invoke-direct {v0}, Lgb/k$a;-><init>()V

    sput-object v0, Lgb/k$a;->a:Lgb/k$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.client.http.models.SystemInfo"

    const/16 v3, 0xc

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "deviceId"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "name"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "timezone"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "mac"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "hardware"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "apps"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "anonymous_device_id"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "directRemoteConnectionState"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "unadoptedUnifiOSDevices"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "owner"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "latestUpdate"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "deviceState"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lgb/k$a;->descriptor:LXi/f;

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

    sget-object v0, Lgb/k$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lgb/k$a;->g(LYi/e;)Lgb/k;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 14

    invoke-static {}, Lgb/k;->d()[LVi/b;

    move-result-object v0

    sget-object v1, LZi/W0;->a:LZi/W0;

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v2

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v3

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v4

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v5

    sget-object v6, Lmb/p$a;->a:Lmb/p$a;

    invoke-static {v6}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v6

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v1

    sget-object v7, Lgb/d$a;->a:Lgb/d$a;

    invoke-static {v7}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v7

    const/16 v8, 0x8

    aget-object v0, v0, v8

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v0

    sget-object v9, Lgb/f$a;->a:Lgb/f$a;

    invoke-static {v9}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v9

    sget-object v10, Lgb/p$a;->a:Lgb/p$a;

    invoke-static {v10}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v10

    sget-object v11, Lmb/m$b;->f:Lmb/m$b;

    invoke-static {v11}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v11

    const/16 v12, 0xc

    new-array v12, v12, [LVi/b;

    const/4 v13, 0x0

    aput-object v2, v12, v13

    const/4 v2, 0x1

    aput-object v3, v12, v2

    const/4 v2, 0x2

    aput-object v4, v12, v2

    const/4 v2, 0x3

    aput-object v5, v12, v2

    const/4 v2, 0x4

    aput-object v6, v12, v2

    sget-object v2, Lgb/b$a;->a:Lgb/b$a;

    const/4 v3, 0x5

    aput-object v2, v12, v3

    const/4 v2, 0x6

    aput-object v1, v12, v2

    const/4 v1, 0x7

    aput-object v7, v12, v1

    aput-object v0, v12, v8

    const/16 v0, 0x9

    aput-object v9, v12, v0

    const/16 v0, 0xa

    aput-object v10, v12, v0

    const/16 v0, 0xb

    aput-object v11, v12, v0

    return-object v12
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lgb/k;

    invoke-virtual {p0, p1, p2}, Lgb/k$a;->h(LYi/f;Lgb/k;)V

    return-void
.end method

.method public final g(LYi/e;)Lgb/k;
    .locals 36

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lgb/k$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-static {}, Lgb/k;->d()[LVi/b;

    move-result-object v2

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v3

    const/16 v6, 0x9

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/16 v13, 0x8

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    sget-object v3, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v15, v3, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v3, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v3, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v10, v3, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    sget-object v5, Lmb/p$a;->a:Lmb/p$a;

    invoke-interface {v0, v1, v11, v5, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmb/p;

    sget-object v11, Lgb/b$a;->a:Lgb/b$a;

    invoke-interface {v0, v1, v9, v11, v4}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lgb/b;

    invoke-interface {v0, v1, v8, v3, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v8, Lgb/d$a;->a:Lgb/d$a;

    invoke-interface {v0, v1, v7, v8, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lgb/d;

    aget-object v2, v2, v13

    invoke-interface {v0, v1, v13, v2, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v8, Lgb/f$a;->a:Lgb/f$a;

    invoke-interface {v0, v1, v6, v8, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lgb/f;

    sget-object v8, Lgb/p$a;->a:Lgb/p$a;

    const/16 v11, 0xa

    invoke-interface {v0, v1, v11, v8, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lgb/p;

    sget-object v11, Lmb/m$b;->f:Lmb/m$b;

    const/16 v13, 0xb

    invoke-interface {v0, v1, v13, v11, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmb/m;

    const/16 v11, 0xfff

    move-object/from16 v31, v2

    move-object/from16 v29, v3

    move-object/from16 v34, v4

    move-object/from16 v27, v5

    move-object/from16 v32, v6

    move-object/from16 v30, v7

    move-object/from16 v33, v8

    move-object/from16 v28, v9

    move-object/from16 v26, v10

    move/from16 v22, v11

    move-object/from16 v25, v12

    move-object/from16 v24, v14

    move-object/from16 v23, v15

    goto/16 :goto_3

    :cond_0
    move-object v3, v4

    move-object v5, v3

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move/from16 v18, v14

    move v6, v15

    move-object v14, v13

    move-object v15, v14

    :goto_0
    if-eqz v18, :cond_1

    move-object/from16 v19, v4

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v4}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v4, Lmb/m$b;->f:Lmb/m$b;

    move-object/from16 v20, v3

    const/16 v3, 0xb

    invoke-interface {v0, v1, v3, v4, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Lmb/m;

    or-int/lit16 v6, v6, 0x800

    :goto_1
    move-object/from16 v4, v19

    move-object/from16 v3, v20

    goto :goto_0

    :pswitch_1
    move-object/from16 v20, v3

    const/16 v3, 0xb

    sget-object v4, Lgb/p$a;->a:Lgb/p$a;

    const/16 v3, 0xa

    invoke-interface {v0, v1, v3, v4, v7}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lgb/p;

    or-int/lit16 v6, v6, 0x400

    goto :goto_1

    :pswitch_2
    move-object/from16 v20, v3

    const/16 v3, 0xa

    sget-object v4, Lgb/f$a;->a:Lgb/f$a;

    const/16 v3, 0x9

    invoke-interface {v0, v1, v3, v4, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lgb/f;

    or-int/lit16 v6, v6, 0x200

    goto :goto_1

    :pswitch_3
    move-object/from16 v20, v3

    const/16 v4, 0x8

    aget-object v3, v2, v4

    invoke-interface {v0, v1, v4, v3, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/util/List;

    or-int/lit16 v6, v6, 0x100

    goto :goto_1

    :pswitch_4
    move-object/from16 v20, v3

    const/16 v4, 0x8

    sget-object v3, Lgb/d$a;->a:Lgb/d$a;

    const/4 v4, 0x7

    invoke-interface {v0, v1, v4, v3, v11}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lgb/d;

    or-int/lit16 v6, v6, 0x80

    goto :goto_1

    :pswitch_5
    move-object/from16 v20, v3

    const/4 v4, 0x7

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x6

    invoke-interface {v0, v1, v4, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x40

    goto :goto_1

    :pswitch_6
    move-object/from16 v20, v3

    const/4 v4, 0x6

    sget-object v3, Lgb/b$a;->a:Lgb/b$a;

    const/4 v4, 0x5

    invoke-interface {v0, v1, v4, v3, v12}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Lgb/b;

    or-int/lit8 v6, v6, 0x20

    goto :goto_1

    :pswitch_7
    move-object/from16 v20, v3

    const/4 v4, 0x5

    sget-object v3, Lmb/p$a;->a:Lmb/p$a;

    const/4 v4, 0x4

    invoke-interface {v0, v1, v4, v3, v14}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lmb/p;

    or-int/lit8 v6, v6, 0x10

    goto :goto_1

    :pswitch_8
    move-object/from16 v20, v3

    const/4 v4, 0x4

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4, v3, v15}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x8

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v20, v3

    const/4 v4, 0x3

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x2

    invoke-interface {v0, v1, v4, v3, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x4

    goto/16 :goto_1

    :pswitch_a
    move-object/from16 v20, v3

    const/4 v4, 0x2

    sget-object v3, LZi/W0;->a:LZi/W0;

    move-object/from16 v17, v2

    move-object/from16 v2, v20

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v3, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x2

    move-object/from16 v2, v17

    move-object/from16 v4, v19

    goto/16 :goto_0

    :pswitch_b
    move-object/from16 v17, v2

    move-object v2, v3

    const/4 v4, 0x1

    sget-object v3, LZi/W0;->a:LZi/W0;

    move-object/from16 v16, v2

    move-object/from16 v2, v19

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4, v3, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x1

    move-object v4, v2

    move-object/from16 v3, v16

    :goto_2
    move-object/from16 v2, v17

    goto/16 :goto_0

    :pswitch_c
    move-object/from16 v17, v2

    move-object/from16 v16, v3

    move-object/from16 v2, v19

    const/4 v4, 0x0

    move/from16 v18, v4

    move-object v4, v2

    goto :goto_2

    :cond_1
    move-object/from16 v16, v3

    move-object v2, v4

    move-object/from16 v23, v2

    move-object/from16 v25, v5

    move/from16 v22, v6

    move-object/from16 v33, v7

    move-object/from16 v32, v8

    move-object/from16 v31, v9

    move-object/from16 v29, v10

    move-object/from16 v30, v11

    move-object/from16 v28, v12

    move-object/from16 v34, v13

    move-object/from16 v27, v14

    move-object/from16 v26, v15

    move-object/from16 v24, v16

    :goto_3
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lgb/k;

    const/16 v35, 0x0

    move-object/from16 v21, v0

    invoke-direct/range {v21 .. v35}, Lgb/k;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmb/p;Lgb/b;Ljava/lang/String;Lgb/d;Ljava/util/List;Lgb/f;Lgb/p;Lmb/m;LZi/R0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
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

.method public final h(LYi/f;Lgb/k;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgb/k$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lgb/k;->j(Lgb/k;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
