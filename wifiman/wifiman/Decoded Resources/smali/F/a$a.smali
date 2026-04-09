.class final LF/a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/a;->a(LM/j;Landroidx/compose/ui/e;JLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Landroidx/compose/ui/e;


# direct methods
.method constructor <init>(JLandroidx/compose/ui/e;)V
    .locals 0

    iput-wide p1, p0, LF/a$a;->a:J

    iput-object p3, p0, LF/a$a;->b:Landroidx/compose/ui/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

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

    const-string v1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)"

    const v2, -0x628ed1fe

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-wide v0, p0, LF/a$a;->a:J

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p2, v0, v2

    const/4 v0, 0x0

    if-eqz p2, :cond_7

    const p2, 0x6d028268

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object v1, p0, LF/a$a;->b:Landroidx/compose/ui/e;

    iget-wide v2, p0, LF/a$a;->a:J

    invoke-static {v2, v3}, LY0/k;->h(J)F

    move-result v2

    iget-wide v3, p0, LF/a$a;->a:J

    invoke-static {v3, v4}, LY0/k;->g(J)F

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/r;->r(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->m()Lf0/c;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v1

    invoke-static {p1, v0}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {p1, p2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p1, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v5, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, p2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 p2, 0x0

    const/4 v1, 0x1

    invoke-static {p2, p1, v0, v1}, LF/a;->c(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_2

    :cond_7
    const p2, 0x6d07a484

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LF/a$a;->b:Landroidx/compose/ui/e;

    invoke-static {p2, p1, v0, v0}, LF/a;->c(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
