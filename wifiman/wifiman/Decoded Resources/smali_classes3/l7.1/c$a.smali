.class public abstract Ll7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Ll7/c;)I
    .locals 0

    invoke-interface {p0}, Ll7/c;->a()Ll7/c$b;

    move-result-object p0

    invoke-interface {p0}, Ll7/c$b;->b()I

    move-result p0

    return p0
.end method
