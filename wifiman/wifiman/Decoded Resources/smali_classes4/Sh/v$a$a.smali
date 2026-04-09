.class public final LSh/v$a$a;
.super LSh/v$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/v$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LSh/x;

.field private final b:[B


# direct methods
.method public constructor <init>(LSh/x;[B)V
    .locals 1

    const-string v0, "kotlinJvmBinaryClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LSh/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LSh/v$a$a;->a:LSh/x;

    iput-object p2, p0, LSh/v$a$a;->b:[B

    return-void
.end method

.method public synthetic constructor <init>(LSh/x;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, LSh/v$a$a;-><init>(LSh/x;[B)V

    return-void
.end method


# virtual methods
.method public final b()LSh/x;
    .locals 1

    iget-object v0, p0, LSh/v$a$a;->a:LSh/x;

    return-object v0
.end method
