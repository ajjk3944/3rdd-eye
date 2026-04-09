.class public final Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e;->a(Lcom/ui/wifiman/model/wmw/g$c;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/g$c;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;Lcom/ui/wifiman/model/wmw/g$c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e$a;->a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e$a;->b:Lcom/ui/wifiman/model/wmw/g$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e$a;->a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->d(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;)Lse/g;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "notificationService"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e$a;->b:Lcom/ui/wifiman/model/wmw/g$c;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e$a;->b:Lcom/ui/wifiman/model/wmw/g$c;

    invoke-interface {v0, v1}, Lse/g;->c(Lcom/ui/wifiman/model/wmw/g$c;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
