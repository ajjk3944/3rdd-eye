.class public abstract LF/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LJ/j;ZLmh/p;LT/l;I)V
    .locals 10

    const v0, 0x7d608533

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LT/l;->c(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:51)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_9

    new-instance v0, Lv/i;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v4, v3, v4}, Lv/i;-><init>(Lv/i$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, Lv/i;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_a

    new-instance v3, LF/k$c;

    invoke-direct {v3, v0}, LF/k$c;-><init>(Lv/i;)V

    invoke-interface {p3, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v2, v3

    check-cast v2, Lmh/a;

    invoke-static {p0, v0}, LJ/l;->a(LJ/j;Lv/i;)Lmh/l;

    move-result-object v3

    shl-int/lit8 v1, v1, 0x9

    const v4, 0xe000

    and-int/2addr v4, v1

    or-int/lit8 v4, v4, 0x36

    const/high16 v5, 0x70000

    and-int/2addr v1, v5

    or-int v8, v4, v1

    const/16 v9, 0x8

    const/4 v4, 0x0

    move-object v1, v0

    move v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Lv/a;->b(Lv/i;Lmh/a;Lmh/l;Landroidx/compose/ui/e;ZLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_c

    new-instance v0, LF/k$d;

    invoke-direct {v0, p0, p1, p2, p4}, LF/k$d;-><init>(LJ/j;ZLmh/p;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method public static final b(LM/G;Lmh/p;LT/l;I)V
    .locals 10

    const v0, -0x7658948d

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_7

    new-instance v0, Lv/i;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v4, v3, v4}, Lv/i;-><init>(Lv/i$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Lv/i;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_8

    new-instance v3, LF/k$a;

    invoke-direct {v3, v0}, LF/k$a;-><init>(Lv/i;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v2, v3

    check-cast v2, Lmh/a;

    invoke-static {p0, v0}, LM/I;->a(LM/G;Lv/i;)Lmh/l;

    move-result-object v3

    invoke-virtual {p0}, LM/G;->E()Z

    move-result v5

    shl-int/lit8 v1, v1, 0xc

    const/high16 v4, 0x70000

    and-int/2addr v1, v4

    or-int/lit8 v8, v1, 0x36

    const/16 v9, 0x8

    const/4 v4, 0x0

    move-object v1, v0

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v1 .. v9}, Lv/a;->b(Lv/i;Lmh/a;Lmh/l;Landroidx/compose/ui/e;ZLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_4
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, LF/k$b;

    invoke-direct {v0, p0, p1, p3}, LF/k$b;-><init>(LM/G;Lmh/p;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method
