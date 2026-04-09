.class public abstract Ltd/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltd/h$a;
    }
.end annotation


# direct methods
.method public static final a(LKa/c;)Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;

    invoke-virtual {p0}, LKa/c;->b()LKa/b;

    move-result-object v1

    sget-object v2, Ltd/h$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->FINISHED:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object v1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->IN_PROGRESS:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    :goto_0
    invoke-virtual {p0}, LKa/c;->a()J

    move-result-wide v2

    const/16 p0, 0x8

    int-to-long v4, p0

    mul-long/2addr v2, v4

    invoke-direct {v0, v1, v2, v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;J)V

    return-object v0
.end method
