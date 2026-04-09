.class public final LSh/s$d;
.super LSh/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final j:Lgi/e;


# direct methods
.method public constructor <init>(Lgi/e;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LSh/s;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LSh/s$d;->j:Lgi/e;

    return-void
.end method


# virtual methods
.method public final i()Lgi/e;
    .locals 1

    iget-object v0, p0, LSh/s$d;->j:Lgi/e;

    return-object v0
.end method
