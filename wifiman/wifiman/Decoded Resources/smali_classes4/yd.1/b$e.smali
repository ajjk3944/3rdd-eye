.class final Lyd/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->m(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lyd/b;


# direct methods
.method constructor <init>(Lyd/b;)V
    .locals 0

    iput-object p1, p0, Lyd/b$e;->a:Lyd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/D;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqd/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lyd/b$e;->a:Lyd/b;

    check-cast p1, Lqd/d;

    invoke-static {v0, p1}, Lyd/b;->h(Lyd/b;Lqd/d;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lyd/b$e;->a:Lyd/b;

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v0, p1}, Lyd/b;->g(Lyd/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LCd/n;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lyd/b$e;->a:Lyd/b;

    check-cast p1, LCd/n;

    invoke-static {v0, p1}, Lyd/b;->e(Lyd/b;LCd/n;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lyd/b$e;->a:Lyd/b;

    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-static {v0, p1}, Lyd/b;->f(Lyd/b;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unknown speedtest state type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    const-string v0, "error(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {p0, p1}, Lyd/b$e;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
