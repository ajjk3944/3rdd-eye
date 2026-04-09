.class public abstract Lp2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo/t;ZLmh/l;)V
    .locals 9

    const-string v0, "map"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchBlock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo/t;

    const/16 v1, 0x3e7

    invoke-direct {v0, v1}, Lo/t;-><init>(I)V

    invoke-virtual {p0}, Lo/t;->o()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :cond_0
    :goto_0
    if-ge v4, v2, :cond_3

    if-eqz p1, :cond_1

    invoke-virtual {p0, v4}, Lo/t;->i(I)J

    move-result-wide v6

    invoke-virtual {p0, v4}, Lo/t;->p(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v6, v7, v8}, Lo/t;->k(JLjava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v4}, Lo/t;->i(I)J

    move-result-wide v6

    const/4 v8, 0x0

    invoke-virtual {v0, v6, v7, v8}, Lo/t;->k(JLjava/lang/Object;)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v1, :cond_0

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p1, :cond_2

    invoke-virtual {p0, v0}, Lo/t;->l(Lo/t;)V

    :cond_2
    invoke-virtual {v0}, Lo/t;->b()V

    move v5, v3

    goto :goto_0

    :cond_3
    if-lez v5, :cond_4

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p1, :cond_4

    invoke-virtual {p0, v0}, Lo/t;->l(Lo/t;)V

    :cond_4
    return-void
.end method
