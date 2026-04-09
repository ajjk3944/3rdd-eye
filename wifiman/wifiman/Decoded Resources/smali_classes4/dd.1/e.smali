.class public final Ldd/e;
.super Ldd/c;
.source "SourceFile"

# interfaces
.implements Ldd/d;


# direct methods
.method public constructor <init>(Lcd/a;LYc/a;)V
    .locals 1

    const-string v0, "icmp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ldd/c;-><init>(Lcd/a;LYc/c;)V

    return-void
.end method
