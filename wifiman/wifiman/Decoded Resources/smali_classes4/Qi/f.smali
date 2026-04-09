.class public final synthetic LQi/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Ldh/i;

.field public final synthetic c:Lmh/p;


# direct methods
.method public synthetic constructor <init>(LIi/N;Ldh/i;Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQi/f;->a:LIi/N;

    iput-object p2, p0, LQi/f;->b:Ldh/i;

    iput-object p3, p0, LQi/f;->c:Lmh/p;

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    iget-object v0, p0, LQi/f;->a:LIi/N;

    iget-object v1, p0, LQi/f;->b:Ldh/i;

    iget-object v2, p0, LQi/f;->c:Lmh/p;

    invoke-static {v0, v1, v2, p1}, LQi/g;->a(LIi/N;Ldh/i;Lmh/p;Lgg/c;)V

    return-void
.end method
