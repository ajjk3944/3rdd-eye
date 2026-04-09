.class public abstract Ltb/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/webrtc/MediaConstraints;

.field private static final b:Lkotlin/text/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/webrtc/MediaConstraints;

    invoke-direct {v0}, Lorg/webrtc/MediaConstraints;-><init>()V

    sput-object v0, Ltb/P;->a:Lorg/webrtc/MediaConstraints;

    new-instance v0, Lkotlin/text/p;

    const-string/jumbo v1, "^a="

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Ltb/P;->b:Lkotlin/text/p;

    return-void
.end method

.method public static final synthetic a()Lkotlin/text/p;
    .locals 1

    sget-object v0, Ltb/P;->b:Lkotlin/text/p;

    return-object v0
.end method

.method public static final synthetic b()Lorg/webrtc/MediaConstraints;
    .locals 1

    sget-object v0, Ltb/P;->a:Lorg/webrtc/MediaConstraints;

    return-object v0
.end method
