.class public abstract LE0/D;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LE0/P;LC0/a;)I
    .locals 0

    invoke-static {p0, p1}, LE0/D;->b(LE0/P;LC0/a;)I

    move-result p0

    return p0
.end method

.method private static final b(LE0/P;LC0/a;)I
    .locals 5

    invoke-virtual {p0}, LE0/P;->Z0()LE0/P;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Child of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " cannot be null when calculating alignment line"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, LE0/P;->h1()LC0/D;

    move-result-object v3

    invoke-interface {v3}, LC0/D;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    const/high16 v4, -0x80000000

    if-eqz v3, :cond_3

    invoke-virtual {p0}, LE0/P;->h1()LC0/D;

    move-result-object p0

    invoke-interface {p0}, LC0/D;->p()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :cond_2
    return v4

    :cond_3
    invoke-virtual {v0, p1}, LE0/P;->X(LC0/a;)I

    move-result v3

    if-ne v3, v4, :cond_4

    return v4

    :cond_4
    invoke-virtual {v0, v2}, LE0/P;->U1(Z)V

    invoke-virtual {p0, v2}, LE0/P;->S1(Z)V

    invoke-virtual {p0}, LE0/P;->R1()V

    invoke-virtual {v0, v1}, LE0/P;->U1(Z)V

    invoke-virtual {p0, v1}, LE0/P;->S1(Z)V

    instance-of p0, p1, LC0/m;

    if-eqz p0, :cond_5

    invoke-virtual {v0}, LE0/P;->r1()J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/n;->i(J)I

    move-result p0

    :goto_1
    add-int/2addr v3, p0

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, LE0/P;->r1()J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/n;->h(J)I

    move-result p0

    goto :goto_1

    :goto_2
    return v3
.end method
