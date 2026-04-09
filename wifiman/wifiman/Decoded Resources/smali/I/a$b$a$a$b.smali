.class final LI/a$b$a$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/a$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/I0;


# direct methods
.method constructor <init>(LI/I0;)V
    .locals 0

    iput-object p1, p0, LI/a$b$a$a$b;->a:LI/I0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1, p2}, LI/a$b$a$a$b;->b(LYg/J;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(LYg/J;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LI/a$b$a$a$b;->a:LI/I0;

    invoke-interface {p1}, LI/I0;->e()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
