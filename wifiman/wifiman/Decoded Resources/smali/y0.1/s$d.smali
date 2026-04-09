.class final Ly0/s$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/s;->K2()Ly0/s;
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

    iput-object p1, p0, Ly0/s$d;->a:Lkotlin/jvm/internal/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/s;)Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p1}, Ly0/s;->L2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ly0/s;->D2(Ly0/s;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly0/s$d;->a:Lkotlin/jvm/internal/N;

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/s;

    invoke-virtual {p0, p1}, Ly0/s$d;->a(Ly0/s;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
