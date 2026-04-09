.class public final Leb/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/l;


# instance fields
.field private final a:Ltb/u;


# direct methods
.method public constructor <init>(Ltb/u;)V
    .locals 1

    const-string/jumbo v0, "webRtcClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/n;->a:Ltb/u;

    return-void
.end method
