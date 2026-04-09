.class final LE0/L$b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/L$b;-><init>(LE0/L;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/L$b;


# direct methods
.method constructor <init>(LE0/L$b;)V
    .locals 0

    iput-object p1, p0, LE0/L$b$b;->a:LE0/L$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LE0/L$b$b;->a:LE0/L$b;

    invoke-static {v0}, LE0/L$b;->U0(LE0/L$b;)V

    iget-object v0, p0, LE0/L$b$b;->a:LE0/L$b;

    sget-object v1, LE0/L$b$b$a;->a:LE0/L$b$b$a;

    invoke-virtual {v0, v1}, LE0/L$b;->Q(Lmh/l;)V

    iget-object v0, p0, LE0/L$b$b;->a:LE0/L$b;

    invoke-virtual {v0}, LE0/L$b;->B()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->h1()LC0/D;

    move-result-object v0

    invoke-interface {v0}, LC0/D;->q()V

    iget-object v0, p0, LE0/L$b$b;->a:LE0/L$b;

    invoke-static {v0}, LE0/L$b;->T0(LE0/L$b;)V

    iget-object v0, p0, LE0/L$b$b;->a:LE0/L$b;

    sget-object v1, LE0/L$b$b$b;->a:LE0/L$b$b$b;

    invoke-virtual {v0, v1}, LE0/L$b;->Q(Lmh/l;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/L$b$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
