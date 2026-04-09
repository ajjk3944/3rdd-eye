.class public final synthetic Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;

    invoke-direct {v0}, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;-><init>()V

    sput-object v0, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;->a:Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.config.CreateConfigBackupBody"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "filename"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "metadata"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;->descriptor:LXi/f;

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

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;->g(LYi/e;)Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 5

    invoke-static {}, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;->access$get$childSerializers$cp()[LVi/b;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const/4 v2, 0x2

    new-array v2, v2, [LVi/b;

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    aput-object v0, v2, v1

    return-object v2
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;

    invoke-virtual {p0, p1, p2}, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;->h(LYi/f;Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;)V

    return-void
.end method

.method public final g(LYi/e;)Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;
    .locals 11

    const-string/jumbo v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object p1

    invoke-static {}, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;->access$get$childSerializers$cp()[LVi/b;

    move-result-object v1

    invoke-interface {p1}, LYi/c;->B()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    invoke-interface {p1, v0, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    aget-object v1, v1, v3

    invoke-interface {p1, v0, v3, v1, v5}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

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

    invoke-interface {p1, v0, v3, v9, v2}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    or-int/lit8 v7, v7, 0x2

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {p1, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw p1

    :cond_2
    invoke-interface {p1, v0, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v6

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

    new-instance p1, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;

    invoke-direct {p1, v3, v2, v1, v5}, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;-><init>(ILjava/lang/String;Ljava/util/Map;LZi/R0;)V

    return-object p1
.end method

.method public final h(LYi/f;Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;->write$Self$unificore_release(Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
