.class public abstract LI/N0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/N0$a;
    }
.end annotation


# instance fields
.field private a:LI/N0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    iget-object v0, p0, LI/N0;->a:LI/N0$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LI/N0$a;->getSoftwareKeyboardController()Landroidx/compose/ui/platform/n1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/platform/n1;->b()V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, LI/N0;->a:LI/N0$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LI/N0$a;->getSoftwareKeyboardController()Landroidx/compose/ui/platform/n1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/platform/n1;->c()V

    :cond_0
    return-void
.end method

.method protected final i()LI/N0$a;
    .locals 1

    iget-object v0, p0, LI/N0;->a:LI/N0$a;

    return-object v0
.end method

.method public final j(LI/N0$a;)V
    .locals 1

    iget-object v0, p0, LI/N0;->a:LI/N0$a;

    if-nez v0, :cond_0

    iput-object p1, p0, LI/N0;->a:LI/N0$a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Expected textInputModifierNode to be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract k()V
.end method

.method public final l(LI/N0$a;)V
    .locals 2

    iget-object v0, p0, LI/N0;->a:LI/N0$a;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LI/N0;->a:LI/N0$a;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected textInputModifierNode to be "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but was "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LI/N0;->a:LI/N0$a;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
