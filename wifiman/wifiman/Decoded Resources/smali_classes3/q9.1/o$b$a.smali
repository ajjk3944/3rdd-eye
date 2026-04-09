.class final Lq9/o$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq9/o$b;->a(Lz/Y;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/N;

.field final synthetic b:Lmh/a;


# direct methods
.method constructor <init>(LIi/N;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lq9/o$b$a;->a:LIi/N;

    iput-object p2, p0, Lq9/o$b$a;->b:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lq9/o$b$a;->c(LIi/N;Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;Lmh/a;)LYg/J;
    .locals 6

    new-instance v3, Lq9/o$b$a$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, Lq9/o$b$a$a;-><init>(Lmh/a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/Y;LT/l;I)V
    .locals 9

    const-string v0, "$this$IconButtons"

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

    const-string/jumbo v0, "com.ui.core.ui.account.UiAccountPickerScreen.<anonymous>.<anonymous>.<anonymous> (UiAccountPickerScreen.kt:110)"

    const v1, 0x4d894d69    # 2.8794397E8f

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->s()Ls9/b;

    move-result-object v0

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const-string/jumbo p3, "ui_account_picker_close"

    invoke-static {p1, p3}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v1

    const p1, 0x27666ded

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lq9/o$b$a;->a:LIi/N;

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, Lq9/o$b$a;->b:Lmh/a;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p1, p3

    iget-object p3, p0, Lq9/o$b$a;->a:LIi/N;

    iget-object v2, p0, Lq9/o$b$a;->b:Lmh/a;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez p1, :cond_3

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v3, p1, :cond_4

    :cond_3
    new-instance v3, Lq9/p;

    invoke-direct {v3, p3, v2}, Lq9/p;-><init>(LIi/N;Lmh/a;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v5, v3

    check-cast v5, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v7, 0x0

    const/16 v8, 0xc

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, LL9/z;->c(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;LT/l;II)V

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

    invoke-virtual {p0, p1, p2, p3}, Lq9/o$b$a;->b(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
