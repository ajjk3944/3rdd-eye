.class public final synthetic LBe/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LL0/d;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:LL0/U;

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Lmh/l;

.field public final synthetic h:Lmh/l;

.field public final synthetic i:Lmh/l;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;Lmh/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/c;->a:LL0/d;

    iput-object p2, p0, LBe/c;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LBe/c;->c:LL0/U;

    iput-boolean p4, p0, LBe/c;->d:Z

    iput p5, p0, LBe/c;->e:I

    iput p6, p0, LBe/c;->f:I

    iput-object p7, p0, LBe/c;->g:Lmh/l;

    iput-object p8, p0, LBe/c;->h:Lmh/l;

    iput-object p9, p0, LBe/c;->i:Lmh/l;

    iput p10, p0, LBe/c;->j:I

    iput p11, p0, LBe/c;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, LBe/c;->a:LL0/d;

    iget-object v1, p0, LBe/c;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LBe/c;->c:LL0/U;

    iget-boolean v3, p0, LBe/c;->d:Z

    iget v4, p0, LBe/c;->e:I

    iget v5, p0, LBe/c;->f:I

    iget-object v6, p0, LBe/c;->g:Lmh/l;

    iget-object v7, p0, LBe/c;->h:Lmh/l;

    iget-object v8, p0, LBe/c;->i:Lmh/l;

    iget v9, p0, LBe/c;->j:I

    iget v10, p0, LBe/c;->k:I

    move-object v11, p1

    check-cast v11, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, LBe/f;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
