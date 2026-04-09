.class public final synthetic LLe/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LLe/d;

.field public final synthetic b:LT/q0;


# direct methods
.method public synthetic constructor <init>(LLe/d;LT/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLe/k;->a:LLe/d;

    iput-object p2, p0, LLe/k;->b:LT/q0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LLe/k;->a:LLe/d;

    iget-object v1, p0, LLe/k;->b:LT/q0;

    invoke-static {v0, v1}, LLe/m;->b(LLe/d;LT/q0;)LYg/J;

    move-result-object v0

    return-object v0
.end method
