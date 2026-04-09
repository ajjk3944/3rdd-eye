.class public final synthetic Lcom/ui/core/ui/sso/UiSSO$a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/core/ui/sso/UiSSO$a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/core/ui/sso/UiSSO$a$c$a;

.field public static final b:I

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/core/ui/sso/UiSSO$a$c$a;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/UiSSO$a$c$a;-><init>()V

    sput-object v0, Lcom/ui/core/ui/sso/UiSSO$a$c$a;->a:Lcom/ui/core/ui/sso/UiSSO$a$c$a;

    const/16 v1, 0x8

    sput v1, Lcom/ui/core/ui/sso/UiSSO$a$c$a;->b:I

    new-instance v2, LZi/H0;

    const-string/jumbo v3, "com.ui.core.ui.sso.UiSSO.AuthResponse.PKCECookie"

    invoke-direct {v2, v3, v0, v1}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "user"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "ubicCookie"

    invoke-virtual {v2, v0, v1}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "oAuthToken"

    invoke-virtual {v2, v0, v1}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "password"

    invoke-virtual {v2, v0, v1}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "deviceIdentifiers"

    invoke-virtual {v2, v0, v1}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isNewAccount"

    invoke-virtual {v2, v0, v1}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "method"

    invoke-virtual {v2, v0, v1}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "verifier"

    invoke-virtual {v2, v0, v1}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v2, Lcom/ui/core/ui/sso/UiSSO$a$c$a;->descriptor:LXi/f;

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

    sget-object v0, Lcom/ui/core/ui/sso/UiSSO$a$c$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/UiSSO$a$c$a;->g(LYi/e;)Lcom/ui/core/ui/sso/UiSSO$a$c;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [LVi/b;

    sget-object v1, LEb/r$a;->a:LEb/r$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LZi/W0;->a:LZi/W0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v2, Lcom/ui/core/ui/sso/UiSSO$b$a;->a:Lcom/ui/core/ui/sso/UiSSO$b$a;

    const/4 v3, 0x4

    aput-object v2, v0, v3

    sget-object v2, LZi/i;->a:LZi/i;

    const/4 v3, 0x5

    aput-object v2, v0, v3

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/core/ui/sso/UiSSO$a$c;

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/UiSSO$a$c$a;->h(LYi/f;Lcom/ui/core/ui/sso/UiSSO$a$c;)V

    return-void
.end method

.method public final g(LYi/e;)Lcom/ui/core/ui/sso/UiSSO$a$c;
    .locals 30

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ui/core/ui/sso/UiSSO$a$c$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v2, :cond_0

    sget-object v2, LEb/r$a;->a:LEb/r$a;

    invoke-interface {v0, v1, v10, v2, v11}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEb/r;

    invoke-interface {v0, v1, v9}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v6

    sget-object v10, Lcom/ui/core/ui/sso/UiSSO$b$a;->a:Lcom/ui/core/ui/sso/UiSSO$b$a;

    invoke-interface {v0, v1, v7, v10, v11}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ui/core/ui/sso/UiSSO$b;

    invoke-interface {v0, v1, v5}, LYi/c;->u(LXi/f;I)Z

    move-result v5

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v3

    const/16 v10, 0xff

    move-object/from16 v21, v2

    move-object/from16 v28, v3

    move-object/from16 v27, v4

    move/from16 v26, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v23, v8

    move-object/from16 v22, v9

    move/from16 v20, v10

    goto/16 :goto_3

    :cond_0
    move/from16 v18, v9

    move v2, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v10, v17

    move v11, v2

    :goto_0
    if-eqz v18, :cond_1

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit16 v11, v11, 0x80

    :goto_1
    const/4 v9, 0x1

    goto :goto_0

    :pswitch_1
    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v11, v11, 0x40

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v5}, LYi/c;->u(LXi/f;I)Z

    move-result v2

    or-int/lit8 v11, v11, 0x20

    goto :goto_1

    :pswitch_3
    sget-object v9, Lcom/ui/core/ui/sso/UiSSO$b$a;->a:Lcom/ui/core/ui/sso/UiSSO$b$a;

    invoke-interface {v0, v1, v7, v9, v10}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/ui/core/ui/sso/UiSSO$b;

    or-int/lit8 v11, v11, 0x10

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v15

    or-int/lit8 v11, v11, 0x8

    goto :goto_1

    :pswitch_5
    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v14

    or-int/lit8 v11, v11, 0x4

    goto :goto_1

    :pswitch_6
    const/4 v9, 0x1

    invoke-interface {v0, v1, v9}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v13

    or-int/lit8 v11, v11, 0x2

    goto :goto_0

    :pswitch_7
    const/4 v9, 0x1

    sget-object v3, LEb/r$a;->a:LEb/r$a;

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4, v3, v12}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, LEb/r;

    or-int/lit8 v11, v11, 0x1

    const/4 v3, 0x7

    :goto_2
    const/4 v4, 0x6

    goto :goto_0

    :pswitch_8
    const/4 v4, 0x0

    const/4 v9, 0x1

    move/from16 v18, v4

    goto :goto_2

    :cond_1
    move/from16 v26, v2

    move-object/from16 v25, v10

    move/from16 v20, v11

    move-object/from16 v21, v12

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    move-object/from16 v24, v15

    move-object/from16 v27, v16

    move-object/from16 v28, v17

    :goto_3
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lcom/ui/core/ui/sso/UiSSO$a$c;

    const/16 v29, 0x0

    move-object/from16 v19, v0

    invoke-direct/range {v19 .. v29}, Lcom/ui/core/ui/sso/UiSSO$a$c;-><init>(ILEb/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ui/core/ui/sso/UiSSO$b;ZLjava/lang/String;Ljava/lang/String;LZi/R0;)V

    return-object v0

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

.method public final h(LYi/f;Lcom/ui/core/ui/sso/UiSSO$a$c;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/core/ui/sso/UiSSO$a$c$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/ui/core/ui/sso/UiSSO$a$c;->n(Lcom/ui/core/ui/sso/UiSSO$a$c;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
