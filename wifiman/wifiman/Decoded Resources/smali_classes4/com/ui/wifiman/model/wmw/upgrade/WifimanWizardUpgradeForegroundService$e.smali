.class final Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->g(Lcom/ui/wifiman/model/wmw/g$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e;->a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/g$c;)Lgg/f;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e;->a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;

    new-instance v1, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e$a;

    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e$a;-><init>(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;Lcom/ui/wifiman/model/wmw/g$c;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e;->a(Lcom/ui/wifiman/model/wmw/g$c;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
