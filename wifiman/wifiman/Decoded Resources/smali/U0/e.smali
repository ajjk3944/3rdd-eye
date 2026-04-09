.class public abstract LU0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LL0/W;)Landroid/text/style/TtsSpan;
    .locals 1

    instance-of v0, p0, LL0/Y;

    if-eqz v0, :cond_0

    check-cast p0, LL0/Y;

    invoke-static {p0}, LU0/e;->b(LL0/Y;)Landroid/text/style/TtsSpan;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(LL0/Y;)Landroid/text/style/TtsSpan;
    .locals 1

    new-instance v0, Landroid/text/style/TtsSpan$VerbatimBuilder;

    invoke-virtual {p0}, LL0/Y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    move-result-object p0

    return-object p0
.end method
