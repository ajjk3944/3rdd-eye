.class public final LU9/g;
.super Landroidx/lifecycle/a;
.source "SourceFile"


# instance fields
.field private final e:Lcom/ui/core/ui/sso/c;

.field private final f:LU9/h;

.field private final g:Lka/a;

.field private final h:Lha/a;

.field private final i:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;Lmh/a;Lq2/f;Landroid/os/Bundle;)V
    .locals 1

    const-string/jumbo v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "activityController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vibrator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clipboard"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onCreateAccountClicked"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "owner"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p6, p7}, Landroidx/lifecycle/a;-><init>(Lq2/f;Landroid/os/Bundle;)V

    iput-object p1, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iput-object p2, p0, LU9/g;->f:LU9/h;

    iput-object p3, p0, LU9/g;->g:Lka/a;

    iput-object p4, p0, LU9/g;->h:Lha/a;

    iput-object p5, p0, LU9/g;->i:Lmh/a;

    return-void
.end method


# virtual methods
.method protected f(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/E;)Landroidx/lifecycle/N;
    .locals 6

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "modelClass"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "handle"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, LX9/h;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LX9/h;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/h;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto/16 :goto_0

    :cond_0
    const-class p1, LX9/k;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, LX9/k;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/k;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto/16 :goto_0

    :cond_1
    const-class p1, LX9/f;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, LX9/f;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/f;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto/16 :goto_0

    :cond_2
    const-class p1, LX9/l;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, LX9/l;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/l;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto/16 :goto_0

    :cond_3
    const-class p1, LX9/i;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, LX9/i;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/i;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto/16 :goto_0

    :cond_4
    const-class p1, LY9/l;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, LY9/l;

    iget-object p2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v0, p0, LU9/g;->f:LU9/h;

    iget-object v1, p0, LU9/g;->g:Lka/a;

    invoke-direct {p1, p3, p2, v0, v1}, LY9/l;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;)V

    goto/16 :goto_0

    :cond_5
    const-class p1, Laa/d;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Laa/f;

    iget-object p2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object p3, p0, LU9/g;->f:LU9/h;

    invoke-direct {p1, p2, p3}, Laa/f;-><init>(Lcom/ui/core/ui/sso/c;LU9/h;)V

    goto/16 :goto_0

    :cond_6
    const-class p1, LX9/h$a;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, LX9/h$a;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/h$a;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto/16 :goto_0

    :cond_7
    const-class p1, LX9/k$a;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p1, LX9/k$a;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/k$a;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto/16 :goto_0

    :cond_8
    const-class p1, LX9/f$a;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, LX9/f$a;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/f$a;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto :goto_0

    :cond_9
    const-class p1, LX9/l$a;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_a

    new-instance p1, LX9/l$a;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/l$a;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto :goto_0

    :cond_a
    const-class p1, LX9/i$a;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, LX9/i$a;

    iget-object v2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v3, p0, LU9/g;->f:LU9/h;

    iget-object v4, p0, LU9/g;->g:Lka/a;

    iget-object v5, p0, LU9/g;->h:Lha/a;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, LX9/i$a;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    goto :goto_0

    :cond_b
    const-class p1, LY9/l$b;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_c

    new-instance p1, LY9/l$b;

    iget-object p2, p0, LU9/g;->e:Lcom/ui/core/ui/sso/c;

    iget-object v0, p0, LU9/g;->f:LU9/h;

    iget-object v1, p0, LU9/g;->g:Lka/a;

    invoke-direct {p1, p3, p2, v0, v1}, LY9/l$b;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;)V

    goto :goto_0

    :cond_c
    const-class p1, LV9/f;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_d

    new-instance p1, LV9/g;

    iget-object p2, p0, LU9/g;->f:LU9/h;

    iget-object p3, p0, LU9/g;->i:Lmh/a;

    invoke-direct {p1, p2, p3}, LV9/g;-><init>(LU9/h;Lmh/a;)V

    :goto_0
    return-object p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "Unknown ViewModel class: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
