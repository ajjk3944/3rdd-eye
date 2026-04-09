.class public final synthetic Lhb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/f$c;


# instance fields
.field public final synthetic a:Lhb/h;


# direct methods
.method public synthetic constructor <init>(Lhb/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/f;->a:Lhb/h;

    return-void
.end method


# virtual methods
.method public final a(Lorg/webrtc/DataChannel$State;)V
    .locals 1

    iget-object v0, p0, Lhb/f;->a:Lhb/h;

    invoke-static {v0, p1}, Lhb/h;->b(Lhb/h;Lorg/webrtc/DataChannel$State;)V

    return-void
.end method
