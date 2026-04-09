.class final Ls/A$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/A;->D2()LC0/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Ls/A;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Ls/A;)V
    .locals 0

    iput-object p1, p0, Ls/A$a;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Ls/A$a;->b:Ls/A;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Ls/A$a;->a:Lkotlin/jvm/internal/N;

    iget-object v1, p0, Ls/A$a;->b:Ls/A;

    invoke-static {}, LC0/M;->a()LT/H0;

    move-result-object v2

    invoke-static {v1, v2}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls/A$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
