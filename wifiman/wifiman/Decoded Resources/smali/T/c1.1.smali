.class final LT/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/b;
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# instance fields
.field private final a:LT/b1;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(LT/b1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/c1;->a:LT/b1;

    iput p2, p0, LT/c1;->b:I

    iput p3, p0, LT/c1;->c:I

    return-void
.end method

.method private final b()V
    .locals 2

    iget-object v0, p0, LT/c1;->a:LT/b1;

    invoke-virtual {v0}, LT/b1;->z()I

    move-result v0

    iget v1, p0, LT/c1;->c:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 6

    invoke-direct {p0}, LT/c1;->b()V

    iget-object v0, p0, LT/c1;->a:LT/b1;

    iget v1, p0, LT/c1;->b:I

    invoke-virtual {v0, v1}, LT/b1;->J(I)LT/U;

    new-instance v0, LT/S;

    iget-object v1, p0, LT/c1;->a:LT/b1;

    iget v2, p0, LT/c1;->b:I

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v1}, LT/b1;->u()[I

    move-result-object v4

    iget v5, p0, LT/c1;->b:I

    invoke-static {v4, v5}, LT/d1;->h([II)I

    move-result v4

    add-int/2addr v2, v4

    invoke-direct {v0, v1, v3, v2}, LT/S;-><init>(LT/b1;II)V

    return-object v0
.end method
