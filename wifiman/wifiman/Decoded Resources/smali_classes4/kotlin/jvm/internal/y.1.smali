.class public abstract Lkotlin/jvm/internal/y;
.super Lkotlin/jvm/internal/A;
.source "SourceFile"

# interfaces
.implements Lth/j;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/A;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lth/c;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lth/l$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/y;->d()Lth/n$a;

    move-result-object v0

    return-object v0
.end method

.method public d()Lth/n$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/I;->a()Lth/l;

    move-result-object v0

    check-cast v0, Lth/j;

    invoke-interface {v0}, Lth/n;->d()Lth/n$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lth/h$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/y;->g()Lth/j$a;

    move-result-object v0

    return-object v0
.end method

.method public g()Lth/j$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/I;->a()Lth/l;

    move-result-object v0

    check-cast v0, Lth/j;

    invoke-interface {v0}, Lth/j;->g()Lth/j$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lth/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
