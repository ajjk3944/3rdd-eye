.class public final LG8/g$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/g;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/g;

.field final synthetic b:LG8/g;


# direct methods
.method public constructor <init>(LLi/g;LG8/g;)V
    .locals 0

    iput-object p1, p0, LG8/g$g;->a:LLi/g;

    iput-object p2, p0, LG8/g$g;->b:LG8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LG8/g$g;->a:LLi/g;

    new-instance v1, LG8/g$g$a;

    iget-object v2, p0, LG8/g$g;->b:LG8/g;

    invoke-direct {v1, p1, v2}, LG8/g$g$a;-><init>(LLi/h;LG8/g;)V

    invoke-interface {v0, v1, p2}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
