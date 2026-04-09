.class final LN/v$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/v$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/runtime/snapshots/k;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/k;)V
    .locals 0

    iput-object p1, p0, LN/v$a$a;->a:Landroidx/compose/runtime/snapshots/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly/j;

    invoke-virtual {p0, p1, p2}, LN/v$a$a;->b(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly/j;Ldh/e;)Ljava/lang/Object;
    .locals 0

    instance-of p2, p1, Ly/g;

    if-eqz p2, :cond_0

    iget-object p2, p0, LN/v$a$a;->a:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {p2, p1}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of p2, p1, Ly/h;

    if-eqz p2, :cond_1

    iget-object p2, p0, LN/v$a$a;->a:Landroidx/compose/runtime/snapshots/k;

    check-cast p1, Ly/h;

    invoke-virtual {p1}, Ly/h;->a()Ly/g;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/compose/runtime/snapshots/k;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of p2, p1, Ly/d;

    if-eqz p2, :cond_2

    iget-object p2, p0, LN/v$a$a;->a:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {p2, p1}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of p2, p1, Ly/e;

    if-eqz p2, :cond_3

    iget-object p2, p0, LN/v$a$a;->a:Landroidx/compose/runtime/snapshots/k;

    check-cast p1, Ly/e;

    invoke-virtual {p1}, Ly/e;->a()Ly/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/compose/runtime/snapshots/k;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of p2, p1, Ly/o$b;

    if-eqz p2, :cond_4

    iget-object p2, p0, LN/v$a$a;->a:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {p2, p1}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    instance-of p2, p1, Ly/o$c;

    if-eqz p2, :cond_5

    iget-object p2, p0, LN/v$a$a;->a:Landroidx/compose/runtime/snapshots/k;

    check-cast p1, Ly/o$c;

    invoke-virtual {p1}, Ly/o$c;->a()Ly/o$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/compose/runtime/snapshots/k;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    instance-of p2, p1, Ly/o$a;

    if-eqz p2, :cond_6

    iget-object p2, p0, LN/v$a$a;->a:Landroidx/compose/runtime/snapshots/k;

    check-cast p1, Ly/o$a;

    invoke-virtual {p1}, Ly/o$a;->a()Ly/o$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/compose/runtime/snapshots/k;->remove(Ljava/lang/Object;)Z

    :cond_6
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
