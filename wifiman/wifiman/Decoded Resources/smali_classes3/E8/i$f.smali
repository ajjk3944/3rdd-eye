.class final LE8/i$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/i;-><init>(Lgg/i;Ljava/lang/String;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/i$f$a;
    }
.end annotation


# static fields
.field public static final a:LE8/i$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/i$f;

    invoke-direct {v0}, LE8/i$f;-><init>()V

    sput-object v0, LE8/i$f;->a:LE8/i$f;

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

    check-cast p1, Ll9/a;

    check-cast p2, LCc/j;

    check-cast p3, Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {p0, p1, p2, p3}, LE8/i$f;->b(Ll9/a;LCc/j;Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;LCc/j;Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ll9/a;
    .locals 11

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "myself"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "speedtestState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/a;

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    new-instance v1, Lhf/t$b;

    sget-object v2, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    const/4 v3, 0x2

    invoke-static {p1, v2, v0, v3, v0}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object p1

    invoke-direct {v1, p1}, Lhf/t$b;-><init>(Ls9/a;)V

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object p1

    sget-object v4, LE8/i$f$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v4, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lhf/t$c$a;->COMPLETE:Lhf/t$c$a;

    :goto_0
    move-object v5, p1

    goto :goto_1

    :pswitch_1
    sget-object p1, Lhf/t$c$a;->UP:Lhf/t$c$a;

    goto :goto_0

    :pswitch_2
    sget-object p1, Lhf/t$c$a;->DOWN:Lhf/t$c$a;

    goto :goto_0

    :pswitch_3
    sget-object p1, Lhf/t$c$a;->IDLE:Lhf/t$c$a;

    goto :goto_0

    :goto_1
    invoke-static {p3}, Lcom/ui/wifiman/model/speedtest/internet/g;->d(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v4, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {v4, p1}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object p1

    move-object v6, p1

    goto :goto_2

    :cond_0
    move-object v6, v0

    :goto_2
    invoke-static {p3}, Lcom/ui/wifiman/model/speedtest/internet/g;->c(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    move-object v7, p1

    goto :goto_3

    :cond_1
    move-object v7, v0

    :goto_3
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    instance-of v4, p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz v4, :cond_2

    goto :goto_4

    :cond_2
    move-object p1, v0

    :goto_4
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v8

    sget-object p1, LW7/a;->b:LW7/a$a;

    invoke-virtual {p1, v8, v9}, LW7/a$a;->b(J)LW7/a;

    move-result-object p1

    move-object v8, p1

    goto :goto_5

    :cond_3
    move-object v8, v0

    :goto_5
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    instance-of p3, p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz p3, :cond_4

    goto :goto_6

    :cond_4
    move-object p1, v0

    :goto_6
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v9

    sget-object p1, LW7/a;->b:LW7/a$a;

    invoke-virtual {p1, v9, v10}, LW7/a$a;->b(J)LW7/a;

    move-result-object p1

    move-object v9, p1

    goto :goto_7

    :cond_5
    move-object v9, v0

    :goto_7
    new-instance p1, Lhf/t$c;

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lhf/t$c;-><init>(Lhf/t$c$a;Lb8/b;Ljava/lang/Integer;LW7/a;LW7/a;)V

    new-instance p3, Lhf/t$b;

    invoke-static {p2, v2, v0, v3, v0}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object p2

    invoke-direct {p3, p2}, Lhf/t$b;-><init>(Ls9/a;)V

    new-instance v0, Lhf/t$a$b;

    invoke-direct {v0, v1, p1, p3}, Lhf/t$a$b;-><init>(Lhf/t$b;Lhf/t$c;Lhf/t$b;)V

    :cond_6
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1

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
