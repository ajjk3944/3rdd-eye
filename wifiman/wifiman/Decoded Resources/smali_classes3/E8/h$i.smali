.class final LE8/h$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/h;-><init>(Lgg/i;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/h$i$a;
    }
.end annotation


# static fields
.field public static final a:LE8/h$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/h$i;

    invoke-direct {v0}, LE8/h$i;-><init>()V

    sput-object v0, LE8/h$i;->a:LE8/h$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljd/a$b;

    check-cast p2, Ll9/a;

    check-cast p3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    check-cast p4, Ll9/a;

    invoke-virtual {p0, p1, p2, p3, p4}, LE8/h$i;->b(Ljd/a$b;Ll9/a;Lcom/ui/wifiman/model/speedtest/advanced/b;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljd/a$b;Ll9/a;Lcom/ui/wifiman/model/speedtest/advanced/b;Ll9/a;)Ll9/a;
    .locals 11

    const-string/jumbo v0, "myself"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "speedtestState"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljd/a$b;

    invoke-virtual {p4}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ls9/c$b;

    new-instance v1, Lhf/t$b;

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    sget-object p4, LN9/b;->a:LN9/b;

    invoke-virtual {p4}, LN9/b;->B()Ls9/b;

    move-result-object p4

    :goto_0
    invoke-direct {v1, p4}, Lhf/t$b;-><init>(Ls9/a;)V

    new-instance v3, Lhf/t$b;

    const/4 p4, 0x2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljd/a$b;->b()LCc/a;

    move-result-object p2

    if-eqz p2, :cond_1

    sget-object v2, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {p2, v2, v0, p4, v0}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    sget-object p2, LPe/a;->a:LPe/a;

    invoke-virtual {p2}, LPe/a;->o()Ls9/b;

    move-result-object p2

    :cond_2
    invoke-direct {v3, p2}, Lhf/t$b;-><init>(Ls9/a;)V

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->r()Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    move-result-object p2

    sget-object v2, LE8/h$i$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v2, p2

    packed-switch p2, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p2, Lhf/t$c$a;->COMPLETE:Lhf/t$c$a;

    :goto_1
    move-object v5, p2

    goto :goto_2

    :pswitch_1
    sget-object p2, Lhf/t$c$a;->UP:Lhf/t$c$a;

    goto :goto_1

    :pswitch_2
    sget-object p2, Lhf/t$c$a;->DOWN:Lhf/t$c$a;

    goto :goto_1

    :pswitch_3
    sget-object p2, Lhf/t$c$a;->IDLE:Lhf/t$c$a;

    goto :goto_1

    :pswitch_4
    sget-object p2, Lhf/t$c$a;->IDLE:Lhf/t$c$a;

    goto :goto_1

    :goto_2
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->t()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LCd/j$d;

    if-eqz p2, :cond_3

    sget-object v4, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {p2}, LCd/j$d;->b()I

    move-result p2

    invoke-virtual {v4, p2}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object p2

    move-object v6, p2

    goto :goto_3

    :cond_3
    move-object v6, v0

    :goto_3
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->t()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LCd/j$d;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, LCd/j$d;->a()Ljava/lang/Integer;

    move-result-object p2

    move-object v7, p2

    goto :goto_4

    :cond_4
    move-object v7, v0

    :goto_4
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p2

    instance-of v4, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz v4, :cond_5

    goto :goto_5

    :cond_5
    move-object p2, v0

    :goto_5
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v8

    sget-object p2, LW7/a;->b:LW7/a$a;

    invoke-virtual {p2, v8, v9}, LW7/a$a;->b(J)LW7/a;

    move-result-object p2

    move-object v8, p2

    goto :goto_6

    :cond_6
    move-object v8, v0

    :goto_6
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p2

    instance-of v4, p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz v4, :cond_7

    goto :goto_7

    :cond_7
    move-object p2, v0

    :goto_7
    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v9

    sget-object p2, LW7/a;->b:LW7/a$a;

    invoke-virtual {p2, v9, v10}, LW7/a$a;->b(J)LW7/a;

    move-result-object p2

    move-object v9, p2

    goto :goto_8

    :cond_8
    move-object v9, v0

    :goto_8
    new-instance p2, Lhf/t$c;

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Lhf/t$c;-><init>(Lhf/t$c$a;Lb8/b;Ljava/lang/Integer;LW7/a;LW7/a;)V

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->r()Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v2, v2, v4

    packed-switch v2, :pswitch_data_1

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_5
    sget-object v2, Lhf/t$c$a;->COMPLETE:Lhf/t$c$a;

    :goto_9
    move-object v5, v2

    goto :goto_a

    :pswitch_6
    sget-object v2, Lhf/t$c$a;->UP:Lhf/t$c$a;

    goto :goto_9

    :pswitch_7
    sget-object v2, Lhf/t$c$a;->DOWN:Lhf/t$c$a;

    goto :goto_9

    :pswitch_8
    sget-object v2, Lhf/t$c$a;->IDLE:Lhf/t$c$a;

    goto :goto_9

    :goto_a
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->o()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v4, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {v4, v2}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v2

    move-object v6, v2

    goto :goto_b

    :cond_9
    move-object v6, v0

    :goto_b
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->n()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v7, v2

    goto :goto_c

    :cond_a
    move-object v7, v0

    :goto_c
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->l()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v4, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz v4, :cond_b

    goto :goto_d

    :cond_b
    move-object v2, v0

    :goto_d
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v8

    sget-object v2, LW7/a;->b:LW7/a$a;

    invoke-virtual {v2, v8, v9}, LW7/a$a;->b(J)LW7/a;

    move-result-object v2

    move-object v8, v2

    goto :goto_e

    :cond_c
    move-object v8, v0

    :goto_e
    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/advanced/b;->p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p3

    instance-of v2, p3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-eqz v2, :cond_d

    goto :goto_f

    :cond_d
    move-object p3, v0

    :goto_f
    if-eqz p3, :cond_e

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p3, :cond_e

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v9

    sget-object p3, LW7/a;->b:LW7/a$a;

    invoke-virtual {p3, v9, v10}, LW7/a$a;->b(J)LW7/a;

    move-result-object p3

    move-object v9, p3

    goto :goto_10

    :cond_e
    move-object v9, v0

    :goto_10
    new-instance v2, Lhf/t$c;

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lhf/t$c;-><init>(Lhf/t$c$a;Lb8/b;Ljava/lang/Integer;LW7/a;LW7/a;)V

    new-instance v5, Lhf/t$b;

    invoke-virtual {p1}, Ljd/a$b;->b()LCc/a;

    move-result-object p1

    if-eqz p1, :cond_f

    sget-object p3, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {p1, p3, v0, p4, v0}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object p1

    if-nez p1, :cond_10

    :cond_f
    new-instance p1, Ls9/c$a;

    const p3, 0x7f0703e5

    invoke-direct {p1, p3, v0, p4, v0}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_10
    invoke-direct {v5, p1}, Lhf/t$b;-><init>(Ls9/a;)V

    new-instance p1, Lhf/t$a$a;

    move-object v0, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lhf/t$a$a;-><init>(Lhf/t$b;Lhf/t$c;Lhf/t$b;Lhf/t$c;Lhf/t$b;)V

    new-instance p2, Ll9/a;

    invoke-direct {p2, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method
