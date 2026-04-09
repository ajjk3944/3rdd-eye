.class final LQ/r$c;
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
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lmh/p;

.field final synthetic c:Lmh/p;

.field final synthetic d:Lmh/p;

.field final synthetic e:Lmh/p;

.field final synthetic f:I

.field final synthetic g:J

.field final synthetic h:J

.field final synthetic i:Lz/f0;

.field final synthetic j:Lmh/q;

.field final synthetic k:I

.field final synthetic l:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/p;Lmh/p;IJJLz/f0;Lmh/q;II)V
    .locals 0

    iput-object p1, p0, LQ/r$c;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LQ/r$c;->b:Lmh/p;

    iput-object p3, p0, LQ/r$c;->c:Lmh/p;

    iput-object p4, p0, LQ/r$c;->d:Lmh/p;

    iput-object p5, p0, LQ/r$c;->e:Lmh/p;

    iput p6, p0, LQ/r$c;->f:I

    iput-wide p7, p0, LQ/r$c;->g:J

    iput-wide p9, p0, LQ/r$c;->h:J

    iput-object p11, p0, LQ/r$c;->i:Lz/f0;

    iput-object p12, p0, LQ/r$c;->j:Lmh/q;

    iput p13, p0, LQ/r$c;->k:I

    iput p14, p0, LQ/r$c;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LQ/r$c;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LQ/r$c;->b:Lmh/p;

    iget-object v3, v0, LQ/r$c;->c:Lmh/p;

    iget-object v4, v0, LQ/r$c;->d:Lmh/p;

    iget-object v5, v0, LQ/r$c;->e:Lmh/p;

    iget v6, v0, LQ/r$c;->f:I

    iget-wide v7, v0, LQ/r$c;->g:J

    iget-wide v9, v0, LQ/r$c;->h:J

    iget-object v11, v0, LQ/r$c;->i:Lz/f0;

    iget-object v12, v0, LQ/r$c;->j:Lmh/q;

    iget v13, v0, LQ/r$c;->k:I

    or-int/lit8 v13, v13, 0x1

    invoke-static {v13}, LT/L0;->a(I)I

    move-result v14

    iget v15, v0, LQ/r$c;->l:I

    move-object/from16 v13, p1

    invoke-static/range {v1 .. v15}, LQ/r;->a(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/p;Lmh/p;IJJLz/f0;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LQ/r$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
