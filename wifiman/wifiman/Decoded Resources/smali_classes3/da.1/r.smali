.class public final synthetic Lda/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LL0/d;

.field public final synthetic d:Z

.field public final synthetic e:Lmh/l;

.field public final synthetic f:Lmh/l;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;LL0/d;ZLmh/l;Lmh/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/r;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lda/r;->b:Ljava/lang/String;

    iput-object p3, p0, Lda/r;->c:LL0/d;

    iput-boolean p4, p0, Lda/r;->d:Z

    iput-object p5, p0, Lda/r;->e:Lmh/l;

    iput-object p6, p0, Lda/r;->f:Lmh/l;

    iput p7, p0, Lda/r;->g:I

    iput p8, p0, Lda/r;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lda/r;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lda/r;->b:Ljava/lang/String;

    iget-object v2, p0, Lda/r;->c:LL0/d;

    iget-boolean v3, p0, Lda/r;->d:Z

    iget-object v4, p0, Lda/r;->e:Lmh/l;

    iget-object v5, p0, Lda/r;->f:Lmh/l;

    iget v6, p0, Lda/r;->g:I

    iget v7, p0, Lda/r;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lda/s;->c(Landroidx/compose/ui/e;Ljava/lang/String;LL0/d;ZLmh/l;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
