.class final LN/C0$e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/C0$e;->a(Landroidx/compose/ui/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:I

.field final synthetic c:Lmh/p;

.field final synthetic d:Lmh/q;

.field final synthetic e:Lmh/p;

.field final synthetic f:LN/p0;

.field final synthetic g:Lmh/p;

.field final synthetic h:Lmh/q;

.field final synthetic i:LN/E0;


# direct methods
.method constructor <init>(ZILmh/p;Lmh/q;Lmh/p;LN/p0;Lmh/p;Lmh/q;LN/E0;)V
    .locals 0

    iput-boolean p1, p0, LN/C0$e$b;->a:Z

    iput p2, p0, LN/C0$e$b;->b:I

    iput-object p3, p0, LN/C0$e$b;->c:Lmh/p;

    iput-object p4, p0, LN/C0$e$b;->d:Lmh/q;

    iput-object p5, p0, LN/C0$e$b;->e:Lmh/p;

    iput-object p6, p0, LN/C0$e$b;->f:LN/p0;

    iput-object p7, p0, LN/C0$e$b;->g:Lmh/p;

    iput-object p8, p0, LN/C0$e$b;->h:Lmh/q;

    iput-object p9, p0, LN/C0$e$b;->i:LN/E0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 13

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

    const-string v1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:216)"

    const v2, 0x69ad25e4

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-boolean v3, p0, LN/C0$e$b;->a:Z

    iget v4, p0, LN/C0$e$b;->b:I

    iget-object v5, p0, LN/C0$e$b;->c:Lmh/p;

    iget-object v6, p0, LN/C0$e$b;->d:Lmh/q;

    new-instance p2, LN/C0$e$b$a;

    iget-object v0, p0, LN/C0$e$b;->h:Lmh/q;

    iget-object v1, p0, LN/C0$e$b;->i:LN/E0;

    invoke-direct {p2, v0, v1}, LN/C0$e$b$a;-><init>(Lmh/q;LN/E0;)V

    const/16 v0, 0x36

    const v1, 0x19dce333

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    iget-object v8, p0, LN/C0$e$b;->e:Lmh/p;

    iget-object v9, p0, LN/C0$e$b;->f:LN/p0;

    iget-object v10, p0, LN/C0$e$b;->g:Lmh/p;

    const/16 v12, 0x6000

    move-object v11, p1

    invoke-static/range {v3 .. v12}, LN/C0;->d(ZILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;LT/l;I)V

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

    invoke-virtual {p0, p1, p2}, LN/C0$e$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
