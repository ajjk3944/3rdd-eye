.class public final Lcom/ui/wifiman/ui/settings/preferences/f$b$a;
.super Lcom/ui/wifiman/ui/settings/preferences/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/f$b;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;

.field private final h:LLi/z;

.field private final i:LLi/z;

.field private final j:LLi/z;

.field private final k:LLi/z;

.field private final l:LLi/z;

.field private final m:LLi/z;

.field private final n:LLi/N;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/ui/wifiman/ui/settings/preferences/a;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->g:LLi/z;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->h:LLi/z;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->i:LLi/z;

    sget-object v0, LT7/c;->METRIC:LT7/c;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->j:LLi/z;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->k:LLi/z;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->l:LLi/z;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->m:LLi/z;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->n:LLi/N;

    return-void
.end method


# virtual methods
.method public A0(Z)V
    .locals 0

    return-void
.end method

.method public B0()V
    .locals 0

    return-void
.end method

.method public C0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->k:LLi/z;

    return-object v0
.end method

.method public D0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->l:LLi/z;

    return-object v0
.end method

.method public E0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->m:LLi/z;

    return-object v0
.end method

.method public F0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->j:LLi/z;

    return-object v0
.end method

.method public G0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->g:LLi/z;

    return-object v0
.end method

.method public H0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->h:LLi/z;

    return-object v0
.end method

.method public I0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->i:LLi/z;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->C0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->D0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->E0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->n:LLi/N;

    return-object v0
.end method

.method public bridge synthetic r0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->F0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic s0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->G0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->H0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/f$b$a;->I0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public v0()V
    .locals 0

    return-void
.end method

.method public w0()V
    .locals 0

    return-void
.end method

.method public x0()V
    .locals 0

    return-void
.end method

.method public y0(Z)V
    .locals 0

    return-void
.end method

.method public z0(Z)V
    .locals 0

    return-void
.end method
