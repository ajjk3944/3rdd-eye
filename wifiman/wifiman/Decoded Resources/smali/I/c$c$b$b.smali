.class final LI/c$c$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/c$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/q;


# direct methods
.method constructor <init>(LI/q;)V
    .locals 0

    iput-object p1, p0, LI/c$c$b$b;->a:LI/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1, p2}, LI/c$c$b$b;->b(LYg/J;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(LYg/J;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LI/c$c$b$b;->a:LI/q;

    invoke-interface {p1}, LI/q;->e()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
