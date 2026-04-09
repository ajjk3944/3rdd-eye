.class public final LO5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO5/a$a;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:LE6/d;

.field private final c:LE6/c;

.field private final d:Lr/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLE6/d;LE6/c;Lr/i;)V
    .locals 1

    const-string/jumbo v0, "initialScroll"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "autoScrollCondition"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "autoScrollAnimationSpec"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LO5/a;->a:Z

    iput-object p2, p0, LO5/a;->b:LE6/d;

    iput-object p3, p0, LO5/a;->c:LE6/c;

    iput-object p4, p0, LO5/a;->d:Lr/i;

    return-void
.end method


# virtual methods
.method public final a()LE6/d;
    .locals 1

    iget-object v0, p0, LO5/a;->b:LE6/d;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LO5/a;->a:Z

    return v0
.end method

.method public final c(Lx6/b;Lx6/b;LO5/c;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, LO5/a$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LO5/a$b;

    iget v1, v0, LO5/a$b;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO5/a$b;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LO5/a$b;

    invoke-direct {v0, p0, p4}, LO5/a$b;-><init>(LO5/a;Ldh/e;)V

    :goto_0
    iget-object p4, v0, LO5/a$b;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO5/a$b;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LO5/a$b;->b:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, LO5/c;

    iget-object p1, v0, LO5/a$b;->a:Ljava/lang/Object;

    check-cast p1, LO5/a;

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p4, p0, LO5/a;->c:LE6/c;

    invoke-interface {p4, p1, p2}, LE6/c;->a(Lx6/b;Lx6/b;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p3}, LO5/c;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ls/L;->PreventUserInput:Ls/L;

    iput-object p0, v0, LO5/a$b;->a:Ljava/lang/Object;

    iput-object p3, v0, LO5/a$b;->b:Ljava/lang/Object;

    iput v4, v0, LO5/a$b;->e:I

    invoke-static {p3, p1, v0}, Lw/u;->c(Lw/y;Ls/L;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    iget-object p2, p1, LO5/a;->b:LE6/d;

    sget-object p4, LO5/a$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, p4, p2

    if-eq p2, v4, :cond_6

    if-ne p2, v3, :cond_5

    invoke-virtual {p3}, LO5/c;->i()F

    move-result p2

    neg-float p2, p2

    invoke-virtual {p3}, LO5/c;->h()F

    move-result p4

    add-float/2addr p2, p4

    goto :goto_2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    invoke-virtual {p3}, LO5/c;->i()F

    move-result p2

    neg-float p2, p2

    :goto_2
    iget-object p1, p1, LO5/a;->d:Lr/i;

    const/4 p4, 0x0

    iput-object p4, v0, LO5/a$b;->a:Ljava/lang/Object;

    iput-object p4, v0, LO5/a$b;->b:Ljava/lang/Object;

    iput v3, v0, LO5/a$b;->e:I

    invoke-static {p3, p2, p1, v0}, Lw/u;->a(Lw/y;FLr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_8
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
