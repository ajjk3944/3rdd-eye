.class public final LPi/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPi/c;->V0()Ldh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ldh/i;

.field final synthetic b:LPi/c;


# direct methods
.method public constructor <init>(Ldh/i;LPi/c;)V
    .locals 0

    iput-object p1, p0, LPi/c$b;->a:Ldh/i;

    iput-object p2, p0, LPi/c$b;->b:LPi/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()Ldh/i;
    .locals 1

    iget-object v0, p0, LPi/c$b;->a:Ldh/i;

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    new-instance p1, LPi/c$c;

    iget-object v0, p0, LPi/c$b;->b:LPi/c;

    invoke-direct {p1, v0}, LPi/c$c;-><init>(Ljava/lang/Object;)V

    iget-object v0, p0, LPi/c$b;->b:LPi/c;

    invoke-static {p1, v0}, LOi/a;->c(Lmh/l;Ldh/e;)V

    return-void
.end method
