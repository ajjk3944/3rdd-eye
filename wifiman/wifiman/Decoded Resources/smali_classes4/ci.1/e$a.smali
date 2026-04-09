.class public final Lci/e$a;
.super Lpi/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lci/e;->g(Lpi/E0;Z)Lpi/E0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Z


# direct methods
.method constructor <init>(Lpi/E0;Z)V
    .locals 0

    iput-boolean p2, p0, Lci/e$a;->d:Z

    invoke-direct {p0, p1}, Lpi/z;-><init>(Lpi/E0;)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lci/e$a;->d:Z

    return v0
.end method

.method public e(Lpi/S;)Lpi/B0;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lpi/z;->e(Lpi/S;)Lpi/B0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object p1

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object p1

    instance-of v2, p1, LBh/l0;

    if-eqz v2, :cond_0

    move-object v1, p1

    check-cast v1, LBh/l0;

    :cond_0
    invoke-static {v0, v1}, Lci/e;->a(Lpi/B0;LBh/l0;)Lpi/B0;

    move-result-object v1

    :cond_1
    return-object v1
.end method
