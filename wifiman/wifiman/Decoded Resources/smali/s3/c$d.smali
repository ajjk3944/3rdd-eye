.class public Ls3/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Ls3/c;


# direct methods
.method public constructor <init>(Ls3/c;)V
    .locals 0

    iput-object p1, p0, Ls3/c$d;->a:Ls3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lr3/b;)V
    .locals 2

    invoke-virtual {p1}, Lr3/b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ls3/c$d;->a:Ls3/c;

    invoke-virtual {p1}, Ls3/c;->A()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ls3/c;->k(Ls3/j;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, p0, Ls3/c$d;->a:Ls3/c;

    invoke-static {v0}, Ls3/c;->T(Ls3/c;)Ls3/c$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls3/c$d;->a:Ls3/c;

    invoke-static {v0}, Ls3/c;->T(Ls3/c;)Ls3/c$b;

    move-result-object v0

    invoke-interface {v0, p1}, Ls3/c$b;->b(Lr3/b;)V

    :cond_1
    return-void
.end method
