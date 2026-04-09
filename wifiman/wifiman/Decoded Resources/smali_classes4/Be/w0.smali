.class public final synthetic LBe/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/d;

.field public final synthetic c:Ls9/d;

.field public final synthetic d:Ls9/d;

.field public final synthetic e:Z

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;ZIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/w0;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LBe/w0;->b:Ls9/d;

    iput-object p3, p0, LBe/w0;->c:Ls9/d;

    iput-object p4, p0, LBe/w0;->d:Ls9/d;

    iput-boolean p5, p0, LBe/w0;->e:Z

    iput p6, p0, LBe/w0;->f:I

    iput p7, p0, LBe/w0;->g:I

    iput p8, p0, LBe/w0;->h:I

    iput p9, p0, LBe/w0;->i:I

    iput p10, p0, LBe/w0;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, LBe/w0;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LBe/w0;->b:Ls9/d;

    iget-object v2, p0, LBe/w0;->c:Ls9/d;

    iget-object v3, p0, LBe/w0;->d:Ls9/d;

    iget-boolean v4, p0, LBe/w0;->e:Z

    iget v5, p0, LBe/w0;->f:I

    iget v6, p0, LBe/w0;->g:I

    iget v7, p0, LBe/w0;->h:I

    iget v8, p0, LBe/w0;->i:I

    iget v9, p0, LBe/w0;->j:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, LBe/z0;->a(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;ZIIIIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
