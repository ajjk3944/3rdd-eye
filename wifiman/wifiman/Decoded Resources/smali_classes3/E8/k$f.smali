.class final LE8/k$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/k;-><init>(Lgg/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/k$f$a;
    }
.end annotation


# instance fields
.field final synthetic a:LE8/k;


# direct methods
.method constructor <init>(LE8/k;)V
    .locals 0

    iput-object p1, p0, LE8/k$f;->a:LE8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lnf/c;
    .locals 10

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/k$f;->a:LE8/k;

    invoke-static {v0, p1}, LE8/k;->a(LE8/k;Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lnf/g;

    move-result-object v0

    sget-object v1, LE8/k$f$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v1, v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iget-object v2, p0, LE8/k$f;->a:LE8/k;

    invoke-virtual {v2, p1}, LE8/k;->e(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_2

    move v2, v5

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    :cond_3
    iget-object v2, p0, LE8/k$f;->a:LE8/k;

    invoke-virtual {v2}, LE8/k;->h()Z

    move-result v2

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v1, v1, v6

    const-string/jumbo v6, "format(...)"

    const-string v7, ""

    if-eq v1, v5, :cond_7

    if-eq v1, v4, :cond_5

    if-ne v1, v3, :cond_4

    goto :goto_2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_2
    iget-object v1, p0, LE8/k$f;->a:LE8/k;

    invoke-virtual {v1, p1}, LE8/k;->e(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    new-instance v1, Ls9/d$c;

    long-to-double v3, v3

    const-wide v8, 0x412e848000000000L    # 1000000.0

    div-double/2addr v3, v8

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%.1f"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_6
    new-instance v1, Ls9/d$c;

    invoke-direct {v1, v7}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_7
    iget-object v1, p0, LE8/k$f;->a:LE8/k;

    invoke-virtual {v1, p1}, LE8/k;->e(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    new-instance v1, Ls9/d$c;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%d"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_8
    new-instance v1, Ls9/d$c;

    invoke-direct {v1, v7}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :goto_3
    iget-object v3, p0, LE8/k$f;->a:LE8/k;

    invoke-virtual {v3, p1}, LE8/k;->f(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ls9/d;

    move-result-object p1

    if-nez p1, :cond_9

    new-instance p1, Ls9/d$c;

    invoke-direct {p1, v7}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_9
    new-instance v3, Lnf/c;

    invoke-direct {v3, v2, v0, v1, p1}, Lnf/c;-><init>(ZLnf/g;Ls9/d;Ls9/d;)V

    return-object v3
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {p0, p1}, LE8/k$f;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lnf/c;

    move-result-object p1

    return-object p1
.end method
