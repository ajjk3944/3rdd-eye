.class public final LQ/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ/q;

    invoke-direct {v0}, LQ/q;-><init>()V

    sput-object v0, LQ/q;->a:LQ/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Lz/f0;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ScaffoldDefaults.<get-contentWindowInsets> (Scaffold.kt:292)"

    const v2, 0x2d20cc2c

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lz/f0;->a:Lz/f0$a;

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LR/c;->a(Lz/f0$a;LT/l;I)Lz/f0;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method
