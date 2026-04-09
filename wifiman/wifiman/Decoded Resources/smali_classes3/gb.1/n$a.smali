.class public final synthetic Lgb/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lgb/n$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgb/n$a;

    invoke-direct {v0}, Lgb/n$a;-><init>()V

    sput-object v0, Lgb/n$a;->a:Lgb/n$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.client.http.models.UnadoptedOsDevices"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "model"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "devices"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lgb/n$a;->descriptor:LXi/f;

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

    sget-object v0, Lgb/n$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lgb/n$a;->g(LYi/e;)Lgb/n;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 5

    invoke-static {}, Lgb/n;->a()[LVi/b;

    move-result-object v0

    sget-object v1, LZi/W0;->a:LZi/W0;

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [LVi/b;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    aput-object v0, v3, v2

    return-object v3
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lgb/n;

    invoke-virtual {p0, p1, p2}, Lgb/n$a;->h(LYi/f;Lgb/n;)V

    return-void
.end method

.method public final g(LYi/e;)Lgb/n;
    .locals 11

    const-string/jumbo v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgb/n$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    invoke-static {}, Lgb/n;->a()[LVi/b;

    move-result-object v1

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    sget-object v2, LZi/W0;->a:LZi/W0;

    invoke-interface {p1, v0, v4, v2, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-interface {p1, v0, v3, v1, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v3, 0x3

    goto :goto_1

    :cond_0
    move v8, v3

    move v7, v4

    move-object v2, v5

    move-object v6, v2

    :goto_0
    if-eqz v8, :cond_4

    invoke-interface {p1, v0}, LYi/c;->k(LXi/f;)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_3

    if-eqz v9, :cond_2

    if-ne v9, v3, :cond_1

    aget-object v9, v1, v3

    invoke-interface {p1, v0, v3, v9, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    or-int/lit8 v7, v7, 0x2

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {p1, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw p1

    :cond_2
    sget-object v9, LZi/W0;->a:LZi/W0;

    invoke-interface {p1, v0, v4, v9, v6}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    or-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    move v8, v4

    goto :goto_0

    :cond_4
    move-object v1, v2

    move-object v2, v6

    move v3, v7

    :goto_1
    invoke-interface {p1, v0}, LYi/c;->b(LXi/f;)V

    new-instance p1, Lgb/n;

    invoke-direct {p1, v3, v2, v1, v5}, Lgb/n;-><init>(ILjava/lang/String;Ljava/util/List;LZi/R0;)V

    return-object p1
.end method

.method public final h(LYi/f;Lgb/n;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgb/n$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lgb/n;->b(Lgb/n;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
