.class final LId/d$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LId/d;-><init>(Landroid/content/Context;Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;Lcom/ui/wifiman/model/teleport/session/TeleportSession;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LId/d$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LId/d$j;

    invoke-direct {v0}, LId/d$j;-><init>()V

    sput-object v0, LId/d$j;->a:LId/d$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/Set;
    .locals 6

    const-string v0, "configurations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJd/a;

    new-instance v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-virtual {v1}, LJd/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/ubnt/teleport/TeleportTunnel$d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    invoke-virtual {v1}, LJd/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, LJd/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v5, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {v2, v3, v4, v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;-><init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LId/d$j;->a(Ljava/util/List;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
