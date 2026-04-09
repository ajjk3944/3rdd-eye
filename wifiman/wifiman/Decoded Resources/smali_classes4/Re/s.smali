.class public final synthetic LRe/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:LRe/a;


# direct methods
.method public synthetic constructor <init>(LIi/N;LRe/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRe/s;->a:LIi/N;

    iput-object p2, p0, LRe/s;->b:LRe/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LRe/s;->a:LIi/N;

    iget-object v1, p0, LRe/s;->b:LRe/a;

    invoke-static {v0, v1}, LRe/m$b$b;->a(LIi/N;LRe/a;)LYg/J;

    move-result-object v0

    return-object v0
.end method
