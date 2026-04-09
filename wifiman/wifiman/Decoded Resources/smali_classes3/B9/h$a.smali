.class final LB9/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB9/h;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ls9/a;Lmh/a;Lmh/a;LB9/b;LB9/b;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:Ls9/a;


# direct methods
.method constructor <init>(Lmh/a;Ls9/a;)V
    .locals 0

    iput-object p1, p0, LB9/h$a;->a:Lmh/a;

    iput-object p2, p0, LB9/h$a;->b:Ls9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0}, LB9/h$a;->c(Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/a;)LYg/J;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
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

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.list.UiContentCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiContentCard.kt:103)"

    const v2, 0x671305a0

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const p2, -0x24800ad7

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LB9/h$a;->a:Lmh/a;

    invoke-interface {p1, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    iget-object v0, p0, LB9/h$a;->a:Lmh/a;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_3

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_4

    :cond_3
    new-instance v1, LB9/g;

    invoke-direct {v1, v0}, LB9/g;-><init>(Lmh/a;)V

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v2, v1

    check-cast v2, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    iget-object p2, p0, LB9/h$a;->a:Lmh/a;

    const/4 v0, 0x1

    if-eqz p2, :cond_5

    move v4, v0

    goto :goto_1

    :cond_5
    const/4 p2, 0x0

    move v4, p2

    :goto_1
    new-instance p2, LB9/h$a$a;

    iget-object v1, p0, LB9/h$a;->b:Ls9/a;

    invoke-direct {p2, v1}, LB9/h$a$a;-><init>(Ls9/a;)V

    const/16 v1, 0x36

    const v3, 0x7ecb0e3c

    invoke-static {v3, v0, p2, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/16 v8, 0x6000

    const/16 v9, 0xa

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v9}, LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LB9/h$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
