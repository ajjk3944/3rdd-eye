.class public abstract Lja/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LH/l;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lja/b;->c(LH/l;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LH/l;)LLi/g;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lja/a;

    invoke-direct {v0, p0}, Lja/a;-><init>(LH/l;)V

    invoke-static {v0}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LH/l;)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method
