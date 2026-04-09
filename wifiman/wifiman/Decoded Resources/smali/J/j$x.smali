.class final LJ/j$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->m0(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/j;


# direct methods
.method constructor <init>(LJ/j;)V
    .locals 0

    iput-object p1, p0, LJ/j$x;->a:LJ/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LH/h;

    invoke-virtual {p0, p1, p2}, LJ/j$x;->b(LH/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(LH/h;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LJ/j$x;->a:LJ/j;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LJ/j;->v(LJ/j;Z)V

    iget-object p1, p0, LJ/j$x;->a:LJ/j;

    sget-object p2, LJ/n;->None:LJ/n;

    invoke-virtual {p1, p2}, LJ/j;->I0(LJ/n;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
