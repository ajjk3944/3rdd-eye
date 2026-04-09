.class final LL0/C$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL0/C$f$a;
    }
.end annotation


# static fields
.field public static final a:LL0/C$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$f;

    invoke-direct {v0}, LL0/C$f;-><init>()V

    sput-object v0, LL0/C$f;->a:LL0/C$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LL0/d$c;
    .locals 6

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, LL0/f;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v2, 0x2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    check-cast v2, Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v3, 0x3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/4 v4, 0x4

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    check-cast v4, Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v4, v1

    :goto_3
    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v5, LL0/C$f$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v5, v0

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance p1, LL0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LL0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto/16 :goto_a

    :pswitch_1
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LL0/C;->d()Lc0/k;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    instance-of v5, v0, LL0/o;

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    if-eqz p1, :cond_6

    invoke-interface {v0, p1}, Lc0/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LL0/i$a;

    :cond_6
    :goto_4
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance p1, LL0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LL0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto/16 :goto_a

    :pswitch_2
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LL0/C;->e()Lc0/k;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    instance-of v5, v0, LL0/o;

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    if-eqz p1, :cond_8

    invoke-interface {v0, p1}, Lc0/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LL0/i$b;

    :cond_8
    :goto_5
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance p1, LL0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LL0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto/16 :goto_a

    :pswitch_3
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LL0/C;->f()Lc0/k;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    instance-of v5, v0, LL0/o;

    if-nez v5, :cond_9

    goto :goto_6

    :cond_9
    if-eqz p1, :cond_a

    invoke-interface {v0, p1}, Lc0/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LL0/X;

    :cond_a
    :goto_6
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance p1, LL0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LL0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto/16 :goto_a

    :pswitch_4
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LL0/C;->g()Lc0/k;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    instance-of v5, v0, LL0/o;

    if-nez v5, :cond_b

    goto :goto_7

    :cond_b
    if-eqz p1, :cond_c

    invoke-interface {v0, p1}, Lc0/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LL0/Y;

    :cond_c
    :goto_7
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance p1, LL0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LL0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto :goto_a

    :pswitch_5
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LL0/C;->v()Lc0/k;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    instance-of v5, v0, LL0/o;

    if-nez v5, :cond_d

    goto :goto_8

    :cond_d
    if-eqz p1, :cond_e

    invoke-interface {v0, p1}, Lc0/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LL0/D;

    :cond_e
    :goto_8
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance p1, LL0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LL0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto :goto_a

    :pswitch_6
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LL0/C;->i()Lc0/k;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    instance-of v5, v0, LL0/o;

    if-nez v5, :cond_f

    goto :goto_9

    :cond_f
    if-eqz p1, :cond_10

    invoke-interface {v0, p1}, Lc0/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LL0/v;

    :cond_10
    :goto_9
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance p1, LL0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LL0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    :goto_a
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LL0/C$f;->a(Ljava/lang/Object;)LL0/d$c;

    move-result-object p1

    return-object p1
.end method
