.class final LS6/i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS6/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;


# direct methods
.method constructor <init>(LT/q0;)V
    .locals 0

    iput-object p1, p0, LS6/i$a$a;->a:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS6/j;

    invoke-virtual {p0, p1, p2}, LS6/i$a$a;->b(LS6/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(LS6/j;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LS6/i$a$a;->a:LT/q0;

    invoke-static {p2, p1}, LS6/i;->g(LT/q0;LS6/j;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
