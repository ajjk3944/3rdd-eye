.class final Ls/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/f;->L2(Lj0/d;Lm0/l0;Lm0/Q0$a;ZF)Lj0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/Q0$a;

.field final synthetic b:Lm0/l0;


# direct methods
.method constructor <init>(Lm0/Q0$a;Lm0/l0;)V
    .locals 0

    iput-object p1, p0, Ls/f$a;->a:Lm0/Q0$a;

    iput-object p2, p0, Ls/f$a;->b:Lm0/l0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;)V
    .locals 10

    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object v0, p0, Ls/f$a;->a:Lm0/Q0$a;

    invoke-virtual {v0}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object v2

    iget-object v3, p0, Ls/f$a;->b:Lm0/l0;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lo0/f;->R0(Lo0/f;Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/c;

    invoke-virtual {p0, p1}, Ls/f$a;->a(Lo0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
