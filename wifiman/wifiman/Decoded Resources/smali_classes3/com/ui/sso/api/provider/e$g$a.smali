.class public final Lcom/ui/sso/api/provider/e$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/e$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/sso/api/provider/e$g$a;

.field private static final synthetic descriptor:LZi/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/sso/api/provider/e$g$a;

    invoke-direct {v0}, Lcom/ui/sso/api/provider/e$g$a;-><init>()V

    sput-object v0, Lcom/ui/sso/api/provider/e$g$a;->a:Lcom/ui/sso/api/provider/e$g$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.sso.api.UiAccountApiResponse.State"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "version"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "state_type"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "appPackage"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isAccountOwner"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lcom/ui/sso/api/provider/e$g$a;->descriptor:LZi/H0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    sget-object v0, Lcom/ui/sso/api/provider/e$g$a;->descriptor:LZi/H0;

    return-object v0
.end method

.method public b()[LVi/b;
    .locals 1

    invoke-static {p0}, LZi/M$a;->a(LZi/M;)[LVi/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/e$g$a;->g(LYi/e;)Lcom/ui/sso/api/provider/e$g;

    move-result-object p1

    return-object p1
.end method

.method public d()[LVi/b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LVi/b;

    sget-object v1, LZi/W;->a:LZi/W;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LZi/W0;->a:LZi/W0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LZi/i;->a:LZi/i;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/sso/api/provider/e$g;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/e$g$a;->h(LYi/f;Lcom/ui/sso/api/provider/e$g;)V

    return-void
.end method

.method public g(LYi/e;)Lcom/ui/sso/api/provider/e$g;
    .locals 19

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/ui/sso/api/provider/e$g$a;->a()LXi/f;

    move-result-object v1

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v6}, LYi/c;->i(LXi/f;I)I

    move-result v2

    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v3}, LYi/c;->u(LXi/f;I)Z

    move-result v3

    const/16 v6, 0xf

    move v14, v2

    move/from16 v17, v3

    move-object/from16 v16, v4

    move-object v15, v5

    move v13, v6

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    move-object v8, v2

    move-object v9, v8

    move v11, v5

    move v2, v6

    move v7, v2

    move v10, v7

    :goto_0
    if-eqz v11, :cond_6

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v12

    const/4 v13, -0x1

    if-eq v12, v13, :cond_5

    if-eqz v12, :cond_4

    if-eq v12, v5, :cond_3

    if-eq v12, v4, :cond_2

    if-ne v12, v3, :cond_1

    invoke-interface {v0, v1, v3}, LYi/c;->u(LXi/f;I)Z

    move-result v7

    or-int/lit8 v10, v10, 0x8

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v12}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v8

    or-int/lit8 v10, v10, 0x4

    goto :goto_0

    :cond_3
    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v9

    or-int/lit8 v10, v10, 0x2

    goto :goto_0

    :cond_4
    invoke-interface {v0, v1, v6}, LYi/c;->i(LXi/f;I)I

    move-result v2

    or-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_5
    move v11, v6

    goto :goto_0

    :cond_6
    move v14, v2

    move/from16 v17, v7

    move-object/from16 v16, v8

    move-object v15, v9

    move v13, v10

    :goto_1
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lcom/ui/sso/api/provider/e$g;

    const/16 v18, 0x0

    move-object v12, v0

    invoke-direct/range {v12 .. v18}, Lcom/ui/sso/api/provider/e$g;-><init>(IILjava/lang/String;Ljava/lang/String;ZLZi/R0;)V

    return-object v0
.end method

.method public h(LYi/f;Lcom/ui/sso/api/provider/e$g;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/e$g$a;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/ui/sso/api/provider/e$g;->g(Lcom/ui/sso/api/provider/e$g;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
