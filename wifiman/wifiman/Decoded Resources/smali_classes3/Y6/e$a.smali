.class LY6/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY6/h$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;Ljava/util/Set;LY6/r;)LY6/h;
    .locals 2

    invoke-static {p1}, LY6/v;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    const/4 v1, 0x0

    if-nez p2, :cond_0

    return-object v1

    :cond_0
    const-class p2, Ljava/util/List;

    if-eq v0, p2, :cond_3

    const-class p2, Ljava/util/Collection;

    if-ne v0, p2, :cond_1

    goto :goto_0

    :cond_1
    const-class p2, Ljava/util/Set;

    if-ne v0, p2, :cond_2

    invoke-static {p1, p3}, LY6/e;->o(Ljava/lang/reflect/Type;LY6/r;)LY6/h;

    move-result-object p1

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1

    :cond_3
    :goto_0
    invoke-static {p1, p3}, LY6/e;->m(Ljava/lang/reflect/Type;LY6/r;)LY6/h;

    move-result-object p1

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1
.end method
