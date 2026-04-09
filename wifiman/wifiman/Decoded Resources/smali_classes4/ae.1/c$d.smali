.class public final Lae/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lae/c;->a(Ljava/util/UUID;Ljava/lang/String;Lh9/a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lae/c;

.field final synthetic b:Ljava/util/UUID;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lh9/a;


# direct methods
.method public constructor <init>(Lae/c;Ljava/util/UUID;Ljava/lang/String;Lh9/a;)V
    .locals 0

    iput-object p1, p0, Lae/c$d;->a:Lae/c;

    iput-object p2, p0, Lae/c$d;->b:Ljava/util/UUID;

    iput-object p3, p0, Lae/c$d;->c:Ljava/lang/String;

    iput-object p4, p0, Lae/c$d;->d:Lh9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 9

    :try_start_0
    iget-object v0, p0, Lae/c$d;->a:Lae/c;

    invoke-static {v0}, Lae/c;->b(Lae/c;)Lnc/a;

    move-result-object v0

    sget-object v1, Le8/a;->NETWORK:Le8/a;

    invoke-virtual {v1}, Le8/a;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lnc/a;->a(Ljava/lang/String;)Lmh/l;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lae/b$a$a;->a:Lae/b$a$a;

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    new-instance v2, Landroid/net/Uri$Builder;

    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    const-string v3, "unifi"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "deeplink"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "v1"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "console"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "remote"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "devices"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "settings"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "sso_uuid"

    iget-object v4, p0, Lae/c$d;->b:Ljava/util/UUID;

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "console_id"

    iget-object v4, p0, Lae/c$d;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "unifi_device_mac"

    iget-object v4, p0, Lae/c$d;->d:Lh9/a;

    invoke-virtual {v4}, Lh9/a;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v1, p0, Lae/c$d;->a:Lae/c;

    invoke-static {v1}, Lae/c;->c(Lae/c;)Lnc/j;

    move-result-object v1

    new-instance v2, Lae/c$b;

    invoke-direct {v2, v0}, Lae/c$b;-><init>(Landroid/content/Intent;)V

    invoke-interface {v1, v2}, Lnc/j;->a(Lmh/l;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lae/b$a$b;

    new-instance v8, Lae/a$a;

    iget-object v3, p0, Lae/c$d;->b:Ljava/util/UUID;

    iget-object v4, p0, Lae/c$d;->c:Ljava/lang/String;

    iget-object v5, p0, Lae/c$d;->d:Lh9/a;

    new-instance v6, Lae/c$c;

    invoke-direct {v6, v0}, Lae/c$c;-><init>(Landroid/content/Intent;)V

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lae/a$a;-><init>(Ljava/util/UUID;Ljava/lang/String;Lh9/a;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v8}, Lae/b$a$b;-><init>(Lae/a;)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    sget-object v0, Lae/b$a$c;->a:Lae/b$a$c;

    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
