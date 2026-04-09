.class public final LE8/x$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/x$e;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

.field final synthetic b:LE8/x;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;LE8/x;)V
    .locals 0

    iput-object p1, p0, LE8/x$e$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    iput-object p2, p0, LE8/x$e$a;->b:LE8/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, LE8/x$e$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LE8/x$e$a;->b:LE8/x;

    invoke-static {v2}, LE8/x;->G0(LE8/x;)Li8/a;

    move-result-object v2

    new-instance v3, Li8/a$b$B$b$b;

    iget-object v4, p0, LE8/x$e$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v3, v4}, Li8/a$b$B$b$b;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$Error;)V

    new-array v1, v1, [Li8/a$b;

    aput-object v3, v1, v0

    invoke-interface {v2, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v2, p0, LE8/x$e$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, LE8/x$e$a;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/result/b;

    if-eqz v2, :cond_1

    iget-object v3, p0, LE8/x$e$a;->b:LE8/x;

    invoke-static {v3}, LE8/x;->G0(LE8/x;)Li8/a;

    move-result-object v3

    new-instance v4, Li8/a$b$B$b$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b;->f()J

    move-result-wide v5

    invoke-direct {v4, v5, v6, v1}, Li8/a$b$B$b$a;-><init>(JZ)V

    new-array v1, v1, [Li8/a$b;

    aput-object v4, v1, v0

    invoke-interface {v3, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "speedtest is successfully finished but no result ID available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
