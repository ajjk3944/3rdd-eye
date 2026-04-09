.class public final synthetic LEb/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEb/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:LEb/r$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LEb/r$a;

    invoke-direct {v0}, LEb/r$a;-><init>()V

    sput-object v0, LEb/r$a;->a:LEb/r$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.sso.models.SsoUser"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "username"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "picture"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "first_name"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "last_name"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "twofa_enabled"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "is_verified"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "curr_privacy_rev"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "curr_terms_rev"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "email"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "uuid"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, LEb/r$a;->descriptor:LXi/f;

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

    sget-object v0, LEb/r$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LEb/r$a;->g(LYi/e;)LEb/r;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 8

    sget-object v0, LZi/W0;->a:LZi/W0;

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v1

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v2

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v3

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v4

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v5

    const/16 v6, 0xa

    new-array v6, v6, [LVi/b;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v7, 0x1

    aput-object v1, v6, v7

    const/4 v1, 0x2

    aput-object v2, v6, v1

    const/4 v1, 0x3

    aput-object v3, v6, v1

    sget-object v1, LZi/i;->a:LZi/i;

    const/4 v2, 0x4

    aput-object v1, v6, v2

    const/4 v2, 0x5

    aput-object v1, v6, v2

    const/4 v1, 0x6

    aput-object v4, v6, v1

    const/4 v1, 0x7

    aput-object v5, v6, v1

    const/16 v1, 0x8

    aput-object v0, v6, v1

    const/16 v1, 0x9

    aput-object v0, v6, v1

    return-object v6
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LEb/r;

    invoke-virtual {p0, p1, p2}, LEb/r$a;->h(LYi/f;LEb/r;)V

    return-void
.end method

.method public final g(LYi/e;)LEb/r;
    .locals 33

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LEb/r$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/16 v3, 0x9

    const/4 v4, 0x7

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x3

    const/16 v8, 0x8

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v12}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    sget-object v12, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v11, v12, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v0, v1, v10, v12, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v7, v12, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v9}, LYi/c;->u(LXi/f;I)Z

    move-result v9

    invoke-interface {v0, v1, v6}, LYi/c;->u(LXi/f;I)Z

    move-result v6

    invoke-interface {v0, v1, v5, v12, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0, v1, v4, v12, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x3ff

    move-object/from16 v22, v2

    move-object/from16 v31, v3

    move-object/from16 v29, v4

    move-object/from16 v28, v5

    move/from16 v27, v6

    move-object/from16 v25, v7

    move-object/from16 v30, v8

    move/from16 v26, v9

    move-object/from16 v24, v10

    move-object/from16 v23, v11

    move/from16 v21, v12

    goto/16 :goto_3

    :cond_0
    move/from16 v19, v11

    move v2, v12

    move v14, v2

    move-object v7, v13

    move-object v9, v7

    move-object v10, v9

    move-object v11, v10

    move-object v15, v11

    move-object/from16 v17, v15

    move-object/from16 v18, v17

    move-object/from16 v12, v18

    move v13, v14

    :goto_0
    if-eqz v19, :cond_1

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit16 v14, v14, 0x200

    :goto_1
    const/4 v6, 0x5

    goto :goto_0

    :pswitch_1
    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit16 v14, v14, 0x100

    goto :goto_1

    :pswitch_2
    sget-object v6, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v4, v6, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Ljava/lang/String;

    or-int/lit16 v14, v14, 0x80

    goto :goto_1

    :pswitch_3
    sget-object v6, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v5, v6, v7}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    or-int/lit8 v14, v14, 0x40

    goto :goto_1

    :pswitch_4
    const/4 v6, 0x5

    invoke-interface {v0, v1, v6}, LYi/c;->u(LXi/f;I)Z

    move-result v2

    or-int/lit8 v14, v14, 0x20

    goto :goto_0

    :pswitch_5
    const/4 v6, 0x5

    const/4 v13, 0x4

    invoke-interface {v0, v1, v13}, LYi/c;->u(LXi/f;I)Z

    move-result v16

    or-int/lit8 v14, v14, 0x10

    move/from16 v13, v16

    goto :goto_0

    :pswitch_6
    const/4 v6, 0x5

    const/16 v16, 0x4

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    or-int/lit8 v14, v14, 0x8

    :goto_2
    const/16 v3, 0x9

    const/4 v4, 0x7

    goto :goto_0

    :pswitch_7
    const/4 v4, 0x3

    const/4 v6, 0x5

    const/16 v16, 0x4

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x2

    invoke-interface {v0, v1, v4, v3, v11}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ljava/lang/String;

    or-int/lit8 v14, v14, 0x4

    goto :goto_2

    :pswitch_8
    const/4 v4, 0x2

    const/4 v6, 0x5

    const/16 v16, 0x4

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v3, v12}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ljava/lang/String;

    or-int/lit8 v14, v14, 0x2

    goto :goto_2

    :pswitch_9
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x5

    const/16 v16, 0x4

    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v15

    or-int/lit8 v14, v14, 0x1

    goto :goto_2

    :pswitch_a
    const/4 v3, 0x0

    const/4 v6, 0x5

    const/16 v16, 0x4

    move/from16 v19, v3

    const/16 v3, 0x9

    goto/16 :goto_0

    :cond_1
    move/from16 v27, v2

    move-object/from16 v28, v7

    move-object/from16 v29, v9

    move-object/from16 v25, v10

    move-object/from16 v24, v11

    move-object/from16 v23, v12

    move/from16 v26, v13

    move/from16 v21, v14

    move-object/from16 v22, v15

    move-object/from16 v30, v17

    move-object/from16 v31, v18

    :goto_3
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, LEb/r;

    const/16 v32, 0x0

    move-object/from16 v20, v0

    invoke-direct/range {v20 .. v32}, LEb/r;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
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

.method public final h(LYi/f;LEb/r;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LEb/r$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, LEb/r;->j(LEb/r;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
