.class final Ljj/e$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/e;->a(Ljj/i;Ljava/lang/Object;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLjava/lang/Integer;Lmh/r;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljj/i;


# direct methods
.method constructor <init>(ZLjj/i;)V
    .locals 0

    iput-boolean p1, p0, Ljj/e$c;->a:Z

    iput-object p2, p0, Ljj/e$c;->b:Ljj/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/graphics/c;)V
    .locals 4

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ljj/e$c;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljj/e$c;->b:Ljj/i;

    invoke-virtual {v0}, Ljj/i;->I()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Ljj/e$c;->b:Ljj/i;

    invoke-virtual {v0}, Ljj/i;->m()Ljj/b;

    move-result-object v0

    invoke-interface {v0}, Ljj/b;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v0

    :goto_1
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->j(F)V

    iget-boolean v0, p0, Ljj/e$c;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ljj/e$c;->b:Ljj/i;

    invoke-virtual {v0}, Ljj/i;->I()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Ljj/e$c;->b:Ljj/i;

    invoke-virtual {v0}, Ljj/i;->m()Ljj/b;

    move-result-object v0

    invoke-interface {v0}, Ljj/b;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v1

    :cond_3
    invoke-interface {p1, v1}, Landroidx/compose/ui/graphics/c;->f(F)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, Ljj/e$c;->a(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
