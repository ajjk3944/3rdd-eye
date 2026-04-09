.class final Lo5/x$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/x$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo5/x;


# direct methods
.method constructor <init>(Lo5/x;)V
    .locals 0

    iput-object p1, p0, Lo5/x$a$a;->a:Lo5/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo5/l;

    invoke-virtual {p0, p1, p2}, Lo5/x$a$a;->b(Lo5/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lo5/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lo5/x$a$a;->a:Lo5/x;

    invoke-static {p2}, Lo5/x;->e(Lo5/x;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
