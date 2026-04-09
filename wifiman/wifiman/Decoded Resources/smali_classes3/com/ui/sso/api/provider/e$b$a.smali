.class public final Lcom/ui/sso/api/provider/e$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/sso/api/provider/e$b$a;

.field private static final synthetic descriptor:LZi/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/sso/api/provider/e$b$a;

    invoke-direct {v0}, Lcom/ui/sso/api/provider/e$b$a;-><init>()V

    sput-object v0, Lcom/ui/sso/api/provider/e$b$a;->a:Lcom/ui/sso/api/provider/e$b$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.sso.api.UiAccountApiResponse.Auth"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "ubic"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lcom/ui/sso/api/provider/e$b$a;->descriptor:LZi/H0;

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

    sget-object v0, Lcom/ui/sso/api/provider/e$b$a;->descriptor:LZi/H0;

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

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/e$b$a;->g(LYi/e;)Lcom/ui/sso/api/provider/e$b;

    move-result-object p1

    return-object p1
.end method

.method public d()[LVi/b;
    .locals 3

    sget-object v0, LZi/W0;->a:LZi/W0;

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LVi/b;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/sso/api/provider/e$b;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/e$b$a;->h(LYi/f;Lcom/ui/sso/api/provider/e$b;)V

    return-void
.end method

.method public g(LYi/e;)Lcom/ui/sso/api/provider/e$b;
    .locals 9

    const-string/jumbo v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/e$b$a;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    sget-object v1, LZi/W0;->a:LZi/W0;

    invoke-interface {p1, v0, v3, v1, v4}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_0
    move v5, v2

    move v6, v3

    move-object v1, v4

    :goto_0
    if-eqz v5, :cond_3

    invoke-interface {p1, v0}, LYi/c;->k(LXi/f;)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_2

    if-nez v7, :cond_1

    sget-object v6, LZi/W0;->a:LZi/W0;

    invoke-interface {p1, v0, v3, v6, v1}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move v6, v2

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {p1, v7}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw p1

    :cond_2
    move v5, v3

    goto :goto_0

    :cond_3
    move v2, v6

    :goto_1
    invoke-interface {p1, v0}, LYi/c;->b(LXi/f;)V

    new-instance p1, Lcom/ui/sso/api/provider/e$b;

    invoke-direct {p1, v2, v1, v4}, Lcom/ui/sso/api/provider/e$b;-><init>(ILjava/lang/String;LZi/R0;)V

    return-object p1
.end method

.method public h(LYi/f;Lcom/ui/sso/api/provider/e$b;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/e$b$a;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/ui/sso/api/provider/e$b;->d(Lcom/ui/sso/api/provider/e$b;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
