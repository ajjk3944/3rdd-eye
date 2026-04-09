.class final LE0/P$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/P;->V0(LE0/r0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/r0;

.field final synthetic b:LE0/P;


# direct methods
.method constructor <init>(LE0/r0;LE0/P;)V
    .locals 0

    iput-object p1, p0, LE0/P$c;->a:LE0/r0;

    iput-object p2, p0, LE0/P$c;->b:LE0/P;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LE0/P$c;->a:LE0/r0;

    invoke-virtual {v0}, LE0/r0;->b()LC0/D;

    move-result-object v0

    invoke-interface {v0}, LC0/D;->r()Lmh/l;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LE0/P$c;->b:LE0/P;

    invoke-virtual {v1}, LE0/P;->z1()LC0/Q;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/P$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
