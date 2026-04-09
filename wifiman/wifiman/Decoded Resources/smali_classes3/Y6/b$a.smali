.class LY6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY6/h$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/b;
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
    .locals 1

    invoke-static {p1}, LY6/v;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    return-object v0

    :cond_1
    invoke-static {p1}, LY6/v;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p3, p1}, LY6/r;->d(Ljava/lang/reflect/Type;)LY6/h;

    move-result-object p1

    new-instance p3, LY6/b;

    invoke-direct {p3, p2, p1}, LY6/b;-><init>(Ljava/lang/Class;LY6/h;)V

    invoke-virtual {p3}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1
.end method
