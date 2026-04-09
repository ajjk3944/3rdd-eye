.class final LQ0/m$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ0/m;-><init>(LQ0/G;LQ0/H;LQ0/T;LQ0/r;LQ0/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ0/m;


# direct methods
.method constructor <init>(LQ0/m;)V
    .locals 0

    iput-object p1, p0, LQ0/m$a;->a:LQ0/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LQ0/S;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LQ0/m$a;->a:LQ0/m;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, LQ0/S;->b(LQ0/S;LQ0/k;LQ0/A;IILjava/lang/Object;ILjava/lang/Object;)LQ0/S;

    move-result-object p1

    invoke-static {v0, p1}, LQ0/m;->f(LQ0/m;LQ0/S;)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ0/S;

    invoke-virtual {p0, p1}, LQ0/m$a;->a(LQ0/S;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
