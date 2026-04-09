.class public final LQi/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQi/b;->b(Lgg/f;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/n;


# direct methods
.method constructor <init>(LIi/n;)V
    .locals 0

    iput-object p1, p0, LQi/b$a;->a:LIi/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LQi/b$a;->a:LIi/n;

    sget-object v1, LYg/u;->b:LYg/u$a;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, LQi/b$a;->a:LIi/n;

    invoke-static {v0, p1}, LQi/b;->d(LIi/n;Lhg/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, LQi/b$a;->a:LIi/n;

    sget-object v1, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
