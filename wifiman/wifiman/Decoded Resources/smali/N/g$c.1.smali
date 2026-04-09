.class final LN/g$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/g;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/f;Lm0/i1;Ls/g;LN/d;Lz/N;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Z

.field final synthetic d:Ly/m;

.field final synthetic e:LN/f;

.field final synthetic f:Lm0/i1;

.field final synthetic g:Ls/g;

.field final synthetic h:LN/d;

.field final synthetic i:Lz/N;

.field final synthetic j:Lmh/q;

.field final synthetic k:I

.field final synthetic l:I


# direct methods
.method constructor <init>(Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/f;Lm0/i1;Ls/g;LN/d;Lz/N;Lmh/q;II)V
    .locals 0

    iput-object p1, p0, LN/g$c;->a:Lmh/a;

    iput-object p2, p0, LN/g$c;->b:Landroidx/compose/ui/e;

    iput-boolean p3, p0, LN/g$c;->c:Z

    iput-object p4, p0, LN/g$c;->d:Ly/m;

    iput-object p5, p0, LN/g$c;->e:LN/f;

    iput-object p6, p0, LN/g$c;->f:Lm0/i1;

    iput-object p7, p0, LN/g$c;->g:Ls/g;

    iput-object p8, p0, LN/g$c;->h:LN/d;

    iput-object p9, p0, LN/g$c;->i:Lz/N;

    iput-object p10, p0, LN/g$c;->j:Lmh/q;

    iput p11, p0, LN/g$c;->k:I

    iput p12, p0, LN/g$c;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 13

    iget-object v0, p0, LN/g$c;->a:Lmh/a;

    iget-object v1, p0, LN/g$c;->b:Landroidx/compose/ui/e;

    iget-boolean v2, p0, LN/g$c;->c:Z

    iget-object v3, p0, LN/g$c;->d:Ly/m;

    iget-object v4, p0, LN/g$c;->e:LN/f;

    iget-object v5, p0, LN/g$c;->f:Lm0/i1;

    iget-object v6, p0, LN/g$c;->g:Ls/g;

    iget-object v7, p0, LN/g$c;->h:LN/d;

    iget-object v8, p0, LN/g$c;->i:Lz/N;

    iget-object v9, p0, LN/g$c;->j:Lmh/q;

    iget p2, p0, LN/g$c;->k:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v11

    iget v12, p0, LN/g$c;->l:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, LN/g;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/f;Lm0/i1;Ls/g;LN/d;Lz/N;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/g$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
