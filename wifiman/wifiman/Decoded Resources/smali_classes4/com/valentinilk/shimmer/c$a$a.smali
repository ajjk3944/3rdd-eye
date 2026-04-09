.class final Lcom/valentinilk/shimmer/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/valentinilk/shimmer/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LVf/c;


# direct methods
.method constructor <init>(LVf/c;)V
    .locals 0

    iput-object p1, p0, Lcom/valentinilk/shimmer/c$a$a;->a:LVf/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/i;

    invoke-virtual {p0, p1, p2}, Lcom/valentinilk/shimmer/c$a$a;->b(Ll0/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll0/i;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lcom/valentinilk/shimmer/c$a$a;->a:LVf/c;

    invoke-virtual {p2, p1}, LVf/c;->j(Ll0/i;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
