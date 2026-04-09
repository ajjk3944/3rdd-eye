.class public final Lad/j;
.super Lad/f;
.source "SourceFile"

# interfaces
.implements Lad/i;


# direct methods
.method public constructor <init>(Lad/a;LYc/h;)V
    .locals 1

    const-string v0, "dnsResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lad/f;-><init>(Lad/a;LYc/c;)V

    return-void
.end method
