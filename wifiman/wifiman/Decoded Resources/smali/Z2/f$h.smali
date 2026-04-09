.class final LZ2/f$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ2/f;->a(LZ2/h;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LZ2/h;

.field final synthetic b:Landroid/widget/FrameLayout$LayoutParams;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Z

.field final synthetic e:LZ2/g;

.field final synthetic f:Lmh/l;

.field final synthetic g:Lmh/l;

.field final synthetic h:LZ2/b;

.field final synthetic i:LZ2/a;

.field final synthetic j:Lmh/l;

.field final synthetic k:I

.field final synthetic l:I


# direct methods
.method constructor <init>(LZ2/h;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;II)V
    .locals 0

    iput-object p1, p0, LZ2/f$h;->a:LZ2/h;

    iput-object p2, p0, LZ2/f$h;->b:Landroid/widget/FrameLayout$LayoutParams;

    iput-object p3, p0, LZ2/f$h;->c:Landroidx/compose/ui/e;

    iput-boolean p4, p0, LZ2/f$h;->d:Z

    iput-object p5, p0, LZ2/f$h;->e:LZ2/g;

    iput-object p6, p0, LZ2/f$h;->f:Lmh/l;

    iput-object p7, p0, LZ2/f$h;->g:Lmh/l;

    iput-object p8, p0, LZ2/f$h;->h:LZ2/b;

    iput-object p9, p0, LZ2/f$h;->i:LZ2/a;

    iput-object p10, p0, LZ2/f$h;->j:Lmh/l;

    iput p11, p0, LZ2/f$h;->k:I

    iput p12, p0, LZ2/f$h;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 13

    iget-object v0, p0, LZ2/f$h;->a:LZ2/h;

    iget-object v1, p0, LZ2/f$h;->b:Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, LZ2/f$h;->c:Landroidx/compose/ui/e;

    iget-boolean v3, p0, LZ2/f$h;->d:Z

    iget-object v4, p0, LZ2/f$h;->e:LZ2/g;

    iget-object v5, p0, LZ2/f$h;->f:Lmh/l;

    iget-object v6, p0, LZ2/f$h;->g:Lmh/l;

    iget-object v7, p0, LZ2/f$h;->h:LZ2/b;

    iget-object v8, p0, LZ2/f$h;->i:LZ2/a;

    iget-object v9, p0, LZ2/f$h;->j:Lmh/l;

    iget p2, p0, LZ2/f$h;->k:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v11

    iget v12, p0, LZ2/f$h;->l:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, LZ2/f;->a(LZ2/h;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LZ2/f$h;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
