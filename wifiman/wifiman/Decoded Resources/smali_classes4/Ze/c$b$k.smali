.class final LZe/c$b$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe/c$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Laf/P;

.field final synthetic b:LZe/a;


# direct methods
.method constructor <init>(Laf/P;LZe/a;)V
    .locals 0

    iput-object p1, p0, LZe/c$b$k;->a:Laf/P;

    iput-object p2, p0, LZe/c$b$k;->b:LZe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LZe/a;LS8/c;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LZe/c$b$k;->e(LZe/a;LS8/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LZe/a;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LZe/c$b$k;->f(LZe/a;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LZe/a;LS8/c;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LZe/a;->x0(LS8/c;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(LZe/a;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LZe/a;->y0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Lq/e;LT/l;I)V
    .locals 10

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.SpeedTabUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedTabUi.kt:103)"

    const v1, 0x3471319e

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, p0, LZe/c$b$k;->a:Laf/P;

    if-nez v3, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object p1, p0, LZe/c$b$k;->b:LZe/a;

    const p3, -0x54ecde4e

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_2

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_3

    :cond_2
    new-instance v0, LZe/c$b$k$a;

    invoke-direct {v0, p1}, LZe/c$b$k$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    const p3, -0x54ecea30

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_4

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_5

    :cond_4
    new-instance v1, LZe/e;

    invoke-direct {v1, p1}, LZe/e;-><init>(LZe/a;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v4, v1

    check-cast v4, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const p3, -0x54ecf510

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_6

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_7

    :cond_6
    new-instance v1, LZe/f;

    invoke-direct {v1, p1}, LZe/f;-><init>(LZe/a;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v5, v1

    check-cast v5, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    move-object v6, v0

    check-cast v6, Lmh/a;

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v2, 0x0

    move-object v7, p2

    invoke-static/range {v2 .. v9}, Laf/d0;->w(Landroidx/compose/ui/e;Laf/P;Lmh/l;Lmh/l;Lmh/a;LT/l;II)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LZe/c$b$k;->c(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
