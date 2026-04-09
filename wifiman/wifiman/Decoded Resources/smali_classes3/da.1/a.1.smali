.class public final synthetic Lda/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lda/u$a;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:LLi/g;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lda/u$a;Ljava/util/List;Lmh/a;LLi/g;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lda/a;->b:Lda/u$a;

    iput-object p3, p0, Lda/a;->c:Ljava/util/List;

    iput-object p4, p0, Lda/a;->d:Lmh/a;

    iput-object p5, p0, Lda/a;->e:LLi/g;

    iput p6, p0, Lda/a;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lda/a;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lda/a;->b:Lda/u$a;

    iget-object v2, p0, Lda/a;->c:Ljava/util/List;

    iget-object v3, p0, Lda/a;->d:Lmh/a;

    iget-object v4, p0, Lda/a;->e:LLi/g;

    iget v5, p0, Lda/a;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lda/b;->a(Landroidx/compose/ui/e;Lda/u$a;Ljava/util/List;Lmh/a;LLi/g;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
