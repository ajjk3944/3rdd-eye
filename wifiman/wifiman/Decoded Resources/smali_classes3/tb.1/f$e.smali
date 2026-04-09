.class final Ltb/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


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
        Ltb/f$e$a;
    }
.end annotation


# static fields
.field public static final a:Ltb/f$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltb/f$e;

    invoke-direct {v0}, Ltb/f$e;-><init>()V

    sput-object v0, Ltb/f$e;->a:Ltb/f$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/webrtc/DataChannel$State;)Ljava/lang/Boolean;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Ltb/f$e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Lcom/ui/unifi/core/base/net/webrtc/ClosedException;

    invoke-direct {p1}, Lcom/ui/unifi/core/base/net/webrtc/ClosedException;-><init>()V

    throw p1

    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/webrtc/DataChannel$State;

    invoke-virtual {p0, p1}, Ltb/f$e;->a(Lorg/webrtc/DataChannel$State;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
