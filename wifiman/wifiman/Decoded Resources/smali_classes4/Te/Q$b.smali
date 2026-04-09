.class final LTe/Q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTe/Q;->h(LTe/h;LT/l;I)LTe/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LTe/h;

.field final synthetic b:Lma/a;


# direct methods
.method constructor <init>(LTe/h;Lma/a;)V
    .locals 0

    iput-object p1, p0, LTe/Q$b;->a:LTe/h;

    iput-object p2, p0, LTe/Q$b;->b:Lma/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LTe/H;F)J
    .locals 3

    const-string v0, "line"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LTe/H$b;

    if-eqz v0, :cond_5

    iget-object p1, p0, LTe/Q$b;->a:LTe/h;

    invoke-virtual {p1}, LTe/h;->a()LTe/M;

    move-result-object p1

    instance-of v0, p1, LTe/M$b$b;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object p1, LS8/l;->f:LS8/l$a;

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    invoke-virtual {p1, p2}, LS8/l$a;->a(I)LS8/l;

    move-result-object p1

    iget-object p2, p0, LTe/Q$b;->b:Lma/a;

    invoke-static {p1, p2, v2, v1, v2}, LNe/f;->e(LW7/f;Lma/a;LW7/f$a;ILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, LTe/M$b$a$a;

    if-eqz v0, :cond_1

    sget-object p1, LV7/a$a;->e:LV7/a$a$a;

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    invoke-virtual {p1, p2}, LV7/a$a$a;->a(I)LV7/a$a;

    move-result-object p1

    iget-object p2, p0, LTe/Q$b;->b:Lma/a;

    invoke-static {p1, p2, v2, v1, v2}, LNe/f;->e(LW7/f;Lma/a;LW7/f$a;ILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_1

    :cond_1
    instance-of v0, p1, LTe/M$b$a$b;

    if-eqz v0, :cond_2

    sget-object p1, LV7/a$b;->e:LV7/a$b$a;

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    invoke-virtual {p1, p2}, LV7/a$b$a;->a(I)LV7/a$b;

    move-result-object p1

    iget-object p2, p0, LTe/Q$b;->b:Lma/a;

    invoke-static {p1, p2, v2, v1, v2}, LNe/f;->e(LW7/f;Lma/a;LW7/f$a;ILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_1

    :cond_2
    instance-of p2, p1, LTe/M$c;

    if-nez p2, :cond_4

    instance-of p1, p1, LTe/M$a;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    iget-object p1, p0, LTe/Q$b;->b:Lma/a;

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->b()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->f()J

    move-result-wide p1

    goto :goto_1

    :cond_5
    instance-of p2, p1, LTe/H$a;

    if-eqz p2, :cond_6

    check-cast p1, LTe/H$a;

    invoke-virtual {p1}, LTe/H$a;->b()LTe/N;

    move-result-object p1

    iget-object p2, p0, LTe/Q$b;->b:Lma/a;

    invoke-virtual {p1, p2}, LTe/N;->getColor-vNxB06k(Lma/a;)J

    move-result-wide p1

    :goto_1
    return-wide p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTe/H;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, LTe/Q$b;->a(LTe/H;F)J

    move-result-wide p1

    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    return-object p1
.end method
