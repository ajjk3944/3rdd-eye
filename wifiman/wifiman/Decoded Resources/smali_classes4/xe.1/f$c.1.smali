.class public final Lxe/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxe/f$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:J

.field private final b:Lmh/a;

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLmh/a;)V
    .locals 1

    const-string v0, "onNavigateBack"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lxe/f$c;->a:J

    .line 3
    iput-object p3, p0, Lxe/f$c;->b:Lmh/a;

    return-void
.end method

.method public synthetic constructor <init>(JLmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const-wide/16 p1, 0x1f4

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lxe/f$c;-><init>(JLmh/a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lxe/f$c;->c:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lxe/f$c;->a:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lxe/f$c;->c:J

    iget-object v0, p0, Lxe/f$c;->b:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
