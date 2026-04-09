.class public final LE0/P$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/Q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/P;->z1()LC0/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/P;


# direct methods
.method constructor <init>(LE0/P;)V
    .locals 0

    iput-object p1, p0, LE0/P$e;->a:LE0/P;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDensity()F
    .locals 1

    iget-object v0, p0, LE0/P$e;->a:LE0/P;

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    return v0
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, LE0/P$e;->a:LE0/P;

    invoke-interface {v0}, LY0/l;->y()F

    move-result v0

    return v0
.end method
