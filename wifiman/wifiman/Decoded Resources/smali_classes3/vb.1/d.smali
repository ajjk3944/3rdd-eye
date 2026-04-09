.class public abstract Lvb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lgg/z;)Lgg/z;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvb/c;

    invoke-direct {v0}, Lvb/c;-><init>()V

    invoke-virtual {p0, v0}, Lgg/z;->h(Lgg/E;)Lgg/z;

    move-result-object p0

    const-string/jumbo v0, "compose(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
