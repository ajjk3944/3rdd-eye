.class final LQ/r$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/r;->a(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/p;Lmh/p;IJJLz/f0;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lmh/p;

.field final synthetic c:Lmh/q;

.field final synthetic d:Lmh/p;

.field final synthetic e:Lmh/p;

.field final synthetic f:LR/b;

.field final synthetic g:Lmh/p;


# direct methods
.method constructor <init>(ILmh/p;Lmh/q;Lmh/p;Lmh/p;LR/b;Lmh/p;)V
    .locals 0

    iput p1, p0, LQ/r$b;->a:I

    iput-object p2, p0, LQ/r$b;->b:Lmh/p;

    iput-object p3, p0, LQ/r$b;->c:Lmh/q;

    iput-object p4, p0, LQ/r$b;->d:Lmh/p;

    iput-object p5, p0, LQ/r$b;->e:Lmh/p;

    iput-object p6, p0, LQ/r$b;->f:LR/b;

    iput-object p7, p0, LQ/r$b;->g:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 12

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

    const-string v1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)"

    const v2, -0x75f846d6

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget v3, p0, LQ/r$b;->a:I

    iget-object v4, p0, LQ/r$b;->b:Lmh/p;

    iget-object v5, p0, LQ/r$b;->c:Lmh/q;

    iget-object v6, p0, LQ/r$b;->d:Lmh/p;

    iget-object v7, p0, LQ/r$b;->e:Lmh/p;

    iget-object v8, p0, LQ/r$b;->f:LR/b;

    iget-object v9, p0, LQ/r$b;->g:Lmh/p;

    const/4 v11, 0x0

    move-object v10, p1

    invoke-static/range {v3 .. v11}, LQ/r;->c(ILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;LT/l;I)V

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

    invoke-virtual {p0, p1, p2}, LQ/r$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
