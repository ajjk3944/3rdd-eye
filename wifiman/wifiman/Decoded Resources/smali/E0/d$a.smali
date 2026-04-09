.class public final LE0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public z(LD0/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, LD0/c;->a()Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
