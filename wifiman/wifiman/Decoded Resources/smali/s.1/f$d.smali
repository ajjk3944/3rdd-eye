.class final Ls/f$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/f;->M2(Lj0/d;Lm0/l0;Lm0/Q0$c;JJZF)Lj0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/U0;

.field final synthetic b:Lm0/l0;


# direct methods
.method constructor <init>(Lm0/U0;Lm0/l0;)V
    .locals 0

    iput-object p1, p0, Ls/f$d;->a:Lm0/U0;

    iput-object p2, p0, Ls/f$d;->b:Lm0/l0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;)V
    .locals 9

    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object v1, p0, Ls/f$d;->a:Lm0/U0;

    iget-object v2, p0, Ls/f$d;->b:Lm0/l0;

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Lo0/f;->R0(Lo0/f;Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/c;

    invoke-virtual {p0, p1}, Ls/f$d;->a(Lo0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
