.class public abstract Lpi/z;
.super Lpi/E0;
.source "SourceFile"


# instance fields
.field private final c:Lpi/E0;


# direct methods
.method public constructor <init>(Lpi/E0;)V
    .locals 1

    const-string v0, "substitution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/E0;-><init>()V

    iput-object p1, p0, Lpi/z;->c:Lpi/E0;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lpi/z;->c:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->a()Z

    move-result v0

    return v0
.end method

.method public d(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/z;->c:Lpi/E0;

    invoke-virtual {v0, p1}, Lpi/E0;->d(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    return-object p1
.end method

.method public e(Lpi/S;)Lpi/B0;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/z;->c:Lpi/E0;

    invoke-virtual {v0, p1}, Lpi/E0;->e(Lpi/S;)Lpi/B0;

    move-result-object p1

    return-object p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lpi/z;->c:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->f()Z

    move-result v0

    return v0
.end method

.method public g(Lpi/S;Lpi/N0;)Lpi/S;
    .locals 1

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/z;->c:Lpi/E0;

    invoke-virtual {v0, p1, p2}, Lpi/E0;->g(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
