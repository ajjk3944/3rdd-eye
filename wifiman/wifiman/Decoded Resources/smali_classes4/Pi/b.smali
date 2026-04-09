.class final LPi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDj/a;


# instance fields
.field private final a:LLi/g;

.field private final b:Ldh/i;


# direct methods
.method public constructor <init>(LLi/g;Ldh/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPi/b;->a:LLi/g;

    iput-object p2, p0, LPi/b;->b:Ldh/i;

    return-void
.end method


# virtual methods
.method public b(LDj/b;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, LPi/c;

    iget-object v1, p0, LPi/b;->a:LLi/g;

    iget-object v2, p0, LPi/b;->b:Ldh/i;

    invoke-direct {v0, v1, p1, v2}, LPi/c;-><init>(LLi/g;LDj/b;Ldh/i;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    return-void
.end method
