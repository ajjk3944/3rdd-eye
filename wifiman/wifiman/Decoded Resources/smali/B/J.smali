.class public final LB/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/d;


# instance fields
.field private final a:LV/b;

.field private b:I

.field private c:LB/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LV/b;

    const/16 v1, 0x10

    new-array v1, v1, [LB/d$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, LB/J;->a:LV/b;

    return-void
.end method

.method private final d(I)V
    .locals 3

    if-ltz p1, :cond_0

    invoke-virtual {p0}, LB/J;->a()I

    move-result v0

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LB/J;->a()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final e(LB/d$a;I)Z
    .locals 2

    invoke-virtual {p1}, LB/d$a;->b()I

    move-result v0

    invoke-virtual {p1}, LB/d$a;->b()I

    move-result v1

    invoke-virtual {p1}, LB/d$a;->a()I

    move-result p1

    add-int/2addr v1, p1

    const/4 p1, 0x0

    if-ge p2, v1, :cond_0

    if-gt v0, p2, :cond_0

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method private final f(I)LB/d$a;
    .locals 2

    iget-object v0, p0, LB/J;->c:LB/d$a;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0, p1}, LB/J;->e(LB/d$a;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LB/J;->a:LV/b;

    invoke-static {v0, p1}, LB/e;->a(LV/b;I)I

    move-result p1

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    move-object v0, p1

    check-cast v0, LB/d$a;

    iput-object v0, p0, LB/J;->c:LB/d$a;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LB/J;->b:I

    return v0
.end method

.method public b(IILmh/l;)V
    .locals 2

    invoke-direct {p0, p1}, LB/J;->d(I)V

    invoke-direct {p0, p2}, LB/J;->d(I)V

    if-lt p2, p1, :cond_1

    iget-object v0, p0, LB/J;->a:LV/b;

    invoke-static {v0, p1}, LB/e;->a(LV/b;I)I

    move-result p1

    iget-object v0, p0, LB/J;->a:LV/b;

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    aget-object v0, v0, p1

    check-cast v0, LB/d$a;

    invoke-virtual {v0}, LB/d$a;->b()I

    move-result v0

    :goto_0
    if-gt v0, p2, :cond_0

    iget-object v1, p0, LB/J;->a:LV/b;

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v1

    aget-object v1, v1, p1

    check-cast v1, LB/d$a;

    invoke-interface {p3, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, LB/d$a;->a()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "toIndex ("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") should be not smaller than fromIndex ("

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 2

    if-ltz p1, :cond_1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, LB/d$a;

    invoke-virtual {p0}, LB/J;->a()I

    move-result v1

    invoke-direct {v0, v1, p1, p2}, LB/d$a;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p0}, LB/J;->a()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, LB/J;->b:I

    iget-object p1, p0, LB/J;->a:LV/b;

    invoke-virtual {p1, v0}, LV/b;->b(Ljava/lang/Object;)Z

    return-void

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "size should be >=0, but was "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public get(I)LB/d$a;
    .locals 0

    invoke-direct {p0, p1}, LB/J;->d(I)V

    invoke-direct {p0, p1}, LB/J;->f(I)LB/d$a;

    move-result-object p1

    return-object p1
.end method
