.class public final LMi/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i;


# instance fields
.field private final synthetic a:Ldh/i;

.field public final b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Ldh/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LMi/k;->a:Ldh/i;

    iput-object p1, p0, LMi/k;->b:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LMi/k;->a:Ldh/i;

    invoke-interface {v0, p1, p2}, Ldh/i;->fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 1

    iget-object v0, p0, LMi/k;->a:Ldh/i;

    invoke-interface {v0, p1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 1

    iget-object v0, p0, LMi/k;->a:Ldh/i;

    invoke-interface {v0, p1}, Ldh/i;->minusKey(Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 1

    iget-object v0, p0, LMi/k;->a:Ldh/i;

    invoke-interface {v0, p1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method
