.class final Lr/m0$d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/m0$d;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/k;


# direct methods
.method constructor <init>(Lr/k;)V
    .locals 0

    iput-object p1, p0, Lr/m0$d$a;->a:Lr/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lr/m0$d$a;->a:Lr/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr/k;->u(Z)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr/m0$d$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
