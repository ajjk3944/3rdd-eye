.class final LA/o$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/o;->a(LA/B;Lmh/l;LT/l;I)Lmh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;


# direct methods
.method constructor <init>(LT/z1;)V
    .locals 0

    iput-object p1, p0, LA/o$b;->a:LT/z1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LA/k;
    .locals 2

    new-instance v0, LA/k;

    iget-object v1, p0, LA/o$b;->a:LT/z1;

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmh/l;

    invoke-direct {v0, v1}, LA/k;-><init>(Lmh/l;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LA/o$b;->a()LA/k;

    move-result-object v0

    return-object v0
.end method
