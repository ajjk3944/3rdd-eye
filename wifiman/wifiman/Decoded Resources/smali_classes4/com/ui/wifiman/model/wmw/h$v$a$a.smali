.class public final Lcom/ui/wifiman/model/wmw/h$v$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h$v$a;->a(LPf/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LPf/a;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/g$b;


# direct methods
.method public constructor <init>(LPf/a;Lcom/ui/wifiman/model/wmw/g$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$v$a$a;->a:LPf/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$v$a$a;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$v$a$a;->a:LPf/a;

    invoke-virtual {v0}, LPf/a;->b()Lcom/ui/common/semver/SemVer;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$v$a$a;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$v$a$a;->a:LPf/a;

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade$Failed;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$v$a$a;->a:LPf/a;

    invoke-virtual {v1}, LPf/a;->b()Lcom/ui/common/semver/SemVer;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$v$a$a;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "FW version after successfull firmware upgrade was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", but expected was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade$Failed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
