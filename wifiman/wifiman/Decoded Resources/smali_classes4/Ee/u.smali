.class public final synthetic LEe/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LEe/g;

.field public final synthetic c:Z

.field public final synthetic d:Lmh/l;

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Lmh/r;

.field public final synthetic h:Lmh/r;

.field public final synthetic i:Lmh/q;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LEe/g;ZLmh/l;ZZLmh/r;Lmh/r;Lmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEe/u;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LEe/u;->b:LEe/g;

    iput-boolean p3, p0, LEe/u;->c:Z

    iput-object p4, p0, LEe/u;->d:Lmh/l;

    iput-boolean p5, p0, LEe/u;->e:Z

    iput-boolean p6, p0, LEe/u;->f:Z

    iput-object p7, p0, LEe/u;->g:Lmh/r;

    iput-object p8, p0, LEe/u;->h:Lmh/r;

    iput-object p9, p0, LEe/u;->i:Lmh/q;

    iput p10, p0, LEe/u;->j:I

    iput p11, p0, LEe/u;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, LEe/u;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LEe/u;->b:LEe/g;

    iget-boolean v2, p0, LEe/u;->c:Z

    iget-object v3, p0, LEe/u;->d:Lmh/l;

    iget-boolean v4, p0, LEe/u;->e:Z

    iget-boolean v5, p0, LEe/u;->f:Z

    iget-object v6, p0, LEe/u;->g:Lmh/r;

    iget-object v7, p0, LEe/u;->h:Lmh/r;

    iget-object v8, p0, LEe/u;->i:Lmh/q;

    iget v9, p0, LEe/u;->j:I

    iget v10, p0, LEe/u;->k:I

    move-object v11, p1

    check-cast v11, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, LEe/z;->i(Landroidx/compose/ui/e;LEe/g;ZLmh/l;ZZLmh/r;Lmh/r;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
