.class final Lpf/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpf/d;->a(Lpf/b;LT/l;I)Lmh/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lpf/b;


# direct methods
.method constructor <init>(Lpf/b;)V
    .locals 0

    iput-object p1, p0, Lpf/d$a;->a:Lpf/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpf/b$a;Lmh/a;LT/l;I)V
    .locals 11

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissalAction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x93

    const/16 v1, 0x92

    if-ne p4, v1, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v1, "com.ui.wifiman.ui.sso.account.accountPickerDialogs.<anonymous> (SSOAccountPickerDialogs.kt:17)"

    const v2, -0x28c111d4

    invoke-static {v2, v0, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p4, v1, :cond_7

    sget-object p4, Ldh/j;->a:Ldh/j;

    invoke-static {p4, p3}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object p4

    new-instance v1, LT/A;

    invoke-direct {v1, p4}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    move-object p4, v1

    :cond_7
    check-cast p4, LT/A;

    invoke-virtual {p4}, LT/A;->a()LIi/N;

    move-result-object p4

    instance-of v1, p1, Lpf/b$a$a;

    if-eqz v1, :cond_9

    sget-object v2, Ly9/f;->BOTTOM:Ly9/f;

    new-instance v1, Lpf/d$a$a;

    iget-object v3, p0, Lpf/d$a;->a:Lpf/b;

    invoke-direct {v1, p1, p2, p4, v3}, Lpf/d$a$a;-><init>(Lpf/b$a;Lmh/a;LIi/N;Lpf/b;)V

    const/16 p1, 0x36

    const p4, -0x5bd122f9

    const/4 v3, 0x1

    invoke-static {p4, v3, v1, p3, p1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    shl-int/lit8 p1, v0, 0x6

    and-int/lit16 p1, p1, 0x1c00

    or-int/lit16 v9, p1, 0x6006

    const/4 v10, 0x6

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    move-object v8, p3

    invoke-static/range {v2 .. v10}, Ly9/s;->b(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_4
    return-void

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpf/b$a;

    check-cast p2, Lmh/a;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lpf/d$a;->a(Lpf/b$a;Lmh/a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
