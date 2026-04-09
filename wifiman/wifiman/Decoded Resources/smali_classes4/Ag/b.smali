.class public abstract LAg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Iterable;)Lgg/i;
    .locals 1

    const-string v0, "$this$merge"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LAg/b;->b(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p0

    invoke-static {p0}, Lgg/i;->O0(LDj/a;)Lgg/i;

    move-result-object p0

    const-string v0, "Flowable.merge(this.toFlowable())"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Ljava/lang/Iterable;)Lgg/i;
    .locals 1

    const-string v0, "$this$toFlowable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lgg/i;->A0(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p0

    const-string v0, "Flowable.fromIterable(this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(Lsh/g;)Lgg/i;
    .locals 6

    const-string v0, "$this$toFlowable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lsh/g;->k()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lsh/g;->j()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {p0}, Lsh/g;->i()I

    move-result v0

    int-to-long v4, v0

    sub-long/2addr v2, v4

    const v0, 0x7fffffff

    int-to-long v4, v0

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lsh/g;->i()I

    move-result v0

    invoke-virtual {p0}, Lsh/g;->j()I

    move-result v2

    invoke-virtual {p0}, Lsh/g;->i()I

    move-result p0

    sub-int/2addr v2, p0

    add-int/2addr v2, v1

    const/4 p0, 0x0

    invoke-static {p0, v2}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {v0, p0}, Lgg/i;->j1(II)Lgg/i;

    move-result-object p0

    const-string v0, "Flowable.range(first, Ma\u2026max(0, last - first + 1))"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lgg/i;->A0(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p0

    const-string v0, "Flowable.fromIterable(this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method
