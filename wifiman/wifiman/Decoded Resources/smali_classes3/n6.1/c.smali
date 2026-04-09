.class public abstract Ln6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ln6/b;Lw6/b;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "margins"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ln6/b;->a()Lw6/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lw6/c;->j(Lw6/b;)Lw6/c;

    return-void
.end method
