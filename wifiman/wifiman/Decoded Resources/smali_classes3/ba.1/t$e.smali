.class final Lba/t$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/t;->T0(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lba/t;


# direct methods
.method constructor <init>(Lba/t;)V
    .locals 0

    iput-object p1, p0, Lba/t$e;->a:Lba/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lba/t$e;->a:Lba/t;

    invoke-static {v0}, Lba/t;->F0(Lba/t;)LFg/c;

    move-result-object v0

    sget-object v1, Lba/t$a$a;->a:Lba/t$a$a;

    invoke-virtual {v0, v1}, LFg/c;->h(Ljava/lang/Object;)V

    instance-of p1, p1, Lcom/ui/unifi/core/sso/exceptions/UserNotFoundException;

    if-eqz p1, :cond_0

    new-instance p1, Ls9/d$b;

    sget v0, LP9/b;->S0:I

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Ls9/d$b;

    sget v0, LP9/b;->R0:I

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    iget-object v0, p0, Lba/t$e;->a:Lba/t;

    invoke-virtual {v0}, Lba/t;->j0()LLi/z;

    move-result-object v0

    invoke-interface {v0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lba/t$e;->a(Ljava/lang/Throwable;)V

    return-void
.end method
