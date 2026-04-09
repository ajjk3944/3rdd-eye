.class final Lcom/ui/wifiman/model/wmw/h$x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h$x;->a(Ljava/lang/Long;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Long;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/g$b;


# direct methods
.method constructor <init>(Ljava/lang/Long;Lcom/ui/wifiman/model/wmw/g$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$x$a;->a:Ljava/lang/Long;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$x$a;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$Error;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$x$a;->a:Ljava/lang/Long;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$x$a;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    new-instance v3, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade$Failed;

    const-string v4, "Firmware upgrade failed"

    invoke-direct {v3, v4, p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade$Failed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v4, Lcom/ui/wifiman/model/wmw/g$c$b$b$a;

    invoke-direct {v4, v2, v0, v1, v3}, Lcom/ui/wifiman/model/wmw/g$c$b$b$a;-><init>(Lcom/ui/common/semver/SemVer;JLcom/ui/wifiman/model/wmw/WifimanWizard$Error;)V

    const-string v0, "WMW Upgrade failed"

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {v4}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$x$a;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
