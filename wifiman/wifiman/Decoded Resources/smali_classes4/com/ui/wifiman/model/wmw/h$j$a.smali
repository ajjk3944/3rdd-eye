.class public final Lcom/ui/wifiman/model/wmw/h$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h$j;->a(Lcc/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/h;

.field final synthetic b:Lcc/a;

.field final synthetic c:Lcom/ui/wifiman/model/wmw/g$b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/wmw/h;Lcc/a;Lcom/ui/wifiman/model/wmw/g$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$j$a;->a:Lcom/ui/wifiman/model/wmw/h;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$j$a;->b:Lcc/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/wmw/h$j$a;->c:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$j$a;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/h;->h(Lcom/ui/wifiman/model/wmw/h;)Lcc/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$j$a;->b:Lcc/a;

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$j$a;->c:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/common/semver/SemVer;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lcc/a;->b(Lcc/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcc/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcc/b;->b(Lcc/a;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$j$a;->c:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WMW - Firmware "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " MARKED as seen"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

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
