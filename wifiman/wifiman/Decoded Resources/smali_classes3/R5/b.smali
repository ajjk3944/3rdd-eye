.class public abstract LR5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lr6/c;Lm0/l0;)LR5/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "brush"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LR5/a;

    invoke-direct {p0, p1}, LR5/a;-><init>(Lm0/l0;)V

    return-object p0
.end method
