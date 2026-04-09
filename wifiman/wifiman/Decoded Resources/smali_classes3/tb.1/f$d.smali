.class final Ltb/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/f;->u()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltb/f$d$a;
    }
.end annotation


# static fields
.field public static final a:Ltb/f$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltb/f$d;

    invoke-direct {v0}, Ltb/f$d;-><init>()V

    sput-object v0, Ltb/f$d;->a:Ltb/f$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/webrtc/DataChannel$State;)Z
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Ltb/f$d$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_1
    return v0
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lorg/webrtc/DataChannel$State;

    invoke-virtual {p0, p1}, Ltb/f$d;->a(Lorg/webrtc/DataChannel$State;)Z

    move-result p1

    return p1
.end method
