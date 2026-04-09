.class public final LE8/A$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A$m;->a(Ll9/a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/result/b;)V
    .locals 0

    iput-object p1, p0, LE8/A$m$a;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, LE8/A$m$a;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, LE8/C;->a:LE8/C;

    invoke-virtual {v2, v0}, LE8/C;->b(Lcom/ui/wifiman/model/speedtest/result/b;)Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->e()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
