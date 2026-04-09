.class final LN/W0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/W0;->a(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;Lmh/p;Lmh/p;ZFLz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lmh/p;

.field final synthetic c:Lmh/p;

.field final synthetic d:Lmh/q;

.field final synthetic e:Lmh/p;

.field final synthetic f:Lmh/p;

.field final synthetic g:Z

.field final synthetic h:F

.field final synthetic i:Lz/N;

.field final synthetic j:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;Lmh/p;Lmh/p;ZFLz/N;I)V
    .locals 0

    iput-object p1, p0, LN/W0$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LN/W0$a;->b:Lmh/p;

    iput-object p3, p0, LN/W0$a;->c:Lmh/p;

    iput-object p4, p0, LN/W0$a;->d:Lmh/q;

    iput-object p5, p0, LN/W0$a;->e:Lmh/p;

    iput-object p6, p0, LN/W0$a;->f:Lmh/p;

    iput-boolean p7, p0, LN/W0$a;->g:Z

    iput p8, p0, LN/W0$a;->h:F

    iput-object p9, p0, LN/W0$a;->i:Lz/N;

    iput p10, p0, LN/W0$a;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    iget-object v0, p0, LN/W0$a;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LN/W0$a;->b:Lmh/p;

    iget-object v2, p0, LN/W0$a;->c:Lmh/p;

    iget-object v3, p0, LN/W0$a;->d:Lmh/q;

    iget-object v4, p0, LN/W0$a;->e:Lmh/p;

    iget-object v5, p0, LN/W0$a;->f:Lmh/p;

    iget-boolean v6, p0, LN/W0$a;->g:Z

    iget v7, p0, LN/W0$a;->h:F

    iget-object v8, p0, LN/W0$a;->i:Lz/N;

    iget p2, p0, LN/W0$a;->j:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v10

    move-object v9, p1

    invoke-static/range {v0 .. v10}, LN/W0;->a(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;Lmh/p;Lmh/p;ZFLz/N;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/W0$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
