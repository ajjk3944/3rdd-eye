.class public final LC2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/e;


# instance fields
.field private final b:Lo/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LW2/b;

    invoke-direct {v0}, LW2/b;-><init>()V

    iput-object v0, p0, LC2/g;->b:Lo/a;

    return-void
.end method

.method private static f(LC2/f;Ljava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LC2/f;->g(Ljava/lang/Object;Ljava/security/MessageDigest;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LC2/g;->b:Lo/a;

    invoke-virtual {v1}, Lo/V;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LC2/g;->b:Lo/a;

    invoke-virtual {v1, v0}, Lo/V;->h(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC2/f;

    iget-object v2, p0, LC2/g;->b:Lo/a;

    invoke-virtual {v2, v0}, Lo/V;->l(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2, p1}, LC2/g;->f(LC2/f;Ljava/lang/Object;Ljava/security/MessageDigest;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(LC2/f;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC2/g;->b:Lo/a;

    invoke-virtual {v0, p1}, Lo/a;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LC2/g;->b:Lo/a;

    invoke-virtual {v0, p1}, Lo/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LC2/f;->c()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public d(LC2/g;)V
    .locals 1

    iget-object v0, p0, LC2/g;->b:Lo/a;

    iget-object p1, p1, LC2/g;->b:Lo/a;

    invoke-virtual {v0, p1}, Lo/V;->i(Lo/V;)V

    return-void
.end method

.method public e(LC2/f;Ljava/lang/Object;)LC2/g;
    .locals 1

    iget-object v0, p0, LC2/g;->b:Lo/a;

    invoke-virtual {v0, p1, p2}, Lo/V;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LC2/g;

    if-eqz v0, :cond_0

    check-cast p1, LC2/g;

    iget-object v0, p0, LC2/g;->b:Lo/a;

    iget-object p1, p1, LC2/g;->b:Lo/a;

    invoke-virtual {v0, p1}, Lo/V;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LC2/g;->b:Lo/a;

    invoke-virtual {v0}, Lo/V;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Options{values="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LC2/g;->b:Lo/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
