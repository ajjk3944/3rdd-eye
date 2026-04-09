.class public abstract Lkotlin/jvm/internal/w;
.super Lkotlin/jvm/internal/A;
.source "SourceFile"

# interfaces
.implements Lth/i;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/A;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lth/c;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/w;)Lth/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lth/l$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/w;->d()Lth/m$a;

    move-result-object v0

    return-object v0
.end method

.method public d()Lth/m$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/I;->a()Lth/l;

    move-result-object v0

    check-cast v0, Lth/i;

    invoke-interface {v0}, Lth/m;->d()Lth/m$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lth/h$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/w;->g()Lth/i$a;

    move-result-object v0

    return-object v0
.end method

.method public g()Lth/i$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/I;->a()Lth/l;

    move-result-object v0

    check-cast v0, Lth/i;

    invoke-interface {v0}, Lth/i;->g()Lth/i$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lth/m;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
