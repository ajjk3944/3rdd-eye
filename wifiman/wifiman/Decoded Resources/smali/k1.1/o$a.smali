.class Lk1/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I


# direct methods
.method constructor <init>(Lj1/e;Lc1/d;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lk1/o$a;->a:Ljava/lang/ref/WeakReference;

    iget-object v0, p1, Lj1/e;->N:Lj1/d;

    invoke-virtual {p2, v0}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lk1/o$a;->b:I

    iget-object v0, p1, Lj1/e;->O:Lj1/d;

    invoke-virtual {p2, v0}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lk1/o$a;->c:I

    iget-object v0, p1, Lj1/e;->P:Lj1/d;

    invoke-virtual {p2, v0}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lk1/o$a;->d:I

    iget-object v0, p1, Lj1/e;->Q:Lj1/d;

    invoke-virtual {p2, v0}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lk1/o$a;->e:I

    iget-object p1, p1, Lj1/e;->R:Lj1/d;

    invoke-virtual {p2, p1}, Lc1/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lk1/o$a;->f:I

    iput p3, p0, Lk1/o$a;->g:I

    return-void
.end method
