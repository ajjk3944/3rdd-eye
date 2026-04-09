.class public final synthetic Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;

    invoke-direct {v0}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;-><init>()V

    sput-object v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;->a:Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.config.ClientConfigBackupResponse"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "data"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;->descriptor:LXi/f;

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

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;->g(LYi/e;)Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 3

    invoke-static {}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;->access$get$childSerializers$cp()[LVi/b;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [LVi/b;

    aput-object v0, v2, v1

    return-object v2
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;

    invoke-virtual {p0, p1, p2}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;->h(LYi/f;Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;)V

    return-void
.end method

.method public final g(LYi/e;)Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;
    .locals 10

    const-string/jumbo v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    invoke-static {}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;->access$get$childSerializers$cp()[LVi/b;

    move-result-object v1

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    aget-object v1, v1, v4

    invoke-interface {p1, v0, v4, v1, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    goto :goto_1

    :cond_0
    move v6, v3

    move v7, v4

    move-object v2, v5

    :goto_0
    if-eqz v6, :cond_3

    invoke-interface {p1, v0}, LYi/c;->k(LXi/f;)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_2

    if-nez v8, :cond_1

    aget-object v7, v1, v4

    invoke-interface {p1, v0, v4, v7, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    move v7, v3

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {p1, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw p1

    :cond_2
    move v6, v4

    goto :goto_0

    :cond_3
    move-object v1, v2

    move v3, v7

    :goto_1
    invoke-interface {p1, v0}, LYi/c;->b(LXi/f;)V

    new-instance p1, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;

    invoke-direct {p1, v3, v1, v5}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;-><init>(ILjava/util/List;LZi/R0;)V

    return-object p1
.end method

.method public final h(LYi/f;Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;->write$Self$unificore_release(Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackupResponse;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
