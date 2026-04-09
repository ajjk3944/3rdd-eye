.class public final synthetic Lda/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lda/u;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Z

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Lda/u;ZLjava/lang/String;Lmh/a;ZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/o;->a:Lda/u;

    iput-boolean p2, p0, Lda/o;->b:Z

    iput-object p3, p0, Lda/o;->c:Ljava/lang/String;

    iput-object p4, p0, Lda/o;->d:Lmh/a;

    iput-boolean p5, p0, Lda/o;->e:Z

    iput p6, p0, Lda/o;->f:I

    iput p7, p0, Lda/o;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lda/o;->a:Lda/u;

    iget-boolean v1, p0, Lda/o;->b:Z

    iget-object v2, p0, Lda/o;->c:Ljava/lang/String;

    iget-object v3, p0, Lda/o;->d:Lmh/a;

    iget-boolean v4, p0, Lda/o;->e:Z

    iget v5, p0, Lda/o;->f:I

    iget v6, p0, Lda/o;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lda/s;->e(Lda/u;ZLjava/lang/String;Lmh/a;ZIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
