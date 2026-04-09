.class public final LYg/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYg/m;
.implements Ljava/io/Serializable;


# instance fields
.field private a:Lmh/a;

.field private b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmh/a;)V
    .locals 1

    const-string v0, "initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYg/K;->a:Lmh/a;

    sget-object p1, LYg/G;->a:LYg/G;

    iput-object p1, p0, LYg/K;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LYg/K;->b:Ljava/lang/Object;

    sget-object v1, LYg/G;->a:LYg/G;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LYg/K;->a:Lmh/a;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LYg/K;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, LYg/K;->a:Lmh/a;

    :cond_0
    iget-object v0, p0, LYg/K;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public m()Z
    .locals 2

    iget-object v0, p0, LYg/K;->b:Ljava/lang/Object;

    sget-object v1, LYg/G;->a:LYg/G;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYg/K;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYg/K;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
