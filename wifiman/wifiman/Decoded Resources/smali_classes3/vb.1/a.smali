.class public abstract Lvb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lgg/i;Lmh/l;)Lgg/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvb/a$a;

    invoke-direct {v0, p1}, Lvb/a$a;-><init>(Lmh/l;)V

    invoke-virtual {p0, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p0

    const-string/jumbo p1, "flatMap(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
