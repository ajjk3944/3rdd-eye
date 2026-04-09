.class final Lbf/q$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/q$a$a;->e(Lz/Y;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/q$a$a$a$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lbf/k;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(Lbf/k;LT/q0;)V
    .locals 0

    iput-object p1, p0, Lbf/q$a$a$a;->a:Lbf/k;

    iput-object p2, p0, Lbf/q$a$a$a;->b:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0}, Lbf/q$a$a$a;->c(LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/q0;)LYg/J;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lbf/q$a$a;->c(LT/q0;Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/Y;LT/l;I)V
    .locals 9

    const-string v0, "$this$UiToolbarSideContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.hosts.NetworkHostsUi.<anonymous>.<anonymous>.<anonymous> (NetworkHostsUi.kt:64)"

    const v1, -0x4c91a38b

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lbf/q$a$a$a;->a:Lbf/k;

    invoke-virtual {p1}, Lbf/k;->C()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, p3, p2, v0, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbf/j;

    sget-object p3, Lbf/q$a$a$a$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    if-eq p1, v1, :cond_6

    const/4 p3, 0x2

    if-ne p1, p3, :cond_5

    const p1, 0x788c3797

    invoke-interface {p2, p1}, LT/l;->U(I)V

    new-instance v3, Ls9/d$b;

    sget p1, Lm8/c;->d:I

    invoke-direct {v3, p1}, Ls9/d$b;-><init>(I)V

    iget-object p1, p0, Lbf/q$a$a$a;->a:Lbf/k;

    const p3, 0x45f4188d

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_3

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_4

    :cond_3
    new-instance v0, Lbf/q$a$a$a$a;

    invoke-direct {v0, p1}, Lbf/q$a$a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v1, v0

    check-cast v1, Lmh/a;

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v0, 0x0

    const/4 v2, 0x0

    move-object v4, p2

    invoke-static/range {v0 .. v6}, LHe/i;->c(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_1

    :cond_5
    const p1, 0x45f3ce6e

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    const p1, 0x788756a1

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->F()Ls9/b;

    move-result-object v0

    const p1, 0x45f3eecf

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lbf/q$a$a$a;->b:LT/q0;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p3, v1, :cond_7

    new-instance p3, Lbf/p;

    invoke-direct {p3, p1}, Lbf/p;-><init>(LT/q0;)V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v5, p3

    check-cast v5, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const/16 v7, 0x6000

    const/16 v8, 0xe

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, LL9/z;->c(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lbf/q$a$a$a;->b(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
