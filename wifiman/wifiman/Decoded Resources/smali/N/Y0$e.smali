.class final LN/Y0$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/Y0;->a(LN/b0;JJLmh/q;ZLmh/t;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/Y0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/Y0$e;

    invoke-direct {v0}, LN/Y0$e;-><init>()V

    sput-object v0, LN/Y0$e;->a:LN/Y0$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/o0$b;LT/l;I)Lr/H;
    .locals 4

    const v0, -0x405ece8d

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:292)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p3, LN/b0;->Focused:LN/b0;

    sget-object v0, LN/b0;->UnfocusedEmpty:LN/b0;

    invoke-interface {p1, p3, v0}, Lr/o0$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x43

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object p1

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {v2, v0, p1, p3, v3}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p3}, Lr/o0$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    sget-object p3, LN/b0;->UnfocusedNotEmpty:LN/b0;

    invoke-interface {p1, p3, v0}, Lr/o0$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x7

    const/4 p3, 0x0

    invoke-static {p3, p3, v3, p1, v3}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p1

    goto :goto_1

    :cond_3
    :goto_0
    const/16 p1, 0x53

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object p3

    invoke-static {p1, v2, p3}, Lr/j;->k(IILr/E;)Lr/r0;

    move-result-object p1

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/o0$b;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/Y0$e;->a(Lr/o0$b;LT/l;I)Lr/H;

    move-result-object p1

    return-object p1
.end method
