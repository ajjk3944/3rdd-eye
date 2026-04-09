.class public final synthetic LEe/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LEe/g;

.field public final synthetic c:LA/B;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lmh/r;

.field public final synthetic g:Lmh/l;

.field public final synthetic h:Lmh/r;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LEe/g;LA/B;ZZLmh/r;Lmh/l;Lmh/r;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEe/r;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LEe/r;->b:LEe/g;

    iput-object p3, p0, LEe/r;->c:LA/B;

    iput-boolean p4, p0, LEe/r;->d:Z

    iput-boolean p5, p0, LEe/r;->e:Z

    iput-object p6, p0, LEe/r;->f:Lmh/r;

    iput-object p7, p0, LEe/r;->g:Lmh/l;

    iput-object p8, p0, LEe/r;->h:Lmh/r;

    iput p9, p0, LEe/r;->i:I

    iput p10, p0, LEe/r;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, LEe/r;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LEe/r;->b:LEe/g;

    iget-object v2, p0, LEe/r;->c:LA/B;

    iget-boolean v3, p0, LEe/r;->d:Z

    iget-boolean v4, p0, LEe/r;->e:Z

    iget-object v5, p0, LEe/r;->f:Lmh/r;

    iget-object v6, p0, LEe/r;->g:Lmh/l;

    iget-object v7, p0, LEe/r;->h:Lmh/r;

    iget v8, p0, LEe/r;->i:I

    iget v9, p0, LEe/r;->j:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, LEe/z;->n(Landroidx/compose/ui/e;LEe/g;LA/B;ZZLmh/r;Lmh/l;Lmh/r;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
