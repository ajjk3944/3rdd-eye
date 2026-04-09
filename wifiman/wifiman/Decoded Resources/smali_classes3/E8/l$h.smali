.class final LE8/l$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/l;-><init>(Lgg/i;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/l$h$a;
    }
.end annotation


# static fields
.field public static final a:LE8/l$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/l$h;

    invoke-direct {v0}, LE8/l$h;-><init>()V

    sput-object v0, LE8/l$h;->a:LE8/l$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/j;

    check-cast p2, Lcom/ui/wifiman/model/speedtest/internet/f;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, LE8/l$h;->b(LCc/j;Lcom/ui/wifiman/model/speedtest/internet/f;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LCc/j;Lcom/ui/wifiman/model/speedtest/internet/f;Ll9/a;)Ll9/a;
    .locals 10

    const-string/jumbo v0, "myself"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "speedtestState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ls9/c$b;

    invoke-static {p2}, Lcom/ui/wifiman/model/speedtest/internet/g;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    instance-of v2, v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v2, LL8/j;->a:LL8/j;

    invoke-virtual {v2, v0}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v0, Ls9/c$b;

    sget-object v2, LN9/b;->a:LN9/b;

    invoke-virtual {v2}, LN9/b;->B()Ls9/b;

    move-result-object v5

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    if-eqz v0, :cond_4

    if-eqz p3, :cond_2

    move-object v0, p3

    goto :goto_0

    :cond_2
    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->B()Ls9/b;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p3, v0

    goto :goto_2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_1
    if-eqz p3, :cond_6

    goto :goto_2

    :cond_6
    sget-object p3, LN9/b;->a:LN9/b;

    invoke-virtual {p3}, LN9/b;->B()Ls9/b;

    move-result-object p3

    :goto_2
    new-instance v0, Lhf/t$b;

    invoke-direct {v0, p3}, Lhf/t$b;-><init>(Ls9/a;)V

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/internet/f;->h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object p3

    sget-object v2, LE8/l$h$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v2, p3

    packed-switch p3, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p3, Lhf/t$c$a;->COMPLETE:Lhf/t$c$a;

    :goto_3
    move-object v3, p3

    goto :goto_4

    :pswitch_1
    sget-object p3, Lhf/t$c$a;->UP:Lhf/t$c$a;

    goto :goto_3

    :pswitch_2
    sget-object p3, Lhf/t$c$a;->DOWN:Lhf/t$c$a;

    goto :goto_3

    :pswitch_3
    sget-object p3, Lhf/t$c$a;->IDLE:Lhf/t$c$a;

    goto :goto_3

    :goto_4
    invoke-static {p2}, Lcom/ui/wifiman/model/speedtest/internet/g;->d(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Integer;

    move-result-object p3

    if-eqz p3, :cond_7

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    sget-object v2, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {v2, p3}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object p3

    move-object v4, p3

    goto :goto_5

    :cond_7
    move-object v4, v1

    :goto_5
    invoke-static {p2}, Lcom/ui/wifiman/model/speedtest/internet/g;->c(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/internet/f;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p3

    instance-of v2, p3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz v2, :cond_8

    goto :goto_6

    :cond_8
    move-object p3, v1

    :goto_6
    if-eqz p3, :cond_9

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v6

    sget-object p3, LW7/a;->b:LW7/a$a;

    invoke-virtual {p3, v6, v7}, LW7/a$a;->b(J)LW7/a;

    move-result-object p3

    move-object v6, p3

    goto :goto_7

    :cond_9
    move-object v6, v1

    :goto_7
    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/internet/f;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p2

    instance-of p3, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz p3, :cond_a

    goto :goto_8

    :cond_a
    move-object p2, v1

    :goto_8
    if-eqz p2, :cond_b

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p2, :cond_b

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide p2

    sget-object v2, LW7/a;->b:LW7/a$a;

    invoke-virtual {v2, p2, p3}, LW7/a$a;->b(J)LW7/a;

    move-result-object p2

    move-object v7, p2

    goto :goto_9

    :cond_b
    move-object v7, v1

    :goto_9
    new-instance p2, Lhf/t$c;

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Lhf/t$c;-><init>(Lhf/t$c$a;Lb8/b;Ljava/lang/Integer;LW7/a;LW7/a;)V

    new-instance p3, Lhf/t$b;

    sget-object v2, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    const/4 v3, 0x2

    invoke-static {p1, v2, v1, v3, v1}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object p1

    invoke-direct {p3, p1}, Lhf/t$b;-><init>(Ls9/a;)V

    new-instance p1, Lhf/t$a$b;

    invoke-direct {p1, v0, p2, p3}, Lhf/t$a$b;-><init>(Lhf/t$b;Lhf/t$c;Lhf/t$b;)V

    new-instance p2, Ll9/a;

    invoke-direct {p2, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
