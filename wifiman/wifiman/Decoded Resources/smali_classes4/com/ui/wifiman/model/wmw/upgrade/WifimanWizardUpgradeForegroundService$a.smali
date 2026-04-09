.class public final Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;Landroid/content/Intent;)Lcom/ui/wifiman/model/wmw/g$b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;->b(Landroid/content/Intent;)Lcom/ui/wifiman/model/wmw/g$b;

    move-result-object p0

    return-object p0
.end method

.method private final b(Landroid/content/Intent;)Lcom/ui/wifiman/model/wmw/g$b;
    .locals 1

    const-string v0, "firmware"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$b;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$b;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final c()I
    .locals 1

    sget-object v0, LO7/c;->WIFIMAN_WIZARD_FW_UPGRADE:LO7/c;

    invoke-virtual {v0}, LO7/c;->getId()I

    move-result v0

    return v0
.end method

.method public final d(Landroid/content/Context;Lcom/ui/wifiman/model/wmw/g$b;)Landroid/content/Intent;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmware"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-class v2, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "com.ubnt.usurvey.wmw.fw.start"

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    return-object v1
.end method
