.class public abstract Lui/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lui/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract b()Lui/c;
.end method

.method protected abstract e()Lui/z;
.end method

.method protected abstract f(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method protected final g(Lth/d;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "tClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lth/d;->l()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lui/a;->f(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lui/a;->b()Lui/c;

    move-result-object v0

    invoke-virtual {v0}, Lui/c;->b()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lui/a;->b()Lui/c;

    move-result-object v0

    invoke-virtual {v0}, Lui/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
