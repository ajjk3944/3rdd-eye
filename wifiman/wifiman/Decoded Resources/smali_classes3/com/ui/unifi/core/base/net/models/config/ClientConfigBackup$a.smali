.class public final synthetic Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;

    invoke-direct {v0}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;-><init>()V

    sput-object v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;->a:Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.config.ClientConfigBackup"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "backup"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "url"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;->descriptor:LXi/f;

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

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;->g(LYi/e;)Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LVi/b;

    sget-object v1, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->a:Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LZi/W0;->a:LZi/W0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;

    invoke-virtual {p0, p1, p2}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;->h(LYi/f;Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;)V

    return-void
.end method

.method public final g(LYi/e;)Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;
    .locals 10

    const-string/jumbo v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    sget-object v1, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->a:Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;

    invoke-interface {p1, v0, v3, v1, v4}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/unifi/core/base/net/models/config/BackupConfig;

    invoke-interface {p1, v0, v2}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    goto :goto_1

    :cond_0
    move v7, v2

    move v6, v3

    move-object v1, v4

    move-object v5, v1

    :goto_0
    if-eqz v7, :cond_4

    invoke-interface {p1, v0}, LYi/c;->k(LXi/f;)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_3

    if-eqz v8, :cond_2

    if-ne v8, v2, :cond_1

    invoke-interface {p1, v0, v2}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v5

    or-int/lit8 v6, v6, 0x2

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {p1, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw p1

    :cond_2
    sget-object v8, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->a:Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;

    invoke-interface {p1, v0, v3, v8, v1}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/unifi/core/base/net/models/config/BackupConfig;

    or-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move v7, v3

    goto :goto_0

    :cond_4
    move-object v2, v5

    move v3, v6

    :goto_1
    invoke-interface {p1, v0}, LYi/c;->b(LXi/f;)V

    new-instance p1, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;

    invoke-direct {p1, v3, v1, v2, v4}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;-><init>(ILcom/ui/unifi/core/base/net/models/config/BackupConfig;Ljava/lang/String;LZi/R0;)V

    return-object p1
.end method

.method public final h(LYi/f;Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;->write$Self$unificore_release(Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
