.class final Ly0/s$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/s;->J2()Ly0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, Ly0/s$c;->a:Lkotlin/jvm/internal/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/s;)LE0/z0;
    .locals 2

    sget-object v0, LE0/z0;->ContinueTraversal:LE0/z0;

    invoke-static {p1}, Ly0/s;->D2(Ly0/s;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ly0/s$c;->a:Lkotlin/jvm/internal/N;

    iput-object p1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-virtual {p1}, Ly0/s;->L2()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v0, LE0/z0;->SkipSubtreeAndContinueTraversal:LE0/z0;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/s;

    invoke-virtual {p0, p1}, Ly0/s$c;->a(Ly0/s;)LE0/z0;

    move-result-object p1

    return-object p1
.end method
