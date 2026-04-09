.class final Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->g(Lcom/ui/wifiman/model/wmw/g$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$g;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$g;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$g;->a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected error in upgrade stream."

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$g;->a(Ljava/lang/Throwable;)V

    return-void
.end method
