.class public final Lcom/ui/wifiman/model/ubiquiti/console/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/a;->d()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/console/a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/console/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$c;->a:Lcom/ui/wifiman/model/ubiquiti/console/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    const-string v0, "ConsolesManager - clearing consoles"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/a$c;->a:Lcom/ui/wifiman/model/ubiquiti/console/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/a;->h(Lcom/ui/wifiman/model/ubiquiti/console/a;)LNb/e;

    move-result-object v0

    invoke-interface {v0}, LNb/e;->clear()V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
