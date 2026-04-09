.class public abstract Lhb/a;
.super Leb/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;LGb/f;Leb/g$b;)V
    .locals 1

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Leb/c;-><init>(Ljava/lang/String;LGb/f;Leb/g$b;)V

    return-void
.end method
