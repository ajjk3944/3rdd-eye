.class public final Lzi/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;
.implements Lzi/e;


# instance fields
.field private final a:Lzi/j;

.field private final b:I


# direct methods
.method public constructor <init>(Lzi/j;I)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzi/z;->a:Lzi/j;

    iput p2, p0, Lzi/z;->b:I

    if-ltz p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "count must be non-negative, but was "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic c(Lzi/z;)I
    .locals 0

    iget p0, p0, Lzi/z;->b:I

    return p0
.end method

.method public static final synthetic d(Lzi/z;)Lzi/j;
    .locals 0

    iget-object p0, p0, Lzi/z;->a:Lzi/j;

    return-object p0
.end method


# virtual methods
.method public a(I)Lzi/j;
    .locals 2

    iget v0, p0, Lzi/z;->b:I

    if-lt p1, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lzi/z;

    iget-object v1, p0, Lzi/z;->a:Lzi/j;

    invoke-direct {v0, v1, p1}, Lzi/z;-><init>(Lzi/j;I)V

    :goto_0
    return-object v0
.end method

.method public b(I)Lzi/j;
    .locals 3

    iget v0, p0, Lzi/z;->b:I

    if-lt p1, v0, :cond_0

    invoke-static {}, Lzi/m;->i()Lzi/j;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v1, Lzi/y;

    iget-object v2, p0, Lzi/z;->a:Lzi/j;

    invoke-direct {v1, v2, p1, v0}, Lzi/y;-><init>(Lzi/j;II)V

    move-object p1, v1

    :goto_0
    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lzi/z$a;

    invoke-direct {v0, p0}, Lzi/z$a;-><init>(Lzi/z;)V

    return-object v0
.end method
