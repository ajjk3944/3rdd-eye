.class public abstract LL0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LL0/A;LL0/z;)LL0/B;
    .locals 1

    new-instance v0, LL0/B;

    invoke-direct {v0, p0, p1}, LL0/B;-><init>(LL0/A;LL0/z;)V

    return-object v0
.end method

.method public static final b(LL0/z;LL0/z;F)LL0/z;
    .locals 3

    invoke-virtual {p0}, LL0/z;->c()Z

    move-result v0

    invoke-virtual {p1}, LL0/z;->c()Z

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LL0/z;

    invoke-virtual {p0}, LL0/z;->b()I

    move-result v1

    invoke-static {v1}, LL0/h;->d(I)LL0/h;

    move-result-object v1

    invoke-virtual {p1}, LL0/z;->b()I

    move-result v2

    invoke-static {v2}, LL0/h;->d(I)LL0/h;

    move-result-object v2

    invoke-static {v1, v2, p2}, LL0/E;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LL0/h;

    invoke-virtual {v1}, LL0/h;->j()I

    move-result v1

    invoke-virtual {p0}, LL0/z;->c()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p1}, LL0/z;->c()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p0, p1, p2}, LL0/E;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    const/4 p1, 0x0

    invoke-direct {v0, v1, p0, p1}, LL0/z;-><init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final c(LL0/A;LL0/A;F)LL0/A;
    .locals 0

    return-object p0
.end method
