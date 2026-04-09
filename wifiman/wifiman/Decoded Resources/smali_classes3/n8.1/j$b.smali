.class final Ln8/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/j;


# direct methods
.method constructor <init>(Ln8/j;)V
    .locals 0

    iput-object p1, p0, Ln8/j$b;->a:Ln8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJe/b;)Ln8/e;
    .locals 2

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LJe/b$b;

    if-eqz v0, :cond_0

    new-instance v0, Ln8/f;

    iget-object v1, p0, Ln8/j$b;->a:Ln8/j;

    invoke-virtual {v1}, Ln8/j;->d()Lorg/kodein/di/DI;

    move-result-object v1

    check-cast p1, LJe/b$b;

    invoke-virtual {p1}, LJe/b$b;->a()La8/b;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ln8/f;-><init>(Lorg/kodein/di/DI;La8/b;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LJe/b$c;

    if-eqz v0, :cond_1

    new-instance v0, Ln8/f;

    iget-object v1, p0, Ln8/j$b;->a:Ln8/j;

    invoke-virtual {v1}, Ln8/j;->d()Lorg/kodein/di/DI;

    move-result-object v1

    check-cast p1, LJe/b$c;

    invoke-virtual {p1}, LJe/b$c;->a()Linet/ipaddr/g;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ln8/f;-><init>(Lorg/kodein/di/DI;Linet/ipaddr/g;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, LJe/b$d;

    if-eqz v0, :cond_2

    new-instance v0, Ln8/h;

    iget-object p1, p0, Ln8/j$b;->a:Ln8/j;

    invoke-virtual {p1}, Ln8/j;->d()Lorg/kodein/di/DI;

    move-result-object p1

    invoke-direct {v0, p1}, Ln8/h;-><init>(Lorg/kodein/di/DI;)V

    goto :goto_0

    :cond_2
    instance-of p1, p1, LJe/b$a;

    if-eqz p1, :cond_3

    new-instance v0, Ln8/g;

    iget-object p1, p0, Ln8/j$b;->a:Ln8/j;

    invoke-virtual {p1}, Ln8/j;->d()Lorg/kodein/di/DI;

    move-result-object p1

    invoke-direct {v0, p1}, Ln8/g;-><init>(Lorg/kodein/di/DI;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJe/b;

    invoke-virtual {p0, p1}, Ln8/j$b;->a(LJe/b;)Ln8/e;

    move-result-object p1

    return-object p1
.end method
