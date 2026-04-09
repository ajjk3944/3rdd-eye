.class public final synthetic LQi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# instance fields
.field public final synthetic a:Ldh/i;

.field public final synthetic b:LLi/g;


# direct methods
.method public synthetic constructor <init>(Ldh/i;LLi/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQi/h;->a:Ldh/i;

    iput-object p2, p0, LQi/h;->b:LLi/g;

    return-void
.end method


# virtual methods
.method public final a(Lgg/t;)V
    .locals 2

    iget-object v0, p0, LQi/h;->a:Ldh/i;

    iget-object v1, p0, LQi/h;->b:LLi/g;

    invoke-static {v0, v1, p1}, LQi/i;->a(Ldh/i;LLi/g;Lgg/t;)V

    return-void
.end method
