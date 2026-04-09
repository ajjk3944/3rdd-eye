.class final LF/m$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;

.field final synthetic b:LR0/T;

.field final synthetic c:LM/G;

.field final synthetic d:LR0/s;


# direct methods
.method constructor <init>(LF/E;LR0/T;LM/G;LR0/s;)V
    .locals 0

    iput-object p1, p0, LF/m$b$b;->a:LF/E;

    iput-object p2, p0, LF/m$b$b;->b:LR0/T;

    iput-object p3, p0, LF/m$b$b;->c:LM/G;

    iput-object p4, p0, LF/m$b$b;->d:LR0/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, LF/m$b$b;->b(ZLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(ZLdh/e;)Ljava/lang/Object;
    .locals 3

    if-eqz p1, :cond_0

    iget-object p1, p0, LF/m$b$b;->a:LF/E;

    invoke-virtual {p1}, LF/E;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LF/m$b$b;->b:LR0/T;

    iget-object p2, p0, LF/m$b$b;->a:LF/E;

    iget-object v0, p0, LF/m$b$b;->c:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v0

    iget-object v1, p0, LF/m$b$b;->d:LR0/s;

    iget-object v2, p0, LF/m$b$b;->c:LM/G;

    invoke-virtual {v2}, LM/G;->J()LR0/H;

    move-result-object v2

    invoke-static {p1, p2, v0, v1, v2}, LF/m;->k(LR0/T;LF/E;LR0/Q;LR0/s;LR0/H;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LF/m$b$b;->a:LF/E;

    invoke-static {p1}, LF/m;->i(LF/E;)V

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
