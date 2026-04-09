.class public final Lz/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/f0;


# instance fields
.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:LT/q0;

.field private final e:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz/b;->b:I

    iput-object p2, p0, Lz/b;->c:Ljava/lang/String;

    sget-object p1, Lw1/f;->e:Lw1/f;

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lz/b;->d:LT/q0;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lz/b;->e:LT/q0;

    return-void
.end method

.method private final g(Z)V
    .locals 1

    iget-object v0, p0, Lz/b;->e:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(LY0/d;LY0/t;)I
    .locals 0

    invoke-virtual {p0}, Lz/b;->e()Lw1/f;

    move-result-object p1

    iget p1, p1, Lw1/f;->c:I

    return p1
.end method

.method public b(LY0/d;)I
    .locals 0

    invoke-virtual {p0}, Lz/b;->e()Lw1/f;

    move-result-object p1

    iget p1, p1, Lw1/f;->d:I

    return p1
.end method

.method public c(LY0/d;)I
    .locals 0

    invoke-virtual {p0}, Lz/b;->e()Lw1/f;

    move-result-object p1

    iget p1, p1, Lw1/f;->b:I

    return p1
.end method

.method public d(LY0/d;LY0/t;)I
    .locals 0

    invoke-virtual {p0}, Lz/b;->e()Lw1/f;

    move-result-object p1

    iget p1, p1, Lw1/f;->a:I

    return p1
.end method

.method public final e()Lw1/f;
    .locals 1

    iget-object v0, p0, Lz/b;->d:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, Lz/b;->b:I

    check-cast p1, Lz/b;

    iget p1, p1, Lz/b;->b:I

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final f(Lw1/f;)V
    .locals 1

    iget-object v0, p0, Lz/b;->d:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(LF1/w0;I)V
    .locals 1

    if-eqz p2, :cond_0

    iget v0, p0, Lz/b;->b:I

    and-int/2addr p2, v0

    if-eqz p2, :cond_1

    :cond_0
    iget p2, p0, Lz/b;->b:I

    invoke-virtual {p1, p2}, LF1/w0;->f(I)Lw1/f;

    move-result-object p2

    invoke-virtual {p0, p2}, Lz/b;->f(Lw1/f;)V

    iget p2, p0, Lz/b;->b:I

    invoke-virtual {p1, p2}, LF1/w0;->p(I)Z

    move-result p1

    invoke-direct {p0, p1}, Lz/b;->g(Z)V

    :cond_1
    return-void
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lz/b;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lz/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lz/b;->e()Lw1/f;

    move-result-object v1

    iget v1, v1, Lw1/f;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lz/b;->e()Lw1/f;

    move-result-object v2

    iget v2, v2, Lw1/f;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lz/b;->e()Lw1/f;

    move-result-object v2

    iget v2, v2, Lw1/f;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lz/b;->e()Lw1/f;

    move-result-object v1

    iget v1, v1, Lw1/f;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
