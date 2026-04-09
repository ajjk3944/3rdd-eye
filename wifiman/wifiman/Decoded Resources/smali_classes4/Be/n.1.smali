.class public final synthetic LBe/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/a;

.field public final synthetic c:Ls9/d;

.field public final synthetic d:Ls9/d;

.field public final synthetic e:Lmh/l;

.field public final synthetic f:Ls9/d;

.field public final synthetic g:Lmh/a;

.field public final synthetic h:Ls9/d;

.field public final synthetic i:Lmh/a;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Ls9/d;Lmh/l;Ls9/d;Lmh/a;Ls9/d;Lmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/n;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LBe/n;->b:Ls9/a;

    iput-object p3, p0, LBe/n;->c:Ls9/d;

    iput-object p4, p0, LBe/n;->d:Ls9/d;

    iput-object p5, p0, LBe/n;->e:Lmh/l;

    iput-object p6, p0, LBe/n;->f:Ls9/d;

    iput-object p7, p0, LBe/n;->g:Lmh/a;

    iput-object p8, p0, LBe/n;->h:Ls9/d;

    iput-object p9, p0, LBe/n;->i:Lmh/a;

    iput p10, p0, LBe/n;->j:I

    iput p11, p0, LBe/n;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, LBe/n;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LBe/n;->b:Ls9/a;

    iget-object v2, p0, LBe/n;->c:Ls9/d;

    iget-object v3, p0, LBe/n;->d:Ls9/d;

    iget-object v4, p0, LBe/n;->e:Lmh/l;

    iget-object v5, p0, LBe/n;->f:Ls9/d;

    iget-object v6, p0, LBe/n;->g:Lmh/a;

    iget-object v7, p0, LBe/n;->h:Ls9/d;

    iget-object v8, p0, LBe/n;->i:Lmh/a;

    iget v9, p0, LBe/n;->j:I

    iget v10, p0, LBe/n;->k:I

    move-object v11, p1

    check-cast v11, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, LBe/o;->d(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Ls9/d;Lmh/l;Ls9/d;Lmh/a;Ls9/d;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
