.class public abstract LCi/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCi/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LCi/c;II)LCi/c;
    .locals 1

    new-instance v0, LCi/c$b;

    invoke-direct {v0, p0, p1, p2}, LCi/c$b;-><init>(LCi/c;II)V

    return-object v0
.end method
