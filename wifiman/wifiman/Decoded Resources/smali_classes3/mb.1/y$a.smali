.class public final synthetic Lmb/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lmb/y$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmb/y$a;

    invoke-direct {v0}, Lmb/y$a;-><init>()V

    sput-object v0, Lmb/y$a;->a:Lmb/y$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.devices.UcoreDevice"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "owner"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "lastConnectionStateChange"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "hardwareId"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "shadow"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "userData"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "controllers"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "device"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lmb/y$a;->descriptor:LXi/f;

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

    sget-object v0, Lmb/y$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmb/y$a;->g(LYi/e;)Lmb/y;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 6

    invoke-static {}, Lmb/y;->a()[LVi/b;

    move-result-object v0

    const/4 v1, 0x6

    aget-object v0, v0, v1

    const/16 v2, 0x8

    new-array v2, v2, [LVi/b;

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v4, LZi/i;->a:LZi/i;

    const/4 v5, 0x1

    aput-object v4, v2, v5

    sget-object v4, LZi/h0;->a:LZi/h0;

    const/4 v5, 0x2

    aput-object v4, v2, v5

    const/4 v4, 0x3

    aput-object v3, v2, v4

    sget-object v3, Lmb/z$a;->a:Lmb/z$a;

    const/4 v4, 0x4

    aput-object v3, v2, v4

    sget-object v3, Lmb/c$a;->a:Lmb/c$a;

    const/4 v4, 0x5

    aput-object v3, v2, v4

    aput-object v0, v2, v1

    sget-object v0, Lmb/l$a;->a:Lmb/l$a;

    const/4 v1, 0x7

    aput-object v0, v2, v1

    return-object v2
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lmb/y;

    invoke-virtual {p0, p1, p2}, Lmb/y$a;->h(LYi/f;Lmb/y;)V

    return-void
.end method

.method public final g(LYi/e;)Lmb/y;
    .locals 33

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lmb/y$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-static {}, Lmb/y;->a()[LVi/b;

    move-result-object v2

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v3

    const/4 v4, 0x7

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x6

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v11}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v10}, LYi/c;->u(LXi/f;I)Z

    move-result v10

    invoke-interface {v0, v1, v8}, LYi/c;->q(LXi/f;I)J

    move-result-wide v13

    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lmb/z$a;->a:Lmb/z$a;

    invoke-interface {v0, v1, v7, v8, v12}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lmb/z;

    sget-object v8, Lmb/c$a;->a:Lmb/c$a;

    invoke-interface {v0, v1, v5, v8, v12}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmb/c;

    aget-object v2, v2, v9

    invoke-interface {v0, v1, v9, v2, v12}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v8, Lmb/l$a;->a:Lmb/l$a;

    invoke-interface {v0, v1, v4, v8, v12}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmb/l;

    const/16 v8, 0xff

    move-object/from16 v30, v2

    move-object/from16 v23, v3

    move-object/from16 v31, v4

    move-object/from16 v29, v5

    move-object/from16 v27, v6

    move-object/from16 v28, v7

    move/from16 v22, v8

    move/from16 v24, v10

    move-wide/from16 v25, v13

    goto/16 :goto_3

    :cond_0
    const-wide/16 v13, 0x0

    move/from16 v20, v10

    move v3, v11

    move-object v8, v12

    move-object v10, v8

    move-object v15, v10

    move-wide/from16 v18, v13

    move-object v13, v15

    move-object v14, v13

    move-object v11, v14

    move v12, v3

    :goto_0
    if-eqz v20, :cond_1

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v6, Lmb/l$a;->a:Lmb/l$a;

    invoke-interface {v0, v1, v4, v6, v8}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lmb/l;

    or-int/lit16 v3, v3, 0x80

    :goto_1
    const/4 v6, 0x3

    goto :goto_0

    :pswitch_1
    aget-object v6, v2, v9

    invoke-interface {v0, v1, v9, v6, v10}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ljava/util/List;

    or-int/lit8 v3, v3, 0x40

    goto :goto_1

    :pswitch_2
    sget-object v6, Lmb/c$a;->a:Lmb/c$a;

    invoke-interface {v0, v1, v5, v6, v11}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Lmb/c;

    or-int/lit8 v3, v3, 0x20

    goto :goto_1

    :pswitch_3
    sget-object v6, Lmb/z$a;->a:Lmb/z$a;

    invoke-interface {v0, v1, v7, v6, v15}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lmb/z;

    or-int/lit8 v3, v3, 0x10

    goto :goto_1

    :pswitch_4
    const/4 v6, 0x3

    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v14

    or-int/lit8 v3, v3, 0x8

    goto :goto_0

    :pswitch_5
    const/4 v4, 0x2

    const/4 v6, 0x3

    invoke-interface {v0, v1, v4}, LYi/c;->q(LXi/f;I)J

    move-result-wide v18

    or-int/lit8 v3, v3, 0x4

    :goto_2
    const/4 v4, 0x7

    goto :goto_0

    :pswitch_6
    const/4 v4, 0x2

    const/4 v6, 0x3

    const/4 v12, 0x1

    invoke-interface {v0, v1, v12}, LYi/c;->u(LXi/f;I)Z

    move-result v16

    or-int/lit8 v3, v3, 0x2

    move/from16 v12, v16

    goto :goto_2

    :pswitch_7
    const/4 v4, 0x2

    const/4 v6, 0x3

    const/4 v13, 0x0

    const/16 v16, 0x1

    invoke-interface {v0, v1, v13}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v3, v3, 0x1

    move-object/from16 v13, v17

    goto :goto_2

    :pswitch_8
    const/4 v4, 0x2

    const/4 v6, 0x3

    const/16 v16, 0x1

    const/16 v17, 0x0

    move/from16 v20, v17

    goto :goto_2

    :cond_1
    move/from16 v22, v3

    move-object/from16 v31, v8

    move-object/from16 v30, v10

    move-object/from16 v29, v11

    move/from16 v24, v12

    move-object/from16 v23, v13

    move-object/from16 v27, v14

    move-object/from16 v28, v15

    move-wide/from16 v25, v18

    :goto_3
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lmb/y;

    const/16 v32, 0x0

    move-object/from16 v21, v0

    invoke-direct/range {v21 .. v32}, Lmb/y;-><init>(ILjava/lang/String;ZJLjava/lang/String;Lmb/z;Lmb/c;Ljava/util/List;Lmb/l;LZi/R0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
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

.method public final h(LYi/f;Lmb/y;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmb/y$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lmb/y;->c(Lmb/y;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
