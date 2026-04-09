.class final LT/G0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/F0;
.implements LT/q0;


# instance fields
.field private final a:Ldh/i;

.field private final synthetic b:LT/q0;


# direct methods
.method public constructor <init>(LT/q0;Ldh/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LT/G0;->a:Ldh/i;

    iput-object p1, p0, LT/G0;->b:LT/q0;

    return-void
.end method


# virtual methods
.method public b()Lmh/l;
    .locals 1

    iget-object v0, p0, LT/G0;->b:LT/q0;

    invoke-interface {v0}, LT/q0;->b()Lmh/l;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT/G0;->b:LT/q0;

    invoke-interface {v0}, LT/q0;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getCoroutineContext()Ldh/i;
    .locals 1

    iget-object v0, p0, LT/G0;->a:Ldh/i;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT/G0;->b:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LT/G0;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
