.class public final synthetic LY9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:LY9/k;


# direct methods
.method public synthetic constructor <init>(LIi/N;LY9/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY9/j;->a:LIi/N;

    iput-object p2, p0, LY9/j;->b:LY9/k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LY9/j;->a:LIi/N;

    iget-object v1, p0, LY9/j;->b:LY9/k;

    invoke-static {v0, v1}, LY9/i$f;->a(LIi/N;LY9/k;)LYg/J;

    move-result-object v0

    return-object v0
.end method
