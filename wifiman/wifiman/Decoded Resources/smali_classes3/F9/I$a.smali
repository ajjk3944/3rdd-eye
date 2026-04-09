.class final LF9/I$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/I;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;Ljava/lang/String;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, LF9/I$a;->a:Ljava/lang/String;

    iput-boolean p2, p0, LF9/I$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 10

    const-string v0, "$this$UiSettingsBase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_4

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.settings.UiSettingsCheckbox.<anonymous> (UiSettingsCheckbox.kt:51)"

    const v2, -0x5090ecde

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-interface {p1, p3, v0, v1}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 p1, 0x8

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result v5

    const/16 v7, 0xb

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object p3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p3}, Lf0/c$a;->j()Lf0/c$b;

    move-result-object p3

    iget-object v3, p0, LF9/I$a;->a:Ljava/lang/String;

    sget-object v0, Lz/c;->a:Lz/c;

    invoke-virtual {v0}, Lz/c;->g()Lz/c$m;

    move-result-object v0

    const/16 v9, 0x30

    invoke-static {v0, p3, p2, v9}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object p3

    invoke-static {p2, v1}, LT/j;->a(LT/l;I)I

    move-result v0

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v1

    invoke-static {p2, p1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object v2, LE0/g;->K:LE0/g$a;

    invoke-virtual {v2}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v5

    if-nez v5, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p2, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_6
    invoke-interface {p2}, LT/l;->I()V

    :goto_2
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual {v2}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v4, p3, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v2}, LE0/g$a;->g()Lmh/p;

    move-result-object p3

    invoke-static {v4, v1, p3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v2}, LE0/g$a;->b()Lmh/p;

    move-result-object p3

    invoke-interface {v4}, LT/l;->o()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v1}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0, p3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v2}, LE0/g$a;->f()Lmh/p;

    move-result-object p3

    invoke-static {v4, p1, p3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p1, Lz/k;->a:Lz/k;

    const p1, 0x7d6eb08a

    invoke-interface {p2, p1}, LT/l;->U(I)V

    if-nez v3, :cond_9

    goto :goto_3

    :cond_9
    const/4 v7, 0x0

    const/16 v8, 0xd

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v2 .. v8}, LG9/o;->b(Landroidx/compose/ui/e;Ljava/lang/String;IILT/l;II)V

    :goto_3
    invoke-interface {p2}, LT/l;->J()V

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LN/c0;->b()LT/H0;

    move-result-object p1

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p3}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p1

    new-instance p3, LF9/I$a$a;

    iget-boolean v0, p0, LF9/I$a;->b:Z

    invoke-direct {p3, v0}, LF9/I$a$a;-><init>(Z)V

    const/16 v0, 0x36

    const v1, 0x2cbfc662

    const/4 v2, 0x1

    invoke-static {v1, v2, p3, p2, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p3

    sget v0, LT/I0;->i:I

    or-int/2addr v0, v9

    invoke-static {p1, p3, p2, v0}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF9/I$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
