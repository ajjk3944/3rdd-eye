.class public final synthetic Ltb/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/f$c;


# instance fields
.field public final synthetic a:Ltb/N;


# direct methods
.method public synthetic constructor <init>(Ltb/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/O;->a:Ltb/N;

    return-void
.end method


# virtual methods
.method public final a(Lorg/webrtc/DataChannel$State;)V
    .locals 1

    iget-object v0, p0, Ltb/O;->a:Ltb/N;

    invoke-static {v0, p1}, Ltb/N$m;->a(Ltb/N;Lorg/webrtc/DataChannel$State;)V

    return-void
.end method
