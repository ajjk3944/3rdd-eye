.class public final LMi/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# instance fields
.field private final a:LKi/w;


# direct methods
.method public constructor <init>(LKi/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMi/x;->a:LKi/w;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LMi/x;->a:LKi/w;

    invoke-interface {v0, p1, p2}, LKi/w;->b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
