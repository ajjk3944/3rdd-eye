.class public abstract LLa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a()Li9/a;
    .locals 1

    sget-object v0, Lcom/ui/speedtest/UiSpeedtestLib;->a:Lcom/ui/speedtest/UiSpeedtestLib;

    invoke-virtual {v0}, Lcom/ui/speedtest/UiSpeedtestLib;->a()Li9/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Lmh/a;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LLa/a;->a()Li9/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0, p0}, Li9/a;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final c(Lmh/a;Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LLa/a;->a()Li9/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0, p0, p1}, Li9/a;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
