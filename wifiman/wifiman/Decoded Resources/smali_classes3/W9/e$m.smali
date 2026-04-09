.class final LW9/e$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW9/e;->u0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LW9/e;


# direct methods
.method constructor <init>(LW9/e;)V
    .locals 0

    iput-object p1, p0, LW9/e$m;->a:LW9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)V
    .locals 4

    const-string/jumbo v0, "remainingSeconds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LW9/e$m;->a:LW9/e;

    invoke-virtual {v0}, LW9/e;->m0()LLi/z;

    move-result-object v0

    iget-object v1, p0, LW9/e$m;->a:LW9/e;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LW9/e;->n0(J)Ls9/d;

    move-result-object v1

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    iget-object p1, p0, LW9/e$m;->a:LW9/e;

    invoke-virtual {p1}, LW9/e;->l0()LLi/z;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LW9/e$m;->a:LW9/e;

    invoke-virtual {p1}, LW9/e;->l0()LLi/z;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LW9/e$m;->a(Ljava/lang/Long;)V

    return-void
.end method
