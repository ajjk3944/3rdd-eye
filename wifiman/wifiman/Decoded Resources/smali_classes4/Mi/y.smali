.class final LMi/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/e;
.implements Lkotlin/coroutines/jvm/internal/e;


# instance fields
.field private final a:Ldh/e;

.field private final b:Ldh/i;


# direct methods
.method public constructor <init>(Ldh/e;Ldh/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMi/y;->a:Ldh/e;

    iput-object p2, p0, LMi/y;->b:Ldh/i;

    return-void
.end method


# virtual methods
.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, LMi/y;->a:Ldh/e;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Ldh/i;
    .locals 1

    iget-object v0, p0, LMi/y;->b:Ldh/i;

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LMi/y;->a:Ldh/e;

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
