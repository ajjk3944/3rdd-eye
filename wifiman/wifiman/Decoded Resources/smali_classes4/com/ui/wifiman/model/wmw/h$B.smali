.class public final Lcom/ui/wifiman/model/wmw/h$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->d(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/h;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/g$b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$B;->a:Lcom/ui/wifiman/model/wmw/h;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$B;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$B;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/h;->j(Lcom/ui/wifiman/model/wmw/h;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->e:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$B;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-static {v2}, Lcom/ui/wifiman/model/wmw/h;->j(Lcom/ui/wifiman/model/wmw/h;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ui/wifiman/model/wmw/h$B;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v1, v2, v3}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;->d(Landroid/content/Context;Lcom/ui/wifiman/model/wmw/g$b;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

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
