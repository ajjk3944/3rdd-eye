.class public abstract Lkotlin/jvm/internal/G;
.super Lkotlin/jvm/internal/I;
.source "SourceFile"

# interfaces
.implements Lth/o;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    sget-object v1, Lkotlin/jvm/internal/f;->NO_RECEIVER:Ljava/lang/Object;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/I;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lth/c;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/O;->i(Lkotlin/jvm/internal/G;)Lth/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lth/l$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/G;->d()Lth/o$a;

    move-result-object v0

    return-object v0
.end method

.method public d()Lth/o$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/I;->a()Lth/l;

    move-result-object v0

    check-cast v0, Lth/o;

    invoke-interface {v0}, Lth/o;->d()Lth/o$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1, p2}, Lth/o;->P(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
