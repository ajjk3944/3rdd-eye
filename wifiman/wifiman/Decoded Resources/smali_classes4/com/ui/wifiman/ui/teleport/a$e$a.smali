.class public final Lcom/ui/wifiman/ui/teleport/a$e$a;
.super Lcom/ui/wifiman/ui/teleport/B;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/a$e;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;

.field private final h:LLi/z;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/ui/wifiman/ui/teleport/B;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/teleport/a$e$a;->g:LLi/z;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/teleport/a$e$a;->h:LLi/z;

    return-void
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/a$e$a;->s0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/a$e$a;->t0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public p0()V
    .locals 0

    return-void
.end method

.method public q0()V
    .locals 0

    return-void
.end method

.method public r0(Z)V
    .locals 0

    return-void
.end method

.method public s0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/a$e$a;->g:LLi/z;

    return-object v0
.end method

.method public t0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/a$e$a;->h:LLi/z;

    return-object v0
.end method
