.class final LL9/z$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL9/z;->c(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:J

.field final synthetic c:Ls9/b;


# direct methods
.method constructor <init>(ZJLs9/b;)V
    .locals 0

    iput-boolean p1, p0, LL9/z$b;->a:Z

    iput-wide p2, p0, LL9/z$b;->b:J

    iput-object p4, p0, LL9/z$b;->c:Ls9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 4

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

    const-string/jumbo v1, "com.ui.core.ui.component.toolbar.UiToolbarIconButton.<anonymous> (UiToolbarIconButton.kt:28)"

    const v2, 0x28a1d05a

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-boolean p2, p0, LL9/z$b;->a:Z

    if-eqz p2, :cond_3

    const p2, -0x220277c4

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    :goto_1
    invoke-interface {p1}, LT/l;->J()V

    goto :goto_2

    :cond_3
    const p2, -0x22027483

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, LN/r;->a:LN/r;

    sget v0, LN/r;->b:I

    invoke-virtual {p2, p1, v0}, LN/r;->b(LT/l;I)F

    move-result p2

    goto :goto_1

    :goto_2
    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v0

    iget-wide v1, p0, LL9/z$b;->b:J

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    invoke-virtual {v0, v1}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v1, p2}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p2

    filled-new-array {v0, p2}, [LT/I0;

    move-result-object p2

    new-instance v0, LL9/z$b$a;

    iget-object v1, p0, LL9/z$b;->c:Ls9/b;

    invoke-direct {v0, v1}, LL9/z$b$a;-><init>(Ls9/b;)V

    const/16 v1, 0x36

    const v2, 0x66cb451a

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v1, LT/I0;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LT/w;->b([LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LL9/z$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
