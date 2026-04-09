.class final LIf/P$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIf/P$c;->a(Lz/Y;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIf/b;


# direct methods
.method constructor <init>(LIf/b;)V
    .locals 0

    iput-object p1, p0, LIf/P$c$a;->a:LIf/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 10

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.wmw.WmwStatusPopupUi.<anonymous>.<anonymous>.<anonymous> (WmwStatusPopupUi.kt:104)"

    const v1, -0x5134dfba

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->s()Ls9/b;

    move-result-object p1

    new-instance p3, Ls9/d$b;

    sget v0, Lm8/c;->p4:I

    invoke-direct {p3, v0}, Ls9/d$b;-><init>(I)V

    invoke-virtual {p1, p3}, Ls9/b;->g(Ls9/d;)Ls9/b;

    move-result-object v1

    iget-object p1, p0, LIf/P$c$a;->a:LIf/b;

    const p3, 0x791b028d

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
    new-instance v0, LIf/P$c$a$a;

    invoke-direct {v0, p1}, LIf/P$c$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v6, v0

    check-cast v6, Lmh/a;

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v7, p2

    invoke-static/range {v1 .. v9}, LL9/z;->c(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LIf/P$c$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
