.class final Lcom/ui/core/ui/sso/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/d;->s0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/core/ui/sso/d$c$c;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/d;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c;->a:Lcom/ui/core/ui/sso/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LQ9/j;
    .locals 1

    invoke-static {}, Lcom/ui/core/ui/sso/d$c;->c()LQ9/j;

    move-result-object v0

    return-object v0
.end method

.method private static final c()LQ9/j;
    .locals 1

    new-instance v0, Lcom/ui/core/ui/sso/d$c$a;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/d$c$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:85)"

    const v3, 0x56f3019f

    invoke-static {v3, p2, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c;->a:Lcom/ui/core/ui/sso/d;

    invoke-static {p2}, Lcom/ui/core/ui/sso/d;->G1(Lcom/ui/core/ui/sso/d;)Lcom/ui/core/ui/sso/UiSSO$f;

    move-result-object p2

    sget-object v0, Lcom/ui/core/ui/sso/d$c$c;->b:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_5

    if-eq p2, v1, :cond_4

    const/4 v1, 0x3

    if-ne p2, v1, :cond_3

    sget-object p2, Lcom/ui/core/ui/sso/a$b;->a:Lcom/ui/core/ui/sso/a$b;

    invoke-virtual {p2}, Lcom/ui/core/ui/sso/a$b;->a()Ljava/lang/String;

    move-result-object p2

    :goto_1
    move-object v3, p2

    goto :goto_2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    sget-object p2, Lcom/ui/core/ui/sso/a$d;->a:Lcom/ui/core/ui/sso/a$d;

    invoke-virtual {p2}, Lcom/ui/core/ui/sso/a$d;->a()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_5
    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c;->a:Lcom/ui/core/ui/sso/d;

    invoke-static {p2}, Lcom/ui/core/ui/sso/d;->D1(Lcom/ui/core/ui/sso/d;)Lcom/ui/core/ui/sso/UiSSO$c;

    move-result-object p2

    sget-object v2, Lcom/ui/core/ui/sso/d$c$c;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v2, p2

    if-eq p2, v0, :cond_7

    if-ne p2, v1, :cond_6

    sget-object p2, Lcom/ui/core/ui/sso/a$a;->a:Lcom/ui/core/ui/sso/a$a;

    invoke-virtual {p2}, Lcom/ui/core/ui/sso/a$a;->a()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    sget-object p2, Lcom/ui/core/ui/sso/a$c;->a:Lcom/ui/core/ui/sso/a$c;

    invoke-virtual {p2}, Lcom/ui/core/ui/sso/a$c;->a()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :goto_2
    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c;->a:Lcom/ui/core/ui/sso/d;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->o1()Landroidx/fragment/app/j;

    move-result-object v1

    const-string/jumbo p2, "requireActivity(...)"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    new-array v2, p2, [Lf2/D;

    invoke-static {v2, p1, p2}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v5

    const p2, -0x36476ed

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne p2, v2, :cond_8

    new-instance p2, Lcom/ui/core/ui/sso/e;

    invoke-direct {p2}, Lcom/ui/core/ui/sso/e;-><init>()V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v2, p2

    check-cast v2, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    new-instance p2, Lcom/ui/core/ui/sso/d$c$b;

    iget-object v4, p0, Lcom/ui/core/ui/sso/d$c;->a:Lcom/ui/core/ui/sso/d;

    invoke-direct {p2, v4, v3}, Lcom/ui/core/ui/sso/d$c$b;-><init>(Lcom/ui/core/ui/sso/d;Ljava/lang/String;)V

    const/16 v4, 0x36

    const v6, -0x700f9e4c

    invoke-static {v6, v0, p2, p1, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const v8, 0x30030

    const/16 v9, 0x8

    const/4 v4, 0x0

    move-object v7, p1

    invoke-static/range {v1 .. v9}, LQ9/h;->g(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/d$c;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
