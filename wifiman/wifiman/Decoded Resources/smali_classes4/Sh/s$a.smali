.class public final LSh/s$a;
.super LSh/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final j:LSh/s;


# direct methods
.method public constructor <init>(LSh/s;)V
    .locals 1

    const-string v0, "elementType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LSh/s;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LSh/s$a;->j:LSh/s;

    return-void
.end method


# virtual methods
.method public final i()LSh/s;
    .locals 1

    iget-object v0, p0, LSh/s$a;->j:LSh/s;

    return-object v0
.end method
