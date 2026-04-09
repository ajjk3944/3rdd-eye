.class final Lq5/c$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/c;-><init>(Ldh/i;Lg5/e;Lo5/b;Lq5/a;LO1/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO1/e;


# direct methods
.method constructor <init>(LO1/e;)V
    .locals 0

    iput-object p1, p0, Lq5/c$b;->a:LO1/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lq5/g;
    .locals 2

    new-instance v0, Lq5/g;

    iget-object v1, p0, Lq5/c$b;->a:LO1/e;

    invoke-direct {v0, v1}, Lq5/g;-><init>(LO1/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq5/c$b;->a()Lq5/g;

    move-result-object v0

    return-object v0
.end method
