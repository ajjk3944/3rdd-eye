.class public final LF/d0$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d0$a$a;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Ly/m;


# direct methods
.method public constructor <init>(LT/q0;Ly/m;)V
    .locals 0

    iput-object p1, p0, LF/d0$a$a$a;->a:LT/q0;

    iput-object p2, p0, LF/d0$a$a$a;->b:Ly/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LF/d0$a$a$a;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly/o$b;

    if-eqz v0, :cond_1

    new-instance v1, Ly/o$a;

    invoke-direct {v1, v0}, Ly/o$a;-><init>(Ly/o$b;)V

    iget-object v0, p0, LF/d0$a$a$a;->b:Ly/m;

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Ly/m;->c(Ly/j;)Z

    :cond_0
    iget-object v0, p0, LF/d0$a$a$a;->a:LT/q0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LT/q0;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
