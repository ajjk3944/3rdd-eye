.class public interface abstract Lcj/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LVi/b;Ljava/util/List;)LVi/b;
    .locals 0

    invoke-static {p0, p1}, Lcj/i;->f(LVi/b;Ljava/util/List;)LVi/b;

    move-result-object p0

    return-object p0
.end method

.method private static f(LVi/b;Ljava/util/List;)LVi/b;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public b(Lth/d;LVi/b;)V
    .locals 1

    const-string v0, "kClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcj/h;

    invoke-direct {v0, p2}, Lcj/h;-><init>(LVi/b;)V

    invoke-interface {p0, p1, v0}, Lcj/i;->c(Lth/d;Lmh/l;)V

    return-void
.end method

.method public abstract c(Lth/d;Lmh/l;)V
.end method

.method public abstract d(Lth/d;Lmh/l;)V
.end method

.method public abstract e(Lth/d;Lth/d;LVi/b;)V
.end method

.method public abstract g(Lth/d;Lmh/l;)V
.end method
