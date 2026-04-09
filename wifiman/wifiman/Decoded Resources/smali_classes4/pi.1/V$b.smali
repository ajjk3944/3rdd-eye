.class final Lpi/V$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpi/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lpi/d0;

.field private final b:Lpi/v0;


# direct methods
.method public constructor <init>(Lpi/d0;Lpi/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/V$b;->a:Lpi/d0;

    iput-object p2, p0, Lpi/V$b;->b:Lpi/v0;

    return-void
.end method


# virtual methods
.method public final a()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lpi/V$b;->a:Lpi/d0;

    return-object v0
.end method

.method public final b()Lpi/v0;
    .locals 1

    iget-object v0, p0, Lpi/V$b;->b:Lpi/v0;

    return-object v0
.end method
