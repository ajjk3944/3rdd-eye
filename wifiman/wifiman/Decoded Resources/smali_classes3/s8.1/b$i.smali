.class final Ls8/b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/b;->w0(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls8/b;


# direct methods
.method constructor <init>(Ls8/b;)V
    .locals 0

    iput-object p1, p0, Ls8/b$i;->a:Ls8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls8/b$a;)V
    .locals 1

    const-string/jumbo v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ls8/b$a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Ls8/b$i;->a:Ls8/b;

    invoke-static {p1}, Ls8/b;->r0(Ls8/b;)Luc/a;

    move-result-object p1

    sget-object v0, Luc/a$a;->TICK:Luc/a$a;

    invoke-interface {p1, v0}, Luc/a;->a(Luc/a$a;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Ls8/b$a$b;

    if-eqz p1, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ls8/b$a;

    invoke-virtual {p0, p1}, Ls8/b$i;->a(Ls8/b$a;)V

    return-void
.end method
