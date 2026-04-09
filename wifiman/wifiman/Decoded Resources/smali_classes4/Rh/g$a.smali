.class final LRh/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRh/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lpi/S;

.field private final b:I


# direct methods
.method public constructor <init>(Lpi/S;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/g$a;->a:Lpi/S;

    iput p2, p0, LRh/g$a;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LRh/g$a;->b:I

    return v0
.end method

.method public final b()Lpi/S;
    .locals 1

    iget-object v0, p0, LRh/g$a;->a:Lpi/S;

    return-object v0
.end method
