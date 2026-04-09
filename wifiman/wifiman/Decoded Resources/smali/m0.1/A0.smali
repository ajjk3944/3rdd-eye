.class public final synthetic Lm0/A0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/DoubleUnaryOperator;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/A0;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final applyAsDouble(D)D
    .locals 1

    iget-object v0, p0, Lm0/A0;->a:Lmh/l;

    invoke-static {v0, p1, p2}, Lm0/D0;->c(Lmh/l;D)D

    move-result-wide p1

    return-wide p1
.end method
