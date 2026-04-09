.class public abstract Lf2/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/l;)Lf2/y;
    .locals 1

    const-string v0, "optionsBuilder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf2/z;

    invoke-direct {v0}, Lf2/z;-><init>()V

    invoke-interface {p0, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lf2/z;->b()Lf2/y;

    move-result-object p0

    return-object p0
.end method
