.class public abstract Lkotlin/jvm/internal/C;
.super Lkotlin/jvm/internal/I;
.source "SourceFile"

# interfaces
.implements Lth/m;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/I;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lth/c;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lth/l$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/C;->d()Lth/m$a;

    move-result-object v0

    return-object v0
.end method

.method public d()Lth/m$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/I;->a()Lth/l;

    move-result-object v0

    check-cast v0, Lth/m;

    invoke-interface {v0}, Lth/m;->d()Lth/m$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lth/m;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
