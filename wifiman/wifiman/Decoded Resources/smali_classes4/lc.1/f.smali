.class public abstract Llc/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/a;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LO7/a;->getCode()I

    move-result p0

    invoke-static {p0}, Llc/b;->a(I)I

    move-result p0

    return p0
.end method
