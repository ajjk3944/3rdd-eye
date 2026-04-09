.class final Lq9/o$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq9/o;->f(Lq9/i;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LIi/N;

.field final synthetic c:Lq9/i;


# direct methods
.method constructor <init>(Ljava/util/List;LIi/N;Lq9/i;)V
    .locals 0

    iput-object p1, p0, Lq9/o$c;->a:Ljava/util/List;

    iput-object p2, p0, Lq9/o$c;->b:LIi/N;

    iput-object p3, p0, Lq9/o$c;->c:Lq9/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;Lq9/i;Ljava/util/List;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lq9/o$c;->c(LIi/N;Lq9/i;Ljava/util/List;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;Lq9/i;Ljava/util/List;I)LYg/J;
    .locals 6

    new-instance v3, Lq9/o$c$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, p2, p3, v0}, Lq9/o$c$a;-><init>(Lq9/i;Ljava/util/List;ILdh/e;)V

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
.method public final b(ILT/l;I)V
    .locals 11

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->i(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v2, 0x12

    if-ne v0, v2, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string/jumbo v2, "com.ui.core.ui.account.UiAccountPickerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiAccountPickerScreen.kt:135)"

    const v3, -0x6ca41078

    invoke-static {v3, p3, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v0, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v0, p2, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->a()Lra/b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lra/b$a$a;->e()F

    move-result v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    iget-object v2, p0, Lq9/o$c;->a:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq9/g;

    invoke-virtual {v2}, Lq9/g;->d()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "ui_account_picker_delete_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v4

    const v0, -0x5a74fad8

    invoke-interface {p2, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lq9/o$c;->b:LIi/N;

    invoke-interface {p2, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Lq9/o$c;->c:Lq9/i;

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    iget-object v2, p0, Lq9/o$c;->a:Ljava/util/List;

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    and-int/lit8 p3, p3, 0xe

    if-ne p3, v1, :cond_5

    const/4 p3, 0x1

    goto :goto_2

    :cond_5
    const/4 p3, 0x0

    :goto_2
    or-int/2addr p3, v0

    iget-object v0, p0, Lq9/o$c;->b:LIi/N;

    iget-object v1, p0, Lq9/o$c;->c:Lq9/i;

    iget-object v2, p0, Lq9/o$c;->a:Ljava/util/List;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez p3, :cond_6

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v3, p3, :cond_7

    :cond_6
    new-instance v3, Lq9/q;

    invoke-direct {v3, v0, v1, v2, p1}, Lq9/q;-><init>(LIi/N;Lq9/i;Ljava/util/List;I)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    sget-object p1, Lq9/a;->a:Lq9/a;

    invoke-virtual {p1}, Lq9/a;->a()Lmh/p;

    move-result-object v7

    const/16 v9, 0x6000

    const/16 v10, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, p2

    invoke-static/range {v3 .. v10}, LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lq9/o$c;->b(ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
