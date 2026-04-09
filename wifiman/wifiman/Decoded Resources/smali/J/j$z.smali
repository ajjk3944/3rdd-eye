.class final LJ/j$z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->n0(Ldh/e;)Ljava/lang/Object;
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

    iput-object p1, p0, LJ/j$z;->a:LJ/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/i;

    invoke-virtual {p0, p1, p2}, LJ/j$z;->b(Ll0/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll0/i;Ldh/e;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {p2}, Ll0/i$a;->a()Ll0/i;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, LJ/j$z;->a:LJ/j;

    invoke-static {p1}, LJ/j;->o(LJ/j;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LJ/j$z;->a:LJ/j;

    invoke-static {p2, p1}, LJ/j;->x(LJ/j;Ll0/i;)V

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
