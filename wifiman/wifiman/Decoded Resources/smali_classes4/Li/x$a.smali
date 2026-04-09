.class public final LLi/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/x;->c(LLi/g;LLi/g;LLi/g;Lmh/r;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:[LLi/g;

.field final synthetic b:Lmh/r;


# direct methods
.method public constructor <init>([LLi/g;Lmh/r;)V
    .locals 0

    iput-object p1, p0, LLi/x$a;->a:[LLi/g;

    iput-object p2, p0, LLi/x$a;->b:Lmh/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LLi/x$a;->a:[LLi/g;

    invoke-static {}, LLi/x;->a()Lmh/a;

    move-result-object v1

    new-instance v2, LLi/x$a$a;

    const/4 v3, 0x0

    iget-object v4, p0, LLi/x$a;->b:Lmh/r;

    invoke-direct {v2, v3, v4}, LLi/x$a$a;-><init>(Ldh/e;Lmh/r;)V

    invoke-static {p1, v0, v1, v2, p2}, LMi/j;->a(LLi/h;[LLi/g;Lmh/a;Lmh/q;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
