.class public final LQ6/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:J

.field private d:I

.field private e:I

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LQ6/g$b;->a:I

    const/4 v0, 0x1

    iput v0, p0, LQ6/g$b;->b:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, LQ6/g$b;->c:J

    iput v0, p0, LQ6/g$b;->d:I

    const/4 v1, 0x3

    iput v1, p0, LQ6/g$b;->e:I

    iput-boolean v0, p0, LQ6/g$b;->f:Z

    iput-boolean v0, p0, LQ6/g$b;->g:Z

    return-void
.end method


# virtual methods
.method public a()LQ6/g;
    .locals 10

    new-instance v9, LQ6/g;

    iget v1, p0, LQ6/g$b;->a:I

    iget v2, p0, LQ6/g$b;->b:I

    iget-wide v3, p0, LQ6/g$b;->c:J

    iget v5, p0, LQ6/g$b;->d:I

    iget v6, p0, LQ6/g$b;->e:I

    iget-boolean v7, p0, LQ6/g$b;->f:Z

    iget-boolean v8, p0, LQ6/g$b;->g:Z

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LQ6/g;-><init>(IIJIIZZ)V

    return-object v9
.end method

.method public b(I)LQ6/g$b;
    .locals 3

    const/4 v0, -0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    iput p1, p0, LQ6/g$b;->a:I

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "invalid scan mode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
