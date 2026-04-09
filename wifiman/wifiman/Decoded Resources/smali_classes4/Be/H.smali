.class public final synthetic LBe/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LQ/z;

.field public final synthetic c:Lmh/q;

.field public final synthetic d:Lmh/q;

.field public final synthetic e:Lmh/q;

.field public final synthetic f:Z

.field public final synthetic g:Lmh/q;

.field public final synthetic h:Z

.field public final synthetic i:Lmh/p;

.field public final synthetic j:Lmh/p;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/H;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LBe/H;->b:LQ/z;

    iput-object p3, p0, LBe/H;->c:Lmh/q;

    iput-object p4, p0, LBe/H;->d:Lmh/q;

    iput-object p5, p0, LBe/H;->e:Lmh/q;

    iput-boolean p6, p0, LBe/H;->f:Z

    iput-object p7, p0, LBe/H;->g:Lmh/q;

    iput-boolean p8, p0, LBe/H;->h:Z

    iput-object p9, p0, LBe/H;->i:Lmh/p;

    iput-object p10, p0, LBe/H;->j:Lmh/p;

    iput p11, p0, LBe/H;->k:I

    iput p12, p0, LBe/H;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LBe/H;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LBe/H;->b:LQ/z;

    iget-object v3, v0, LBe/H;->c:Lmh/q;

    iget-object v4, v0, LBe/H;->d:Lmh/q;

    iget-object v5, v0, LBe/H;->e:Lmh/q;

    iget-boolean v6, v0, LBe/H;->f:Z

    iget-object v7, v0, LBe/H;->g:Lmh/q;

    iget-boolean v8, v0, LBe/H;->h:Z

    iget-object v9, v0, LBe/H;->i:Lmh/p;

    iget-object v10, v0, LBe/H;->j:Lmh/p;

    iget v11, v0, LBe/H;->k:I

    iget v12, v0, LBe/H;->l:I

    move-object/from16 v13, p1

    check-cast v13, LT/l;

    move-object/from16 v14, p2

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    invoke-static/range {v1 .. v14}, LBe/M;->c(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;IILT/l;I)LYg/J;

    move-result-object v1

    return-object v1
.end method
