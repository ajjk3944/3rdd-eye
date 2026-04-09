.class final Lq/d$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/F0;

.field final synthetic b:Lr/o0;

.field final synthetic c:LT/z1;


# direct methods
.method constructor <init>(LT/F0;Lr/o0;LT/z1;)V
    .locals 0

    iput-object p1, p0, Lq/d$c$b;->a:LT/F0;

    iput-object p2, p0, Lq/d$c$b;->b:Lr/o0;

    iput-object p3, p0, Lq/d$c$b;->c:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lq/d$c$b;->b(ZLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(ZLdh/e;)Ljava/lang/Object;
    .locals 2

    iget-object p2, p0, Lq/d$c$b;->a:LT/F0;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq/d$c$b;->c:LT/z1;

    invoke-static {p1}, Lq/d;->h(LT/z1;)Lmh/p;

    move-result-object p1

    iget-object v0, p0, Lq/d$c$b;->b:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lq/d$c$b;->b:Lr/o0;

    invoke-virtual {v1}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
