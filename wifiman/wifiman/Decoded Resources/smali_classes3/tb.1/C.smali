.class public final synthetic Ltb/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ltb/N;

.field public final synthetic b:Lorg/webrtc/DataChannel$Buffer;


# direct methods
.method public synthetic constructor <init>(Ltb/N;Lorg/webrtc/DataChannel$Buffer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/C;->a:Ltb/N;

    iput-object p2, p0, Ltb/C;->b:Lorg/webrtc/DataChannel$Buffer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltb/C;->a:Ltb/N;

    iget-object v1, p0, Ltb/C;->b:Lorg/webrtc/DataChannel$Buffer;

    invoke-static {v0, v1}, Ltb/N;->d(Ltb/N;Lorg/webrtc/DataChannel$Buffer;)V

    return-void
.end method
