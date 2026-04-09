.class final LQe/q$a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe/q$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lf2/w;

.field final synthetic c:Lxe/r0;


# direct methods
.method constructor <init>(Lf2/w;Lxe/r0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LQe/q$a$c;->b:Lf2/w;

    iput-object p2, p0, LQe/q$a$c;->c:Lxe/r0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(Lxe/r0;Lf2/n;Lf2/r;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQe/q$a$c;->t(Lxe/r0;Lf2/n;Lf2/r;Landroid/os/Bundle;)V

    return-void
.end method

.method private static final t(Lxe/r0;Lf2/n;Lf2/r;Landroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p2}, Lf2/r;->w()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "SPEED"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, LP7/b;->ROOT_SPEED:LP7/b;

    invoke-interface {p0, p1}, Lxe/r0;->a(LP7/b;)V

    goto :goto_0

    :sswitch_1
    const-string p2, "SCAN"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, LP7/b;->ROOT_SCAN:LP7/b;

    invoke-interface {p0, p1}, Lxe/r0;->a(LP7/b;)V

    goto :goto_0

    :sswitch_2
    const-string p2, "TELEPORT"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, LP7/b;->ROOT_TELEPORT:LP7/b;

    invoke-interface {p0, p1}, Lxe/r0;->a(LP7/b;)V

    goto :goto_0

    :sswitch_3
    const-string p2, "DISCOVERY"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, LP7/b;->ROOT_DISCOVERY:LP7/b;

    invoke-interface {p0, p1}, Lxe/r0;->a(LP7/b;)V

    goto :goto_0

    :sswitch_4
    const-string p2, "SIGNAL"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, LP7/b;->ROOT_SIGNAL:LP7/b;

    invoke-interface {p0, p1}, Lxe/r0;->a(LP7/b;)V

    :cond_5
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e379d58 -> :sswitch_4
        -0x61216a70 -> :sswitch_3
        -0x226d18d5 -> :sswitch_2
        0x26be7d -> :sswitch_1
        0x4b70827 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LQe/q$a$c;

    iget-object v0, p0, LQe/q$a$c;->b:Lf2/w;

    iget-object v1, p0, LQe/q$a$c;->c:Lxe/r0;

    invoke-direct {p1, v0, v1, p2}, LQe/q$a$c;-><init>(Lf2/w;Lxe/r0;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LQe/q$a$c;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LQe/q$a$c;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LQe/q$a$c;->b:Lf2/w;

    iget-object v0, p0, LQe/q$a$c;->c:Lxe/r0;

    new-instance v1, LQe/t;

    invoke-direct {v1, v0}, LQe/t;-><init>(Lxe/r0;)V

    invoke-virtual {p1, v1}, Lf2/n;->r(Lf2/n$c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LQe/q$a$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LQe/q$a$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LQe/q$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
