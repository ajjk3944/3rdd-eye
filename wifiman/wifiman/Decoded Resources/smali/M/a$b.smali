.class final LM/a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/a;->b(LM/j;ZLW0/i;ZJLandroidx/compose/ui/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/w1;

.field final synthetic b:J

.field final synthetic c:Z

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:LM/j;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/w1;JZLandroidx/compose/ui/e;LM/j;)V
    .locals 0

    iput-object p1, p0, LM/a$b;->a:Landroidx/compose/ui/platform/w1;

    iput-wide p2, p0, LM/a$b;->b:J

    iput-boolean p4, p0, LM/a$b;->c:Z

    iput-object p5, p0, LM/a$b;->d:Landroidx/compose/ui/e;

    iput-object p6, p0, LM/a$b;->e:LM/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)"

    const v2, 0x10b320d1

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/k0;->t()LT/H0;

    move-result-object p2

    iget-object v0, p0, LM/a$b;->a:Landroidx/compose/ui/platform/w1;

    invoke-virtual {p2, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p2

    new-instance v6, LM/a$b$a;

    iget-wide v1, p0, LM/a$b;->b:J

    iget-boolean v3, p0, LM/a$b;->c:Z

    iget-object v4, p0, LM/a$b;->d:Landroidx/compose/ui/e;

    iget-object v5, p0, LM/a$b;->e:LM/j;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LM/a$b$a;-><init>(JZLandroidx/compose/ui/e;LM/j;)V

    const/16 v0, 0x36

    const v1, -0x5505aa6f

    const/4 v2, 0x1

    invoke-static {v1, v2, v6, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v1, LT/I0;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LM/a$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
